package com.example.sem_dendis

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.sem_dendis.progress.ProgressActivity
import com.example.sem_dendis.streach.streach
import com.example.sem_dendis.TrainingII.TrainingActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //umozni otacanie
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_SENSOR
        setContentView(R.layout.activity_main)

        //buttons in main
        val imBtraining = findViewById<ImageButton>(R.id.iB_main_Training)
        val imBstreaching = findViewById<ImageButton>(R.id.iB_main_straching)
        val imBprogress = findViewById<ImageButton>(R.id.iB_main_Progress)

        //trening
        imBtraining.setOnClickListener(){
            val imBtr = Intent(this, TrainingActivity::class.java)
            startActivity(imBtr)
        }
        //streaching class
        imBstreaching.setOnClickListener(){
            val imgBtstreaching = Intent(this, streach::class.java)
            startActivity(imgBtstreaching)
        }
               //Progress
        imBprogress.setOnClickListener(){
            val imgBtprogress = Intent(this, ProgressActivity::class.java)

            startActivity(imgBtprogress)
        }
    }



}
