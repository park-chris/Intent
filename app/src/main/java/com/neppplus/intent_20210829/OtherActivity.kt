package com.neppplus.intent_20210829

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        returnToMainBtn.setOnClickListener {

//            Intent를 이용, 메인으로 이동
            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)

//            현재화면 종료
            finish()
        }

    }
}