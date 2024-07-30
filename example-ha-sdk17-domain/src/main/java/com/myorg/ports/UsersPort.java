package com.myorg.ports;

import com.myorg.kernel.domain.out.postgres.users.UsersDto;
import com.myorg.kernel.domain.out.postgres.users.UsersMassiveDto;
import reactor.core.publisher.Mono;

import java.util.Date;

public interface UsersPort {

    Mono<UsersDto> createUser(UsersDto usersDto);

    Mono<UsersDto> updateUser(UsersDto usersDto);

    Mono<Void> deleteUser(UsersDto usersDto);

    Mono<UsersDto> getUserById(Integer id);

    Mono<UsersMassiveDto> getAllUsers(Integer pageNumber,
                                      Integer pageSize,
                                      String status,    //query by enum value
                                      String userName,  //query by like value
                                      String cellphone, //query by exactly value
                                      Date createdDt  //query by date
    );
}
