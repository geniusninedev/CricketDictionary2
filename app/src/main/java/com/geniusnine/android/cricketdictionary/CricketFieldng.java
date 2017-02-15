package com.geniusnine.android.cricketdictionary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.geniusnine.android.cricketdictionary.CricketTerms.TouchImageView;


/**
 * Created by Dev on 08-12-2016.
 */

public class CricketFieldng extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_cricket_pitch);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TouchImageView img = new TouchImageView(this);
        img.setImageResource(R.drawable.position);
        img.setMaxZoom(4f);
        setContentView(img);
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


