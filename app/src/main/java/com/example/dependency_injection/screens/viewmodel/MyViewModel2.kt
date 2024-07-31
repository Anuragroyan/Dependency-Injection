package com.example.dependency_injection.screens.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.dependency_injection.questions.FetchQuestionsUseCase
import com.example.dependency_injection.questions.Question
import javax.inject.Inject

class MyViewModel2 @Inject constructor(
    private val fetchQuestionsUseCase: FetchQuestionsUseCase,
    private val fetchQuestionDetailsUseCase: FetchQuestionsUseCase
): ViewModel() {
    private val _questions = MutableLiveData<List<Question>>()
    val questions: LiveData<List<Question>> = _questions
}