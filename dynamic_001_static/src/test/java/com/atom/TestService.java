package com.atom;

import com.atom.service.Service;
import com.atom.service.impl.Agent;
import com.atom.service.impl.SuperStarLiu;
import com.atom.service.impl.SuperStarZhou;
import org.junit.Test;

public class TestService {

    /*@Test
    public void testAgent(){

        Service s = new Agent();
        s.sing();

    }*/

    @Test
    public void testAgent02(){

        Service agent = new Agent(new SuperStarZhou());

        agent.sing();
    }

    @Test
    public void Test01(){
        Service service = new Service() {
            @Override
            public void sing() {
                System.out.println("阿巴阿巴阿巴阿巴...");
            }
        };

        service.sing();
    }
}
