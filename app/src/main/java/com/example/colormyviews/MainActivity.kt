package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.colormyviews.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {

        //vì ta set cùng 1 setListeners cho mỗi view nên ta dùng List<View>
        val clickableViews: List<View> =
            listOf (boxOneText, boxTwoText, boxThreeText, boxFourText, boxFiveText,
                redButton, greenButton, yellowButton)

        for (item in clickableViews){
            item.setOnClickListener{makeColored(it)}
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {
            // Boxes using Color class colors for background
            R.id.boxOneText -> view.setBackgroundColor(Color.DKGRAY)
            R.id.boxTwoText -> view.setBackgroundColor(Color.GRAY)

// Boxes using Android color resources for background
            R.id.boxThreeText -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.boxFourText -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.boxFiveText -> view.setBackgroundResource(android.R.color.holo_green_light)

            R.id.redButton -> view.setBackgroundResource(R.color.my_red)
            R.id.greenButton -> view.setBackgroundResource(R.color.my_green)
            R.id.yellowButton -> view.setBackgroundResource(R.color.my_yellow)

        }

    }


}