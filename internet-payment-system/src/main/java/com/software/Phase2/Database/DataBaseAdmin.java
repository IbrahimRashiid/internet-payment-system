package com.software.Phase2.Database;

import com.software.Phase2.registeration.Admin;
import com.software.Phase2.registeration.User;

import java.util.ArrayList;
import java.util.List;

public class DataBaseAdmin {
    static List<Admin> admins=new ArrayList<Admin>(List.of(new Admin("admin@gmail.com","admin")));
    public static List<Admin> getAdmin()
    {
        return admins;
    }
    public static boolean login(String email,String password)
    {
        for(Admin account:admins)
        {
            if(account.getEmail().equals(email)&&account.getPassword().equals(password))
            {
                return true;
            }

        }
        return false;
    }
}
