package cn.tedu.order.mapper;

import cn.tedu.order.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;


public interface OrderMapper extends BaseMapper {
    void create(Order order);
}
