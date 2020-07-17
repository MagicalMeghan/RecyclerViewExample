package com.example.recycleme

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class Adapter(val wordList: List<String>) : ListAdapter<String, RecyclerView.ViewHolder>(
    StringDiffCallback()) {
    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val wordText:TextView = itemView.findViewById(R.id.word)

        fun bind(word: String){
            wordText.text = word
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val inflator = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_item, parent, false)

        return CustomViewHolder(inflator)
    }

    override fun getItemCount(): Int {
        return wordList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as CustomViewHolder).bind(wordList[position])
    }

}

private class StringDiffCallback : DiffUtil.ItemCallback<String>() {
    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }
}