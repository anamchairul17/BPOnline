package com.anam.bponline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvProgramPacket.setOnClickListener {
            startActivity(Intent(this, LoginPageActivity::class.java))
        }

        slideUiItb.setOnClickListener {
            startActivity( Intent(this, DescriptionUiItbActivity::class.java)
            )
        }
        slideGetPTN.setOnClickListener {
            startActivity( Intent(this, SuksesTembusPtnActivity::class.java)
            )
        }
        slideAKM11.setOnClickListener {
            startActivity( Intent(this, AkmSmaActivity::class.java)
            )
        }
        slideMasterStudy.setOnClickListener {
            startActivity( Intent(this, JagoBidstudActivity::class.java)
            )
        }
        slideNextSchool.setOnClickListener {
            startActivity( Intent(this, SeklanFavActivity::class.java)
            )
        }
        slidAKM48.setOnClickListener {
            startActivity( Intent(this, SuksesAkmSdActivity::class.java)
            )
        }


    }
}