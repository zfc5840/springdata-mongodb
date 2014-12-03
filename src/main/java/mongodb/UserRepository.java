package mongodb;

import java.util.List;
import java.util.jar.Attributes.Name;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("userRepository")
public interface UserRepository extends MongoRepository<User, String> {

	@Query("{ fullName: ?0 }")
	List<User> findByTheUsersFullName(String fullName);

	List<User> findByFullNameLike(String fullName, Sort sort);
}
