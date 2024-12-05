package com.example.tenpm_hrm;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import models.NhanVien;

public class HomePageClient extends AppCompatActivity {
    private CardView cardInfo;
    private CardView cardAttendance;
    private CardView cardProject;
    private CardView cardRequest;
    private ProgressBar progressBar; // Add a ProgressBar for better UX

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.homepage_client);

        cardRequest = findViewById(R.id.cardRequest);
        cardInfo = findViewById(R.id.cardInfo);
        cardAttendance = findViewById(R.id.cardAttendance);
        cardProject = findViewById(R.id.cardProject);
//        progressBar = findViewById(R.id.progressBar);
        Intent intent = getIntent();
        NhanVien nhanVien = intent.getParcelableExtra("nhanVien");

        cardRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Kiểm tra xem nhanVien có khác null không
                if (nhanVien != null) {
                    // Tạo Intent để chuyển đến Activity RequestManagementClient
                    Intent newRequestIntent = new Intent(HomePageClient.this, RequestManagementClient.class);
                    newRequestIntent.putExtra("nhanVien", nhanVien); // Gửi đối tượng NhanVien qua Intent
                    startActivity(newRequestIntent); // Khởi động Activity mới
                } else {
                    Log.e("HomePageClient", "NhanVien is null, cannot start RequestManagementClient");
                }

                // Nếu bạn cần hiển thị ProgressBar, hãy làm như sau
                // progressBar.setVisibility(View.VISIBLE);
                // v.postDelayed(() -> progressBar.setVisibility(View.GONE), 300);
            }
        });
        cardInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show ProgressBar before starting the new activity
//                progressBar.setVisibility(View.VISIBLE);

                // Start the new activity
                Intent newRequestIntent = new Intent(HomePageClient.this, EmployeeInfo.class);
                startActivity(newRequestIntent);

                // Optionally hide the ProgressBar after a short delay
                // This is just to simulate loading; adjust as needed
//                v.postDelayed(() -> progressBar.setVisibility(View.GONE), 300);
            }
        });

        cardAttendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show ProgressBar before starting the new activity
//                progressBar.setVisibility(View.VISIBLE);

                // Start the new activity
                Intent newRequestIntent = new Intent(HomePageClient.this, AttendanceDetails.class);
                startActivity(newRequestIntent);

                // Optionally hide the ProgressBar after a short delay
                // This is just to simulate loading; adjust as needed
//                v.postDelayed(() -> progressBar.setVisibility(View.GONE), 300);
            }
        });

        cardProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show ProgressBar before starting the new activity
//                progressBar.setVisibility(View.VISIBLE);

                // Start the new activity
                Intent newRequestIntent = new Intent(HomePageClient.this, ProjectManagement.class);
                startActivity(newRequestIntent);

                // Optionally hide the ProgressBar after a short delay
                // This is just to simulate loading; adjust as needed
//                v.postDelayed(() -> progressBar.setVisibility(View.GONE), 300);
            }
        });
    }
}
