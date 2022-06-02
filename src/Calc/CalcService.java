package Calc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CalcService {

    private final CalculatorInterface calculator;

    CalcService(CalculatorInterface calculator) {
        this.calculator = calculator;
    }

    public static void main(String[] args) {

        // 객체 주입
        CalcService calcService = new CalcService(
                new ConsoleCalculator(
                        new MemoryResultRepository()));

        // 메뉴
        calcService.menu();

    }

    void menu() {

        Scanner scan = new Scanner(System.in);

        while(true) {

            int choice = 0;

            System.out.println("1. 조회");
            System.out.println("2. 계산");
            System.out.println("0. 종료");

            choice = scan.nextInt();

            switch(choice) {
                case 1:
                    search();
                    break;
                case 2:
                    calc(scan);
                    break;
                case 0:
                    System.out.println("종료");
                    break;
                default:
                    System.out.println("잘못된 입력");
                    break;
            }

            if(choice==0) break;

        }

    }

    // 계산 결과 조회
    void search() {

        if(calculator.findAllResult().size()==0) {
            System.out.println("조회 결과 없음");
        } else {
            for (String result : calculator.findAllResult()) {
                System.out.println(result);
            }
        }
    }

    // 계산 하기
    void calc(Scanner scan) {
        System.out.println("계산식 입력 (숫자, 연산부호 구분 띄어쓰기)");

        scan.nextLine();
        String input = scan.nextLine();

        ArrayList<String> list = new ArrayList<>(Arrays.asList(input.split("(?<=[*/+-])|(?=[*/+-])")));

        multiply(list);
        divide(list);
        plus(list);
        subtract(list);

        System.out.println(list.get(0));

        calculator.save(input+"="+list.get(0));



    }

    void multiply(ArrayList<String> list) {
        while(true) {
            if(list.indexOf("*")==-1)
                break;

            int index = list.indexOf("*");
            int pre = Integer.parseInt(list.get(index-1));
            int next = Integer.parseInt(list.get(index+1));
            int result = pre*next;

            list.set(index, Integer.toString(result));
            list.remove(index+1);
            list.remove(index-1);
        }

    }

    void divide(ArrayList<String> list) {
        while(true) {
            if(list.indexOf("/")==-1)
                break;

            int index = list.indexOf("/");
            int pre = Integer.parseInt(list.get(index-1));
            int next = Integer.parseInt(list.get(index+1));
            int result = pre/next;

            list.set(index, Integer.toString(result));
            list.remove(index+1);
            list.remove(index-1);
        }



    }

    void plus(ArrayList<String> list) {
        while(true) {
            if(list.indexOf("+")==-1)
                break;

            int index = list.indexOf("+");
            int pre = Integer.parseInt(list.get(index-1));
            int next = Integer.parseInt(list.get(index+1));
            int result = pre+next;

            list.set(index, Integer.toString(result));
            list.remove(index+1);
            list.remove(index-1);
        }


    }

    void subtract(ArrayList<String> list) {
        while(true) {
            if(list.indexOf("-")==-1)
                break;

            int index = list.indexOf("-");
            int pre = Integer.parseInt(list.get(index-1));
            int next = Integer.parseInt(list.get(index+1));
            int result = pre-next;

            list.set(index, Integer.toString(result));
            list.remove(index+1);
            list.remove(index-1);
        }
    }

}
