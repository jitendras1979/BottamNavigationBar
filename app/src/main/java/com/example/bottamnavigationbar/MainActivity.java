package com.example.bottamnavigationbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottam_navigation_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
               switch (item.getItemId()){
                   case R.id.action_recent:
                       Toast.makeText(MainActivity.this, "Recent", Toast.LENGTH_SHORT).show();
                       break;
                   case R.id.action_nearby:
                       Toast.makeText(MainActivity.this, "nearby", Toast.LENGTH_SHORT).show();
                       break;

                   case R.id.action_favirote:
                       Toast.makeText(MainActivity.this, "favroite", Toast.LENGTH_SHORT).show();
                       break;
               }
               return true;
            }
        });

    }
}
