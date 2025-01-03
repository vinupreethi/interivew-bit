package org.ZomatoForReview.AuthenticationStrategy;

import org.ZomatoForReview.model.User;
import org.ZomatoForReview.model.ZomatoApp;

public abstract class AuthenticationStrategy {
    protected ZomatoApp zomatoApp;

    AuthenticationStrategy(ZomatoApp zomatoApp) {
        this.zomatoApp = zomatoApp;
    }

    public abstract void signUp(User user);

    public void signIn(User user) {
        if (zomatoApp.validateCredentials(user)) {
            zomatoApp.addActiveUser(user);
        } else {
            System.out.println("Invalid authentication;");
        }


    }
}
