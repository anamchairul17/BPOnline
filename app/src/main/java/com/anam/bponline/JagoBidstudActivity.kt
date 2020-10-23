package com.anam.bponline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_jago_bidstud.*

class JagoBidstudActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jago_bidstud)

        webview_jago_bidstud.loadUrl("https://www.naufalnabila.com/bintangpelajar/jago_bidang_studi.jpg")
        webview_jago_bidstud.settings.javaScriptEnabled
        webview_jago_bidstud.settings.builtInZoomControls = true

        btnOkJago.setOnClickListener {
            startActivity(Intent(this, LoginPageActivity::class.java))
        }
    }
}