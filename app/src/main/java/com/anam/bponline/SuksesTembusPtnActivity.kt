package com.anam.bponline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sukses_tembus_ptn.*

class SuksesTembusPtnActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sukses_tembus_ptn)

        webview_tembus_ptn.loadUrl("https://www.naufalnabila.com/bintangpelajar/sukses_tembus_ptn.jpg")
        webview_tembus_ptn.settings.javaScriptEnabled
        webview_tembus_ptn.settings.builtInZoomControls = true

        btnOkPtn.setOnClickListener {
            startActivity(Intent(this, LoginPageActivity::class.java))
        }
    }
}