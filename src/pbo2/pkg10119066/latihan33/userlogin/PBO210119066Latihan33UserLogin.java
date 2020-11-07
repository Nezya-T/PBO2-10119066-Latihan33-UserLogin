/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10119066.latihan33.userlogin;

import java.util.Scanner;

/**
 *
 * @author Neyza-T
 * Nama  : Nezya Tariska
 * Nim   : 10119066
 * Kelas : PBO2
 */
public class PBO210119066Latihan33UserLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        System.out.print("Masukkan Username : ");
        String usName = scanner.next();
        System.out.print("Masukkan password : ");
        String passWord = scanner.next();
        System.out.println(" ");
        user.pengecekkanLogin(usName, passWord);
    }
    
}
