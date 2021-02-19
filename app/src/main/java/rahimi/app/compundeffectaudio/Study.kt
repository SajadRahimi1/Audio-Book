package rahimi.app.compundeffectaudio

import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.widget.*
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import java.util.*
import kotlin.concurrent.schedule

@Suppress("DEPRECATION")
class Study : AppCompatActivity() {
    lateinit var txtTitle: TextView
    lateinit var txtDescribe: TextView
    lateinit var imgStudy: ImageView
    lateinit var medPlayer: MediaPlayer
    lateinit var seekBar: SeekBar
    lateinit var btnExit: ImageButton
    lateinit var btnPause: ImageButton
    lateinit var timer: Timer
    lateinit var btnPlay: ImageButton
    var handler: Handler = Handler()
    lateinit var runnable: Runnable

    private fun seekBarUpdate(){
        runnable= Runnable {
            seekBar.progress = medPlayer.currentPosition

            handler.postDelayed(runnable,1000)
        }
        handler.postDelayed(runnable,1000)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_study)
        txtTitle = findViewById(R.id.txtTitle)
        txtDescribe = findViewById(R.id.txtDescribe)
        btnPause = findViewById(R.id.btnPause)
        imgStudy = findViewById(R.id.imgStudy)
        seekBar = findViewById(R.id.seekBarStudy)
        btnExit = findViewById(R.id.btnExit)
        btnPlay = findViewById(R.id.btnPlay)

