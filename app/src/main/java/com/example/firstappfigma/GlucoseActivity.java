package com.example.firstappfigma;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class GlucoseActivity extends AppCompatActivity {

    private ImageView imageViewBlood;
    private TextInputEditText name_edit_text, name_edit_text1, name_edit_text2, name_edit_text3, name_edit_text4;
    private TextInputLayout name_text_input, name_text_input2, name_text_input3, name_text_input4, name_text_input1;
    private Button buttonLogin;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.glucosemanagement);
        name_edit_text2= findViewById(R.id.name_edit_text2);
        name_edit_text3= findViewById(R.id.name_edit_text3);
        name_edit_text4= findViewById(R.id.name_edit_text4);
        name_edit_text1= findViewById(R.id.name_edit_text1);
        imageViewBlood = findViewById(R.id.imageViewBlood);
        name_edit_text = findViewById(R.id.name_edit_text);
        name_text_input=findViewById(R.id.name_text_input);
        name_text_input2=findViewById(R.id.name_text_input2);
        name_text_input3=findViewById(R.id.name_text_input3);
        name_text_input4=findViewById(R.id.name_text_input4);
        name_text_input1=findViewById(R.id.name_text_input);
        buttonLogin = findViewById(R.id.buttonLogin);

    }
}
