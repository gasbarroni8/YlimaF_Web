package com.talkweb.ylimaf.web.service;

import com.talkweb.ylimaf.web.dao.DictItemMapper;
import com.talkweb.ylimaf.web.pojo.DictItem;
import com.talkweb.ylimaf.web.pojo.DictItemExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zWX435453 on 2017/8/24/0024.
 */
@Service
public class DictItemService {

    @Autowired
    DictItemMapper dictItemMapper;

    public String getDictItemDesc(String dictId, String dictItemValue) {
        DictItemExample dictItemExample = new DictItemExample();
        dictItemExample.createCriteria().andDictIdEqualTo(dictId);
        List<DictItem> dictItemList = dictItemMapper.selectByExample(dictItemExample);

        for (DictItem dictItem : dictItemList) {
            if (dictItem.getDictItemValue().equals(dictItemValue)) {
                return dictItem.getDictItemDesc();
            }
        }

        return null;

    }


}
