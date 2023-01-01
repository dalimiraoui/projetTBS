package com.example.projet_tbs.repository;

import com.example.projet_tbs.models.ERole;
import com.example.projet_tbs.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
