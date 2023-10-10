package org.example;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class FacebookFetchTest {

    @Test
    public void testGetFriends_validLink() {
        FacebookFetch parser = new FacebookFetch();
        String[] friends = parser.getFriends("https://www.facebook.com/johndoe");
        Assert.assertArrayEquals(new String[]{"Friend1", "Friend2", "Friend3"}, friends);
    }

    @Test
    public void testGetFriends_invalidLink() {
        FacebookFetch parser = new FacebookFetch();
        String[] friends = parser.getFriends("invalidLink");
        Assert.assertNull(friends); // Assuming null is returned for an invalid link
    }
}