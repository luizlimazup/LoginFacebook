package com.lcardoso.teladelogindofacebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alterText(View view){

        EditText emailText = findViewById(R.id.emailText);
        emailText.setText("luiz.lima@zup.com.br");
    }
}
