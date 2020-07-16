package com.example.smarthomeiot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout

/*public class MainActivity extends AppCompatActivity*/

    class MainActivity : AppCompatActivity (){

        private lateinit var mainsceen : RelativeLayout
        private lateinit var belowbutton : RelativeLayout
        private lateinit var btnsignup : Button

        var handler = Handler()
        var runnable: Runnable = Runnable {
            mainsceen.visibility = View.VISIBLE
            belowbutton.visibility = View.VISIBLE
        }


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            mainsceen = findViewById(R.id.mainscreen)
            belowbutton = findViewById(R.id.belowbutton)
            btnsignup = findViewById(R.id.btnsignup)

            handler.postDelayed(runnable,2000) //2000 is the timeout for the splash

            btnsignup.setOnClickListener{
                val intent = Intent(this, SignUpActivity::class.java)
                startActivity(intent)
            }



        }
    }




