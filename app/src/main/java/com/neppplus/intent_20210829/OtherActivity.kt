import com.neppplus.intent_20210829.MainActivity
import kotlinx.android.synthetic.main.activity_other.*

,package com.neppplus.intent_20210829

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

//        복귀 버튼이 눌리면 => 메인화면으로 이동

        returnToMainBtn.setOnClickListener {

//            Intent를 이용, 메인으로 이동
            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
        }

    }
}