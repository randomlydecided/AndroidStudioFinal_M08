package com.example.adventurersguild.data

import android.content.Context
import android.view.LayoutInflater
import android.view.*
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.adventurersguild.R
import com.example.adventurersguild.data.QuestListAdapter.*

class QuestListAdapter (private val list:ArrayList<Quest>, private val context: Context): RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(context).inflate(R.layout.card_layout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class ViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bindItem(quest: Quest){
            var questName: TextView =itemView.findViewById(R.id.questNameTextView) as TextView
            var questDetail: TextView =itemView.findViewById(R.id.questDetailTextView) as TextView
            var questReward: TextView =itemView.findViewById(R.id.questRewardTextView) as TextView

            questName.text=quest.QuestName
            questDetail.text=quest.QuestDetail
            questReward.text=quest.QuestReward

            itemView.setOnClickListener{
                // In this spot I need to include a fragment or something to change the view when I click the quest
                Toast.makeText(context, questName.text, Toast.LENGTH_LONG).show()
            }
        }
    }
}