package com.example.dependency_injection.screens.common

import androidx.appcompat.app.AppCompatActivity
import com.example.dependency_injection.screens.questiondetails.QuestionDetailsActivity
import com.example.dependency_injection.screens.viewmodel.ViewModelActivity
import javax.inject.Inject

abstract class ScreensNavigatorImpl  @Inject constructor(private val activity: AppCompatActivity): ScreensNavigator {
    override fun navigatorBack() {
        activity.onBackPressed()
    }

    override fun toQuestionDetails(questionId: String) {
        QuestionDetailsActivity.start(activity, questionId)
    }

    override fun toViewModel() {
        ViewModelActivity.start(activity)
    }
}