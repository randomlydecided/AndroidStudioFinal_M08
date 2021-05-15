/*
package com.example.adventurersguild.data

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.adventurersguild.R
import kotlinx.android.synthetic.main.activity_second.*
import com.example.adventurersguild.data.Quest
import com.example.adventurersguild.data.QuestListAdapter

class AvailableQuestFragment : Fragment() {

    private var adapter: QuestListAdapter?=null
    private var questList:ArrayList<Quest>?=null
    private var layoutManager: RecyclerView.LayoutManager?=null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        questList=ArrayList<Quest>()
        layoutManager= LinearLayoutManager(this)
        adapter= QuestListAdapter(questList!!,this)

        questRecyclerView.layoutManager=layoutManager
        questRecyclerView.adapter=adapter

        // This is where to add quests, details, and rewards for now. Eventually these should be their own classes.
        var questNameList:Array<String> = arrayOf("Looking To The Sky","Urgent Delivery","Delegations With The Courts","The Next Ambassador","The Best Around","Looking For A Scribe","Mural Needed In Local Monastery","Alchemist Needed","Friends In Low Places","Tax Season","Detour","Join A Guild","Ph'nglui Mglw'nafh Cthulhu R'lyeh Wgah'nagl Fhtagn","Conqueror's Pursuits","M87")
        var questDetailList:Array<String> = arrayOf("Discover a new planet.","Run 10 miles.","Change a law.","Gain the approval of somebody.","Win a competition.","Write a book.","Create a work of art.","Make a scientific breakthrough.","Make a friend.","Repay a debt.","Experience something new.","Find a job.","Solve an ancient mystery.","Establish your own country.","Consume everything.")
        var questRewardList:Array<String> = arrayOf("110 Gold","20 Gold","50 Gold","Ambassador Title","5 Gold","35 Gold","30 Gold","618 Gold","A Friend","We Won't Come For You","Memories","A Job","Y'ai'ng'ngah","Your Own Kingdom","Jormungandr Title")

        for(i in 0..14){
            var quest=Quest()
            quest.QuestName = questNameList[i]
            quest.QuestDetail = questDetailList[i]
            quest.QuestReward = questRewardList[i]
            questList?.add(quest)
        }

        adapter!!.notifyDataSetChanged()

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_available_quest, container, false)
    }
}*/
