package Calc;

import java.util.ArrayList;

/**
 * 계산기의 기능을 수행하는 인터페이스
 * 실습에선 콘솔이지만 GUI에도 그대로 사용할 수 있도록 해보자
 */
public interface CalculatorInterface {

    void calculation();

    void save(String result);

    ArrayList<String> findAllResult();

}
