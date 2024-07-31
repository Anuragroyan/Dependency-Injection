package com.example.dependency_injection.common.dependencyinjection.activity

import androidx.appcompat.app.AppCompatActivity

@ActivityScope
@Subcomponent(modules=[ActivityModule::class])
interface ActivityComponent {
    fun newPresentationComponent(presentationModule: PresentationModule): PresentationComponent
    @Subcomponent.Builder
    interface Builder {
        @BindsInstance fun activity(activity: AppCompatActivity): Builder
        fun build(): ActivityComponent
    }
}