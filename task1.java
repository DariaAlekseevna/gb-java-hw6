package hw.hw6;

/*
 * Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. 
 * Реализовать в Java.
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

public class task1 {
    public static void main(String[] args) {

        System.out.println("Список ноутбуков: ");

        laptop l1=new laptop(123,"Asus", 50_000);
        l1.setColor("black");
        l1.setHDD(700);
        l1.setOS("Windows");
        l1.setRAM(8);

        
        laptop l2=new laptop(456,"Acer", 70_000);
        l2.setColor("black");
        l2.setHDD(1100);
        l2.setOS("Windows");
        l2.setRAM(12);

        laptop l3=new laptop(789,"Asus", 65_000);
        l3.setColor("silver");
        l3.setHDD(900);
        l3.setOS("Windows");
        l3.setRAM(16);

        laptop l4=new laptop(258,"HP", 45_000);
        l4.setColor("black");
        l4.setHDD(700);
        l4.setOS("Linux");
        l4.setRAM(8);

        laptop l5=new laptop(147,"Apple", 70_000);
        l5.setColor("silver");
        l5.setHDD(600);
        l5.setOS("macOS");
        l5.setRAM(4);

        laptop l6=new laptop(951,"HP", 60_000);
        l6.setColor("black");
        l6.setHDD(800);
        l6.setOS("Windows");
        l6.setRAM(8);

        HashSet <laptop> laptops = new HashSet<>(Arrays.asList(l1,l2,l3,l4,l5,l6));
        HashSet <laptop> res = new HashSet<>();
        System.out.println();
        System.out.print("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет\n");
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        scanner.nextLine();

        HashMap<String, Object> filters = new HashMap<>();

        if(n==1){
            System.out.println("Введите минимальную оперативную память (4-16ГБ)");
            Integer temp = scanner.nextInt();
            scanner.nextLine();
            filters.put("RAM", temp);
        }
        if(n==2){
            System.out.println("Введите минимальный объем ЖД (600-1100ГБ)" );
            Integer temp = scanner.nextInt();
            scanner.nextLine();
            filters.put("HDD", temp);
        }
        if(n==3){
            System.out.println("Введите ОС (Windows, macOS, Linux)");
            String temp = scanner.nextLine();
            filters.put("OS", temp);
        }
        if(n==4){
            System.out.println("Введите цвет (silver, black)");
            String temp = scanner.nextLine();
            filters.put("color", temp);
        }

        System.out.println();
        System.out.println("Варианты по заданным критериям: ");

        for (Entry<String, Object> entry : filters.entrySet()) {
            if(entry.getKey().equals("RAM")){
                Iterator it = laptops.iterator();
                while(it.hasNext()){
                    laptop lap = (laptop) it.next();
                    if(lap.getRAM()>=(Integer)entry.getValue())
                        res.add(lap);
                }
            }
            if(entry.getKey().equals("HDD")){
                Iterator it = laptops.iterator();
                while(it.hasNext()){
                    laptop lap = (laptop)it.next();
                    if(lap.getHDD()>=(Integer)entry.getValue())
                        res.add(lap);
                }
            }
            if(entry.getKey().equals("OS")){
                Iterator it = laptops.iterator();
                while(it.hasNext()){
                    laptop lap = (laptop)it.next();
                        if(lap.getOS().equals(entry.getValue()))
                            res.add(lap);
                }
            }
            if(entry.getKey().equals("color")){
                Iterator it = laptops.iterator();
                while(it.hasNext()){
                    laptop lap = (laptop)it.next();
                        if(lap.getColor().equals(entry.getValue()))
                            res.add(lap);
                }
            }
        }
        
        Iterator it = res.iterator();
        while(it.hasNext()){
            laptop lap = (laptop)it.next();
            System.out.println(lap.toString());
            System.out.println();
        }
    }
}
