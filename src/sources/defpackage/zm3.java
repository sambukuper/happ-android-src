package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public @interface zm3 {
    dp3 include() default dp3.Y;

    String propName() default "";

    String propNamespace() default "";

    boolean required() default false;

    String value();
}
