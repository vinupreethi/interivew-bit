package org.ZomatoForReview.AuthenticationStrategy;

import org.ZomatoForReview.model.User;

import java.util.Random;

public class FacebookUser {
    private User user;

    public FacebookUser(User user) {
        this.user = user;
    }

    public int generateOtpToEmail(User user) {
        int otp = new Random().nextInt(1000) + 9999;
        return otp;
    }
}
