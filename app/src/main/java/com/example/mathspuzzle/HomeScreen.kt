package com.example.mathspuzzle

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.app.AppCompatDelegate.*

class HomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)
        val score = intent.getStringExtra("PASSING")
        val txtHigh = findViewById<TextView>(R.id.txtHigh)
        val sharedPref = getSharedPreferences("PREF", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        val btntheme: Button = findViewById(R.id.btntheme)

        val appSettingPrefs: SharedPreferences = getSharedPreferences("AppSettingPrefs", 0)
        val sharedPrefsEdit: SharedPreferences.Editor = appSettingPrefs.edit()
        val isNightModeOn: Boolean = appSettingPrefs.getBoolean("NightMode", false)

        if (isNightModeOn){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            btntheme.text = "Enable Light Mode"
        }
        else{
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            btntheme.text = "Enable Dark Mode"
        }

        btntheme.setOnClickListener {
            if (isNightModeOn){
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                sharedPrefsEdit.putBoolean("NightMode", false)
                sharedPrefsEdit.apply()
                btntheme.text = "Enable Light Mode"
            }
            else{
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                sharedPrefsEdit.putBoolean("NightMode", true)
                sharedPrefsEdit.apply()
                btntheme.text = "Enable Dark Mode"
            }
        }

        if (score != null){
            txtHigh.text = "High score = " + score
            editor.apply {
                putString("SCORE", score)
                apply()
            }
        }
        else {
            val scoreSaved = sharedPref.getString("SCORE", "0")
            txtHigh.text = "High score = " + scoreSaved
        }
        val homeBtn = findViewById<Button>(R.id.homebtn)
        homeBtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val actionBar = supportActionBar
        if (actionBar != null){
            actionBar.title = "Maths Puzzle - Home Screen"
        }
    }
}