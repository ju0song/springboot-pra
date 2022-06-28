package springbootfirst.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import springbootfirst.demo.dto.ArticleForm;

import java.sql.SQLOutput;

@Controller
public class ArticleController {
    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }
    //articleform에서 던진 데이터를 받아오도록하는 컨트롤러
    @GetMapping("/articles/create")
    public String createArticle(ArticleForm form){
        System.out.println(form.toString());
        return "";
    }
}
