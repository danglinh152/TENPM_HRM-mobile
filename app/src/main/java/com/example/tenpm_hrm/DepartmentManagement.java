package com.example.tenpm_hrm;

import android.os.Bundle;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import customlistview.DepartmentAdapter;
import models.Department;

public class DepartmentManagement extends AppCompatActivity {

    private GridView departmentGridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.department_management);

        departmentGridView = findViewById(R.id.departmentGridView);

        // Create sample department list
        List<Department> departmentList = new ArrayList<>();

        departmentList.add(new Department("001", "IT", "001", "Nguyen Van A", 10, R.drawable.it));
        departmentList.add(new Department("002", "HR", "002", "Tran Thi B", 5, R.drawable.hr));
        departmentList.add(new Department("003", "Sales", "003", "Le Van C", 8, R.drawable.sale));
        departmentList.add(new Department("004", "Marketing", "004", "Pham Thi D", 6, R.drawable.marketing));

        // Initialize adapter and set to GridView
        DepartmentAdapter adapter = new DepartmentAdapter(this, departmentList);
        departmentGridView.setAdapter(adapter);
    }
}