package org.perscholas.examples.services;

import org.perscholas.examples.models.User;

import java.util.List;

public interface UserService {
    User getUser();
    List<User> getUsers();
}
