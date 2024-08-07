package com.example.dependency_injection.screens.viewmodel

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.dependency_injection.R
import javax.inject.Inject

class ViewModelActivity : BaseActivity() {
    @Inject lateinit var screensNavigator: ScreensNavigator
    @Inject lateinit var myViewModelFactory: ViewModelFactory
    private lateinit var myViewModel: MyViewModel
    private lateinit var myViewModel2: MyViewModel2
    private lateinit var toolbar: MyToolbar

    override fun onCreate(savedInstanceState: Bundle?){
        injector.inject(this)
        super.OnCreate(savedInstanceState)
        setContentView(R.layout.layout_view_model)
        toolbar = findViewById(R.id.toolbar)
        toolbar.setNavigateUpListener{
            screensNavigator.navigateBack()
        }
        myViewModel = ViewModelProvider(this, myViewModelFactory).get(MyViewModel::class.java)
        myViewModel2 = ViewModelProvider(this, myViewModelFactory).get(MyViewModel2::class.java)

        myViewModel.questions.observe(this, Observer{
            questions ->
            Toast.makeText(this, "fetched ${questions.size} questions", Toast.LENGTH_LONG).show()
        })
    }

    companion object {
        fun start(context: Context) {
            val intent = Intent(context, ViewModelActivity::class.java)
            context.startActivity(intent)
        }
    }
}