package com.example.dependency_injection.screens.common.dialogs

import androidx.fragment.app.FragmentManager
import javax.inject.Inject

class DialogNavigator @Inject constructor(private val fragmentManager: FragmentManager){
    fun showServerErrorDialog() {
       fragmentManager.beginTransaction()
           .add(ServerErrorDialogFragment.newInstance(), null)
           .commitAllowingStateLoss()
    }
}