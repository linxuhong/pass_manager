package com.shangguan.spring.controller;

import com.shangguan.spring.beans.Person;
import com.shangguan.spring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
@Controller
@RequestMapping("/pp")
public class PersonController {

    private String list = "redirect:/pp/list";

    @Autowired
    PersonService personService;

    @GetMapping("/list")
    public String list(Model model) {
        List<Person> list = personService.selectAllCode();
        model.addAttribute("list", list);
        return "person_show";
    }

    @DeleteMapping("/code/{id}")
    @ResponseBody
    public Map<String, Object> deleteCode(@PathVariable("id") int cid) {
        Map<String, Object> map = new HashMap<>();
        int i = personService.deleteByPrimaryKey(cid);
        if (i > 0) {
            map.put("msg", cid + "数据删除成功!");
            map.put("success", true);
        } else {
            map.put("msg", "数据删除失败");
            map.put("success", false);
        }
        return map;
    }


    //数据回显
    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") int cid, Model model) {
        Person code = personService.selectByPrimaryKey(cid);
        model.addAttribute("code", code);
        return "person_common";
    }

    @PostMapping("/doUpdate")
    public String doUpdate(Person code) {
        int i = personService.updateByPrimaryKeySelective(code);
        if (i > 0) {

            return list;
        } else {
            return "error";
        }
    }

    @PostMapping("/insert")
    public String insert(Person code) {
        int i = personService.insert(code);
        if (i > 0) {
            return list;
        } else {
            return "error";
        }
    }
}
