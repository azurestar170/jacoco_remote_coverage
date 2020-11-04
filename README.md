# jacoco_remote_coverage
JaCoCo Remote Coverage

JDK 15

set vm options for 3 apps:  
`-javaagent:lib/org.jacoco.agent-0.8.6-runtime.jar=output=tcpserver,port=38081`  
`-javaagent:lib/org.jacoco.agent-0.8.6-runtime.jar=output=tcpserver,port=38082`  
`-javaagent:lib/org.jacoco.agent-0.8.6-runtime.jar=output=tcpserver,port=38083`  

set working directory to root (jacoco_remote_coverage) for 3 apps.

run test command to generate coverage report:  
`mvn clean verify -Dmaven.test.skip=false -Dtest=name.az170.sandbox.jr.business.BusinessTest -Djacoco.skip=false`
