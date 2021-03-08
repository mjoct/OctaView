package com.programm3r.octalibrary

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.RelativeLayout

class TextBoxPlain: RelativeLayout {

    constructor(context: Context) : super(context) {
        initView(context)
    }
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        initView(context)
    }
    constructor(context: Context, attrs: AttributeSet, defStyle:Int) : super(context, attrs, defStyle) {
        initView(context)
    }

    private fun initView(context: Context) {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.text_box_plain, this)
    }

    protected override fun onFinishInflate() {
        super.onFinishInflate()
    }

}