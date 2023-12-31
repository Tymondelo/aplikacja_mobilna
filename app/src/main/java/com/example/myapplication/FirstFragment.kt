package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.myapplication.databinding.FragmentFirstBinding
import com.google.android.material.textfield.TextInputEditText

class FirstFragment : Fragment() {
    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    private lateinit var textInputEditText: TextInputEditText
    private lateinit var textInputEditText2: TextInputEditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textInputEditText1: TextInputEditText = binding.editTextText4
        val textInputEditText2: TextInputEditText = binding.editTextText5

        binding.buttonFirst.setOnClickListener {
            val text1 = textInputEditText1.text.toString()
            val text2 = textInputEditText2.text.toString()

            val myToast = Toast.makeText(context, "Witaj użytkowniku - $text1 $text2", Toast.LENGTH_SHORT)
            myToast.show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
