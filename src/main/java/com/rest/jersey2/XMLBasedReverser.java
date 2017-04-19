package main.java.com.rest.jersey2;

import javax.ws.rs.*;

 @Path("/xmlbasedreverser")
 public class XMLBasedReverser {
 @GET
 @Produces("application/xml")
 public String defaultReverser() {

 StringBuilder sb = new StringBuilder();
 sb.append("ANKARA");

 return "<word>" + "<original>" + sb.toString() + "</original>" + "<reversed>" + sb.reverse().toString()
 + "</reversed>" + "</word>";
 }

 @Path("{word}")
 @GET
 @Produces("application/xml")
 public String reverser(@PathParam("word") String word) {
 StringBuilder sb = new StringBuilder();
 sb.append(word);

 return "<word>" + "<original>" + sb.toString() + "</original>" + "<reversed>" + sb.reverse().toString()
 + "</reversed>" + "</word>";
 }

 }
