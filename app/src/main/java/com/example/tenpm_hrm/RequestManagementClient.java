package com.example.tenpm_hrm;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import customlistview.RequestAdminAdapter;
import customlistview.RequestClientAdapter;
import models.NhanVien; // Đảm bảo bạn đã import lớp NhanVien
import models.Request;

public class RequestManagementClient extends AppCompatActivity {
    private Button btn_new_request;
    private ArrayList<Request> requests;
    private RequestClientAdapter adapter;
    private DatabaseHandler dbHandler;
    private ListView lvRQ;
    private NhanVien nhanVien; // Khai báo biến để lưu đối tượng NhanVien

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.request_management_client);

        btn_new_request = findViewById(R.id.btn_new_request);
        lvRQ = findViewById(R.id.lvRQ);

        requests = new ArrayList<>();

        // Lấy Intent và extra
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("nhanVien")) {
            nhanVien = intent.getParcelableExtra("nhanVien"); // Lấy đối tượng NhanVien từ Intent
            if (nhanVien != null) {
                // Sử dụng nhanVien ở đây nếu cần
                // Ví dụ: Log.d("RequestManagementClient", "Received NhanVien: " + nhanVien.toString());
            } else {
                Log.e("RequestManagementClient", "NhanVien is null");
            }
        } else {
            Log.e("RequestManagementClient", "Intent is null or does not have extra 'nhanVien'");
        }

        // Khởi tạo DatabaseHandler
        dbHandler = new DatabaseHandler(this);

        // Lấy tất cả các yêu cầu từ cơ sở dữ liệu
        requests = dbHandler.getRequestsByNVId(nhanVien.getMaNV());

        // Nếu requests rỗng, có thể thêm một thông báo để người dùng biết
        if (requests.isEmpty()) {
            // Thêm thông báo hoặc xử lý khi không có yêu cầu nào
        }

        adapter = new RequestClientAdapter(this, R.layout.request_item, requests);
        lvRQ.setAdapter(adapter);


        // Load requests initially
        loadRequests();

        // Set up item click listener
        lvRQ.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Request selectedRequest = requests.get(position);
                int maYC = selectedRequest.getId();
                showConfirmationDialog(position, maYC);
            }
        });

        btn_new_request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newRequestIntent = new Intent(RequestManagementClient.this, NewRequest.class);
                newRequestIntent.putExtra("nhanVien", nhanVien); // Gửi nhanVien tới NewRequest nếu cần
                startActivity(newRequestIntent);
            }
        });
    }

    private void loadRequests() {
        requests.clear();
        requests.addAll(dbHandler.getAllRequests());
        adapter = new RequestClientAdapter(this, R.layout.request_item, requests);
        lvRQ.setAdapter(adapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        loadRequests(); // Refresh requests when the activity resumes
    }

    private void showConfirmationDialog(int position, int maYC) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Xác nhận hành động")
                .setMessage("Bạn có muốn xóa yêu cầu: " + requests.get(position).getInformation() + "?")
                .setPositiveButton("Xác nhận", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        boolean isApproved = dbHandler.deleteRequest(maYC);
                        if (isApproved) {
                            Toast.makeText(RequestManagementClient.this, "Request deleted successfully.", Toast.LENGTH_SHORT).show();
                            loadRequests(); // Refresh the list of requests
                        } else {
                            Toast.makeText(RequestManagementClient.this, "Failed to deleted request.", Toast.LENGTH_SHORT).show();
                        }
                    }
                })
                .setNegativeButton("Hủy", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss(); // Close the dialog
                    }
                });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
