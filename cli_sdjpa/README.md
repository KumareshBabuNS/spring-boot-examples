CLI and Spring Data JPA
=======================
This is a Spring Boot CLI sample that doesn't work. I'm making it available here so that I can ask others to help me figure out why it doesn't work and what I can do to make it work.

From what I can tell, Spring Data JPA doesn't even attempt to create the repository implementation. It's almost as if it doesn't see the interface. It could also mean that the Spring Data JPA config isn't working, but per the actuator's `/autoconfig` report, it looks like it should be working.

I run it like this:

```sh
$ spring run **/*.groovy
```

The classes are in a `demo` package because I wondered if it was necessary for them to be in a package for Spring Data JPA to create the repository implementation. Originally, they were at the root (in the default package). Neither way works.

I have two basic questions regarding this code:

 * Why doesn't it work?
 * Is there anything I can do, short of rewriting it as a non-CLI app, that can make it work?

Many thanks for any insight you can offer.
