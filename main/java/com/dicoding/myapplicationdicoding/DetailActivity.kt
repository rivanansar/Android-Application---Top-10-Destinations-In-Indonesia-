package com.dicoding.myapplicationdicoding

import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ScrollView
import android.widget.TextView
import com.bumptech.glide.Glide


class DetailActivity : AppCompatActivity() {
    private lateinit var sv : ScrollView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvDetailName = findViewById<TextView>(R.id.tv_detail_name)
        val tvDetailDescription = findViewById<TextView>(R.id.tv_detail_description)
        val imgDetailPhoto = findViewById<ImageView>(R.id.img_detail_photo)

        val dataHero : Hero? = intent.getParcelableExtra("key")

        dataHero?.let{
            tvDetailName.text = dataHero.name
            tvDetailDescription.text = dataHero.description
            Glide.with(this).load(dataHero.photo).into(imgDetailPhoto)
        }
    }
}
