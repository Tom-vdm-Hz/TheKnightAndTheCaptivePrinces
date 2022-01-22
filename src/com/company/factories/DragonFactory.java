package com.company.factories;

import com.company.users.Dragon;
import com.company.users.Knight;
import com.company.users.Princes;

import java.util.Random;

public class DragonFactory implements abstractFactory {

    @Override
    public Dragon createDragon() {

        return new Dragon("Falkor", getAgeDragon(), 500, getDamageType());
    }

    public int randomizer(int low, int high){
        Random r = new Random();
        return r.nextInt(high-low) + low;
    }

    public String getDamageType() {
      switch (randomizer(1,3)) {
          case 1:
              return "fire";

          case 2:
              return "ice";

          case 3:
              return "electric";

      }
      return "";
    }

    public Integer getAgeDragon() {
        switch (randomizer(150, 600)) {
            case 150:
                return 150;

            case 450:
                return 450;

            case 600:
                return 600;
        }
        return null;
    }

    public Knight createKnight() {
        return null;
    }


    public Princes createPrincess() {
        return null;
    }
}
