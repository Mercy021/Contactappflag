package com.example.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvcontacts: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayCourse()
    }
    fun displayCourse(){
        var contactslist= listOf<Contact>(
            Contact(contactname ="Mercy Wangari" ,"1332088389","kinyanjuimercywangari@gmail.com",imageUrl ="https://cdn.pixabay.com/photo/2021/07/09/04/19/girl-6398258__340.jpg"),
            Contact(contactname = "Grace Maina","128993920039","mainagrace@gmail.com",imageUrl ="https://cdn.pixabay.com/photo/2021/07/09/04/19/girl-6398258__340.jpg" ),
            Contact(contactname = "Rebecca Wambui","777654332223","wambuirebeka@gmail.com",imageUrl = "https://cdn.pixabay.com/photo/2021/07/09/04/19/girl-6398258__340.jpg"),
            Contact(contactname = "Nancy Kabura","18288291990090","kaburanancy@gmail.com",imageUrl = "https://cdn.pixabay.com/photo/2021/07/09/04/19/girl-6398258__340.jpg"),
            Contact(contactname = "Wanjiru Njiru","1289293993982","njiruwanjiru@gmail.com",imageUrl = "https://cdn.pixabay.com/photo/2021/07/09/04/19/girl-6398258__340.jpg"),
            Contact(contactname = "Allam Njatha","23993900490999","njathaallam@gmail.com",imageUrl = "https://cdn.pixabay.com/photo/2021/07/09/04/19/girl-6398258__340.jpg"),
            Contact(contactname = "Frankilin Mwangi","3228388384892929","mwangifrankilin@gmail.com",imageUrl = "https://cdn.pixabay.com/photo/2021/07/09/04/19/girl-6398258__340.jpg"),




        )
        rvcontacts=findViewById(R.id.rvcontacts)
        var contactsAdapter=contactsRVAdapter(contactslist,baseContext)
        rvcontacts.layoutManager= LinearLayoutManager(baseContext)
        rvcontacts.adapter=contactsAdapter
    }
}
