

class q10{

    public static void main(String[] args) {

        int n=5;

        for(int i=0;i<n;i++){

            if(i==0){

                for(int j=0;j<2*n-1;j++){

                    System.out.print("*");

                }

                System.out.print("\n");

                continue;

            }

            for(int j=0;j<n-i;j++){

                System.out.print("*");

            }

            for(int j=0;j<2*i-1;j++){

                System.out.print(" ");

            }

            for(int j=0;j<n-i;j++){

                System.out.print("*");

            }

            System.out.print("\n");

        }




    }

}