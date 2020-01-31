package com.example.loginproyect

import android.content.Intent
import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import kotlin.concurrent.timerTask

class SplashActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.splash_activity)

        val timer= Timer()
        timer.schedule(timerTask {
            goToLoginActivity()
        }, 1000
        )


    }

    private fun goToLoginActivity( ){
        val intent =Intent(this,LoginActivity::class.java)
        startActivity(intent)
        finish()
    }



}

