@Grab("spring-boot-starter-data-jpa")
@Grab("spring-boot-starter-data-rest")

import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@Configuration
@EnableJpaRepositories
@Import(RepositoryRestMvcConfiguration.class)
class RC{}

