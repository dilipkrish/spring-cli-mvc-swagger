@Grab(group='com.mangofactory', module='swagger-springmvc', version='0.8.8')

@com.mangofactory.swagger.plugin.EnableSwagger
@RestController
class ThisWillActuallyRun {

    @RequestMapping("/")
    String home() {
        "Hello World!"
    }

}
