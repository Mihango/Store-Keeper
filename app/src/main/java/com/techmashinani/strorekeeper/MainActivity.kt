package com.techmashinani.strorekeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var mScore1 = 0
    private var mScore2 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun decreaseScore(view: View) {
        when(view.id) {
            R.id.btn_decrease_team_1 -> {
                mScore1--
                text_score_1.text = "$mScore1"
            }
            R.id.btn_decrease_team_2 -> {
                mScore2--
                text_score_2.text = "$mScore2"
            }
        }
    }

    fun increaseScore(view: View) {
        when(view.id) {
            R.id.btn_increase_team_1 -> {
                mScore1++
                text_score_1.text = "$mScore1"
            }
            R.id.btn_increase_team_2 -> {
                mScore2++
                text_score_2.text = "$mScore2"
            }
        }
    }
}
