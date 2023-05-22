package org.sco.composecoordinator

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import com.google.android.material.appbar.CollapsingToolbarLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        val collapsingToolbar = findViewById<CollapsingToolbarLayout>(R.id.collapsing_toolbar_layout)
        collapsingToolbar.title = "Test Title"
        collapsingToolbar.setContentScrimColor(Color.GREEN)

        val fragment = ScrollingComposeFragment()
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment_container, fragment)
        fragmentTransaction.commit()
    }

}

