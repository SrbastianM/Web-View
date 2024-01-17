package com.srbastian.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    lateinit var webView : WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // * Well at here the application doesn't function like we mean.
        // * cuz we need to change the manifest file to give internet access to our app
        // * So we go a to change that
        webView = findViewById(R.id.web)
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://github.com/SrbastianM")
    }

        // In this part we fixed a problem that did not allow the user to go back after pressing the "Back" button.
    override fun onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}