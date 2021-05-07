package com.sumeshpandit.datafill

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.sumeshpandit.datafill.databinding.FragmentDepartmentBinding

class DepartmentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding=DataBindingUtil.inflate<FragmentDepartmentBinding>(inflater,R.layout.fragment_department,container,false)

        binding.olaElectric.setOnClickListener {  }

        return binding.root
    }

}