package com.debtmanager.debt_management_api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping("/retrieve/{id}")
    public String retrieve(@PathVariable Long id) {
        return "This will retrieve user with ID: " + id;
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable Long id) {
        return "This will update user with ID: " + id;
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return "This will delete user with ID: " + id;
    }

}
