/*
HackerRank - Java Covariant Return Types

Goal:
Implement class hierarchy where a subclass overrides a method and
returns a more specific object (covariant return type).

Input:
WestBengal / AndhraPradesh

Output handled by locked code.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Complete the classes below
class Flower {
    String whatsYourName() {
        return "I have many names and types";
    }
}

// Subclasses of Flower
class Jasmine extends Flower {
    @Override
    String whatsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower {
    @Override
    String whatsYourName() {
        return "Lily";
    }
}

// Base Region class
class Region {
    Flower yourNationalFlower() {
        return new Flower();
    }
}

// Subclass WestBengal
class WestBengal extends Region {
    @Override
    Jasmine yourNationalFlower() {   // covariant return type
        return new Jasmine();
    }
}

// Subclass AndhraPradesh
class AndhraPradesh extends Region {
    @Override
    Lily yourNationalFlower() {     // covariant return type
        return new Lily();
    }
}



public class CovariantReturnTypesFlower {
  public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String s = reader.readLine().trim();
      Region region = null;
      switch (s) {
        case "WestBengal":
          region = new WestBengal();
          break;
        case "AndhraPradesh":
          region = new AndhraPradesh();
          break;
      }
      Flower flower = region.yourNationalFlower();
      System.out.println(flower.whatsYourName());
    }
}