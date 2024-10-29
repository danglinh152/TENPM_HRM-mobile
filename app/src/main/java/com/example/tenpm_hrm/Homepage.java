package com.example.tenpm_hrm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class Homepage extends AppCompatActivity {
    private CardView cardEmployee;
    private CardView cardDepartment;
    private CardView cardAttendance;
    private CardView cardFacilities;
    private CardView cardProject;
    private CardView cardRequest;
    private CardView cardAccount;
    private ProgressBar progressBar; // Add a ProgressBar for better UX

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.homepage);

        cardRequest = findViewById(R.id.cardRequest);
        cardEmployee = findViewById(R.id.cardEmployee);
        cardDepartment = findViewById(R.id.cardDepartment);
        cardAttendance = findViewById(R.id.cardAttendance);
        cardFacilities = findViewById(R.id.cardFacilities);
        cardProject = findViewById(R.id.cardProject);
        cardAccount = findViewById(R.id.cardAccount);
//        progressBar = findViewById(R.id.progressBar);

        cardRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show ProgressBar before starting the new activity
//                progressBar.setVisibility(View.VISIBLE);

                // Start the new activity
                Intent newRequestIntent = new Intent(Homepage.this, RequestManagementClient.class);
                startActivity(newRequestIntent);

                // Optionally hide the ProgressBar after a short delay
                // This is just to simulate loading; adjust as needed
//                v.postDelayed(() -> progressBar.setVisibility(View.GONE), 300);
            }
        });
    }
}
