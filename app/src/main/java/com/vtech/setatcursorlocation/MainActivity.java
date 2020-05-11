package com.vtech.setatcursorlocation;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.vtech.setatcursor.EditTextCursor;

public class MainActivity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edittext);


    }

    public void setTextAtCursor(View view) {
        String text = "Some Text";
        EditTextCursor.setText(editText, text);
    }
}
