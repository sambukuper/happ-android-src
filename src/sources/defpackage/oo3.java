package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface oo3 {
    jd5 lenient() default jd5.Y;

    String locale() default "##default";

    String pattern() default "";

    int radix() default -1;

    mo3 shape() default mo3.k0;

    String timezone() default "##default";

    ko3[] with() default {};

    ko3[] without() default {};
}
