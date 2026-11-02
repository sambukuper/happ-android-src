package defpackage;

import io.sentry.c2;
import java.lang.annotation.Annotation;
import java.util.Objects;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class v22 extends kb8 implements p51 {
    public final zl f0;
    public final Boolean g0;
    public final zl h0;

    public v22(zl zlVar, Boolean bool, zl zlVar2) {
        super((Class) zlVar.Y, (byte) 2);
        this.f0 = zlVar;
        this.g0 = bool;
        this.h0 = zlVar2;
    }

    public static Boolean r(Class cls, no3 no3Var, boolean z, Boolean bool) {
        mo3 mo3Var = no3Var.Y;
        if (mo3Var == null || mo3Var == mo3.k0 || mo3Var == mo3.h0) {
            return bool;
        }
        if (mo3Var == mo3.g0 || mo3Var == mo3.l0) {
            return Boolean.FALSE;
        }
        if (mo3Var.a() || mo3Var == mo3.i0) {
            return Boolean.TRUE;
        }
        String name = cls.getName();
        String str = z ? "class" : "property";
        StringBuilder sb = new StringBuilder("Unsupported serialization shape (");
        sb.append(mo3Var);
        sb.append(") for Enum ");
        sb.append(name);
        sb.append(", not supported as ");
        throw new IllegalArgumentException(oi0.p(sb, str, " annotation"));
    }

    public static v22 s(Class cls, l37 l37Var, z20 z20Var, no3 no3Var) {
        al alVar = z20Var.e;
        zl zlVarF = zl.f(l37Var, alVar);
        t(l37Var, alVar);
        m85 m85VarD = l37Var.d();
        boolean zE = l37Var.e(r22.WRITE_ENUMS_TO_LOWERCASE);
        Class cls2 = alVar.C0;
        Annotation[] annotationArr = it0.a;
        Enum[] enumArr = (Enum[]) (cls2.getSuperclass() != Enum.class ? cls2.getSuperclass() : cls2).getEnumConstants();
        if (enumArr == null) {
            bt.q("No enum constants for class ".concat(cls2.getName()));
            return null;
        }
        String[] strArr = new String[enumArr.length];
        m85VarD.f(alVar, enumArr, strArr);
        r37[] r37VarArr = new r37[enumArr.length];
        for (int i = 0; i < enumArr.length; i++) {
            String string = enumArr[i].toString();
            if (string == null) {
                string = _UrlKt.FRAGMENT_ENCODE_SET;
            }
            String str = strArr[i];
            if (str != null) {
                string = str;
            } else if (zE) {
                string = string.toLowerCase();
            }
            r37VarArr[i] = new r37(string);
        }
        return new v22(zlVarF, r(cls, no3Var, true, null), new zl(cls2, r37VarArr));
    }

    public static void t(l37 l37Var, al alVar) {
        Class cls;
        Object objE = l37Var.d().e(alVar);
        boolean zF = l37Var.f(xp4.q0);
        if (objE == null || (cls = (Class) objE) == t22.class) {
            return;
        }
        if (!t22.class.isAssignableFrom(cls)) {
            bt.q(pc6.p("Problem with AnnotationIntrospector returned Class ", it0.e(cls), "; expected `Class<EnumNamingStrategy>`"));
        } else {
            if (it0.g(cls, zF) == null) {
                return;
            }
            c2.m();
        }
    }

    @Override // defpackage.p51
    public final ar3 a(t37 t37Var, d50 d50Var) {
        Class cls = this.X;
        no3 no3VarK = lj7.k(t37Var, d50Var, cls);
        if (no3VarK != null) {
            Boolean bool = this.g0;
            Boolean boolR = r(cls, no3VarK, false, bool);
            if (!Objects.equals(boolR, bool)) {
                return new v22(this.f0, boolR, this.h0);
            }
        }
        return this;
    }

    @Override // defpackage.kb8, defpackage.ar3
    public final void e(Object obj, ro3 ro3Var, t37 t37Var) {
        boolean zJ;
        Enum r3 = (Enum) obj;
        Boolean bool = this.g0;
        if (bool != null) {
            zJ = bool.booleanValue();
        } else {
            zJ = t37Var.X.j(n37.r0);
        }
        if (zJ) {
            ro3Var.c0(r3.ordinal());
            return;
        }
        if (t37Var.X.j(n37.q0)) {
            ro3Var.b1(((r37[]) this.h0.Z)[r3.ordinal()]);
        } else {
            ro3Var.b1(((r37[]) this.f0.Z)[r3.ordinal()]);
        }
    }
}
