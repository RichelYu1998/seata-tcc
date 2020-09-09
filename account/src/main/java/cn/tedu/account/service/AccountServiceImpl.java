package cn.tedu.account.service;

import cn.tedu.account.mapper.AccountMapper;
import cn.tedu.account.tcc.AccountTccAction;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Service
public class AccountServiceImpl implements AccountService {
    /*  @Resource
      private AccountMapper accountMapper;*/
    @Resource
    private AccountTccAction accountTccAction;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        /*accountMapper.decrease(userId, money);*/
        accountTccAction.prepareDecreaseAccount(null, userId, money);
    }
}