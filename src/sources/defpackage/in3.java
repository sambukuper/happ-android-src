package defpackage;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface in3 {
    hn3 creatorVisibility() default hn3.f0;

    hn3 fieldVisibility() default hn3.f0;

    hn3 getterVisibility() default hn3.f0;

    hn3 isGetterVisibility() default hn3.f0;

    hn3 setterVisibility() default hn3.f0;
}
