package com.wg.authority.security.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Data
@Slf4j
public class User implements Serializable {
    private String username;
    private String password;
}
