package Ali.InterviewMentoring.Selenium;

public class _04_07_Questoins {

    /*
        4) FindElement vs find Elements ?
        5) How to select value in a dropdown?
        6) What are the different types of navigation commands?
        7) What is the difference between driver.close() and driver.quit command?

     */


    /*
        FindElement vs FindElements ?

            FindElement
            1) FindElement is finding specific one element. Return is WebElement
            2) If Selenium is not able to find the element then it will throw noSuchElementException

            FindElements
            1) FindElements is finding multiple elements. Return is List<WebElement>
            2) If Selenium is not able to find the elements then it will return empty list

        driver.findElement(By.xpath("//a[@classname='menuItem']")).click();
            NOTE: If there are multiple elements with same xpath as line 25
            then selenium will click on the first one
     */

    /*
        5) How to select value in a dropdown?
                To handle dropdown with a selenium I am usign Select class in selenium.
                Dropdown should have select tag name

                First I am creating the select object and passing my dropdown element.
                I have multiple options to choose the element
                    SelectByValue
                    SelectByIndex
                    SelectByVisibleText

              SelectByValue vs SelectByVisibleText
                Value is looking for value attribute
                Visible text is looking for text of element

                If the dropdown does not have a select tag then I need to click on the element
                    Then I need to click on the option

     */

    /*
          6) What are the different types of navigation commands?
                 navigate. back , forward , refresh , to

                 navigate.to() vs driver.get()
                        Navigate has a different command as back , forward.
     */

    /*
          7) What is the difference between driver.close() and driver.quit() command?
                  driver.close()
                    is closing the current window(tab)

                    driver.quit()
                     is closing the browser.

     */


}
