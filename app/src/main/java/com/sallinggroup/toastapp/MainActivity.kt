package com.sallinggroup.toastapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sallinggroup.toastmessage.ToastMessage

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public fun buttonClick(view:View):Unit{
        ToastMessage.message(this,"Hello Word!")
    }
}
