package com.anam.bponline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_description_ui_itb.*

class DescriptionUiItbActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description_ui_itb)

        webview_ui_itb.loadUrl("https://www.naufalnabila.com/bintangpelajar/deskripsi_ui_itb.png")
        webview_ui_itb.settings.javaScriptEnabled
        webview_ui_itb.settings.builtInZoomControls = true

        btnOkUiItb.setOnClickListener {
            startActivity(Intent (this, LoginPageActivity::class.java) )
        }
    }
}