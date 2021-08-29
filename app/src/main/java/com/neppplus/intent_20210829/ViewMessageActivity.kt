package com.neppplus.intent_20210829

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_message.*

class ViewMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_message)

//        화면에 들어올때 첨부된 데이터를 꺼내서 => 변수에 저장

        val receivedMessage = intent.getStringExtra("inputMessage")

//        첨부된 숫자를 꺼내서 저장 => 숫자를 꺼낼때는 첨부된게 없으면 넣어줄 기본값 작성
        val num = intent.getIntExtra("number", 0)

//        messageTxt의 text속성에 => 저장해둔 내용을 대입. (UI - set)

        messageTxt.text = receivedMessage

        numberTxt.text = num.toString()

    }
}