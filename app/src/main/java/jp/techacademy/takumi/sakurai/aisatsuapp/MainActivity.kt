package jp.techacademy.takumi.sakurai.aisatsuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.TimePickerDialog
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            showAisatsu()
        }
    }

    private fun showAisatsu() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                var greeting: String

                if(1 < hour && hour < 10){
                    greeting = "「おはよう」"
                }else if( 10 <= hour && hour < 18 ){
                    greeting = "「こんにちは」"
                }else{
                    greeting = "「こんばんは」"
                }

                textView.text = greeting
            },
            13, 0, true)
        timePickerDialog.show()
    }

}