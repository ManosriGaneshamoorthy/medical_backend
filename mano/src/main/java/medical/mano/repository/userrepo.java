package medical.mano.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import medical.mano.model.user;
@Repository
public interface userrepo extends JpaRepository<user, Integer>{}
