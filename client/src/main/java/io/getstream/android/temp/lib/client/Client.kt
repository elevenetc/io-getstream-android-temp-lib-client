package io.getstream.android.temp.lib.client

import com.google.gson.Gson
import okhttp3.Request
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Client {
    suspend fun load(): String {
        val before = System.currentTimeMillis()
        Thread.sleep(1000)
        val after = System.currentTimeMillis()
        return "$before -> $after"
    }

    fun loadCall(): Call<String> {
        return object : Call<String> {
            override fun enqueue(callback: Callback<String>) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun isExecuted(): Boolean {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun clone(): Call<String> {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun isCanceled(): Boolean {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun cancel() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun execute(): Response<String> {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun request(): Request {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        }
    }

    fun useGson(): String {
        return Gson().toJson(Hello())
    }

    class Hello {
        val hello: String = "hello"
    }
}