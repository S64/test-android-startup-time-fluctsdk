package jp.co.kiganix.android.example.myapplication

import android.app.Application
import android.util.Log

class MyApp : Application() {
    companion object {

        init {
            Log.d("MyApp", "flavor: ${BuildConfig.FLAVOR}")
        }

    }
}
