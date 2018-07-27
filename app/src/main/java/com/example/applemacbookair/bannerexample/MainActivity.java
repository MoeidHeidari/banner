package com.example.applemacbookair.bannerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.LinearLayout;

import com.example.moeidbannerlibrary.banner.BannerLayout;
import com.example.moeidbannerlibrary.banner.BaseBannerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BannerLayout banner=(BannerLayout) findViewById(R.id.Banner);

        List<String> urls = new ArrayList<>();
        urls.add("http://szzljy.com/images/mountain/mountain4.jpg");
        urls.add("http://szzljy.com/images/mountain/mountain4.jpg");
        urls.add("http://www.visitgreece.gr/deployedFiles/StaticFiles/Photos/Generic%20Contents/Forests/mountains_2_560.jpg");
        urls.add("http://szzljy.com/images/mountain/mountain4.jpg");
        urls.add("http://www.visitgreece.gr/deployedFiles/StaticFiles/Photos/Generic%20Contents/Forests/mountains_2_560.jpg");
        urls.add("http://szzljy.com/images/mountain/mountain4.jpg");


        BaseBannerAdapter webBannerAdapter=new BaseBannerAdapter(this,urls);
        webBannerAdapter.setOnBannerItemClickListener(new BannerLayout.OnBannerItemClickListener() {
            @Override
            public void onItemClick(int position)
            {


            }
        });
        banner.setAdapter(webBannerAdapter);

    }
}
