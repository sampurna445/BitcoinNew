package com.example.coincap.data.remote

import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiDetails {

    /*val client = OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        })
        .build()
*/
    const val BASE_URL_Assets = "https://api.coincap.io/v2/assets/"
    const val BASE_URL = "https://api.coincap.io"
    /*fun getInstance(): Retrofit =
        Retrofit.Builder()      //its pattern that helps build an object with different properties
            .baseUrl(BASE_URL_Assets)  // setting the common BASE url for all
            .addConverterFactory(GsonConverterFactory.create(Gson()))    //Convert your JSON data to Data class
            .client(client)
            .build()     // finalize the object/builder
*/

    const val BASE_URL_Rates = "https://api.coincap.io/v2/rates/"

   /* fun getRates(): Retrofit =
        Retrofit.Builder()      //its pattern that helps build an object with different properties
            .baseUrl(BASE_URL_Rates)  // setting the common BASE url for all
            .addConverterFactory(GsonConverterFactory.create(Gson()))    //Convert your JSON data to Data class
            .client(client)
            .build()     // finalize the object/builder
*/

    const val BASE_URL_Exchanges = "https://api.coincap.io/v2/exchanges/"

   /* fun getExchanges(): Retrofit =
        Retrofit.Builder()      //its pattern that helps build an object with different properties
            .baseUrl(BASE_URL_Exchanges)  // setting the common BASE url for all
            .addConverterFactory(GsonConverterFactory.create(Gson()))    //Convert your JSON data to Data class
            .client(client)
            .build()     // finalize the object/builder
*/
    const val BASE_URL_Markets = "https://api.coincap.io/v2/markets/"

   /* fun getMarkets(): Retrofit =
        Retrofit.Builder()      //its pattern that helps build an object with different properties
            .baseUrl(BASE_URL_Markets)  // setting the common BASE url for all
            .addConverterFactory(GsonConverterFactory.create(Gson()))    //Convert your JSON data to Data class
            .client(client)
            .build() */    // finalize the object/builder
}