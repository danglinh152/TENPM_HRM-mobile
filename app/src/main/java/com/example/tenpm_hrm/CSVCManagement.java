package com.example.tenpm_hrm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class CSVCManagement extends AppCompatActivity {
    private Button addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.csvc_management_admin);

        addBtn = findViewById(R.id.addBtn);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show ProgressBar before starting the new activity
//                progressBar.setVisibility(View.VISIBLE);

                // Start the new activity
                Intent newRequestIntent = new Intent(CSVCManagement.this, NewCSVC.class);
                startActivity(newRequestIntent);

                // Optionally hide the ProgressBar after a short delay
                // This is just to simulate loading; adjust as needed
//                v.postDelayed(() -> progressBar.setVisibility(View.GONE), 300);
            }
        });

    }
}