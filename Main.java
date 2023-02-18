public class Main {

    public static void main(String[] args ) {

        int i;
        int[] counter = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (i = 0; i < 10000; i++) {

            int randInt = (int) (Math.random()*10);
           //  System.out.println(randInt);
            
            switch(randInt) {

                case 0:
                    counter[0]++;
                    break;
                case 1:
                    counter[1]++;
                    break;
                case 2:
                    counter[2]++;
                    break;
                case 3:
                    counter[3]++;
                    break;
                case 4:
                    counter[4]++;
                    break;
                case 5:
                    counter[5]++;
                    break;
                case 6:
                    counter[6]++;
                    break;
                case 7:
                    counter[7]++;
                    break;
                case 8:
                    counter[8]++;
                    break;
                case 9:
                    counter[9]++;
                    break;
                default:
                    System.out.println("ahhhhhh");
                    break;

            }



        }

        for (int e : counter) {

            System.out.print(e + " ");

        }

    }

}