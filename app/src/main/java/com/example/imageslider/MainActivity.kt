package com.example.imageslider

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.drawable.BitmapDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        arrayOfBitmap()

        button1.setOnClickListener() {
            moveLeft()
        }

        button2.setOnClickListener() {
            moveRight()
        }

        button3.setOnClickListener() {
            moveUp()
        }

        button4.setOnClickListener() {
            moveDown()
        }
    }

    private fun arrayOfBitmap() {
        var myList = ArrayList((1..24).toList())
        myList.shuffle()
        textView1.text = myList[0].toString()
        textView2.text = myList[1].toString()
        textView3.text = myList[2].toString()
        textView4.text = myList[3].toString()
        textView5.text = myList[4].toString()
        textView6.text = myList[5].toString()
        textView7.text = myList[6].toString()
        textView8.text = myList[7].toString()
        textView9.text = myList[8].toString()
        textView10.text = myList[9].toString()
        textView11.text = myList[10].toString()
        textView12.text = myList[11].toString()
        textView13.text = myList[12].toString()
        textView14.text = myList[13].toString()
        textView15.text = myList[14].toString()
        textView16.text = myList[15].toString()
        textView17.text = myList[16].toString()
        textView18.text = myList[17].toString()
        textView19.text = myList[18].toString()
        textView20.text = myList[19].toString()
        textView21.text = myList[20].toString()
        textView22.text = myList[21].toString()
        textView23.text = myList[22].toString()
        textView24.text = myList[23].toString()
        textView25.text = ""

        imageView1()
        imageView2()
        imageView3()
        imageView4()
        imageView5()
        imageView6()
        imageView7()
        imageView8()
        imageView9()
        imageView10()
        imageView11()
        imageView12()
        imageView13()
        imageView14()
        imageView15()
        imageView16()
        imageView17()
        imageView18()
        imageView19()
        imageView20()
        imageView21()
        imageView22()
        imageView23()
        imageView24()

    }

    private fun imageView1() {
        when (textView1.text) {
            "1" -> {
                myImageViewSplit1.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_1))
            }
            "2" -> {
                myImageViewSplit1.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_2))
            }
            "3" -> {
                myImageViewSplit1.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_3))
            }
            "4" -> {
                myImageViewSplit1.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_4))
            }
            "5" -> {
                myImageViewSplit1.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_5))
            }
            "6" -> {
                myImageViewSplit1.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_6))
            }
            "7" -> {
                myImageViewSplit1.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_7))
            }
            "8" -> {
                myImageViewSplit1.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_8))
            }
            "9" -> {
                myImageViewSplit1.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_9))
            }
            "10" -> {
                myImageViewSplit1.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_10))
            }
            "11" -> {
                myImageViewSplit1.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_11))
            }
            "12" -> {
                myImageViewSplit1.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_12))
            }
            "13" -> {
                myImageViewSplit1.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_13))
            }
            "14" -> {
                myImageViewSplit1.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_14))
            }
            "15" -> {
                myImageViewSplit1.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_15))
            }
            "16" -> {
                myImageViewSplit1.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_16))
            }
            "17" -> {
                myImageViewSplit1.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_17))
            }
            "18" -> {
                myImageViewSplit1.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_18))
            }
            "19" -> {
                myImageViewSplit1.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_19))
            }
            "20" -> {
                myImageViewSplit1.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_20))
            }
            "21" -> {
                myImageViewSplit1.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_21))
            }
            "22" -> {
                myImageViewSplit1.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_22))
            }
            "23" -> {
                myImageViewSplit1.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_23))
            }
            "24" -> {
                myImageViewSplit1.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_24))
            }
        }
    }
    private fun imageView2() {
        when (textView2.text) {
            "1" -> {
                myImageViewSplit2.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_1))
            }
            "2" -> {
                myImageViewSplit2.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_2))
            }
            "3" -> {
                myImageViewSplit2.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_3))
            }
            "4" -> {
                myImageViewSplit2.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_4))
            }
            "5" -> {
                myImageViewSplit2.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_5))
            }
            "6" -> {
                myImageViewSplit2.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_6))
            }
            "7" -> {
                myImageViewSplit2.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_7))
            }
            "8" -> {
                myImageViewSplit2.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_8))
            }
            "9" -> {
                myImageViewSplit2.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_9))
            }
            "10" -> {
                myImageViewSplit2.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_10))
            }
            "11" -> {
                myImageViewSplit2.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_11))
            }
            "12" -> {
                myImageViewSplit2.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_12))
            }
            "13" -> {
                myImageViewSplit2.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_13))
            }
            "14" -> {
                myImageViewSplit2.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_14))
            }
            "15" -> {
                myImageViewSplit2.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_15))
            }
            "16" -> {
                myImageViewSplit2.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_16))
            }
            "17" -> {
                myImageViewSplit2.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_17))
            }
            "18" -> {
                myImageViewSplit2.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_18))
            }
            "19" -> {
                myImageViewSplit2.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_19))
            }
            "20" -> {
                myImageViewSplit2.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_20))
            }
            "21" -> {
                myImageViewSplit2.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_21))
            }
            "22" -> {
                myImageViewSplit2.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_22))
            }
            "23" -> {
                myImageViewSplit2.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_23))
            }
            "24" -> {
                myImageViewSplit2.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_24))
            }
        }
    }
    private fun imageView3() {
        when (textView3.text) {
            "1" -> {
                myImageViewSplit3.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_1))
            }
            "2" -> {
                myImageViewSplit3.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_2))
            }
            "3" -> {
                myImageViewSplit3.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_3))
            }
            "4" -> {
                myImageViewSplit3.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_4))
            }
            "5" -> {
                myImageViewSplit3.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_5))
            }
            "6" -> {
                myImageViewSplit3.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_6))
            }
            "7" -> {
                myImageViewSplit3.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_7))
            }
            "8" -> {
                myImageViewSplit3.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_8))
            }
            "9" -> {
                myImageViewSplit3.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_9))
            }
            "10" -> {
                myImageViewSplit3.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_10))
            }
            "11" -> {
                myImageViewSplit3.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_11))
            }
            "12" -> {
                myImageViewSplit3.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_12))
            }
            "13" -> {
                myImageViewSplit3.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_13))
            }
            "14" -> {
                myImageViewSplit3.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_14))
            }
            "15" -> {
                myImageViewSplit3.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_15))
            }
            "16" -> {
                myImageViewSplit3.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_16))
            }
            "17" -> {
                myImageViewSplit3.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_17))
            }
            "18" -> {
                myImageViewSplit3.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_18))
            }
            "19" -> {
                myImageViewSplit3.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_19))
            }
            "20" -> {
                myImageViewSplit3.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_20))
            }
            "21" -> {
                myImageViewSplit3.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_21))
            }
            "22" -> {
                myImageViewSplit3.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_22))
            }
            "23" -> {
                myImageViewSplit3.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_23))
            }
            "24" -> {
                myImageViewSplit3.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_24))
            }
        }
    }
    private fun imageView4() {
        when (textView4.text) {
            "1" -> {
                myImageViewSplit4.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_1))
            }
            "2" -> {
                myImageViewSplit4.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_2))
            }
            "3" -> {
                myImageViewSplit4.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_3))
            }
            "4" -> {
                myImageViewSplit4.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_4))
            }
            "5" -> {
                myImageViewSplit4.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_5))
            }
            "6" -> {
                myImageViewSplit4.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_6))
            }
            "7" -> {
                myImageViewSplit4.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_7))
            }
            "8" -> {
                myImageViewSplit4.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_8))
            }
            "9" -> {
                myImageViewSplit4.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_9))
            }
            "10" -> {
                myImageViewSplit4.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_10))
            }
            "11" -> {
                myImageViewSplit4.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_11))
            }
            "12" -> {
                myImageViewSplit4.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_12))
            }
            "13" -> {
                myImageViewSplit4.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_13))
            }
            "14" -> {
                myImageViewSplit4.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_14))
            }
            "15" -> {
                myImageViewSplit4.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_15))
            }
            "16" -> {
                myImageViewSplit4.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_16))
            }
            "17" -> {
                myImageViewSplit4.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_17))
            }
            "18" -> {
                myImageViewSplit4.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_18))
            }
            "19" -> {
                myImageViewSplit4.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_19))
            }
            "20" -> {
                myImageViewSplit4.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_20))
            }
            "21" -> {
                myImageViewSplit4.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_21))
            }
            "22" -> {
                myImageViewSplit4.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_22))
            }
            "23" -> {
                myImageViewSplit4.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_23))
            }
            "24" -> {
                myImageViewSplit4.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_24))
            }
        }
    }
    private fun imageView5() {
        when (textView5.text) {
            "1" -> {
                myImageViewSplit5.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_1))
            }
            "2" -> {
                myImageViewSplit5.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_2))
            }
            "3" -> {
                myImageViewSplit5.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_3))
            }
            "4" -> {
                myImageViewSplit5.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_4))
            }
            "5" -> {
                myImageViewSplit5.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_5))
            }
            "6" -> {
                myImageViewSplit5.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_6))
            }
            "7" -> {
                myImageViewSplit5.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_7))
            }
            "8" -> {
                myImageViewSplit5.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_8))
            }
            "9" -> {
                myImageViewSplit5.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_9))
            }
            "10" -> {
                myImageViewSplit5.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_10))
            }
            "11" -> {
                myImageViewSplit5.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_11))
            }
            "12" -> {
                myImageViewSplit5.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_12))
            }
            "13" -> {
                myImageViewSplit5.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_13))
            }
            "14" -> {
                myImageViewSplit5.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_14))
            }
            "15" -> {
                myImageViewSplit5.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_15))
            }
            "16" -> {
                myImageViewSplit5.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_16))
            }
            "17" -> {
                myImageViewSplit5.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_17))
            }
            "18" -> {
                myImageViewSplit5.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_18))
            }
            "19" -> {
                myImageViewSplit5.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_19))
            }
            "20" -> {
                myImageViewSplit5.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_20))
            }
            "21" -> {
                myImageViewSplit5.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_21))
            }
            "22" -> {
                myImageViewSplit5.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_22))
            }
            "23" -> {
                myImageViewSplit5.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_23))
            }
            "24" -> {
                myImageViewSplit5.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_24))
            }
        }
    }
    private fun imageView6() {
        when (textView6.text) {
            "1" -> {
                myImageViewSplit6.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_1))
            }
            "2" -> {
                myImageViewSplit6.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_2))
            }
            "3" -> {
                myImageViewSplit6.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_3))
            }
            "4" -> {
                myImageViewSplit6.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_4))
            }
            "5" -> {
                myImageViewSplit6.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_5))
            }
            "6" -> {
                myImageViewSplit6.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_6))
            }
            "7" -> {
                myImageViewSplit6.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_7))
            }
            "8" -> {
                myImageViewSplit6.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_8))
            }
            "9" -> {
                myImageViewSplit6.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_9))
            }
            "10" -> {
                myImageViewSplit6.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_10))
            }
            "11" -> {
                myImageViewSplit6.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_11))
            }
            "12" -> {
                myImageViewSplit6.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_12))
            }
            "13" -> {
                myImageViewSplit6.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_13))
            }
            "14" -> {
                myImageViewSplit6.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_14))
            }
            "15" -> {
                myImageViewSplit6.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_15))
            }
            "16" -> {
                myImageViewSplit6.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_16))
            }
            "17" -> {
                myImageViewSplit6.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_17))
            }
            "18" -> {
                myImageViewSplit6.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_18))
            }
            "19" -> {
                myImageViewSplit6.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_19))
            }
            "20" -> {
                myImageViewSplit6.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_20))
            }
            "21" -> {
                myImageViewSplit6.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_21))
            }
            "22" -> {
                myImageViewSplit6.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_22))
            }
            "23" -> {
                myImageViewSplit6.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_23))
            }
            "24" -> {
                myImageViewSplit6.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_24))
            }
        }
    }
    private fun imageView7() {
        when (textView7.text) {
            "1" -> {
                myImageViewSplit7.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_1))
            }
            "2" -> {
                myImageViewSplit7.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_2))
            }
            "3" -> {
                myImageViewSplit7.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_3))
            }
            "4" -> {
                myImageViewSplit7.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_4))
            }
            "5" -> {
                myImageViewSplit7.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_5))
            }
            "6" -> {
                myImageViewSplit7.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_6))
            }
            "7" -> {
                myImageViewSplit7.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_7))
            }
            "8" -> {
                myImageViewSplit7.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_8))
            }
            "9" -> {
                myImageViewSplit7.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_9))
            }
            "10" -> {
                myImageViewSplit7.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_10))
            }
            "11" -> {
                myImageViewSplit7.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_11))
            }
            "12" -> {
                myImageViewSplit7.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_12))
            }
            "13" -> {
                myImageViewSplit7.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_13))
            }
            "14" -> {
                myImageViewSplit7.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_14))
            }
            "15" -> {
                myImageViewSplit7.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_15))
            }
            "16" -> {
                myImageViewSplit7.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_16))
            }
            "17" -> {
                myImageViewSplit7.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_17))
            }
            "18" -> {
                myImageViewSplit7.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_18))
            }
            "19" -> {
                myImageViewSplit7.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_19))
            }
            "20" -> {
                myImageViewSplit7.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_20))
            }
            "21" -> {
                myImageViewSplit7.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_21))
            }
            "22" -> {
                myImageViewSplit7.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_22))
            }
            "23" -> {
                myImageViewSplit7.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_23))
            }
            "24" -> {
                myImageViewSplit7.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_24))
            }
        }
    }
    private fun imageView8() {
        when (textView8.text) {
            "1" -> {
                myImageViewSplit8.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_1))
            }
            "2" -> {
                myImageViewSplit8.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_2))
            }
            "3" -> {
                myImageViewSplit8.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_3))
            }
            "4" -> {
                myImageViewSplit8.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_4))
            }
            "5" -> {
                myImageViewSplit8.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_5))
            }
            "6" -> {
                myImageViewSplit8.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_6))
            }
            "7" -> {
                myImageViewSplit8.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_7))
            }
            "8" -> {
                myImageViewSplit8.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_8))
            }
            "9" -> {
                myImageViewSplit8.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_9))
            }
            "10" -> {
                myImageViewSplit8.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_10))
            }
            "11" -> {
                myImageViewSplit8.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_11))
            }
            "12" -> {
                myImageViewSplit8.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_12))
            }
            "13" -> {
                myImageViewSplit8.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_13))
            }
            "14" -> {
                myImageViewSplit8.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_14))
            }
            "15" -> {
                myImageViewSplit8.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_15))
            }
            "16" -> {
                myImageViewSplit8.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_16))
            }
            "17" -> {
                myImageViewSplit8.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_17))
            }
            "18" -> {
                myImageViewSplit8.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_18))
            }
            "19" -> {
                myImageViewSplit8.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_19))
            }
            "20" -> {
                myImageViewSplit8.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_20))
            }
            "21" -> {
                myImageViewSplit8.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_21))
            }
            "22" -> {
                myImageViewSplit8.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_22))
            }
            "23" -> {
                myImageViewSplit8.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_23))
            }
            "24" -> {
                myImageViewSplit8.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_24))
            }
        }
    }
    private fun imageView9() {
        when (textView9.text) {
            "1" -> {
                myImageViewSplit9.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_1))
            }
            "2" -> {
                myImageViewSplit9.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_2))
            }
            "3" -> {
                myImageViewSplit9.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_3))
            }
            "4" -> {
                myImageViewSplit9.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_4))
            }
            "5" -> {
                myImageViewSplit9.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_5))
            }
            "6" -> {
                myImageViewSplit9.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_6))
            }
            "7" -> {
                myImageViewSplit9.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_7))
            }
            "8" -> {
                myImageViewSplit9.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_8))
            }
            "9" -> {
                myImageViewSplit9.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_9))
            }
            "10" -> {
                myImageViewSplit9.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_10))
            }
            "11" -> {
                myImageViewSplit9.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_11))
            }
            "12" -> {
                myImageViewSplit9.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_12))
            }
            "13" -> {
                myImageViewSplit9.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_13))
            }
            "14" -> {
                myImageViewSplit9.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_14))
            }
            "15" -> {
                myImageViewSplit9.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_15))
            }
            "16" -> {
                myImageViewSplit9.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_16))
            }
            "17" -> {
                myImageViewSplit9.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_17))
            }
            "18" -> {
                myImageViewSplit9.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_18))
            }
            "19" -> {
                myImageViewSplit9.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_19))
            }
            "20" -> {
                myImageViewSplit9.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_20))
            }
            "21" -> {
                myImageViewSplit9.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_21))
            }
            "22" -> {
                myImageViewSplit9.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_22))
            }
            "23" -> {
                myImageViewSplit9.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_23))
            }
            "24" -> {
                myImageViewSplit9.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_24))
            }
        }
    }
    private fun imageView10() {
        when (textView10.text) {
            "1" -> {
                myImageViewSplit10.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_1))
            }
            "2" -> {
                myImageViewSplit10.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_2))
            }
            "3" -> {
                myImageViewSplit10.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_3))
            }
            "4" -> {
                myImageViewSplit10.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_4))
            }
            "5" -> {
                myImageViewSplit10.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_5))
            }
            "6" -> {
                myImageViewSplit10.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_6))
            }
            "7" -> {
                myImageViewSplit10.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_7))
            }
            "8" -> {
                myImageViewSplit10.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_8))
            }
            "9" -> {
                myImageViewSplit10.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_9))
            }
            "10" -> {
                myImageViewSplit10.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_10))
            }
            "11" -> {
                myImageViewSplit10.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_11))
            }
            "12" -> {
                myImageViewSplit10.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_12))
            }
            "13" -> {
                myImageViewSplit10.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_13))
            }
            "14" -> {
                myImageViewSplit10.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_14))
            }
            "15" -> {
                myImageViewSplit10.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_15))
            }
            "16" -> {
                myImageViewSplit10.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_16))
            }
            "17" -> {
                myImageViewSplit10.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_17))
            }
            "18" -> {
                myImageViewSplit10.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_18))
            }
            "19" -> {
                myImageViewSplit10.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_19))
            }
            "20" -> {
                myImageViewSplit10.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_20))
            }
            "21" -> {
                myImageViewSplit10.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_21))
            }
            "22" -> {
                myImageViewSplit10.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_22))
            }
            "23" -> {
                myImageViewSplit10.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_23))
            }
            "24" -> {
                myImageViewSplit10.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_24))
            }
        }
    }
    private fun imageView11() {
        when (textView11.text) {
            "1" -> {
                myImageViewSplit11.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_1))
            }
            "2" -> {
                myImageViewSplit11.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_2))
            }
            "3" -> {
                myImageViewSplit11.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_3))
            }
            "4" -> {
                myImageViewSplit11.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_4))
            }
            "5" -> {
                myImageViewSplit11.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_5))
            }
            "6" -> {
                myImageViewSplit11.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_6))
            }
            "7" -> {
                myImageViewSplit11.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_7))
            }
            "8" -> {
                myImageViewSplit11.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_8))
            }
            "9" -> {
                myImageViewSplit11.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_9))
            }
            "10" -> {
                myImageViewSplit11.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_10))
            }
            "11" -> {
                myImageViewSplit11.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_11))
            }
            "12" -> {
                myImageViewSplit11.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_12))
            }
            "13" -> {
                myImageViewSplit11.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_13))
            }
            "14" -> {
                myImageViewSplit11.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_14))
            }
            "15" -> {
                myImageViewSplit11.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_15))
            }
            "16" -> {
                myImageViewSplit11.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_16))
            }
            "17" -> {
                myImageViewSplit11.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_17))
            }
            "18" -> {
                myImageViewSplit11.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_18))
            }
            "19" -> {
                myImageViewSplit11.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_19))
            }
            "20" -> {
                myImageViewSplit11.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_20))
            }
            "21" -> {
                myImageViewSplit11.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_21))
            }
            "22" -> {
                myImageViewSplit11.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_22))
            }
            "23" -> {
                myImageViewSplit11.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_23))
            }
            "24" -> {
                myImageViewSplit11.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_24))
            }
        }
    }
    private fun imageView12() {
        when (textView12.text) {
            "1" -> {
                myImageViewSplit12.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_1))
            }
            "2" -> {
                myImageViewSplit12.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_2))
            }
            "3" -> {
                myImageViewSplit12.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_3))
            }
            "4" -> {
                myImageViewSplit12.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_4))
            }
            "5" -> {
                myImageViewSplit12.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_5))
            }
            "6" -> {
                myImageViewSplit12.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_6))
            }
            "7" -> {
                myImageViewSplit12.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_7))
            }
            "8" -> {
                myImageViewSplit12.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_8))
            }
            "9" -> {
                myImageViewSplit12.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_9))
            }
            "10" -> {
                myImageViewSplit12.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_10))
            }
            "11" -> {
                myImageViewSplit12.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_11))
            }
            "12" -> {
                myImageViewSplit12.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_12))
            }
            "13" -> {
                myImageViewSplit12.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_13))
            }
            "14" -> {
                myImageViewSplit12.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_14))
            }
            "15" -> {
                myImageViewSplit12.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_15))
            }
            "16" -> {
                myImageViewSplit12.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_16))
            }
            "17" -> {
                myImageViewSplit12.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_17))
            }
            "18" -> {
                myImageViewSplit12.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_18))
            }
            "19" -> {
                myImageViewSplit12.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_19))
            }
            "20" -> {
                myImageViewSplit12.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_20))
            }
            "21" -> {
                myImageViewSplit12.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_21))
            }
            "22" -> {
                myImageViewSplit12.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_22))
            }
            "23" -> {
                myImageViewSplit12.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_23))
            }
            "24" -> {
                myImageViewSplit12.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_24))
            }
        }
    }
    private fun imageView13() {
        when (textView13.text) {
            "1" -> {
                myImageViewSplit13.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_1))
            }
            "2" -> {
                myImageViewSplit13.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_2))
            }
            "3" -> {
                myImageViewSplit13.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_3))
            }
            "4" -> {
                myImageViewSplit13.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_4))
            }
            "5" -> {
                myImageViewSplit13.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_5))
            }
            "6" -> {
                myImageViewSplit13.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_6))
            }
            "7" -> {
                myImageViewSplit13.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_7))
            }
            "8" -> {
                myImageViewSplit13.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_8))
            }
            "9" -> {
                myImageViewSplit13.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_9))
            }
            "10" -> {
                myImageViewSplit13.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_10))
            }
            "11" -> {
                myImageViewSplit13.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_11))
            }
            "12" -> {
                myImageViewSplit13.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_12))
            }
            "13" -> {
                myImageViewSplit13.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_13))
            }
            "14" -> {
                myImageViewSplit13.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_14))
            }
            "15" -> {
                myImageViewSplit13.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_15))
            }
            "16" -> {
                myImageViewSplit13.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_16))
            }
            "17" -> {
                myImageViewSplit13.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_17))
            }
            "18" -> {
                myImageViewSplit13.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_18))
            }
            "19" -> {
                myImageViewSplit13.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_19))
            }
            "20" -> {
                myImageViewSplit13.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_20))
            }
            "21" -> {
                myImageViewSplit13.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_21))
            }
            "22" -> {
                myImageViewSplit13.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_22))
            }
            "23" -> {
                myImageViewSplit13.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_23))
            }
            "24" -> {
                myImageViewSplit13.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_24))
            }
        }
    }
    private fun imageView14() {
        when (textView14.text) {
            "1" -> {
                myImageViewSplit14.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_1))
            }
            "2" -> {
                myImageViewSplit14.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_2))
            }
            "3" -> {
                myImageViewSplit14.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_3))
            }
            "4" -> {
                myImageViewSplit14.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_4))
            }
            "5" -> {
                myImageViewSplit14.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_5))
            }
            "6" -> {
                myImageViewSplit14.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_6))
            }
            "7" -> {
                myImageViewSplit14.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_7))
            }
            "8" -> {
                myImageViewSplit14.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_8))
            }
            "9" -> {
                myImageViewSplit14.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_9))
            }
            "10" -> {
                myImageViewSplit14.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_10))
            }
            "11" -> {
                myImageViewSplit14.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_11))
            }
            "12" -> {
                myImageViewSplit14.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_12))
            }
            "13" -> {
                myImageViewSplit14.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_13))
            }
            "14" -> {
                myImageViewSplit14.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_14))
            }
            "15" -> {
                myImageViewSplit14.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_15))
            }
            "16" -> {
                myImageViewSplit14.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_16))
            }
            "17" -> {
                myImageViewSplit14.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_17))
            }
            "18" -> {
                myImageViewSplit14.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_18))
            }
            "19" -> {
                myImageViewSplit14.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_19))
            }
            "20" -> {
                myImageViewSplit14.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_20))
            }
            "21" -> {
                myImageViewSplit14.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_21))
            }
            "22" -> {
                myImageViewSplit14.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_22))
            }
            "23" -> {
                myImageViewSplit14.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_23))
            }
            "24" -> {
                myImageViewSplit14.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_24))
            }
        }
    }
    private fun imageView15() {
        when (textView15.text) {
            "1" -> {
                myImageViewSplit15.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_1))
            }
            "2" -> {
                myImageViewSplit15.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_2))
            }
            "3" -> {
                myImageViewSplit15.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_3))
            }
            "4" -> {
                myImageViewSplit15.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_4))
            }
            "5" -> {
                myImageViewSplit15.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_5))
            }
            "6" -> {
                myImageViewSplit15.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_6))
            }
            "7" -> {
                myImageViewSplit15.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_7))
            }
            "8" -> {
                myImageViewSplit15.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_8))
            }
            "9" -> {
                myImageViewSplit15.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_9))
            }
            "10" -> {
                myImageViewSplit15.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_10))
            }
            "11" -> {
                myImageViewSplit15.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_11))
            }
            "12" -> {
                myImageViewSplit15.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_12))
            }
            "13" -> {
                myImageViewSplit15.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_13))
            }
            "14" -> {
                myImageViewSplit15.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_14))
            }
            "15" -> {
                myImageViewSplit15.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_15))
            }
            "16" -> {
                myImageViewSplit15.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_16))
            }
            "17" -> {
                myImageViewSplit15.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_17))
            }
            "18" -> {
                myImageViewSplit15.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_18))
            }
            "19" -> {
                myImageViewSplit15.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_19))
            }
            "20" -> {
                myImageViewSplit15.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_20))
            }
            "21" -> {
                myImageViewSplit15.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_21))
            }
            "22" -> {
                myImageViewSplit15.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_22))
            }
            "23" -> {
                myImageViewSplit15.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_23))
            }
            "24" -> {
                myImageViewSplit15.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_24))
            }
        }
    }
    private fun imageView16() {
        when (textView16.text) {
            "1" -> {
                myImageViewSplit16.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_1))
            }
            "2" -> {
                myImageViewSplit16.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_2))
            }
            "3" -> {
                myImageViewSplit16.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_3))
            }
            "4" -> {
                myImageViewSplit16.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_4))
            }
            "5" -> {
                myImageViewSplit16.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_5))
            }
            "6" -> {
                myImageViewSplit16.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_6))
            }
            "7" -> {
                myImageViewSplit16.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_7))
            }
            "8" -> {
                myImageViewSplit16.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_8))
            }
            "9" -> {
                myImageViewSplit16.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_9))
            }
            "10" -> {
                myImageViewSplit16.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_10))
            }
            "11" -> {
                myImageViewSplit16.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_11))
            }
            "12" -> {
                myImageViewSplit16.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_12))
            }
            "13" -> {
                myImageViewSplit16.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_13))
            }
            "14" -> {
                myImageViewSplit16.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_14))
            }
            "15" -> {
                myImageViewSplit16.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_15))
            }
            "16" -> {
                myImageViewSplit16.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_16))
            }
            "17" -> {
                myImageViewSplit16.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_17))
            }
            "18" -> {
                myImageViewSplit16.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_18))
            }
            "19" -> {
                myImageViewSplit16.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_19))
            }
            "20" -> {
                myImageViewSplit16.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_20))
            }
            "21" -> {
                myImageViewSplit16.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_21))
            }
            "22" -> {
                myImageViewSplit16.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_22))
            }
            "23" -> {
                myImageViewSplit16.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_23))
            }
            "24" -> {
                myImageViewSplit16.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_24))
            }
        }
    }
    private fun imageView17() {
        when (textView17.text) {
            "1" -> {
                myImageViewSplit17.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_1))
            }
            "2" -> {
                myImageViewSplit17.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_2))
            }
            "3" -> {
                myImageViewSplit17.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_3))
            }
            "4" -> {
                myImageViewSplit17.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_4))
            }
            "5" -> {
                myImageViewSplit17.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_5))
            }
            "6" -> {
                myImageViewSplit17.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_6))
            }
            "7" -> {
                myImageViewSplit17.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_7))
            }
            "8" -> {
                myImageViewSplit17.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_8))
            }
            "9" -> {
                myImageViewSplit17.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_9))
            }
            "10" -> {
                myImageViewSplit17.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_10))
            }
            "11" -> {
                myImageViewSplit17.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_11))
            }
            "12" -> {
                myImageViewSplit17.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_12))
            }
            "13" -> {
                myImageViewSplit17.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_13))
            }
            "14" -> {
                myImageViewSplit17.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_14))
            }
            "15" -> {
                myImageViewSplit17.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_15))
            }
            "16" -> {
                myImageViewSplit17.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_16))
            }
            "17" -> {
                myImageViewSplit17.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_17))
            }
            "18" -> {
                myImageViewSplit17.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_18))
            }
            "19" -> {
                myImageViewSplit17.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_19))
            }
            "20" -> {
                myImageViewSplit17.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_20))
            }
            "21" -> {
                myImageViewSplit17.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_21))
            }
            "22" -> {
                myImageViewSplit17.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_22))
            }
            "23" -> {
                myImageViewSplit17.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_23))
            }
            "24" -> {
                myImageViewSplit17.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_24))
            }
        }
    }
    private fun imageView18() {
        when (textView18.text) {
            "1" -> {
                myImageViewSplit18.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_1))
            }
            "2" -> {
                myImageViewSplit18.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_2))
            }
            "3" -> {
                myImageViewSplit18.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_3))
            }
            "4" -> {
                myImageViewSplit18.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_4))
            }
            "5" -> {
                myImageViewSplit18.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_5))
            }
            "6" -> {
                myImageViewSplit18.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_6))
            }
            "7" -> {
                myImageViewSplit18.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_7))
            }
            "8" -> {
                myImageViewSplit18.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_8))
            }
            "9" -> {
                myImageViewSplit18.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_9))
            }
            "10" -> {
                myImageViewSplit18.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_10))
            }
            "11" -> {
                myImageViewSplit18.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_11))
            }
            "12" -> {
                myImageViewSplit18.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_12))
            }
            "13" -> {
                myImageViewSplit18.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_13))
            }
            "14" -> {
                myImageViewSplit18.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_14))
            }
            "15" -> {
                myImageViewSplit18.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_15))
            }
            "16" -> {
                myImageViewSplit18.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_16))
            }
            "17" -> {
                myImageViewSplit18.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_17))
            }
            "18" -> {
                myImageViewSplit18.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_18))
            }
            "19" -> {
                myImageViewSplit18.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_19))
            }
            "20" -> {
                myImageViewSplit18.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_20))
            }
            "21" -> {
                myImageViewSplit18.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_21))
            }
            "22" -> {
                myImageViewSplit18.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_22))
            }
            "23" -> {
                myImageViewSplit18.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_23))
            }
            "24" -> {
                myImageViewSplit18.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_24))
            }
        }
    }
    private fun imageView19() {
        when (textView19.text) {
            "1" -> {
                myImageViewSplit19.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_1))
            }
            "2" -> {
                myImageViewSplit19.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_2))
            }
            "3" -> {
                myImageViewSplit19.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_3))
            }
            "4" -> {
                myImageViewSplit19.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_4))
            }
            "5" -> {
                myImageViewSplit19.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_5))
            }
            "6" -> {
                myImageViewSplit19.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_6))
            }
            "7" -> {
                myImageViewSplit19.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_7))
            }
            "8" -> {
                myImageViewSplit19.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_8))
            }
            "9" -> {
                myImageViewSplit19.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_9))
            }
            "10" -> {
                myImageViewSplit19.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_10))
            }
            "11" -> {
                myImageViewSplit19.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_11))
            }
            "12" -> {
                myImageViewSplit19.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_12))
            }
            "13" -> {
                myImageViewSplit19.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_13))
            }
            "14" -> {
                myImageViewSplit19.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_14))
            }
            "15" -> {
                myImageViewSplit19.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_15))
            }
            "16" -> {
                myImageViewSplit19.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_16))
            }
            "17" -> {
                myImageViewSplit19.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_17))
            }
            "18" -> {
                myImageViewSplit19.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_18))
            }
            "19" -> {
                myImageViewSplit19.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_19))
            }
            "20" -> {
                myImageViewSplit19.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_20))
            }
            "21" -> {
                myImageViewSplit19.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_21))
            }
            "22" -> {
                myImageViewSplit19.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_22))
            }
            "23" -> {
                myImageViewSplit19.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_23))
            }
            "24" -> {
                myImageViewSplit19.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_24))
            }
        }
    }
    private fun imageView20() {
        when (textView20.text) {
            "1" -> {
                myImageViewSplit20.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_1))
            }
            "2" -> {
                myImageViewSplit20.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_2))
            }
            "3" -> {
                myImageViewSplit20.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_3))
            }
            "4" -> {
                myImageViewSplit20.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_4))
            }
            "5" -> {
                myImageViewSplit20.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_5))
            }
            "6" -> {
                myImageViewSplit20.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_6))
            }
            "7" -> {
                myImageViewSplit20.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_7))
            }
            "8" -> {
                myImageViewSplit20.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_8))
            }
            "9" -> {
                myImageViewSplit20.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_9))
            }
            "10" -> {
                myImageViewSplit20.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_10))
            }
            "11" -> {
                myImageViewSplit20.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_11))
            }
            "12" -> {
                myImageViewSplit20.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_12))
            }
            "13" -> {
                myImageViewSplit20.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_13))
            }
            "14" -> {
                myImageViewSplit20.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_14))
            }
            "15" -> {
                myImageViewSplit20.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_15))
            }
            "16" -> {
                myImageViewSplit20.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_16))
            }
            "17" -> {
                myImageViewSplit20.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_17))
            }
            "18" -> {
                myImageViewSplit20.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_18))
            }
            "19" -> {
                myImageViewSplit20.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_19))
            }
            "20" -> {
                myImageViewSplit20.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_20))
            }
            "21" -> {
                myImageViewSplit20.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_21))
            }
            "22" -> {
                myImageViewSplit20.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_22))
            }
            "23" -> {
                myImageViewSplit20.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_23))
            }
            "24" -> {
                myImageViewSplit20.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_24))
            }
        }
    }
    private fun imageView21() {
        when (textView21.text) {
            "1" -> {
                myImageViewSplit21.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_1))
            }
            "2" -> {
                myImageViewSplit21.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_2))
            }
            "3" -> {
                myImageViewSplit21.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_3))
            }
            "4" -> {
                myImageViewSplit21.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_4))
            }
            "5" -> {
                myImageViewSplit21.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_5))
            }
            "6" -> {
                myImageViewSplit21.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_6))
            }
            "7" -> {
                myImageViewSplit21.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_7))
            }
            "8" -> {
                myImageViewSplit21.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_8))
            }
            "9" -> {
                myImageViewSplit21.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_9))
            }
            "10" -> {
                myImageViewSplit21.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_10))
            }
            "11" -> {
                myImageViewSplit21.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_11))
            }
            "12" -> {
                myImageViewSplit21.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_12))
            }
            "13" -> {
                myImageViewSplit21.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_13))
            }
            "14" -> {
                myImageViewSplit21.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_14))
            }
            "15" -> {
                myImageViewSplit21.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_15))
            }
            "16" -> {
                myImageViewSplit21.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_16))
            }
            "17" -> {
                myImageViewSplit21.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_17))
            }
            "18" -> {
                myImageViewSplit21.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_18))
            }
            "19" -> {
                myImageViewSplit21.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_19))
            }
            "20" -> {
                myImageViewSplit21.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_20))
            }
            "21" -> {
                myImageViewSplit21.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_21))
            }
            "22" -> {
                myImageViewSplit21.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_22))
            }
            "23" -> {
                myImageViewSplit21.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_23))
            }
            "24" -> {
                myImageViewSplit21.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_24))
            }
        }
    }
    private fun imageView22() {
        when (textView22.text) {
            "1" -> {
                myImageViewSplit22.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_1))
            }
            "2" -> {
                myImageViewSplit22.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_2))
            }
            "3" -> {
                myImageViewSplit22.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_3))
            }
            "4" -> {
                myImageViewSplit22.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_4))
            }
            "5" -> {
                myImageViewSplit22.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_5))
            }
            "6" -> {
                myImageViewSplit22.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_6))
            }
            "7" -> {
                myImageViewSplit22.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_7))
            }
            "8" -> {
                myImageViewSplit22.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_8))
            }
            "9" -> {
                myImageViewSplit22.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_9))
            }
            "10" -> {
                myImageViewSplit22.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_10))
            }
            "11" -> {
                myImageViewSplit22.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_11))
            }
            "12" -> {
                myImageViewSplit22.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_12))
            }
            "13" -> {
                myImageViewSplit22.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_13))
            }
            "14" -> {
                myImageViewSplit22.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_14))
            }
            "15" -> {
                myImageViewSplit22.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_15))
            }
            "16" -> {
                myImageViewSplit22.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_16))
            }
            "17" -> {
                myImageViewSplit22.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_17))
            }
            "18" -> {
                myImageViewSplit22.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_18))
            }
            "19" -> {
                myImageViewSplit22.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_19))
            }
            "20" -> {
                myImageViewSplit22.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_20))
            }
            "21" -> {
                myImageViewSplit22.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_21))
            }
            "22" -> {
                myImageViewSplit22.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_22))
            }
            "23" -> {
                myImageViewSplit22.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_23))
            }
            "24" -> {
                myImageViewSplit22.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_24))
            }
        }
    }
    private fun imageView23() {
        when (textView23.text) {
            "1" -> {
                myImageViewSplit23.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_1))
            }
            "2" -> {
                myImageViewSplit23.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_2))
            }
            "3" -> {
                myImageViewSplit23.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_3))
            }
            "4" -> {
                myImageViewSplit23.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_4))
            }
            "5" -> {
                myImageViewSplit23.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_5))
            }
            "6" -> {
                myImageViewSplit23.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_6))
            }
            "7" -> {
                myImageViewSplit23.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_7))
            }
            "8" -> {
                myImageViewSplit23.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_8))
            }
            "9" -> {
                myImageViewSplit23.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_9))
            }
            "10" -> {
                myImageViewSplit23.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_10))
            }
            "11" -> {
                myImageViewSplit23.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_11))
            }
            "12" -> {
                myImageViewSplit23.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_12))
            }
            "13" -> {
                myImageViewSplit23.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_13))
            }
            "14" -> {
                myImageViewSplit23.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_14))
            }
            "15" -> {
                myImageViewSplit23.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_15))
            }
            "16" -> {
                myImageViewSplit23.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_16))
            }
            "17" -> {
                myImageViewSplit23.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_17))
            }
            "18" -> {
                myImageViewSplit23.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_18))
            }
            "19" -> {
                myImageViewSplit23.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_19))
            }
            "20" -> {
                myImageViewSplit23.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_20))
            }
            "21" -> {
                myImageViewSplit23.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_21))
            }
            "22" -> {
                myImageViewSplit23.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_22))
            }
            "23" -> {
                myImageViewSplit23.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_23))
            }
            "24" -> {
                myImageViewSplit23.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_24))
            }
        }
    }
    private fun imageView24() {
        when (textView24.text) {
            "1" -> {
                myImageViewSplit24.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_1))
            }
            "2" -> {
                myImageViewSplit24.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_2))
            }
            "3" -> {
                myImageViewSplit24.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_3))
            }
            "4" -> {
                myImageViewSplit24.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_4))
            }
            "5" -> {
                myImageViewSplit24.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_5))
            }
            "6" -> {
                myImageViewSplit24.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_6))
            }
            "7" -> {
                myImageViewSplit24.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_7))
            }
            "8" -> {
                myImageViewSplit24.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_8))
            }
            "9" -> {
                myImageViewSplit24.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_9))
            }
            "10" -> {
                myImageViewSplit24.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_10))
            }
            "11" -> {
                myImageViewSplit24.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_11))
            }
            "12" -> {
                myImageViewSplit24.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_12))
            }
            "13" -> {
                myImageViewSplit24.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_13))
            }
            "14" -> {
                myImageViewSplit24.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_14))
            }
            "15" -> {
                myImageViewSplit24.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_15))
            }
            "16" -> {
                myImageViewSplit24.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_16))
            }
            "17" -> {
                myImageViewSplit24.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_17))
            }
            "18" -> {
                myImageViewSplit24.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_18))
            }
            "19" -> {
                myImageViewSplit24.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_19))
            }
            "20" -> {
                myImageViewSplit24.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_20))
            }
            "21" -> {
                myImageViewSplit24.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_21))
            }
            "22" -> {
                myImageViewSplit24.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_22))
            }
            "23" -> {
                myImageViewSplit24.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_23))
            }
            "24" -> {
                myImageViewSplit24.setImageBitmap(BitmapFactory.decodeResource(resources, R.drawable.cut_24))
            }
        }
    }

    private fun moveLeft() {
        when {
            textView1.text.isEmpty() -> {
                textView1.text = textView2.text
                textView2.text = ""

                myImageViewSplit1.setImageBitmap((myImageViewSplit2.drawable as BitmapDrawable).bitmap)
                myImageViewSplit2.setImageBitmap(null)
            }
            textView2.text.isEmpty() -> {
                textView2.text = textView3.text
                textView3.text = ""

                myImageViewSplit2.setImageBitmap((myImageViewSplit3.drawable as BitmapDrawable).bitmap)
                myImageViewSplit3.setImageBitmap(null)
            }
            textView3.text.isEmpty() -> {
                textView3.text = textView4.text
                textView4.text = ""

                myImageViewSplit3.setImageBitmap((myImageViewSplit4.drawable as BitmapDrawable).bitmap)
                myImageViewSplit4.setImageBitmap(null)
            }
            textView4.text.isEmpty() -> {
                textView4.text = textView5.text
                textView5.text = ""

                myImageViewSplit4.setImageBitmap((myImageViewSplit5.drawable as BitmapDrawable).bitmap)
                myImageViewSplit5.setImageBitmap(null)
            }
            textView5.text.isEmpty() -> {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
            textView6.text.isEmpty() -> {
                textView6.text = textView7.text
                textView7.text = ""

                myImageViewSplit6.setImageBitmap((myImageViewSplit7.drawable as BitmapDrawable).bitmap)
                myImageViewSplit7.setImageBitmap(null)
            }
            textView7.text.isEmpty() -> {
                textView7.text = textView8.text
                textView8.text = ""

                myImageViewSplit7.setImageBitmap((myImageViewSplit8.drawable as BitmapDrawable).bitmap)
                myImageViewSplit8.setImageBitmap(null)
            }
            textView8.text.isEmpty() -> {
                textView8.text = textView9.text
                textView9.text = ""

                myImageViewSplit8.setImageBitmap((myImageViewSplit9.drawable as BitmapDrawable).bitmap)
                myImageViewSplit9.setImageBitmap(null)
            }
            textView9.text.isEmpty() -> {
                textView9.text = textView10.text
                textView10.text = ""

                myImageViewSplit9.setImageBitmap((myImageViewSplit10.drawable as BitmapDrawable).bitmap)
                myImageViewSplit10.setImageBitmap(null)
            }
            textView10.text.isEmpty() -> {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
            textView11.text.isEmpty() -> {
                textView11.text = textView12.text
                textView12.text = ""

                myImageViewSplit11.setImageBitmap((myImageViewSplit12.drawable as BitmapDrawable).bitmap)
                myImageViewSplit12.setImageBitmap(null)
            }
            textView12.text.isEmpty() -> {
                textView12.text = textView13.text
                textView13.text = ""

                myImageViewSplit12.setImageBitmap((myImageViewSplit13.drawable as BitmapDrawable).bitmap)
                myImageViewSplit13.setImageBitmap(null)
            }
            textView13.text.isEmpty() -> {
                textView13.text = textView14.text
                textView14.text = ""

                myImageViewSplit13.setImageBitmap((myImageViewSplit14.drawable as BitmapDrawable).bitmap)
                myImageViewSplit14.setImageBitmap(null)
            }
            textView14.text.isEmpty() -> {
                textView14.text = textView15.text
                textView15.text = ""

                myImageViewSplit14.setImageBitmap((myImageViewSplit15.drawable as BitmapDrawable).bitmap)
                myImageViewSplit15.setImageBitmap(null)
            }
            textView15.text.isEmpty() -> {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
            textView16.text.isEmpty() -> {
                textView16.text = textView17.text
                textView17.text = ""

                myImageViewSplit16.setImageBitmap((myImageViewSplit17.drawable as BitmapDrawable).bitmap)
                myImageViewSplit17.setImageBitmap(null)
            }
            textView17.text.isEmpty() -> {
                textView17.text = textView18.text
                textView18.text = ""

                myImageViewSplit17.setImageBitmap((myImageViewSplit18.drawable as BitmapDrawable).bitmap)
                myImageViewSplit18.setImageBitmap(null)
            }
            textView18.text.isEmpty() -> {
                textView18.text = textView19.text
                textView19.text = ""

                myImageViewSplit18.setImageBitmap((myImageViewSplit19.drawable as BitmapDrawable).bitmap)
                myImageViewSplit19.setImageBitmap(null)
            }
            textView19.text.isEmpty() -> {
                textView19.text = textView20.text
                textView20.text = ""

                myImageViewSplit19.setImageBitmap((myImageViewSplit20.drawable as BitmapDrawable).bitmap)
                myImageViewSplit20.setImageBitmap(null)
            }
            textView20.text.isEmpty() -> {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
            textView21.text.isEmpty() -> {
                textView21.text = textView22.text
                textView22.text = ""

                myImageViewSplit21.setImageBitmap((myImageViewSplit22.drawable as BitmapDrawable).bitmap)
                myImageViewSplit22.setImageBitmap(null)
            }
            textView22.text.isEmpty() -> {
                textView22.text = textView23.text
                textView23.text = ""

                myImageViewSplit22.setImageBitmap((myImageViewSplit23.drawable as BitmapDrawable).bitmap)
                myImageViewSplit23.setImageBitmap(null)
            }
            textView23.text.isEmpty() -> {
                textView23.text = textView24.text
                textView24.text = ""

                myImageViewSplit23.setImageBitmap((myImageViewSplit24.drawable as BitmapDrawable).bitmap)
                myImageViewSplit24.setImageBitmap(null)
            }
            textView24.text.isEmpty() -> {
                textView24.text = textView25.text
                textView25.text = ""

                myImageViewSplit24.setImageBitmap((myImageViewSplit25.drawable as BitmapDrawable).bitmap)
                myImageViewSplit25.setImageBitmap(null)
            }
            textView25.text.isEmpty() -> {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun moveRight() {
        when {
            textView5.text.isEmpty() -> {
                textView5.text = textView4.text
                textView4.text = ""

                myImageViewSplit5.setImageBitmap((myImageViewSplit4.drawable as BitmapDrawable).bitmap)
                myImageViewSplit4.setImageBitmap(null)
            }
            textView4.text.isEmpty() -> {
                textView4.text = textView3.text
                textView3.text = ""

                myImageViewSplit4.setImageBitmap((myImageViewSplit3.drawable as BitmapDrawable).bitmap)
                myImageViewSplit3.setImageBitmap(null)
            }
            textView3.text.isEmpty() -> {
                textView3.text = textView2.text
                textView2.text = ""

                myImageViewSplit3.setImageBitmap((myImageViewSplit2.drawable as BitmapDrawable).bitmap)
                myImageViewSplit2.setImageBitmap(null)
            }
            textView2.text.isEmpty() -> {
                textView2.text = textView1.text
                textView1.text = ""

                myImageViewSplit2.setImageBitmap((myImageViewSplit1.drawable as BitmapDrawable).bitmap)
                myImageViewSplit1.setImageBitmap(null)
            }
            textView1.text.isEmpty() -> {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
            textView10.text.isEmpty() -> {
                textView10.text = textView9.text
                textView9.text = ""

                myImageViewSplit10.setImageBitmap((myImageViewSplit9.drawable as BitmapDrawable).bitmap)
                myImageViewSplit9.setImageBitmap(null)
            }
            textView9.text.isEmpty() -> {
                textView9.text = textView8.text
                textView8.text = ""

                myImageViewSplit9.setImageBitmap((myImageViewSplit8.drawable as BitmapDrawable).bitmap)
                myImageViewSplit8.setImageBitmap(null)
            }
            textView8.text.isEmpty() -> {
                textView8.text = textView7.text
                textView7.text = ""

                myImageViewSplit8.setImageBitmap((myImageViewSplit7.drawable as BitmapDrawable).bitmap)
                myImageViewSplit7.setImageBitmap(null)
            }
            textView7.text.isEmpty() -> {
                textView7.text = textView6.text
                textView6.text = ""

                myImageViewSplit7.setImageBitmap((myImageViewSplit6.drawable as BitmapDrawable).bitmap)
                myImageViewSplit6.setImageBitmap(null)
            }
            textView6.text.isEmpty() -> {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
            textView15.text.isEmpty() -> {
                textView15.text = textView14.text
                textView14.text = ""

                myImageViewSplit15.setImageBitmap((myImageViewSplit14.drawable as BitmapDrawable).bitmap)
                myImageViewSplit14.setImageBitmap(null)
            }
            textView14.text.isEmpty() -> {
                textView14.text = textView13.text
                textView13.text = ""

                myImageViewSplit14.setImageBitmap((myImageViewSplit13.drawable as BitmapDrawable).bitmap)
                myImageViewSplit13.setImageBitmap(null)
            }
            textView13.text.isEmpty() -> {
                textView13.text = textView12.text
                textView12.text = ""

                myImageViewSplit13.setImageBitmap((myImageViewSplit12.drawable as BitmapDrawable).bitmap)
                myImageViewSplit12.setImageBitmap(null)
            }
            textView12.text.isEmpty() -> {
                textView12.text = textView11.text
                textView11.text = ""

                myImageViewSplit12.setImageBitmap((myImageViewSplit11.drawable as BitmapDrawable).bitmap)
                myImageViewSplit11.setImageBitmap(null)
            }
            textView11.text.isEmpty() -> {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
            textView20.text.isEmpty() -> {
                textView20.text = textView19.text
                textView19.text = ""

                myImageViewSplit20.setImageBitmap((myImageViewSplit19.drawable as BitmapDrawable).bitmap)
                myImageViewSplit19.setImageBitmap(null)
            }
            textView19.text.isEmpty() -> {
                textView19.text = textView18.text
                textView18.text = ""

                myImageViewSplit19.setImageBitmap((myImageViewSplit18.drawable as BitmapDrawable).bitmap)
                myImageViewSplit18.setImageBitmap(null)
            }
            textView18.text.isEmpty() -> {
                textView18.text = textView17.text
                textView17.text = ""

                myImageViewSplit18.setImageBitmap((myImageViewSplit17.drawable as BitmapDrawable).bitmap)
                myImageViewSplit17.setImageBitmap(null)
            }
            textView17.text.isEmpty() -> {
                textView17.text = textView16.text
                textView16.text = ""

                myImageViewSplit17.setImageBitmap((myImageViewSplit16.drawable as BitmapDrawable).bitmap)
                myImageViewSplit16.setImageBitmap(null)
            }
            textView16.text.isEmpty() -> {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
            textView25.text.isEmpty() -> {
                textView25.text = textView24.text
                textView24.text = ""

                myImageViewSplit25.setImageBitmap((myImageViewSplit24.drawable as BitmapDrawable).bitmap)
                myImageViewSplit24.setImageBitmap(null)
            }
            textView24.text.isEmpty() -> {
                textView24.text = textView23.text
                textView23.text = ""

                myImageViewSplit24.setImageBitmap((myImageViewSplit23.drawable as BitmapDrawable).bitmap)
                myImageViewSplit23.setImageBitmap(null)
            }
            textView23.text.isEmpty() -> {
                textView23.text = textView22.text
                textView22.text = ""

                myImageViewSplit23.setImageBitmap((myImageViewSplit22.drawable as BitmapDrawable).bitmap)
                myImageViewSplit22.setImageBitmap(null)
            }
            textView22.text.isEmpty() -> {
                textView22.text = textView21.text
                textView21.text = ""

                myImageViewSplit22.setImageBitmap((myImageViewSplit21.drawable as BitmapDrawable).bitmap)
                myImageViewSplit21.setImageBitmap(null)
            }
            textView21.text.isEmpty() -> {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun moveUp() {
        when {
            textView1.text.isEmpty() -> {
                textView1.text = textView6.text
                textView6.text = ""

                myImageViewSplit1.setImageBitmap((myImageViewSplit6.drawable as BitmapDrawable).bitmap)
                myImageViewSplit6.setImageBitmap(null)
            }
            textView6.text.isEmpty() -> {
                textView6.text = textView11.text
                textView11.text = ""

                myImageViewSplit6.setImageBitmap((myImageViewSplit11.drawable as BitmapDrawable).bitmap)
                myImageViewSplit11.setImageBitmap(null)
            }
            textView11.text.isEmpty() -> {
                textView11.text = textView16.text
                textView16.text = ""

                myImageViewSplit11.setImageBitmap((myImageViewSplit16.drawable as BitmapDrawable).bitmap)
                myImageViewSplit16.setImageBitmap(null)
            }
            textView16.text.isEmpty() -> {
                textView16.text = textView21.text
                textView21.text = ""

                myImageViewSplit16.setImageBitmap((myImageViewSplit21.drawable as BitmapDrawable).bitmap)
                myImageViewSplit21.setImageBitmap(null)
            }
            textView21.text.isEmpty() -> {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
            textView2.text.isEmpty() -> {
                textView2.text = textView7.text
                textView7.text = ""

                myImageViewSplit2.setImageBitmap((myImageViewSplit7.drawable as BitmapDrawable).bitmap)
                myImageViewSplit7.setImageBitmap(null)
            }
            textView7.text.isEmpty() -> {
                textView7.text = textView12.text
                textView12.text = ""

                myImageViewSplit7.setImageBitmap((myImageViewSplit12.drawable as BitmapDrawable).bitmap)
                myImageViewSplit12.setImageBitmap(null)
            }
            textView12.text.isEmpty() -> {
                textView12.text = textView17.text
                textView17.text = ""

                myImageViewSplit12.setImageBitmap((myImageViewSplit17.drawable as BitmapDrawable).bitmap)
                myImageViewSplit17.setImageBitmap(null)
            }
            textView17.text.isEmpty() -> {
                textView17.text = textView22.text
                textView22.text = ""

                myImageViewSplit17.setImageBitmap((myImageViewSplit22.drawable as BitmapDrawable).bitmap)
                myImageViewSplit22.setImageBitmap(null)
            }
            textView22.text.isEmpty() -> {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
            textView3.text.isEmpty() -> {
                textView3.text = textView8.text
                textView8.text = ""

                myImageViewSplit3.setImageBitmap((myImageViewSplit8.drawable as BitmapDrawable).bitmap)
                myImageViewSplit8.setImageBitmap(null)
            }
            textView8.text.isEmpty() -> {
                textView8.text = textView13.text
                textView13.text = ""

                myImageViewSplit8.setImageBitmap((myImageViewSplit13.drawable as BitmapDrawable).bitmap)
                myImageViewSplit13.setImageBitmap(null)
            }
            textView13.text.isEmpty() -> {
                textView13.text = textView18.text
                textView18.text = ""

                myImageViewSplit13.setImageBitmap((myImageViewSplit18.drawable as BitmapDrawable).bitmap)
                myImageViewSplit18.setImageBitmap(null)
            }
            textView18.text.isEmpty() -> {
                textView18.text = textView23.text
                textView23.text = ""

                myImageViewSplit18.setImageBitmap((myImageViewSplit23.drawable as BitmapDrawable).bitmap)
                myImageViewSplit23.setImageBitmap(null)
            }
            textView23.text.isEmpty() -> {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
            textView4.text.isEmpty() -> {
                textView4.text = textView9.text
                textView9.text = ""

                myImageViewSplit4.setImageBitmap((myImageViewSplit9.drawable as BitmapDrawable).bitmap)
                myImageViewSplit9.setImageBitmap(null)
            }
            textView9.text.isEmpty() -> {
                textView9.text = textView14.text
                textView14.text = ""

                myImageViewSplit9.setImageBitmap((myImageViewSplit14.drawable as BitmapDrawable).bitmap)
                myImageViewSplit14.setImageBitmap(null)
            }
            textView14.text.isEmpty() -> {
                textView14.text = textView19.text
                textView19.text = ""

                myImageViewSplit14.setImageBitmap((myImageViewSplit19.drawable as BitmapDrawable).bitmap)
                myImageViewSplit19.setImageBitmap(null)
            }
            textView19.text.isEmpty() -> {
                textView19.text = textView24.text
                textView24.text = ""

                myImageViewSplit19.setImageBitmap((myImageViewSplit24.drawable as BitmapDrawable).bitmap)
                myImageViewSplit24.setImageBitmap(null)
            }
            textView24.text.isEmpty() -> {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
            textView5.text.isEmpty() -> {
                textView5.text = textView10.text
                textView10.text = ""

                myImageViewSplit5.setImageBitmap((myImageViewSplit10.drawable as BitmapDrawable).bitmap)
                myImageViewSplit10.setImageBitmap(null)
            }
            textView10.text.isEmpty() -> {
                textView10.text = textView15.text
                textView15.text = ""

                myImageViewSplit10.setImageBitmap((myImageViewSplit15.drawable as BitmapDrawable).bitmap)
                myImageViewSplit15.setImageBitmap(null)
            }
            textView15.text.isEmpty() -> {
                textView15.text = textView20.text
                textView20.text = ""

                myImageViewSplit15.setImageBitmap((myImageViewSplit20.drawable as BitmapDrawable).bitmap)
                myImageViewSplit20.setImageBitmap(null)
            }
            textView20.text.isEmpty() -> {
                textView20.text = textView25.text
                textView25.text = ""

                myImageViewSplit20.setImageBitmap((myImageViewSplit25.drawable as BitmapDrawable).bitmap)
                myImageViewSplit25.setImageBitmap(null)
            }
            textView25.text.isEmpty() -> {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun moveDown() {
        when {
            textView25.text.isEmpty() -> {
                textView25.text = textView20.text
                textView20.text = ""

                myImageViewSplit25.setImageBitmap((myImageViewSplit20.drawable as BitmapDrawable).bitmap)
                myImageViewSplit20.setImageBitmap(null)
            }
            textView20.text.isEmpty() -> {
                textView20.text = textView15.text
                textView15.text = ""

                myImageViewSplit20.setImageBitmap((myImageViewSplit15.drawable as BitmapDrawable).bitmap)
                myImageViewSplit15.setImageBitmap(null)
            }
            textView15.text.isEmpty() -> {
                textView15.text = textView10.text
                textView10.text = ""

                myImageViewSplit15.setImageBitmap((myImageViewSplit10.drawable as BitmapDrawable).bitmap)
                myImageViewSplit10.setImageBitmap(null)
            }
            textView10.text.isEmpty() -> {
                textView10.text = textView5.text
                textView5.text = ""

                myImageViewSplit10.setImageBitmap((myImageViewSplit5.drawable as BitmapDrawable).bitmap)
                myImageViewSplit5.setImageBitmap(null)
            }
            textView5.text.isEmpty() -> {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
            textView24.text.isEmpty() -> {
                textView24.text = textView19.text
                textView19.text = ""

                myImageViewSplit24.setImageBitmap((myImageViewSplit19.drawable as BitmapDrawable).bitmap)
                myImageViewSplit19.setImageBitmap(null)
            }
            textView19.text.isEmpty() -> {
                textView19.text = textView14.text
                textView14.text = ""

                myImageViewSplit19.setImageBitmap((myImageViewSplit14.drawable as BitmapDrawable).bitmap)
                myImageViewSplit14.setImageBitmap(null)
            }
            textView14.text.isEmpty() -> {
                textView14.text = textView9.text
                textView9.text = ""

                myImageViewSplit14.setImageBitmap((myImageViewSplit9.drawable as BitmapDrawable).bitmap)
                myImageViewSplit9.setImageBitmap(null)
            }
            textView9.text.isEmpty() -> {
                textView9.text = textView4.text
                textView4.text = ""

                myImageViewSplit9.setImageBitmap((myImageViewSplit4.drawable as BitmapDrawable).bitmap)
                myImageViewSplit4.setImageBitmap(null)
            }
            textView4.text.isEmpty() -> {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
            textView23.text.isEmpty() -> {
                textView23.text = textView18.text
                textView18.text = ""

                myImageViewSplit23.setImageBitmap((myImageViewSplit18.drawable as BitmapDrawable).bitmap)
                myImageViewSplit18.setImageBitmap(null)
            }
            textView18.text.isEmpty() -> {
                textView18.text = textView13.text
                textView13.text = ""

                myImageViewSplit18.setImageBitmap((myImageViewSplit13.drawable as BitmapDrawable).bitmap)
                myImageViewSplit13.setImageBitmap(null)
            }
            textView13.text.isEmpty() -> {
                textView13.text = textView8.text
                textView8.text = ""

                myImageViewSplit13.setImageBitmap((myImageViewSplit8.drawable as BitmapDrawable).bitmap)
                myImageViewSplit8.setImageBitmap(null)
            }
            textView8.text.isEmpty() -> {
                textView8.text = textView3.text
                textView3.text = ""

                myImageViewSplit8.setImageBitmap((myImageViewSplit3.drawable as BitmapDrawable).bitmap)
                myImageViewSplit3.setImageBitmap(null)
            }
            textView3.text.isEmpty() -> {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
            textView22.text.isEmpty() -> {
                textView22.text = textView17.text
                textView17.text = ""

                myImageViewSplit22.setImageBitmap((myImageViewSplit17.drawable as BitmapDrawable).bitmap)
                myImageViewSplit17.setImageBitmap(null)
            }
            textView17.text.isEmpty() -> {
                textView17.text = textView12.text
                textView12.text = ""

                myImageViewSplit17.setImageBitmap((myImageViewSplit12.drawable as BitmapDrawable).bitmap)
                myImageViewSplit12.setImageBitmap(null)
            }
            textView12.text.isEmpty() -> {
                textView12.text = textView7.text
                textView7.text = ""

                myImageViewSplit12.setImageBitmap((myImageViewSplit7.drawable as BitmapDrawable).bitmap)
                myImageViewSplit7.setImageBitmap(null)
            }
            textView7.text.isEmpty() -> {
                textView7.text = textView2.text
                textView2.text = ""

                myImageViewSplit7.setImageBitmap((myImageViewSplit2.drawable as BitmapDrawable).bitmap)
                myImageViewSplit2.setImageBitmap(null)
            }
            textView2.text.isEmpty() -> {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
            textView21.text.isEmpty() -> {
                textView21.text = textView16.text
                textView16.text = ""

                myImageViewSplit21.setImageBitmap((myImageViewSplit16.drawable as BitmapDrawable).bitmap)
                myImageViewSplit16.setImageBitmap(null)
            }
            textView16.text.isEmpty() -> {
                textView16.text = textView11.text
                textView11.text = ""

                myImageViewSplit16.setImageBitmap((myImageViewSplit11.drawable as BitmapDrawable).bitmap)
                myImageViewSplit11.setImageBitmap(null)
            }
            textView11.text.isEmpty() -> {
                textView11.text = textView6.text
                textView6.text = ""

                myImageViewSplit11.setImageBitmap((myImageViewSplit6.drawable as BitmapDrawable).bitmap)
                myImageViewSplit6.setImageBitmap(null)
            }
            textView6.text.isEmpty() -> {
                textView6.text = textView1.text
                textView1.text = ""

                myImageViewSplit6.setImageBitmap((myImageViewSplit1.drawable as BitmapDrawable).bitmap)
                myImageViewSplit1.setImageBitmap(null)
            }
            textView1.text.isEmpty() -> {
                Toast.makeText(this, "NOT VARIABLE LEFT TO MOVE", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
