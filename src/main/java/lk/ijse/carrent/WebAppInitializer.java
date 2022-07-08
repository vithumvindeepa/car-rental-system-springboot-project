package lk.ijse.carrent;

import lk.ijse.carrent.config.Webappconfig;
import lk.ijse.carrent.config.Webrootconfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{Webappconfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{Webrootconfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
