package com.example.sidebar.ui.xitong

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.sidebar.databinding.FragmentXitongBinding

class XitongFragment : Fragment() {

    private var _binding: FragmentXitongBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val xitongViewModel =
            ViewModelProvider(this).get(XitongViewModel::class.java)

        _binding = FragmentXitongBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textXitong
        xitongViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}