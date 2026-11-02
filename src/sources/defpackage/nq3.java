package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface nq3 {
    mq3 access() default mq3.X;

    String defaultValue() default "";

    int index() default -1;

    jd5 isRequired() default jd5.Y;

    String namespace() default "";

    boolean required() default false;

    String value() default "";
}
