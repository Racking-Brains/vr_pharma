package com.VRPharma.PharmaArtifact.controller;

import com.VRPharma.PharmaArtifact.models.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class JWTController {
    @PostMapping(path = "/usr/add")
    public User register(@org.jetbrains.annotations.NotNull @RequestBody User usr) {
        System.out.println("You are in path: /usr/add");
        return new User(usr.getId(), usr.getEmail(), usr.getUserName(),usr.getPasswd());
    }

    @PostMapping(path = "/usr/edit")
    public User edit(@org.jetbrains.annotations.NotNull @RequestBody User usr) {
        System.out.println("You are in path: /usr/edit");
        return new User(usr.getUserName()+"/usr/edit", usr.getUserName()+usr.getPasswd(),usr.getEmail());
    }
}