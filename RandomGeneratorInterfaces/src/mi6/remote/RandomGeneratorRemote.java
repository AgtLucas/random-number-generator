/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mi6.remote;

import javax.ejb.Remote;

/**
 *
 * @author AgtLucas
 */
@Remote
public interface RandomGeneratorRemote {
    int raffle();
}
