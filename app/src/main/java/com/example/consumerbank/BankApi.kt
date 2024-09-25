package com.example.consumerbank

import retrofit2.Response
import retrofit2.http.GET

interface BankApi {
    @GET("/api/banks/v1/1") //aqui tem q colocar um objeto expecifico -> /api/banks/v1/{code}
    suspend fun getBanks() : Response<Bank>
}
//11- cola esses codigos e da enter no @GET e response para dar imports
//12- instrucoes mainactivity
