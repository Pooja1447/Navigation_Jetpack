package com.example.navigationjetpack

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

/**
 * Created by Pooja Patle on 15-05-2022.
 */
class AuthViewModel : ViewModel() {

    private var _isLoading = MutableStateFlow(true)
    val isLoading: StateFlow<Boolean> = _isLoading

    init {

        viewModelScope.launch {
            delay(2000)
            _isLoading.value = false
        }
    }

}