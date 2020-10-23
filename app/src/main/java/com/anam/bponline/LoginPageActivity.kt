package com.anam.bponline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login_page.*

class LoginPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)

        tv_signup.setOnClickListener {
            startActivity(Intent(this, SignUpPageActivity::class.java)
            )
        }
    }
}