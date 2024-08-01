package com.example.dependency_injection.common.dependencyinjection.service

import android.content.Context
import dagger.Module
import dagger.Provides
import android.app.Service

@Module
class ServiceModule(
    private val service: Service
){
    @Provides
    fun context(): Context = service
}