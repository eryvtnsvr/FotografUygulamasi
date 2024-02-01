package com.example.butunleme.ui.galeri;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GaleriGoster extends ViewModel {
    private final MutableLiveData<String> mText;

    public GaleriGoster() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }
    public LiveData<String> getText() {
        return mText;
    }
}
