package Ali.InterviewMentoring.Selenium;

public class SeleniumIntro {

    /*

        1) What are the advantages of Selenium?
            Free
            Selenium is supporting multiple languages
            Selenium is supporting multiple platforms (IOS , Windows , Linux )
            Selenium is supporting multiple browsers (IE , Firefox , Chrome , Opera )
            Huge community
            Dominate in the market.

        2) What are the disadvantages-limitation of Selenium?
             Selenium does not support the desktop applications and mobile applications(Appium)
             Not able to test the image , voice or videos , Reading bar code.
             Captcha is not able to test.
             OTP (one time password) is not able to test.
             Selenium does not creating a report.

              NOTE: With .getCssValue we can test color , size , background color.

        3) Which locators are available in the selenium?
             1) ID
             2) ClassName
             3) LinkText
             4) PartialLinkText
             5) Tag Name
             6) Css selector
             7) Xpath

            Which locator do you prefer to use?
                 ID --> Because ID mostly unique. Thats why I am preferring ID.
                 ClassName

             CSS selector vs XPATH
                    Css is faster then Xpath

                   Link text - Partial Link text
                    One element has a Span tag and text of it is SignIn Can we use link text??

                   Element should have a "a" tag to use link text with out "a" we can not use it.

         4) Single slash"/"(Absolute xpath) vs Double slash"//"(Relative xpath) in xpath?
              Single slash is called as Absolute xpath as well.
              Double slash is called as Relative xpath as well.

              Single slash is finding the absolute location of the element so
                This type of locator is too long and it could break with any of changes in the page.
                        //*[@id="content"]/div/div[8]/div/div/div/div[2]/h2

               Double slash finding the element from the attribute or text.
                        //h2[text()=' What is Etsy? ']

                Single slash is looking to direct child.
                Double slash is looking to child of child.



            //div[@class='bg-white hide-xs hide-sm hide-md wt-text-caption position-relative z-index-4 v2-toolkit-cat-nav-tab-bar']
                    /div/ul/li

           //div[@class='bg-white hide-xs hide-sm hide-md wt-text-caption position-relative z-index-4 v2-toolkit-cat-nav-tab-bar']
                    //li

        Find a Parent
        //div[@class='bg-white hide-xs hide-sm hide-md wt-text-caption position-relative z-index-4 v2-toolkit-cat-nav-tab-bar']
                 /parent::div/parent::body



        AND vs OR operator

              //button[@type='submit' and @value='Search']
                Looking for the element which has tagname as button
                    And attribute type is submit
                    And attribute value is Search
                    In the if statement in JAVA &&

            //button[@type='submit' or @value='Search']
                Looking for the element which has tagname as button
                    and attribute type is submit
                    or attribute value is Search
                    In the if statement in JAVA ||

     */


}
