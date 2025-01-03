package org.ZomatoForReview.AuthenticationStrategy;

import org.ZomatoForReview.model.User;

import java.util.Random;

public class GoogleUser {
    private User user;

    public GoogleUser(User user) {
        this.user = user;
    }

    public int generateGoogleToken(User user) {
        int otp = new Random().nextInt(1000) + 9999;
        return otp;
    }




}
