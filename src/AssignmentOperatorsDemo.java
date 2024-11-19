public class AssignmentOperatorsDemo {
    public void ArithmeticDemo() {
        int x, y = 10, z = 5;
        x = y + z;
        System.out.println("+ operator resulted in " + x);
        x = y - z;
        System.out.println("- operator resulted in " + x);
        x = y * z;
        System.out.println("* operator resulted in " + x);
        x = y / z;
        System.out.println("/ operator resulted in " + x);
        x = y % z;
        System.out.println("% operator resulted in " + x);
        x = y++;
        System.out.println("Postfix ++ operator resulted in " + x);
        x = ++z;
        System.out.println("Prefix ++ operator resulted in " + x);
        x = -y;
        System.out.println("Unary operator resulted in " + x);

        int tooBig = Integer.MAX_VALUE + 1;

        int tooSmall = Integer.MIN_VALUE - 1;
        System.out.println("tooBig becomes " + tooBig);
        System.out.println("tooSmall becomes " + tooSmall);
        System.out.println(4.0 / 0.0);
        System.out.println(-4.0 / 0.0);
        System.out.println(0.0 / 0.0);
        double d1 = 12 / 8;
        double d2 = 12.0F / 8;
        System.out.println("d1 is " + d1);
        System.out.println("d2 is " + d2);
    }
   public void logicalOperatorDemo() {
       boolean x = true;
       boolean y = false;
       System.out.println("x & y : " + (x & y));
       System.out.println("x && y : " + (x && y));
       System.out.println("x | y : " + (x | y));
       System.out.println("x || y: " + (x || y));
       System.out.println("x ^ y : " + (x ^ y));
       System.out.println("!x : " + (!x));

   }
   public void bitwiseOperatorDemo() {
       int x = 58;
       int y =13;
       System.out.println("x & y : " + (x & y));
       System.out.println("x | y : " + (x | y));
       System.out.println("x ^ y : " + (x ^ y));
       System.out.println("~x : " + (~x));
       System.out.println("x << y : " + (x << y));
       System.out.println("x >> y : " + (x >> y));
   }
   public void ternaryOperatorDemo() {
       int age = 18;
       String result = age < 100 ?
               "Less than 100" : "Greater than 100";
       System.out.println(result);
   }
   public void unaryOperatorDemo() {
       int sum = +1;
       System.out.println(sum);

       sum--;
       System.out.println(sum);

       sum++;
       System.out.println(sum);
       sum = -sum;
       System.out.println(sum);

       boolean result = false;
       System.out.println(result);
       System.out.println(!result);
   }

    }





