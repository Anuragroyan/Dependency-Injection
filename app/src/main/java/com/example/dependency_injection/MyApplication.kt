package com.example.dependency_injection

import android.app.Application

class MyApplication: Application() {
    public val appComponent: AppComponent by lazy {
        DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .build()
    }

    override fun onCreate() {
        super.onCreate()
    }
}