package com.myorg.adapter.out.postgres.users.repository;

import com.myorg.adapter.out.postgres.users.entity.UsersEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends CrudRepository<UsersEntity, Integer> {

}

