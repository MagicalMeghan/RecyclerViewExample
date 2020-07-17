package com.example.recycleme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    lateinit var wordList : List<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wordList = listOf("poppy", "freesia", "rose", "daisy", "lily")

        viewManager = LinearLayoutManager(this)
        viewAdapter = Adapter(wordList)

        recyclerView = findViewById(R.id.recycler)
        recyclerView.adapter = viewAdapter
        recyclerView.layoutManager = viewManager
    }
}
