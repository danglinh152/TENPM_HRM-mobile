package com.example.tenpm_hrm;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import customlistview.RequestAdminAdapter;
import models.NhanVien;
import models.Request;

public class RequestManagementAdmin extends AppCompatActivity {
    private ListView listView;
    private RequestAdminAdapter adapter;
    private ArrayList<Request> requests;
    private DatabaseHandler dbHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.request_management_admin);

        listView = findViewById(R.id.listView);
        requests = new ArrayList<>();

        // Khởi tạo DatabaseHandler
        dbHandler = new DatabaseHandler(this);

        // Lấy tất cả các yêu cầu từ cơ sở dữ liệu
        requests = dbHandler.getAllRequests();

        // Nếu requests rỗng, có thể thêm một thông báo để người dùng biết
        if (requests.isEmpty()) {
            // Thêm thông báo hoặc xử lý khi không có yêu cầu nào
        }

        // Khởi tạo adapter và gán cho ListView
        adapter = new RequestAdminAdapter(this, R.layout.request_item, requests);
        listView.setAdapter(adapter);

        // Set up item click listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                showConfirmationDialog(position);
            }
        });
    }


    private void showConfirmationDialog(int position) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Xác nhận hành động")
                .setMessage("Bạn có muốn xử lý yêu cầu: " + requests.get(position).getInformation() + "?")
                .setPositiveButton("Xác nhận", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // Handle the confirmation action here
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
