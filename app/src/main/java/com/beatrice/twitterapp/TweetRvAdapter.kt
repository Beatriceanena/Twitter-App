package com.beatrice.twitterapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweetRvAdapter (var TweetList: List<Tweet>):
RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var itemView= LayoutInflater.from(parent.context)
            .inflate(R.layout.tweet_list_item,parent,false)
        return ContactViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact=TweetList.get(position)
        holder.tvName.text=currentContact.name
        holder.tvMessage1.text=currentContact.message
        holder.tvMessage4.text=currentContact.message4
        holder.tv5.text=currentContact.tv5
        holder.tv6.text=currentContact.tv6
        holder.tv7.text=currentContact.tv7
        holder.tv8.text=currentContact.tv8
//        holder.imgPerson=currentContact.imgPerson


    }
    override fun getItemCount(): Int {
        return TweetList.size
    }
}
class ContactViewHolder(itemView: View):
    RecyclerView.ViewHolder(itemView) {
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvMessage1 = itemView.findViewById<TextView>(R.id.tvMessage1)
    var tvMessage4 = itemView.findViewById<TextView>(R.id.tvMessage4)
    var tv5 = itemView.findViewById<TextView>(R.id.tv5)
    var tv6= itemView.findViewById<TextView>(R.id.tv6)
    var tv7 = itemView.findViewById<TextView>(R.id.tv7)
    var tv8 = itemView.findViewById<TextView>(R.id.tv8)
    var imgPerson = itemView.findViewById<ImageView>(R.id.imgPerson)
}


