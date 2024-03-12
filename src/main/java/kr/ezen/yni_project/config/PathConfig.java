package kr.ezen.yni_project.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// 인터셉터 구현, IOC관리
// component 스캔을 통해서 자동으로 Bean 생성 -> Bean은 스프링컨테이너가 관리해주는 객체
public class PathConfig implements WebMvcConfigurer {

    // 사진경로 설정~~~
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/fileRepo/**") // 이것을 아래 경로로 변경해줌
//                .addResourceLocations("file:///c:/Y&I_Images/");
//    }
}
