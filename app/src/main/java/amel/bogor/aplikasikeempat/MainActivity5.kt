package amel.bogor.aplikasikeempat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.activity_main5.*

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        to51.setOnClickListener(){
            startActivity(Intent(this, MainActivity::class.java))
        }

        to52.setOnClickListener(){
            startActivity(Intent(this, MainActivity2::class.java))
        }

        to53.setOnClickListener(){
            startActivity(Intent(this, MainActivity3::class.java))
        }

        to54.setOnClickListener(){
            startActivity(Intent(this, MainActivity4::class.java))
        }
    }
}