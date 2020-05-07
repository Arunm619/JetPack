package io.arunbuilds.jetpack

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var titleText: TextView
    lateinit var titleEditText: EditText
    lateinit var submitButton: Button
    lateinit var parentView: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        submitButton.setOnClickListener {
            if (titleEditText.text.isNullOrEmpty()) {
                Snackbar.make(parentView, "Please enter a valid title", Snackbar.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }
            titleText.text = titleEditText.text
        }
    }

    private fun initViews() {
        titleText = findViewById(R.id.title_text)
        titleEditText = findViewById(R.id.title_edit_text)
        submitButton = findViewById(R.id.submit_button)
        parentView = findViewById(android.R.id.content)
    }
}