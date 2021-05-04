package com.sumeshpandit.datafill

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.NavArgs
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.google.android.material.floatingactionbutton.FloatingActionButton


class DisplayFragment : Fragment() {

    private lateinit var  button:FloatingActionButton
    private val args: DisplayFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view= inflater.inflate(R.layout.fragment_display, container, false)

        button=view.findViewById(R.id.backButton)

        val details = view.findViewById<TextView> (R.id.content);

        val fill=args.displayText
        details.text=fill

        Toast.makeText(context,"Have a nice Day!", Toast.LENGTH_SHORT).show()

        button.setOnClickListener {

            Navigation.findNavController(view).navigate(R.id.action_displayFragment_to_fillingFragment)

        }
        return view
    }

}