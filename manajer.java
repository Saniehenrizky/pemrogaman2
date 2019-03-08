/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanutsn.soalno3;

/**
 *
 * @author Sanie
 */
public class manajer extends employee {

    private long bonus;

    public manajer(String name, String address, long salary) {
        super(name, address, salary);
    }

    public long getBonus() {
        return bonus;
    }

    public void setBonus(long bonus) {
        this.bonus = bonus;
    }

    public manajer(long bonus, String name, String address, long salary) {
        super(name, address, salary);
        this.bonus = bonus;
    }

    @Override
    public long getSalary() {
        return super.getSalary() +getBonus();
    }
    
}
    
