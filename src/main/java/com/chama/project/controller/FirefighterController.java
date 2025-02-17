package com.chama.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chama.project.model.FirefighterModel;
import com.chama.project.service.FirefighterService;
import com.chama.project.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/firefighters")
public class FirefighterController {

    @Autowired
    private UserService userService;

    @Autowired
    private FirefighterService firefighterService;

    @GetMapping
    public List<FirefighterModel> getAllFirefighters() {
        return firefighterService.getAllFirefighters();
    }

    @GetMapping("/{id}")
    public ResponseEntity<FirefighterModel> getFirefighterById(@PathVariable Long id) {
        try {
            Optional<FirefighterModel> newFirefighterModel = firefighterService.getFirefighterById(id);
            if (newFirefighterModel.isPresent()) {
                return ResponseEntity.ok(newFirefighterModel.get());
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/create")
    public ResponseEntity<FirefighterModel> createFirefighter(@RequestBody FirefighterModel firefighter) {
        try {
            FirefighterModel createdFirefighter = (FirefighterModel) userService.creteNewUser(firefighter);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdFirefighter);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PutMapping("/updateFirefighter/{id}")
    public ResponseEntity<FirefighterModel> updateFirefighter(
            @PathVariable Long id,
            @RequestBody FirefighterModel updatedFirefighter) {
        return firefighterService.updateFirefighter(id, updatedFirefighter);
    }

}