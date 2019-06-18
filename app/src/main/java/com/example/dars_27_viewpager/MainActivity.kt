package com.example.dars_27_viewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list = listOf(1, 2)

        val numberPageAdapter = NumberPagerAdapter(list, supportFragmentManager)
        view_pager.adapter = numberPageAdapter

        tab_layout.setupWithViewPager(view_pager)
    }
}
