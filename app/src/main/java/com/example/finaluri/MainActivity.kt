package com.example.finaluri

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this@MainActivity, "Firebase is connected", Toast.LENGTH_LONG).show()

        val explore = findViewById<Button>(R.id.nextButton)

        explore.setOnClickListener({
            val nextpage = Intent(this, activity2::class.java)
            startActivity(nextpage);

        })


    }
}