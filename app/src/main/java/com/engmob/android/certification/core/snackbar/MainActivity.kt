package com.engmob.android.certification.core.snackbar

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        simpleSnackBar.setOnClickListener {
            Snackbar.make(simpleSnackBar, R.string.simple_snackbar, Snackbar.LENGTH_SHORT)
                .show()
        }

        snackbarAction.setOnClickListener {
            Snackbar.make(simpleSnackBar, R.string.snackbar_action, Snackbar.LENGTH_SHORT)
                .setAction(R.string.action_label) {
                    Toast.makeText(this, getString(R.string.snackbar_dismissed), Toast.LENGTH_SHORT).show()
                }
                .show()
        }

        anchoredSnackbar.setOnClickListener {
            Snackbar.make(simpleSnackBar, R.string.snackbar_action, Snackbar.LENGTH_SHORT)
                .setAction(R.string.action_label) {
                    Toast.makeText(this, getString(R.string.snackbar_dismissed), Toast.LENGTH_SHORT).show()
                }
                .setAnchorView(referenceView)
                .show()
        }
    }
}