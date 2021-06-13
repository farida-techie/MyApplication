package com.malkinfo.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_one.*

class FragmentOne : Fragment(),ItemClickListener {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn.setOnClickListener { openBottomSheet() }
    }
    fun openBottomSheet(){
        val addPhotoBottomDialogFragment = ActionBottom.newInstance(this)
        addPhotoBottomDialogFragment.show(
            childFragmentManager,ActionBottom.TAG
        )
    }

    override fun onItemClick(item: String?) {
        showItems.text = "Selected action Item is $item"
    }


}