package com.example.dependency_injection.common.service

import android.app.Service
import com.example.dependency_injection.MyApplication
import com.example.dependency_injection.common.dependencyinjection.service.ServiceModule

abstract class BaseService : Service(){
    private val appComponent get() = (application as MyApplication).appComponent
    val serviceComponent = appComponent.newServiceComponent(ServiceModule(this))
}