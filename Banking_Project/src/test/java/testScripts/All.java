diff --git a/Banking_Project/.classpath b/Banking_Project/.classpath
new file mode 100644
index 0000000..002ad57
--- /dev/null
+++ b/Banking_Project/.classpath
@@ -0,0 +1,38 @@
+<?xml version="1.0" encoding="UTF-8"?>
+<classpath>
+	<classpathentry kind="src" output="target/classes" path="src/main/java">
+		<attributes>
+			<attribute name="optional" value="true"/>
+			<attribute name="maven.pomderived" value="true"/>
+		</attributes>
+	</classpathentry>
+	<classpathentry excluding="**" kind="src" output="target/classes" path="src/main/resources">
+		<attributes>
+			<attribute name="maven.pomderived" value="true"/>
+		</attributes>
+	</classpathentry>
+	<classpathentry kind="src" output="target/test-classes" path="src/test/java">
+		<attributes>
+			<attribute name="optional" value="true"/>
+			<attribute name="maven.pomderived" value="true"/>
+			<attribute name="test" value="true"/>
+		</attributes>
+	</classpathentry>
+	<classpathentry excluding="**" kind="src" output="target/test-classes" path="src/test/resources">
+		<attributes>
+			<attribute name="maven.pomderived" value="true"/>
+			<attribute name="test" value="true"/>
+		</attributes>
+	</classpathentry>
+	<classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.8">
+		<attributes>
+			<attribute name="maven.pomderived" value="true"/>
+		</attributes>
+	</classpathentry>
+	<classpathentry kind="con" path="org.eclipse.m2e.MAVEN2_CLASSPATH_CONTAINER">
+		<attributes>
+			<attribute name="maven.pomderived" value="true"/>
+		</attributes>
+	</classpathentry>
+	<classpathentry kind="output" path="target/classes"/>
+</classpath>
diff --git a/Banking_Project/.project b/Banking_Project/.project
new file mode 100644
index 0000000..c65b498
--- /dev/null
+++ b/Banking_Project/.project
@@ -0,0 +1,23 @@
+<?xml version="1.0" encoding="UTF-8"?>
+<projectDescription>
+	<name>Banking_Project</name>
+	<comment></comment>
+	<projects>
+	</projects>
+	<buildSpec>
+		<buildCommand>
+			<name>org.eclipse.jdt.core.javabuilder</name>
+			<arguments>
+			</arguments>
+		</buildCommand>
+		<buildCommand>
+			<name>org.eclipse.m2e.core.maven2Builder</name>
+			<arguments>
+			</arguments>
+		</buildCommand>
+	</buildSpec>
+	<natures>
+		<nature>org.eclipse.jdt.core.javanature</nature>
+		<nature>org.eclipse.m2e.core.maven2Nature</nature>
+	</natures>
+</projectDescription>
diff --git a/Banking_Project/.settings/org.eclipse.core.resources.prefs b/Banking_Project/.settings/org.eclipse.core.resources.prefs
new file mode 100644
index 0000000..29abf99
--- /dev/null
+++ b/Banking_Project/.settings/org.eclipse.core.resources.prefs
@@ -0,0 +1,6 @@
+eclipse.preferences.version=1
+encoding//src/main/java=UTF-8
+encoding//src/main/resources=UTF-8
+encoding//src/test/java=UTF-8
+encoding//src/test/resources=UTF-8
+encoding/<project>=UTF-8
diff --git a/Banking_Project/.settings/org.eclipse.jdt.core.prefs b/Banking_Project/.settings/org.eclipse.jdt.core.prefs
new file mode 100644
index 0000000..2f5cc74
--- /dev/null
+++ b/Banking_Project/.settings/org.eclipse.jdt.core.prefs
@@ -0,0 +1,8 @@
+eclipse.preferences.version=1
+org.eclipse.jdt.core.compiler.codegen.targetPlatform=1.8
+org.eclipse.jdt.core.compiler.compliance=1.8
+org.eclipse.jdt.core.compiler.problem.enablePreviewFeatures=disabled
+org.eclipse.jdt.core.compiler.problem.forbiddenReference=warning
+org.eclipse.jdt.core.compiler.problem.reportPreviewFeatures=ignore
+org.eclipse.jdt.core.compiler.release=disabled
+org.eclipse.jdt.core.compiler.source=1.8
diff --git a/Banking_Project/.settings/org.eclipse.m2e.core.prefs b/Banking_Project/.settings/org.eclipse.m2e.core.prefs
new file mode 100644
index 0000000..f897a7f
--- /dev/null
+++ b/Banking_Project/.settings/org.eclipse.m2e.core.prefs
@@ -0,0 +1,4 @@
+activeProfiles=
+eclipse.preferences.version=1
+resolveWorkspaceProjects=true
+version=1
diff --git a/Banking_Project/pom.xml b/Banking_Project/pom.xml
new file mode 100644
index 0000000..35871f1
--- /dev/null
+++ b/Banking_Project/pom.xml
@@ -0,0 +1,136 @@
+<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
+	<modelVersion>4.0.0</modelVersion>
+	<groupId>Banking_Project</groupId>
+	<artifactId>Banking_Project</artifactId>
+	<version>0.0.1-SNAPSHOT</version>
+	<properties>
+		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
+		<maven.compiler.source>1.8</maven.compiler.source>
+		<maven.compiler.target>1.8</maven.compiler.target>
+	</properties>
+	<dependencies>
+		<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
+		<dependency>
+			<groupId>org.seleniumhq.selenium</groupId>
+			<artifactId>selenium-java</artifactId>
+			<version>4.11.0</version>
+		</dependency>
+		<!-- https://mvnrepository.com/artifact/org.testng/testng -->
+		<dependency>
+			<groupId>org.testng</groupId>
+			<artifactId>testng</artifactId>
+			<version>7.7.1</version>
+		</dependency>
+		<!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
+		<dependency>
+			<groupId>io.github.bonigarcia</groupId>
+			<artifactId>webdrivermanager</artifactId>
+			<version>5.5.3</version>
+		</dependency>
+		<dependency>
+			<groupId>org.apache.poi</groupId>
+			<artifactId>poi-ooxml</artifactId>
+			<version>5.2.2</version>
+		</dependency>
+		<dependency>
+			<groupId>org.apache.poi</groupId>
+			<artifactId>poi-ooxml-schemas</artifactId>
+			<version>4.1.2</version>
+		</dependency>
+		<dependency>
+			<groupId>org.apache.poi</groupId>
+			<artifactId>poi-scratchpad</artifactId>
+			<version>5.2.2</version>
+		</dependency>
+		<dependency>
+			<groupId>org.apache.poi</groupId>
+			<artifactId>ooxml-schemas</artifactId>
+			<version>1.1</version>
+		</dependency>
+		<dependency>
+			<groupId>org.apache.poi</groupId>
+			<artifactId>openxml4j</artifactId>
+			<version>1.0-beta</version>
+		</dependency>
+		<dependency>
+			<groupId>org.apache.poi</groupId>
+			<artifactId>poi</artifactId>
+			<version>3.9</version>
+		</dependency>
+		<!-- https://mvnrepository.com/artifact/com.relevantcodes/extentreports -->
+		<!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->
+		<dependency>
+			<groupId>com.aventstack</groupId>
+			<artifactId>extentreports</artifactId>
+			<version>5.0.9</version>
+		</dependency>
+		<dependency>
+			<groupId>io.cucumber</groupId>
+			<artifactId>cucumber-java</artifactId>
+			<version>7.11.0</version>
+		</dependency>
+		<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-picocontainer -->
+		<dependency>
+			<groupId>io.cucumber</groupId>
+			<artifactId>cucumber-picocontainer</artifactId>
+			<version>7.11.1</version>
+			<scope>test</scope>
+		</dependency>
+		<!-- https://mvnrepository.com/artifact/io.cucumber/gherkin -->
+		<dependency>
+			<groupId>io.cucumber</groupId>
+			<artifactId>gherkin</artifactId>
+			<version>26.0.3</version>
+		</dependency>
+		<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-jvm -->
+		<dependency>
+			<groupId>io.cucumber</groupId>
+			<artifactId>cucumber-jvm</artifactId>
+			<version>6.8.1</version>
+			<type>pom</type>
+		</dependency>
+		<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-testng -->
+		<dependency>
+			<groupId>io.cucumber</groupId>
+			<artifactId>cucumber-testng</artifactId>
+			<version>6.8.1</version>
+		</dependency>
+		<dependency>
+			<groupId>tech.grasshopper</groupId>
+			<artifactId>extentreports-cucumber6-adapter</artifactId>
+			<version>2.0.0</version>
+			<scope>test</scope>
+		</dependency>
+		<!-- https://mvnrepository.com/artifact/org.freemarker/freemarker -->
+		<dependency>
+			<groupId>org.freemarker</groupId>
+			<artifactId>freemarker</artifactId>
+			<version>2.3.30</version>
+		</dependency>
+		<!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->
+		<dependency>
+			<groupId>com.aventstack</groupId>
+			<artifactId>extentreports</artifactId>
+			<version>5.0.4</version>
+		</dependency>
+	</dependencies>
+	<build>
+		<plugins>
+			<plugin>
+				<groupId>org.apache.maven.plugins</groupId>
+				<artifactId>maven-compiler-plugin</artifactId>
+				<version>3.5.1</version>
+			</plugin>
+			<plugin>
+				<groupId>org.apache.maven.plugins</groupId>
+				<artifactId>maven-surefire-plugin</artifactId>
+				<configuration>
+					<testFailureIgnore>true</testFailureIgnore>
+					<suiteXmlFiles>
+						<suiteXmlFile>testng.xml</suiteXmlFile>
+					</suiteXmlFiles>
+				</configuration>
+			</plugin>
+		</plugins>
+	</build>
+</project>
\ No newline at end of file
diff --git a/Banking_Project/src/main/java/Utility.java b/Banking_Project/src/main/java/Utility.java
new file mode 100644
index 0000000..e836ba9
--- /dev/null
+++ b/Banking_Project/src/main/java/Utility.java
@@ -0,0 +1,17 @@
+import org.openqa.selenium.WebDriver;
+import org.openqa.selenium.WebElement;
+import org.openqa.selenium.interactions.Action;
+
+public class Utility {
+
+	WebDriver driver;
+	Action action;
+
+	public void click(WebElement click) {
+		click.click();
+	}
+	
+	public void dragAndDrop(Action act) {
+		action.
+	}
+}
diff --git a/Banking_Project/src/test/java/testScripts/All.java b/Banking_Project/src/test/java/testScripts/All.java
new file mode 100644
index 0000000..ab44a65
--- /dev/null
+++ b/Banking_Project/src/test/java/testScripts/All.java
@@ -0,0 +1,71 @@
+package testScripts;
+
+import java.io.FileInputStream;
+import java.io.FileNotFoundException;
+import java.time.Duration;
+import java.util.List;
+
+import org.openqa.selenium.By;
+import org.openqa.selenium.Keys;
+import org.openqa.selenium.WebDriver;
+import org.openqa.selenium.WebElement;
+import org.openqa.selenium.edge.EdgeDriver;
+import org.openqa.selenium.support.ui.ExpectedConditions;
+import org.openqa.selenium.support.ui.Select;
+import org.openqa.selenium.support.ui.WebDriverWait;
+import org.testng.Assert;
+
+public class All {
+	static Select select;
+	public static void main(String[] args) throws FileNotFoundException {
+
+		WebDriver driver = new EdgeDriver();
+		driver.manage().window().maximize();
+		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
+		
+		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
+		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
+		
+		driver.findElement(By.xpath("(//button[contains(@class,'btn-primary')])[1]")).click();
+		wait.until(ExpectedConditions.urlContains("customer"));
+		
+		WebElement skill=driver.findElement(By.id("userSelect"));
+		
+		select=new Select(skill);
+		List<WebElement> names=select.getOptions();
+		 select.selectByVisibleText("Harry Potter");
+		//System.out.println(select.getOptions().size());
+//		for( int i=0;i<names.size();i++) {
+//			System.out.println(names.get(i).getText());
+//		}
+		 
+		WebElement login = driver.findElement(By.xpath("//*[text()='Login']"));
+		wait.until(ExpectedConditions.visibilityOf(login)).click();
+		
+		select=new Select(driver.findElement(By.id("accountSelect")));
+		List<WebElement> dropdown= select.getOptions();
+		select.selectByIndex(2);
+		
+		driver.findElement(By.xpath("//*[@class='center'][2]//button[2]")).click();
+		
+		//driver.findElement(By.cssSelector(".form-group>input")).sendKeys("10000",Keys.ENTER);
+		WebElement deposit = driver.findElement(By.cssSelector(".form-group>input"));
+		
+		FileInputStream file= new FileInputStream(".\\src\\test\\resources\\Property.properties");
+		
+		for(int i=0;i<=3;i++) {
+			deposit.sendKeys();
+		}
+		
+		WebElement Expected =driver.findElement(By.xpath("//*[text()='Deposit Successful']"));
+		Assert.assertEquals(Expected.getText(),"Deposit Successful");
+		
+		
+		
+		 
+		driver.close();
+		
+		
+		
+	}
+}
diff --git a/Banking_Project/src/test/java/webPages/HomePage_01.java b/Banking_Project/src/test/java/webPages/HomePage_01.java
new file mode 100644
index 0000000..512e002
--- /dev/null
+++ b/Banking_Project/src/test/java/webPages/HomePage_01.java
@@ -0,0 +1,28 @@
+package webPages;
+
+import org.openqa.selenium.WebDriver;
+import org.openqa.selenium.WebElement;
+import org.openqa.selenium.support.FindBy;
+import org.openqa.selenium.support.PageFactory;
+
+public class HomePage_01 {
+	WebDriver driver;
+	public void HomePage_01(WebDriver driver) {
+		this.driver= driver;
+		PageFactory.initElements(driver,this);
+	}
+	@FindBy(xpath="(//button[contains(@class,'btn-primary')])[1]")
+	WebElement  customerLogin;
+	
+	@FindBy(css=".ng-scope .padT20>div:last-child>button")
+	WebElement BankManagerLogin;
+	
+	@FindBy(className="btn home")
+	WebElement HomeLogo;
+	
+	@FindBy(xpath ="//div[*[text()='XYZ Bank']]//strong")
+	WebElement BankName;
+
+	
+
+}
diff --git a/Banking_Project/src/test/java/webPages/LoginPage_02.java b/Banking_Project/src/test/java/webPages/LoginPage_02.java
new file mode 100644
index 0000000..5e8eec6
--- /dev/null
+++ b/Banking_Project/src/test/java/webPages/LoginPage_02.java
@@ -0,0 +1,27 @@
+package webPages;
+
+import org.openqa.selenium.WebDriver;
+import org.openqa.selenium.WebElement;
+import org.openqa.selenium.support.FindBy;
+import org.openqa.selenium.support.PageFactory;
+
+public class LoginPage_02 {
+	WebDriver driver;
+	public void LoginPage_02(WebDriver driver) {
+		this.driver = driver;
+		PageFactory.initElements(driver,this);
+	}
+	
+	@FindBy(id="userSelect")
+	WebElement Namesdropdown;
+	
+	@FindBy(css="[class$='btn-default']")
+	WebElement LoginLogo;
+	
+	@FindBy(className="btn home")
+	WebElement HomeLogo;
+	
+	@FindBy(xpath ="//div[*[text()='XYZ Bank']]//strong")
+	WebElement BankName;
+
+}
diff --git a/Banking_Project/src/test/java/webPages/UserPage_03.java b/Banking_Project/src/test/java/webPages/UserPage_03.java
new file mode 100644
index 0000000..2fac5a0
--- /dev/null
+++ b/Banking_Project/src/test/java/webPages/UserPage_03.java
@@ -0,0 +1,48 @@
+package webPages;
+
+import org.openqa.selenium.WebDriver;
+import org.openqa.selenium.WebElement;
+import org.openqa.selenium.support.FindBy;
+import org.openqa.selenium.support.PageFactory;
+
+public class UserPage_03 {
+	WebDriver driver;
+	public void UserPage_03(WebDriver driver) {
+		this.driver=driver;
+		PageFactory.initElements(driver,this);
+	}
+	
+	@FindBy(css=".ng-scope .borderM>div .fontBig")
+	WebElement Name;
+	
+	@FindBy(id="accountSelect")
+	WebElement AccountNumberDropDown;
+	
+	@FindBy(xpath="(//div[@class='center']//following-sibling ::strong)[3]")
+	WebElement currency;
+	
+	@FindBy(xpath="//*[@class='center'][2]//button[1]")
+	WebElement Transaction;
+	
+	@FindBy(xpath="//*[@class='center'][2]//button[2]")
+	WebElement Deposit;
+	
+	@FindBy(xpath="//*[@class='center'][2]//button[3]")
+	WebElement Withdraw;
+	
+	@FindBy(css=".form-group>input")
+	WebElement DepositAmount;
+	
+
+	@FindBy(className="btn home")
+	WebElement HomeLogo;
+	
+	@FindBy(xpath ="//div[*[text()='XYZ Bank']]//strong")
+	WebElement BankName;
+	
+	@FindBy(className="btn logout")
+	WebElement Logout;
+
+
+
+}
diff --git a/Banking_Project/src/test/resources/Property.properties b/Banking_Project/src/test/resources/Property.properties
new file mode 100644
index 0000000..e69de29
--- /dev/null
+++ b/Banking_Project/src/test/resources/Property.properties
diff --git a/Banking_Project/target/classes/Utility.class b/Banking_Project/target/classes/Utility.class
new file mode 100644
index 0000000..5928860
--- /dev/null
+++ b/Banking_Project/target/classes/Utility.class
Binary files differ
diff --git a/Banking_Project/target/test-classes/testScripts/All.class b/Banking_Project/target/test-classes/testScripts/All.class
new file mode 100644
index 0000000..324986b
--- /dev/null
+++ b/Banking_Project/target/test-classes/testScripts/All.class
Binary files differ
diff --git a/Banking_Project/target/test-classes/webPages/HomePage_01.class b/Banking_Project/target/test-classes/webPages/HomePage_01.class
new file mode 100644
index 0000000..2b5655c
--- /dev/null
+++ b/Banking_Project/target/test-classes/webPages/HomePage_01.class
Binary files differ
diff --git a/Banking_Project/target/test-classes/webPages/LoginPage_02.class b/Banking_Project/target/test-classes/webPages/LoginPage_02.class
new file mode 100644
index 0000000..a31e9ba
--- /dev/null
+++ b/Banking_Project/target/test-classes/webPages/LoginPage_02.class
Binary files differ
diff --git a/Banking_Project/target/test-classes/webPages/UserPage_03.class b/Banking_Project/target/test-classes/webPages/UserPage_03.class
new file mode 100644
index 0000000..5745e04
--- /dev/null
+++ b/Banking_Project/target/test-classes/webPages/UserPage_03.class
Binary files differ
