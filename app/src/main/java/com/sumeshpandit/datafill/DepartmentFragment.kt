package com.sumeshpandit.datafill

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.sumeshpandit.datafill.databinding.FragmentDepartmentBinding

class DepartmentFragment : Fragment() {
    private var deptName="Department"
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding=DataBindingUtil.inflate<FragmentDepartmentBinding>(inflater,R.layout.fragment_department,container,false)

        binding.save.setOnClickListener {

            val dept = when {
                binding.olaElectric.isChecked -> "@string/ola_electric"
                binding.olaCabs.isChecked -> "Ola Cabs"
                binding.olaFoods.isChecked -> "Ola Foods"
                binding.olaMoney.isChecked -> "Ola Money"
                binding.olaHr.isChecked -> "Human Resources"
                else -> ""
            }
            deptName= "$deptName : $dept"

            val action= DepartmentFragmentDirections.actionDepartmentFragmentToFillingFragment(deptName)

            Navigation.findNavController(binding.root).navigate(action)
        }

        return binding.root
    }

}