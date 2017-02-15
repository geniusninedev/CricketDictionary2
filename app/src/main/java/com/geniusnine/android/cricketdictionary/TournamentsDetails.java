package com.geniusnine.android.cricketdictionary;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class TournamentsDetails extends AppCompatActivity {
    WebView tutorialsWebView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tournaments_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        tutorialsWebView = (WebView) findViewById(R.id.CallTutorialWebViwId);

        WebSettings webSetting = tutorialsWebView.getSettings();
        webSetting.setBuiltInZoomControls(true);

        webSetting.setJavaScriptEnabled(true);

        tutorialsWebView.setWebViewClient(new TournamentsDetails.WebViewClient());

        int position = getIntent().getIntExtra("key", 0);

        if (position == 0) {
            tutorialsWebView.loadUrl("file:///android_asset/worldcup.html");
        } else if (position == 1) {
            tutorialsWebView.loadUrl("file:///android_asset/champions.html");
        } else if (position == 2) {
            tutorialsWebView.loadUrl("file:///android_asset/ttwenty.html");
        } else if (position == 3) {
            tutorialsWebView.loadUrl("file:///android_asset/ashes.html");
        } else if (position == 4) {
            tutorialsWebView.loadUrl("file:///android_asset/gavskartrophy.html");

        } else if (position == 5) {
            tutorialsWebView.loadUrl("file:///android_asset/commonwealth.html");
        } else if (position == 6) {
            tutorialsWebView.loadUrl("file:///android_asset/asiacup.html");
        }

        else if (position == 7) {
            tutorialsWebView.loadUrl("file:///android_asset/natwest.html");
        }
        else if (position == 8) {
            tutorialsWebView.loadUrl("file:///android_asset/premier.html");
        }
        else if (position == 9) {
            tutorialsWebView.loadUrl("file:///android_asset/championleague.html");
        }
        else if (position == 10) {
            tutorialsWebView.loadUrl("file:///android_asset/other.html");
        }


    }

    class WebViewClient extends android.webkit.WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }

    }
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            //  Toast.makeText(this, "landscape", Toast.LENGTH_SHORT).show();
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            //Toast.makeText(this, "portrait", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch (item.getItemId()) {
            case android.R.id.home:


                this.finish();
                return true;
            default:
                if (id == R.id.action_settings) {
                    Intent i = new Intent(Intent.ACTION_SEND);
                    i.setType("text/plain");
                    i.putExtra(Intent.EXTRA_TEXT, "message to share");
                    startActivity(Intent.createChooser(i, "Share via"));
                    return true;
                }
                return super.onOptionsItemSelected(item);

        }
    }


}



