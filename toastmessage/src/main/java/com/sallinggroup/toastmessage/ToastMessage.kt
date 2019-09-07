package com.sallinggroup.toastmessage

import android.content.Context
import android.widget.Toast

public class ToastMessage{
    companion object{
        fun message(context:Context,message:String):Unit{
            Toast.makeText(context,message,Toast.LENGTH_SHORT).show()
        }
    }
}