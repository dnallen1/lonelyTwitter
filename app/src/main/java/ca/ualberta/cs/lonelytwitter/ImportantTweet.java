package ca.ualberta.cs.lonelytwitter;

/**
 * Created by dnallen on 9/20/18.
 */

public class ImportantTweet extends Tweet {

    @Override
    public Boolean isImportant(){
        return true;
    }
}
