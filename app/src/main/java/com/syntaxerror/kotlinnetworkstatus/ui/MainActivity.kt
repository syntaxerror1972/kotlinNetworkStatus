package com.syntaxerror.kotlinnetworkstatus.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.syntaxerror.kotlinnetworkstatus.R
import com.syntaxerror.kotlinnetworkstatus.network.NetworkStatus

/**
 **************************************************************************************
 *
 *** Project Details ***
 *
 * Project Name : kotlinNetworkStatus.
 * Package Id : com.syntaxerror.kotlinnetworkstatus
 * Created By :  Shrawan Shinde
 * Created Date :  01,October,2022
 *
 *** Contact Details ***
 *
 * Name : Shrawan B. Shinde
 * Email : syntaxerror1972@gmail.com
 * Github Link : https://github.com/syntaxerror1972/kotlinNetworkStatus
 * LinkedIn Link : https://in.linkedin.com/in/shrawan-shinde-59ba57a1
 * Copyright (c) 2022. All rights reserved.
 *
 **************************************************************************************
 */
class MainActivity : AppCompatActivity() {
    lateinit var txtStatus : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtStatus = findViewById(R.id.txtStatus)
        if(NetworkStatus.isInternetAvailable(this)){
            txtStatus.text = "Internet connection available"
        } else {
            txtStatus.text =  "Internet connection not available"
        }
    }
}