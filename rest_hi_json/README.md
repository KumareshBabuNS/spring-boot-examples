Hi REST w/JSON
==============
This is a slight variation of the Hi REST example that returns a slightly more complex object and uses Jackson's JSON processor to send the result back to the client in JSON form.

As with the Hi REST example, there are two versions of the Groovy script: app.groovy and app_minified.groovy.
Functionally, these are identical, but the app_minified.groovy doesn't have any unnecessary whitespace or line breaks (resulting in a Tweet-able 125 character long script).

Run the example with either...

```sh
$ spring run app.groovy
```

...or...

```sh
$ spring run app_minified.groovy
```

Then point your browser, [curl](http://curl.haxx.se/), [Spring REST Shell](https://github.com/spring-projects/rest-shell), or other client at http://localhost:8080/. You should see a JSON response of:

```javascript
{"message":"Hi!"}
```
