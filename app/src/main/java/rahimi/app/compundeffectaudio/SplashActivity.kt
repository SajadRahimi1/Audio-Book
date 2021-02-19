package rahimi.app.compundeffectaudio

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    lateinit var txtLoading: TextView
    lateinit var progressBar: ProgressBar
    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        txtLoading = findViewById(R.id.txtLoading)
        progressBar = findViewById(R.id.progressBar)
        handler = Handler()
        var counter = 10

        Thread {
            try {
                while (counter < 100) {
                    counter++
                    handler.post(Runnable {
                        progressBar.setProgress(counter)
                        if (counter == 20) {
                            txtLoading.setText(txtLoading.getText().toString() + ".")
                        } else if (counter == 35) {
                            txtLoading.setText(txtLoading.getText().toString() + ".")
                        } else if (counter == 50) {
                            txtLoading.setText(txtLoading.getText().toString() + ".")
                        }
                        if (counter == 60) {
                            txtLoading.setText("Loading audio")
                        } else if (counter == 65) {
                            txtLoading.setText(txtLoading.getText().toString() + ".")
                        } else if (counter == 75) {
                            txtLoading.setText(txtLoading.getText().toString() + ".")
                        } else if (counter == 83) {
                            txtLoading.setText(txtLoading.getText().toString() + ".")
                        }
                        if (counter == 100) {
                            val intent = Intent(this,MainActivity::class.java)
                            startActivity(intent)
                            finish()
                        }
                    })
                    Thread.sleep(40)
                }
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }
        }.start()
    }
}