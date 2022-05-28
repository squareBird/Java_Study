package Calc;

import java.util.ArrayList;

public class ConsoleCalculator implements CalculatorInterface{

    private final ResultRepositoryInterface repository;

    ConsoleCalculator(ResultRepositoryInterface repository) {
        this.repository = repository;
    }

    @Override
    public void calculation() {

    }

    @Override
    public void save(String result) {
        repository.save(result);
    }

    @Override
    public ArrayList<String> findAllResult() {
        return repository.findAllResult();
    }

}
