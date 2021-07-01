package amel.bogor.aplikasikeempat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        login.setOnClickListener(){
            if (inputuname.text.toString() == "amelia" && inputpw.text.toString() == "1234"){
                val aa = Intent(this, MainActivity2::class.java)
                aa.putExtra("key1", inputuname.text.toString())
                startActivity(aa)
            }else if (inputuname.text.toString().isEmpty()){
                inputuname.setError("Masukkan username dahulu")
                inputuname.requestFocus()
            }else if (inputpw.text.toString().isEmpty()){
                inputpw.setError("Masukkan password dahulu")
                inputpw.requestFocus()
            }else {
                Toast.makeText(this, "Lengkapi form di atas dengan benar", Toast.LENGTH_LONG).show()
            }
        }
    }
}