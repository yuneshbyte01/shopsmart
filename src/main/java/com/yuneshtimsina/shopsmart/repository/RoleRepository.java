package com.yuneshtimsina.shopsmart.repository;

import com.yuneshtimsina.shopsmart.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
