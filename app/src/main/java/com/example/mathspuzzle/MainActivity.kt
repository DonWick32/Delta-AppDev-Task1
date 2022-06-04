package com.example.mathspuzzle

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import java.util.Random
import android.graphics.drawable.Drawable
import android.os.Vibrator
import android.view.View
import androidx.fragment.app.Fragment
@Suppress("DEPRECATION")

val random = Random()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionBar = supportActionBar
        if (actionBar != null){
            actionBar.title = "Maths Puzzle"
            actionBar.setDisplayHomeAsUpEnabled(true)
        }
        var highScore = 0
        var lives = 3
        val btn00 = findViewById<Button>(R.id.btn00)
        val btn01 = findViewById<Button>(R.id.btn01)
        val btn10 = findViewById<Button>(R.id.btn10)
        val btn11 = findViewById<Button>(R.id.btn11)
        val btn20 = findViewById<Button>(R.id.btn20)
        val btn21 = findViewById<Button>(R.id.btn21)
        val btn30 = findViewById<Button>(R.id.btn30)
        val btn31 = findViewById<Button>(R.id.btn31)
        val btn40 = findViewById<Button>(R.id.btn40)
        val btn41 = findViewById<Button>(R.id.btn41)
        val txt02 = findViewById<TextView>(R.id.txt02)
        val txt12 = findViewById<TextView>(R.id.txt12)
        val txt22 = findViewById<TextView>(R.id.txt22)
        val txt32 = findViewById<TextView>(R.id.txt32)
        val txt42 = findViewById<TextView>(R.id.txt42)
        val btn50 = findViewById<Button>(R.id.btn50)
        val btn51 = findViewById<Button>(R.id.btn51)
        val btn52 = findViewById<Button>(R.id.btn52)
        val btn53 = findViewById<Button>(R.id.btn53)
        val btn54 = findViewById<Button>(R.id.btn54)
        val btn60 = findViewById<Button>(R.id.btn60)
        val btn61 = findViewById<Button>(R.id.btn61)
        val btn62 = findViewById<Button>(R.id.btn62)
        val btn63 = findViewById<Button>(R.id.btn63)
        val btn64 = findViewById<Button>(R.id.btn64)

        val btn = findViewById<Button>(R.id.btn)
        val txt = findViewById<TextView>(R.id.txt)

        fun rand(from: Int, to: Int) : Int {
            return random.nextInt(to - from) + from
        }
        val v = (getSystemService(Context.VIBRATOR_SERVICE) as Vibrator)

        fun gen(vall : List<Int>) {
            btn00.setBackgroundColor(Color.parseColor("#808080"))
            btn01.setBackgroundColor(Color.parseColor("#808080"))
            btn10.setBackgroundColor(Color.parseColor("#808080"))
            btn11.setBackgroundColor(Color.parseColor("#808080"))
            btn20.setBackgroundColor(Color.parseColor("#808080"))
            btn21.setBackgroundColor(Color.parseColor("#808080"))
            btn30.setBackgroundColor(Color.parseColor("#808080"))
            btn31.setBackgroundColor(Color.parseColor("#808080"))
            btn40.setBackgroundColor(Color.parseColor("#808080"))
            btn41.setBackgroundColor(Color.parseColor("#808080"))
            btn00.text = ""
            btn01.text = ""
            btn10.text = ""
            btn11.text = ""
            btn20.text = ""
            btn21.text = ""
            btn30.text = ""
            btn31.text = ""
            btn40.text = ""
            btn41.text = ""

            btn50.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btn51.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btn52.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btn53.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btn54.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btn60.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btn61.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btn62.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btn63.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btn64.setBackgroundColor(Color.parseColor("#FF6200EE"))
            var curr: String = ""

            val l = listOf<Int>(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
            val list: MutableList<Int> = mutableListOf()
            while (list.size != 10) {
                val randomIndex = random.nextInt(l.size)
                val ran = l[randomIndex]
                if (ran !in list) {
                    list += ran
                }
            }
            btn50.text = vall[list[0]].toString()
            btn51.text = vall[list[1]].toString()
            btn52.text = vall[list[2]].toString()
            btn53.text = vall[list[3]].toString()
            btn54.text = vall[list[4]].toString()
            btn60.text = vall[list[5]].toString()
            btn61.text = vall[list[6]].toString()
            btn62.text = vall[list[7]].toString()
            btn63.text = vall[list[8]].toString()
            btn64.text = vall[list[9]].toString()

            btn50.setOnClickListener {
                if (btn50.text != "" && curr == "") {
                    curr = btn50.text.toString()
                    btn50.text = ""
                    btn50.setBackgroundColor(Color.parseColor("#808080"))
                } else if (btn50.text == "" && curr != "") {
                    btn50.text = curr
                    btn50.setBackgroundColor(Color.parseColor("#FF6200EE"))
                    curr = ""
                }
            }
            btn51.setOnClickListener {
                if (btn51.text != "" && curr == "") {
                    curr = btn51.text.toString()
                    btn51.text = ""
                    btn51.setBackgroundColor(Color.parseColor("#808080"))
                }
                else if (btn51.text == "" && curr != "") {
                    btn51.text = curr
                    btn51.setBackgroundColor(Color.parseColor("#FF6200EE"))
                    curr = ""
                }
            }
            btn52.setOnClickListener {
                if (btn52.text != "" && curr == "") {
                    curr = btn52.text.toString()
                    btn52.text = ""
                    btn52.setBackgroundColor(Color.parseColor("#808080"))
                } else if (btn52.text == "" && curr != "") {
                    btn52.text = curr
                    btn52.setBackgroundColor(Color.parseColor("#FF6200EE"))
                    curr = ""
                }
            }
            btn53.setOnClickListener {
                if (btn53.text != "" && curr == "") {
                    curr = btn53.text.toString()
                    btn53.text = ""
                    btn53.setBackgroundColor(Color.parseColor("#808080"))
                } else if (btn53.text == "" && curr != "") {
                    btn53.text = curr
                    btn53.setBackgroundColor(Color.parseColor("#FF6200EE"))
                    curr = ""
                }
            }
            btn54.setOnClickListener {
                if (btn54.text != "" && curr == "") {
                    curr = btn54.text.toString()
                    btn54.text = ""
                    btn54.setBackgroundColor(Color.parseColor("#808080"))
                } else if (btn54.text == "" && curr != "") {
                    btn54.text = curr
                    btn54.setBackgroundColor(Color.parseColor("#FF6200EE"))
                    curr = ""
                }
            }
            btn60.setOnClickListener {
                if (btn60.text != "" && curr == "") {
                    curr = btn60.text.toString()
                    btn60.text = ""
                    btn60.setBackgroundColor(Color.parseColor("#808080"))
                } else if (btn60.text == "" && curr != "") {
                    btn60.text = curr
                    btn60.setBackgroundColor(Color.parseColor("#FF6200EE"))
                    curr = ""
                }
            }
            btn61.setOnClickListener {
                if (btn61.text != "" && curr == "") {
                    curr = btn61.text.toString()
                    btn61.text = ""
                    btn61.setBackgroundColor(Color.parseColor("#808080"))
                } else if (btn61.text == "" && curr != "") {
                    btn61.text = curr
                    btn61.setBackgroundColor(Color.parseColor("#FF6200EE"))
                    curr = ""
                }
            }
            btn62.setOnClickListener {
                if (btn62.text != "" && curr == "") {
                    curr = btn62.text.toString()
                    btn62.text = ""
                    btn62.setBackgroundColor(Color.parseColor("#808080"))
                } else if (btn62.text == "" && curr != "") {
                    btn62.text = curr
                    btn62.setBackgroundColor(Color.parseColor("#FF6200EE"))
                    curr = ""
                }
            }
            btn63.setOnClickListener {
                if (btn63.text != "" && curr == "") {
                    curr = btn63.text.toString()
                    btn63.text = ""
                    btn63.setBackgroundColor(Color.parseColor("#808080"))
                } else if (btn63.text == "" && curr != "") {
                    btn63.text = curr
                    btn63.setBackgroundColor(Color.parseColor("#FF6200EE"))
                    curr = ""
                }
            }
            btn64.setOnClickListener {
                if (btn64.text != "" && curr == "") {
                    curr = btn64.text.toString()
                    btn64.text = ""
                    btn64.setBackgroundColor(Color.parseColor("#808080"))
                } else if (btn64.text == "" && curr != "") {
                    btn64.text = curr
                    btn64.setBackgroundColor(Color.parseColor("#FF6200EE"))
                    curr = ""
                }
            }

            btn00.setOnClickListener {
                if (btn00.text != "" && curr == "") {
                    curr = btn00.text.toString()
                    btn00.text = ""
                    btn00.setBackgroundColor(Color.parseColor("#808080"))
                } else if (btn00.text == "" && curr != "") {
                    btn00.text = curr
                    btn00.setBackgroundColor(Color.parseColor("#FF6200EE"))
                    curr = ""
                }
            }
            btn01.setOnClickListener {
                if (btn01.text != "" && curr == "") {
                    curr = btn01.text.toString()
                    btn01.text = ""
                    btn01.setBackgroundColor(Color.parseColor("#808080"))
                } else if (btn01.text == "" && curr != "") {
                    btn01.text = curr
                    btn01.setBackgroundColor(Color.parseColor("#FF6200EE"))
                    curr = ""
                }
            }
            btn10.setOnClickListener {
                if (btn10.text != "" && curr == "") {
                    curr = btn10.text.toString()
                    btn10.text = ""
                    btn10.setBackgroundColor(Color.parseColor("#808080"))
                } else if (btn10.text == "" && curr != "") {
                    btn10.text = curr
                    btn10.setBackgroundColor(Color.parseColor("#FF6200EE"))
                    curr = ""
                }
            }
            btn11.setOnClickListener {
                if (btn11.text != "" && curr == "") {
                    curr = btn11.text.toString()
                    btn11.text = ""
                    btn11.setBackgroundColor(Color.parseColor("#808080"))
                } else if (btn11.text == "" && curr != "") {
                    btn11.text = curr
                    btn11.setBackgroundColor(Color.parseColor("#FF6200EE"))
                    curr = ""
                }
            }
            btn20.setOnClickListener {
                if (btn20.text != "" && curr == "") {
                    curr = btn20.text.toString()
                    btn20.text = ""
                    btn20.setBackgroundColor(Color.parseColor("#808080"))
                } else if (btn20.text == "" && curr != "") {
                    btn20.text = curr
                    btn20.setBackgroundColor(Color.parseColor("#FF6200EE"))
                    curr = ""
                }
            }
            btn21.setOnClickListener {
                if (btn21.text != "" && curr == "") {
                    curr = btn21.text.toString()
                    btn21.text = ""
                    btn21.setBackgroundColor(Color.parseColor("#808080"))
                } else if (btn21.text == "" && curr != "") {
                    btn21.text = curr
                    btn21.setBackgroundColor(Color.parseColor("#FF6200EE"))
                    curr = ""
                }
            }
            btn30.setOnClickListener {
                if (btn30.text != "" && curr == "") {
                    curr = btn30.text.toString()
                    btn30.text = ""
                    btn30.setBackgroundColor(Color.parseColor("#808080"))
                } else if (btn30.text == "" && curr != "") {
                    btn30.text = curr
                    btn30.setBackgroundColor(Color.parseColor("#FF6200EE"))
                    curr = ""
                }
            }
            btn31.setOnClickListener {
                if (btn31.text != "" && curr == "") {
                    curr = btn31.text.toString()
                    btn31.text = ""
                    btn31.setBackgroundColor(Color.parseColor("#808080"))
                } else if (btn31.text == "" && curr != "") {
                    btn31.text = curr
                    btn31.setBackgroundColor(Color.parseColor("#FF6200EE"))
                    curr = ""
                }
            }
            btn40.setOnClickListener {
                if (btn40.text != "" && curr == "") {
                    curr = btn40.text.toString()
                    btn40.text = ""
                    btn40.setBackgroundColor(Color.parseColor("#808080"))
                } else if (btn40.text == "" && curr != "") {
                    btn40.text = curr
                    btn40.setBackgroundColor(Color.parseColor("#FF6200EE"))
                    curr = ""
                }
            }
            btn41.setOnClickListener {
                if (btn41.text != "" && curr == "") {
                    curr = btn41.text.toString()
                    btn41.text = ""
                    btn41.setBackgroundColor(Color.parseColor("#808080"))
                } else if (btn41.text == "" && curr != "") {
                    btn41.text = curr
                    btn41.setBackgroundColor(Color.parseColor("#FF6200EE"))
                    curr = ""
                }
            }
            btn.setOnClickListener {
                if (txt.text == "Lives Remaining = 3")
                    lives = 3
                else if (txt.text == "Lives Remaining = 2")
                    lives = 2
                else if (txt.text == "Lives Remaining = 1")
                    lives = 1
                else
                    lives = 0

                if (btn00.text != "" && btn01.text != "" && btn10.text != "" && btn11.text != "" && btn20.text != "" && btn21.text != "" && btn30.text != "" && btn31.text != "" && btn40.text != "" && btn41.text != "") {
                    var score = 0
                    val s1 = btn00.text.toString().toInt()
                    val s2 = btn01.text.toString().toInt()
                    val d1 = btn10.text.toString().toInt()
                    val d2 = btn11.text.toString().toInt()
                    val mu1 = btn20.text.toString().toInt()
                    val mu2 = btn21.text.toString().toInt()
                    val di1 = btn30.text.toString().toInt()
                    val di2 = btn31.text.toString().toInt()
                    val mo1 = btn40.text.toString().toInt()
                    val mo2 = btn41.text.toString().toInt()
                    if ((s1 + s2) == txt02.text.toString().toInt())
                        score++
                    if ((d1 - d2) == txt12.text.toString().toInt())
                        score++
                    if ((mu1 * mu2) == txt22.text.toString().toInt())
                        score++
                    if ((di1 / di2) == txt32.text.toString().toInt())
                        score++
                    if ((mo1 % mo2) == txt42.text.toString().toInt())
                        score++
                    if (score > highScore)
                        highScore = score
                    if (score == 5) {
                        v.vibrate(500)
                        Toast.makeText(this, "Great job!", Toast.LENGTH_LONG).show()
                        val passVall = highScore.toString()
                        Intent(this, HomeScreen::class.java).also{
                            it.putExtra("PASSING",passVall)
                            startActivity(it)
                        }
                    } else if (lives > 1) {
                        Toast.makeText(
                            this,
                            "Try Again.\nYour High Score = $highScore",
                            Toast.LENGTH_LONG
                        ).show()
                        lives--
                        txt.text = "Lives Remaining = " + lives.toString()
                        gen(vall)
                    } else {
                        v.vibrate(500)
                        Toast.makeText(this, "Good luck next time.\nYour High Score = $highScore", Toast.LENGTH_LONG).show()
                        val passVall = highScore.toString()
                        Intent(this, HomeScreen::class.java).also{
                            it.putExtra("PASSING",passVall)
                            startActivity(it)
                        }
                    }
                } else {
                    Toast.makeText(this, "Complete the puzzle.", Toast.LENGTH_LONG).show()
                }
            }
        }

        val sum1 = rand(1, 100)
        val sum2 = rand(1, 100)
        var diff1 = rand(1, 100)
        var diff2 = rand(1, 100)
        if (diff1 < diff2) {
            val temp = diff2
            diff2 = diff1
            diff1 = temp
        }
        val prod1 = rand(1, 20)
        val prod2 = rand(1, 20)
        var div1 = rand(1, 50)
        var div2 = rand(1, 50)
        if (div1 < div2) {
            val temp = div2
            div2 = div1
            div1 = temp
        }
        var mod1 = rand(1, 50)
        var mod2 = rand(1, 50)
        if (mod1 < mod2) {
            val temp = mod2
            mod2 = mod1
            mod1 = temp
        }

        val sum = sum1 + sum2
        val diff = diff1 - diff2
        val prod = prod1 * prod2
        val div = div1 / div2
        val mod = mod1 % mod2

        txt02.text = sum.toString()
        txt12.text = diff.toString()
        txt22.text = prod.toString()
        txt32.text = div.toString()
        txt42.text = mod.toString()
        val vall = listOf<Any>(sum1, sum2, diff1, diff2, prod1, prod2, div1, div2, mod1, mod2)
        gen(vall as List<Int>)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val btn00 = findViewById<Button>(R.id.btn00)
        val btn01 = findViewById<Button>(R.id.btn01)
        val btn10 = findViewById<Button>(R.id.btn10)
        val btn11 = findViewById<Button>(R.id.btn11)
        val btn20 = findViewById<Button>(R.id.btn20)
        val btn21 = findViewById<Button>(R.id.btn21)
        val btn30 = findViewById<Button>(R.id.btn30)
        val btn31 = findViewById<Button>(R.id.btn31)
        val btn40 = findViewById<Button>(R.id.btn40)
        val btn41 = findViewById<Button>(R.id.btn41)
        val txt = findViewById<TextView>(R.id.txt)
        val txt02 = findViewById<TextView>(R.id.txt02)
        val txt12 = findViewById<TextView>(R.id.txt12)
        val txt22 = findViewById<TextView>(R.id.txt22)
        val txt32 = findViewById<TextView>(R.id.txt32)
        val txt42 = findViewById<TextView>(R.id.txt42)
        val btn50 = findViewById<Button>(R.id.btn50)
        val btn51 = findViewById<Button>(R.id.btn51)
        val btn52 = findViewById<Button>(R.id.btn52)
        val btn53 = findViewById<Button>(R.id.btn53)
        val btn54 = findViewById<Button>(R.id.btn54)
        val btn60 = findViewById<Button>(R.id.btn60)
        val btn61 = findViewById<Button>(R.id.btn61)
        val btn62 = findViewById<Button>(R.id.btn62)
        val btn63 = findViewById<Button>(R.id.btn63)
        val btn64 = findViewById<Button>(R.id.btn64)

        outState.putString("BTN00",btn00.text.toString())
        outState.putString("BTN01",btn01.text.toString())
        outState.putString("BTN10",btn10.text.toString())
        outState.putString("BTN11",btn11.text.toString())
        outState.putString("BTN20",btn20.text.toString())
        outState.putString("BTN21",btn21.text.toString())
        outState.putString("BTN30",btn30.text.toString())
        outState.putString("BTN31",btn31.text.toString())
        outState.putString("BTN40",btn40.text.toString())
        outState.putString("BTN41",btn41.text.toString())
        outState.putString("BTN50",btn50.text.toString())
        outState.putString("BTN51",btn51.text.toString())
        outState.putString("BTN52",btn52.text.toString())
        outState.putString("BTN53",btn53.text.toString())
        outState.putString("BTN54",btn54.text.toString())
        outState.putString("BTN60",btn60.text.toString())
        outState.putString("BTN61",btn61.text.toString())
        outState.putString("BTN62",btn62.text.toString())
        outState.putString("BTN63",btn63.text.toString())
        outState.putString("BTN64",btn64.text.toString())

        outState.putString("TXT",txt.text.toString())
        outState.putString("TXT02",txt02.text.toString())
        outState.putString("TXT12",txt12.text.toString())
        outState.putString("TXT22",txt22.text.toString())
        outState.putString("TXT32",txt32.text.toString())
        outState.putString("TXT42",txt42.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        val btn00 = findViewById<Button>(R.id.btn00)
        val btn01 = findViewById<Button>(R.id.btn01)
        val btn10 = findViewById<Button>(R.id.btn10)
        val btn11 = findViewById<Button>(R.id.btn11)
        val btn20 = findViewById<Button>(R.id.btn20)
        val btn21 = findViewById<Button>(R.id.btn21)
        val btn30 = findViewById<Button>(R.id.btn30)
        val btn31 = findViewById<Button>(R.id.btn31)
        val btn40 = findViewById<Button>(R.id.btn40)
        val btn41 = findViewById<Button>(R.id.btn41)
        val txt = findViewById<TextView>(R.id.txt)
        val txt02 = findViewById<TextView>(R.id.txt02)
        val txt12 = findViewById<TextView>(R.id.txt12)
        val txt22 = findViewById<TextView>(R.id.txt22)
        val txt32 = findViewById<TextView>(R.id.txt32)
        val txt42 = findViewById<TextView>(R.id.txt42)
        val btn50 = findViewById<Button>(R.id.btn50)
        val btn51 = findViewById<Button>(R.id.btn51)
        val btn52 = findViewById<Button>(R.id.btn52)
        val btn53 = findViewById<Button>(R.id.btn53)
        val btn54 = findViewById<Button>(R.id.btn54)
        val btn60 = findViewById<Button>(R.id.btn60)
        val btn61 = findViewById<Button>(R.id.btn61)
        val btn62 = findViewById<Button>(R.id.btn62)
        val btn63 = findViewById<Button>(R.id.btn63)
        val btn64 = findViewById<Button>(R.id.btn64)

        if (savedInstanceState.getString("BTN00","") == "") {
            btn00.setBackgroundColor(Color.parseColor("#808080"))
            btn00.text = savedInstanceState.getString("BTN00", "")
        }
        else{
            btn00.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btn00.text = savedInstanceState.getString("BTN00","")
        }
        if (savedInstanceState.getString("BTN01","") == "") {
            btn01.setBackgroundColor(Color.parseColor("#808080"))
            btn01.text = savedInstanceState.getString("BTN01","")
        }
        else{
            btn01.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btn01.text = savedInstanceState.getString("BTN01","")
        }
        if (savedInstanceState.getString("BTN10","") == "") {
            btn10.setBackgroundColor(Color.parseColor("#808080"))
            btn10.text = savedInstanceState.getString("BTN10","")
        }
        else{
            btn10.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btn10.text = savedInstanceState.getString("BTN10","")
        }
        if (savedInstanceState.getString("BTN11","") == "") {
            btn11.setBackgroundColor(Color.parseColor("#808080"))
            btn11.text = savedInstanceState.getString("BTN11","")
        }
        else{
            btn11.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btn11.text = savedInstanceState.getString("BTN11","")
        }
        if (savedInstanceState.getString("BTN20","") == "") {
            btn20.setBackgroundColor(Color.parseColor("#808080"))
            btn20.text = savedInstanceState.getString("BTN20","")
        }
        else{
            btn20.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btn20.text = savedInstanceState.getString("BTN20","")
        }
        if (savedInstanceState.getString("BTN21","") == "") {
            btn21.setBackgroundColor(Color.parseColor("#808080"))
            btn21.text = savedInstanceState.getString("BTN21","")
        }
        else{
            btn21.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btn21.text = savedInstanceState.getString("BTN21","")
        }
        if (savedInstanceState.getString("BTN30","") == "") {
            btn30.setBackgroundColor(Color.parseColor("#808080"))
            btn30.text = savedInstanceState.getString("BTN30","")
        }
        else{
            btn30.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btn30.text = savedInstanceState.getString("BTN30","")
        }
        if (savedInstanceState.getString("BTN31","") == "") {
            btn31.setBackgroundColor(Color.parseColor("#808080"))
            btn31.text = savedInstanceState.getString("BTN31","")
        }
        else{
            btn31.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btn31.text = savedInstanceState.getString("BTN31","")
        }
        if (savedInstanceState.getString("BTN40","") == "") {
            btn40.setBackgroundColor(Color.parseColor("#808080"))
            btn40.text = savedInstanceState.getString("BTN40","")
        }
        else{
            btn40.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btn40.text = savedInstanceState.getString("BTN40","")
        }
        if (savedInstanceState.getString("BTN41","") == "") {
            btn41.setBackgroundColor(Color.parseColor("#808080"))
            btn41.text = savedInstanceState.getString("BTN41","")
        }
        else{
            btn41.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btn41.text = savedInstanceState.getString("BTN41","")
        }
        if (savedInstanceState.getString("BTN50","") == "") {
            btn50.setBackgroundColor(Color.parseColor("#808080"))
            btn50.text = savedInstanceState.getString("BTN50","")
        }
        else{
            btn50.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btn50.text = savedInstanceState.getString("BTN50","")
        }
        if (savedInstanceState.getString("BTN51","") == "") {
            btn51.setBackgroundColor(Color.parseColor("#808080"))
            btn51.text = savedInstanceState.getString("BTN51","")
        }
        else{
            btn51.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btn51.text = savedInstanceState.getString("BTN51","")
        }
        if (savedInstanceState.getString("BTN52","") == "") {
            btn52.setBackgroundColor(Color.parseColor("#808080"))
            btn52.text = savedInstanceState.getString("BTN52","")
        }
        else{
            btn52.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btn52.text = savedInstanceState.getString("BTN52","")
        }
        if (savedInstanceState.getString("BTN53","") == "") {
            btn53.setBackgroundColor(Color.parseColor("#808080"))
            btn53.text = savedInstanceState.getString("BTN53","")
        }
        else{
            btn53.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btn53.text = savedInstanceState.getString("BTN53","")
        }
        if (savedInstanceState.getString("BTN54","") == "") {
            btn54.setBackgroundColor(Color.parseColor("#808080"))
            btn54.text = savedInstanceState.getString("BTN54","")
        }
        else{
            btn54.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btn54.text = savedInstanceState.getString("BTN54","")
        }
        if (savedInstanceState.getString("BTN60","") == "") {
            btn60.setBackgroundColor(Color.parseColor("#808080"))
            btn60.text = savedInstanceState.getString("BTN60","")
        }
        else{
            btn60.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btn60.text = savedInstanceState.getString("BTN60","")
        }
        if (savedInstanceState.getString("BTN61","") == "") {
            btn61.setBackgroundColor(Color.parseColor("#808080"))
            btn61.text = savedInstanceState.getString("BTN61","")
        }
        else{
            btn61.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btn61.text = savedInstanceState.getString("BTN61","")
        }
        if (savedInstanceState.getString("BTN62","") == "") {
            btn62.setBackgroundColor(Color.parseColor("#808080"))
            btn62.text = savedInstanceState.getString("BTN62","")
        }
        else{
            btn62.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btn62.text = savedInstanceState.getString("BTN62","")
        }
        if (savedInstanceState.getString("BTN63","") == "") {
            btn63.setBackgroundColor(Color.parseColor("#808080"))
            btn63.text = savedInstanceState.getString("BTN63","")
        }
        else{
            btn63.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btn63.text = savedInstanceState.getString("BTN63","")
        }
        if (savedInstanceState.getString("BTN64","") == "") {
            btn64.setBackgroundColor(Color.parseColor("#808080"))
            btn64.text = savedInstanceState.getString("BTN64","")
        }
        else{
            btn64.setBackgroundColor(Color.parseColor("#FF6200EE"))
            btn64.text = savedInstanceState.getString("BTN64","")
        }
        txt.text = savedInstanceState.getString("TXT","Lives Remaining = 0")
        txt02.text = savedInstanceState.getString("TXT02","0")
        txt12.text = savedInstanceState.getString("TXT12","0")
        txt22.text = savedInstanceState.getString("TXT22","0")
        txt32.text = savedInstanceState.getString("TXT32","0")
        txt42.text = savedInstanceState.getString("TXT42","0")
    }
}