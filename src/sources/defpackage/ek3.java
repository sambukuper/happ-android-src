package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ek3 {
    public static final fl1 a;
    public static final fl1 b;
    public static final fl1 c;
    public static final HashMap d;

    static {
        vl3 vl3Var = vl3.f0;
        fl1 fl1Var = new fl1(vl3Var, (byte) 9);
        a = fl1Var;
        xl3 xl3Var = xl3.f0;
        fl1 fl1Var2 = new fl1(xl3Var, (byte) 10);
        b = fl1Var2;
        wl3 wl3Var = wl3.f0;
        fl1 fl1Var3 = new fl1(wl3Var, (byte) 11);
        c = fl1Var3;
        HashMap map = new HashMap();
        d = map;
        map.put(vl3Var, fl1Var);
        map.put(xl3Var, fl1Var2);
        map.put(wl3Var, fl1Var3);
    }

    public static boolean a(jd1 jd1Var, ed1 ed1Var) {
        if (jd1Var != null) {
            tf5 tf5Var = (tf5) bl1.h(jd1Var, tf5.class, false);
            tf5 tf5Var2 = (tf5) bl1.h(ed1Var, tf5.class, false);
            return (tf5Var2 == null || tf5Var == null || !((uf5) tf5Var).i0.equals(((uf5) tf5Var2).i0)) ? false : true;
        }
        Object[] objArr = new Object[3];
        switch (2) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        objArr[2] = "areInSamePackage";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean b(i86 i86Var, jd1 jd1Var, ed1 ed1Var) {
        jd1 jd1VarR;
        if (jd1Var instanceof ld0) {
            jd1VarR = bl1.r((ld0) jd1Var);
        } else {
            int i = bl1.a;
            jd1VarR = jd1Var;
        }
        if (a(jd1VarR, ed1Var)) {
            return true;
        }
        return gl1.c.a(i86Var, jd1Var, ed1Var);
    }
}
