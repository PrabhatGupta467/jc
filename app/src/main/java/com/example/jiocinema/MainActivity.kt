package com.example.jiocinema

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var arrContact:ArrayList<ContactModel>
    private lateinit var recyclerView1: RecyclerView
    private lateinit var recyclerView2: RecyclerView
    private lateinit var recyclerView3: RecyclerView
    private lateinit var recyclerView4: RecyclerView
    private lateinit var recyclerView5: RecyclerView
    private lateinit var recyclerView6: RecyclerView
    private lateinit var recyclerView7: RecyclerView
    private lateinit var recyclerView8: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        arrContact=ArrayList()
        recyclerView1=findViewById(R.id.recycler1)
        recyclerView2=findViewById(R.id.recycler2)
        recyclerView3=findViewById(R.id.recycler3)
        recyclerView4=findViewById(R.id.recycler4)
        recyclerView5=findViewById(R.id.recycler5)
        recyclerView6=findViewById(R.id.recycler6)
        recyclerView7=findViewById(R.id.recycler7)
        recyclerView8=findViewById(R.id.recycler8)


        setRecyclerView(arrContact,recyclerView1)
        setRecyclerView(arrContact,recyclerView2)
        setRecyclerView(arrContact,recyclerView3)
        setRecyclerView(arrContact,recyclerView4)
        setRecyclerView(arrContact,recyclerView5)
        setRecyclerView(arrContact,recyclerView6)
        setRecyclerView(arrContact,recyclerView7)
        setRecyclerView(arrContact,recyclerView8)


    }

    private fun setRecyclerView(arrContact:ArrayList<ContactModel>,recyclerView: RecyclerView) {
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