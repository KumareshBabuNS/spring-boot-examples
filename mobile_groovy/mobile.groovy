@RestController
@EnableDeviceResolver
class Mobile {
  @RequestMapping("/")
  String helloWorld(Device device) {
    if (device.isNormal()) {
      "Normal"
    } else if (device.isMobile()) {
      "Mobile"
    } else if (device.isTablet()) {
      "Tablet"
    } else {
      "Unknown"
    }
  }
}
