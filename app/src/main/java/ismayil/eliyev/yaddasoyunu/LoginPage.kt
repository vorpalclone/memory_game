package ismayil.eliyev.yaddasoyunu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginPage : AppCompatActivity() {

    lateinit var nicknameInput: EditText
    lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_page)

        nicknameInput = findViewById(R.id.nickname_id)
        loginButton = findViewById(R.id.login_button)

        loginButton.setOnClickListener(){
            val nickname = nicknameInput.text.toString()
            if(nickname.isNotEmpty()){
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("nickname", nickname)
                startActivity(intent)
            }
            else{
                nicknameInput.error = "Xahiş edirəm bir nickname girin!"
            }
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}