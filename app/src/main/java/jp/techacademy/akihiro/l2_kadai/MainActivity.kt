package jp.techacademy.akihiro.l2_kadai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val taro = Human("太郎", 12, "サッカー")
        taro.say()
        taro.think()

        var jiro = Human("二郎", 25, "料理")
        jiro.say()
        jiro.think()
    }
}