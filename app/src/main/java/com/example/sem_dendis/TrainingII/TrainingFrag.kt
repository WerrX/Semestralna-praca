package com.example.sem_dendis.TrainingII

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.sem_dendis.R

class TrainingFrag : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_training_base, container, false)

        val bundle = Bundle()

        val imBfirstEX = view.findViewById<ImageButton>(R.id.push_imgb)
        imBfirstEX.setOnClickListener {
            bundle.putString("muscle", MuscleGroup.PUSH.name)
            findNavController().navigate(R.id.action_trainingFrag_to_exercisesFragmentII, bundle)
        }/**/

        val imBSecondEX = view.findViewById<ImageButton>(R.id.pull_imgb)
        imBSecondEX.setOnClickListener {
            bundle.putString("muscle", MuscleGroup.PULL.name)
            findNavController().navigate(R.id.action_trainingFrag_to_exercisesFragmentII, bundle)
        }/**/


        val imBthirdEX = view.findViewById<ImageButton>(R.id.legs_imgb)
        imBthirdEX.setOnClickListener {
            bundle.putString("muscle", MuscleGroup.LEGS.name)
            findNavController().navigate(R.id.action_trainingFrag_to_exercisesFragmentII, bundle)
        }/**/
        return view
    }
    /**
     * Pomocou tejto metody posuvame Enum
     */
    companion object {
        @JvmStatic
        fun newInstance(groupOfMuscles: MuscleGroup) = TrainingFrag().apply {
            arguments = Bundle().apply {
                putSerializable("Group of muscles", groupOfMuscles)
            }
        }

    }

}

