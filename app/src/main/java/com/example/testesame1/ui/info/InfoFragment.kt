package com.example.testesame1.ui.info

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.testesame1.R
import com.example.testesame1.databinding.FragmentInfoBinding
import com.google.android.material.snackbar.Snackbar

class InfoFragment : Fragment() {

    private var _binding: FragmentInfoBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentInfoBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.activityMainEmailButton.setOnClickListener{
            binding.first.text = binding.insertYourEmail.text
            if(binding.insertYourEmail.text.contains("@")){
                Snackbar.make(binding.first, binding.insertYourEmail.text, Snackbar.LENGTH_SHORT).show()
            } else if (binding.insertYourEmail.text.contains(".")){
                Snackbar.make(binding.first, binding.insertYourEmail.text, Snackbar.LENGTH_SHORT).show()
            } else {
                Snackbar.make(binding.first, R.string.email_not_valid, Snackbar.LENGTH_SHORT).show()
            }
        }

//        val textView: TextView = binding.textDashboard
//        dashboardViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}