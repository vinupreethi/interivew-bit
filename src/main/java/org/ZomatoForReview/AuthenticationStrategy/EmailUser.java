package org.ZomatoForReview.AuthenticationStrategy;

import org.ZomatoForReview.model.User;

import java.util.Random;

public class EmailUser {
    private User user;

    public EmailUser(User user) {
        this.user = user;
    }

    public int generateOtp(User user) {
        int otp = new Random().nextInt(1000) + 9999;
        return otp;
    }


}
