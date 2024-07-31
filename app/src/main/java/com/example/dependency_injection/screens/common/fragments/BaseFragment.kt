package com.example.dependency_injection.screens.common.fragments

import androidx.fragment.app.Fragment
import com.example.dependency_injection.common.dependencyinjection.presentation.PresentationModule
import com.example.dependency_injection.screens.common.activities.BaseActivity
import kotlin.reflect.KProperty

open class BaseFragment : Fragment(){
    private val presentationComponent by lazy {
        (requireActivity() as BaseActivity).activityComponent.newPresentationComponent(PresentationModule(this))
    }
    protected val injector get() = presentationComponent
}

private operator fun Any.getValue(baseFragment: BaseFragment, property: KProperty<*>) {
}

