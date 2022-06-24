package com.maryatul.githubprofile.helpers

import com.maryatul.githubprofile.BuildConfig

class Config {
    companion object{
        const val SPLASH_SCREEN_DELAY:Long = 4000
        const val BASE_URL ="https://api.github.com"
        const val DEFAULT_USER_LOGIN = "maryatulkippiyah01"
        const val PERSONAL_ACCESS_TOKEN = "token ${BuildConfig.ACCESS_TOKEN}"
    }
}