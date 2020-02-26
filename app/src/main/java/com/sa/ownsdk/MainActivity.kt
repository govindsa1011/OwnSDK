package com.sa.ownsdk

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sa.mysdk.ToastUtils

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToastUtils.shortToast(this@MainActivity,0,"Show Toast")

    }
}
