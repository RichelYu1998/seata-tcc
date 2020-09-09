package cn.tedu.storage.mapper;

import cn.tedu.storage.entity.Storage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface StorageMapper extends BaseMapper<Storage> {
    void decrease(Long productId, Integer count);
}
