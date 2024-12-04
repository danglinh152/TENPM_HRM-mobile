package com.example.tenpm_hrm;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private DatabaseHandler dbHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.login);
        dbHandler = new DatabaseHandler(this);
        dbHandler.deleteDatabase(this); // deletedb
        dbHandler.addDe();
        dbHandler.addAdminAccount();
    }
}