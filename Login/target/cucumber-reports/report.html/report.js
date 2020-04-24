$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Postings.feature");
formatter.feature({
  "line": 1,
  "name": "Post on Facebook wall",
  "description": "",
  "id": "post-on-facebook-wall",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "New Post on my wall",
  "description": "",
  "id": "post-on-facebook-wall;new-post-on-my-wall",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User Launch chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user opens URL \"http://Facebook.com/login\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters Email as \"bastinmary@gmail.com\" and Password as \"Elshadah1\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click on Login",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Add posting \"Stay Home Safe\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefn.user_Launch_chrome_browser()"
});
formatter.result({
  "duration": 366746821,
  "error_message": "java.lang.IllegalAccessError: tried to access method com.google.common.util.concurrent.SimpleTimeLimiter.\u003cinit\u003e(Ljava/util/concurrent/ExecutorService;)V from class org.openqa.selenium.net.UrlChecker\r\n\tat org.openqa.selenium.net.UrlChecker.\u003cinit\u003e(UrlChecker.java:66)\r\n\tat org.openqa.selenium.remote.service.DriverService.start(DriverService.java:163)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:62)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:572)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:240)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:126)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:139)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:171)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:160)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:149)\r\n\tat stepDefn.StepDefn.user_Launch_chrome_browser(StepDefn.java:32)\r\n\tat ✽.Given User Launch chrome browser(src/test/resources/Features/Postings.feature:4)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "http://Facebook.com/login",
      "offset": 16
    }
  ],
  "location": "StepDefn.getURL(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "bastinmary@gmail.com",
      "offset": 22
    },
    {
      "val": "Elshadah1",
      "offset": 61
    }
  ],
  "location": "StepDefn.getUser_Pass(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefn.clickLogin()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Stay Home Safe",
      "offset": 13
    }
  ],
  "location": "StepDefn.add_posting(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefn.closeBrowser()"
});
formatter.result({
  "status": "skipped"
});
});