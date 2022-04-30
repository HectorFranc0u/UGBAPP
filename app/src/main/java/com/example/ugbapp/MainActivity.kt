package com.example.ugbapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.ugbapp.packages.CalendarioFragment
import com.example.ugbapp.packages.HimnoFragment
import com.example.ugbapp.packages.NotasFragment
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.navigation.NavigationBarMenu
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val CalendarioFragment = CalendarioFragment()
    private val himnoFragment = HimnoFragment()
    private val notasFragment = NotasFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(himnoFragment)

        bottom_navigationbar.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.ic_Himno -> replaceFragment(himnoFragment)
                R.id.ic_Calendarizacion -> replaceFragment(CalendarioFragment)
                R.id.ic_PortalEstudiante -> replaceFragment(notasFragment)
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.commit()
    }
}