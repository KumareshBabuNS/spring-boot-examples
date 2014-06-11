@RestController 
class App { 
  @RequestMapping("/")
  def hi() {
  	"Hi!"
  }
}