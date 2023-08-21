package com.example.testesame1.ui

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.example.testesame1.R
import com.example.testesame1.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val videoView: VideoView = findViewById(R.id.rickroll_video)

        // Imposta il percorso del video
        val videoPath = "android.resource://" + packageName + "/" + R.raw.rickroll_anime
        val videoUri = Uri.parse(videoPath)

        // Imposta il videoURI nel VideoView
        videoView.setVideoURI(videoUri)

        // Aggiungi i controlli multimediali
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)

        // Avvia il video
        videoView.start()

    }
}