package com.example.contactapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.squareup.picasso.Picasso

class ContactDetailActivity : AppCompatActivity() {
    lateinit var tvname:TextView
    lateinit var tvPhone:TextView
    lateinit var tvEmail:TextView
    lateinit var ivImage:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_detail)
         var name=intent.getStringExtra("NAME")
        tvname.findViewById<TextView>(R.id.tvname)
        tvPhone.findViewById<TextView>(R.id.tvphonenumber)
        tvEmail.findViewById<TextView>(R.id.tvemail)
        ivImage.findViewById<ImageView>(R.id.ivcontact)
        Toast.makeText(baseContext,name,Toast.LENGTH_LONG).show()

        var nameIntent=intent.getStringExtra("name")
        var EmailIntent=intent.getStringExtra("Email")
        var PhoneIntent=intent.getStringExtra("Phone")
        var imageIntent=intent.getStringExtra("Image").toString()

       Picasso.get()
         .load(imageIntent)
       .into(ivImage)

  tvname.text=nameIntent
      tvPhone.text=PhoneIntent
       tvEmail.text=EmailIntent
       intent= Intent(baseContext,Contact ::class.java)
       startActivity(intent)
    }
}