package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class b30 extends hi5 implements Serializable {
    public static final z20 g0 = z20.d(null, ba7.U0(String.class), new al(String.class));
    public static final z20 h0;
    public static final z20 i0;
    public static final z20 j0;
    public static final z20 k0;

    static {
        Class cls = Boolean.TYPE;
        h0 = z20.d(null, ba7.U0(cls), new al(cls));
        Class cls2 = Integer.TYPE;
        i0 = z20.d(null, ba7.U0(cls2), new al(cls2));
        Class cls3 = Long.TYPE;
        j0 = z20.d(null, ba7.U0(cls3), new al(cls3));
        k0 = z20.d(null, ba7.U0(Object.class), new al(Object.class));
    }

    public static z20 E0(vp4 vp4Var, dh8 dh8Var) {
        Class cls = dh8Var.j0;
        if (cls.isPrimitive()) {
            if (cls != Integer.TYPE) {
                if (cls != Long.TYPE) {
                    if (cls != Boolean.TYPE) {
                        return null;
                    }
                    return h0;
                }
                return j0;
            }
            return i0;
        }
        if (!it0.q(cls)) {
            if (up3.class.isAssignableFrom(cls)) {
                return z20.d(vp4Var, dh8Var, new al(cls));
            }
            return null;
        }
        if (cls == Object.class) {
            return k0;
        }
        if (cls == String.class) {
            return g0;
        }
        if (cls != Integer.class) {
            if (cls != Long.class) {
                if (cls != Boolean.class) {
                    return null;
                }
                return h0;
            }
            return j0;
        }
        return i0;
    }
}
