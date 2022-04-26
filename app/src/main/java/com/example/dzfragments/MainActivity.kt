package com.example.dzfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import com.example.dzfragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bind: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)
        openFrag()
    }
    private fun openFrag(){
        supportFragmentManager
            .beginTransaction()
            .add(R.id.sndr_frag, SenderFragment())
            .commit()
    }
}