package com.example.bai3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText et_duong = findViewById(R.id.et_duong);
        EditText et_am = findViewById(R.id.et_am);
        Button btn_chuyen = findViewById(R.id.btn_chuyen);

        btn_chuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nam = Integer.parseInt(et_duong.getText().toString());
                if(nam<1900){
                    Toast.makeText(MainActivity.this, "Số năm không được nhỏ hơn 1900", Toast.LENGTH_SHORT).show();
                    et_am.setText("");
                }else{
                    ConvertYear cv = new ConvertYear();
                    String namchuyendoi = cv.Convert(nam);
                    et_am.setText(namchuyendoi);
                }
            }
        });
    }
}