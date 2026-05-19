package com.example.counterstateapp;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ScoreViewModel extends ViewModel {

    private final MutableLiveData<Integer> score = new MutableLiveData<>();

    public ScoreViewModel() {
        score.setValue(0);
    }

    public void increaseScore() {
        Integer currentScore = score.getValue();

        if (currentScore != null) {
            score.setValue(currentScore + 1);
        }
    }

    public void decreaseScore() {
        Integer currentScore = score.getValue();

        if (currentScore != null) {
            score.setValue(currentScore - 1);
        }
    }

    public void resetScore() {
        score.setValue(0);
    }

    public LiveData<Integer> getScore() {
        return score;
    }
}