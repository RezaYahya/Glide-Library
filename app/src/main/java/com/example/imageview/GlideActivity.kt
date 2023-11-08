package com.example.imageview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.RoundedCorner
import android.widget.Button
import android.widget.ImageView
import com.airbnb.lottie.model.content.RoundedCorners
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy

class GlideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_glide)

        //Inisialisasi ID
        val lavimage = findViewById<ImageView>(R.id.lav_image)
        val btnsearch = findViewById<Button>(R.id.btn_search)
        val btnback = findViewById<Button>(R.id.btn_back)

        //URL gambar yang digunakan
        val url = "https://picsum.photos/200"

        //Fungsi ketika button di klik
        btnsearch.setOnClickListener {
            Glide.with(this)
                //Untuk ambil dari URL ataupun bisa dari drawable
                .load(url)
                //Untuk Menampilkan gambar sementara ketika mencari gambar
                .placeholder(R.drawable.search)
                //Gambar untuk mengetahui Error
                .error(R.drawable.error)
                .skipMemoryCache(true)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                //id dari gambarnya
                .into(lavimage)
        }

        btnback.setOnClickListener {
            val intent = Intent(this@GlideActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}