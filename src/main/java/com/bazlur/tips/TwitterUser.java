package com.bazlur.tips;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bazlur Rahman Rokon
 * @date 11/6/15.
 */
public class TwitterUser {
    private String handle;
    private List<String> tweets = new ArrayList<>();
    private int counter;

    public TwitterUser(String handle) {
        this.handle = handle;
    }

    public void incrementCount() {

        counter++;
    }

    public String getHandle() {
        return handle;
    }

    public TwitterUser setHandle(String handle) {
        this.handle = handle;
        return this;
    }

    public List<String> getTweets() {
        return tweets;
    }

    public TwitterUser setTweets(List<String> tweets) {
        this.tweets = tweets;
        return this;
    }
}
