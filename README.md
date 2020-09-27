
### Compiling

```shell
processor0> javac -d .\classes\  .\src\main\java\lsc\tests\*.java
```

### Processing Person

```shell
processor0> javac -cp .\classes\ -processor lsc.tests.AnnotationProcessorExample .\src\main\java\lsc\tests\Person.java
AnnotationProcessorExample.init()
AnnotationProcessorExample.getSupportedSourceVersion()
AnnotationProcessorExample.getSupportedAnnotationTypes()
AnnotationProcessorExample.process()
writeBuilderFile
javac ProcessingEnvironment
javac Filer
builderClassName = lsc.tests.PersonBuilder
AnnotationProcessorExample.process()
AnnotationProcessorExample.process()
```

### Processing App

```shell
processor0> javac -cp .\classes\ -processor lsc.tests.AnnotationProcessorExample .\src\main\java\lsc\tests\App.java
AnnotationProcessorExample.init()
AnnotationProcessorExample.getSupportedSourceVersion()
AnnotationProcessorExample.getSupportedAnnotationTypes()
AnnotationProcessorExample.process()
writeBuilderFile
javac ProcessingEnvironment
javac Filer
builderClassName = lsc.tests.AppBuilder
AnnotationProcessorExample.process()
AnnotationProcessorExample.process()
```

### TODO - Figure it out how to process using Maven ...


### References


[Java Annotation Processing and Creating a Builder](https://www.baeldung.com/java-annotation-processing-builder)

[Reading Annotations at compile-time using Java Annotation Processors](https://medium.com/@nadundesilva/reading-annotations-at-compile-time-using-java-annotation-processors-f5a7604bb2f7)
