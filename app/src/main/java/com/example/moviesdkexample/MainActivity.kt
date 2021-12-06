package com.example.moviesdkexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.msdk.RandomMovie

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val x = RandomMovie.get()

        findViewById<TextView>(R.id.mainText).text = x.id.toString() + " " +x.name.toString()
    }
}