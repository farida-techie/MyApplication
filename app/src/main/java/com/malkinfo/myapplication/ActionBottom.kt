package com.malkinfo.myapplication

class ActionBottom{
    companion object{
        const val TAG = "ActionBottomDialog"
        fun newInstance(mListener:ItemClickListener):ActionBottomDialogFragment{

            return ActionBottomDialogFragment(mListener)
        }
    }

}