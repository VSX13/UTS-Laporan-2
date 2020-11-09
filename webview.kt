package com.example.profilfakultasupn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient

class webview : AppCompatActivity() {

    private var webView: WebView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)
        webView = findViewById<View>(R.id.webview) as WebView
        webView!!.webViewClient = WebViewClient()
        webView!!.loadUrl("https://www.upnjatim.ac.id/en/")
        val webSettings = webView!!.settings
        webSettings.javaScriptEnabled = true
    }

    override fun onBackPressed() {
        if (webView!!.canGoBack()) {
            webView!!.goBack()
        } else {
            super.onBackPressed()
        }
    }

}