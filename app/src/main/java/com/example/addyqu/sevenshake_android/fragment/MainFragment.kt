package com.example.addyqu.sevenshake_android.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.addyqu.sevenshake_android.R

class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
         val view = inflater.inflate(R.layout.fragment_main, container, false)

            return view
    }


    companion object {
        fun newInstance() : Fragment {
            val bundle = Bundle()
            val fragment = MainFragment()
            fragment.arguments = bundle
            return fragment
        }
    }

}
