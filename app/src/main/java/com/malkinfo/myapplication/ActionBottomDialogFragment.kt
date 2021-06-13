package com.malkinfo.myapplication

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.bottom_sheet.*
import java.lang.RuntimeException

class ActionBottomDialogFragment(private var mListener:ItemClickListener) :BottomSheetDialogFragment(), View.OnClickListener{


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bottom_sheet, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        /**now call all textView*/
        text0.setOnClickListener(this)
        text1.setOnClickListener(this)
        text2.setOnClickListener(this)
        text3.setOnClickListener(this)
    }


    override fun onClick(v: View?) {
        val tvSelected = v as TextView
        mListener.onItemClick(tvSelected.text.toString())
        dismiss()
    }

}