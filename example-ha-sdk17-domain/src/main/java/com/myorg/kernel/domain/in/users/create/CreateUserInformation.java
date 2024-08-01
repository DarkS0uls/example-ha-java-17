package com.myorg.kernel.domain.in.users.create;

import com.myorg.kernel.domain.util.AbstractInformationResponse;
import com.myorg.kernel.domain.util.HeaderObjectInformationResponse;
import com.myorg.kernel.domain.util.MessageObjectInformationResponse;

public class CreateUserInformation extends AbstractInformationResponse<CreateUserInformationPayload> {
    public CreateUserInformation(HeaderObjectInformationResponse headers,
                                 MessageObjectInformationResponse messageResponse,
                                 CreateUserInformationPayload data) {
        super(headers, messageResponse, data);
    }
}
