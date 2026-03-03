package com.defaultpackage.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Default5Task implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

    }

    public static  Default5Task on(){
        return instrumented(Default5Task.class);
    }
}
