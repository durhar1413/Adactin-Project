$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFileB/Login.feature");
formatter.feature({
  "name": "To validate the flow of booking hotel",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate the flow of functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user sholud be in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_sholud_be_in_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter valid username and password",
  "rows": [
    {
      "cells": [
        "durairaj1314",
        "9840441438"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_valid_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select location,hotels",
  "rows": [
    {
      "cells": [
        "London",
        "Melbourne",
        "Brisbane",
        "Adelaide"
      ]
    },
    {
      "cells": [
        "Hotel Creek",
        "Hotel Sunshine",
        "Hotel Hervey",
        "Hotel Cornice"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_select_location_hotels(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select no of rooms and room type",
  "rows": [
    {
      "cells": [
        "1 - One",
        "2 - Two",
        "3 - Three",
        "4 - Four"
      ]
    },
    {
      "cells": [
        "Standard",
        "Double",
        "Deluxe",
        "Super Deluxe"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_select_no_of_rooms_and_room_type(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is in checkin and checkout",
  "rows": [
    {
      "cells": [
        "13/04/2021",
        "14/04/2021"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_is_in_checkin_and_checkout(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select adults and child and click search button",
  "rows": [
    {
      "cells": [
        "1 - One",
        "2 - Two",
        "3 - Three",
        "4 - Four"
      ]
    },
    {
      "cells": [
        "0 - None",
        "1 - One",
        "2 - Two",
        "3 - Three"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_select_adults_and_child_and_click_search_button(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user select and click continue button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_select_and_click_continue_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@name\u003d\u0027radiobutton_0\u0027]\"}\n  (Session info: chrome\u003d90.0.4430.72)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-N6L82F0\u0027, ip: \u0027192.168.137.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_281\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 90.0.4430.72, chrome: {chromedriverVersion: 90.0.4430.24 (4c6d850f087da..., userDataDir: C:\\Users\\HP\\AppData\\Local\\T...}, goog:chromeOptions: {debuggerAddress: localhost:60660}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: d0ca341cea3841e6bd22a57cd616dbd2\n*** Element info: {Using\u003dxpath, value\u003d//input[@name\u003d\u0027radiobutton_0\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat org.baseclass.ReuseableMethods.toClick(ReuseableMethods.java:102)\r\n\tat StepDefinition02.StepDefinition.user_select_and_click_continue_button(StepDefinition.java:96)\r\n\tat ✽.user select and click continue button(file:src/test/resources/FeatureFileB/Login.feature:19)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user enter firstname,lastname and address",
  "rows": [
    {
      "cells": [
        "firstname",
        "durai"
      ]
    },
    {
      "cells": [
        "lastname",
        "harini"
      ]
    },
    {
      "cells": [
        "address",
        "865-west london"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_enter_firstname_lastname_and_address(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter card no,card type,expmonth,expyear,cvv number and click book now button",
  "rows": [
    {
      "cells": [
        "cardno",
        "cardtype",
        "expmonth",
        "expyear",
        "cvv"
      ]
    },
    {
      "cells": [
        "1234567890123456",
        "VISA",
        "June",
        "2022",
        "145"
      ]
    },
    {
      "cells": [
        "7894561230123456",
        "VISA",
        "April",
        "2022",
        "456"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_enter_card_no_card_type_expmonth_expyear_cvv_number_and_click_book_now_button(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is in valid credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_is_in_valid_credential_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});