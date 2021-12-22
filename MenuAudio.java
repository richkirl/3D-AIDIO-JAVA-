package com.company;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.System.exit;

enum Menu {
    menu,
    capture,
    options,
    exit
}
//System.out.println("1: Проигрывание музыки.");
//System.out.println("2: Запись музыки.");
//System.out.println("3: Настройки.");
public class MenuAudio {

    private static HashMap<Integer,String> mymenumap = new HashMap<>();

    Menu statep;
    String mainstr="1: Проигрывание музыки.";
    String recstr="2: Запись музыки.";
    String optstr="3: Настройки.";
    String exitstr="4: Выход.";
    //Scanner in = new Scanner(System.in);
    public MenuAudio() {
        this.mymenumap.put(Menu.menu.ordinal(),mainstr);
        this.mymenumap.put(Menu.capture.ordinal(),recstr);
        this.mymenumap.put(Menu.options.ordinal(),optstr);
        this.mymenumap.put(Menu.exit.ordinal(),exitstr);
    }

    public static void renderMenu() {
        System.out.println(mymenumap.get(0));
        System.out.println(mymenumap.get(1));
        System.out.println(mymenumap.get(2));
        System.out.println(mymenumap.get(3));
    }
    public static void input(Scanner s) throws IOException {
        //Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        switch(x){
            case 1:
            {
                PlayAudio playAudio = new PlayAudio();
                playAudio.play();
                //while()
            }
            break;
            case 2:
            {
                CaptureDeviceTest test = new CaptureDeviceTest();
                test.captureTest();
            }
            break;
            case 3:
            {
                StructureOptions structureOptions = new StructureOptions();
                System.out.print("Настройка проигрывателя, записи.\n");
                structureOptions.menu();
                //structureOptions.read();
            }
            break;
            case 4:
            {
                exit(0);
            }
            break;
        }
    }
    public static void mainLoop() throws IOException {
        //int l;
        //renderMenu();
        /*String str="-/---\\-/-|";
        var ref = new Object() {
            int count = 1;
        };
        Runnable task = () ->{
            while(true){

                System.out.print(str.charAt(ref.count) + "\r");
                ref.count = ref.count +2;
                if(ref.count ==9) {
                    System.out.print(str.charAt(ref.count) + "\r");
                    ref.count = 1;
                }
            }
        };*/
        Scanner s = new Scanner(System.in);
        //input(s);
        //Thread thread = new Thread(task);
         while(!s.equals(4)){
             //thread.start();
             System.out.print("\n");
             //thread.start();
             System.out.print("\n");
             renderMenu();
             System.out.print("\n");


             input(s);
             //thread.stop();

        }
    }
}
