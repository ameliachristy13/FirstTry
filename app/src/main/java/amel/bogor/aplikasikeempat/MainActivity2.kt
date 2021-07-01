package amel.bogor.aplikasikeempat

import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import java.util.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val ab = intent.extras?.getString("key1")

        if (ab.isNullOrEmpty()){
            outputuname.setText("ysyd" )
            Toast.makeText(this,"Kosong", Toast.LENGTH_LONG).show()
        }else {
//            val ab = intent.extras!!.getString("key1")
            outputuname.text = ab
            Toast.makeText(this,"Welcome $ab", Toast.LENGTH_LONG).show()
        }

        val calendar = Calendar.getInstance()
        val time = calendar.get(Calendar.HOUR_OF_DAY)

        if (time >= 0 && time <= 10){
            greetings.text = "Good morning"
        }else if (time >= 11 && time <= 16){
            greetings.text = "Good afternoon"
        }else if (time >= 17 && time <=19){
            greetings.text = "Good evening"
        }else {
            greetings.text = "Good night"
        }

        news.setOnClickListener(){
            startActivity(Intent(this, MainActivity6::class.java))
        }

        about.setOnClickListener(){
            startActivity(Intent(this, MainActivity7::class.java))
        }

        logout.setOnClickListener(){
            val a = AlertDialog.Builder(this)
            a.setTitle("Logout Warning")
            a.setMessage("Are you sure to leave the app?")
            a.setPositiveButton("Yes", DialogInterface.OnClickListener(){dialog: DialogInterface?, which: Int ->
                finishAffinity()
            })
            a.setNegativeButton("No", DialogInterface.OnClickListener(){dialog: DialogInterface?, which: Int ->
                Toast.makeText(this, "Cancel to leave the app", Toast.LENGTH_LONG).show()
            })
                .show()
        }







        to21.setOnClickListener(){
            startActivity(Intent(this, MainActivity::class.java))
        }

        to23.setOnClickListener(){
            startActivity(Intent(this, MainActivity3::class.java))
        }

        to24.setOnClickListener(){
            startActivity(Intent(this, MainActivity4::class.java))
        }

        to25.setOnClickListener(){
            startActivity(Intent(this, MainActivity5::class.java))
        }




    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_activity2, menu)
        return true
    }
}