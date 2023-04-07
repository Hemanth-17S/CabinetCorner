package com.app.CabinetCorner.dao;


import com.app.CabinetCorner.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDAO extends CrudRepository<Role, String> {
}
