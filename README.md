# LAB11 - Template

Please see problem statement/slides.


--- 
Please review https://www.w3schools.com/java/java_packages.asp for the use of packages in Java.

Summary:
### Java Packages

- Group related classes and interfaces under a **namespace** to avoid name conflicts and to organize code
- Declare at the top of the file:  
  ```java
  package someapp.utils;
  ```
- Match folder structure to package name (someapp/utils/).
Import with:
`import someapp.utils.Helper;`

Best Practices:
- Use lowercase names for packages (e.g., com.company.project).
- One clear purpose per package
- Limit visibility with package-private (no modifier) for internal classes
