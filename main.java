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
public class main {
     public static void main(String[] args) {
        manajer boss = new manajer(50000000, "YUSUF", "Jl. Banjaran no.55", 100000000);
            System.out.println("boss : " +boss.getName());
            System.out.println("boss : " +boss.getAddress());
            System.out.println("boss : " +boss.getSalary());
        
        staff staff1 = new staff("SANIE", "jl.Sukalilah 1", 20000000);
            System.out.println("staff1 : " +staff1.getName());
            System.out.println("staff1 : " +staff1.getAddress());
            System.out.println("staff1 : " +staff1.getSalary());
        
        staff staff2 = new staff("ENDAH", "jl. pasir impun", 15000000);
        
            System.out.println("staff2 : " +staff2.getName());
            System.out.println("staff2 : " +staff2.getAddress());
            System.out.println("staff2 : " +staff2.getSalary());
                
    }
    
}
    
