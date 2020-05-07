package io.arunbuilds.jetpack

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.google.android.material.snackbar.Snackbar
import io.arunbuilds.jetpack.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.apply {
            submitButton.setOnClickListener {
                if (titleEditText.text.isNullOrEmpty()) {
                    Snackbar.make(binding.root, "Please enter a valid title", Snackbar.LENGTH_SHORT)
                        .show()
                    return@setOnClickListener
                }
                titleText.text = titleEditText.text
            }
        }
    }

}