        when (intent.extras?.get("title")) {
            "intro" -> {
                txtTitle.text = "مقدمه"
                imgStudy.setImageResource(R.drawable.intro)
                txtDescribe.setText(R.string.intro)
                medPlayer = MediaPlayer.create(this, R.raw.intro)
                seekBar.max = medPlayer.duration
            }
            "s1_1" -> {
                txtTitle.text = "اثر مرکب در عمل"
                imgStudy.setImageResource(R.drawable.season1)
                txtDescribe.setText(R.string.s1_1)
                medPlayer = MediaPlayer.create(this, R.raw.s1_1)
                seekBar.max = medPlayer.duration
            }
            "s1_2" -> {
                txtDescribe.setText(R.string.s1_2)
                txtTitle.text = "شما نتیجه نهایی اثر مرکب را تجربه نکرده اید"
                imgStudy.setImageResource(R.drawable.season1)
                medPlayer = MediaPlayer.create(this, R.raw.s1_2)
                seekBar.max = medPlayer.duration
            }
            "s1_3" -> {
                txtTitle.text = "سکه ی جادویی"
                txtDescribe.setText(R.string.s1_3)
                imgStudy.setImageResource(R.drawable.season1)
                medPlayer = MediaPlayer.create(this, R.raw.s1_3)
                seekBar.max = medPlayer.duration
            }
            "s1_4" -> {
                txtTitle.text = "سه دوست"
                txtDescribe.setText(R.string.s1_4)
                imgStudy.setImageResource(R.drawable.season1)
                medPlayer = MediaPlayer.create(this, R.raw.s1_4)
                seekBar.max = medPlayer.duration
            }
            "s1_5" -> {
                txtTitle.text = "اثر موجی"
                txtDescribe.setText(R.string.s1_5)
                imgStudy.setImageResource(R.drawable.season1)
                medPlayer = MediaPlayer.create(this, R.raw.s1_5)
                seekBar.max = medPlayer.duration
            }
            "s1_6" -> {
                txtTitle.text = "موفقیت روشی قدیمی"
                txtDescribe.setText(R.string.s1_6)
                imgStudy.setImageResource(R.drawable.season1)
                medPlayer = MediaPlayer.create(this, R.raw.s1_6)
                seekBar.max = medPlayer.duration
            }
            "s1_7" -> {
                txtTitle.text = "طرز فکر ماکروویوی"
                txtDescribe.setText(R.string.s1_7)
                imgStudy.setImageResource(R.drawable.season1)
                medPlayer = MediaPlayer.create(this, R.raw.s1_7)
                seekBar.max = medPlayer.duration
            }
            "s1_8" -> {
                txtTitle.text = "به خدمت گرفتن اثر مرکب"
                txtDescribe.setText(R.string.s1_8)
                imgStudy.setImageResource(R.drawable.season1)
                medPlayer = MediaPlayer.create(this, R.raw.s1_8)
                seekBar.max = medPlayer.duration
            }
            "s2_1" -> {
                txtTitle.text = "انتخاب ها"
                txtDescribe.setText(R.string.s2_1)
                imgStudy.setImageResource(R.drawable.season2)
                medPlayer = MediaPlayer.create(this, R.raw.s2_1)
                seekBar.max = medPlayer.duration
            }
            "s2_2" -> {
                txtTitle.text = "فیل ها گاز نمی گیرند"
                txtDescribe.setText(R.string.s2_2)
                imgStudy.setImageResource(R.drawable.season2)
                medPlayer = MediaPlayer.create(this, R.raw.s2_2)
                seekBar.max = medPlayer.duration
            }
            "s2_3" -> {
                txtTitle.text = "شکرگزاری در طول سال"
                txtDescribe.setText(R.string.s2_3)
                imgStudy.setImageResource(R.drawable.season2)
                medPlayer = MediaPlayer.create(this, R.raw.s2_3)
                seekBar.max = medPlayer.duration
            }
            "s2_4" -> {
                txtTitle.text = "مسئولیت 100 درصد"
                txtDescribe.setText(R.string.s2_4)
                imgStudy.setImageResource(R.drawable.season2)
                medPlayer = MediaPlayer.create(this, R.raw.s2_4)
                seekBar.max = medPlayer.duration
            }
            "s2_5" -> {
                txtTitle.text = "خوش شانسی"
                txtDescribe.setText(R.string.s2_5)
                imgStudy.setImageResource(R.drawable.season2)
                medPlayer = MediaPlayer.create(this, R.raw.s2_5)
                seekBar.max = medPlayer.duration
            }
            "s2_6" -> {
                txtTitle.text = "شهریه ی بالای دانشگاه ضربه های سخت"
                txtDescribe.setText(R.string.s2_6)
                imgStudy.setImageResource(R.drawable.season2)
                medPlayer = MediaPlayer.create(this, R.raw.s2_6)
                seekBar.max = medPlayer.duration
            }
            "s2_7" -> {
                txtTitle.text = "سلاح سری شما: برگ برنده ی شما"
                txtDescribe.setText(R.string.s2_7)
                imgStudy.setImageResource(R.drawable.season2)
                medPlayer = MediaPlayer.create(this, R.raw.s2_7)
                seekBar.max = medPlayer.duration
            }
            "s2_8" -> {
                txtTitle.text = "تله ی پول"
                txtDescribe.setText(R.string.s2_8)
                imgStudy.setImageResource(R.drawable.season2)
                medPlayer = MediaPlayer.create(this, R.raw.s2_8)
                seekBar.max = medPlayer.duration
            }
            "s2_9" -> {
                txtTitle.text = "آرام پیش بروید"
                txtDescribe.setText(R.string.s2_9)
                imgStudy.setImageResource(R.drawable.season2)
                medPlayer = MediaPlayer.create(this, R.raw.s2_9)
                seekBar.max = medPlayer.duration
            }
            "s2_10" -> {
                txtTitle.text = "قهرمانان گمنام"
                txtDescribe.setText(R.string.s2_10)
                imgStudy.setImageResource(R.drawable.season2)
                medPlayer = MediaPlayer.create(this, R.raw.s2_10)
                seekBar.max = medPlayer.duration
            }
            "s2_11" -> {
                txtTitle.text = "قدم زدن در شرکت"
                txtDescribe.setText(R.string.s2_11)
                imgStudy.setImageResource(R.drawable.season2)
                medPlayer = MediaPlayer.create(this, R.raw.s2_11)
                seekBar.max = medPlayer.duration
            }
            "s2_12" -> {
                txtTitle.text = "درخت پول"
                txtDescribe.setText(R.string.s2_12)
                imgStudy.setImageResource(R.drawable.season2)
                medPlayer = MediaPlayer.create(this, R.raw.s2_12)
                seekBar.max = medPlayer.duration
            }
            "s2_13" -> {
                txtTitle.text = "زمان، خیلی مهم است"
                txtDescribe.setText(R.string.s2_13)
                imgStudy.setImageResource(R.drawable.season2)
                medPlayer = MediaPlayer.create(this, R.raw.s2_13)
                seekBar.max = medPlayer.duration
            }
            "s2_14" -> {
                txtTitle.text = "موفقیت، دوی  نیمه ماراتن است"
                txtDescribe.setText(R.string.s2_14)
                imgStudy.setImageResource(R.drawable.season2)
                medPlayer = MediaPlayer.create(this, R.raw.s2_14)
                seekBar.max = medPlayer.duration
            }
            "s2_15" -> {
                txtTitle.text = "به خدمت گرفتن اثر مرکب ۲"
                txtDescribe.setText(R.string.s2_15)
                imgStudy.setImageResource(R.drawable.season2)
                medPlayer = MediaPlayer.create(this, R.raw.s2_15)
                seekBar.max = medPlayer.duration
            }
        }

        btnExit.setOnClickListener {
            onBackPressed()
        }


        seekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {

            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

                   medPlayer.seekTo(seekBar!!.progress)


            }

        })

        btnPlay.setOnClickListener {
            medPlayer.start()
            seekBarUpdate()

        }

        btnPause.setOnClickListener { medPlayer.pause() }



    }

    override fun onBackPressed() {
        super.onBackPressed()
        medPlayer.stop()
    }




}






