package org.ZomatoForReview.AuthenticationStrategy;

import org.ZomatoForReview.model.User;
import org.ZomatoForReview.model.ZomatoApp;

public class EmailAuthentication extends AuthenticationStrategy {

    public EmailAuthentication(ZomatoApp zomatoApp) {
        super(zomatoApp);
    }

    @Override
    public void signUp(User user) {
        EmailUser emailUser = new EmailUser(user);
        int otp = emailUser.generateOtp(user);
        zomatoApp.saveUserinDb(user);


    }


}
