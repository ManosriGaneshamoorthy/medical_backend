package medical.mano.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import medical.mano.model.user;
import medical.mano.repository.userrepo;

import java.util.List;
import java.util.Optional;

@Service
public class userservice {

    @Autowired
    private final userrepo userrepo;

    public userservice(userrepo userrepo) {
        this.userrepo = userrepo;
    }

    public user createuser(user user) {
        return userrepo.save(user);
    }

    public user updateuser(int id, user user) {
        user.setid(id);
        return userrepo.save(user);
    }

    public user getuserById(int id) {
        Optional<user> userOptional = userrepo.findById(id);
        return userOptional.orElse(null);
    }

    public List<user> getAlluser() {
        return userrepo.findAll();
    }

    public void deleteuser(int id) {
        userrepo.deleteById(id);
    }
}