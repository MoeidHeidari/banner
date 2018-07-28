# Android banner slider library

A simple to use banner slider library written in android studio.

## Getting Started

This tiny library assists you make your sliders more adabtable whenever you want to get your banner images from somewhere else(by url).
### Prerequisites

Android studio with gradle version 3.0+

## Demo
![bannersliderexampel](https://user-images.githubusercontent.com/41738051/43358953-5628a078-92af-11e8-8eea-982e7fd5d803.gif)
### Installing

Add this items in your build.gradle file
```
Step 1:
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  Step 2:
  dependencies {
	                implementation 'com.github.MoeidHeidari:banner:1.04'
	             }
```
## How to use
```
Steps 1 : 
Add it to your *.xml file
 <com.example.moeidbannerlibrary.banner.BannerLayout
        android:id="@+id/Banner"
        android:layout_width="match_parent"
        android:layout_height="220dp"
        app:autoPlaying="true"
        app:centerScale="1.6"
        app:itemSpace="0"
        app:moveSpeed="0.5"
        app:showIndicator="true"/>
        
Steps 2 :

In your activity

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

```


## To do

* **Implement using image list from drawables and files also** 

## Author

* **Moeid Heidari** 

## And a special thanks to everyone who helped me

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

