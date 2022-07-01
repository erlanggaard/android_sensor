package com.erlanggaard.sensor_10121802.ui.info;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

// Nama     : Erlangga Ardiansyah R
// NIM      : 10121802
// Kelas    : IF-3

public class InfoViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public InfoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is info fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}