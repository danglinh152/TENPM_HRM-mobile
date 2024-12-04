package com.example.tenpm_hrm;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    private DatabaseHandler dbHandler;
    private EditText etEmail, etPassword;
    private Button btnLogin;
    private TextView tvForgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login); // Đảm bảo sử dụng layout login

        // Khởi tạo các thành phần giao diện
        dbHandler = new DatabaseHandler(this);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        tvForgotPassword = findViewById(R.id.tvForgotPassword);

        // Thiết lập sự kiện click cho nút đăng nhập
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Login", "Login button clicked");
                login();
            }
        });

        // Thiết lập sự kiện click cho nút quên mật khẩu
        tvForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login.this, "Chức năng quên mật khẩu chưa được triển khai", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void login() {
        Log.d("Login", "Login method called");
        String username = etEmail.getText().toString().trim();
        String password = etPassword.getText().toString().trim();

        // Kiểm tra xem tên tài khoản và mật khẩu có trống không
        if (username.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Vui lòng nhập tên tài khoản và mật khẩu", Toast.LENGTH_SHORT).show();
            return;
        }

        // Truy vấn cơ sở dữ liệu
        SQLiteDatabase db = dbHandler.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT LOAITAIKHOAN FROM TAIKHOAN WHERE TENTK = ? AND MATKHAU = ?", new String[]{username, password});

        // Kiểm tra kết quả truy vấn
        if (cursor.moveToFirst()) {
            String loaiTaiKhoan = cursor.getString(0);
            cursor.close();
            db.close();

            // Chuyển đến Activity tương ứng dựa trên loại tài khoản
            Intent intent;
            if ("quản lý".equals(loaiTaiKhoan)) {
                intent = new Intent(Login.this, HomepageAdmin.class);
            } else {
                intent = new Intent(Login.this, HomePageClient.class);
            }

            // Truyền dữ liệu người dùng qua Intent
            intent.putExtra("USERNAME", username);
            intent.putExtra("LOAITAIKHOAN", loaiTaiKhoan);

            startActivity(intent);
            finish(); // Kết thúc Activity đăng nhập
        } else {
            Toast.makeText(this, "Tên tài khoản hoặc mật khẩu không đúng", Toast.LENGTH_SHORT).show();
            cursor.close();
            db.close();
        }
    }


}
