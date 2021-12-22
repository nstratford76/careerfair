package com.example.careerfair.ui.applications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.careerfair.databinding.FragmentApplicationsBinding

class ApplicationsFragment : Fragment() {

    private lateinit var applicationsViewModel: ApplicationsViewModel
    private var _binding: FragmentApplicationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        applicationsViewModel =
                ViewModelProvider(this).get(ApplicationsViewModel::class.java)

        _binding = FragmentApplicationsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textApplications
        applicationsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}