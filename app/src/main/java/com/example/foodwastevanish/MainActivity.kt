package com.example.foodwastevanish

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView // Access navView from the binding

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_donate, R.id.navigation_inbox, R.id.navigation_notifications, R.id.navigation_more
            )
        )

        data class User(val firstName: String, val lastName: String)
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    private fun setContentView(root: Any) {

    }

    class ActivityMainBinding {
        val navView: BottomNavigationView = TODO()
        val root: Any
            get() {
                TODO()
            }

        companion object {
            fun <LayoutInflater> inflate(layoutInflater: LayoutInflater): ActivityMainBinding {

                return TODO("Provide the return value")
            }
        }

    }

}