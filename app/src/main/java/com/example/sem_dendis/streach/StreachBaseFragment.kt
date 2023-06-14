package com.example.sem_dendis.streach

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.sem_dendis.R


class StreachBaseFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_streach_base, container, false)

        val imgBUpper = view.findViewById<ImageButton>(R.id.vrch_tela_imgb)
        val imgBMied = view.findViewById<ImageButton>(R.id.stred_tela_imgB)
        val imgBLower = view.findViewById<ImageButton>(R.id.dolna_cast_tela_imgB)

        imgBUpper.setOnClickListener(){
            findNavController().navigate(R.id.action_streachBaseFragment_to_streachUpperBodyFragment)
        }

        imgBMied.setOnClickListener {
            findNavController().navigate(R.id.action_streachBaseFragment_to_streachMidBodyFragment)
        }/**/

        imgBLower.setOnClickListener {
            findNavController().navigate(R.id.action_streachBaseFragment_to_streachLowerBodyFragment)
        }

        return view

    }


}