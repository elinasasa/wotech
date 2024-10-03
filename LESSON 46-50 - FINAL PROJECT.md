# LESSON 46-50

## FINAL PROJECT

1. We need to choose a city randomly.
2. The chance for the city should be proportional for the citizen count.
  99 citizens -> Goog 99%
  1 citizen -> Wocity 1%
3. Cities are inside database
4. We should have an API where we can call getRandomCity()
5. Winners shouldn't be excluded from next years lottery


way how to do it: give cities a number, use random int to get a winning number

simplest version of the chances would be: 
75% Goog
25% Wocity

[goog, goog, goog, wocity]

0. prepare a list of cities
1. count the total amount of citizens -> 100
2. choose rndom number ->56
3. loop for each city to find 0. when its 0 or below then its the city that wins. in a loop constantly take away -1. 
4. choose the city with correct lottery ticket

```java
//CITY SERVICE.java

package com.datorium.Datorium.API.CityLottery;

import java.util.ArrayList;
import java.util.Random;

/**
 * 0. prepare a list of cities
 * 1. count the total amount of citizens -> 100
 * 2. choose rndom number ->56
 * 3. loop for each city to find 0. t
 * 4. choose the city with correct lottery ticket
 *
 * **/

public class CityService {
    public City getRandomCity() throws Exception {
        // 0. Prepare a list of cities
        ArrayList<City> cities = new ArrayList<>();
        var goog = new City("Goog", 75);
        var wocity = new City("Wocity", 25);
        var oskarscity = new City("Oskars city", 25);
        cities.add(goog);
        cities.add(wocity);
        cities.add(oskarscity);
        //1. Count total amount of citizens -> 100
        var totalCitizenCount = 0;
        for (City city: cities){
            totalCitizenCount += city.getPopulation();
        }
        //2. Choose random number -> 56
        Random random = new Random();
        int randomValue = random.nextInt(totalCitizenCount);

        //3. Loop going through all of the cities
        //4. Choose the city with correct lottery ticket
        //population -> 25
        //randomValue -> 56
        //We subtract 56 - 25 = 31
        // BECAUSE ITS NOT BELOW OR EQUAL TO 0, GO TO NEXT
        // 31 - 75 -> because it's below 0, we choose this city
        for(City city: cities){
            randomValue -= city.getPopulation();

            if(randomValue <= 0){
                return city;
            }
        }
        throw new Exception("Something wrong");
    }
}


```


```java
// CITY.java

package com.datorium.Datorium.API.CityLottery;

public class City {
    private final String name;
    private final int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }
}


```


### Interfaces

its important that services work independantly from repository

Repository needs to be standardised and repo interface needs to have necessary methods.
this helps with - so tests wouldnt affect the actual DB.

example with authentification into government pages - thoguh bank authentification.

class has implementation, in interface we dont.


Base class vs abstract class
so, interface is abstract class with empty body..

can it be that different repos have a method with the same name but the implementation is totally different? - yes



from 1:07 left in previous lecture


ORM un DevOps - still to come a video

Mockito

seed in random -- ?


Mock tests - its sort of when you know the result. its always the same.



## ORM = hybernate

its a framework.
its like a layer between repository and DB.


![image](https://github.com/user-attachments/assets/92ab2811-b62d-45cd-89f4-88a9ae536d43)




It looks similar, but:
html is designed to display data
xml is designed to store data

