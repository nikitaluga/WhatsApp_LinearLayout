package com.example.homework_whatsapp_linearlayout;

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

    public void onClickMyButton(View view) {
        TextView textView = findViewById(R.id.myTextViewMassage);
        EditText editText = findViewById(R.id.myEditText);

        String textFromEditText = editText.getText().toString();

        textView.setText(textFromEditText);
    }


}
