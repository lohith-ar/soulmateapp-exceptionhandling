package com.soulmate.soulmateapp.service;

import com.soulmate.soulmateapp.domain.SoulmateUser;
import com.soulmate.soulmateapp.exceptionhandler.UserAlreadyExistsException;
import com.soulmate.soulmateapp.exceptionhandler.UserDoesNotExistsException;
import com.soulmate.soulmateapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userrepo;

    @Autowired
    public UserServiceImpl(UserRepository userrepo) {
        this.userrepo = userrepo;
    }

    @Override
    public SoulmateUser saveUser(SoulmateUser user) throws UserAlreadyExistsException, Exception {
        if(userrepo.existsById(user.getId())){
            throw new UserAlreadyExistsException();
        }
        return userrepo.save(user);
    }

    @Override
    public List<SoulmateUser> getAllUsers() throws Exception {
        return (List<SoulmateUser>) userrepo.findAll();
    }

    @Override
    public SoulmateUser updateUser(Integer id, SoulmateUser user) throws Exception{
        Optional<SoulmateUser> user1= userrepo.findById(id);
        user.setId(id);
        return userrepo.save(user);
    }

    @Override
    public void deleteUser(int id) throws UserDoesNotExistsException, Exception {
        Optional<SoulmateUser> user1= userrepo.findById(id);
        if(!user1.isPresent()){
            throw new UserDoesNotExistsException();
        }
        userrepo.deleteById(id);
    }

    @Override
    public List<SoulmateUser> getAllUsersbyGender(String gender) throws Exception {

        return userrepo.getUsersByGender(gender);
    }

    @Override
    public List<SoulmateUser> getAllUsersbyAge(int age)throws Exception {
        return userrepo.getUsersByAge(age);
    }

    @Override
    public List<SoulmateUser> getAllUsersbyName(String name)throws Exception {
        return userrepo.getUsersByName(name);
    }


}
