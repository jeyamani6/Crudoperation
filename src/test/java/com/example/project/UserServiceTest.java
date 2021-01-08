package com.example.project;

import com.example.project.Common.GlobalExceptionHandling;
import com.example.project.model.User;
import com.example.project.service.UserService;
import org.junit.*;
import org.junit.Test;
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

    public class UserServiceTest {

        UserService service;

        @Before
        public void init()
        {
            service=new UserService();
            service.addingUser(a);
            service.addingUser(b);
            service.addingUser(c);
        }

    User a=new User(1,"jeya","@jeya",1000);

    User b=new User(2,"mani","@mani",2000);

    User c=new User(3,"jeyamani","@jeyamanimani",3000);

    List<User> topic = new ArrayList<User>(Arrays.asList(a,b,c));

    @Test

    public void addUser()
    {

    }

    @Test

    public void gettingAllUsers()
    {
        List<User> userList=service.gettingAllUsers();
        assertEquals(1,userList.get(0).getUserId());
        assertEquals("jeya",userList.get(0).getUserName());
        assertEquals("@jeya",userList.get(0).getEmailId());
        assertEquals(1000,userList.get(0).getTotalBalance());
        assertEquals(2,userList.get(1).getUserId());
        assertEquals("mani",userList.get(1).getUserName());
        assertEquals("@mani",userList.get(1).getEmailId());
        assertEquals(2000,userList.get(1).getTotalBalance());
        assertEquals(3,userList.get(2).getUserId());
        assertEquals("jeyamani",userList.get(2).getUserName());
        assertEquals("@jeyamanimani",userList.get(2).getEmailId());
        assertEquals(3000,userList.get(2).getTotalBalance());
    }
    @Test
    public void gettingUserById() throws GlobalExceptionHandling
    {
      User user1=service.gettingUserById(1);
      User user2=service.gettingUserById(2);
      User user3=service.gettingUserById(3);
      assertEquals(1,user1.getUserId());
      assertEquals("jeya",user1.getUserName());
      assertEquals("@jeya",user1.getEmailId());
      assertEquals(1000,user1.getTotalBalance());
      assertEquals(2,user2.getUserId());
      assertEquals("mani",user2.getUserName());
      assertEquals("@mani",user2.getEmailId());
      assertEquals(2000,user2.getTotalBalance());
      assertEquals(3,user3.getUserId());
      assertEquals("jeyamani",user3.getUserName());
      assertEquals("@jeyamanimani",user3.getEmailId());
      assertEquals(3000,user3.getTotalBalance());
    }
    @Test
    public void updatingUser() throws GlobalExceptionHandling
    {

    }
    @Test
    public void deletingUser()
    {

    }
}
