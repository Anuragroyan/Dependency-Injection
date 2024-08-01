package com.example.dependency_injection.screens.common.viewmodels

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

abstract class SavedStateViewModel : ViewModel() {
    abstract val viewModelScope: Any

    abstract fun init(savedStateHandle: SavedStateHandle)
}