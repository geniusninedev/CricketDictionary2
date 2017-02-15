package com.geniusnine.android.cricketdictionary;

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

public class CricTournaments extends Fragment {
    ListView TutorialList;
    ArrayAdapter<String> adapter;

    String[] TutoriallList = new String[]{"World Cup ",
              "Champions Trophy ",
                     "T20 World cup",
                    "Ashes","Border Gavaskar Trophy","Commonwealth Bank Series","Asia Cup","NatWest Series","Indian Premier League","Champions League Twenty20","Others"

    };
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Returning the layout file after inflating
        //Change R.layout.tab1 in you classes


        View view=inflater.inflate(R.layout.activity_cricke_tournaments, container, false);
        TutorialList=(ListView)view.findViewById(R.id.object);
        adapter = new ArrayAdapter<String>(getActivity(), R.layout.activity_cricke_tournaments, R.id.textViewtut,TutoriallList);
        TutorialList.setAdapter(adapter);

        TutorialList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent EnglishBegRef = new Intent(getActivity(),TournamentsDetails.class);
                EnglishBegRef.putExtra("key", position);
                startActivity(EnglishBegRef);

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











