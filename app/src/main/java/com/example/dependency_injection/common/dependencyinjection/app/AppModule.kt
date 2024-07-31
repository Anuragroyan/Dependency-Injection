package com.example.dependency_injection.common.dependencyinjection.app

import android.app.Application
import com.example.dependency_injection.common.dependencyinjection.Retrofit1
import com.example.dependency_injection.common.dependencyinjection.Retrofit2
import com.example.dependency_injection.networking.StackoverflowApi
import com.example.dependency_injection.networking.UrlProvider
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class AppModule(val application: Application) {

    @Provides
    @AppScope
    @Retrofit1
    fun retrofit(urlProvider: UrlProvider): Retrofit {
        return Retrofit.Builder()
            .baseUrl(urlProvider.getBaseUrl1())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @AppScope
    @Retrofit2
    fun retrofit2(urlProvider: UrlProvider): Retrofit {
        return Retrofit.Builder()
            .baseUrl(urlProvider.getBaseUrl2())
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }

    @AppScope
    @Provides
    fun urlProvider() = UrlProvider()

    @Provides
    fun application() = application

    @Provides
    @AppScope
    fun stackoverflowApi(@Retrofit1 retrofit: Retrofit) = retrofit.create(StackoverflowApi::class.java)
}


