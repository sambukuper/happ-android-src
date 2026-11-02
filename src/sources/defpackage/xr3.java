package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface xr3 {
    Class defaultImpl() default xr3.class;

    tr3 include() default tr3.X;

    String property() default "";

    jd5 requireTypeIdForSubtypes() default jd5.Y;

    ur3 use();

    boolean visible() default false;

    jd5 writeTypeIdForDefaultImpl() default jd5.Y;
}
