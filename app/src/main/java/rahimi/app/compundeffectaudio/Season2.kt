package rahimi.app.compundeffectaudio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Season2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_season2)
    }

    fun cardClicked(view: View) {
        val intent = Intent(this, Study::class.java)

        when (view.id) {
            R.id.s2_1 -> {
                intent.putExtra("title", "s2_1")
                startActivity(intent)
                finish()
            }
            R.id.s2_2 -> {
                intent.putExtra("title", "s2_2")
                startActivity(intent)
                finish()
            }
            R.id.s2_3 -> {
                intent.putExtra("title", "s2_3")
                startActivity(intent)
                finish()
            }
            R.id.s2_4 -> {
                intent.putExtra("title", "s2_4")
                startActivity(intent)
                finish()
            }
            R.id.s2_5 -> {
                intent.putExtra("title", "s2_5")
                startActivity(intent)
                finish()
            }
            R.id.s2_6 -> {
                intent.putExtra("title", "s2_6")
                startActivity(intent)
                finish()
            }
            R.id.s2_7 -> {
                intent.putExtra("title", "s2_7")
                startActivity(intent)
                finish()
            }
            R.id.s2_8 -> {
                intent.putExtra("title", "s2_8")
                startActivity(intent)
                finish()
            }
            R.id.s2_9 -> {
                intent.putExtra("title", "s2_9")
                startActivity(intent)
                finish()
            }
            R.id.s2_10 -> {
                intent.putExtra("title", "s2_10")
                startActivity(intent)
                finish()
            }
            R.id.s2_11 -> {
                intent.putExtra("title", "s2_11")
                startActivity(intent)
                finish()
            }
            R.id.s2_12 -> {
                intent.putExtra("title", "s2_12")
                startActivity(intent)
                finish()
            }
            R.id.s2_13 -> {
                intent.putExtra("title", "s2_13")
                startActivity(intent)
                finish()
            }
            R.id.s2_14 -> {
                intent.putExtra("title", "s2_14")
                startActivity(intent)
                finish()
            }
            R.id.s2_15 -> {
                intent.putExtra("title", "s2_15")
                startActivity(intent)
                finish()
            }
        }
    }
}