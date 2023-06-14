package com.example.sem_dendis.streach

import android.annotation.SuppressLint
import android.net.Uri
import android.os.Bundle
import android.text.util.Linkify
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.TextView
import android.widget.VideoView
import androidx.fragment.app.Fragment

import com.example.sem_dendis.R

class StreachLowerBodyFragment : Fragment() {

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_streach_lower_body, container, false)


        val videoViewLowerBody = view.findViewById<VideoView>(R.id.video_lower_body_videoview)
        val packageName = "android.resource://" + requireContext().packageName + "/"+ R.raw.lowerbidystreach
        val uri = Uri.parse(packageName)
        videoViewLowerBody.setVideoURI(uri)

        //do parametra sa dava this ale kedze sme v fragmente musi tam byt requireAcitivity()
        val mediaController = MediaController(requireActivity())
        videoViewLowerBody.setMediaController(mediaController)

        //nastavenie hyperlink na prekliknutie na video
        val vieowebLink = view.findViewById<TextView>(R.id.vieotxtHyperLink)
        vieowebLink.text = "https://www.youtube.com/watch?v=Yqk6KEPVrW0"
        Linkify.addLinks(vieowebLink, Linkify.WEB_URLS)

        return view
    }


}