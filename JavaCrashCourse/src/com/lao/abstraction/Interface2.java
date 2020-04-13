//How an interface use another interface?
//by using extends keyword.
package com.lao.abstraction;

public interface Interface2 extends Upcomingprojects {
/*
 * this interface cannot use (,) after Upcomingprojects and cannot use another interface.
 * See eg prg BMW.
 * we cannot put (,) to use multiple class. Eg:public class BMW extends Car,Car2 is not supported.
 * We can put (,) only when we use implements keyword..not with extends keyword.
 * thats why java will not support multiple inheritance.
 * It supports interface only.
 * Multiple interface is achieved by interface only by using implemnts keyword.
 */
}

//What is Marker Interface? An empty interface is known as tag or marker interface.
//Eg for marker interface.
//package com.lao.abstraction;
//public interface Interface2 
//{
//Empty/Marker Interface
//}