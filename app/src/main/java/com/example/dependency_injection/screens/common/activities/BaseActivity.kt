package com.example.dependency_injection.screens.common.activities

import androidx.appcompat.app.AppCompatActivity
import com.example.dependency_injection.MyApplication
import com.example.dependency_injection.common.dependencyinjection.presentation.PresentationModule
import dagger.internal.DoubleCheck.lazy
import kotlin.lazy as lazy

open class BaseActivity: AppCompatActivity() {
    private val appComponent get() = (application as MyApplication).appComponent

    val activityComponent by lazy {
        appComponent.newActivityComponentBuilder()
            .activity(this)
            .build()
    }

    private val presentationComponent by lazy {
        activityComponent.newPresentationComponent(PresentationModule(this))
    }
    protected val injector get() = presentationComponent
}