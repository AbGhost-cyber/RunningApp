package com.crushtech.runningapp.ui.viemodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.crushtech.runningapp.repos.MainRepos
import javax.inject.Inject

class StatisticsViewModel @ViewModelInject constructor(
    val mainRepos: MainRepos
):ViewModel() {
}