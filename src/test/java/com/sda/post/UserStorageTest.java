package com.sda.post;

import com.sda.Post.PostOffice;
import com.sda.Post.UserStorage;
import org.junit.Assert;
import org.junit.Test;

public class UserStorageTest {
    @Test
    public void shouldCreateNewUserWithGivenNicknameI(){
        //Given
        UserStorage userStorage = new UserStorage();
        String nickname ="qwert";

        //When
        boolean createNewUserResult = userStorage.createNewUser(nickname);

        //Then
        Assert.assertTrue("User was not created", createNewUserResult);
        Assert.assertTrue("User was not created", userStorage.isUserPresent(nickname));

    }
}
