package com.example.firstappfigma;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class WelcomeActivity extends AppCompatActivity {
    private ImageView imageViewBlood;
    private TextView textViewActivity, subtitle_header,textView7,textView8,SHowFood;
    private Button btnbrakfast,btnlunch,btndinner,btnsnack, buttonLogin,buttonLogin1;
    private RadioButton radioAvecLivret5,radioAvecLivret2,radioAvecLivret3,radioAvecLivret1,radioAvecLivret4,radioSansLivret;
    private EditText name_edit_text;
    private RadioGroup radioGroup;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_withbottomnavigationbar);
        btnbrakfast = findViewById(R.id.btnbrakfast);
        btnsnack =  findViewById(R.id.btnsnack);
        btnlunch = findViewById(R.id.btnlunch);
        btndinner = findViewById(R.id.btndinner);
        radioAvecLivret1 = findViewById(R.id.radioAvecLivret1);
        radioAvecLivret2 = findViewById(R.id.radioAvecLivret2);
        radioAvecLivret3 = findViewById(R.id.radioAvecLivret3);
        radioAvecLivret4 = findViewById(R.id.radioAvecLivret4);
        radioAvecLivret5 = findViewById(R.id.radioAvecLivret5);
        radioSansLivret = findViewById(R.id.radioSansLivret);
        buttonLogin = findViewById(R.id.buttonLogin);
        buttonLogin1 = findViewById(R.id.buttonLogin1);
        textViewActivity = findViewById(R.id.textViewActivity);
        subtitle_header =  findViewById(R.id.subtitle_header);
        textView7 =  findViewById(R.id.textView7);
        textView8 =  findViewById(R.id.textView8);
        SHowFood =  findViewById(R.id.SHowFood);
        imageViewBlood = findViewById(R.id.imageViewBlood);
        name_edit_text = findViewById(R.id.name_edit_text);
        radioGroup = findViewById(R.id.radioGroup);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.nav_camera:

                        break;

                    case R.id.nav_gallery:
                        Intent intent1 = new Intent(WelcomeActivity.this, ProfileActivity.class);
                        startActivity(intent1);
                        break;

                    case R.id.nav_slideshow:
                        Intent intent2 = new Intent(WelcomeActivity.this, ReportActivity.class);
                        startActivity(intent2);
                        break;

                    case R.id.nav_manage:
                        Intent intent3 = new Intent(WelcomeActivity.this, GlucoseActivity.class);
                        startActivity(intent3);
                        break;

                    case R.id.nav_camera2:
                        Intent intent4 = new Intent(WelcomeActivity.this, MealActivity.class);
                        startActivity(intent4);
                        break;
                }


                return false;
            }
        });


    }

    }
