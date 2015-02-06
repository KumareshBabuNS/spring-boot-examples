package demo

@Grab("spring-boot-starter-actuator")
@Grab("spring-boot-starter-data-jpa")
@Grab("h2")

@Controller
@RequestMapping("/hi")
class ReadingListController {

	@Autowired
	ReadingListRepository readingListRepository

	@RequestMapping(method=RequestMethod.GET)
	@ResponseBody
	String hi() {
		"Hi"
	}

}