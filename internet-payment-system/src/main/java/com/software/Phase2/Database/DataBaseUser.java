package com.software.Phase2.Database;

import com.software.Phase2.registeration.User;

import java.util.ArrayList;
import java.util.List;

public class DataBaseUser {
    static List<User> users=new ArrayList<User>();
    public static List<User> getUser()
    {
       return users;
    }
    public static User searchByUserName(String username)
    {
        for(User account:users)
        {
            if(account.getUserName().equals(username))
            {
                return account;
            }

        }
        return null;
    }
    public static void addUser(User user)
    {
       users.add(user);
    }
    public static boolean checkUser(User user)
    {
        for(User account:users)
        {
            if(account.getEmail().equals(user.getEmail())||account.getUserName().equals(user.getUserName()))
            {
                return true;
            }

        }
        return false;
    }

}
