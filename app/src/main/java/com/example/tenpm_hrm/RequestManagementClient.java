package com.example.tenpm_hrm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import customlistview.RequestClientAdapter;
import models.Request;


public class RequestManagementClient extends AppCompatActivity {
    private Button btn_new_request;
    private ArrayList<Request> requests;
    private RequestClientAdapter adapter;

    private ListView lvRQ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.request_management_client);

        btn_new_request = findViewById(R.id.btn_new_request);
        lvRQ = findViewById(R.id.lvRQ);

        requests = new ArrayList<>();
        Request request1 = new Request("rq1", "Xin nghỉ phép ngày 22/10/2024", "Nghỉ phép năm 2024: Người lao động được phép nghỉ tối đa 5 ngày trong năm. Đề nghị xem xét và phê duyệt.", 0);
        Request request2 = new Request("rq2", "Xin đi trễ ngày 22/10/2024", "Đi trễ do lý do cá nhân: Xin phép đi trễ 2 tiếng do có việc gia đình. Cam kết hoàn thành công việc trong ngày.", 1);
        Request request3 = new Request("rq3", "Xét duyệt review lương định kỳ", "Xét duyệt tăng lương: Đề nghị xem xét tăng lương hàng năm dựa trên hiệu suất làm việc và kết quả đánh giá.", -1);

        requests.add(request1);
        requests.add(request2);
        requests.add(request3);

        adapter = new RequestClientAdapter(this, R.layout.request_item, requests);
        lvRQ.setAdapter(adapter);

        btn_new_request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newRequestIntent = new Intent(RequestManagementClient.this, NewRequest.class);
                startActivity(newRequestIntent);
            }
        });
    }


}