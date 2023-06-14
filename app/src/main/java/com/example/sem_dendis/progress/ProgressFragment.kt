package com.example.sem_dendis.progress

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.sem_dendis.R
import com.example.sem_dendis.data.AppData
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.text.SimpleDateFormat
import java.util.Date

class ProgressFragment : Fragment() {

    @SuppressLint("SimpleDateFormat")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_progress2, container, false)

        val imgTextprogress = view.findViewById<TextView>(R.id.progress_aaaaa)
        val floautBt = view.findViewById<FloatingActionButton>(R.id.floatingButton)

        //Dolny ukazovatel
        val lastDate = view.findViewById<TextView>(R.id.text_last_date)
        val lastWeight = view.findViewById<TextView>(R.id.text_last_weight)

        val dateFormat = SimpleDateFormat("dd/MM/yyyy")

        //vyberame data
        val data = AppData.getDatabase(requireContext()).userDao().getAll()
        //premapujeme na spravne hodnoty
        imgTextprogress.text = (data.joinToString { "${it.id}  ${dateFormat.format(Date(it.date))}  ${it.weight}\n" })

        //da do lokalnej data z room
        val lastW :Double = data.last().weight
        val lastD :Long = data.last().date

        // vlozi posledne values do okienok
        lastWeight.text = lastW.toString()
        lastDate.text = lastD.toString()

        floautBt.setOnClickListener(){
            findNavController().navigate(R.id.action_progressFragment_to_progressaddingInfo_Fragment)
        }

        return view
    }

}