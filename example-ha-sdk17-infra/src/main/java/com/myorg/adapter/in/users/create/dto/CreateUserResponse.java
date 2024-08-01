package com.myorg.adapter.in.users.create.dto;

import com.myorg.adapter.in.util.GenericResponse;
import com.myorg.adapter.in.util.HeaderObjectResponse;
import com.myorg.adapter.in.util.MessageObjectResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserResponse implements Serializable, GenericResponse {
    private HeaderObjectResponse headers;
    private MessageObjectResponse messageResponse;
    private CreateUserResponseData data;
}
