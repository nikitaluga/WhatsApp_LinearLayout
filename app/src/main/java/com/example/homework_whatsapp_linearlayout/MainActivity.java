package com.example.homework_whatsapp_linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewMassage;
    EditText editTextMassage;

    Spinner spinnerName;
    Spinner spinnerGroup;

    TextView textViewName;
    TextView textViewGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickMyButton(View view) {
        textViewMassage = findViewById(R.id.myTextViewMassage);
        editTextMassage = findViewById(R.id.myEditText);
        String textFromEditText = editTextMassage.getText().toString();
        textViewMassage.setText(textFromEditText);

        spinnerName = findViewById(R.id.spinnerName);
        String textFromSpinnerName = spinnerName.getSelectedItem().toString();
        textViewName = findViewById(R.id.textViewName);
        textViewName.setText(textFromSpinnerName);

        spinnerGroup = findViewById(R.id.spinnerGroup);
        String textFromSpinnerGroup = spinnerGroup.getSelectedItem().toString();
        textViewGroup = findViewById(R.id.textViewGroup);
        textViewGroup.setText(textFromSpinnerGroup);
    }
}
