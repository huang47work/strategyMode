package strategy_mode.stratety.impl;

import strategy_mode.stratety.MemberStrategy;

/**
 * Created by huang_sq on 2017/8/8.
 *
 */
public class PrimeMemberStrategy implements MemberStrategy {
    /**
     * 计算图书的价格
     *
     * @param booksPrice 图书的原价
     * @return 计算出打折后的价格
     */
    public double calcPrice(double booksPrice) {
        System.out.println("对于高级会员的折扣为20%");
        return booksPrice * 0.8;
    }
}
