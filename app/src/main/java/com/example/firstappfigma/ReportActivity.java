package com.example.firstappfigma;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ReportActivity extends AppCompatActivity {
    private ImageView  imageViewBlood;
    private Button buttonLogin,buttonLogin1,buttonLogi;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sendreport);

        buttonLogi = findViewById(R.id.buttonLogi);
        buttonLogin = findViewById(R.id.buttonLogin);
        buttonLogin1 = findViewById(R.id.buttonLogin1);

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
                        Intent intent = new Intent(ReportActivity.this, WelcomeActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.nav_gallery:
                        Intent intent2 = new Intent(ReportActivity.this, ProfileActivity.class);
                        startActivity(intent2);
                        break;

                    case R.id.nav_slideshow:

                        break;

                    case R.id.nav_manage:
                        Intent intent3 = new Intent(ReportActivity.this, GlucoseActivity.class);
                        startActivity(intent3);
                        break;

                    case R.id.nav_camera2:
                        Intent intent1 = new Intent(ReportActivity.this, MealActivity.class);
                        startActivity(intent1);
                        break;

                }


                return false;
            }
        });

    }
}
