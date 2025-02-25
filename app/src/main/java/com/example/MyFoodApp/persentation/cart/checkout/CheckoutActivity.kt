package com.example.MyFoodApp.persentation.cart.checkout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.MyFoodApp.databinding.ActivityCheckoutBinding

class CheckoutActivity : AppCompatActivity() {

    private val binding : ActivityCheckoutBinding by lazy{
        ActivityCheckoutBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}