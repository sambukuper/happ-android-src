package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class w27 extends x27 {
    public static int e0(u27 u27Var) {
        Iterator it = u27Var.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                i21.W();
                throw null;
            }
        }
        return i;
    }

    public static u27 f0(u27 u27Var, int i) {
        if (i < 0) {
            em7.c(ie2.h("Requested element count ", i, " is less than zero."));
            return null;
        }
        if (i == 0) {
            return u27Var;
        }
        return u27Var instanceof uw1 ? ((uw1) u27Var).a(i) : new sw1(u27Var, i);
    }

    public static final sd2 g0(u27 u27Var) {
        zx6 zx6Var = new zx6((byte) 4);
        if (!(u27Var instanceof md8)) {
            return new sd2(u27Var, new zx6((byte) 5), zx6Var);
        }
        md8 md8Var = (md8) u27Var;
        return new sd2(md8Var.a, md8Var.b, zx6Var);
    }

    public static u27 h0(dn2 dn2Var) {
        return new t21(new z92(dn2Var, new xo(dn2Var, (byte) 5)));
    }

    public static u27 i0(Object obj, gn2 gn2Var) {
        gn2Var.getClass();
        return obj == null ? l02.a : new z92(new hr5(obj, (byte) 17), gn2Var);
    }

    public static String j0(u27 u27Var, String str, dx4 dx4Var, int i) {
        if ((i & 32) != 0) {
            dx4Var = null;
        }
        u27Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET);
        int i2 = 0;
        for (Object obj : u27Var) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            z39.e(sb, obj, dx4Var);
        }
        sb.append((CharSequence) _UrlKt.FRAGMENT_ENCODE_SET);
        return sb.toString();
    }

    public static Object k0(u27 u27Var) {
        Iterator it = u27Var.iterator();
        if (!it.hasNext()) {
            em7.g("Sequence is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static md8 l0(u27 u27Var, gn2 gn2Var) {
        u27Var.getClass();
        gn2Var.getClass();
        return new md8(u27Var, gn2Var);
    }

    public static la2 m0(u27 u27Var, gn2 gn2Var) {
        return new la2(new md8(u27Var, gn2Var), false, new zx6((byte) 6));
    }

    public static List n0(u27 u27Var) {
        Iterator it = u27Var.iterator();
        if (!it.hasNext()) {
            return d02.X;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return i21.K(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static Set o0(u27 u27Var) {
        Iterator it = u27Var.iterator();
        if (!it.hasNext()) {
            return m02.X;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return w45.U(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }
}
