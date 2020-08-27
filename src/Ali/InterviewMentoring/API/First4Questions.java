package Ali.InterviewMentoring.API;

public class First4Questions {

    /*

       1) What is API , What is UI

        What is UI--> user interface , Website in the browser called as a UI

       2) Request types get post put delete?

        get request --> It is get the info. If I get the data successfully then I am receiving 200 status code.

        post request --> create the data. status code 201

        put request --> updating the data . status code 204

        delete request --> delete the data. status code 200

       3) Status codes?
        https://developer.amazon.com/docs/amazon-drive/ad-restful-api-response-codes.html

        200,2** ... status codes --> successfully finished the request
        400,4** status code --> there is a problem in your code
        500,5** status code --> System error.

        We need to know 200 , 201 , 400 , 404 , 500 , 503

       4) What are you going to do if you receive a 400 - 500 status code?

            4.1) What are you going to if you receive 4** error?

                   Basically I am looking my parameters or body in my code and making sure
                    all the data are correct. If I am getting the 4** errors probably I made mistake in
                    one of them.

           4.2) What are you going to if you receive 5** error?

                    5** error means it has a system error and usually I am letting my developers know about
                        this and they are working on it.

     */
}
