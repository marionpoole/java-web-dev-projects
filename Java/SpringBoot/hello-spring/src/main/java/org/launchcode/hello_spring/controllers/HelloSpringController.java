//package org.launchcode.hello_spring.controllers;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//@ResponseBody
//@RequestMapping("hello")
////public class HelloSpringController {
//    //handle request at path http://localhost:8080/hello
//
////    @GetMapping("hello")
////    @ResponseBody
////    public String hello(){
////        return "Hello, Spring!";
////    }
//
//    //handle request at path //http://localhost:8080/hello/goodbye
//    @GetMapping("goodbye")
//    public String goodbye() {
//        return "Goodbye, Spring!";
//    }
//
//    //handle requests of the form http://localhost:8080/hello?name=LaunchCode
//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
//    public String helloWithQueryParam(@RequestParam String name) {
//        return "Hello, " + name + "!";
//    }
//
//    //handle requests of the form http://localhost:8080/hello/LaunchCode
//    @GetMapping("{name}")
//    public String helloWithPathParam(@PathVariable String name) {
//        return "Hello, " + name + "!";
//    }
//
//    @RequestMapping(value = "hello", method = RequestMethod.POST)
//    public static String createMessage(String name, String l) {
//        String greeting = "";
//        if (l.equals("English")) {
//            greeting = "Hello";
//        } else if (l.equals("Spanish")) {
//            greeting = "Hola";
//        } else if (l.equals("Italian")) {
//            greeting = "Ciao";
//        } else if (l.equals("French")) {
//            greeting = "Bonjour";
//        } else if (l.equals("German")) {
//            greeting = "Hallo";
//        }
//        return greeting + " " + name;
//    }
//
//
//    //handles requests for http://localhost:8080/hello/form
//    @GetMapping("form")
//    public String helloForm() {
//        return "form";
////        return "<html>" +
////                "<body>" +
////                "<form action = '/hello/hello' method = 'post'>" + // submit a request to /hello
////                "<input type = 'text' name = 'name' >" +
////                "<select name = 'l' id = 'l'>" +
////                "<option value selected= 'English'>English</option>" +
////                "<option value = 'Spanish'>Spanish</option>" +
////                "<option value = 'Italian'>Italian</option>" +
////                "<option value = 'French'>French</option>" +
////                "<option value = 'German'>German</option>" +
////                "<input type = 'submit' value = 'Greet Me!'>" +
////                "</form>" +
////                "</body>" +
////                "</html>";
//    }
//
//    public String helloPost(@RequestParam String name, @RequestParam String language) {
//        if (name == null) {
//            name = "You there";
//        }
//        return createMessage(name, language);
//
//    }
//}