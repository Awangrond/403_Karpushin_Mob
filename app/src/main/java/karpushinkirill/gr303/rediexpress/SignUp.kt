package karpushinkirill.gr303.rediexpress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val buttonSignIn = findViewById<Button>(R.id.buttonSignIn)
        val buttonSignUpEnd = findViewById<Button>(R.id.buttonSignUpEnd)

        buttonSignIn.setOnClickListener()
        {
            startActivity(Intent(this, SignIn::class.java).apply {startActivity(intent)})
            finish()
        }

        buttonSignUpEnd .setOnClickListener()
        {
            startActivity(Intent(this, SignIn::class.java).apply {startActivity(intent)})
            finish()
        }
    }
}