package amel.bogor.aplikasikeempat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main6.*

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        wikipedia.loadUrl("https://en.wikipedia.org/wiki/Main_Page")
        wikipedia.webViewClient=object :WebViewClient(){
        }


    }
}