package com.example.dependency_injection.screens.common.viewsmvc

import android.view.LayoutInflater
import android.view.ViewGroup
import com.android.volley.toolbox.ImageLoader
import com.example.dependency_injection.screens.questiondetails.QuestionDetailsViewMvc
import com.example.dependency_injection.screens.questionslist.QuestionsListViewMvc
import javax.inject.Inject
import javax.inject.Provider

class ViewMvcFactory @Inject constructor(
    private val layoutInflaterProvider: Provider<LayoutInflater>,
    private val imageLoaderProvider: Provider<ImageLoader>
) {
    fun newQuestionsListViewMvc(parent: ViewGroup?): QuestionsListViewMvc {
        return QuestionsListViewMvc(layoutInflaterProvider.get(), parent)
    }

    fun newQuestionDetailsViewMvc(parent: ViewGroup?): QuestionDetailsViewMvc {
        return QuestionDetailsViewMvc(layoutInflaterProvider.get(), imageLoaderProvider.get(), parent)
    }
}