package com.excitedcoder.polyfest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    Button websiteButton;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    //Intent intent1 = new Intent(MainActivity.this, MainActivity.class);
                    //intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    //startActivity(intent1);
                    return true;
                case R.id.navigation_register:
                    Intent intent2 = new Intent(MainActivity.this, RegisterActivity.class);
                    intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent2);
                    return true;
                case R.id.navigation_notifications:
                    Intent intent3 = new Intent(MainActivity.this, NotificationsActivity.class);
                    intent3.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent3);
                    return true;
                case R.id.navigation_events:
                    Intent intent4 = new Intent(MainActivity.this, EventsActivity.class);
                    intent4.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent4);
                    return true;
                case R.id.navigation_contact:
                    Intent intent5 = new Intent(MainActivity.this, ContactActivity.class);
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
        setContentView(R.layout.activity_main);
        setTitle("POLYFEST-2K18");

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        BottomNavigationViewHelper.disableShiftMode(navigation);
        Menu menu = navigation.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        websiteButton = (Button) findViewById(R.id.website_button);
        websiteButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                /*Uri uri = Uri.parse("http://aanm-vvrsrpolytechnic.ac.in/"); // missing 'http://' will cause crash
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);*/

                Intent visitSite_intent = new Intent(MainActivity.this, DetailActivity.class);
                visitSite_intent.putExtra("url","http://aanm-vvrsrpolytechnic.ac.in/");
                startActivity(visitSite_intent);
            }
        });

    }

}
