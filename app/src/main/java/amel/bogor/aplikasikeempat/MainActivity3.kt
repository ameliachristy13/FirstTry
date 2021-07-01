package amel.bogor.aplikasikeempat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        to31.setOnClickListener(){
            startActivity(Intent(this, MainActivity::class.java))
        }

        to32.setOnClickListener(){
            startActivity(Intent(this, MainActivity2::class.java))
        }

        to34.setOnClickListener(){
            startActivity(Intent(this, MainActivity4::class.java))
        }

        to35.setOnClickListener(){
            startActivity(Intent(this, MainActivity5::class.java))
        }
    }
}