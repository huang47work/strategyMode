package strategy_mode.stratety;

/**
 * Created by huang_sq on 2017/8/8.
 * 策略接口
 */
public interface MemberStrategy {
    /**
     * 计算图书的价格
     * @param booksPrice    图书的原价
     * @return    计算出打折后的价格
     */
    public double calcPrice(double booksPrice);
}
