package cn.tedu.storage.mapper;

import cn.tedu.storage.entity.Storage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface StorageMapper extends BaseMapper<Storage> {
    void decrease(Long productId, Integer count);
    void updateFrozen(@Param("productId") Long productId, @Param("residue") Integer residue, @Param("frozen") Integer frozen);
    // 提交时，把冻结量修改到已售出
    void updateFrozenToUsed(@Param("productId") Long productId, @Param("count") Integer count);
    // 回滚时，把冻结量修改到可用库存
    void updateFrozenToResidue(@Param("productId") Long productId, @Param("count") Integer count);
}
