package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class js3 {
    public static final fk2 a;
    public static final qs0 b;

    static {
        fk2 fk2Var = new fk2("kotlin.jvm.JvmField");
        a = fk2Var;
        jb5.S(fk2Var);
        jb5.S(new fk2("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        b = jb5.t("kotlin/jvm/internal/RepeatableContainer", false);
    }

    public static final String a(String str) {
        str.getClass();
        return c(str) ? str : "get".concat(i21.m(str));
    }

    public static final String b(String str) {
        str.getClass();
        return "set".concat(c(str) ? str.substring(2) : i21.m(str));
    }

    public static final boolean c(String str) {
        char cCharAt;
        str.getClass();
        return mm7.Z(str, false, "is") && str.length() != 2 && ('a' > (cCharAt = str.charAt(2)) || cCharAt > 'z');
    }
}
