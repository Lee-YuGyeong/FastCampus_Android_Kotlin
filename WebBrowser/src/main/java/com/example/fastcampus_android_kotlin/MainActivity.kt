package com.example.fastcampus_android_kotlin

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val goHomeButton: ImageButton by lazy {
        findViewById(R.id.goHomeButton)
    }

    private val goForwardButton: ImageButton by lazy {
        findViewById(R.id.goForwardButton)
    }

    private val goBackButton: ImageButton by lazy {
        findViewById(R.id.goBackButton)
    }

    private val addressBar: EditText by lazy {
        findViewById(R.id.addressBar)
    }

    private val webView: WebView by lazy {
        findViewById(R.id.webView)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        bindView()

    }

    override fun onBackPressed() {

        if (webView.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }

    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun initViews() {
        webView.apply {
            webViewClient = WebViewClient()
            settings.javaScriptEnabled = true
            loadUrl(DEFAULT_URL)
        }
    }

    private fun bindView() {

        goHomeButton.setOnClickListener {
            webView.loadUrl(DEFAULT_URL)
        }
        addressBar.setOnEditorActionListener { v, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE) {
                webView.loadUrl(v.text.toString())
            }

            return@setOnEditorActionListener false
        }

        goBackButton.setOnClickListener {
            webView.goBack()
        }

        goForwardButton.setOnClickListener {
            webView.goForward()
        }

    }

    companion object {
        private const val DEFAULT_URL = "http://www.google.com"
    }
}