package com.example.android_crud_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class activity_add extends AppCompatActivity {

    EditText name;
    EditText dept;
    EditText salary;
    Button btnadd;
    DBHandler dbHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        name=(EditText) findViewById(R.id.add_name);
        dept=(EditText) findViewById(R.id.add_dep);
        salary=(EditText) findViewById(R.id.add_salary);
        btnadd=(Button) findViewById(R.id.add_btn);
        dbHandler=new DBHandler(this);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String empName=name.getText().toString();
                String empDept=dept.getText().toString();
                String empSalary=salary.getText().toString();
                Employee emp=new Employee(empName,empDept,empSalary);
                dbHandler.addEmployee(emp);
                Toast.makeText(getApplicationContext(),"data inserted",Toast.LENGTH_LONG).show();
            }
        });

    }

}