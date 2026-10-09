package com.example.tp1

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNext = findViewById<Button>(R.id.btnNext)

        btnNext.setOnClickListener {
            Toast.makeText(this, "Bonjour SALIM !", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        Log.d("LIFECYCLE", "onCreate appelé")
    }

    override fun onStart() {
        super.onStart()
        Log.d("LIFECYCLE", "onStart appelé")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LIFECYCLE", "onResume appelé")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LIFECYCLE", "onPause appelé")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LIFECYCLE", "onStop appelé")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LIFECYCLE", "onRestart appelé")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LIFECYCLE", "onDestroy appelé")
    }
}