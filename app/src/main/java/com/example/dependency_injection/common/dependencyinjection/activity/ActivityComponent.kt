package com.example.dependency_injection.common.dependencyinjection.activity

import androidx.appcompat.app.AppCompatActivity
import com.example.dependency_injection.common.dependencyinjection.presentation.PresentationComponent
import com.example.dependency_injection.common.dependencyinjection.presentation.PresentationModule
import dagger.BindsInstance
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules=[ActivityModule::class])
interface ActivityComponent {
    fun newPresentationComponent(presentationModule: PresentationModule): PresentationComponent
    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        fun activity(activity: AppCompatActivity): Builder
        fun build(): ActivityComponent
    }
}