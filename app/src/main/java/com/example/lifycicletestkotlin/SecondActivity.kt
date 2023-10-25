package com.example.lifycicletestkotlin

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.lifycicletestkotlin.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding :ActivitySecondBinding
    private lateinit var alertDialog :AlertDialog.Builder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("ismail","onCreate - Activity Second")
    }

    fun button(view: View) {
        if(view.id == R.id.makeToast){
            Toast.makeText(this@SecondActivity,"Second Activity", Toast.LENGTH_LONG).show()
            Log.d("ismail","Toast - Activity Second")
        }
        if(view.id == R.id.makeAlertDialog){
            alertDialog = AlertDialog.Builder(this@SecondActivity)

            alertDialog.setTitle("Alert Dialog")
            alertDialog.setMessage("Second Activity")

            alertDialog.setPositiveButton("Kapat",object : DialogInterface.OnClickListener{
                override fun onClick(p0: DialogInterface?, p1: Int) {
                    Toast.makeText(this@SecondActivity,"Alert Dialog Closed.", Toast.LENGTH_LONG).show()
                }

            })
            alertDialog.show()
            Log.d("ismail","Alert Dialog - Activity Second")
        }

        if(view.id == R.id.secondActivity_gotoActivityMain){
            val intent = Intent(this@SecondActivity,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("ismail","onStart - Activity Second")
    }

    override fun onResume() {
        super.onResume()
        Log.d("ismail","onResume - Activity Second")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("ismail","onRestart - Activity Second")
    }

    override fun onPause() {
        super.onPause()
        Log.d("ismail","onPause - Activity Second")
    }

    override fun onStop() {
        super.onStop()
        Log.d("ismail","onStop - Activity Second")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("ismail","onDestroy - Activity Second")
    }
}