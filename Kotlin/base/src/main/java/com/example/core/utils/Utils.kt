package com.example.core.utils

import android.content.res.Resources
import android.util.TypedValue
import kotlin.jvm.JvmOverloads
import android.widget.Toast
import com.example.core.BaseApplication

private val displayMetrics = Resources.getSystem().displayMetrics

fun Float.dp2px(): Float {
    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, this, displayMetrics)
}

object Utils {
    @JvmOverloads
    fun toast(string: String?, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(BaseApplication.currentApplication, string, duration).show()
    }
}