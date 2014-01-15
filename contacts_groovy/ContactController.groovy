@Grab("org.thymeleaf:thymeleaf-spring3:2.0.16")

@Controller
@RequestMapping("/")
class ContactController {

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