package com.example.quote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.quote.fragment.AddFragment
import com.example.quote.fragment.BerandaFragment
import com.example.quote.fragment.DashboardFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class NavigationBottom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bottom_navigation)

        val berandaFragment = BerandaFragment()
        val addFragment = AddFragment()
        val dashboardFragment = DashboardFragment()

        makeCurrentFagment (berandaFragment)

        val bottom_navigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menu_beranda -> makeCurrentFagment(berandaFragment)
                R.id.menu_add -> makeCurrentFagment(addFragment)
                R.id.menu_dashboard -> makeCurrentFagment(dashboardFragment)
            }

            true

        }

    }

    private fun makeCurrentFagment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fram_nav, fragment)
            commit()
        }
    }
}