package com.example.dependency_injection.common.dependencyinjection.app

import com.example.dependency_injection.common.dependencyinjection.activity.ActivityComponent
import com.example.dependency_injection.common.dependencyinjection.service.ServiceComponent
import com.example.dependency_injection.common.dependencyinjection.service.ServiceModule
import dagger.Component

@AppScope
@Component(modules=[AppModule::class])
interface  AppComponent {
    fun newActivityComponentBuilder(): ActivityComponent.Builder
    fun newServiceComponent(serviceModule: ServiceModule): ServiceComponent
}