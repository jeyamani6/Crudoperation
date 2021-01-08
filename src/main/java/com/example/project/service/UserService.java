package com.example.project.service;
    import com.example.project.Common.GlobalExceptionHandling;
    import com.example.project.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
    import java.util.Iterator;
    import java.util.List;

@Service
public class UserService {





    List<User> topicList = new ArrayList<User>();




    public List<User> gettingAllUsers() {
        return topicList;
    }

    public User gettingUserById(int id) throws GlobalExceptionHandling {



            int counter = 0;


            for (User user1 : topicList) {
                if ((user1.getUserId()) == id) {

                    return user1;
                }
                counter++;
            }



        throw new GlobalExceptionHandling();
    }

    public void addingUser(User user) {
        int flag=0;
        for(User u:topicList){
            if(user.getUserId()==u.getUserId()){
                flag=1;
            }

        }
        if(flag==0){
          topicList.add(user);

        }


    }

    public void updatingUser( User user,int id){
        int counter=0;
        for(User user1:topicList){
            if(user1.getUserId()==id)
            {
            topicList.set(counter,user);}
            counter++;
        }

    }
    public void deletingUser( int id) {
        int counter=0;

        for(User user1:topicList){
            if(user1.getUserId()==id)
            {
                topicList.remove(counter);}
            counter++;
        }



    }


/*List<User> topList=new ArrayList<>();
    public List<User> getByValue(String name) {
        for(User aa:topicList){
            if(name.equals(aa.getUserName())){
                topList.add(aa);
            }
        }
        if(topList.size()>0)
        return topList;
        else
            return null;
    }*/
}


