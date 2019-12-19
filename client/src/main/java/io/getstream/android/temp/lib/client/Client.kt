package io.getstream.android.temp.lib.client

class Client {
    suspend fun load(): String {
        val before = System.currentTimeMillis()
        Thread.sleep(1000)
        val after = System.currentTimeMillis()
        return "$before -> $after"
    }
}