package com.example.dependency_injection.screens.questiondetails

import android.annotation.SuppressLint
import android.os.Build
import android.text.Html
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.dependency_injection.R
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.dependency_injection.questions.QuestionWithBody
import com.example.dependency_injection.screens.common.imageloader.ImageLoader
import com.example.dependency_injection.screens.common.toolbar.MyToolbar
import com.example.dependency_injection.screens.common.viewsmvc.BaseViewMvc

@SuppressLint("CutPasteId")
class QuestionDetailsViewMvc(
    layoutInflater: LayoutInflater,
    private val imageLoader: ImageLoader,
    parent: ViewGroup?
): BaseViewMvc<QuestionDetailsViewMvc.Listener>(
       layoutInflater,
       parent,
       R.layout.layout_question_details
) {
    interface Listener {
        fun onBackClicked()
    }

    private val toolbar: MyToolbar
    private val swipeRefresh: SwipeRefreshLayout
    private val txtQuestionBody: TextView = findViewById(R.id.txt_question_body)
    private val imgUser: ImageView
    private val txtUserName: TextView

    init {
        toolbar = findViewById(R.id.toolbar)
        toolbar.setNavigateUpListener {
            for (listener in listeners){
                listener.onBackClicked()
            }
        }

        swipeRefresh = findViewById(R.id.swipeRefresh)
        swipeRefresh.isEnabled = false
        imgUser = findViewById(R.id.txt_user_name)
        txtUserName = findViewById(R.id.txt_user_name)
    }

    fun bindQuestionWithBody(question: QuestionWithBody){
        txtQuestionBody.text = Html.fromHtml(question.body)
        imageLoader.loadImage(question.owner.imageUrl, imgUser)
        txtUserName.text = question.owner.name
    }

    fun showProgressIndication(){
        swipeRefresh.isRefreshing = true
    }

    fun hideProgressIndication(){
        if(swipeRefresh.isRefreshing){
            swipeRefresh.isRefreshing = false
        }
    }
}