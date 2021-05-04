package com.sumeshpandit.datafill

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import androidx.navigation.Navigation

class FillingFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_filling, container, false)

        view.findViewById<Button>(R.id.submit).setOnClickListener {

            val fname = view.findViewById<EditText>(R.id.firstText)

            val lname = view.findViewById<EditText>(R.id.lastText)

            val age = view.findViewById<EditText>(R.id.ageText)

            val mail = view.findViewById<EditText>(R.id.mailText)

            val dept = view.findViewById<EditText>(R.id.deptText)

            val isMale = view.findViewById<RadioButton>(R.id.male)

            val rem = view.findViewById<EditText>(R.id.otherText)

            val dispText="\n You are ${fname.text} ${lname.text}. \n \n You are ${age.text} years old. \n \n" +
                    " Your gender is ${if(isMale.isChecked) "Male" else "Female"}.\n \n Joining " +
                    "details will be sent to: \n ${mail.text} \n \n You belong to ${dept.text} department. \n " +
                    "\n Additional Information:\n ${rem.text}\n"

            val action= FillingFragmentDirections.actionFillingFragmentToDisplayFragment(dispText)

            Navigation.findNavController(view).navigate(action)

        }
        return view
    }
}