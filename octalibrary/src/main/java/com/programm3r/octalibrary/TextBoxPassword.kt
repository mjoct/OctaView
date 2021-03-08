package com.programm3r.octalibrary

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RelativeLayout

class TextBoxPassword: RelativeLayout, View.OnClickListener {

    private lateinit var txtPassword:   EditText
    private lateinit var  btnShowText:  Button
    private lateinit var  btnClearText: Button


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

        txtPassword = findViewById<EditText>(R.id.txtPassword)
        btnShowText = findViewById<Button>(R.id.btnShowText)
        btnClearText = findViewById<Button>(R.id.btnClearText)

        btnShowText.setOnClickListener(this)
        btnClearText.setOnClickListener(this)

    }

    protected override fun onFinishInflate() {
        super.onFinishInflate()
    }

    override fun onClick(view: View?) {

        when (view?.id) {

            R.id.btnShowText -> {

            }

            R.id.btnClearText -> {

                txtPassword.setText("")

            }

        }


    }


}