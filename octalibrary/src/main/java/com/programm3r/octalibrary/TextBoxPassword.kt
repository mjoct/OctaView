package com.programm3r.octalibrary

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RelativeLayout

class TextBoxPassword: RelativeLayout, View.OnClickListener {

    private var hint: String = ""

    private lateinit var txtPassword:   EditText
    private lateinit var  btnShowText:  Button
    private lateinit var  btnClearText: Button

    constructor(context: Context) : super(context) {
        initView(context)
    }
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        initView(context)
    }
    constructor(context: Context, attrs: AttributeSet, defStyle:Int) : super(context, attrs, defStyle) {
        initView(context)
    }

    private fun initView(context: Context, attrs: AttributeSet? = null) {

        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        if (attrs != null) {
            val typedArray = context.obtainStyledAttributes(attrs, R.styleable.TextBoxPassword)

            hint = typedArray.getString(R.styleable.TextBoxPassword_hint).toString()

            txtPassword.hint = "sdfasdfdsfdsfsfsfsafsa"

            typedArray.recycle()
        }

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