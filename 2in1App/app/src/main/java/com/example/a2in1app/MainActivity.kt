package com.example.a2in1app

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnNumberGame:Button
    lateinit var btnPhraseGame:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnNumberGame = findViewById(R.id.btn1)
        btnPhraseGame = findViewById(R.id.btn2)

        btnNumberGame.setOnClickListener {
            startGame(NumbersGame())
        }
        btnPhraseGame.setOnClickListener {
            startGame(PhraseGame())
        }

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }
    private fun startGame(activity: Activity){
        val intent = Intent(this, activity::class.java)
        startActivity(intent)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.mnu_numgame -> {
                startGame(NumbersGame())
                return true
            }
            R.id.mnu_phgame -> {
                startGame(PhraseGame())
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

}