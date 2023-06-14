package com.example.sem_dendis.streach

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.sem_dendis.R

class streach : AppCompatActivity() {
    private lateinit var  navControllerStreach: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_strach)

        val navHostStreach = supportFragmentManager
            .findFragmentById(R.id.fragStreach) as NavHost
        navControllerStreach = navHostStreach.navController



        setupActionBarWithNavController(navControllerStreach)
    }
    override fun onSupportNavigateUp(): Boolean {
        return navControllerStreach.navigateUp() || super.onSupportNavigateUp()
    }
}