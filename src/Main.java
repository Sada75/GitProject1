import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {



public void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int[][] arr=new int[a][a];
    System.out.println("Enter the matrix : ");
    for(int i=0;i<a;i++){
        for(int j=0;j<a;j++){
            arr[i][j]=sc.nextInt();
        }
    }
//    int[] x=new int[a];
//    for(int i=1;i<=a;i++){
//        x[i-1]=i;
//    }
//    int[] y=new int[a];
//    int c=0;
//    for(int j=1;j<=a;j++){
//        c= c+j;
//        y[j-1]=c;
//    }
    int deg=360/a;
    double k=1;
    double t=0;
    double[] x=new double[a];
    double rad=Math.toRadians(deg);
    double xcos=Math.cos(rad);
    for(int i=0;i<a;i++){
        x[i]=k;
        t=t+deg;
        double rad1=Math.toRadians(t);
        k=Math.cos(rad1);
        if(Math.abs(k)<1.0E-15){
            k=0;
        }

    }
//    double rad1=Math.sin(rad);
    double p=0;
    double l=0;
    double[] y=new double[a];
    for(int j=0;j<a;j++){
        y[j]=p;
        l=l+deg;
        double rad2=Math.toRadians(l);
        p=Math.sin(rad2);
        if(Math.abs(p)<1.0E-15){
            p=0;
        }
    }
//    if (Math.abs(kd) < 1.0E-15) {
//        kd = 0.0;
//    }
    double[][] points=new double[a][2];
    for(int i=0;i<a;i++){
        for(int j=0;j<2;j++){
            if(j%2==0){
                points[i][j]=x[i];
            }else{
                points[i][j]=y[0];
            }
        }
    }
    ArrayList<Double> xlist=new ArrayList<>();
    for(int i=0;i<a;i++){
        xlist.add(x[i]);
    }
    ArrayList<Double> ylist=new ArrayList<>();
    for(int i=0;i<a;i++){
        ylist.add(y[i]);
    }
    System.out.println("x = "+xlist+";");
    System.out.println("y = "+ylist+";");




    System.out.println("scatter(x,y);");



    // checking the vertex adjacency matrix

    for(int i=0;i<a;i++){
        for(int j=0;j<a;j++){
            if(arr[i][j]==1){
//                List<Integer> kx=new ArrayList<>();
//                kx.add(x[i]);
//                kx.add(x[j]);
//                List<Integer> ky=new ArrayList<>();
//                ky.add(y[i]);
//                ky.add(y[j]);
                System.out.println("plot(["+x[i]+","+x[j]+"],["+y[i]+","+y[j]+"],'b-','LineWidth',1);");

                    System.out.println("hold on;");

            }

        }


    }


    }




}




    }

}
