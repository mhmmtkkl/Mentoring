package Ali.InterviewMentoring.Cucumber;

public class CucumberQuestions {

    /*
         Advantage of cucumber(BDD)?
         Tell me about the cucumber background?
         How to run multiple scenarios in cucumber?
         How to run multiple data in cucumber?
         Difference between data table and scenario outline?
         Difference between hooks class and background?

         1) Advantage of cucumber(BDD)?

            Cucumber is helping to PO or BA who does not have any coding experience to understand a code.
                Cucumber I am using feature files and gherkin language which is a plain english.

            For example couple months ago new QA member joined my team. She does not know the application and test cases
                with a feature files she is able to understand the test cases easier.

            All the steps in the feature file are reusable. After you create one step in feature file and step definition
                then you do not need to work on the step definition again.


         2)  Tell me about the cucumber background?
            Background is a keyword in cucumber. In the feature file if we have multiple scenarios
                and first one or more steps are same. Then we can use a background keyword. Background steps
                will be run before each scenario in the feature file.

                NOTE: Background is affecting to feature file which it is created NOT to other feature files.

        Background:
             Login to website
             Navigate to countries page

            Scenario1
                Create a country
                Logout

            Scenario2
                Edit a country
                Logout

            Scenario3
                Delete a country
                Logout

          3) How to run multiple scenarios in cucumber?
                To run multiple scenarios I have a runner classes. I can define which scenario to run using tags.
                In this way I am running multiple scenarios in cucumber.

          4) What do you use in the runner?
                I have cucumber options to run cucumber with testNG.
                I can use tags to run the smoke or regression test.
                I have a glue path for step definitions.
                I have a feature path for the feature files.
                To create a reports I am using plugins.

           5) How to run multiple data in Cucumber?

                In cucumber I am using scenario outline. In the end of the scenario outline I am creating
                    Examples as well. Under the examples I am adding all my data.

           6) Difference between data table and scenario outline?
                Scenario outline is running the same feature file steps with multiple data using examples.

                Data table creating after step which I would like to use. It will get the data from feature file
                    to step definition one by one. I am using data table if I have multiple parameters in the step.

            7) Difference between hooks class(@Before) and background?

                Both of them are running before each scenario

                @Before is running before every scenario in the all feature files.
                Backgroud is running before every scenario in the feature file which background is created.



     */

    

}











