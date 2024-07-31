package com.example.dependency_injection.screens.questionslist

import android.os.Bundle
import com.example.dependency_injection.R

class QuestionsListActivity: BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_frame)
        if(savedInstanceState==null){
            supportFragmentManager.beginTransaction()
                .add(R.id.frame_content, QuestionsListFragment())
                .commit()
        }
    }
}