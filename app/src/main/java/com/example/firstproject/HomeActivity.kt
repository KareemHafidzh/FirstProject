package com.example.firstproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)

        val datasGambar = arrayOf("https://www.google.com/url?sa=i&url=https%3A%2F%2Fhdqwalls.com%2Fwallpaper%2F1366x768%2Fsaber-fate-apocrypha&psig=AOvVaw0670j8K1cE9UlGDjUTLAF5&ust=1633577990560000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCJCMt7HutPMCFQAAAAAdAAAAABAJ",
                                    "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.wallpapermaiden.com%2Fwallpaper%2F30714%2Fsword-art-online-alicization-alice-schuberg-eyepatch-armor-blonde-cape&psig=AOvVaw26Pdpm_-C1d7TzmaupBC7J&ust=1633578086122000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCKiwyN7utPMCFQAAAAAdAAAAABAE")

        val datasJudul = arrayOf("saber","alice")
        val datasBuyer = arrayOf("1.000","2.000")

        val rvItem : RecyclerView = findViewById(R.id.rv_item)
        rvItem.adapter = AdaptorRecyclerView(this, datasGambar, datasJudul, datasBuyer)
        rvItem.layoutManager = LinearLayoutManager(this)
        rvItem.setHasFixedSize(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.activity_home, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.bahasa -> {
                Toast.makeText(this, "pengaturan bahasa", Toast.LENGTH_SHORT).show()
                return true

            }
            R.id.tampilan -> {
                Toast.makeText(this, "pengaturan Tampilan", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.Logout -> {
                startActivity(Intent(this, LoginActivity::class.java))
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}