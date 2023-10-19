package com.example.android_crud_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button insert;
    Button update;
    Button delete;
    Button view;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        insert=(Button) findViewById(R.id.insert);
        update=(Button)  findViewById(R.id.update);
        delete=(Button) findViewById(R.id.delete);
        view=(Button) findViewById(R.id.view);

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),activity_add.class));
            }
        });
    }
}