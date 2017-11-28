package com.yunnex.git.logutils

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ch.qos.logback.classic.BL
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_logTest.setOnClickListener {
            test()
        }
    }

    fun test(){
        L.tag("Zero").i("wo xian zai jia le tag")
        L.i("wo xianz shi mei jia tag")
        L.tag().i("MainActivity fanzhang hahaha!!!")
        val logger = BL.getLogger(MainActivity::class.java)
        logger.i("wo shi zhi jie yong ")
        test1()
    }

    fun test1(){
        L.tag().i("test1 yong")
        L.i("test1 yong 1")
        L.tag("Zero").i("test1 yong 2")
    }

}
