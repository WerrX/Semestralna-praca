package com.example.sem_dendis.TrainingII


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.sem_dendis.R


class TrainingActivity : AppCompatActivity() {
    private lateinit var  navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_training)

        val navHost = supportFragmentManager
            .findFragmentById(R.id.fragment_Training) as NavHost
        navController = navHost.navController


        setupActionBarWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }






}