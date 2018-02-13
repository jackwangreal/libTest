package com.jiaoyinbrother.jiaoyinbrotherlibproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.jiaoyinbrother.jiaoyinbrotherlib.Util

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Util.testAdd(1,2)


    }
}
