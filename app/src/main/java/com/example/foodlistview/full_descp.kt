package com.example.foodlistview

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class full_descp : AppCompatActivity() {

    lateinit var foodImg:ImageView
    lateinit var foodTitle:TextView
    lateinit var fullDescp:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_descp)


        foodImg=findViewById(R.id.foodImg)
        foodTitle=findViewById(R.id.foodTitle)
        fullDescp=findViewById(R.id.fullDescp)

        var name=intent.getStringExtra("name")
        var descp=intent.getStringExtra("descp")
        var image=intent.getIntExtra("image",R.drawable.fuchka)


        foodTitle.text=name
        fullDescp.text=descp
        foodImg.setImageResource(image)


        }
    }
