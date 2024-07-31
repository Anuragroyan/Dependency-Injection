package com.example.dependency_injection.networking

import com.example.dependency_injection.Constants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface StackoverflowApi {
    @GET("/questions?key=" + Constants.STACKOVERFLOW_API_KEY + "&order=desc&sort=activity&site=stackoverflow")
    suspend fun  lastActiveQuestions(@Query("pagesize") pageSize: Int?): Response<QuestionsListResponseSchema>
    @GET("/questions/{questionId}?key=" + Constants.STACKOVERFLOW_API_KEY + "&site=stackoverflow&filter=withbody")
    suspend fun questionsDetails(@Path("questionId") questionId: String?): Response<SingleQuestionResponseSchema>
}