package za.co.supergroup.videos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import za.co.supergroup.videos.entity.Users;

import java.math.BigInteger;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, BigInteger> {

    public Users findUser(@Param("userName") String username, @Param("userPassword")String password);
}
