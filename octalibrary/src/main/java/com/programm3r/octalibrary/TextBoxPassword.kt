package com.programm3r.octalibrary

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.RelativeLayout

class TextBoxPassword: RelativeLayout {

    constructor(context: Context) : super(context) {
        initializeViews(context)
    }
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        initializeViews(context)
    }
    constructor(context: Context, attrs: AttributeSet, defStyle:Int) : super(context, attrs, defStyle) {
        initializeViews(context)
    }

    private fun initializeViews(context: Context) {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.text_box_password, this)
    }

    protected override fun onFinishInflate() {
        super.onFinishInflate()
    }

}