package amel.bogor.aplikasikeempat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.activity_main4.*

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        to41.setOnClickListener(){
            startActivity(Intent(this, MainActivity::class.java))
        }

        to42.setOnClickListener(){
            startActivity(Intent(this, MainActivity2::class.java))
        }

        to43.setOnClickListener(){
            startActivity(Intent(this, MainActivity3::class.java))
        }

        to45.setOnClickListener(){
            startActivity(Intent(this, MainActivity5::class.java))
        }
    }
}