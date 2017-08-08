package strategy_mode;

import strategy_mode.context.Price;
import strategy_mode.stratety.MemberStrategy;
import strategy_mode.stratety.impl.PrimaryMemberStrategy;
import strategy_mode.stratety.impl.PrimeMemberStrategy;

/**
 * Created by huang_sq on 2017/8/8.
 */
public class ClientTest {

    public static void main(String[] args) {
        //选择并创建需要使用的策略对象
        MemberStrategy strategy = new PrimeMemberStrategy();
        //创建环境
        Price price = new Price(strategy);
        //计算价格
        double quote = price.quote(300);
        System.out.println("图书的最终价格为：" + quote);
    }
}
