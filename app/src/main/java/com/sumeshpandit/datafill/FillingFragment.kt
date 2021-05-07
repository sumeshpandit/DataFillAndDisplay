package com.sumeshpandit.datafill

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.sumeshpandit.datafill.databinding.FragmentFillingBinding

class FillingFragment : Fragment() {

    private var fName=""
    private var lName=""
    private var age=""
    private var dept=""
    private var email=""
    private var male=false
    private var female=false
    private var other=""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding= DataBindingUtil.inflate<FragmentFillingBinding>(inflater,R.layout.fragment_filling, container, false)

        binding.submit.setOnClickListener {

            fName=binding.firstName.editText?.text.toString()
            lName=binding.lastName.editText?.text.toString()
            age=binding.pAge.editText?.text.toString()
            dept=binding.department.editText?.text.toString()
            email=binding.mail.editText?.text.toString()
            male=binding.male.isChecked
            female=binding.female.isChecked
            other=binding.additional.editText?.text.toString()

            val displayText="\n You are ${fName} ${lName}. \n \n You are ${age} years old. \n \n" +
                    " Your gender is ${if(male==true) "Male" else if(female==true) "Female" else " "} .\n \n Joining " +
                    "details will be sent to: \n ${email} \n \n You belong to ${dept} department. \n " +
                    "\n Additional Information:\n ${other}\n"

            val action= FillingFragmentDirections.actionFillingFragmentToDisplayFragment(displayText)

            Navigation.findNavController(binding.root).navigate(action)

        }
        return binding.root
    }
}