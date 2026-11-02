package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ex6 {
    public static final Class a;
    public static final gn8 b;
    public static final in8 c;

    static {
        Class<?> cls;
        Class<?> cls2;
        l06 l06Var = l06.c;
        gn8 gn8Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            l06 l06Var2 = l06.c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                gn8Var = (gn8) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        b = gn8Var;
        c = new in8();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += mv0.j(((Integer) list.get(i)).intValue());
        }
        return iJ;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (mv0.h(i) + 4) * size;
    }

    public static int c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (mv0.h(i) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += mv0.j(((Integer) list.get(i)).intValue());
        }
        return iJ;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += mv0.j(((Long) list.get(i)).longValue());
        }
        return iJ;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int iIntValue = ((Integer) list.get(i2)).intValue();
            i += mv0.i((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return i;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iJ += mv0.j((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iJ;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += mv0.i(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i = 0; i < size; i++) {
            iJ += mv0.j(((Long) list.get(i)).longValue());
        }
        return iJ;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void k(gn8 gn8Var, Object obj, Object obj2) {
        ((in8) gn8Var).getClass();
        cq2 cq2Var = (cq2) obj;
        hn8 hn8Var = cq2Var.unknownFields;
        hn8 hn8Var2 = ((cq2) obj2).unknownFields;
        hn8 hn8Var3 = hn8.f;
        if (!hn8Var3.equals(hn8Var2)) {
            if (hn8Var3.equals(hn8Var)) {
                int i = hn8Var.a + hn8Var2.a;
                int[] iArrCopyOf = Arrays.copyOf(hn8Var.b, i);
                System.arraycopy(hn8Var2.b, 0, iArrCopyOf, hn8Var.a, hn8Var2.a);
                Object[] objArrCopyOf = Arrays.copyOf(hn8Var.c, i);
                System.arraycopy(hn8Var2.c, 0, objArrCopyOf, hn8Var.a, hn8Var2.a);
                hn8Var = new hn8(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                hn8Var.getClass();
                if (!hn8Var2.equals(hn8Var3)) {
                    if (!hn8Var.e) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = hn8Var.a + hn8Var2.a;
                    hn8Var.a(i2);
                    System.arraycopy(hn8Var2.b, 0, hn8Var.b, hn8Var.a, hn8Var2.a);
                    System.arraycopy(hn8Var2.c, 0, hn8Var.c, hn8Var.a, hn8Var2.a);
                    hn8Var.a = i2;
                }
            }
        }
        cq2Var.unknownFields = hn8Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i, List list, yr2 yr2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mv0 mv0Var = (mv0) yr2Var.Y;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                mv0Var.o(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        mv0Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            i3++;
        }
        mv0Var.D(i3);
        while (i2 < list.size()) {
            mv0Var.m(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void n(int i, List list, yr2 yr2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mv0 mv0Var = (mv0) yr2Var.Y;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                mv0Var.t(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        mv0Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        mv0Var.D(i3);
        while (i2 < list.size()) {
            mv0Var.u(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void o(int i, List list, yr2 yr2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mv0 mv0Var = (mv0) yr2Var.Y;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                mv0Var.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        mv0Var.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += mv0.j(((Integer) list.get(i3)).intValue());
        }
        mv0Var.D(iJ);
        while (i2 < list.size()) {
            mv0Var.w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void p(int i, List list, yr2 yr2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mv0 mv0Var = (mv0) yr2Var.Y;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                mv0Var.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        mv0Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        mv0Var.D(i3);
        while (i2 < list.size()) {
            mv0Var.s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void q(int i, List list, yr2 yr2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mv0 mv0Var = (mv0) yr2Var.Y;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                mv0Var.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        mv0Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        mv0Var.D(i3);
        while (i2 < list.size()) {
            mv0Var.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void r(int i, List list, yr2 yr2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mv0 mv0Var = (mv0) yr2Var.Y;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                mv0Var.r(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        mv0Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        mv0Var.D(i3);
        while (i2 < list.size()) {
            mv0Var.s(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void s(int i, List list, yr2 yr2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mv0 mv0Var = (mv0) yr2Var.Y;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                mv0Var.v(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        mv0Var.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += mv0.j(((Integer) list.get(i3)).intValue());
        }
        mv0Var.D(iJ);
        while (i2 < list.size()) {
            mv0Var.w(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void t(int i, List list, yr2 yr2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mv0 mv0Var = (mv0) yr2Var.Y;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                mv0Var.E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        mv0Var.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += mv0.j(((Long) list.get(i3)).longValue());
        }
        mv0Var.D(iJ);
        while (i2 < list.size()) {
            mv0Var.F(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void u(int i, List list, yr2 yr2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mv0 mv0Var = (mv0) yr2Var.Y;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                mv0Var.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        mv0Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            i3 += 4;
        }
        mv0Var.D(i3);
        while (i2 < list.size()) {
            mv0Var.s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void v(int i, List list, yr2 yr2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mv0 mv0Var = (mv0) yr2Var.Y;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                mv0Var.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        mv0Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        mv0Var.D(i3);
        while (i2 < list.size()) {
            mv0Var.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void w(int i, List list, yr2 yr2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mv0 mv0Var = (mv0) yr2Var.Y;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                mv0Var.C(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        mv0Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue2 = ((Integer) list.get(i4)).intValue();
            i3 += mv0.i((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        mv0Var.D(i3);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            mv0Var.D((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    public static void x(int i, List list, yr2 yr2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mv0 mv0Var = (mv0) yr2Var.Y;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                mv0Var.E(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        mv0Var.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iJ += mv0.j((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        mv0Var.D(iJ);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            mv0Var.F((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    public static void y(int i, List list, yr2 yr2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mv0 mv0Var = (mv0) yr2Var.Y;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                mv0Var.C(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        mv0Var.B(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += mv0.i(((Integer) list.get(i4)).intValue());
        }
        mv0Var.D(i3);
        while (i2 < list.size()) {
            mv0Var.D(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void z(int i, List list, yr2 yr2Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        mv0 mv0Var = (mv0) yr2Var.Y;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                mv0Var.E(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        mv0Var.B(i, 2);
        int iJ = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iJ += mv0.j(((Long) list.get(i3)).longValue());
        }
        mv0Var.D(iJ);
        while (i2 < list.size()) {
            mv0Var.F(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static Object j(Object obj, int i, cg3 cg3Var, Object obj2, gn8 gn8Var) {
        return obj2;
    }
}
