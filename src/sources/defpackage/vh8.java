package defpackage;

import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vh8 {
    public final uh8 X;
    public final dh8 Y;

    public vh8(dh8 dh8Var, uh8 uh8Var) {
        this.Y = dh8Var;
        this.X = uh8Var;
    }

    public static Class a(Class cls) {
        Annotation[] annotationArr = it0.a;
        return (!Enum.class.isAssignableFrom(cls) || cls.isEnum()) ? cls : cls.getSuperclass();
    }

    public abstract String b(Object obj);

    public abstract String c(Class cls, Object obj);

    public vh8() {
        this(null, null);
    }
}
