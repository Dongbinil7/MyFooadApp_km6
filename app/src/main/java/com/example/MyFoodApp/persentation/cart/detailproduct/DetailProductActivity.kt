package com.example.MyFoodApp.persentation.cart.detailproduct

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.MyFoodApp.databinding.ActivityDetailProductBinding

class DetailProductActivity : AppCompatActivity() {
    private val binding : ActivityDetailProductBinding by lazy{
        ActivityDetailProductBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}