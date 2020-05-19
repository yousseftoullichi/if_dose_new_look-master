package com.example.firstappfigma;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.textfield.TextInputLayout;

public class MealActivity extends AppCompatActivity {
    private ImageView imageViewBlood;
    private TextView  subtitle_header;
    private Button button;
    private EditText name_edit_text,food_edit_text,foodQtytype_edit_text,foodQty_edit_text,name_edit_text1;
    private TextInputLayout name_text_input,name_text_input1;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_meal);

        imageViewBlood = findViewById(R.id.imageViewBlood);
        subtitle_header = findViewById(R.id.subtitle_header);
        button = findViewById(R.id.buttonLogin);
        name_edit_text = findViewById(R.id.name_edit_text);
        food_edit_text = findViewById(R.id.food_edit_text);
        foodQty_edit_text = findViewById(R.id.foodQty_edit_text);
        foodQtytype_edit_text = findViewById(R.id.foodQty_edit_text);
        name_edit_text1 = findViewById(R.id.name_edit_text1);
        name_text_input = findViewById(R.id.name_text_input);
        name_text_input1 = findViewById(R.id.name_text_input1);

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
                        Intent intent = new Intent(MealActivity.this, WelcomeActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.nav_gallery:
                        Intent intent1 = new Intent(MealActivity.this, ProfileActivity.class);
                        startActivity(intent1);
                        break;

                    case R.id.nav_slideshow:
                        Intent intent2 = new Intent(MealActivity.this, ReportActivity.class);
                        startActivity(intent2);
                        break;

                    case R.id.nav_manage:
                        Intent intent3 = new Intent(MealActivity.this, GlucoseActivity.class);
                        startActivity(intent3);
                        break;

                    case R.id.nav_camera2:

                        break;
                }


                return false;
            }
        });








    }

}
