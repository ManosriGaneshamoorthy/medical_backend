package medical.mano.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import medical.mano.model.user;
import medical.mano.service.userservice;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class ApiController {
    @Autowired
    private final userservice userService;

    public ApiController(userservice userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<user> createuser(@RequestBody user user) {
        user createduser = userService.createuser(user);
        return new ResponseEntity<>(createduser, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<user> updateuser(@PathVariable int id, @RequestBody user user) {
        user updateduser = userService.updateuser(id, user);
        return new ResponseEntity<>(updateduser, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<user> getuserById(@PathVariable int id) {
        user user = userService.getuserById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<user>> getAlluser() {
        List<user> userList = userService.getAlluser();
        return new ResponseEntity<>(userList, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteuser(@PathVariable int id) {
        userService.deleteuser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}