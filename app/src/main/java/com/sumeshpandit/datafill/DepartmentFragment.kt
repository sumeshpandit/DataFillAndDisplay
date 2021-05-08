package com.sumeshpandit.datafill

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sumeshpandit.datafill.databinding.FragmentDepartmentBinding

class DepartmentFragment : Fragment() {
    private var layoutManager:RecyclerView.LayoutManager?=null
    private var adapter:RecyclerView.Adapter<RecyclerAdapter.ViewHolder>?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding=DataBindingUtil.inflate<FragmentDepartmentBinding>(inflater,R.layout.fragment_department,container,false)

        layoutManager=LinearLayoutManager(context)
        binding.recyclerView.layoutManager=layoutManager
        adapter=RecyclerAdapter()
        binding.recyclerView.adapter=adapter

        binding.goBack.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.action_departmentFragment_to_fillingFragment)
        }

        return binding.root
    }

}