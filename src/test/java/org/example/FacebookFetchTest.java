package org.example;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class FacebookFetchTest {

    @Test
    public void testRetrieveFriends_Positive() {
        FacebookFetch retriever = new FacebookFetch();
        String[] expected = {"Friend1", "Friend2", "Friend3"};
        String[] actual = retriever.getFriends("facebook.com/kevin_osterberg");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testRetrieveFriends_EmptyInput() {
        FacebookFetch retriever = new FacebookFetch();
        String[] expected = {};
        String[] actual = retriever.getFriends("");
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testRetrieveFriends_NullInput() {
        FacebookFetch retriever = new FacebookFetch();
        String[] expected = {};
        String[] actual = retriever.getFriends(null);
        assertArrayEquals(expected, actual);
    }
}
