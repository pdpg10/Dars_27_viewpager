package com.example.dars_27_viewpager

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class NumberPagerAdapter(
    val list: List<Int>,
    fm: FragmentManager
) :
    FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int) = NumberFragment.create(position)

    override fun getCount() = list.size

    override fun getPageTitle(position: Int) = "Title-${list[position]}"

}