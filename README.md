# soap-demo

- Run `mvn clean install` before running project. This will auto create all model, service classes from `wsdl`
- wsdl file is under `src/main/resources`
- Update wsdl file in `soap-ui` to trigger request.
- Endpoint is configured under `com.example.retail.config.WebServiceConfig.java`
- Endpoint should match with `wsdl` file.

# Tech stack
- Apache CXF 4.0.0 (To publish endpoint)
- Java 17
- Spring boot 3.x