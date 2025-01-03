package org.ZomatoForReview.AuthenticationStrategy;

import org.ZomatoForReview.model.User;
import org.ZomatoForReview.model.ZomatoApp;

public class PhoneAuthentication extends AuthenticationStrategy {
    PhoneAuthentication(ZomatoApp zomatoApp) {
        super(zomatoApp);
    }

    @Override
    public void signUp(User user) {
        PhoneUser phoneUser = new PhoneUser(user);
        int otp = phoneUser.generateOtp(user);
        zomatoApp.saveUserinDb(user);
    }


}
