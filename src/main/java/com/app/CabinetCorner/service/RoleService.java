package com.app.CabinetCorner.service;


import com.app.CabinetCorner.dao.RoleDAO;
import com.app.CabinetCorner.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleDAO roleDAO;
    public Role createNewRole(Role role) {
        return roleDAO.save(role);
    }
}
