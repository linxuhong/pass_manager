package com.shangguan.spring.controller;

import com.shangguan.spring.beans.Pass;
import com.shangguan.spring.service.PassService;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
@Controller
@RequestMapping("/pass")
public class PassController {

    private String list = "redirect:/pass/list";

    @Autowired
    PassService passService;

    @GetMapping("/list")
    public String list(HttpServletRequest request, Model model, @RequestParam(value = "pname", required = false) String pname,
                       @RequestParam(value = "pno", required = false) String pno
    ) {
        Map m = new HashMap();

        System.out.println(request.getParameter("pname"));
        if (StringUtils.hasLength(pname)) {
            m.put("pname", pname.trim());
        }

        if (StringUtils.hasLength(pno))
            m.put("pno", pno.trim());

        List<Map> list = passService.selectPassBykey(m);
        model.addAttribute("list", list);
        return "passinfo_show";
    }

    @DeleteMapping("/code/{id}")
    @ResponseBody
    public Map<String, Object> deleteCode(@PathVariable("id") int cid) {
        Map<String, Object> map = new HashMap<>();
        int i = passService.deleteByPrimaryKey(cid);
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
        Pass code = passService.selectByPrimaryKey(cid);
        model.addAttribute("code", code);
        return "passinfo_common";
    }

    @PostMapping("/doUpdate")
    public String doUpdate(Pass code) {
        int i = passService.updateByPrimaryKeySelective(code);
        if (i > 0) {

            return list;
        } else {
            return "error";
        }
    }

    @PostMapping("/insert")
    public String insert(Pass code) {
        int i = passService.insert(code);
        if (i > 0) {
            return list;
        } else {
            return "error";
        }
    }
}
