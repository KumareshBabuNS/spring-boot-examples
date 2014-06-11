@Controller class TW {
  Twitter t
  @RequestMapping("/") def h() {
    "redirect:/connect/twitter"
  }
}
