package rahimi.app.compundeffectaudio

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.animation.AnimationUtils
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.cardview.widget.CardView
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    lateinit var IntroCard: CardView
    lateinit var Season1Card: CardView
    lateinit var Season2Card: CardView
    lateinit var drawer: DrawerLayout
    lateinit var toolbar: Toolbar
    lateinit var navigation: NavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        IntroCard = findViewById(R.id.IntroCard)
        Season1Card = findViewById(R.id.Season1Card)
        Season2Card = findViewById(R.id.Season2Card)
        drawer = findViewById(R.id.drawer)
        toolbar = findViewById(R.id.toolbar)
        val animA = AnimationUtils.loadAnimation(this, R.anim.introanim)
        val anim1 = AnimationUtils.loadAnimation(this, R.anim.one)
        val anim2 = AnimationUtils.loadAnimation(this, R.anim.two)
        navigation = findViewById(R.id.navigation)
        IntroCard.animation = animA
        Season1Card.animation = anim1
        Season2Card.animation = anim2


        setSupportActionBar(toolbar)
        val toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.open, R.string.close)
        drawer.addDrawerListener(toggle)
        toggle.syncState()

        navigation.setNavigationItemSelectedListener(this)

        IntroCard.setOnClickListener {
            val intent = Intent(this, Study::class.java)
            intent.putExtra("title", "intro")
            startActivity(intent)
        }
        Season1Card.setOnClickListener {
            val intent = Intent(this, Season1::class.java)
            startActivity(intent)
        }
        Season2Card.setOnClickListener {

            val intent = Intent(this, Season2::class.java)
            startActivity(intent)
        }


    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.Exit) {
            finishAffinity()
        }

        return true
    }

    override fun onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
            backBtnClicked()
        }

    }
    fun backBtnClicked(){

        val alertDialog = AlertDialog.Builder(this)
        alertDialog.setTitle("خروج")
        alertDialog.setMessage("آیا می خواهید بروید بیرون؟")
        alertDialog.setIcon(R.drawable.exit)
        alertDialog.setPositiveButton("بلی"){ _: DialogInterface, _ -> finishAffinity()}
        alertDialog.setNegativeButton("خیر"){ dialog: DialogInterface, _ -> dialog.cancel()}
        val exitDialog: AlertDialog = alertDialog.create()
        exitDialog.setCancelable(false)
        exitDialog.show()
    }
}

