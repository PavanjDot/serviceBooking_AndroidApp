package com.example.ui

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.graphics.Color
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.list.view.*

class RV_adapter(var data: ArrayList<String>): RecyclerView.Adapter<RV_adapter.ViewHolder>() {



    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {

      return  ViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.list, p0, false))

    }


    override fun getItemCount(): Int {

        return data.size

    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {

        var date = data[p1]
        p0.txtview.text = data.get(p1)
        var name = p0.btn1.text
        var technitianA = p0.btn1.setText("Pavan")
        var technitianB = p0.btn2.setText("Vivek")

        p0.btn1.setOnClickListener {



            p0.btn1.setBackgroundColor(Color.parseColor("#dea99b"))

            Toast.makeText(it.context, "Clicked on Button1", Toast.LENGTH_SHORT).show()

            createAlert("Service Booking", "Congratulations you are service with Pavan is conformed",
                AlertDialog.BUTTON_POSITIVE, "OK", false, it.context)




        }
        p0.btn2.setOnClickListener {



            p0.btn2.setBackgroundColor(Color.parseColor("#dea99b"))

            Toast.makeText(it.context, "Clicked on Button2", Toast.LENGTH_SHORT).show()

            createAlert("Service Booking", "Congratulations you have Booked you are service with Vivek",
                AlertDialog.BUTTON_POSITIVE, "OK", false, it.context)

        }

    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var txtview = view.time
        var btn1 = view.button1
        var btn2 = view.button2
    }



    private fun createAlert(title: String, message: String, whichButton: Int,
                            buttonText: String, cancelable: Boolean, context: Context){



        var alertDialog: AlertDialog = AlertDialog.Builder(context).create()
        alertDialog.setTitle(title)
        alertDialog.setMessage(message)

        alertDialog.setButton(whichButton, buttonText, {

                dialog: DialogInterface?, which: Int ->







        })

        alertDialog.setCancelable(cancelable)

        alertDialog.show()



    }




}


