package com.myorg.service.users;

import com.myorg.kernel.domain.out.postgres.users.UsersDto;
import com.myorg.kernel.domain.util.AbstractVo;
import com.myorg.ports.UsersPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Slf4j
public class UsersMangerService {

    private final UsersPort usersPort;

    public Mono<AbstractVo<UsersDto>> createUser(UsersDto usersDto) {
        log.info("UsersMangerService.createUser,Creating user with name: {}, and email: {}", usersDto.getName(), usersDto.getEmail());
        return usersPort.createUser(usersDto)
                .doOnSuccess(m -> log.info("UsersMangerService.createUser,User created successfully, with id: {}, user name:{} and email:{}", m.getId(), m.getName(), m.getEmail()))
                .map(responseDto -> new AbstractVo<>(true, "User created successfully", responseDto))
                .doOnError(e -> log.error("UsersMangerService.createUser,Error creating user, with user name: {},email:{} and details:{}", usersDto.getName(), usersDto.getEmail(), e.getMessage()))
                .onErrorResume(e -> Mono.just(new AbstractVo<>(false, "Error creating user", null)));
    }


}
