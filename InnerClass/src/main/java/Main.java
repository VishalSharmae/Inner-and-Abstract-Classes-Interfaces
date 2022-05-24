import java.util.Scanner;

public class Main {


    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");



    public static void main(String[] args) {

//       class ClickListener implements Button.OnClickListener {
//
//           public ClickListener(){
//               System.out.println("I've been attached");
//           }
//
//           @Override
//           public void onClick(String title) {
//               System.out.println(title + " was Clicked");
//           }
//       }

        // Intellij creating an anonymous class and good substitute for above commented class; Works same
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was Clicked");
            }
        });

       //btnPrint.setOnClickListener(new ClickListener());
       listen();
        //
        //        Gearbox mcLaren =new Gearbox(6);
       /* Gearbox.Gear first = mcLaren.new Gear(1,12.3);
        Gearbox.Gear second = mcLaren.new Gear(2,15.4);
        Gearbox.Gear third = mcLaren.new Gear(3,17.8);
        Gearbox.Gear fourth = mcLaren.new Gear(4,19.2);
        Gearbox.Gear fifth = mcLaren.new Gear(5,20.4);
        System.out.println(first.driveSpeed(1000));*/


//        mcLaren.operatingClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operatingClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        mcLaren.operatingClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operatingClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));



    }

    private static void listen(){
        boolean quit = false;
        while (!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
