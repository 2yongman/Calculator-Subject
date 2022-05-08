package com.codestates.seb.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("===Java Calculator===");

        Scanner input = new Scanner(System.in);
        /*
            요구 사항에 따라 간단한 계산기를 만들어주세요.
            1. 사용자의 입력으로 첫 번째 숫자, 연산자, 두 번째 숫자를 받아야 합니다.
            2. 연산자의 종류는 +, -, *, / 입니다.
            3. 소수점 연산을 수행할 수 있어야 합니다.
            4. 연산 결과를 콘솔에 출력합니다.
        */
        // TODO...
        System.out.println("---- 첫번째 숫자를 입력해주세요. ----");
        double firstNum = input.nextDouble();

        double result = 0;
        boolean going = true;

        while (going) {

            System.out.println("---- 사칙연산 기호 중 하나를 입력해주세요. <+,-,*,/> ----");
            String operation = input.next();
            if (!(operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/"))) {
                System.out.println("잘못된 연산자 입니다. 계산기를 다시 실행해주세요.");
                break;
            }

            System.out.println("---- 두번째 숫자를 입력해주세요. ----");
            double secondNum = input.nextDouble();

            System.out.println("---- 계산을 시작합니다. ----");
            if(operation.equals("+")){
              result = firstNum + secondNum;
            }else if (operation.equals("-")){
              result = firstNum - secondNum;
            }else if (operation.equals("*")){
              result = firstNum * secondNum;
            }else if (operation.equals("/")){
              result = firstNum / secondNum;
            }else {
              System.out.println("연산 오류");
            }

          System.out.println("계산 결과입니다 : " + result);

          System.out.println("계산을 더 하시겠습니다? Y / N");
          String yesOrno = input.next();
          if (yesOrno.equals("Y") || yesOrno.equals("y")){
            going = true;
            firstNum = result;
          }else if (yesOrno.equals("N") || yesOrno.equals("n")){
            going = false;
            System.out.println("계산을 종료합니다.");
          }else {
            System.out.println("잘못된 값을 입력하셨기에 계산을 종료합니다.");
            break;
          }
        }
    }
}
