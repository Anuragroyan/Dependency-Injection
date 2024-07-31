package com.example.dependency_injection.common.dependencyinjection.presentation

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(MyViewModel::class)
    abstract fun myViewModel(myViewModel: MyViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(MyViewModel2::class)
    abstract fun myViewModule2(myViewModel2: MyViewModel2): ViewModel
}