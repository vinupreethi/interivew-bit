package org.ZomatoForReview.AuthenticationStrategy;

import org.ZomatoForReview.model.User;
import org.ZomatoForReview.model.ZomatoApp;

public class FacebookAuthentication extends AuthenticationStrategy {

    FacebookAuthentication(ZomatoApp zomatoApp) {
        super(zomatoApp);
    }

    @Override
    public void signUp(User user) {
        FacebookUser facebookUser = new FacebookUser(user);
        int otp = facebookUser.generateOtpToEmail(user);
        zomatoApp.saveUserinDb(user);

    }


}
