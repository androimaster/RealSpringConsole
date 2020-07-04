package part11;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component
public class AspectLogging<Ojbect> {

    public Object AspectLog(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("AspectLogging == Before  || " + joinPoint.getSignature().toShortString());
        try {
            System.out.println(" ** 매개변수 :: " + Arrays.toString(joinPoint.getArgs()));
            Object result = joinPoint.proceed();
            return result;
        }
        finally {
            System.out.println("AspectLogging == After || " + joinPoint.getSignature().toShortString());
        }
    }

} 
