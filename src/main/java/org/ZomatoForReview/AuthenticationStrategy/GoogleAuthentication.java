package org.ZomatoForReview.AuthenticationStrategy;

import org.ZomatoForReview.model.User;
import org.ZomatoForReview.model.ZomatoApp;

public class GoogleAuthentication extends AuthenticationStrategy {

    GoogleAuthentication(ZomatoApp zomatoApp) {
        super(zomatoApp);
    }
    @Override
    public void signUp(User user) {
        GoogleUser googleUser = new GoogleUser(user);
        int googleToken = googleUser.generateGoogleToken(user);
        zomatoApp.saveUserinDb(user);

    }



}
