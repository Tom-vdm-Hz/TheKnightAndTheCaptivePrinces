package com.company.factories;

import com.company.users.Dragon;
import com.company.users.Princes;
import com.company.users.Knight;

public interface abstractFactory {

    Dragon createDragon();
    Knight createKnight() throws InterruptedException;
    Princes createPrincess();


}
