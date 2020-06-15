package com.shangguan.spring.controller;

import com.shangguan.spring.beans.Code;
import com.shangguan.spring.service.CodeService;
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
@RequestMapping("/h")
public class CodeController {

    private String list = "redirect:/h/list";

    @Autowired
    CodeService codeService;

    /**
     * 查询
     * @param model
     * @return
     */
    @GetMapping("/list")
    public String list(Model model) {
        List<Code> list = codeService.selectAllCode();
        model.addAttribute("list", list);
        return "show";
    }

    @DeleteMapping("/code/{id}")
    @ResponseBody
    public Map<String, Object> deleteCode(@PathVariable("id") int cid) {
        Map<String, Object> map = new HashMap<>();
        int i = codeService.deleteByPrimaryKey(cid);
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
        Code code = codeService.selectByPrimaryKey(cid);
        model.addAttribute("code", code);
        return "common";
    }

    @PostMapping("/doUpdate")
    public String doUpdate(Code code) {
        int i = codeService.updateByPrimaryKeySelective(code);
        if (i > 0) {

            return list;
        } else {
            return "error";
        }
    }

    @PostMapping("/insert")
    public String insert(Code code) {
        int i = codeService.insert(code);
        if (i > 0) {
            return list;
        } else {
            return "error";
        }
    }
}
