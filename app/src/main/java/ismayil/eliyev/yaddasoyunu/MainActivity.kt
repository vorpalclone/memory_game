package ismayil.eliyev.yaddasoyunu

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Nickname
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvBoard: RecyclerView
    private lateinit var tvHemleler: TextView
    private lateinit var tvXallar: TextView
    private lateinit var tvNickname: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        rvBoard = findViewById(R.id.rvBoard)
        tvHemleler = findViewById(R.id.tvHemleler)
        tvXallar = findViewById(R.id.tvXallar)
        tvNickname = findViewById(R.id.tvNickname)

        val nickname = intent.getStringExtra("nickname")
        if (nickname != null){
            tvNickname.text = "Xoş gəldin, $nickname"
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}