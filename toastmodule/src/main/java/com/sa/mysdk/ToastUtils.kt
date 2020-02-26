package com.sa.mysdk

import android.content.Context
import android.widget.Toast

object ToastUtils {
    fun shortToast(content : Context, stringCode : Int = 0, stringText : String? = null) {
        if (stringCode != 0) {
            Toast.makeText(content, content.getText(stringCode), Toast.LENGTH_SHORT).show()
        } else if (stringText != null) {
            Toast.makeText(content, stringText, Toast.LENGTH_SHORT).show()
        }
    }

    fun longToast(context : Context?, stringCode : Int = 0, stringText : String? = null) {
        if (stringCode != 0) {
            Toast.makeText(context, context?.getText(stringCode), Toast.LENGTH_LONG).show()
        } else if (stringText != null) {
            Toast.makeText(context, stringText, Toast.LENGTH_LONG).show()
        }
    }
}