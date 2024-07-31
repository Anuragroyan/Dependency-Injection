package com.example.dependency_injection.networking

import com.example.dependency_injection.questions.QuestionWithBody
import com.google.gson.annotations.SerializedName

data class SingleQuestionResponseSchema(@SerializedName("items") val questions: List<QuestionWithBody>){
    val question: QuestionWithBody get() = questions[0]
}