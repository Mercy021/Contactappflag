package com.example.contactapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class contactsRVAdapter(var contactslist: List<Contact>,var context:Context):RecyclerView.Adapter<contactsRVAdapter.contactsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): contactsViewHolder {
        var itemView= LayoutInflater.from(parent.context)
            .inflate(R.layout.contact_list_item,parent,false)
        return contactsViewHolder(itemView)
            }
    override fun onBindViewHolder(holder: contactsViewHolder, position: Int) {
        var currentContact = contactslist.get(position)
        holder.tvcontactname.text = currentContact.contactname
        holder.tvphonenumber.text = currentContact.phonenumber
        holder.tvemail.text = currentContact.email
        Picasso.get()
            .load(currentContact.imageUrl)
            .resize(80,80)
            .centerCrop()
            .into(holder.ivcontact)

        holder.cvContact.setOnClickListener {
        var intent=Intent(context,ContactDetailActivity::class.java)
            intent.putExtra("name",currentContact.contactname)
            intent.putExtra("Phone",currentContact.phonenumber)
            intent.putExtra("Email",currentContact.email)
            intent.putExtra("Image",currentContact.imageUrl)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)


}

    }

    override fun getItemCount(): Int {
        return contactslist.size
        
    }
    class contactsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var tvcontactname=itemView.findViewById<TextView>(R.id.tvcontactname)
        var tvphonenumber=itemView.findViewById<TextView>(R.id.tvphonenumber)
        var tvemail=itemView.findViewById<TextView>(R.id.tvemail)
        var ivcontact=itemView.findViewById<ImageView>(R.id.ivcontact)
        var cvContact=itemView.findViewById<CardView>(R.id.cvContact)

    }

    }
