package com.example.dependency_injection.common.dependencyinjection.activity

import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.example.dependency_injection.screens.common.ScreensNavigator
import com.example.dependency_injection.screens.common.ScreensNavigatorImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class ActivityModule {
    @ActivityScope
    @Binds
    abstract fun screensNavigator(screensNavigatorImpl: ScreensNavigatorImpl): ScreensNavigator

    companion object {
        @Provides
        fun layoutInflater(activity: AppCompatActivity) = LayoutInflater.from(activity)

        @Provides
        fun fragmentManager(activity: AppCompatActivity) = activity.supportFragmentManager
    }
}