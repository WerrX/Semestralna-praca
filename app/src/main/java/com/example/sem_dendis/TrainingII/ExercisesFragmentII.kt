package com.example.sem_dendis.TrainingII

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.sem_dendis.R

class ExercisesFragmentII : Fragment() {
    private lateinit var imgbFirstExercise: ImageButton
    private lateinit var imgbSecondExercise: ImageButton
    private lateinit var imgbThirdExercise: ImageButton
    private lateinit var imgbFourthExercise: ImageButton
    private lateinit var imgbFifthExercise: ImageButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_exercises_ii, container, false)

        imgbFirstExercise = view.findViewById<ImageButton>(R.id.first_exercise_imgaeb)
        imgbSecondExercise = view.findViewById<ImageButton>(R.id.second_exercise_imgaeb)
        imgbThirdExercise = view.findViewById<ImageButton>(R.id.third_exercise_imgaeb)
        imgbFourthExercise = view.findViewById<ImageButton>(R.id.fourth_exercise_imgaeb)
        imgbFifthExercise = view.findViewById<ImageButton>(R.id.fifth_exercise_imgaeb)

        val bundle = Bundle()
        val bundle1 = Bundle()
        val bundle2 = Bundle()
        val bundle3 = Bundle()
        val bundle4 = Bundle()

        //vypytame si argument aky je
        val muscleGroup =
            MuscleGroup.valueOf(arguments?.getString("muscle") ?: MuscleGroup.LEGS.name)
        // Use the enum value here
        //porovnavame argument a vyplname
        when (muscleGroup) {
            MuscleGroup.PUSH -> {
                setPushFragment()

                bundle.putString("ak", ExerciseClass.BENCH.name)
                bundle1.putString("ak", ExerciseClass.FLY.name)
                bundle2.putString("ak", ExerciseClass.FRONT_RAISE.name)
                bundle3.putString("ak", ExerciseClass.OVER_PRESS.name)
                bundle4.putString("ak", ExerciseClass.PUSH_UP.name)

                nastavbtn(bundle, imgbFirstExercise)
                nastavbtn(bundle1, imgbSecondExercise)
                nastavbtn(bundle2, imgbThirdExercise)
                nastavbtn(bundle3, imgbFourthExercise)
                nastavbtn(bundle4, imgbFifthExercise)
            }

            MuscleGroup.PULL -> {
                setPullFragment()
                //naplnit 5 bundle
                bundle.putString("ak", ExerciseClass.DEAD_LIFT.name)
                bundle1.putString("ak", ExerciseClass.BENT_OVER.name)
                bundle2.putString("ak", ExerciseClass.PULL_DOWN.name)
                bundle3.putString("ak", ExerciseClass.GOOD_MORNING.name)
                bundle4.putString("ak", ExerciseClass.BICEPS.name)

                //nastavnenie budnle
                nastavbtn(bundle, imgbFirstExercise)
                nastavbtn(bundle1, imgbSecondExercise)
                nastavbtn(bundle2, imgbThirdExercise)
                nastavbtn(bundle3, imgbFourthExercise)
                nastavbtn(bundle4, imgbFifthExercise)
            }

            MuscleGroup.LEGS -> {
                setLegsFragment()
                // Handle PULL case
                bundle.putString("ak", ExerciseClass.FRONT_BARBEL_SQUAT.name)
                bundle1.putString("ak", ExerciseClass.GLUTE_BRIDGE.name)
                bundle2.putString("ak", ExerciseClass.LEF_EXTENSION.name)
                bundle3.putString("ak", ExerciseClass.NORDIC_HAMSTRING_CURL.name)
                bundle4.putString("ak", ExerciseClass.CALF_RAISES.name)

                nastavbtn(bundle, imgbFirstExercise)
                nastavbtn(bundle1, imgbSecondExercise)
                nastavbtn(bundle2, imgbThirdExercise)
                nastavbtn(bundle3, imgbFourthExercise)
                nastavbtn(bundle4, imgbFifthExercise)
            }
        }
        return view
    }
    /**
     *Metoda služi na nastavenie cicenia do jednotlivých ImageButoon
     */
    fun nastavbtn(bundle: Bundle, imageButton: ImageButton){
        imageButton.setOnClickListener() {
            //cvik1
            findNavController().navigate(
                R.id.action_exercisesFragmentII_to_exerciseFragmentII, bundle
            )
        }

    }
    /**
     *
     * Metoda služi na nastavenie obrazkov do ImageButton
     */
    fun setPullFragment() {
        imgbFirstExercise.setImageResource(R.drawable.pulldeadlift)
        imgbSecondExercise.setImageResource(R.drawable.pullbentover)
        imgbThirdExercise.setImageResource(R.drawable.pulldown)
        imgbFourthExercise.setImageResource(R.drawable.pullgoodmorning)
        imgbFifthExercise.setImageResource(R.drawable.pullbicepscurl)
    }

    /**
     *
     * Metoda služi na nastavenie obrazkov do ImageButton
     */
    fun setLegsFragment(){
        imgbFirstExercise.setImageResource(R.drawable.frontsquat)
        imgbSecondExercise.setImageResource(R.drawable.glute)
        imgbThirdExercise.setImageResource(R.drawable.legsextension)
        imgbFourthExercise.setImageResource(R.drawable.nordic)
        imgbFifthExercise.setImageResource(R.drawable.calfreses)
    }
    /**
     *
     * Metoda služi na nastavenie obrazkov do ImageButton
    */
    fun setPushFragment(){
        imgbFirstExercise.setImageResource(R.drawable.bench)
        imgbSecondExercise.setImageResource(R.drawable.fly)
        imgbThirdExercise.setImageResource(R.drawable.frontraise)
        imgbFourthExercise.setImageResource(R.drawable.overpress)
        imgbFifthExercise.setImageResource(R.drawable.pushup)
    }
}