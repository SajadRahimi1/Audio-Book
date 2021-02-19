package rahimi.app.compundeffectaudio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Season1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_season1)
    }

    fun cardClicked(view: View){
        val intent = Intent(this,Study::class.java)
        when(view.id){
            R.id.s1_1 -> {
                intent.putExtra("title", "s1_1")

            }
            R.id.s1_2 -> {
                intent.putExtra("title", "s1_2")

            }
            R.id.s1_3 -> {
                intent.putExtra("title", "s1_3")

            }
            R.id.s1_4 -> {
                intent.putExtra("title", "s1_4")

            }
            R.id.s1_5 -> {
                intent.putExtra("title", "s1_5")

            }
            R.id.s1_6 -> {
                intent.putExtra("title", "s1_6")

            }
            R.id.s1_7 -> {
                intent.putExtra("title", "s1_7")

            }
            R.id.s1_8 -> {
                intent.putExtra("title", "s1_8")

            }
        }


//        intent.putExtra("title","${view.id.toString()}")
        startActivity(intent)
    }
}