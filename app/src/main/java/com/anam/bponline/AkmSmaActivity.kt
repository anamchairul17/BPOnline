package com.anam.bponline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_akm_sma_activity.*

class AkmSmaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_akm_sma_activity)

        webview_akm_sma.loadUrl("https://www.naufalnabila.com/bintangpelajar/suukses_akm_11.jpg")
        webview_akm_sma.settings.javaScriptEnabled
        webview_akm_sma.settings.builtInZoomControls  = true

        btnOkAkmSma.setOnClickListener {
            startActivity(Intent(this, LoginPageActivity::class.java))
        }
    }
}