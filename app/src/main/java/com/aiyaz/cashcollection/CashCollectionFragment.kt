package com.aiyaz.cashcollection

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aiyaz.cashcollection.databinding.CashCollectionFragmentBinding

class CashCollectionFragment : Fragment() {

    companion object {
        fun newInstance() = CashCollectionFragment()
    }

    private lateinit var viewModel: CashCollectionViewModel
    private lateinit var binding: CashCollectionFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = CashCollectionFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(CashCollectionViewModel::class.java)
        binding.viewModel = viewModel
    }


}