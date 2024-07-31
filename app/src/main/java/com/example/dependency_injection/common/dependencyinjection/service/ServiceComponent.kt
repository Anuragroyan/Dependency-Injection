package com.example.dependency_injection.common.dependencyinjection.service

import dagger.Subcomponent

@Subcomponent(modules = [ServiceModule::class])
interface ServiceComponent {

}