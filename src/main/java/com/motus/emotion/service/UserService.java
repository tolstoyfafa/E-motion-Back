package com.motus.emotion.service;

import com.motus.emotion.dto.UserDto;
import com.motus.emotion.exception.AlreadyExistException;
import com.motus.emotion.exception.NotFoundException;
import com.motus.emotion.model.User;

import java.util.List;

public interface UserService {

    User getById(Long id);

    User getByMail(String mail) throws NotFoundException;

    List<User> getAll();

    User save(User user) throws AlreadyExistException;

    void delete(Long id);

    User updateUser(User user, User current) throws NotFoundException;

    User updateProfile(Long id, UserDto current) throws NotFoundException;

    boolean isUserExist(String mail) throws NotFoundException;

    boolean isAdmin(Long id,String mail) throws NotFoundException;
}
