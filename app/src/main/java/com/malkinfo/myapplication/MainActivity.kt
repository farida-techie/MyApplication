package com.malkinfo.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentOne = FragmentOne()
        var tr = supportFragmentManager.beginTransaction()
                tr.replace(R.id.maiTherd,fragmentOne)
                        .commit()

    }
}