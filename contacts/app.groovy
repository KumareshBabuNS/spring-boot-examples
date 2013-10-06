@Grab("org.springframework.boot:spring-boot-starter-actuator:0.5.0.M4")
@Grab("org.thymeleaf:thymeleaf-spring3:2.0.16")
@Grab("org.springframework:spring-jdbc:4.0.0.M3")
@Grab("com.h2database:h2:1.3.173")

import java.sql.ResultSet

@Controller
@RequestMapping("/")
class App {

  @Autowired
  JdbcTemplate jdbc

  @RequestMapping(method=RequestMethod.GET)
  String home(Map<String,Object> model) {

    List<Contact> contacts = jdbc.query(
      "select id, firstName, lastName, phoneNumber, emailAddress from contacts order by lastName", 
      new RowMapper<Contact>() {
        Contact mapRow(ResultSet rs, int rowNum) {
          new Contact(id: rs.getLong(1), firstName: rs.getString(2), lastName: rs.getString(3), phoneNumber: rs.getString(4), emailAddress: rs.getString(5))
        }
      })

    model.putAll([contacts: contacts])
    return "home"
  }

  @RequestMapping(method=RequestMethod.POST)
  String submit(Contact contact) {
    jdbc.update("insert into contacts (firstName, lastName, phoneNumber, emailAddress) values (?, ?, ?, ?)",
      contact.firstName, contact.lastName, contact.phoneNumber, contact.emailAddress)
    return "redirect:/"
  }
}

class Contact {
  long id
  String firstName
  String lastName
  String phoneNumber
  String emailAddress
}