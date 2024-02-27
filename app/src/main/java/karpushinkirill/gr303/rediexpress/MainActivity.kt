package karpushinkirill.gr303.rediexpress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonNext = findViewById<Button>(R.id.buttonSignUp)

        buttonNext.setOnClickListener()
        {
            startActivity(Intent(this, MainActivity2::class.java).apply {startActivity(intent)})
            finish()
        }
    }


}