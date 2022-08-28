package com.example.a20012011079_bhavyapatel_practical2_mad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val TAG ="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate called")
    }

    fun showMessage(msg:String){
        Log.i(TAG,msg)
        Toast.makeText(this,msg, Toast.LENGTH_SHORT).show()
        Snackbar.make(findViewById(R.id.snackbarDisplay),msg,Snackbar.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        showMessage("onRestart called")
        super.onRestart()
    }

    override fun onResume() {
        showMessage("onResume called")
        super.onResume()
    }

    override fun onStart() {
        showMessage("onStart called")
        super.onStart()
    }

    override fun onStop() {
        showMessage("onStop called")
        super.onStop()
    }

    override fun onDestroy() {
        showMessage("onDestroy called")
        super.onDestroy()
    }
}