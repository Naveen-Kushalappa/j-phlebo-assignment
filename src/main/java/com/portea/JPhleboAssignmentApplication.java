/*package com.portea;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.portea.jphleboassignment")
@EntityScan(basePackages = {"com.portea.jphleboassignment.entity"})


public class JPhleboAssignmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(JPhleboAssignmentApplication.class, args);
    }
}*/

package com.portea;

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.boot.autoconfigure.domain.EntityScan;
        import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.portea.jphleboassignment")
@EntityScan(basePackages = {"com.portea.jphleboassignment"})
public class JPhleboAssignmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(JPhleboAssignmentApplication.class, args);
    }
}
