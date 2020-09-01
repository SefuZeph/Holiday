package com.sefu.holiday.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.sefu.holiday.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HolidayListFragment : Fragment() {
    private val viewModel: HolidayListFragmentViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_holiday_list, container, false)
    }
}