package com.example.fragmentcallbacks

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "==== onCreate ===")
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "==== onStart ===")
    }
    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "==== onResume ===")
    }
    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "==== onPause ===")
    }
    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "==== onStop ===")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "==== onDestroy ===")
    }
}