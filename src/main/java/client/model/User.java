package client.model;

import java.util.ArrayList;

public class User {
//    private String contact;
    public String uid;
    public String account_name;
    public String email;
    public ArrayList<User> contactList;
    //private ArrayList<Group> groupsList;

//    public User(String contact) {
//        this.contact = contact;
//    }

//    public User(String contact, String uid, String account_name) {
//        this.contact = contact;
//        this.uid = uid;
//        this.account_name = account_name;
//        contactList = new ArrayList<User>();
//    }

//    public String getContact() {
//        return contact;
//    }

    public String getUid() {
        return uid;
    }

    public String getAccount_name() {
        return account_name;
    }

    public String getEmail() {
        return email;
    }
}
