package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jk3 extends lb6 implements jw3, pb6 {
    public static final Method i0;
    public final ev3 Y;
    public final l22 Z;
    public final g44 f0;
    public final ik3 g0;
    public final g44 h0;

    static {
        fk2 fk2Var = ms8.a;
        Method[] declaredMethods = ia6.d(dn8.class).loadClass("kotlin.enums.EnumEntriesKt").getDeclaredMethods();
        declaredMethods.getClass();
        Method method = null;
        boolean z = false;
        for (Method method2 : declaredMethods) {
            if (dh3.f(method2.getName(), "enumEntries")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                parameterTypes.getClass();
                Class cls = (Class) eu.E0(parameterTypes);
                if (cls != null && cls.isArray() && dh3.f(cls.getComponentType(), Enum.class)) {
                    if (z) {
                        bt.q("Array contains more than one matching element.");
                        return;
                    } else {
                        z = true;
                        method = method2;
                    }
                }
            }
        }
        if (!z) {
            em7.g("Array contains no element matching the predicate.");
        } else {
            method.getClass();
            i0 = method;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk3(ev3 ev3Var) throws IllegalAccessException, InvocationTargetException {
        super(yu3.k);
        ev3Var.getClass();
        this.Y = ev3Var;
        Object objInvoke = i0.invoke(null, zc1.M(ev3Var).getEnumConstants());
        objInvoke.getClass();
        this.Z = (l22) objInvoke;
        gk3 gk3Var = new gk3(this, (byte) 0);
        w74 w74Var = w74.X;
        this.f0 = x97.P(w74Var, gk3Var);
        this.g0 = new ik3(this);
        this.h0 = x97.P(w74Var, new gk3(this, (byte) 1));
    }

    @Override // defpackage.kb6
    public final kb6 A(ov3 ov3Var, yu3 yu3Var) {
        ov3Var.getClass();
        yu3Var.getClass();
        return new jk3(this.Y);
    }

    @Override // defpackage.kb6
    public final ov3 D() {
        return this.Y;
    }

    @Override // defpackage.kb6
    public final Object J() {
        return null;
    }

    @Override // defpackage.wu3
    public final List Q() {
        return d02.X;
    }

    @Override // defpackage.kb6
    public final boolean R() {
        return false;
    }

    @Override // defpackage.pb6
    public final String a() {
        return "getEntries()Lkotlin/enums/EnumEntries;";
    }

    @Override // defpackage.nw3
    public final iw3 b() {
        return (iw3) this.h0.getValue();
    }

    @Override // defpackage.xu3
    public final zw3 e() {
        return zw3.X;
    }

    public final boolean equals(Object obj) {
        pb6 pb6VarC = ms8.c(obj);
        return pb6VarC != null && dh3.f(this.Y, pb6VarC.D()) && "entries".equals(pb6VarC.getName()) && "getEntries()Lkotlin/enums/EnumEntries;".equals(pb6VarC.a()) && dh3.f(null, pb6VarC.J());
    }

    @Override // defpackage.xu3
    public final List g() {
        return d02.X;
    }

    @Override // defpackage.xu3
    public final String getName() {
        return "entries";
    }

    @Override // defpackage.xu3, defpackage.sw3
    public final List getTypeParameters() {
        return d02.X;
    }

    @Override // defpackage.xu3, defpackage.pv3
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return (((this.Y.hashCode() * 31) - 1591573360) * 31) - 2087422618;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        return this.Z;
    }

    @Override // defpackage.xu3
    public final pw3 j() {
        return (pw3) this.f0.getValue();
    }

    @Override // defpackage.lb6, defpackage.kb6
    public final List l() {
        return d02.X;
    }

    @Override // defpackage.kb6
    public final ex4 m() {
        return ex4.FINAL;
    }

    @Override // defpackage.kb6
    public final wd0 r() {
        return this.g0;
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        lh4.L0(sb, this);
        sb.append(this instanceof zv3 ? "var " : "val ");
        lh4.N0(sb, this);
        lh4.M0(sb, "entries");
        sb.append(": ");
        sb.append(lh4.W0(j(), false));
        return sb.toString();
    }

    @Override // defpackage.h04
    public final GenericDeclaration v() {
        return zc1.G(this.Y, "getEntries()Lkotlin/enums/EnumEntries;");
    }

    @Override // defpackage.pb6
    public final Field w() {
        return null;
    }

    @Override // defpackage.kb6
    public final wd0 y() {
        return null;
    }
}
