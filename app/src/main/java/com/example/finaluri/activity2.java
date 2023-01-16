package com.example.finaluri;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.navigation.NavigationBarView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class activity2 extends AppCompatActivity {

    BottomNavigationView nav;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nav = findViewById(R.id.nav1);

        nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.home:
                        Toast.makeText(activity2.this, "Home", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.workout:
                        Toast.makeText(activity2.this, "Workout", Toast.LENGTH_SHORT).show();
                        break;

                    default:


                }
            return true;}
        });






    }
}
