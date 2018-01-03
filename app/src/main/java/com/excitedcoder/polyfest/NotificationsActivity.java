package com.excitedcoder.polyfest;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class NotificationsActivity extends AppCompatActivity {

    ProgressBar updateProgress;
    WebView webView;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent intent1 = new Intent(NotificationsActivity.this, MainActivity.class);
                    intent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent1);
                    return true;
                case R.id.navigation_register:
                    Intent intent2 = new Intent(NotificationsActivity.this, RegisterActivity.class);
                    intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent2);
                    return true;
                case R.id.navigation_notifications:
                    //Intent intent3 = new Intent(NotificationsActivity.this, NotificationsActivity.class);
                    //intent3.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    //startActivity(intent3);
                    return true;
                case R.id.navigation_events:
                    Intent intent4 = new Intent(NotificationsActivity.this, EventsActivity.class);
                    intent4.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent4);
                    return true;
                case R.id.navigation_contact:
                    Intent intent5 = new Intent(NotificationsActivity.this, ContactActivity.class);
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
        setContentView(R.layout.notification_layout);
        setTitle("POLYFEST-2K18 : Updates");

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        BottomNavigationViewHelper.disableShiftMode(navigation);
        Menu menu = navigation.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        updateProgress = (ProgressBar) findViewById(R.id.update_progressbar);
        webView = (WebView) findViewById(R.id.update_webview);

        webView.setVisibility(View.INVISIBLE);
        webView.setInitialScale(1);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        webView.setScrollbarFadingEnabled(false);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setSupportZoom(true);
        //webView.getSettings().setBuiltInZoomControls(true);
        webView.setWebChromeClient(new WebChromeClient());

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                Toast.makeText(NotificationsActivity.this, "Loading", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);

                updateProgress.setVisibility(View.GONE);
                webView.setVisibility(View.VISIBLE);
                Toast.makeText(NotificationsActivity.this, "Loading completed", Toast.LENGTH_SHORT).show();
            }
        });
        webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLScEH6BubMTh7zjJVyj9SwCIs794i3nvrd8SzH8m4tCUY0XF0A/viewform");
    }



}
