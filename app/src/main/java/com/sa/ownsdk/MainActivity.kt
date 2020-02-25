package com.sa.ownsdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sa.library_module.ToastUtils

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToastUtils.shortToast(this@MainActivity,0,"Show Toast")

    }
}
