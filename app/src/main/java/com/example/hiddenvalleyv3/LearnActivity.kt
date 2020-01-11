package com.example.hiddenvalleyv3
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_alp_layout.*
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_alp_layout.*
import kotlinx.android.synthetic.main.learn_cal_layout.*
import kotlinx.android.synthetic.main.cal_game.*
import java.util.*


class LearnActivity : AppCompatActivity(){
    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alp_layout)




            layoutManager = LinearLayoutManager(this)
            recycler_view.layoutManager = layoutManager

            adapter = RecyclerAdapter()
            recycler_view.adapter = adapter










    }




}