package com.rahmahnajiyahimtihan.sample_anko_kotlin

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.LinearLayout
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivity : AppCompatActivity() {

    @SuppressLint("ResourceType", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        linearLayout {
            orientation = LinearLayout.HORIZONTAL

            button {
                text = "try button"
                width = wrapContent
            }.lparams {
                weight
            }
        }

        relativeLayout {
            textView {
                text = "try text"
                id = 2
            }

            button { }.lparams {
                below(2)
            }
        }

        verticalLayout {
            val et = editText {
                hint = "username"

            }.lparams {
                margin = 10
            }

            button {
                text = "sample Button"

                onClick {
                    toast(et.text.toString())//hny sprt ini

                    longToast(et.text.toString())//hny sprti ini

                    alert {
                        title = "halo"
                        message = "hei"
                        yesButton {
                            // hny ada 2 yes and no
                        }
                        noButton { }
                    }.show()

                }
            }
        }
    }
}
