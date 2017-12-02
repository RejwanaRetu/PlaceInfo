package retu.placeinfo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import retu.placeinfo.Adapter.ViewPagerAdapter;
import retu.placeinfo.Fragment.Acomodation;
import retu.placeinfo.Fragment.Category;
import retu.placeinfo.Fragment.Image;
import retu.placeinfo.Fragment.Overview;
import retu.placeinfo.Fragment.BestSeason;
import retu.placeinfo.Fragment.RangeOfCost;
import retu.placeinfo.Fragment.WayToGo;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolBar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        setSupportActionBar(toolbar);
        setDataToViewPager();
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setDataToViewPager() {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Overview()," Overview");
        adapter.addFragment(new BestSeason()," BestSeason");
        adapter.addFragment(new RangeOfCost()," RangeOfCost");
        adapter.addFragment(new WayToGo()," WayToGo");
        adapter.addFragment(new Image()," Image");
        adapter.addFragment(new Category()," Category");
        adapter.addFragment(new Acomodation()," Acomodation");





        viewPager.setAdapter(adapter);


    }
}
