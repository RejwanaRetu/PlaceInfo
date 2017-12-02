package retu.placeinfo.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;




/**
 * Created by Retu on 02-12-17.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment> fragmentArrayList = new ArrayList<>();
    ArrayList<String>tabTittleList = new ArrayList<>();
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position){

        return fragmentArrayList.get(position) ;
    }


    @Override
    public int getCount() {
        return fragmentArrayList.size();
    }
    @Override
    public String getPageTitle(int position){

        return  tabTittleList.get(position);
    }

    public  void addFragment(Fragment fragment,String title){
        fragmentArrayList.add(fragment);
        tabTittleList.add(title);
    }
}
