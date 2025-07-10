package com.aysusen.catchthekenny

import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.postDelayed
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.aysusen.catchthekenny.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var score=0
    var imageArray=ArrayList<ImageView>()
    var runnable=Runnable{}
    var handler= Handler(Looper.getMainLooper())
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        imageArray.add(binding.imageView1)
        imageArray.add(binding.imageView2)
        imageArray.add(binding.imageView3)
        imageArray.add(binding.imageView4)
        imageArray.add(binding.imageView5)
        imageArray.add(binding.imageView6)
        imageArray.add(binding.imageView7)
        imageArray.add(binding.imageView8)
        imageArray.add(binding.imageView9)
        imageArray.add(binding.imageView10)
        imageArray.add(binding.imageView11)
        imageArray.add(binding.imageView12)
        imageArray.add(binding.imageView13)
        imageArray.add(binding.imageView14)
        imageArray.add(binding.imageView15)
        imageArray.add(binding.imageView16)

        hideImages()

        object : CountDownTimer(15000, 1000) {
            override fun onTick(p0: Long) {
                binding.textView.text = "Time: ${p0 / 1000}"
            }

            override fun onFinish() {
                binding.textView.text = "Time: 0"
                handler.removeCallbacks(runnable)
                //Süre bitti tüm Kenny'ler saklansın.
                for (image in imageArray) {
                    image.visibility = View.INVISIBLE
                }
                val alert=AlertDialog.Builder(this@MainActivity)
                alert.setTitle("Game Over")
                alert.setMessage("Restart The Game?")
                alert.setPositiveButton("Yes") { dialog, which ->
                    val intentFromMain=intent  //intent yap tekrar başlat !
                    finish()
                    startActivity(intentFromMain)
                }
                alert.setNegativeButton("No") { dialog, which ->
                    Toast.makeText(this@MainActivity,"Game Over, Score: ${score}", Toast.LENGTH_LONG).show()
                }
                alert.show()
            }
        }.start()
    }

    fun hideImages()
    {
        runnable=object :Runnable{
            override fun run() {
                for(image in imageArray){
                    image.visibility=View.INVISIBLE
                }
                val random=Random
                val randomIndex=random.nextInt(16)
                imageArray[randomIndex].visibility=View.VISIBLE
                handler.postDelayed(runnable,550)
            }
        }
        handler.post(runnable)

    }
    fun increaseScore(view: View){
        score++
        binding.textView2.text="Score: $score"
    }
    }
