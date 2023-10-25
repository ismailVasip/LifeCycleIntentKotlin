package com.example.lifycicletestkotlin

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.lifycicletestkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding :ActivityMainBinding
    private lateinit var alertDialog :AlertDialog.Builder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("ismail","onCreate - Main Activity")
    }

    override fun onStart() {
        super.onStart()
        Log.d("ismail","onStart - Main Activity")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ismail","onResume - Main Activity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("ismail","onRestart - Main Activity")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ismail","onPause - Main Activity")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ismail","onStop - Main Activity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ismail","onDestroy - Main Activity")
    }


    fun button(view : View){
        if(view.id == R.id.makeToast){
            Toast.makeText(this@MainActivity,"Main Activity",Toast.LENGTH_LONG).show()
            Log.d("ismail","Toast - Main Activity")
        }
        if(view.id == R.id.makeAlertDialog){
            alertDialog = AlertDialog.Builder(this@MainActivity)

            alertDialog.setTitle("Alert Dialog")
            alertDialog.setMessage("Main Activity")

            alertDialog.setPositiveButton("Kapat",object : DialogInterface.OnClickListener{
                override fun onClick(p0: DialogInterface?, p1: Int) {
                    Toast.makeText(this@MainActivity,"Alert Dialog Closed.",Toast.LENGTH_LONG).show()
                }

            })
            alertDialog.show()
            Log.d("ismail","Alert Dialog - Main Activity")
        }

        if(view.id == R.id.mainActivity_gotoActivitySecond){
            val intent = Intent(this@MainActivity,SecondActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}