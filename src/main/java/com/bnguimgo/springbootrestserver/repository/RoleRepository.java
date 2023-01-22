package com.bnguimgo.springbootrestserver.repository;

import com.bnguimgo.springbootrestserver.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.stream.Stream;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Role findByRoleName(String roleName);

    @Query("select role from Role role")
    Stream<Role> getAllRolesStream();// Java8 Stream : on place la liste des rôles dans un Stream
}
