package com.example.newsapp.presentation.onboarding

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel

sealed class OnBoardingEvent  {

    object SaveAppEntry : OnBoardingEvent()

}