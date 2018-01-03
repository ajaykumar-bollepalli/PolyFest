package com.excitedcoder.polyfest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.internal.BottomNavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Field;

public class RegisterActivity extends AppCompatActivity {

    private TextView mTextMessage;
    Button rNIPS;
    Button rCLAPS;
    Button rGLORY;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent intent1 = new Intent(RegisterActivity.this, MainActivity.class);
                    intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent1);
                    return true;
                case R.id.navigation_register:
                    //Intent intent2 = new Intent(RegisterActivity.this, RegisterActivity.class);
                    //intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    //startActivity(intent2);
                    return true;
                case R.id.navigation_notifications:
                    Intent intent3 = new Intent(RegisterActivity.this, NotificationsActivity.class);
                    intent3.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent3);
                    return true;
                case R.id.navigation_events:
                    Intent intent4 = new Intent(RegisterActivity.this, EventsActivity.class);
                    intent4.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent4);
                    return true;
                case R.id.navigation_contact:
                    Intent intent5 = new Intent(RegisterActivity.this, ContactActivity.class);
                    intent5.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent5);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_layout);
        setTitle("POLYFEST-2K18 : Register");

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        BottomNavigationViewHelper.disableShiftMode(navigation);
        Menu menu = navigation.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        rNIPS = findViewById(R.id.button_nipsR);
        rCLAPS = findViewById(R.id.button_clapsR);
        rGLORY = findViewById(R.id.button_gloryR);

        rNIPS.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent rNIPS_intent = new Intent(RegisterActivity.this, DetailActivity.class);
                rNIPS_intent.putExtra("url","https://goo.gl/forms/EAuWYT8EhNB5K61P2");
                startActivity(rNIPS_intent);
            }
        });

        rCLAPS.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent rCLAPS_intent = new Intent(RegisterActivity.this, DetailActivity.class);
                rCLAPS_intent.putExtra("url","https://goo.gl/forms/M7EElld07jX7wAs43");
                startActivity(rCLAPS_intent);
            }
        });

        rGLORY.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent rGLORY_intent = new Intent(RegisterActivity.this, DetailActivity.class);
                rGLORY_intent.putExtra("url","https://goo.gl/forms/7Bs9SSbm4IWmed192");
                startActivity(rGLORY_intent);
            }
        });

    }

}
