@Grab("h2")
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
@RepositoryRestResource(collectionResourceRel="greetings", path="greetings")
interface GreetingRepository extends JpaRepository<Greeting, String> {}
