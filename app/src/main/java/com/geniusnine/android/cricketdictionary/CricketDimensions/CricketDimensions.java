package com.geniusnine.android.cricketdictionary.CricketDimensions;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.cricketdictionary.CricketTerms.CricketPitch;
import com.geniusnine.android.cricketdictionary.R;


public class CricketDimensions  extends AppCompatActivity {
    ListView listView;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cricket_dimensions);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listView=(ListView)findViewById(R.id.tutorials);
        //   Chankya=(TextView)findViewById(R.id.textView1);
        String[] values = new String[]{ "Cricket Bat",
                "Cricket Ball",
                "Cricket Pitch",
                "Cricket Ground",
                "Cricket Stumps"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.activity_cricket_home, R.id.textViewtut, values);


        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent i=new Intent(CricketDimensions.this,CricketBat.class);
                    startActivity(i);
                }
                if(position==1){
                    Intent i=new Intent(CricketDimensions.this,CricketBall.class);
                    startActivity(i);
                }
                if(position==2){
                    Intent i=new Intent(CricketDimensions.this,CricketPitch.class);
                    startActivity(i);
                }
                if(position==3){
                    Intent i=new Intent(CricketDimensions.this,CricketGround.class);
                    startActivity(i);
                }
                if(position==4){
                    Intent i=new Intent(CricketDimensions.this,CricketStumps.class);
                    startActivity(i);
                }



            }
        });

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













