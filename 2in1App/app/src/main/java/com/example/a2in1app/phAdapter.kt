package com.example.a2in1app

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row_phgame.view.*

class phAdapter(val context: Context, val messages: ArrayList<String>):RecyclerView.Adapter<phAdapter.MessageViewHolder>() {
    class MessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        return MessageViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.item_row_phgame,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val message = messages[position]

        holder.itemView.apply {
            tvtext.text = message
            if (message.startsWith("Found")) {
                tvtext.setTextColor(Color.GREEN)
            } else if (message.startsWith("No") || message.startsWith("Wrong")) {
                tvtext.setTextColor(Color.RED)
            } else {
                tvtext.setTextColor(Color.BLACK)
            }
        }
    }

    override fun getItemCount() = messages.size
}