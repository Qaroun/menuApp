package com.example.menuapp;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;



public class MainActivity extends AppCompatActivity {





    private DrawerLayout drawerLayout;

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = findViewById(R.id.myToolBar);
   drawerLayout = findViewById(R.id.myDrawer);
        NavigationView navigationView = findViewById(R.id.myNav);
   setSupportActionBar(toolbar);
   drawerLayout = findViewById(R.id.myDrawer);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
   drawerLayout.addDrawerListener(toggle);
   toggle.syncState();
   //----------------------------------------------------
        navigationView.setNavigationItemSelectedListener(item -> {
         switch (item.getItemId()){
             case R.id.home:
                 getSupportFragmentManager().beginTransaction().replace(R.id.myframeLayout,new HomeFragment()).commit();
                 drawerLayout.closeDrawer(GravityCompat.START);
                 break;
             case R.id.Convertion:
                 getSupportFragmentManager().beginTransaction().replace(R.id.myframeLayout,new ConvertionFragment()).commit();
                 drawerLayout.closeDrawer(GravityCompat.START);

                 break;

             case R.id.Calculatrice:
                 getSupportFragmentManager().beginTransaction().replace(R.id.myframeLayout,new CalculatriceFragment()).commit();
                 drawerLayout.closeDrawer(GravityCompat.START);
                 break;

             case R.id.Galérie:
                 getSupportFragmentManager().beginTransaction().replace(R.id.myframeLayout,new GalleryFragment()).commit();
                 drawerLayout.closeDrawer(GravityCompat.START);
                 break;

             case R.id.log:
                 getSupportFragmentManager().beginTransaction().replace(R.id.myframeLayout,new LogOutFragment()).commit();
                 drawerLayout.closeDrawer(GravityCompat.START);
                 break;





         }
            return true;
        });
    }
}