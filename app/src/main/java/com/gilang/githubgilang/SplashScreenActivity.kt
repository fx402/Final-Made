package com.gilang.githubgilang

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        supportActionBar!!.hide()
        Handler().postDelayed(Runnable { //setelah loading maka akan langsung berpindah ke home activity
            val home = Intent(this, MainActivity::class.java)
            startActivity(home)
            finish()
        }, Companion.waktu_loading)
    }

    companion object {
        private const val waktu_loading = 4000L
    }
}