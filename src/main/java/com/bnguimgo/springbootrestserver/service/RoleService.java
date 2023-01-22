package com.bnguimgo.springbootrestserver.service;

import com.bnguimgo.springbootrestserver.model.Role;

import java.util.Collection;
import java.util.stream.Stream;

public interface RoleService {

    Role findByRoleName(String roleName);

    // Sans Stream
    Collection<Role> getAllRoles();

    // Avec Stream
    Stream<Role> getAllRolesStream();
}
