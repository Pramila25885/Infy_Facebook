set projectLocation=C:\Users\Surendra\eclipse-workspaceNew\javaProjects
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testngFacebookDemo.xml
pause