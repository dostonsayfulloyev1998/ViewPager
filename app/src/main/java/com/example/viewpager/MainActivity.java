package com.example.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.viewpager.fragments.FragmentA;
import com.example.viewpager.fragments.FragmentB;
import com.example.viewpager.fragments.FragmentC;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private ViewPager viewPager;
private PagerAdapter pagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Fragment> list = new ArrayList<>();
        list.add(new FragmentA());
        list.add(new FragmentB());
        list.add(new FragmentC());

        viewPager = findViewById(R.id.view_pager);

        pagerAdapter = new SlidePagerAdapter(getSupportFragmentManager(),list);
        viewPager.setAdapter(pagerAdapter);

    }

}