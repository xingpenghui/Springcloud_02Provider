package com.feri.springcloud_02provider.app;

import com.feri.springcloud_02provider.entity.Word;
import com.feri.springcloud_02provider.service.WordService;
import com.feri.springcloud_02provider.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/9/28 11:54
 */
@RestController
public class WordApp {
    @Autowired
    private WordService wordService;

    //新增
    @PostMapping("/wordsave.do")
    public R save(Word word){
        return wordService.save(word);
    }
    //查询
    @GetMapping("/wordlist.do")
    public List<Word> list(int flag){
        return wordService.queryByFlag(flag);
    }
}
