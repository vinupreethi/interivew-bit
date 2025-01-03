package org.ZomatoForReview.AuthenticationStrategy;

import org.ZomatoForReview.model.User;

public class AuthenticationContext {
    private AuthenticationStrategy authenticationStrategy;

    public AuthenticationContext(AuthenticationStrategy authenticationStrategy) {
        this.authenticationStrategy = authenticationStrategy;
    }

    public void SignIn(User user) {
        authenticationStrategy.signIn(user);
    }

    public void signUp(User user) {
        authenticationStrategy.signUp(user);
    }


}
