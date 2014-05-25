/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mi6.remote;

import java.util.Random;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 *
 * @author AgtLucas
 */
@Stateless
@Remote(RandomGeneratorRemote.class)
public class RandomGenerator implements RandomGeneratorRemote {
    
    private final Random generator = new Random();

    @Override
    public int raffle() {
        System.out.println("RandomGenerador:raffle() was invoked...");
        return this.generator.nextInt(6) + 1;
    }
    
    @PostConstruct
    public void starting() {
        System.out.println("Another RandomGenerator created...");
    }
    
    @PreDestroy
    public void destroying() {
        System.out.println("Another RandomGenerator will be destroyed...");
    }

    
}
