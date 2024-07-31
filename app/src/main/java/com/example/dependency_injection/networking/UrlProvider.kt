package com.example.dependency_injection.networking

import com.example.dependency_injection.Constants

class UrlProvider {
    fun getBaseUrl1(): String{
        return Constants.BASE_URL
    }
    fun getBaseUrl2(): String{
        return "base_url"
    }
}