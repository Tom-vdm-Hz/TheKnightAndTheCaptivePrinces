package com.company.factories;

import com.company.users.Dragon;
import com.company.users.Knight;
import com.company.users.Princes;

public class PrincessFactory implements abstractFactory {

    public Dragon createDragon() {
        return null;
    }


    public Knight createKnight() {
        return null;
    }

    @Override
    public Princes createPrincess() {
        return new Princes("Elizabeth", 21, 100, "tower");
    }
}
