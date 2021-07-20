/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package library.model;

import library.exeption.PublicationAlreadyExistException;
import library.exeption.UserAlreadyExistException;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Library implements Serializable {

    private Map<String, Publication> publications = new HashMap<>();
    private Map<String, LibraryUser> users = new HashMap<>();

    public Map<String, Publication> getPublications() {
        return publications;
    }

    public Map<String, LibraryUser> getUsers() {
        return users;
    }

    public void addPublication(Publication publication) {
        if (publications.containsKey(publication.getTitle())){
            throw new PublicationAlreadyExistException(
                    "Istnieje już publikacja o tytule  " + publication.getTitle());
        }publications.put(publication.getTitle(), publication);
    }

    public void addUser(LibraryUser user){
        if (users.containsKey(user.getPesel())){
            throw new UserAlreadyExistException(
                    "Istnieje już użytkownik o peselu " + user.getPesel());
        }users.put(user.getPesel(), user);
    }

    public boolean removePublication(Publication p) {
        if (publications.containsValue(p)) {
            publications.remove(p.getTitle());
            return true;
        } else {
            return false;
        }
    }
}
