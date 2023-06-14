package com.example.sem_dendis.TrainingII

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

import com.example.sem_dendis.R



class ExerciseFragmentII : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_exercise_i_i, container, false)


        val cvik1 =
            ExerciseClass.valueOf(arguments?.getString("ak") ?: ExerciseClass.FRONT_BARBEL_SQUAT.name)

        //najdeme co potrebujeme vyplnit
        val img = view.findViewById<ImageView>(R.id.imgV_photo)
        val txtName = view.findViewById<TextView>(R.id.name_of_ecercise)
        val txtEplenation = view.findViewById<TextView>(R.id.explanation)
        val txtSetCount = view.findViewById<TextView>(R.id.countS)
        val txtSetRepeticion = view.findViewById<TextView>(R.id.countR)

        //vyplnime z cvika1 do zadanych tabuliek data
        img.setImageResource(cvik1.imageResource)
        txtName.text = cvik1.nameOfExercise
        txtEplenation.text = cvik1.description
        txtSetCount.text = cvik1.setCount.toString()
        txtSetRepeticion.text = cvik1.setRepetitionCouunt.toString()

        return view
    }


}