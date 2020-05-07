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
        binding.submitButton.setOnClickListener {
            val student = getRandomPerson()
            bindPersonIntoViews(student)
        }
    }

    private fun bindPersonIntoViews(student: Person) {
        binding.apply {
            nameTextView.text = student.name
            ageTextView.text = student.age.toString()
        }
    }

}