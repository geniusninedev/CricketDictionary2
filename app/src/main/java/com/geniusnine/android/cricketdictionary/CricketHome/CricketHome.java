package com.geniusnine.android.cricketdictionary.CricketHome;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.geniusnine.android.cricketdictionary.CricketDimensions.CricketDimensions;
import com.geniusnine.android.cricketdictionary.CricketFieldng;
import com.geniusnine.android.cricketdictionary.CricketRules;
import com.geniusnine.android.cricketdictionary.CricketTerms.CricketBoards;
import com.geniusnine.android.cricketdictionary.CricketTerms.CricketPitch;
import com.geniusnine.android.cricketdictionary.CricketTerms.CricketTerms;
import com.geniusnine.android.cricketdictionary.CricketUmpiring;
import com.geniusnine.android.cricketdictionary.R;


public class CricketHome extends Fragment {

    ListView listView;
    ArrayAdapter<String> adapter;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Returning the layout file after inflating
        //Change R.layout.tab1 in you classes
        View view=inflater.inflate(R.layout.activity_cricket_home, container, false);
        listView=(ListView)view.findViewById(R.id.tutorials);
        //   Chankya=(TextView)findViewById(R.id.textView1);
        String[] values = new String[] {"Cricket Terms ",
                "Cricket Boards",
                "Cricket Pitch",
                "Cricket Dimensions",
                "Rules And Game Play",
                "Fielding Positions",
                "Umpiring"};


        adapter = new ArrayAdapter<String>(getActivity(), R.layout.activity_cricket_home, R.id.textViewtut,values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0){
                    Intent i=new Intent(getActivity(),CricketTerms.class);
                    startActivity(i);
                }
                if(position==1){
                    Intent i=new Intent(getActivity(),CricketBoards.class);
                    startActivity(i);
                }
                if(position==2){
                    Intent i=new Intent(getActivity(),CricketPitch.class);
                    startActivity(i);
                }
                if(position==3){
                    Intent i=new Intent(getActivity(),CricketDimensions.class);
                    startActivity(i);
                }
                if(position==4){
                    Intent i=new Intent(getActivity(),CricketRules.class);
                    startActivity(i);
                }

                if(position==5){
                    Intent i=new Intent(getActivity(),CricketFieldng.class);
                    startActivity(i);
                }
                if(position==6){
                    Intent i=new Intent(getActivity(),CricketUmpiring.class);
                    startActivity(i);
                }

            }
        });

        return  view;
    }
    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if(isVisibleToUser) {
            Activity a = getActivity();
            if(a != null) a.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_FULL_SENSOR);
        }
    }

}