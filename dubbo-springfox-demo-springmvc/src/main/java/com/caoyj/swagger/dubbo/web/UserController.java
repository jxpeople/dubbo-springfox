package com.caoyj.swagger.dubbo.web;

import com.caoyj.swagger.dubbo.model.Book;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.spi.annotations.RequestModel;

import java.util.Map;

/**
 * @author zhaojigang
 * @date 2018/5/16
 */
//@Api(tags = "user相关api")
@RestController
@RequestMapping("/user")
public class UserController {
//    @ApiOperation("普通")
    @RequestMapping(value = "/testCommonField", method = RequestMethod.POST)
    public String testCommonField(@RequestParam("name") String name, @RequestModel Map<String, Book> bookMap) {
        return bookMap.get("additionalProp1").getTitle();
    }

    @ApiOperation("普通2")
    @RequestMapping(value = "/testCommonField2", method = RequestMethod.POST)
    public String testCommonField2(@RequestParam("name") String name, @RequestBody Map<String, Book> bookMap) {
        return name;
    }

    @ApiOperation("Object")
    @RequestMapping(value = "/testObject", method = RequestMethod.POST)
    public Book testObject(@RequestModel(value = "book1") Book book1, @RequestModel(value = "book2") Book book2) {
        Book book = new Book();
        book.setId(99L);
        book.setTitle(book1.getTitle());
        book.setContent(book2.getContent());
        return book;
    }

    @ApiOperation("測試無參")
    @RequestMapping(value = "/testEmptyField", method = RequestMethod.POST)
    public void testCommonField() {
        System.out.println("hello");
    }
}