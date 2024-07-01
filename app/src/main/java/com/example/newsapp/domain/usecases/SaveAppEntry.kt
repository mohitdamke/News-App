package com.example.newsapp.domain.usecases

import com.example.newsapp.data.manager.LocalUserManagerImpl
import com.example.newsapp.domain.manager.LocalUserManager

class SaveAppEntry(
    private val localUserManager : LocalUserManager
) {

    suspend  operator fun invoke(){
        localUserManager.saveAppEntry()
    }
}