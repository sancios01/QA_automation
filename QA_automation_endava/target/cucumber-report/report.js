$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/zap/WishlistFunctionality.feature");
formatter.feature({
  "name": "WishLish functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@asafeaniuc"
    }
  ]
});
formatter.scenario({
  "name": "Logo presence on OrangeHRM home Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@asafeaniuc"
    }
  ]
});
formatter.step({
  "name": "I lounch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "com.endava.qa_automation.stepDefinitions.Zappfunctionality.hromBrowser()"
});
formatter.result({
  "error_message": "java.lang.IllegalStateException: The driver executable does not exist: /Applications/chromedriver\n\tat com.google.common.base.Preconditions.checkState(Preconditions.java:585)\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:146)\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:141)\n\tat org.openqa.selenium.chrome.ChromeDriverService.access$000(ChromeDriverService.java:35)\n\tat org.openqa.selenium.chrome.ChromeDriverService$Builder.findDefaultExecutable(ChromeDriverService.java:159)\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:355)\n\tat org.openqa.selenium.chrome.ChromeDriverService.createDefaultService(ChromeDriverService.java:94)\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\n\tat com.endava.qa_automation.stepDefinitions.Zappfunctionality.hromBrowser(Zappfunctionality.java:18)\n\tat ✽.I lounch chrome browser(file:///Users/asafeaniuc/OneDrive%20-%20ENDAVA/Java_cursuri_qa/QA_automation_endava/src/test/resources/features/zap/WishlistFunctionality.feature:22)\n",
  "status": "failed"
});
formatter.step({
  "name": "I open zap hamepage",
  "keyword": "When "
});
formatter.match({
  "location": "com.endava.qa_automation.stepDefinitions.Zappfunctionality.i_open_zap_hamepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I verify that the logo present on page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.endava.qa_automation.stepDefinitions.Zappfunctionality.i_verify_that_the_logo_present_on_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "clouse browser",
  "keyword": "And "
});
formatter.match({
  "location": "com.endava.qa_automation.stepDefinitions.Zappfunctionality.clouse_browser()"
});
formatter.result({
  "status": "skipped"
});
});