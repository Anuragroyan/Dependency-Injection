package com.example.dependency_injection.common.dependencyinjection.service

import android.content.Context
import dagger.Module
import dagger.Provides
import java.security.Provider.Service

@Module
class ServiceModule(
    private val service: Service
){
    @Provides
    fun context(): Service = service
}