package ro.ProiectColectiv.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@Configuration
public class ViewConfig extends WebMvcConfigurerAdapter {

    @Autowired
    public ViewConfig()
    {
    }

    public void addViewControllers(ViewControllerRegistry registry)
    {
        registry.addViewController( "/doctor").setViewName("Doctor");
        //registry.addViewController( "/doctor").setViewName("Doctor");
        //registry.addViewController(urlPath: "/").setViewName("index");
    }



    @Override
    public void addResourceHandlers(ResourceHandlerRegistry resourceHandlerRegistry)
    {
        resourceHandlerRegistry.addResourceHandler("/FrontEnd/**").addResourceLocations("classpath:/FrontEnd/");
    }

}
