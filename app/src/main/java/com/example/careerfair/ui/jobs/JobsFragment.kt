package com.example.careerfair.ui.jobs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.careerfair.databinding.FragmentJobsBinding

class JobsFragment : Fragment() {

    private lateinit var jobsViewModel: JobsViewModel
    private var _binding: FragmentJobsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        jobsViewModel =
                ViewModelProvider(this).get(JobsViewModel::class.java)

        _binding = FragmentJobsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textJobs
        jobsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}