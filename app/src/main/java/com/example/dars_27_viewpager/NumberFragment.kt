package com.example.dars_27_viewpager


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_number.*

private const val KEY = "KEY"

class NumberFragment : Fragment() {
    private var num: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        num = arguments?.getInt(KEY, 0) ?: 0
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_number, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv.text = "$num"
    }

    companion object {
        fun create(num: Int): NumberFragment {
            val fr = NumberFragment()
            val bundle = Bundle()
            bundle.putInt(KEY, num)
            fr.arguments = bundle
            return fr
        }
    }

}
