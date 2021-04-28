package com.soulmate.soulmateapp.service;

import com.soulmate.soulmateapp.domain.SoulmateUser;
import com.soulmate.soulmateapp.exceptionhandler.UserAlreadyExistsException;
import com.soulmate.soulmateapp.exceptionhandler.UserDoesNotExistsException;

import java.util.List;

public interface UserService {

    public SoulmateUser saveUser(SoulmateUser user) throws UserAlreadyExistsException;
    public List<SoulmateUser> getAllUsers();
    public SoulmateUser updateUser(Integer id, SoulmateUser user);
    public void deleteUser(int id) throws UserDoesNotExistsException;
    public List<SoulmateUser> getAllUsersbyGender(String gender);
    public List<SoulmateUser> getAllUsersbyAge(int age);
    public List<SoulmateUser> getAllUsersbyName(String name);





}
