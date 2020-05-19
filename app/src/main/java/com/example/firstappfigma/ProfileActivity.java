package com.example.firstappfigma;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class ProfileActivity extends AppCompatActivity {
    private ImageView imageViewBlood;
    private TextInputEditText name_edit_text,name_edit_text2,name_edit_text3,name_edit_text4,name_edit_text5;
    private TextInputLayout name_text_input,name_text_input2,name_text_input3,name_text_input4,name_text_input5;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_info);
        name_edit_text = findViewById(R.id.name_edit_text);
        name_edit_text2= findViewById(R.id.name_edit_text2);
        name_edit_text3= findViewById(R.id.name_edit_text3);
        name_edit_text4= findViewById(R.id.name_edit_text4);
        name_edit_text5= findViewById(R.id.name_edit_text5);
        name_text_input=findViewById(R.id.name_text_input);
        name_text_input2=findViewById(R.id.name_text_input2);
        name_text_input3=findViewById(R.id.name_text_input3);
        name_text_input4=findViewById(R.id.name_text_input4);
        name_text_input5=findViewById(R.id.name_text_input5);



    }
}
