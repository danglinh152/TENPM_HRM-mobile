package com.example.tenpm_hrm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class HomepageAdmin extends AppCompatActivity {
    private TextView tvWelcome;
    private CardView cardEmployee;
    private CardView cardDepartment;
    private CardView cardAttendance;
    private CardView cardFacilities;
    private CardView cardProject;
    private CardView cardRequest;
    private CardView cardAccount;
    private ProgressBar progressBar; // ProgressBar for better UX

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.homepage_admin);

        tvWelcome = findViewById(R.id.tvWelcome);

        // Khởi tạo các CardView
        cardRequest = findViewById(R.id.cardRequest);
        cardEmployee = findViewById(R.id.cardEmployee);
        cardDepartment = findViewById(R.id.cardDepartment);
        cardAttendance = findViewById(R.id.cardAttendance);
        cardFacilities = findViewById(R.id.cardFacilities);
        cardProject = findViewById(R.id.cardProject);
        cardAccount = findViewById(R.id.cardAccount);
        progressBar = findViewById(R.id.progressBar); // Khởi tạo ProgressBar

        // Thiết lập sự kiện click cho các CardView
        setupCardClickListener(cardRequest, RequestManagementAdmin.class);
        setupCardClickListener(cardEmployee, EmployeeManagement.class);
        setupCardClickListener(cardDepartment, DepartmentManagement.class);
        setupCardClickListener(cardAttendance, AttendanceManagement.class);
        setupCardClickListener(cardFacilities, CSVCManagement.class);
        setupCardClickListener(cardProject, ProjectManagement.class);
        setupCardClickListener(cardAccount, AccountManagement.class);


        // Nhận dữ liệu từ Intent
        Intent intent = getIntent();
        String username = intent.getStringExtra("USERNAME");
        String loaiTaiKhoan = intent.getStringExtra("LOAITAIKHOAN");

        // Hiển thị thông tin người dùng
        tvWelcome.setText("Chào mừng " + username + " (" + loaiTaiKhoan + ")");
    }

    private void setupCardClickListener(CardView card, Class<?> targetActivity) {
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Hiện ProgressBar trước khi chuyển đến Activity mới
                progressBar.setVisibility(View.VISIBLE);

                // Bắt đầu Activity mới
                Intent newActivityIntent = new Intent(HomepageAdmin.this, targetActivity);
                startActivity(newActivityIntent);

                // Ẩn ProgressBar sau một khoảng thời gian ngắn
                v.postDelayed(() -> progressBar.setVisibility(View.GONE), 300);
            }
        });
    }
}
