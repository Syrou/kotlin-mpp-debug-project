package com.gloot.sdk

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.MainCoroutineDispatcher
import org.gloot.sdk.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.main_text).text = createApplicationScreenMessage()
        AnimalTest(Test.RABBIT)

        val apiClient = ApiClient(Dispatchers.Main)
        launchAndCatch(Dispatchers.Main, onError = { error ->
            Log.d("Test", error?.localizedMessage)
        }){
            apiClient.numberOfRandomUsers(2).results?.firstOrNull()?.let { user ->
                Log.d("Test", user.name?.first)
            }
        }
        /*apiClient.numberOfRandomUsers(2, {users, error ->
            Log.d("Test", users?.results?.get(0)?.email)
        })*/
    }
}
