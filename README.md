# Spring Boot Starter How 2 [![CI](https://github.com/daggerok/yetanother-spring-boot-starter/actions/workflows/ci.yaml/badge.svg)](https://github.com/daggerok/yetanother-spring-boot-starter/actions/workflows/ci.yaml)
This repository demonstrates how to define functionality with default configuration and behaviour, and how to override
defaults. Also, this project contains proper Kotlin Maven kapt configuration to get benefits of spring-boot config
props IntelliSense in your IDE with proper spring-boot-configuration-processor maven config.

## Build

```bash
./mvnw
```

## Run and test

```bash
java -jar app/target/*.jar
```

## Spring Boot Maven Kotlin kapt

```xml
    <build>
        <defaultGoal>clean verify</defaultGoal>
        <sourceDirectory>${project.basedir}/src/main/kotlin</sourceDirectory>
        <testSourceDirectory>${project.basedir}/src/test/kotlin</testSourceDirectory>
        <plugins>
            <plugin>
                <groupId>org.jetbrains.kotlin</groupId>
                <artifactId>kotlin-maven-plugin</artifactId>
                <configuration>
                    <args>
                        <arg>-Xjsr305=strict</arg>
                    </args>
                    <compilerPlugins>
                        <plugin>spring</plugin>
                    </compilerPlugins>
                    <jvmTarget>${java.version}</jvmTarget>
                </configuration>
                <dependencies>
                    <dependency>
                        <groupId>org.jetbrains.kotlin</groupId>
                        <artifactId>kotlin-maven-allopen</artifactId>
                        <version>${kotlin.version}</version>
                    </dependency>
                </dependencies>
                <executions>
                    <execution>
                        <id>kapt</id>
                        <goals>
                            <goal>kapt</goal>
                        </goals>
                        <configuration>
                            <sourceDirs>
                                <sourceDir>src/main/kotlin</sourceDir>
                            </sourceDirs>
                            <annotationProcessorPaths>
                                <annotationProcessorPath>
                                    <groupId>org.springframework.boot</groupId>
                                    <artifactId>spring-boot-configuration-processor</artifactId>
                                    <version>2.6.3</version>
                                </annotationProcessorPath>
                            </annotationProcessorPaths>
                        </configuration>
                    </execution>
                </executions>
            </plugin>
        </plugins>
    </build>
```

## RTFM
* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.3/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.3/maven-plugin/reference/html/#build-image)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/2.6.3/reference/htmlsingle/#configuration-metadata-annotation-processor)
