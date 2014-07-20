package contact;

import org.springframework.data.jpa.repository.*;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}