package Ali.aastudy.DateClass;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Intro {
    /*

        Where we are going to use date class.

        https://us.accounts.ikea.com/login?state=g6Fo2SBtLTdXTWY5VzVKckhPM2RNZ19wZmRJQzR0b0pobDdWZaN0aWTZIGIzVEtyaXFnZ1c2Y3dSTzVJaXhsZlhudFpEbEROYWo1o2NpZNkgQUR6RW9zRmlGYjl2OUh1akg3OEU1a1YyMjY3VTF2TjQ&client=ADzEosFiFb9v9HujH78E5kV2267U1vN4&protocol=oauth2&redirect_uri=https%3A%2F%2Fwww.ikea.com%2Fus%2Fen%2Fprofile%2Flogin%2F&response_type=code&ui_locales=en-US&code_chalenge=YpIBv43ISyCADruGCUdQJRVYvWjnLrpVbwj_o4Lykf0&code_chalenge_method=S256&scope=openid%20profile%20email&audience=https%3A%2F%2Fretail.api.ikea.com&consumer=OWF&auth0Client=eyJuYW1lIjoiYXV0aDAuanMiLCJ2ZXJzaW9uIjoiOS4xMS4zIn0%3D

        How much we need to spend on it?

        Where we going to use it?

     */

     /*
           Create a method name is today
           No parameter
           return type is String

           Get a today date from the LocalDate class and return it.

           Format should be month date and year
    */

    /*
            Create a @Test method.
            Verify today method is returning the today date.
    */

    @Test
    public void test1(){

        String s1 = today();

        Assert.assertEquals("05/11/2020" , s1);

    }

        public String today(){

        LocalDate lc = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/YYYY");

        String s1 = lc.format(formatter);

        return s1;

    }

}
