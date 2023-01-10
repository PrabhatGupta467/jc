package com.example.jiocinema

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var arrContact:ArrayList<ContactModel>
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        arrContact=ArrayList()
        setRecyclerView(arrContact)

    }

    private fun setRecyclerView(arrContact:ArrayList<ContactModel>) {
        val recyclerView = findViewById<RecyclerView>(R.id.recycler)
        recyclerView.layoutManager= LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false) //setting layout manager...
        arrContact.add(ContactModel(R.drawable.img))//setting the data
        arrContact.add(ContactModel(R.drawable.img_1))
        arrContact.add(ContactModel(R.drawable.img_2))
        arrContact.add(ContactModel(R.drawable.img_3))
        arrContact.add(ContactModel(R.drawable.img_4))
        arrContact.add(ContactModel(R.drawable.img_5))
        arrContact.add(ContactModel(R.drawable.img_1))
        val recycler = RecyclerAddapter(this,arrContact)
        recyclerView.adapter=recycler
    }
}