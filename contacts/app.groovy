@Grab("org.springframework.boot:spring-boot-starter-actuator:0.5.0.M4")
@Grab("org.thymeleaf:thymeleaf-spring3:2.0.16")
@Grab("com.h2database:h2:1.3.173")

@Controller
@RequestMapping("/")
class App {

  @Autowired
  ContactRepository contactRepo

  @RequestMapping(method=RequestMethod.GET)
  String home(Map<String,Object> model) {
    List<Contact> contacts = contactRepo.findAll()
    model.putAll([contacts: contacts])
    return "home"
  }

  @RequestMapping(method=RequestMethod.POST)
  String submit(Contact contact) {
    contactRepo.save(contact)
    return "redirect:/"
  }
}