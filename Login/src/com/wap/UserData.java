package com.wap;
import java.util.HashMap;
import java.util.Map;

public class UserData {
    Map<String, UserEntity> users = new HashMap<>();

    public UserData() {
        users.put("amjad", new UserEntity("amjad", "123"));
        users.put("karim", new UserEntity("karim", "123"));
    }

    public Map<String, UserEntity> getUsers() {
        return users;
    }

}
