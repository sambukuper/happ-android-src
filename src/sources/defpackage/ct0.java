package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ct0 implements zu3, fs0, h04 {
    public static final Map Y;
    public final Class X;

    static {
        List listL = i21.L(dn2.class, gn2.class, rn2.class, sn2.class, tn2.class, un2.class, vn2.class, wn2.class, xn2.class, yn2.class, en2.class, fn2.class, vo2.class, hn2.class, in2.class, jn2.class, kn2.class, ln2.class, mn2.class, nn2.class, pn2.class, qn2.class, vo2.class);
        ArrayList arrayList = new ArrayList(xv0.Z(listL, 10));
        int i = 0;
        for (Object obj : listL) {
            int i2 = i + 1;
            if (i < 0) {
                i21.X();
                throw null;
            }
            arrayList.add(new qg5((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        Y = zp4.P(arrayList);
    }

    public ct0(Class cls) {
        cls.getClass();
        this.X = cls;
    }

    public static void f() {
        throw new q14();
    }

    @Override // defpackage.zu3
    public final boolean C() {
        f();
        throw null;
    }

    @Override // defpackage.zu3
    public final String E() {
        String strB0;
        Class cls = this.X;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strB1 = mb6.b0(cls.getName());
                return strB1 == null ? cls.getSimpleName() : strB1;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strB0 = mb6.b0(componentType.getName())) != null) {
                strConcat = strB0.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return fm7.J0(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int iL0 = fm7.l0(simpleName, '$', 0, 6);
            return iL0 == -1 ? simpleName : simpleName.substring(iL0 + 1, simpleName.length());
        }
        return fm7.J0(simpleName, enclosingConstructor.getName() + '$');
    }

    @Override // defpackage.zu3
    public final boolean I() {
        f();
        throw null;
    }

    @Override // defpackage.zu3
    public final boolean O(Object obj) {
        Class clsN = this.X;
        clsN.getClass();
        Map map = Y;
        map.getClass();
        Integer num = (Integer) map.get(clsN);
        if (num != null) {
            return ci8.B(num.intValue(), obj);
        }
        if (clsN.isPrimitive()) {
            clsN = zc1.N(yb6.a.b(clsN));
        }
        return clsN.isInstance(obj);
    }

    @Override // defpackage.zu3
    public final Collection P() {
        f();
        throw null;
    }

    @Override // defpackage.wu3
    public final List Q() {
        f();
        throw null;
    }

    @Override // defpackage.zu3
    public final List c() {
        f();
        throw null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ct0) && zc1.N(this).equals(zc1.N((zu3) obj));
    }

    @Override // defpackage.zu3
    public final List getTypeParameters() {
        f();
        throw null;
    }

    @Override // defpackage.zu3
    public final int hashCode() {
        return zc1.N(this).hashCode();
    }

    @Override // defpackage.zu3
    public final boolean n() {
        f();
        throw null;
    }

    @Override // defpackage.zu3
    public final String p() {
        String strT;
        Class cls = this.X;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strT2 = mb6.t(cls.getName());
            return strT2 == null ? cls.getCanonicalName() : strT2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strT = mb6.t(componentType.getName())) != null) {
            strConcat = strT.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    @Override // defpackage.fs0
    public final Class t() {
        return this.X;
    }

    public final String toString() {
        return this.X.toString() + " (Kotlin reflection is not available)";
    }

    @Override // defpackage.zu3
    public final Collection u() {
        f();
        throw null;
    }

    @Override // defpackage.h04
    public final GenericDeclaration v() {
        return this.X;
    }
}
