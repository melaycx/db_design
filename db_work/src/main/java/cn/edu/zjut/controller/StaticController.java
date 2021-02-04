package cn.edu.zjut.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Objects;

@RestController
public class StaticController {

    @RequestMapping("/resources/**")
    public byte[] resourcesA(HttpServletRequest request) throws IOException {
        //System.out.println(request.getServletPath());
        var file = new File(
                Objects.requireNonNull(getClass().getClassLoader().getResource("../../")).getFile(),
                request.getServletPath());
        return Files.readAllBytes(file.toPath());
    }
}
