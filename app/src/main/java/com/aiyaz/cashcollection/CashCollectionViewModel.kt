package com.aiyaz.cashcollection

import android.text.Editable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CashCollectionViewModel : ViewModel() {

    private val _grandTotal = MutableLiveData(0)
    val grandTotal : LiveData<Int> get() = _grandTotal

    private val _total2000Notes = MutableLiveData<Int>()
    val total2000Notes : LiveData<Int> get() = _total2000Notes

    private val _total500Notes = MutableLiveData<Int>()
    val total500Notes : LiveData<Int> get() = _total500Notes

    private val _total200Notes = MutableLiveData<Int>()
    val total200Notes : LiveData<Int> get() = _total200Notes


    private val _total100Notes = MutableLiveData<Int>()
    val total100Notes : LiveData<Int> get() = _total100Notes


    private val _total50Notes = MutableLiveData<Int>()
    val total50Notes : LiveData<Int> get() = _total50Notes


    private val _total20Notes = MutableLiveData<Int>()
    val total20Notes : LiveData<Int> get() = _total20Notes

    private val _total10Notes = MutableLiveData<Int>()
    val total10Notes : LiveData<Int> get() = _total10Notes

    private val _total5Notes = MutableLiveData<Int>()
    val total5Notes : LiveData<Int> get() = _total5Notes

    private val _total2Notes = MutableLiveData<Int>()
    val total2Notes : LiveData<Int> get() = _total2Notes

    private val _total1Notes = MutableLiveData<Int>()
    val total1Notes : LiveData<Int> get() = _total1Notes


    public fun setNotes2000(s: Editable) {
        _total2000Notes.value = s.toString().toIntOrNull()?:0
    }
}