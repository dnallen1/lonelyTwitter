package ca.ualberta.cs.lonelytwitter;

import android.util.Log;

import java.util.Date;

/**
 * Created by dnallen on 9/22/18.
 */

public class Happy extends Mood {
    private Date happyMood;

    public Happy(Date happyMood) {
        this.happyMood = happyMood;
    }

    public Date getHappyMood() {
        return this.happyMood;
    }

    public void setHappyMood(Date happyMood) {
        this.happyMood = happyMood;
    }

    @Override
    public void currentMood() {
        Log.d("lab2", "My current mood is happy");
    }
}
