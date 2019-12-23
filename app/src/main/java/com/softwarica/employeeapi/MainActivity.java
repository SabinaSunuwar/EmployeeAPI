package com.softwarica.employeeapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.softwarica.employeeapi.url.URL;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnShow, btnRegister, btnSearch, btnUpdateDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShow = findViewById(R.id.btnShow);
        btnRegister = findViewById(R.id.btnRegister);
        btnSearch = findViewById(R.id.btnSearch);
        btnUpdateDelete =  findViewById(R.id.btnUpdateDelete);



        btnShow.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
        btnSearch.setOnClickListener(this);
        btnUpdateDelete.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnShow:
                startActivity(new Intent(this, ShowEmployeeActivity.class));
                break;

                case R.id.btnRegister:
                startActivity(new Intent(this, RegisterEmployeeActivity.class));
                break;

                case R.id.btnSearch:
                startActivity(new Intent(this, SearchEmployeeActivity.class));
                break;

                case R.id.btnUpdateDelete:
                startActivity(new Intent(this, UpdateDeleteEmployeeActivity.class));
                break;



        }
    }
}
