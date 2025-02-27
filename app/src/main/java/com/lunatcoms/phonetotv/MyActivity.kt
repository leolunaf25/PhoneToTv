package com.lunatcoms.phonetotv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.google.android.gms.cast.framework.CastContext

class MyActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val castContext = CastContext.getSharedInstance(this)
    }
}