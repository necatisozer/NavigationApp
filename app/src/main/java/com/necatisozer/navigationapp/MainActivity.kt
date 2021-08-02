package com.necatisozer.navigationapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.necatisozer.navigationapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by viewBinding(ActivityMainBinding::inflate)

    private val navController by lazy {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navHostFragment.navController
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initToolbar()
        initBottomNav()
    }

    private fun initToolbar() {
        // val appBarConfiguration = AppBarConfiguration(navController.graph)

        val appBarConfiguration = AppBarConfiguration.Builder(
            R.id.home_graph,
            R.id.about_graph,
        ).build()

        binding.toolbar.setupWithNavController(navController, appBarConfiguration)
    }

    private fun initBottomNav() {
        binding.bottomNavigationView.setupWithNavController(navController)
    }
}