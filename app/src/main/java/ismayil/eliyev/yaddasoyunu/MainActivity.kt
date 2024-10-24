package ismayil.eliyev.yaddasoyunu

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Nickname
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var tvNickname: TextView
    private lateinit var btn8x8: Button
    private lateinit var btn16x16: Button
    private lateinit var btn32x32: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        tvNickname = findViewById(R.id.tvNickname)
        btn8x8 = findViewById(R.id.btn8x8)
        btn16x16 = findViewById(R.id.btn16x16)
        btn32x32 = findViewById(R.id.btn32x32)

        val nickname = intent.getStringExtra("nickname")
        if (nickname != null){
            tvNickname.text = "Xoş gəldin, $nickname"
        }

        btn8x8.setOnClickListener{
            val intent = Intent(this, Page_8x8::class.java)
            startActivity(intent)
        }

        btn16x16.setOnClickListener{

        }
        btn32x32.setOnClickListener{

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}