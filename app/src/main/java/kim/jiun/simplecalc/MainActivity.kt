package kim.jiun.simplecalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inits()
    }

    fun inits() : Unit{
        var tmpList : MutableList<Any> = mutableListOf("hello")
        tmpList.add(1)
    }
}