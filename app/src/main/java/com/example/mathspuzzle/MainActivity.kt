package com.example.mathspuzzle

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.Random


val random = Random()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
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
        fun gen(a : Int, vall : List<Int>) {
            if (a == 0) {
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
                val vall =
                    listOf<Any>(sum1, sum2, diff1, diff2, prod1, prod2, div1, div2, mod1, mod2)
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
                var curr: String = ""
                var occupied =
                    mutableListOf<Int>(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
                btn50.setOnClickListener {
                    if (occupied[10] == 1 && curr == "") {
                        curr = btn50.text.toString()
                        occupied[10] = 0
                        btn50.text = ""
                        btn50.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[10] == 0 && curr != "") {
                        btn50.text = curr
                        occupied[10] = 1
                        btn50.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn51.setOnClickListener {
                    if (occupied[11] == 1 && curr == "") {
                        curr = btn51.text.toString()
                        occupied[11] = 0
                        btn51.text = ""
                        btn51.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[11] == 0 && curr != "") {
                        btn51.text = curr
                        occupied[11] = 1
                        btn51.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn52.setOnClickListener {
                    if (occupied[12] == 1 && curr == "") {
                        curr = btn52.text.toString()
                        occupied[12] = 0
                        btn52.text = ""
                        btn52.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[12] == 0 && curr != "") {
                        btn52.text = curr
                        occupied[12] = 1
                        btn52.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn53.setOnClickListener {
                    if (occupied[13] == 1 && curr == "") {
                        curr = btn53.text.toString()
                        occupied[13] = 0
                        btn53.text = ""
                        btn53.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[13] == 0 && curr != "") {
                        btn53.text = curr
                        occupied[13] = 1
                        btn53.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn54.setOnClickListener {
                    if (occupied[14] == 1 && curr == "") {
                        curr = btn54.text.toString()
                        occupied[14] = 0
                        btn54.text = ""
                        btn54.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[14] == 0 && curr != "") {
                        btn54.text = curr
                        occupied[14] = 1
                        btn54.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn60.setOnClickListener {
                    if (occupied[15] == 1 && curr == "") {
                        curr = btn60.text.toString()
                        occupied[15] = 0
                        btn60.text = ""
                        btn60.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[15] == 0 && curr != "") {
                        btn60.text = curr
                        occupied[15] = 1
                        btn60.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn61.setOnClickListener {
                    if (occupied[16] == 1 && curr == "") {
                        curr = btn61.text.toString()
                        occupied[16] = 0
                        btn61.text = ""
                        btn61.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[16] == 0 && curr != "") {
                        btn61.text = curr
                        occupied[16] = 1
                        btn61.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn62.setOnClickListener {
                    if (occupied[17] == 1 && curr == "") {
                        curr = btn62.text.toString()
                        occupied[17] = 0
                        btn62.text = ""
                        btn62.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[17] == 0 && curr != "") {
                        btn62.text = curr
                        occupied[17] = 1
                        btn62.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn63.setOnClickListener {
                    if (occupied[18] == 1 && curr == "") {
                        curr = btn63.text.toString()
                        occupied[18] = 0
                        btn63.text = ""
                        btn63.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[18] == 0 && curr != "") {
                        btn63.text = curr
                        occupied[18] = 1
                        btn63.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn64.setOnClickListener {
                    if (occupied[19] == 1 && curr == "") {
                        curr = btn64.text.toString()
                        occupied[19] = 0
                        btn64.text = ""
                        btn64.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[19] == 0 && curr != "") {
                        btn64.text = curr
                        occupied[19] = 1
                        btn64.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }

                btn00.setOnClickListener {
                    if (occupied[0] == 1 && curr == "") {
                        curr = btn00.text.toString()
                        occupied[0] = 0
                        btn00.text = ""
                        btn00.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[0] == 0 && curr != "") {
                        btn00.text = curr
                        occupied[0] = 1
                        btn00.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn01.setOnClickListener {
                    if (occupied[1] == 1 && curr == "") {
                        curr = btn01.text.toString()
                        occupied[1] = 0
                        btn01.text = ""
                        btn01.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[1] == 0 && curr != "") {
                        btn01.text = curr
                        occupied[1] = 1
                        btn01.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn10.setOnClickListener {
                    if (occupied[2] == 1 && curr == "") {
                        curr = btn10.text.toString()
                        occupied[2] = 0
                        btn10.text = ""
                        btn10.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[2] == 0 && curr != "") {
                        btn10.text = curr
                        occupied[2] = 1
                        btn10.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn11.setOnClickListener {
                    if (occupied[3] == 1 && curr == "") {
                        curr = btn11.text.toString()
                        occupied[3] = 0
                        btn11.text = ""
                        btn11.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[3] == 0 && curr != "") {
                        btn11.text = curr
                        occupied[3] = 1
                        btn11.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn20.setOnClickListener {
                    if (occupied[4] == 1 && curr == "") {
                        curr = btn20.text.toString()
                        occupied[4] = 0
                        btn20.text = ""
                        btn20.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[4] == 0 && curr != "") {
                        btn20.text = curr
                        occupied[4] = 1
                        btn20.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn21.setOnClickListener {
                    if (occupied[5] == 1 && curr == "") {
                        curr = btn21.text.toString()
                        occupied[5] = 0
                        btn21.text = ""
                        btn21.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[5] == 0 && curr != "") {
                        btn21.text = curr
                        occupied[5] = 1
                        btn21.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn30.setOnClickListener {
                    if (occupied[6] == 1 && curr == "") {
                        curr = btn30.text.toString()
                        occupied[6] = 0
                        btn30.text = ""
                        btn30.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[6] == 0 && curr != "") {
                        btn30.text = curr
                        occupied[6] = 1
                        btn30.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn31.setOnClickListener {
                    if (occupied[7] == 1 && curr == "") {
                        curr = btn31.text.toString()
                        occupied[7] = 0
                        btn31.text = ""
                        btn31.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[7] == 0 && curr != "") {
                        btn31.text = curr
                        occupied[7] = 1
                        btn31.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn40.setOnClickListener {
                    if (occupied[8] == 1 && curr == "") {
                        curr = btn40.text.toString()
                        occupied[8] = 0
                        btn40.text = ""
                        btn40.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[8] == 0 && curr != "") {
                        btn40.text = curr
                        occupied[8] = 1
                        btn40.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn41.setOnClickListener {
                    if (occupied[9] == 1 && curr == "") {
                        curr = btn41.text.toString()
                        occupied[9] = 0
                        btn41.text = ""
                        btn41.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[9] == 0 && curr != "") {
                        btn41.text = curr
                        occupied[9] = 1
                        btn41.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn.setOnClickListener {
                    if (occupied[0] == 1 && occupied[1] == 1 && occupied[2] == 1 && occupied[3] == 1 && occupied[4] == 1 && occupied[5] == 1 && occupied[6] == 1 && occupied[7] == 1 && occupied[8] == 1 && occupied[9] == 1) {
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
                            Toast.makeText(this, "Great job!", Toast.LENGTH_LONG).show()
                            highScore = 0
                            gen(0, vall as List<Int>)
                        } else if (lives > 1) {
                            Toast.makeText(
                                this,
                                "Try Again.\nYour High Score = $highScore",
                                Toast.LENGTH_LONG
                            ).show()
                            lives--
                            txt.text = "Lives Remaining = " + lives.toString()
                            gen(1, vall as List<Int>)
                        } else {
                            Toast.makeText(
                                this,
                                "Good luck next time.\nYour High Score = $highScore",
                                Toast.LENGTH_LONG
                            ).show()
                            highScore = 0
                            lives = 3
                            txt.text = "Lives Remaining = " + lives.toString()
                            gen(0, vall as List<Int>)
                        }
                    } else {
                        Toast.makeText(this, "Complete the puzzle", Toast.LENGTH_LONG).show()
                    }
                }
            }
            else {
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
                var curr: String = ""
                var occupied =
                    mutableListOf<Int>(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1)
                btn50.setOnClickListener {
                    if (occupied[10] == 1 && curr == "") {
                        curr = btn50.text.toString()
                        occupied[10] = 0
                        btn50.text = ""
                        btn50.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[10] == 0 && curr != "") {
                        btn50.text = curr
                        occupied[10] = 1
                        btn50.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn51.setOnClickListener {
                    if (occupied[11] == 1 && curr == "") {
                        curr = btn51.text.toString()
                        occupied[11] = 0
                        btn51.text = ""
                        btn51.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[11] == 0 && curr != "") {
                        btn51.text = curr
                        occupied[11] = 1
                        btn51.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn52.setOnClickListener {
                    if (occupied[12] == 1 && curr == "") {
                        curr = btn52.text.toString()
                        occupied[12] = 0
                        btn52.text = ""
                        btn52.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[12] == 0 && curr != "") {
                        btn52.text = curr
                        occupied[12] = 1
                        btn52.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn53.setOnClickListener {
                    if (occupied[13] == 1 && curr == "") {
                        curr = btn53.text.toString()
                        occupied[13] = 0
                        btn53.text = ""
                        btn53.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[13] == 0 && curr != "") {
                        btn53.text = curr
                        occupied[13] = 1
                        btn53.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn54.setOnClickListener {
                    if (occupied[14] == 1 && curr == "") {
                        curr = btn54.text.toString()
                        occupied[14] = 0
                        btn54.text = ""
                        btn54.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[14] == 0 && curr != "") {
                        btn54.text = curr
                        occupied[14] = 1
                        btn54.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn60.setOnClickListener {
                    if (occupied[15] == 1 && curr == "") {
                        curr = btn60.text.toString()
                        occupied[15] = 0
                        btn60.text = ""
                        btn60.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[15] == 0 && curr != "") {
                        btn60.text = curr
                        occupied[15] = 1
                        btn60.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn61.setOnClickListener {
                    if (occupied[16] == 1 && curr == "") {
                        curr = btn61.text.toString()
                        occupied[16] = 0
                        btn61.text = ""
                        btn61.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[16] == 0 && curr != "") {
                        btn61.text = curr
                        occupied[16] = 1
                        btn61.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn62.setOnClickListener {
                    if (occupied[17] == 1 && curr == "") {
                        curr = btn62.text.toString()
                        occupied[17] = 0
                        btn62.text = ""
                        btn62.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[17] == 0 && curr != "") {
                        btn62.text = curr
                        occupied[17] = 1
                        btn62.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn63.setOnClickListener {
                    if (occupied[18] == 1 && curr == "") {
                        curr = btn63.text.toString()
                        occupied[18] = 0
                        btn63.text = ""
                        btn63.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[18] == 0 && curr != "") {
                        btn63.text = curr
                        occupied[18] = 1
                        btn63.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn64.setOnClickListener {
                    if (occupied[19] == 1 && curr == "") {
                        curr = btn64.text.toString()
                        occupied[19] = 0
                        btn64.text = ""
                        btn64.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[19] == 0 && curr != "") {
                        btn64.text = curr
                        occupied[19] = 1
                        btn64.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }

                btn00.setOnClickListener {
                    if (occupied[0] == 1 && curr == "") {
                        curr = btn00.text.toString()
                        occupied[0] = 0
                        btn00.text = ""
                        btn00.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[0] == 0 && curr != "") {
                        btn00.text = curr
                        occupied[0] = 1
                        btn00.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn01.setOnClickListener {
                    if (occupied[1] == 1 && curr == "") {
                        curr = btn01.text.toString()
                        occupied[1] = 0
                        btn01.text = ""
                        btn01.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[1] == 0 && curr != "") {
                        btn01.text = curr
                        occupied[1] = 1
                        btn01.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn10.setOnClickListener {
                    if (occupied[2] == 1 && curr == "") {
                        curr = btn10.text.toString()
                        occupied[2] = 0
                        btn10.text = ""
                        btn10.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[2] == 0 && curr != "") {
                        btn10.text = curr
                        occupied[2] = 1
                        btn10.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn11.setOnClickListener {
                    if (occupied[3] == 1 && curr == "") {
                        curr = btn11.text.toString()
                        occupied[3] = 0
                        btn11.text = ""
                        btn11.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[3] == 0 && curr != "") {
                        btn11.text = curr
                        occupied[3] = 1
                        btn11.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn20.setOnClickListener {
                    if (occupied[4] == 1 && curr == "") {
                        curr = btn20.text.toString()
                        occupied[4] = 0
                        btn20.text = ""
                        btn20.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[4] == 0 && curr != "") {
                        btn20.text = curr
                        occupied[4] = 1
                        btn20.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn21.setOnClickListener {
                    if (occupied[5] == 1 && curr == "") {
                        curr = btn21.text.toString()
                        occupied[5] = 0
                        btn21.text = ""
                        btn21.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[5] == 0 && curr != "") {
                        btn21.text = curr
                        occupied[5] = 1
                        btn21.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn30.setOnClickListener {
                    if (occupied[6] == 1 && curr == "") {
                        curr = btn30.text.toString()
                        occupied[6] = 0
                        btn30.text = ""
                        btn30.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[6] == 0 && curr != "") {
                        btn30.text = curr
                        occupied[6] = 1
                        btn30.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn31.setOnClickListener {
                    if (occupied[7] == 1 && curr == "") {
                        curr = btn31.text.toString()
                        occupied[7] = 0
                        btn31.text = ""
                        btn31.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[7] == 0 && curr != "") {
                        btn31.text = curr
                        occupied[7] = 1
                        btn31.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn40.setOnClickListener {
                    if (occupied[8] == 1 && curr == "") {
                        curr = btn40.text.toString()
                        occupied[8] = 0
                        btn40.text = ""
                        btn40.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[8] == 0 && curr != "") {
                        btn40.text = curr
                        occupied[8] = 1
                        btn40.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn41.setOnClickListener {
                    if (occupied[9] == 1 && curr == "") {
                        curr = btn41.text.toString()
                        occupied[9] = 0
                        btn41.text = ""
                        btn41.setBackgroundColor(Color.parseColor("#808080"))
                    } else if (occupied[9] == 0 && curr != "") {
                        btn41.text = curr
                        occupied[9] = 1
                        btn41.setBackgroundColor(Color.parseColor("#FF6200EE"))
                        curr = ""
                    }
                }
                btn.setOnClickListener {
                    if (occupied[0] == 1 && occupied[1] == 1 && occupied[2] == 1 && occupied[3] == 1 && occupied[4] == 1 && occupied[5] == 1 && occupied[6] == 1 && occupied[7] == 1 && occupied[8] == 1 && occupied[9] == 1) {
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
                            Toast.makeText(this, "Great job!", Toast.LENGTH_LONG).show()
                            highScore = 0
                            gen(0, vall)
                        } else if (lives > 1) {
                            Toast.makeText(
                                this,
                                "Try Again.\nYour High Score = $highScore",
                                Toast.LENGTH_LONG
                            ).show()
                            lives--
                            txt.text = "Lives Remaining = " + lives.toString()
                            gen(1, vall)
                        } else {
                            Toast.makeText(
                                this,
                                "Good luck next time.\nYour High Score = $highScore",
                                Toast.LENGTH_LONG
                            ).show()
                            highScore = 0
                            lives = 3
                            txt.text = "Lives Remaining = " + lives.toString()
                            gen(0, vall)
                        }
                    } else {
                        Toast.makeText(this, "Complete the puzzle", Toast.LENGTH_LONG).show()
                    }
                }
            }
        }
        gen(0, listOf())
    }
}