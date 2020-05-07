package io.arunbuilds.jetpack

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import io.arunbuilds.jetpack.databinding.ActivityMainBinding
import io.arunbuilds.jetpack.model.Person
import io.arunbuilds.jetpack.model.getRandomPerson

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.person = getRandomPerson()
        binding.submitButton.setOnClickListener {
            val student = getRandomPerson()
            binding.person = student
        }
    }

}