package org.d3if3102.tubes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.d3if3102.tubes.databinding.ActivityTambahTransaksiBinding

class TambahTransaksiActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTambahTransaksiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTambahTransaksiBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}