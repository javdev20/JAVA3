﻿package homework_7.mytesting;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

public @interface Test {
    int priority() default 1;
}
