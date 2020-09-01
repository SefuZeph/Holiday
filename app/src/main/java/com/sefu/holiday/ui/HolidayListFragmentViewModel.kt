package com.sefu.holiday.ui

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.sefu.holiday.repository.HolidayRepository

class HolidayListFragmentViewModel @ViewModelInject constructor(private val holidayRepository: HolidayRepository) :
    ViewModel() {
}