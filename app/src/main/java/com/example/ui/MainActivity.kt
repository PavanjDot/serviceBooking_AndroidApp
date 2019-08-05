package com.example.ui

import android.app.AlertDialog
import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_rv.*
import kotlinx.android.synthetic.main.list.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rv)



        var RC_view = findViewById<RecyclerView>(R.id.RV_main)

        RC_view.setLayoutManager(LinearLayoutManager(this))

        val dates: ArrayList<String> = ArrayList()
        dates.add("Today 8-10AM")
        dates.add("Today 11-12PM")
        dates.add("Today 2-4PM")
        dates.add("Today 5-7PM")
        dates.add("Today 8-10PM")

        //Tomorrow's data

        dates.add("Tomorrow 8-10AM")
        dates.add("Tomorrow 11-12PM")
        dates.add("Tomorrow 2-4PM")
        dates.add("Tomorrow 5-7PM")
        dates.add("Tomorrow 8-10PM")







       var adapter = RV_adapter(dates)
        RC_view.setAdapter(adapter)


    }



}



