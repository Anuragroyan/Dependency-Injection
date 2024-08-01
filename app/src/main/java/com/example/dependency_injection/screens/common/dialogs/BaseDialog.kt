package com.example.dependency_injection.screens.common.dialogs

import androidx.fragment.app.DialogFragment
import com.example.dependency_injection.common.dependencyinjection.presentation.PresentationModule
import com.example.dependency_injection.screens.common.activities.BaseActivity

open class BaseDialog : DialogFragment(){
    private val presentationComponent = (requireActivity() as BaseActivity).activityComponent.newPresentationComponent(
        PresentationModule(this)
    )
    protected val injector get() = presentationComponent
}