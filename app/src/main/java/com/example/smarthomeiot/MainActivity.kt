package com.example.smarthomeiot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.RelativeLayout
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

/*public class MainActivity extends AppCompatActivity*/

    class MainActivity : AppCompatActivity (){

   // RelativeLayout button_layout,main_screen;
  //  Handler handler = new Handler();
   // Runnable runnable = new Runnable () {

    /*    public void run(){
            button_layout.setVisibility(View.VISIBLE);
            main_screen.setVisibility(View.VISIBLE);
        }

    };*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       /* main_screen = (RelativeLayout) findViewById(R.id.main_screen);
        button_layout = (RelativeLayout) findViewById(R.id.button_layout);

            Handler().postDelayed({
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))

            finish()
        }, 2000)

        handler.postDelay(runnable, 2000); //2000 is the timeout for the  splash*/
    }
}
