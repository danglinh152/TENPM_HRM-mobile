package com.example.tenpm_hrm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import models.NhanVien;

public class NewRequest extends AppCompatActivity {

    private EditText edtChuDe;
    private EditText edtNoiDung;
    private Button submitBtn;
    private DatabaseHandler dbHandler;
    private int manv; // Thêm biến để lưu manv

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.create_request_client);

        dbHandler = new DatabaseHandler(this);
        edtChuDe = findViewById(R.id.edtChuDe);
        edtNoiDung = findViewById(R.id.edtNoiDung);
        submitBtn = findViewById(R.id.button);

        // Lấy Intent và extra
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("nhanVien")) {
            NhanVien nhanVien = (NhanVien) intent.getSerializableExtra("nhanVien");
            if (nhanVien != null) {
                manv = nhanVien.getMaNV(); // Lấy manv từ nhanVien
            }
        }

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dbHandler.addRequest(manv, edtChuDe.getText().toString(), edtNoiDung.getText().toString())) {
                    Toast.makeText(NewRequest.this, "Gửi yêu cầu mới thành công!", Toast.LENGTH_SHORT).show();

                    // Reset các trường nhập liệu
                    edtChuDe.setText("");
                    edtNoiDung.setText("");
                }
                else {
                    Toast.makeText(NewRequest.this, "Gửi yêu cầu mới thất bại :(", Toast.LENGTH_SHORT).show();
                }
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
