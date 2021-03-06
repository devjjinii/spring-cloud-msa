package com.yujin.userservice.jpa;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long>{

    UserEntity findByUserId(String userId); // findBy >> select

    UserEntity findByEmail(String username);
}
