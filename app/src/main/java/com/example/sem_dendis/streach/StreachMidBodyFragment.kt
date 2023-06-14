package com.example.sem_dendis.streach

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


class StreachMidBodyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_streach_mid_body, container, false)



        val videoViewMidBody = view.findViewById<VideoView>(R.id.vido_midstreach_videoview)
        val packageName = "android.resource://" + requireContext().packageName + "/"+ R.raw.streachmidbody
        val uri = Uri.parse(packageName)
        videoViewMidBody.setVideoURI(uri)

        //do parametra sa dava this ale kedze sme v fragmente musi tam byt requireAcitivity() aby to i3lo
        val mediaController = MediaController(requireActivity())
        videoViewMidBody.setMediaController(mediaController)


        val vieowebLinkStred = view.findViewById<TextView>(R.id.vieotxtHyperLinkStredTela)
        vieowebLinkStred.text = "https://www.youtube.com/watch?v=2eA2Koq6pTI"
        Linkify.addLinks(vieowebLinkStred, Linkify.WEB_URLS)

        return view
    }


}