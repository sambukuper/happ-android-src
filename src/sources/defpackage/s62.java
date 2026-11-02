package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class s62 {
    public static volatile s62 a;
    public static final s62 b;

    static {
        s62 s62Var = new s62();
        Map map = Collections.EMPTY_MAP;
        b = s62Var;
    }

    public static s62 a() {
        s62 s62Var;
        l06 l06Var = l06.c;
        s62 s62Var2 = a;
        if (s62Var2 != null) {
            return s62Var2;
        }
        synchronized (s62.class) {
            try {
                s62Var = a;
                if (s62Var == null) {
                    Class cls = p62.a;
                    s62 s62Var3 = null;
                    if (cls != null) {
                        try {
                            s62Var3 = (s62) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    s62Var = s62Var3 != null ? s62Var3 : b;
                    a = s62Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return s62Var;
    }
}
