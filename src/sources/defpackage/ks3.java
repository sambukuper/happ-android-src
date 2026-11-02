package defpackage;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ks3 {
    public static final fk2 a;
    public static final v15 b;
    public static final fk2 c;
    public static final fk2 d;
    public static final fk2 e;
    public static final fk2 f;
    public static final fk2 g;
    public static final fk2 h;
    public static final fk2 i;
    public static final fk2 j;
    public static final fk2 k;
    public static final fk2 l;
    public static final fk2 m;
    public static final fk2 n;
    public static final fk2 o;
    public static final fk2 p;
    public static final fk2 q;
    public static final fk2 r;

    static {
        fk2 fk2Var = new fk2("kotlin.Metadata");
        a = fk2Var;
        if (fk2Var.a.a.replace('.', '/') == null) {
            zs3.a(7);
            throw null;
        }
        b = v15.e("value");
        c = new fk2(Target.class.getName());
        new fk2(ElementType.class.getName());
        d = new fk2(Retention.class.getName());
        new fk2(RetentionPolicy.class.getName());
        e = new fk2(Deprecated.class.getName());
        f = new fk2(Documented.class.getName());
        g = new fk2("java.lang.annotation.Repeatable");
        new fk2("java.lang.annotation.Inherited");
        new fk2(Override.class.getName());
        h = new fk2("org.jetbrains.annotations.NotNull");
        i = new fk2("org.jetbrains.annotations.Nullable");
        j = new fk2("org.jetbrains.annotations.Mutable");
        k = new fk2("org.jetbrains.annotations.ReadOnly");
        l = new fk2("org.jetbrains.annotations.Unmodifiable");
        m = new fk2("org.jetbrains.annotations.UnmodifiableView");
        n = new fk2("kotlin.annotations.jvm.ReadOnly");
        o = new fk2("kotlin.annotations.jvm.Mutable");
        p = new fk2("kotlin.jvm.PurelyImplements");
        new fk2("kotlin.jvm.internal");
        q = new fk2("kotlin.jvm.internal.EnhancedNullability");
        r = new fk2("kotlin.jvm.internal.EnhancedMutability");
    }
}
