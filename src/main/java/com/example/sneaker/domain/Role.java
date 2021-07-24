package com.example.sneaker.domain;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by Alexey Podlubnyy on 24.07.2021
 */
public enum Role implements GrantedAuthority {
    USER;

    @Override
    public String getAuthority() {
        return name();
    }
}
