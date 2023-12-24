package com.sahin.kotlincalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sahin.kotlincalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    // değişkenleri burda tanımlamamın sebebi diğer fonksiyonlarda kullanabilmek içindir.
    var firstNumber : Double? = null
    var secondNumber : Double? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    // fun -> fonksiyonu iki değişkeni alır. null kontrolü sağlandıktan sonra işlemi ekrana yazdırır.
    // bu tüm işlemler için aynı mantıktır sadece işlemler farklıdır.
    // Toplama işlemi
    fun add(view : View){
        firstNumber = binding.firstNumber.text.toString().toDoubleOrNull()
        secondNumber = binding.secondNumber.text.toString().toDoubleOrNull()

        if(firstNumber != null && secondNumber != null){
            binding.resultText.text = "Result:${firstNumber!! + secondNumber!!}"
        }else{
            binding.resultText.text = "Please ,Enter Correctly"
        }

    }
    // Çıkarma işlemi
    fun min(view : View){
        firstNumber = binding.firstNumber.text.toString().toDoubleOrNull()
        secondNumber = binding.secondNumber.text.toString().toDoubleOrNull()

        if(firstNumber != null && secondNumber != null){
            binding.resultText.text = "Result:${firstNumber!! - secondNumber!!}"
        }else{
            binding.resultText.text = "Please ,Enter Correctly"
        }

    }
    // Çarpma işlemi
    fun multi(view : View){
        firstNumber = binding.firstNumber.text.toString().toDoubleOrNull()
        secondNumber = binding.secondNumber.text.toString().toDoubleOrNull()

        if(firstNumber != null && secondNumber != null){
            binding.resultText.text = "Result:${firstNumber!! * secondNumber!!}"
        }else{
            binding.resultText.text = "Please ,Enter Correctly"
        }

    }

    // Bölme işlemi
    fun div(view : View){
        firstNumber = binding.firstNumber.text.toString().toDoubleOrNull()
        secondNumber = binding.secondNumber.text.toString().toDoubleOrNull()

        if(firstNumber != null && secondNumber != null){
            binding.resultText.text = "Result:${firstNumber!! / secondNumber!!}"
        }else{
            binding.resultText.text = "Please ,Enter Correctly"
        }

    }
}