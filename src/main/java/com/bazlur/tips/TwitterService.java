package com.bazlur.tips;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Bazlur Rahman Rokon
 * @date 11/6/15.
 */
public class TwitterService {

    private final Map<String, TwitterUser> allTwitterUsers = new HashMap<>();

    public void onNewHashTag(String handle) {
//        TwitterUser twitterUser = allTwitterUsers.get(handle);
//        if (twitterUser == null) {
//            twitterUser = new TwitterUser(handle);
//        }
//
//        twitterUser.incrementCount();
//        allTwitterUsers.put(handle, twitterUser);

        TwitterUser twitterUser = allTwitterUsers.computeIfAbsent(handle, TwitterUser::new);
        twitterUser.incrementCount();

    }

    public Map<String, TwitterUser> getAllTwitterUsers() {

        return allTwitterUsers;
    }
}
