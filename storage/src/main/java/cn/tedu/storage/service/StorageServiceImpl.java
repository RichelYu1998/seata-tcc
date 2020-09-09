package cn.tedu.storage.service;

import cn.tedu.storage.mapper.StorageMapper;
import cn.tedu.storage.tcc.StorageTccAction;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StorageServiceImpl implements StorageService {
   /* @Resource
    private StorageMapper storageMapper;*/
    @Resource
    private StorageTccAction storageTccAction;
    @Override
    public void decrease(Long productId, Integer count) throws Exception {
       /* storageMapper.decrease(productId,count);*/
        storageTccAction.prepareDecreaseStorage(null,productId,count);
    }
}
