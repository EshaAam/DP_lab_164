package Factory_class;

import Concrete_Classes.FacebookService;
import Concrete_Classes.LinkedInService;
import Concrete_Classes.TwitterService;
import Interfaces.SocialMediaService;

public class SocialMediaFactory {
    public static SocialMediaService getService(String platform) {
        switch (platform) {
            case "Twitter":
                return new TwitterService();
            case "Facebook":
                return new FacebookService();
            case "LinkedIn":
                return new LinkedInService();
            default:
                throw new IllegalArgumentException("Unsupported platform: " + platform);
        }
    }
}
