package org.d3if3102.tubes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.d3if3102.tubes.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setMenuBar()
    }

    private fun setMenuBar() {
        binding.bottomMenubar.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.transaksi -> {
                    true
                }

                R.id.akun -> {
                    true
                }

                else -> false
            }
        }
    }
}