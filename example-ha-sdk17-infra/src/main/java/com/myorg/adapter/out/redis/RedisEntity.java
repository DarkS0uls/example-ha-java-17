package com.myorg.adapter.out.redis;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

import java.io.Serializable;

@RedisHash("redis")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class RedisEntity implements Serializable {

    @Id
    private String id;
    private String name;
    private String email;
}
