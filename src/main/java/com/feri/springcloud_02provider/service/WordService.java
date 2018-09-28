package com.feri.springcloud_02provider.service;

import com.feri.springcloud_02provider.entity.Word;
import com.feri.springcloud_02provider.vo.R;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/9/28 11:50
 */
public interface WordService {

    R save(Word word);
    List<Word> queryByFlag(int f);
}
