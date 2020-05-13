package com.example.databindingsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.databindingsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding

    val user:User=User("Test User","Welcome")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.user=user

        binding.button.setOnClickListener {

            binding.apply {

                txtmsg.text=editText.text.toString()
                textView.visibility=View.INVISIBLE
                invalidateAll()
            }
        }
    }
}
