package com.anam.bponline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sukses_akm_sd.*

class SuksesAkmSdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sukses_akm_sd)
        webview_akm_sd.loadUrl("https://naufalnabila.com/bintangpelajar/sukses_akm_4.jpg")
        webview_akm_sd.settings.javaScriptEnabled
        webview_akm_sd.settings.builtInZoomControls = true

        btnOkAkmSd.setOnClickListener {
            startActivity(Intent(this, LoginPageActivity::class.java))
        }
    }
}