package restx.validation;

import java.lang.annotation.*;

/**
 * @author fcamblor
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ValidatedFor {
    // Validation group FQN here
    String[] value();
}
