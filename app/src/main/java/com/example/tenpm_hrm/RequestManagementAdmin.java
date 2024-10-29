package com.example.tenpm_hrm;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import customlistview.RequestAdminAdapter;
import models.Request;

public class RequestManagementAdmin extends AppCompatActivity {
    private ListView listView;
    private RequestAdminAdapter adapter;
    private ArrayList<Request> requests;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.request_management_admin);

        listView = findViewById(R.id.listView);

        requests = new ArrayList<>();
        Request request1 = new Request("rq1", "Xin nghỉ phép ngày 22/10/2024", "Nghỉ phép năm 2024: Người lao động được phép nghỉ tối đa 5 ngày trong năm. Đề nghị xem xét và phê duyệt.", 0);
        Request request2 = new Request("rq2", "Xin đi trễ ngày 22/10/2024", "Đi trễ do lý do cá nhân: Xin phép đi trễ 2 tiếng do có việc gia đình. Cam kết hoàn thành công việc trong ngày.", 1);
        Request request3 = new Request("rq3", "Xét duyệt review lương định kỳ", "Xét duyệt tăng lương: Đề nghị xem xét tăng lương hàng năm dựa trên hiệu suất làm việc và kết quả đánh giá.", -1);

        requests.add(request1);
        requests.add(request2);
        requests.add(request3);

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
