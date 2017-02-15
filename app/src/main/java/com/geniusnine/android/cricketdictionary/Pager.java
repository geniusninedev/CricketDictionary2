package com.geniusnine.android.cricketdictionary;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.geniusnine.android.cricketdictionary.CricketHome.CricketHome;

/**
 * Created by Dev on 14-02-2017.
 */

public class Pager  extends FragmentStatePagerAdapter {

    //integer to count number of tabs
    int tabCount;

    //Constructor to the class
    public Pager(FragmentManager fm, int tabCount) {
        super(fm);
        //Initializing tab count
        this.tabCount= tabCount;
    }

    public Pager(FragmentManager fm) {
        super(fm);

    }

    //Overriding method getItem
   @Override
    public Fragment getItem(int position) {
        //Returning the current tabs
        switch (position) {
            case 0:
                CricketHome tab1 = new CricketHome();
                return tab1;
            case 1:
                History tab2 = new History();
                return tab2;
            case 2:
                AboutCricket  tab3 = new AboutCricket();
                return tab3;
            case 3:
                CrickeTypes tab4 = new CrickeTypes();
                return tab4;
            case 4:
                CricTournaments tab5 = new CricTournaments();
                return tab5;
            default:
                return null;
        }
    }

    //Overriden method getCount to get the number of tabs
    @Override
    public int getCount() {
        return tabCount;
    }
}