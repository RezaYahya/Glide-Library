package com.example.imageview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageview = findViewById<ImageView>(R.id.imageView)
        val btngg = findViewById<Button>(R.id.btn_gg)
        val btngm = findViewById<Button>(R.id.btn_gm)
        val btnnext = findViewById<Button>(R.id.btn_next)
        val text1 = findViewById<TextView>(R.id.tv_text1)

        //Untuk memanggil gambar Gudang Garam
        btngg.setOnClickListener {
            imageview.setImageResource(R.drawable.gudang_garam)
            text1.setText("Ini Adalah Gambar Gudang Garam")
        }

        btngm.setOnClickListener {
            imageview.setImageResource(R.drawable.gereja_merah)
            text1.setText("Ini Adalah Gambar Gereja Merah")
        }

        btnnext.setOnClickListener {
            val intent = Intent(this@MainActivity, GlideActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}