package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface xq3 {
    Class as() default Void.class;

    Class contentAs() default Void.class;

    Class contentConverter() default z51.class;

    Class contentUsing() default zq3.class;

    Class converter() default z51.class;

    vq3 include() default vq3.X;

    Class keyAs() default Void.class;

    Class keyUsing() default zq3.class;

    Class nullsUsing() default zq3.class;

    wq3 typing() default wq3.Z;

    Class using() default zq3.class;
}
