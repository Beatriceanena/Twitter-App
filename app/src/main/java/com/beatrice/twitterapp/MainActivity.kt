package com.beatrice.twitterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.beatrice.twitterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        myTweet()
    }
    fun myTweet(){
        var tweet2=Tweet("Lilian@lilian Jul 20","I woke up this morning to the ","the biggest surprise","20","42","13","61")
        var tweet3=Tweet("Musimbi@Musimbi Jul 11","I am happy to start my role","as a software Developer","20","42","13","61")
        var tweet4=Tweet("Carol@carol Jul 17","I am happy to start my role","as a software Developer","20","42","13","61")
        var tweet5=Tweet("Phiona@phiona Jul 1","I am happy to start my role","as a software Developer","20","42","13","61")
        var tweet6=Tweet("Laura@laura Jul 3","I am happy to start my role","as a software Developer","20","42","13","61")
        var tweet7=Tweet("Lona@lona Jul 9","I am happy to start my role","as a software Developer","20","42","13","61")
        var tweet1=Tweet("anena@anena Jul 8","I am happy to start my role","as a software Developer","20","42","13","61")
        var tweet= listOf(tweet1,tweet2,tweet3,tweet5,tweet4,tweet6,tweet7)

        var tweetAdapter=TweetRvAdapter(tweet)
        binding.rvTweets.layoutManager=LinearLayoutManager(this)
        binding.rvTweets.adapter=tweetAdapter
    }
}