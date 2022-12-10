package com.hashinology.countercalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.hashinology.countercalc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.lifecycleOwner = this

        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.tvCount.setOnClickListener{
            viewModel.incerement()
        }

        viewModel.getNumber.observe(this, Observer { counter ->
            binding.tvCount.text = counter.toString()
        })
    }
}