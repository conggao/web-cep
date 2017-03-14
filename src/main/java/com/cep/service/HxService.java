package com.cep.service;


public interface HxService {
    boolean addUser(String name, String password);

    boolean addAllUsersFromDb();

    boolean addUserFromFile();

    boolean delAllUsers();

    boolean delUser(String userName);

    boolean modifyPassword();

    boolean modifyPassword(Long id);

    boolean delUserFromFile();
}