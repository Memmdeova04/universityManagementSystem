package org.example.universitymanagementsystemm.repository;

import org.example.universitymanagementsystemm.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GroupRepository extends JpaRepository<Group,Long> {
    Optional<Group> findByName(String name);
}
