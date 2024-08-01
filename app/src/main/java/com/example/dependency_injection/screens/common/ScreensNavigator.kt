package com.example.dependency_injection.screens.common

interface ScreensNavigator {
    fun toQuestionDetails(questionId: String)
    fun toViewModel()
    fun navigateBack()
}