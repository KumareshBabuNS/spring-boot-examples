Spring Social Boot Examples
===========================
These simple examples demonstrate Spring Social with Spring Boot's CLI.

There are three distinct example, one each for Facebook, Twitter, and LinkedIn.
In order for the examples to run, you'll need to obtain application IDs and secrets by registering the application with Facebook, Twitter, and LinkedIn. 
Once you have the application credentials, place them in the designated locations in application.properties.

Once application.properties has the application credentials, run each example individually through the Spring Boot CLI.

For example, to run the Facebook example:

```sh
$ spring run fb.groovy
```

After the application starts, point your browser to http://localhost:8080. It should prompt you to connect with Facebook. Clicking the button will trigger Spring Social's ConnectController to redirect you to Facebook for authorization. Upon authorizing the application, you'll be redirected to the application where you'll be greeted with the name on your Facebook account.

Follow similar instructions for tw.groovy and li.groovy.

Minimal Examples
----------------
Also included in this folder are 4 examples that show the minimal amount of code required to connect with Facebook, Twitter, LinkedIn, or all three APIs:

 * fb_minimal.groovy
 * tw_minimal.groovy
 * li_minimal.groovy
 * all_minimal.groovy

Because these are bare minimum examples, there's no redirect from the root URL to Spring Social's ConnectController.
Instead, you will need to point your browser to the appropriate ConnectController URL for the API you want to connect with.

For example, to connect with Facebook (assuming you are running fb_minimal.groovy or all_minimal.groovy), you should point your browser to http://localhost:8080/connect/facebook.
