package com.example.jeyamani.ModelUser;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class UserTemplate {
    @Id
    private int userId;
    private String userName;
    private String emailId;
    private long totalBalance;

    public UserTemplate(int userId, String userName, String emailId, long totalBalance)
    {
        this.userId = userId;
        this.userName = userName;
        this.emailId = emailId;
        this.totalBalance = totalBalance;
    }
    public int getUserId()
    {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getEmailId() {
        return emailId;
    }
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public long getTotalBalance() {
        return totalBalance;
    }
    public void setTotalBalance(long totalBalance) {
        this.totalBalance = totalBalance;
    }


    public UserTemplate() {

    }

}