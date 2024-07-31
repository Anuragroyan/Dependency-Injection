package com.example.dependency_injection.screens.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import com.example.dependency_injection.questions.FetchQuestionsUseCase
import com.example.dependency_injection.questions.Question
import javax.inject.Inject
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MyViewModel @Inject constructor(
    private val fetchQuestionsUseCase: FetchQuestionsUseCase,
    private val fetchQuestionDetailsUseCase: FetchQuestionsUseCase
): SavedStateViewModel() {

    private lateinit var _questions: MutableLiveData<List<Question>>
    val questions: LiveData<List<Question>> get() = _questions

    override fun init(savedStateHandle: SavedStateHandle) {
        _questions = savedStateHandle.getLiveData("questions")

        viewModelScope.launch {
           delay(5000)
           val result = fetchQuestionsUseCase.fetchLatestQuestions()
            if (result is FetchQuestionsUseCase.Result.Success){
                _questions.value = result.questions
            } else {
                throw RuntimeException("fetch failed")
            }
        }
    }
}