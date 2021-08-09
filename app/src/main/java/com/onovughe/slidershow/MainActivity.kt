package com.onovughe.slidershow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Step 1 open manifest and create network permit
        //Step 2 open gradle Project Slider Show -> maven {url 'https://jitpack.io'}
        //Step 3 open gradle Module
    // add dependency -> implementation 'com.github.denzcoskun:ImageSlideshow:0.1.0'
        //Step 4 open the XML you want to add the slider to
        //Step 5 open the kt file of the XML in step 4 code below

        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
        val imageList = ArrayList<SlideModel>()

        imageList.add(SlideModel("https://images.daznservices.com/di/library/GOAL/5d/42/kelechi-iheanacho-leicester-community-shield_n301ua443ijs19iv8xem0wi7j.jpg?quality=60&w=700", "Kelechi"))
        imageList.add(SlideModel("https://images.daznservices.com/di/library/GOAL/29/25/lionel-messi-press-conference_1ols8hmny27781e1egfocee3nd.jpg?quality=60&w=700", "Messi"))
        imageList.add(SlideModel("https://372673.smushcdn.com/318461/wp-content/uploads/2021/08/Lie-artwork-768x768.jpeg?lossy=1&strip=1&webp=1", "Kizz Daniel"))
        imageList.add(SlideModel("https://372673.smushcdn.com/318461/wp-content/uploads/2021/08/IMG-20210722-WA0024-scaled.jpg?lossy=1&strip=1&webp=1", "Yemisi"))

        imageSlider.setImageList(imageList, ScaleTypes.FIT)
    }
}