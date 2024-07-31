package com.example.dependency_injection.screens.questionslist

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.dependency_injection.R
import com.example.dependency_injection.questions.Question

class QuestionsListViewMvc(
    private val layoutInflater: LayoutInflater,
    private val parent: ViewGroup?
): BaseViewMvc<QuestionsListViewMvc.Listener>(
   layoutInflater,
    parent,
    R.layout.layout_questions_list
) {
    interface Listener {
        fun onRefreshClicked()
        fun onQuestionClicked(clikedQuestion: Question)
        fun onViewModelClicked()
    }
}
