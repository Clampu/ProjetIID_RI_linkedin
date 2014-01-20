package controllers;

import play.*;
import play.libs.OAuth2;
import play.mvc.*;

import java.util.*;

import models.*;

import java.util.Scanner;


public class Application extends Controller {    
	private static Scanner s;

    public static void index() {
    	/*
        if (OAuth2.isCodeResponse()) {
            // authUrl must be the same as the retrieveVerificationCode call
            OAuth2.Response response = FACEBOOK.retrieveAccessToken(authUrl);
            // null if an error occurred
            String accessToken = response.accessToken;
            // null if the call was a success
            OAuth2.Error = response.error;
            // Save accessToken, you will need it to request the service
            index();
        }
        // authUrl is a String containing an absolute URL where the service 
        // should redirect the user back
        // This will trigger a redirect
        FACEBOOK.requestVerificationCode(authUrl);
        

        */
    	
        render();
    }

}