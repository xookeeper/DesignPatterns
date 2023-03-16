package strategyPattern;

public class OperationManager {

    Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void execute(int num1, int num2){
        this.strategy.execute(num1, num2);
    }
}
