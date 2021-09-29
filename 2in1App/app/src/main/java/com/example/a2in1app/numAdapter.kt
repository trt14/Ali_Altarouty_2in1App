package com.example.a2in1app
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row_numgame.view.*


class numAdapter (val context: Context, val messages: ArrayList<String>):
    RecyclerView.Adapter<numAdapter.MessageViewHolder>() {
    class MessageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageViewHolder {
        return MessageViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.item_row_numgame,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        val message = messages[position]

        holder.itemView.apply {
            tvMessageg.text = message
        }
    }

    override fun getItemCount() = messages.size
}