package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dj7 {
    public static final HashMap a;

    static {
        HashMap map = new HashMap();
        a = map;
        map.put(boolean[].class.getName(), new wi7(boolean[].class));
        map.put(byte[].class.getName(), new c75((byte) 2));
        map.put(char[].class.getName(), new c75((byte) 6));
        map.put(short[].class.getName(), new bj7(short[].class));
        map.put(int[].class.getName(), new zi7(int[].class));
        map.put(long[].class.getName(), new aj7(long[].class));
        map.put(float[].class.getName(), new yi7());
        map.put(double[].class.getName(), new xi7());
    }

    public static void a(Class cls) {
        uh8.Z.getClass();
        gh8 gh8Var = uh8.f0;
        if (!gh8Var.f() || uh8.a(cls) == null) {
            new ba7(cls, gh8Var, null, null);
        }
    }
}
