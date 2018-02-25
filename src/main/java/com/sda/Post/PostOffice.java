package com.sda.Post;

public class PostOffice {
    private SenderService senderService;
    private UserStorage userStorage;

    public PostOffice(SenderService senderService, UserStorage userStorage) {
        this.senderService = senderService;
        this.userStorage = userStorage;
    }

    public PostOffice() {
    }

    public boolean createNewUser(String nickname){
        return userStorage.createNewUser(nickname);
    }

    public SenderService getSenderService() {
        return senderService;
    }

    public void setSenderService(SenderService senderService) {
        this.senderService = senderService;
    }

    public UserStorage getUserStorage() {
        return userStorage;
    }

    public void setUserStorage(UserStorage userStorage) {
        this.userStorage = userStorage;
    }
}
