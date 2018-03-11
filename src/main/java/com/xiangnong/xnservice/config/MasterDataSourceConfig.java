package com.xiangnong.xnservice.config;

import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
@MapperScan(basePackages = MasterDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "masterSqlSessionFactory")
public class MasterDataSourceConfig {

  static final String PACKAGE = "com.xiangnong.xnservice.mapper";
  static final String MAPPER_LOCATION = "classpath:mybatis/**/*.xml";

  @Bean
  @Primary
  @ConfigurationProperties(prefix = "spring.datasource")
  public DataSource masterDataSource() {
    return DataSourceBuilder.create().build();
  }


  @Bean(name = "masterTransactionManager")
  @Primary
  public DataSourceTransactionManager masterTransactionManager() {
    return new DataSourceTransactionManager(masterDataSource());
  }

  @Bean(name = "masterSqlSessionFactory")
  @Primary
  public SqlSessionFactory masterSqlSessionFactory(DataSource masterDataSource) throws Exception {
    final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
    sessionFactory.setDataSource(masterDataSource);
    sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(MasterDataSourceConfig.MAPPER_LOCATION));
    return sessionFactory.getObject();
  }
}