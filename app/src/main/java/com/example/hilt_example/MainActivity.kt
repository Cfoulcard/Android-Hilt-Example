package com.example.hilt_example

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.hilt_example.bowstuff.Bow
import com.example.hilt_example.bowstuff.LongBow
import dagger.hilt.InstallIn
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var bow: Bow

    @Inject
    lateinit var longBow: LongBow

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textviewer)
        textView.text = "This bow is ${bow.bowType()}" +
                " and it is ${bow.bowLength()}\" long! However, you have ${bow.bowDurability()}" +
                " uses remaining until it breaks! The arrows are ${bow.bowArrowType()}, and" +
                " you have ${bow.arrowsLeft()} left!"

        val textView2: TextView = findViewById(R.id.textViewerer2)
        textView2.text = "This bow is ${longBow.bowType()}" +
                " and it is ${longBow.bowLength()}\" long! However, you have ${longBow.bowDurability()}" +
                " uses remaining until it breaks! The arrows are ${longBow.bowArrowType()}, and" +
                " you have ${longBow.arrowsLeft()} left!"
    }
}


@InstallIn(MyApp::class)
class MyModule {

}











