package karpushinkirill.gr303.rediexpress

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val buttonSignUp = findViewById<Button>(R.id.buttonSignUp)
        val buttonSignInEnd = findViewById<Button>(R.id.buttonSignInEnd)
        var editTextMail = findViewById(R.id.editTextMail) as EditText
        var editTextPassword = findViewById(R.id.editTextPassword) as EditText

        buttonSignUp.setOnClickListener()
        {
            startActivity(Intent(this, SignUp::class.java).apply {startActivity(intent)})
            finish()
        }

        buttonSignInEnd.setOnClickListener()
        {
            if (editTextMail.text.toString() == "dadada@mail.ru" && editTextPassword.text.toString() == "12345678")
            {
                startActivity(Intent(this, HomePage::class.java).apply {startActivity(intent)})
                finish()
            }

        }
    }
}