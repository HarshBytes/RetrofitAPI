package com.example.ecommdb;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class home extends AppCompatActivity {
public DrawerLayout drawerLayout;
ActionBarDrawerToggle actionBarDrawerToggle;
NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
            setTitle("Food Cart");
            navigationView=findViewById(R.id.navigation_menu);
            drawerLayout=findViewById(R.id.drawer);
            actionBarDrawerToggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.nav_open,R.string.nav_close);
            drawerLayout.addDrawerListener(actionBarDrawerToggle);
            actionBarDrawerToggle.syncState();

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    switch (item.getItemId()){
                        case R.id.nav_Logout:
                            SharedPreferences sp = getSharedPreferences("credential", MODE_PRIVATE);

                            // Clear the username and password values
                            SharedPreferences.Editor editor = sp.edit();
                            editor.remove("username");
                            editor.remove("password");
                            editor.apply();
                            // Revert to the Login_Page
                            Intent intent=new Intent(home.this,MainActivity.class);
                            startActivity(intent);
                            finish();

                            Toast.makeText(home.this, "User Logged Out", Toast.LENGTH_SHORT).show();
                            drawerLayout.closeDrawer(GravityCompat.START);
                    }
                    return false;
                }
            });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}