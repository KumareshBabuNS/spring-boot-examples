package demo

import org.springframework.data.jpa.repository.JpaRepository

interface ReadingListRepository extends JpaRepository<Book, Long> {

}