package com.sujeong.a3thseminar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_chat.*

class ChatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        chat_name_tv.text = intent.getStringExtra("name")
        chat_prof_img.setImageResource(intent.getIntExtra("profile",0)) //겟인트엑스트라는 디폴트값 정해줘야함(안넣어줬을때 대비)

    }
}
