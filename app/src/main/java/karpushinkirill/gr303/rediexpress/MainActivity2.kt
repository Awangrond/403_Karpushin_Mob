package karpushinkirill.gr303.rediexpress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val buttonNext = findViewById<Button>(R.id.buttonSignUp)

        buttonNext.setOnClickListener()
        {
            startActivity(Intent(this, MainActivity3::class.java).apply {startActivity(intent)})
            finish()
        }
    }
}