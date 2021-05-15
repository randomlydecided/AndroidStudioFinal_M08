package com.example.adventurersguild

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.adventurersguild.data.Quest
import com.example.adventurersguild.data.QuestListAdapter
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.fragment_login.*

class SecondActivity : AppCompatActivity() {

    private var adapter: QuestListAdapter?=null
    private var questList:ArrayList<Quest>?=null
    private var layoutManager: RecyclerView.LayoutManager?=null

    // This is for the tabs
    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager
    //

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        questList=ArrayList<Quest>()
        layoutManager= LinearLayoutManager(this)
        adapter= QuestListAdapter(questList!!,this)

        questRecyclerView.layoutManager=layoutManager
        questRecyclerView.adapter=adapter

/*
        // This is for the tabs
        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)
        //
*/

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
    }

    // This is the help and settings menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    // This is the help and settings menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item?.itemId){
            R.id.help->{var intent= Intent(this, HelpActivity:: class.java)
                startActivity(intent)
                super.onOptionsItemSelected(item)
            }
            R.id.settings->{var intent=Intent(this, SettingsActivity:: class.java)
                startActivity(intent)
                super.onOptionsItemSelected(item)
            }
            else-> super.onOptionsItemSelected(item)
        }
    }

    fun onClickTab(view: View){
        var intent= Intent(this, HelpActivity:: class.java)
        startActivity(intent)
    }
}