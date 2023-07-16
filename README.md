# Goodreads
## end-to-end testing for webapplication goodreads
programming language - java
web automation tool - Selenium
Chrome browser
URL - (https://www.goodreads.com/)
Write a UI automation test to validate the below-given scenario.
*[Login to goodreads.com ]
2. Search for a specific book title
3. Mark it as ‘want to read’
4. Remove the selected book from my book list
5. Logout

-To trigger url using get().
-To pass the data of mail and password using sendKeys().
-Signin goodreads using mail "shashihiremath444@gmail.com" and password "Shashi@good4".
-click() is used to click on the element.

-after using same mail id many times IMPORTANT MESSAGE alert will appeare
-banners and capcha are can't automate and also above IMPORTANT MESSAGE can't automate'
-for IMPORTANT MESSAGE have to write showing characters for protect account.
-Thread.sleep(8000) used for write showing character within 8 second after that script will continue to run.
-after removing book from my books pop-up will show to handle pop-up alert() is used.
