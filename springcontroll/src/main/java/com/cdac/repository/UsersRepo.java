package com.cdac.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cdac.bean.Users;


@Repository
public interface UsersRepo extends CrudRepository<Users, String> {

}
