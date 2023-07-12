package co.com.bancolombia;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Constants {
  public static final String PLUGIN_TASK_GROUP = "Clean Architecture";
  public static final String APP_SERVICE = "app-service";
  public static final String PATH_GRAPHQL = "/graphql";
  public static final String SECRETS_VERSION = "4.1.0";
  public static final String SPRING_BOOT_VERSION = "3.1.1";
  public static final String SONAR_VERSION = "4.2.1.3168";
  public static final String LOMBOK_VERSION = "1.18.28";
  public static final String JACOCO_VERSION = "0.8.10";
  public static final String COBERTURA_VERSION = "4.0.0";
  public static final String RCOMMONS_ASYNC_COMMONS_STARTER_VERSION = "2.0.0";
  public static final String RCOMMONS_OBJECT_MAPPER_VERSION = "0.1.0";
  public static final String BLOCK_HOUND_VERSION = "1.0.8.RELEASE";
  public static final String PLUGIN_VERSION = "3.4.0";
  public static final String GRADLE_WRAPPER_VERSION = "8.1.1";
  public static final String KOTLIN_VERSION = "1.6.10";
  public static final String AWS_BOM_VERSION = "2.20.94";
  public static final String COMMONS_JMS_VERSION = "1.1.0";
  public static final String GRAPHQL_KICKSTART_VERSION = "15.0.0";
  public static final String ARCH_UNIT_VERSION = "1.0.1";
  public static final String OKHTTP_VERSION = "4.11.0";
  public static final String RESILIENCE_4J_VERSION = "2.0.2";
  public static final String BIN_STASH_VERSION = "1.2.0";
  public static final String SPRING_FOX_VERSION = "3.0.0";
  public static final String DEPENDENCY_CHECK_VERSION = "8.2.1";
  public static final String TOMCAT_EXCLUSION_KOTLIN =
      "configurations {\n"
          + "\tall {\n"
          + "\t\texclude(group = \"org.springframework.boot\", module = \"spring-boot-starter-tomcat\")\n"
          + "\t}\n"
          + "}";
  public static final String TOMCAT_EXCLUSION =
      "implementation.exclude group: 'org.springframework.boot', module: 'spring-boot-starter-tomcat'";
  public static final String AWS_BOM =
      "\timplementation platform('software.amazon.awssdk:bom:" + Constants.AWS_BOM_VERSION + "')";
  public static final String AWS_BOM_KT =
      "\timplementation(platform(\"software.amazon.awssdk:bom:"
          + Constants.AWS_BOM_VERSION
          + "\"))";

  public enum BooleanOption {
    TRUE,
    FALSE
  }

  @NoArgsConstructor(access = AccessLevel.PRIVATE)
  public static class MainFiles {
    public static final String KTS = ".kts";
    public static final String BUILD_GRADLE = "./build.gradle";
    public static final String BUILD_GRADLE_KTS = BUILD_GRADLE + KTS;
    public static final String MAIN_GRADLE = "./main.gradle";
    public static final String SETTINGS_GRADLE = "./settings.gradle";
    public static final String DOCKERFILE = "./deployment/Dockerfile";
    public static final String APP_BUILD_GRADLE = "./applications/app-service/build.gradle";
    public static final String APP_BUILD_GRADLE_KTS = APP_BUILD_GRADLE + KTS;
    public static final String APPLICATION_PROPERTIES =
        "applications/app-service/src/main/resources/application.yaml";
    public static final String GRADLE_PROPERTIES = "./gradle.properties";
  }
}
