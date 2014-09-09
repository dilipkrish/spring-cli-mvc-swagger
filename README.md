Documenting your tweetable services
===================================

Starting from where [getting started with spring boot cli](http://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#getting-started-cli-example) leaves you... here is a quick start guide to documenting your _tweetable_ services.

This example uses [swagger-springmvc](https://github.com/martypitt/swagger-springmvc)

- Grab dependencies
```groovy
  @Grab(group='com.mangofactory', module='swagger-springmvc', version='0.8.8') 
  @Grab(group='org.ajar', module='swagger-spring-mvc-ui', version='0.2') //Webjar to support swagger UI
```
- Enable swagger support - add the following annotations to the controller
```
@com.mangofactory.swagger.plugin.EnableSwagger
```
- Run the application
```bash
spring run app.groovy
```
- Documentation should be available @ http://localhost:8080/index.html
- Replace the stalk swagger end-point with http://localhost:8080/api-docs

