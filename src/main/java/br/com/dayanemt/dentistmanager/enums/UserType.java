package br.com.dayanemt.dentistmanager.enums;

import org.springframework.security.core.GrantedAuthority;

public enum UserType implements GrantedAuthority {
    ADMIN,
    /**
     * only schedule appointments
     */
    ASSISTANT;

    UserType() {
    }

    @Override
    public String toString() {
        return name();
    }

    @Override
    public String getAuthority() {
        return this.name();
    }
}
