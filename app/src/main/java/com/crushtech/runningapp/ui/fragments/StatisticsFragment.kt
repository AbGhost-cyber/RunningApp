package com.crushtech.runningapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.crushtech.runningapp.R
import com.crushtech.runningapp.ui.viemodels.MainViewModel
import com.crushtech.runningapp.ui.viemodels.StatisticsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StatisticsFragment:Fragment(R.layout.fragment_statistics) {
    private val viewModel: StatisticsViewModel by viewModels()
}