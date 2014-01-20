package controllers;

import play.*;
import play.libs.OAuth2;
import play.mvc.*;

import java.util.*;

import models.*;

import java.util.Scanner;


public class Application extends Controller {    
	private static Scanner s;

    public static void index() 
    {
    	String clefAPI = "776bn8svtj9a0q";
    	String tokenUtilisateur = "e8308f41-99d9-4dec-9dda-7c147662b2cf";
    	String secretUtilisateur = "806379ac-3d61-422c-9f06-7d3d0782edca0";
    	String clefSecrette = "JcJjofLw1w14DesR";
    	
    	String adresseSite = "www.projetIIDMobilite.fr"; //?
    	
    	OAuth2 LINKEDIN = new OAuth2( );
        if (OAuth2.isCodeResponse()) {
            // authUrl must be the same as the retrieveVerificationCode call
            OAuth2.Response response = LINKEDIN.retrieveAccessToken(authUrl);
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
        LINKEDIN.requestVerificationCode(authUrl);
        

        
    
        render();
    }

}