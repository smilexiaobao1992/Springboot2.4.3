# Spring Boot 2.4.3 框架集成

这个项目是一个基于 Spring Boot 2.4.3 的框架集成示例，包括了常用的框架和组件，例如：

- MyBatis
- Druid
- Thymeleaf
- Swagger2
- Spring Security

## 环境配置

- Java 11+
- Maven 3.6+
- MySQL 5.6+

## 快速开始

1. 克隆项目代码到本地：`git clone https://github.com/smilexiaobao1992/Springboot2.4.3.git`
2. 进入项目目录：`cd Springboot2.4.3`
3. 修改数据库连接信息：在 `application.properties` 文件中修改 `spring.datasource.url`、`spring.datasource.username` 和 `spring.datasource.password` 等属性，以连接您自己的 MySQL 数据库。
4. 运行项目：`mvn spring-boot:run`
5. 打开浏览器，访问 `http://localhost:8080`，查看示例应用程序。

## 模块说明

- `src/main/java/com/example/demo`：示例代码的主要目录。
- `src/main/resources`：资源文件目录，包括配置文件、静态资源、模板文件等。
- `pom.xml`：Maven 项目配置文件，包括依赖项和插件配置等。

## 常见问题

### 如何修改应用程序端口号？

您可以在 `application.properties` 文件中修改 `server.port` 属性，例如：

server.port=8081

### 如何修改数据库连接信息？

您可以在 `application.properties` 文件中修改 `spring.datasource.url`、`spring.datasource.username` 和 `spring.datasource.password` 等属性，例如：

spring.datasource.url=jdbc:mysql://localhost:3306/test
spring.datasource.username=root
spring.datasource.password=root

### 如何使用 Swagger2？

本项目已经集成了 Swagger2，您可以通过访问 `http://localhost:8080/swagger-ui.html` 来查看和测试您的 RESTful API。

### 如何使用 Spring Security？

本项目已经集成了 Spring Security，您可以在 `WebSecurityConfig` 类中自定义安全配置。默认的用户名和密码是 `user` 和 `password`。

## 参考文献

- [Spring Boot Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.3/reference/htmlsingle/)
- [MyBatis User Guide](https://mybatis.org/mybatis-3/zh/index.html)
- [Druid](https://github.com/alibaba/druid)
- [Thymeleaf](https://www.thymeleaf.org/)
- [Swagger2](https://swagger.io/)
- [Spring Security Reference](https://docs.spring.io/spring-security/site/docs/5.4.5/reference/html5/)

