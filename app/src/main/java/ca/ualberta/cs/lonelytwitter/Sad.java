package ca.ualberta.cs.lonelytwitter;


import android.util.Log;

import java.util.Date;

/**
 * Created by dnallen on 9/22/18.
 */

public class Sad extends Mood {
    private Date sadMood;

    public Sad(Date sadMood) {
        this.sadMood = sadMood;
    }

    public Date getSadMood() {
        return this.sadMood;
    }

    public void setSadMood(Date sadMood) {
        this.sadMood = sadMood;
    }

    public void currentMood() {
        Log.d("Lab2", "My current mood is sad");
    }
}
