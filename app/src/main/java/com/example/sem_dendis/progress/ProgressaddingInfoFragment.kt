package com.example.sem_dendis.progress

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.sem_dendis.R
import com.example.sem_dendis.data.AppData
import com.example.sem_dendis.data.UserD
import java.text.SimpleDateFormat
import java.util.Date

class ProgressaddingInfoFragment : Fragment() {
    private var inputedInfoString : String? = null
    private var inputedDateString : String? = null

    @SuppressLint("SimpleDateFormat")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_progressadding_info_, container, false)

        val buttonBack: ImageButton = view.findViewById(R.id.backButton)
        val inputInfoWeight = view.findViewById<EditText>(R.id.inputInfoW)
        val saveButton = view.findViewById<ImageButton>(R.id.save_ImageButton)
        val inputInfoDate: EditText = view.findViewById(R.id.inputInfoD)

        //na formatovanie datumu
        val dateFormat = SimpleDateFormat("dd/MM/yyyy")


        saveButton.setOnClickListener(){
            println("a")
            //davame najskor do stringu a potom neskor na double
            inputedInfoString = inputInfoWeight.text.toString()
            inputedDateString = inputInfoDate.text.toString()


            if (inputInfoWeight.text.isNullOrEmpty() || inputInfoDate.text.isNullOrEmpty()  ) {
                Toast.makeText(this@ProgressaddingInfoFragment.context, "Enter both information", Toast.LENGTH_SHORT).show()

            }else{
                val inputWeight :Double = inputedInfoString!!.toDoubleOrNull() ?: 0.0
                val inputDate : Date = dateFormat.parse(inputedDateString)
                AppData.getDatabase(requireContext()).userDao().addUser(UserD(date = inputDate.time, weight = inputWeight))
                findNavController().popBackStack()

            }
        }
        buttonBack.setOnClickListener {
            findNavController().navigate(R.id.action_progressaddingInfo_Fragment_to_progressFragment)
        }/**/

        return view
    }

    /**
     * Ulozi zadane data v ikone
     */
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val userString = inputedInfoString
        val userDate = inputedDateString

        outState.putString("weightS", inputedInfoString)
        outState.putString("dateS", inputedDateString)
    }
    /**
     *Pri starte nahra data do ikony
     */
    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

        val userString = savedInstanceState?.getString("weightS", )
        val userDate= savedInstanceState?.getString("dateS", )

        inputedInfoString = userString

    }



}