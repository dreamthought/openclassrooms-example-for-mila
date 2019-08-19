# Example for Mila

These notes should point you at the relevant parts to construct your own template solution. I've left initializr refs at the bottom to assist you.

# Purpose and Scope
* Provided as an illustrative example of out of the box spring-security login/out controllers and templates for a colleague doing a spring sec course.
* Demonstrate out of the box login/logout templates
* You will want to customise these templates as your examples get more involved and involve OAuth2 + OIDC
* Note that in this case we do not create controllers or templates for /login or /logout. This allows you to focus on the 
SpringSecurityConfig class in an early part of your course.

# Warning if you change this.
I've not customised cache-controls headers, so your browser state might show stale content if you change responses or 
out of the box redirects.

# To Run
mvn spring-boot:run

Login creds (but keep reading this doc first) {User: 'user', Password: 'insecure'}
## Description

Note that I've just used a flat package structure here to illustrate things for you. 
I'd recommend mapping controllers and services to more meaningful packages.

### Source Code to Look At
* pom.xml - templates provided by:

  ```	
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>
   ```
* com.example.demo.SpringSecurityConfig

   ```
   .authorizeRequests()
   .anyRequest().authenticated()
   .antMatchers("/public**").permitAll()
   ```
   
   OUT of the BOX templates and controllers bootstrapped by:
   ```
    .and()
    .formLogin()
    .and()
    .logout();
   ```
   
* com.example.demo.DemoController

Note that these are just dumb GetMappings returning a response body.

# Public Resources

## /public 

(you'll see this without logging in.)
Don't stick in a trailing slash, etc

## /login and /logout

These are provided out of the box by virtue of the spring-security and the formLogin and logout configuration.

# Secure Resources

## /private 
You'll need to be logged in to see this.


# Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Security](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-security)
* [Spring Web Starter](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-developing-web-applications)

# Guides
The following guides illustrate how to use some features concretely:

* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)



