package defpackage;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t1 implements tn3, rd1, f01 {
    public final ArrayList X = new ArrayList();
    public boolean Y;
    public final vm3 Z;
    public final String f0;
    public final mn3 g0;

    public t1(vm3 vm3Var, String str) {
        this.Z = vm3Var;
        this.f0 = str;
        this.g0 = vm3Var.a;
    }

    @Override // defpackage.rd1
    public final byte A() {
        return I(U());
    }

    @Override // defpackage.rd1
    public final short B() {
        return P(U());
    }

    @Override // defpackage.rd1
    public final float C() {
        return L(U());
    }

    @Override // defpackage.f01
    public final long D(e37 e37Var, int i) {
        e37Var.getClass();
        return O(S(e37Var, i));
    }

    @Override // defpackage.rd1
    public final double E() {
        return K(U());
    }

    public abstract ao3 F(String str);

    public final ao3 G() {
        ao3 ao3VarF;
        String str = (String) wv0.B0(this.X);
        return (str == null || (ao3VarF = F(str)) == null) ? T() : ao3VarF;
    }

    public final boolean H(Object obj) {
        Boolean bool;
        String str = (String) obj;
        str.getClass();
        ao3 ao3VarF = F(str);
        if (!(ao3VarF instanceof hq3)) {
            StringBuilder sb = new StringBuilder("Expected ");
            zb6 zb6Var = yb6.a;
            sb.append(zb6Var.b(hq3.class).E());
            sb.append(", but had ");
            sb.append(zb6Var.b(ao3VarF.getClass()).E());
            sb.append(" as the serialized body of boolean");
            throw new vn3(ys0.t(-1, sb.toString(), W(str), null, this.Z.a.h ? ys0.J(ao3VarF.toString(), -1).toString() : null));
        }
        hq3 hq3Var = (hq3) ao3VarF;
        try {
            sc3 sc3Var = co3.a;
            String strA = hq3Var.a();
            String[] strArr = xl7.a;
            strA.getClass();
            if (strA.equalsIgnoreCase("true")) {
                bool = Boolean.TRUE;
            } else {
                bool = strA.equalsIgnoreCase("false") ? Boolean.FALSE : null;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            X(hq3Var, "boolean", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(hq3Var, "boolean", str);
            throw null;
        }
    }

    public final byte I(Object obj) {
        String str = (String) obj;
        str.getClass();
        ao3 ao3VarF = F(str);
        if (!(ao3VarF instanceof hq3)) {
            StringBuilder sb = new StringBuilder("Expected ");
            zb6 zb6Var = yb6.a;
            sb.append(zb6Var.b(hq3.class).E());
            sb.append(", but had ");
            sb.append(zb6Var.b(ao3VarF.getClass()).E());
            sb.append(" as the serialized body of byte");
            throw new vn3(ys0.t(-1, sb.toString(), W(str), null, this.Z.a.h ? ys0.J(ao3VarF.toString(), -1).toString() : null));
        }
        hq3 hq3Var = (hq3) ao3VarF;
        try {
            long jB = co3.b(hq3Var);
            Byte bValueOf = (-128 > jB || jB > 127) ? null : Byte.valueOf((byte) jB);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            X(hq3Var, "byte", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(hq3Var, "byte", str);
            throw null;
        }
    }

    public final char J(Object obj) {
        String str = (String) obj;
        str.getClass();
        ao3 ao3VarF = F(str);
        if (!(ao3VarF instanceof hq3)) {
            StringBuilder sb = new StringBuilder("Expected ");
            zb6 zb6Var = yb6.a;
            sb.append(zb6Var.b(hq3.class).E());
            sb.append(", but had ");
            sb.append(zb6Var.b(ao3VarF.getClass()).E());
            sb.append(" as the serialized body of char");
            throw new vn3(ys0.t(-1, sb.toString(), W(str), null, this.Z.a.h ? ys0.J(ao3VarF.toString(), -1).toString() : null));
        }
        hq3 hq3Var = (hq3) ao3VarF;
        try {
            String strA = hq3Var.a();
            strA.getClass();
            int length = strA.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strA.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            X(hq3Var, "char", str);
            throw null;
        }
    }

    public final double K(Object obj) {
        String str = (String) obj;
        str.getClass();
        ao3 ao3VarF = F(str);
        boolean z = ao3VarF instanceof hq3;
        vm3 vm3Var = this.Z;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            zb6 zb6Var = yb6.a;
            sb.append(zb6Var.b(hq3.class).E());
            sb.append(", but had ");
            sb.append(zb6Var.b(ao3VarF.getClass()).E());
            sb.append(" as the serialized body of double");
            throw new vn3(ys0.t(-1, sb.toString(), W(str), null, vm3Var.a.h ? ys0.J(ao3VarF.toString(), -1).toString() : null));
        }
        hq3 hq3Var = (hq3) ao3VarF;
        try {
            sc3 sc3Var = co3.a;
            double d = Double.parseDouble(hq3Var.a());
            mn3 mn3Var = vm3Var.a;
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            throw new vn3(ys0.t(-1, ys0.N(Double.valueOf(d), str), null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", vm3Var.a.h ? ys0.J(G().toString(), -1).toString() : null));
        } catch (IllegalArgumentException unused) {
            X(hq3Var, "double", str);
            throw null;
        }
    }

    public final float L(Object obj) {
        String str = (String) obj;
        str.getClass();
        ao3 ao3VarF = F(str);
        boolean z = ao3VarF instanceof hq3;
        vm3 vm3Var = this.Z;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            zb6 zb6Var = yb6.a;
            sb.append(zb6Var.b(hq3.class).E());
            sb.append(", but had ");
            sb.append(zb6Var.b(ao3VarF.getClass()).E());
            sb.append(" as the serialized body of float");
            throw new vn3(ys0.t(-1, sb.toString(), W(str), null, vm3Var.a.h ? ys0.J(ao3VarF.toString(), -1).toString() : null));
        }
        hq3 hq3Var = (hq3) ao3VarF;
        try {
            sc3 sc3Var = co3.a;
            float f = Float.parseFloat(hq3Var.a());
            mn3 mn3Var = vm3Var.a;
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            throw new vn3(ys0.t(-1, ys0.N(Float.valueOf(f), str), null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", vm3Var.a.h ? ys0.J(G().toString(), -1).toString() : null));
        } catch (IllegalArgumentException unused) {
            X(hq3Var, "float", str);
            throw null;
        }
    }

    public final rd1 M(Object obj, e37 e37Var) {
        String str = (String) obj;
        str.getClass();
        e37Var.getClass();
        if (!pl7.a(e37Var)) {
            this.X.add(str);
            return this;
        }
        ao3 ao3VarF = F(str);
        String strA = e37Var.a();
        boolean z = ao3VarF instanceof hq3;
        vm3 vm3Var = this.Z;
        if (z) {
            return new un3(z68.f(vm3Var, ((hq3) ao3VarF).a()), vm3Var);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        zb6 zb6Var = yb6.a;
        sb.append(zb6Var.b(hq3.class).E());
        sb.append(", but had ");
        sb.append(zb6Var.b(ao3VarF.getClass()).E());
        throw new vn3(ys0.t(-1, oi0.p(sb, " as the serialized body of ", strA), W(str), null, vm3Var.a.h ? ys0.J(ao3VarF.toString(), -1).toString() : null));
    }

    public final int N(Object obj) {
        String str = (String) obj;
        str.getClass();
        ao3 ao3VarF = F(str);
        if (!(ao3VarF instanceof hq3)) {
            StringBuilder sb = new StringBuilder("Expected ");
            zb6 zb6Var = yb6.a;
            sb.append(zb6Var.b(hq3.class).E());
            sb.append(", but had ");
            sb.append(zb6Var.b(ao3VarF.getClass()).E());
            sb.append(" as the serialized body of int");
            throw new vn3(ys0.t(-1, sb.toString(), W(str), null, this.Z.a.h ? ys0.J(ao3VarF.toString(), -1).toString() : null));
        }
        hq3 hq3Var = (hq3) ao3VarF;
        try {
            long jB = co3.b(hq3Var);
            Integer numValueOf = (-2147483648L > jB || jB > 2147483647L) ? null : Integer.valueOf((int) jB);
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            X(hq3Var, "int", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(hq3Var, "int", str);
            throw null;
        }
    }

    public final long O(Object obj) {
        String str = (String) obj;
        str.getClass();
        ao3 ao3VarF = F(str);
        if (ao3VarF instanceof hq3) {
            hq3 hq3Var = (hq3) ao3VarF;
            try {
                return co3.b(hq3Var);
            } catch (IllegalArgumentException unused) {
                X(hq3Var, "long", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        zb6 zb6Var = yb6.a;
        sb.append(zb6Var.b(hq3.class).E());
        sb.append(", but had ");
        sb.append(zb6Var.b(ao3VarF.getClass()).E());
        sb.append(" as the serialized body of long");
        throw new vn3(ys0.t(-1, sb.toString(), W(str), null, this.Z.a.h ? ys0.J(ao3VarF.toString(), -1).toString() : null));
    }

    public final short P(Object obj) {
        String str = (String) obj;
        str.getClass();
        ao3 ao3VarF = F(str);
        if (!(ao3VarF instanceof hq3)) {
            StringBuilder sb = new StringBuilder("Expected ");
            zb6 zb6Var = yb6.a;
            sb.append(zb6Var.b(hq3.class).E());
            sb.append(", but had ");
            sb.append(zb6Var.b(ao3VarF.getClass()).E());
            sb.append(" as the serialized body of short");
            throw new vn3(ys0.t(-1, sb.toString(), W(str), null, this.Z.a.h ? ys0.J(ao3VarF.toString(), -1).toString() : null));
        }
        hq3 hq3Var = (hq3) ao3VarF;
        try {
            long jB = co3.b(hq3Var);
            Short shValueOf = (-32768 > jB || jB > 32767) ? null : Short.valueOf((short) jB);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            X(hq3Var, "short", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(hq3Var, "short", str);
            throw null;
        }
    }

    public final String Q(Object obj) {
        String str = (String) obj;
        str.getClass();
        ao3 ao3VarF = F(str);
        boolean z = ao3VarF instanceof hq3;
        vm3 vm3Var = this.Z;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            zb6 zb6Var = yb6.a;
            sb.append(zb6Var.b(hq3.class).E());
            sb.append(", but had ");
            sb.append(zb6Var.b(ao3VarF.getClass()).E());
            sb.append(" as the serialized body of string");
            throw new vn3(ys0.t(-1, sb.toString(), W(str), null, vm3Var.a.h ? ys0.J(ao3VarF.toString(), -1).toString() : null));
        }
        hq3 hq3Var = (hq3) ao3VarF;
        if (!(hq3Var instanceof kp3)) {
            throw new vn3(ys0.t(-1, pc6.p("Expected string value for a non-null key '", str, "', got null literal instead"), W(str), "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.", vm3Var.a.h ? ys0.J(G().toString(), -1).toString() : null));
        }
        kp3 kp3Var = (kp3) hq3Var;
        if (kp3Var.X || vm3Var.a.b) {
            return kp3Var.Y;
        }
        throw new vn3(ys0.t(-1, pc6.p("String literal for value of key '", str, "' should be quoted"), W(str), "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", vm3Var.a.h ? ys0.J(G().toString(), -1).toString() : null));
    }

    public String R(e37 e37Var, int i) {
        e37Var.getClass();
        return e37Var.f(i);
    }

    public final String S(e37 e37Var, int i) {
        e37Var.getClass();
        String strR = R(e37Var, i);
        strR.getClass();
        return strR;
    }

    public abstract ao3 T();

    public final Object U() {
        ArrayList arrayList = this.X;
        Object objRemove = arrayList.remove(arrayList.size() - 1);
        this.Y = true;
        return objRemove;
    }

    public final String V() {
        ArrayList arrayList = this.X;
        return arrayList.isEmpty() ? "$" : wv0.y0(arrayList, ".", "$.", null, null, 60);
    }

    public final String W(String str) {
        str.getClass();
        return V() + '.' + str;
    }

    public final void X(hq3 hq3Var, String str, String str2) {
        throw new vn3(ys0.t(-1, "Failed to parse literal '" + hq3Var + "' as " + (mm7.Z(str, false, "i") ? "an " : "a ").concat(str) + " value", W(str2), null, this.Z.a.h ? ys0.J(G().toString(), -1).toString() : null));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0092  */
    @Override // defpackage.rd1
    public final Object a(ow3 ow3Var) {
        String strA;
        ow3Var.getClass();
        if (!(ow3Var instanceof m2)) {
            return ow3Var.b(this);
        }
        vm3 vm3Var = this.Z;
        mn3 mn3Var = vm3Var.a;
        m2 m2Var = (m2) ow3Var;
        String strR = km4.r(vm3Var, m2Var.d());
        ao3 ao3VarG = G();
        String strA2 = m2Var.d().a();
        if (!(ao3VarG instanceof aq3)) {
            StringBuilder sb = new StringBuilder("Expected ");
            zb6 zb6Var = yb6.a;
            sb.append(zb6Var.b(aq3.class).E());
            sb.append(", but had ");
            sb.append(zb6Var.b(ao3VarG.getClass()).E());
            throw new vn3(ys0.t(-1, oi0.p(sb, " as the serialized body of ", strA2), V(), null, vm3Var.a.h ? ys0.J(ao3VarG.toString(), -1).toString() : null));
        }
        aq3 aq3Var = (aq3) ao3VarG;
        ao3 ao3Var = (ao3) aq3Var.get(strR);
        if (ao3Var != null) {
            hq3 hq3VarA = co3.a(ao3Var);
            if (hq3VarA instanceof wp3) {
                strA = null;
            } else {
                strA = hq3VarA.a();
            }
        } else {
            strA = null;
        }
        try {
            ow3 ow3VarU = nr4.u((m2) ow3Var, this, strA);
            vm3Var.getClass();
            strR.getClass();
            return new ir3(vm3Var, aq3Var, strR, ow3VarU.d()).a(ow3VarU);
        } catch (m37 e) {
            String message = e.getMessage();
            message.getClass();
            throw new vn3(ys0.t(-1, message, null, null, vm3Var.a.h ? ys0.J(aq3Var.toString(), -1).toString() : null));
        }
    }

    @Override // defpackage.f01
    public final rd1 b(xt5 xt5Var, int i) {
        return M(S(xt5Var, i), xt5Var.h(i));
    }

    @Override // defpackage.rd1
    public final boolean c() {
        return H(U());
    }

    @Override // defpackage.rd1
    public final char d() {
        return J(U());
    }

    @Override // defpackage.f01
    public final double f(xt5 xt5Var, int i) {
        return K(S(xt5Var, i));
    }

    @Override // defpackage.f01
    public final char g(xt5 xt5Var, int i) {
        return J(S(xt5Var, i));
    }

    @Override // defpackage.f01
    public final float h(xt5 xt5Var, int i) {
        return L(S(xt5Var, i));
    }

    @Override // defpackage.tn3
    public final ao3 i() {
        return G();
    }

    @Override // defpackage.f01
    public final byte j(xt5 xt5Var, int i) {
        return I(S(xt5Var, i));
    }

    @Override // defpackage.f01
    public final String k(e37 e37Var, int i) {
        e37Var.getClass();
        return Q(S(e37Var, i));
    }

    @Override // defpackage.rd1
    public final int l() {
        return N(U());
    }

    @Override // defpackage.f01
    public final short m(xt5 xt5Var, int i) {
        return P(S(xt5Var, i));
    }

    public void n(e37 e37Var) {
        e37Var.getClass();
    }

    @Override // defpackage.f01
    public final g55 o() {
        return this.Z.b;
    }

    @Override // defpackage.rd1
    public final rd1 p(e37 e37Var) {
        e37Var.getClass();
        if (wv0.B0(this.X) != null) {
            return M(U(), e37Var);
        }
        return new jq3(this.Z, T(), this.f0).p(e37Var);
    }

    @Override // defpackage.f01
    public final Object q(e37 e37Var, int i, ow3 ow3Var, Object obj) {
        e37Var.getClass();
        ow3Var.getClass();
        this.X.add(S(e37Var, i));
        ow3Var.getClass();
        Object objA = a(ow3Var);
        if (!this.Y) {
            U();
        }
        this.Y = false;
        return objA;
    }

    @Override // defpackage.f01
    public final int r(e37 e37Var, int i) {
        e37Var.getClass();
        return N(S(e37Var, i));
    }

    @Override // defpackage.rd1
    public final String s() {
        return Q(U());
    }

    @Override // defpackage.rd1
    public f01 t(e37 e37Var) {
        e37Var.getClass();
        ao3 ao3VarG = G();
        nr4 nr4VarR = e37Var.r();
        boolean zF = dh3.f(nr4VarR, pm7.N);
        vm3 vm3Var = this.Z;
        if (zF || (nr4VarR instanceof qq5)) {
            String strA = e37Var.a();
            if (ao3VarG instanceof dn3) {
                return new jr3(vm3Var, (dn3) ao3VarG);
            }
            StringBuilder sb = new StringBuilder("Expected ");
            zb6 zb6Var = yb6.a;
            sb.append(zb6Var.b(dn3.class).E());
            sb.append(", but had ");
            sb.append(zb6Var.b(ao3VarG.getClass()).E());
            throw new vn3(ys0.t(-1, oi0.p(sb, " as the serialized body of ", strA), V(), null, vm3Var.a.h ? ys0.J(ao3VarG.toString(), -1).toString() : null));
        }
        if (!dh3.f(nr4VarR, pm7.O)) {
            String strA2 = e37Var.a();
            if (ao3VarG instanceof aq3) {
                return new ir3(vm3Var, (aq3) ao3VarG, this.f0, 8);
            }
            StringBuilder sb2 = new StringBuilder("Expected ");
            zb6 zb6Var2 = yb6.a;
            sb2.append(zb6Var2.b(aq3.class).E());
            sb2.append(", but had ");
            sb2.append(zb6Var2.b(ao3VarG.getClass()).E());
            throw new vn3(ys0.t(-1, oi0.p(sb2, " as the serialized body of ", strA2), V(), null, vm3Var.a.h ? ys0.J(ao3VarG.toString(), -1).toString() : null));
        }
        e37 e37VarA = d28.a(e37Var.h(0), vm3Var.b);
        nr4 nr4VarR2 = e37VarA.r();
        if (!(nr4VarR2 instanceof zt5) && !dh3.f(nr4VarR2, j37.M)) {
            throw ys0.i(e37VarA);
        }
        String strA3 = e37Var.a();
        if (ao3VarG instanceof aq3) {
            return new kr3(vm3Var, (aq3) ao3VarG);
        }
        StringBuilder sb3 = new StringBuilder("Expected ");
        zb6 zb6Var3 = yb6.a;
        sb3.append(zb6Var3.b(aq3.class).E());
        sb3.append(", but had ");
        sb3.append(zb6Var3.b(ao3VarG.getClass()).E());
        throw new vn3(ys0.t(-1, oi0.p(sb3, " as the serialized body of ", strA3), V(), null, vm3Var.a.h ? ys0.J(ao3VarG.toString(), -1).toString() : null));
    }

    @Override // defpackage.rd1
    public final int u(e37 e37Var) {
        e37Var.getClass();
        String str = (String) U();
        str.getClass();
        ao3 ao3VarF = F(str);
        String strA = e37Var.a();
        boolean z = ao3VarF instanceof hq3;
        vm3 vm3Var = this.Z;
        if (z) {
            return sp3.b(e37Var, vm3Var, ((hq3) ao3VarF).a(), _UrlKt.FRAGMENT_ENCODE_SET);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        zb6 zb6Var = yb6.a;
        sb.append(zb6Var.b(hq3.class).E());
        sb.append(", but had ");
        sb.append(zb6Var.b(ao3VarF.getClass()).E());
        throw new vn3(ys0.t(-1, oi0.p(sb, " as the serialized body of ", strA), W(str), null, vm3Var.a.h ? ys0.J(ao3VarF.toString(), -1).toString() : null));
    }

    @Override // defpackage.rd1
    public final long v() {
        return O(U());
    }

    @Override // defpackage.rd1
    public boolean w() {
        return !(G() instanceof wp3);
    }

    @Override // defpackage.f01
    public final Object x(e37 e37Var, int i, ow3 ow3Var, Object obj) {
        e37Var.getClass();
        ow3Var.getClass();
        this.X.add(S(e37Var, i));
        Object objA = (ow3Var.d().c() || w()) ? a(ow3Var) : null;
        if (!this.Y) {
            U();
        }
        this.Y = false;
        return objA;
    }

    @Override // defpackage.tn3
    public final vm3 y() {
        return this.Z;
    }

    @Override // defpackage.f01
    public final boolean z(e37 e37Var, int i) {
        e37Var.getClass();
        return H(S(e37Var, i));
    }
}
