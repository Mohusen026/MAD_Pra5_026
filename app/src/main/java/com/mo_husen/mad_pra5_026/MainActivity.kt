package com.mo_husen.mad_pra5_026

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.provider.AlarmClock
import android.provider.CallLog
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Browse Button
        val browse: Button =findViewById(R.id.button_browse)
        val editbrowse:EditText=findViewById(R.id.editTextURL)
        browse.setOnClickListener(){
            Intent(Intent.ACTION_VIEW, Uri.parse(editbrowse.text.toString())).also{startActivity(it)}}
        val call: Button =findViewById(R.id.buttoncall)
        val editcall:EditText=findViewById(R.id.editTextText3)
        val tel="tel:+91"
        call.setOnClickListener(){
            Intent(Intent.ACTION_DIAL, Uri.parse(tel+editcall.text.toString())).also{startActivity(it)}}
        val Calllog:Button=findViewById(R.id.button5)
        Calllog.setOnClickListener()
        { Intent(Intent.ACTION_VIEW).setType(CallLog.Calls.CONTENT_TYPE).also{startActivity(it)}}
        val gallery:Button=findViewById(R.id.button7)
        gallery.setOnClickListener()
        {            Intent(Intent.ACTION_VIEW).setType("image/*").also{startActivity(it)}}
        val camera:Button=findViewById(R.id.button8)
        camera.setOnClickListener()
        {Intent(MediaStore.ACTION_IMAGE_CAPTURE).also{startActivity(it)}}
        val alarm:Button=findViewById(R.id.button9)
        alarm.setOnClickListener()
        {Intent(AlarmClock.ACTION_SHOW_ALARMS).also{startActivity(it)}}}}
