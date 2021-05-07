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


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding= DataBindingUtil.inflate<FragmentFillingBinding>(inflater,R.layout.fragment_filling, container, false)

        binding.submit.setOnClickListener {

            binding.fname=binding.firstName.editText?.text.toString()
            binding.lname=binding.lastName.editText?.text.toString()
            binding.age=binding.pAge.editText?.text.toString()
            binding.dept=binding.department.editText?.text.toString()
            binding.email=binding.mail.editText?.text.toString()
            binding.male=binding.Male.isChecked
            binding.female=binding.Female.isChecked
            binding.other=binding.additional.editText?.text.toString()

            val displayText="\n You are ${binding.fname} ${binding.lname}. \n \n You are ${binding.age} years old. \n \n" +
                    " Your gender is ${if(binding.male==true) "Male" else if(binding.female==true) "Female" else " "} .\n \n Joining " +
                    "details will be sent to: \n ${binding.email} \n \n You belong to ${binding.dept} department. \n " +
                    "\n Additional Information:\n ${binding.other}\n"

            val action= FillingFragmentDirections.actionFillingFragmentToDisplayFragment(displayText)

            Navigation.findNavController(binding.root).navigate(action)

        }
        return binding.root
    }
}