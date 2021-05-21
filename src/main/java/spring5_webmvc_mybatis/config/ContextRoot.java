package spring5_webmvc_mybatis.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ ContextDataSource.class, ContextSqlSession.class, ContextTransaction.class })
@ComponentScan(basePackages = { "spring5_webmvc_mybatis.mappers", "spring5_webmvc_mybatis.service" })
public class ContextRoot {

}
