package com.anam.bponline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_seklan_fav.*

class SeklanFavActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seklan_fav)

        webview_seklan_fav.loadUrl("https://www.naufalnabila.com/bintangpelajar/Screenshot_20201019-141320.jpg")
        webview_seklan_fav.settings.javaScriptEnabled
        webview_seklan_fav.settings.builtInZoomControls = true

        btnOkSeklanFav.setOnClickListener {
            startActivity(Intent(this, LoginPageActivity::class.java))
        }
    }
}