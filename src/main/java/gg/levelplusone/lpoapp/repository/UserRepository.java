package gg.levelplusone.lpoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gg.levelplusone.lpoapp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
