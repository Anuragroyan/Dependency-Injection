package com.example.dependency_injection.networking

import com.example.dependency_injection.questions.Question
import com.google.gson.annotations.SerializedName

data class QuestionsListResponseSchema(@SerializedName("items") val questions: List<Question>)