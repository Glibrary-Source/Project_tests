package com.example.testwebview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

    lateinit var webview: WebView

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webview = findViewById(R.id.webview)
        webview.apply {
            webViewClient = WebViewClient()
            settings.javaScriptEnabled = true
        }

        webview.getSettings().setUserAgentString(System.getProperty("http.agent"))
        webview.loadUrl("http://34.64.84.69")

    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        if(webview.canGoBack()){
            webview.goBack()
        }
        else{
            finish()
        }
    }

}