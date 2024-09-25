package com.example.consumerbank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bankApi = RetrofitHelper.getInstance().create(BankApi::class.java)
        // iniciando uma nova coroutine
        MainScope().launch{
            val result = bankApi.getBanks()
            if(result != null)
                Log.d("Retorno da API: ", result.body().toString())
        }
    }
}
//1- instrucoes build.gradle

//6- botao direito no com.example / new / kotlin class file / tipo data class / nome bank, instrucoes lá

//9- botao direito no com.example /new / kotlin class file / tipo interface / nome BankApi
//10- instrucoes bankapi

//13- botao direito no com.example / new / kotlin class file / tipo object / nome RetrofitHelper
//14- instrucoes retrofithelper

//17- colar esses codigos na classe oncreate e dar enter para imports
//18- na pasta manifests colar a permissao:
// <uses-permission android:name="android.permission.INTERNET"></uses-permission>
