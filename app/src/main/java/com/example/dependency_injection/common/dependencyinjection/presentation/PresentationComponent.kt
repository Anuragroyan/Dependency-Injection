package com.example.dependency_injection.common.dependencyinjection.presentation

import com.example.dependency_injection.screens.questiondetails.QuestionDetailsActivity
import com.example.dependency_injection.screens.questionslist.QuestionsListActivity
import com.example.dependency_injection.screens.questionslist.QuestionsListFragment
import com.example.dependency_injection.screens.viewmodel.ViewModelActivity
import dagger.Subcomponent

@PresentationScope
@Subcomponent(modules=[PresentationModule::class, ViewModelModule::class])
interface PresentationComponent {
    fun inject(fragment: QuestionsListFragment)
    fun inject(activity: QuestionDetailsActivity<Any?>)
    fun inject(questionsListActivity: QuestionsListActivity)
    fun inject(viewModelActivity: ViewModelActivity)
}