package com.koteswara.fragmenttafragmentdatatransferusingviewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FragmentToFragmentViewModel extends ViewModel {
    private final MutableLiveData<String> mutableLiveData =new MutableLiveData<>();
    public void setItem(String data){
        mutableLiveData.setValue(data);
    }
   public LiveData<String> getItem(){
            return mutableLiveData;
    }


}
