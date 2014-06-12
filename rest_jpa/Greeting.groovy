import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Greeting {
	@Id
	String id

	String message
}
