package com.sumeshpandit.datafill

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.sumeshpandit.datafill.databinding.FragmentDisplayBinding

class DisplayFragment : Fragment() {

    private val args: DisplayFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding=DataBindingUtil.inflate<FragmentDisplayBinding>(inflater,R.layout.fragment_display, container, false)

        val fill=args.displayText
        binding.displayText=fill

        val salute="Have a nice day!"
        Toast.makeText(context,salute, Toast.LENGTH_SHORT).show()

        binding.backButton.setOnClickListener {
            Navigation.findNavController(binding.root).navigate(R.id.action_displayFragment_to_fillingFragment)
        }
        return binding.root
    }

}