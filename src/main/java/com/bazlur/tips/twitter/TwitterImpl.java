package com.bazlur.tips.twitter;

import java.util.List;

/**
 * @author Bazlur Rahman Rokon
 * @since 3/27/16.
 */
public class TwitterImpl implements Twitter {
  private static final int MAX_TWEET_SIZE = 10; //constant
  private Tweet[] tweets = new Tweet[MAX_TWEET_SIZE]; // array
  private int index = 0;

  @Override
  public void addTweet(Tweet tweet) {
    tweets[index] = tweet;
    index++;
  }

  @Override
  public void printAllTweets() {
    for (Tweet tweet : tweets) {
        System.out.println(tweet);
    }
  }

  public static void main(String[] args) {
    Twitter twitter = new TwitterImpl();
    Tweet tweet = new Tweet("Quick brown fox jumps over " +
            "the lazy dog", "Bazlur Rahman");

    twitter.addTweet(tweet);
    twitter.printAllTweets();
  }
}
