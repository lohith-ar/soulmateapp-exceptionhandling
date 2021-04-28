package com.soulmate.soulmateapp.service;

import com.soulmate.soulmateapp.domain.SoulmateUser;
import com.soulmate.soulmateapp.exceptionhandler.UserAlreadyExistsException;
import com.soulmate.soulmateapp.exceptionhandler.UserDoesNotExistsException;

import java.util.List;

public interface UserService {

    public SoulmateUser saveUser(SoulmateUser user) throws UserAlreadyExistsException, Exception;
    public List<SoulmateUser> getAllUsers() throws Exception;
    public SoulmateUser updateUser(Integer id, SoulmateUser user) throws Exception;
    public void deleteUser(int id) throws UserDoesNotExistsException, Exception;
    public List<SoulmateUser> getAllUsersbyGender(String gender) throws Exception;
    public List<SoulmateUser> getAllUsersbyAge(int age) throws Exception;
    public List<SoulmateUser> getAllUsersbyName(String name) throws Exception;





}
