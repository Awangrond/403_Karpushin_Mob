package karpushinkirill.gr303.rediexpress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val buttonSignUp = findViewById<Button>(R.id.buttonSignUp)
        val buttonSignIn = findViewById<Button>(R.id.buttonSignIn)


        buttonSignUp.setOnClickListener()
        {
            startActivity(Intent(this, SignUp::class.java).apply {startActivity(intent)})
            finish()
        }

        buttonSignIn.setOnClickListener()
        {
            startActivity(Intent(this, SignIn::class.java).apply {startActivity(intent)})
            finish()
        }
    }
}