package com.example.fastcampus_android_kotlin

import android.annotation.SuppressLint
import android.content.Intent
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private val remainMinutesTextView: TextView by lazy {
        findViewById(R.id.remainMinutesTextView)
    }

    private val remainSecondsTextView: TextView by lazy {
        findViewById(R.id.remainSecondsTextView)
    }

    private val seekBar: SeekBar by lazy {
        findViewById(R.id.seekBar)
    }

    private val soundPool = SoundPool.Builder().build()

    private var currentCountDownTimer: CountDownTimer? = null

    private var tickingSoundId: Int? = null

    private var bellSoundId: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindViews()
        initSounds()
    }

    private fun bindViews() {
        seekBar.setOnSeekBarChangeListener(
            object : SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(
                    seekBar: SeekBar?,
                    progress: Int,
                    fromUser: Boolean
                ) {
                    if (fromUser) {
                        updateRemainTime(progress * 60 * 1000L)
                    }

                }

                override fun onStartTrackingTouch(seekBar: SeekBar?) {
                    currentCountDownTimer?.cancel()
                    currentCountDownTimer = null
                }

                override fun onStopTrackingTouch(seekBar: SeekBar?) {
                    seekBar ?: return

                    currentCountDownTimer = createCountDownTimer(seekBar.progress * 60 * 1000L)
                    currentCountDownTimer?.start()

                    tickingSoundId?.let { soundId ->
                        soundPool.play(soundId, 1F, 1F, 0, -1, 1F)
                    }
                }
            }
        )
    }

    private fun initSounds() {
        tickingSoundId = soundPool.load(this, R.raw.timer_ticking, 1)
        bellSoundId = soundPool.load(this, R.raw.timer_bell, 1)
    }

    private fun createCountDownTimer(initialMillis: Long) =
        object : CountDownTimer(initialMillis, 1000L) {
            override fun onTick(millisUntilFinished: Long) {
                updateRemainTime(millisUntilFinished)
                updateSeekBar(millisUntilFinished)
            }

            override fun onFinish() {
                updateRemainTime(0)
                updateSeekBar(0)
            }
        }

    @SuppressLint("SetTextI18n")
    private fun updateRemainTime(remainMillis: Long) {

        val remainSeconds = remainMillis / 1000

        remainMinutesTextView.text = "%02d".format(remainSeconds / 60)
        remainSecondsTextView.text = "%02d".format(remainSeconds % 60)
    }

    private fun updateSeekBar(remainMillis: Long) {
        seekBar.progress = (remainMillis / 1000 / 60).toInt()
    }

}