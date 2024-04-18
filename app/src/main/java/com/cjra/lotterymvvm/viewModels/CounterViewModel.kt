package com.cjra.lotterymvvm.viewModels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    private val _counter = mutableIntStateOf(0)
    val counter: State<Int> = _counter

    fun add() {
        _counter.value += 1
    }
}