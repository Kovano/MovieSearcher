package kovano.github.s020_moviesearcher

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kovano.github.s020_moviesearcher.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {

    lateinit var binding: Activity2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2to1.setOnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

    }
}