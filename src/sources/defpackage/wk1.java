package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.internal.url._UrlKt;
import org.conscrypt.metrics.ConscryptStatsLog;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wk1 implements yk1 {
    public static final wk1 c;
    public static final wk1 d;
    public static final wk1 e;
    public final zk1 a;
    public final vz7 b = new vz7(new f3(this, 15));

    static {
        zk1 zk1Var = new zk1();
        m02 m02Var = m02.X;
        zk1Var.b(m02Var);
        zk1Var.a = true;
        new wk1(zk1Var);
        zk1 zk1Var2 = new zk1();
        zk1Var2.c(false);
        zk1Var2.a = true;
        new wk1(zk1Var2);
        zk1 zk1Var3 = new zk1();
        zk1Var3.c(false);
        zk1Var3.b(m02Var);
        zk1Var3.a = true;
        new wk1(zk1Var3);
        zk1 zk1Var4 = new zk1();
        zk1Var4.c(false);
        zk1Var4.b(m02Var);
        zk1Var4.e(true);
        zk1Var4.a = true;
        new wk1(zk1Var4);
        zk1 zk1Var5 = new zk1();
        zk1Var5.b(m02Var);
        qt0 qt0Var = qt0.c;
        zk1Var5.j(qt0Var);
        ah5 ah5Var = ah5.Y;
        zk1Var5.i(ah5Var);
        zk1Var5.a = true;
        new wk1(zk1Var5);
        zk1 zk1Var6 = new zk1();
        zk1Var6.c(false);
        zk1Var6.b(m02Var);
        zk1Var6.j(qt0Var);
        zk1Var6.k(true);
        zk1Var6.i(ah5.Z);
        zk1Var6.h(true);
        zk1Var6.g(true);
        zk1Var6.e(true);
        zk1Var6.a(true);
        zk1Var6.a = true;
        new wk1(zk1Var6);
        zk1 zk1Var7 = new zk1();
        zk1Var7.b(xk1.Y);
        zk1Var7.a = true;
        c = new wk1(zk1Var7);
        zk1 zk1Var8 = new zk1();
        zk1Var8.b(xk1.Z);
        zk1Var8.a = true;
        new wk1(zk1Var8);
        zk1 zk1Var9 = new zk1();
        zk1Var9.j(qt0Var);
        zk1Var9.i(ah5Var);
        zk1Var9.a = true;
        d = new wk1(zk1Var9);
        zk1 zk1Var10 = new zk1();
        zk1Var10.f(true);
        zk1Var10.j(qt0.b);
        zk1Var10.b(xk1.Z);
        zk1Var10.a = true;
        e = new wk1(zk1Var10);
        zk1 zk1Var11 = new zk1();
        zk1Var11.d(ae6.Y);
        zk1Var11.b(xk1.Z);
        zk1Var11.a = true;
        new wk1(zk1Var11);
    }

    public wk1(zk1 zk1Var) {
        this.a = zk1Var;
    }

    public static void O(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    public static boolean a0(t14 t14Var) {
        if (!w79.F(t14Var)) {
            return false;
        }
        List listL0 = t14Var.l0();
        if (listL0 != null && listL0.isEmpty()) {
            return true;
        }
        Iterator it = listL0.iterator();
        while (it.hasNext()) {
            if (((ni8) it.next()).c()) {
                return false;
            }
        }
        return true;
    }

    public static fx4 m(ts4 ts4Var) {
        boolean z = ts4Var instanceof sx4;
        fx4 fx4Var = fx4.g0;
        us0 us0Var = us0.Y;
        fx4 fx4Var2 = fx4.Y;
        if (z) {
            return ((sx4) ts4Var).g0() == us0Var ? fx4Var : fx4Var2;
        }
        ed1 ed1VarP = ts4Var.p();
        sx4 sx4Var = ed1VarP instanceof sx4 ? (sx4) ed1VarP : null;
        if (sx4Var == null || !(ts4Var instanceof ld0)) {
            return fx4Var2;
        }
        ld0 ld0Var = (ld0) ts4Var;
        Collection collectionQ = ld0Var.q();
        collectionQ.getClass();
        boolean zIsEmpty = collectionQ.isEmpty();
        fx4 fx4Var3 = fx4.f0;
        if (!zIsEmpty && sx4Var.m() != fx4Var2) {
            return fx4Var3;
        }
        if (sx4Var.g0() != us0Var || dh3.f(ld0Var.e(), gl1.a)) {
            return fx4Var2;
        }
        return ld0Var.m() == fx4Var ? fx4Var : fx4Var3;
    }

    public final void A(ld0 ld0Var, StringBuilder sb) {
        zk1 zk1Var = this.a;
        if (zk1Var.u().contains(xk1.k0) && zk1Var.D() && ld0Var.r() != 1) {
            sb.append("/*");
            sb.append(i21.Y(p61.A(ld0Var.r())));
            sb.append("*/ ");
        }
    }

    public final void B(ts4 ts4Var, StringBuilder sb) {
        E(sb, ts4Var.k(), "external");
        zk1 zk1Var = this.a;
        boolean z = false;
        E(sb, zk1Var.u().contains(xk1.n0) && ts4Var.C(), "expect");
        if (zk1Var.u().contains(xk1.o0) && ts4Var.j0()) {
            z = true;
        }
        E(sb, z, "actual");
    }

    public final void C(fx4 fx4Var, StringBuilder sb, fx4 fx4Var2) {
        zk1 zk1Var = this.a;
        mj0 mj0Var = zk1Var.p;
        nw3 nw3Var = zk1.Z[14];
        mj0Var.getClass();
        nw3Var.getClass();
        if (((Boolean) mj0Var.Y).booleanValue() || fx4Var != fx4Var2) {
            E(sb, zk1Var.u().contains(xk1.g0), i21.Y(fx4Var.name()));
        }
    }

    public final void D(ld0 ld0Var, StringBuilder sb) {
        if (bl1.q(ld0Var) && ld0Var.m() == fx4.Y) {
            return;
        }
        if (this.a.v() == ff5.X && ld0Var.m() == fx4.f0 && !ld0Var.q().isEmpty()) {
            return;
        }
        fx4 fx4VarM = ld0Var.m();
        fx4VarM.getClass();
        C(fx4VarM, sb, m(ld0Var));
    }

    public final void E(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(z(str));
            sb.append(" ");
        }
    }

    public final String F(v15 v15Var, boolean z) {
        String strL = l(pu.K(v15Var));
        zk1 zk1Var = this.a;
        return (zk1Var.n() && zk1Var.B() == ae6.Y && z) ? pc6.p("<b>", strL, "</b>") : strL;
    }

    public final void G(ed1 ed1Var, StringBuilder sb, boolean z) {
        v15 name = ed1Var.getName();
        name.getClass();
        sb.append(F(name, z));
    }

    public final void H(StringBuilder sb, t14 t14Var) throws IOException {
        mo8 mo8VarQ0 = t14Var.q0();
        g gVar = mo8VarQ0 instanceof g ? (g) mo8VarQ0 : null;
        if (gVar == null) {
            I(sb, t14Var);
            return;
        }
        aa7 aa7Var = gVar.Z;
        aa7 aa7Var2 = gVar.Y;
        zk1 zk1Var = this.a;
        mj0 mj0Var = zk1Var.R;
        nw3[] nw3VarArr = zk1.Z;
        nw3 nw3Var = nw3VarArr[42];
        mj0Var.getClass();
        nw3Var.getClass();
        boolean zBooleanValue = ((Boolean) mj0Var.Y).booleanValue();
        yd6 yd6Var = ae6.Y;
        if (zBooleanValue) {
            I(sb, aa7Var2);
            mj0 mj0Var2 = zk1Var.S;
            nw3 nw3Var2 = nw3VarArr[43];
            mj0Var2.getClass();
            nw3Var2.getClass();
            if (((Boolean) mj0Var2.Y).booleanValue()) {
                if (zk1Var.B() == yd6Var) {
                    sb.append("<font color=\"808080\"><i>");
                }
                sb.append(" /* ");
                sb.append("from: ");
                I(sb, aa7Var);
                sb.append(" */");
                if (zk1Var.B() == yd6Var) {
                    sb.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        I(sb, aa7Var);
        mj0 mj0Var3 = zk1Var.Q;
        nw3 nw3Var3 = nw3VarArr[41];
        mj0Var3.getClass();
        nw3Var3.getClass();
        if (((Boolean) mj0Var3.Y).booleanValue()) {
            if (zk1Var.B() == yd6Var) {
                sb.append("<font color=\"808080\"><i>");
            }
            sb.append(" /* ");
            sb.append("= ");
            I(sb, aa7Var2);
            sb.append(" */");
            if (zk1Var.B() == yd6Var) {
                sb.append("</i></font>");
            }
        }
    }

    public final void I(StringBuilder sb, t14 t14Var) throws IOException {
        v15 v15VarU;
        String strL;
        zk1 zk1Var = this.a;
        if ((t14Var instanceof z74) && zk1Var.p()) {
            te4 te4Var = ((z74) t14Var).f0;
            if (te4Var.Z == ue4.X || te4Var.Z == ue4.Y) {
                sb.append("<Not computed yet>");
                return;
            }
        }
        mo8 mo8VarQ0 = t14Var.q0();
        if (mo8VarQ0 instanceof ce2) {
            sb.append(((ce2) mo8VarQ0).v0(this, this));
            return;
        }
        if (!(mo8VarQ0 instanceof aa7)) {
            b61.c();
            return;
        }
        aa7 aa7Var = (aa7) mo8VarQ0;
        if (aa7Var.equals(cj8.b) || aa7Var.n0() == cj8.a.Y) {
            sb.append("???");
            return;
        }
        lh8 lh8VarN0 = aa7Var.n0();
        byte b = 0;
        if ((lh8VarN0 instanceof r32) && ((r32) lh8VarN0).X == s32.UNINFERRED_TYPE_VARIABLE) {
            mj0 mj0Var = zk1Var.t;
            nw3 nw3Var = zk1.Z[18];
            mj0Var.getClass();
            nw3Var.getClass();
            if (!((Boolean) mj0Var.Y).booleanValue()) {
                sb.append("???");
                return;
            }
            lh8 lh8VarN1 = aa7Var.n0();
            lh8VarN1.getClass();
            sb.append(v(((r32) lh8VarN1).Y[0]));
            return;
        }
        if (vr3.J(aa7Var)) {
            u(sb, aa7Var);
            return;
        }
        if (!a0(aa7Var)) {
            u(sb, aa7Var);
            return;
        }
        int length = sb.length();
        ((wk1) this.b.getValue()).p(sb, aa7Var, null);
        boolean z = sb.length() != length;
        t14 t14VarA = w79.A(aa7Var);
        List listW = w79.w(aa7Var);
        boolean zI = w79.I(aa7Var);
        boolean zO0 = aa7Var.o0();
        boolean z2 = zO0 || (z && t14VarA != null);
        if (z2) {
            if (zI) {
                sb.insert(length, '(');
            } else {
                if (z) {
                    km4.a0(fm7.p0(sb));
                    if (sb.charAt(sb.length() - 2) != ')') {
                        sb.insert(sb.length() - 1, "()");
                    }
                }
                sb.append("(");
            }
        }
        E(sb, zI, "suspend");
        if (!listW.isEmpty()) {
            sb.append("context(");
            Iterator it = listW.subList(0, listW.size() - 1).iterator();
            while (it.hasNext()) {
                H(sb, (t14) it.next());
                sb.append(", ");
            }
            H(sb, (t14) wv0.A0(listW));
            sb.append(") ");
        }
        if (t14VarA != null) {
            boolean z3 = (a0(t14VarA) && !t14VarA.o0()) || w79.I(t14VarA) || !t14VarA.getAnnotations().isEmpty() || (t14VarA instanceof hh1);
            if (z3) {
                sb.append("(");
            }
            H(sb, t14VarA);
            if (z3) {
                sb.append(")");
            }
            sb.append(".");
        }
        sb.append("(");
        if (!w79.F(aa7Var) || aa7Var.getAnnotations().p(tg7.p) == null || aa7Var.l0().size() > 1) {
            int i = 0;
            for (ni8 ni8Var : w79.C(aa7Var)) {
                int i2 = i + 1;
                if (i > 0) {
                    sb.append(", ");
                }
                mj0 mj0Var2 = zk1Var.U;
                nw3 nw3Var2 = zk1.Z[45];
                mj0Var2.getClass();
                nw3Var2.getClass();
                if (((Boolean) mj0Var2.Y).booleanValue()) {
                    t14 t14VarB = ni8Var.b();
                    t14VarB.getClass();
                    v15VarU = w79.u(t14VarB);
                } else {
                    v15VarU = null;
                }
                if (v15VarU != null) {
                    sb.append(F(v15VarU, false));
                    sb.append(": ");
                }
                ni8Var.getClass();
                StringBuilder sb2 = new StringBuilder();
                wv0.x0(i21.K(ni8Var), sb2, ", ", null, null, new uk1(this, b), 60);
                sb.append(sb2.toString());
                i = i2;
            }
        } else {
            sb.append("???");
        }
        sb.append(") ");
        int iOrdinal = zk1Var.B().ordinal();
        if (iOrdinal == 0) {
            strL = l("->");
        } else {
            if (iOrdinal != 1) {
                b61.c();
                return;
            }
            strL = "&rarr;";
        }
        sb.append(strL);
        sb.append(" ");
        w79.F(aa7Var);
        t14 t14VarB2 = ((ni8) wv0.A0(aa7Var.l0())).b();
        t14VarB2.getClass();
        H(sb, t14VarB2);
        if (z2) {
            sb.append(")");
        }
        if (zO0) {
            sb.append("?");
        }
    }

    public final void J(ld0 ld0Var, StringBuilder sb) {
        zk1 zk1Var = this.a;
        if (!zk1Var.u().contains(xk1.h0) || ld0Var.q().isEmpty() || zk1Var.v() == ff5.Y) {
            return;
        }
        E(sb, true, "override");
        if (zk1Var.D()) {
            sb.append("/*");
            sb.append(ld0Var.q().size());
            sb.append("*/ ");
        }
    }

    public final void K(StringBuilder sb, f63 f63Var) {
        f63 f63Var2 = (f63) f63Var.f0;
        pt0 pt0Var = (pt0) f63Var.Y;
        if (f63Var2 != null) {
            K(sb, f63Var2);
            sb.append('.');
            v15 name = pt0Var.getName();
            name.getClass();
            sb.append(F(name, false));
        } else {
            lh8 lh8VarL = pt0Var.l();
            lh8VarL.getClass();
            sb.append(R(lh8VarL));
        }
        sb.append(Q((List) f63Var.Z));
    }

    public final void L(fx5 fx5Var, StringBuilder sb) {
        zk1 zk1Var = this.a;
        if (!zk1Var.A()) {
            if (!zk1Var.z()) {
                List listY = fx5Var.Y();
                listY.getClass();
                t(listY, sb);
                if (zk1Var.u().contains(xk1.i0)) {
                    p(sb, fx5Var, null);
                    y82 y82VarV = fx5Var.V();
                    if (y82VarV != null) {
                        p(sb, y82VarV, nm.FIELD);
                    }
                    y82 y82VarT = fx5Var.T();
                    if (y82VarT != null) {
                        p(sb, y82VarT, nm.PROPERTY_DELEGATE_FIELD);
                    }
                    if (zk1Var.w() == dx5.Y) {
                        hx5 hx5VarB = fx5Var.b();
                        if (hx5VarB != null) {
                            p(sb, hx5VarB, nm.PROPERTY_GETTER);
                        }
                        tx5 tx5VarD = fx5Var.d();
                        if (tx5VarD != null) {
                            p(sb, tx5VarD, nm.PROPERTY_SETTER);
                            List listL = tx5VarD.L();
                            listL.getClass();
                            ot8 ot8Var = (ot8) wv0.O0(listL);
                            ot8Var.getClass();
                            p(sb, ot8Var, nm.SETTER_PARAMETER);
                        }
                    }
                }
                fl1 fl1VarE = fx5Var.e();
                fl1VarE.getClass();
                Y(fl1VarE, sb);
                E(sb, zk1Var.u().contains(xk1.p0) && fx5Var.w(), "const");
                B(fx5Var, sb);
                D(fx5Var, sb);
                J(fx5Var, sb);
                E(sb, zk1Var.u().contains(xk1.q0) && fx5Var.Z(), "lateinit");
                A(fx5Var, sb);
            }
            V(fx5Var, sb, false);
            List typeParameters = fx5Var.getTypeParameters();
            typeParameters.getClass();
            U(sb, typeParameters, true);
            M(fx5Var, sb);
        }
        G(fx5Var, sb, true);
        sb.append(": ");
        t14 t14VarC = fx5Var.c();
        t14VarC.getClass();
        sb.append(P(t14VarC));
        N(fx5Var, sb);
        y(fx5Var, sb);
        List typeParameters2 = fx5Var.getTypeParameters();
        typeParameters2.getClass();
        Z(typeParameters2, sb);
    }

    public final void M(jd0 jd0Var, StringBuilder sb) {
        i44 i44VarS = jd0Var.S();
        if (i44VarS != null) {
            p(sb, i44VarS, nm.RECEIVER);
            t14 t14VarC = i44VarS.c();
            t14VarC.getClass();
            sb.append(x(t14VarC, false));
            sb.append(".");
        }
    }

    public final void N(jd0 jd0Var, StringBuilder sb) {
        i44 i44VarS;
        mj0 mj0Var = this.a.F;
        nw3 nw3Var = zk1.Z[30];
        mj0Var.getClass();
        nw3Var.getClass();
        if (((Boolean) mj0Var.Y).booleanValue() && (i44VarS = jd0Var.S()) != null) {
            sb.append(" on ");
            t14 t14VarC = i44VarS.c();
            t14VarC.getClass();
            sb.append(P(t14VarC));
        }
    }

    public final String P(t14 t14Var) {
        t14Var.getClass();
        StringBuilder sb = new StringBuilder();
        mj0 mj0Var = this.a.y;
        nw3 nw3Var = zk1.Z[23];
        mj0Var.getClass();
        nw3Var.getClass();
        H(sb, (t14) ((gn2) mj0Var.Y).B(t14Var));
        return sb.toString();
    }

    public final String Q(List list) throws IOException {
        list.getClass();
        if (list.isEmpty()) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(l("<"));
        wv0.x0(list, sb, ", ", null, null, new uk1(this, (byte) 0), 60);
        sb.append(l(">"));
        return sb.toString();
    }

    public final String R(lh8 lh8Var) {
        lh8Var.getClass();
        ot0 ot0VarX = lh8Var.x();
        if ((ot0VarX instanceof hi8) || (ot0VarX instanceof sx4) || (ot0VarX instanceof km1)) {
            ot0VarX.getClass();
            return u32.f(ot0VarX) ? ot0VarX.l().toString() : this.a.o().b(ot0VarX, this);
        }
        if (ot0VarX == null) {
            return lh8Var instanceof qg3 ? ((qg3) lh8Var).b(ag.D0) : lh8Var.toString();
        }
        kp5.q(ot0VarX.getClass(), "Unexpected classifier: ");
        return null;
    }

    public final void S(hi8 hi8Var, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(l("<"));
        }
        if (this.a.D()) {
            sb.append("/*");
            sb.append(hi8Var.getIndex());
            sb.append("*/ ");
        }
        E(sb, hi8Var.y(), "reified");
        String str = hi8Var.D().X;
        boolean z2 = true;
        E(sb, str.length() > 0, str);
        p(sb, hi8Var, null);
        G(hi8Var, sb, z);
        int size = hi8Var.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            t14 t14Var = (t14) hi8Var.getUpperBounds().iterator().next();
            if (t14Var == null) {
                zz3.a(ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_256_CBC_SHA);
                throw null;
            }
            if (!zz3.y(t14Var) || !t14Var.o0()) {
                sb.append(" : ");
                sb.append(P(t14Var));
            }
        } else if (z) {
            for (t14 t14Var2 : hi8Var.getUpperBounds()) {
                if (t14Var2 == null) {
                    zz3.a(ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_256_CBC_SHA);
                    throw null;
                }
                if (!zz3.y(t14Var2) || !t14Var2.o0()) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    sb.append(P(t14Var2));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(l(">"));
        }
    }

    public final void T(List list, StringBuilder sb) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            S((hi8) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    public final void U(StringBuilder sb, List list, boolean z) {
        if (this.a.E() || list.isEmpty()) {
            return;
        }
        sb.append(l("<"));
        T(list, sb);
        sb.append(l(">"));
        if (z) {
            sb.append(" ");
        }
    }

    public final void V(pt8 pt8Var, StringBuilder sb, boolean z) {
        if (z || !(pt8Var instanceof ot8)) {
            sb.append(z(pt8Var.R() ? "var" : "val"));
            sb.append(" ");
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0066  */
    public final void W(ot8 ot8Var, boolean z, StringBuilder sb, boolean z2) {
        boolean z3;
        if (z2) {
            sb.append(z("value-parameter"));
            sb.append(" ");
        }
        zk1 zk1Var = this.a;
        if (zk1Var.D()) {
            sb.append("/*");
            sb.append(ot8Var.j0);
            sb.append("*/ ");
        }
        p(sb, ot8Var, null);
        E(sb, ot8Var.l0, "crossinline");
        E(sb, ot8Var.m0, "noinline");
        mj0 mj0Var = zk1Var.r;
        nw3[] nw3VarArr = zk1.Z;
        nw3 nw3Var = nw3VarArr[16];
        mj0Var.getClass();
        nw3Var.getClass();
        if (((Boolean) mj0Var.Y).booleanValue()) {
            jd0 jd0VarJ0 = ot8Var.p();
            gs0 gs0Var = jd0VarJ0 instanceof gs0 ? (gs0) jd0VarJ0 : null;
            if (gs0Var == null || !gs0Var.H0) {
                z3 = false;
            } else {
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3) {
            mj0 mj0Var2 = zk1Var.s;
            nw3 nw3Var2 = nw3VarArr[17];
            mj0Var2.getClass();
            nw3Var2.getClass();
            E(sb, ((Boolean) mj0Var2.Y).booleanValue(), "actual");
        }
        t14 t14VarC = ot8Var.c();
        t14VarC.getClass();
        t14 t14Var = ot8Var.n0;
        t14 t14Var2 = t14Var == null ? t14VarC : t14Var;
        E(sb, t14Var != null, "vararg");
        if (z3 || (z2 && !zk1Var.A())) {
            V(ot8Var, sb, z3);
        }
        if (z) {
            G(ot8Var, sb, z2);
            sb.append(": ");
        }
        sb.append(P(t14Var2));
        y(ot8Var, sb);
        if (zk1Var.D() && t14Var != null) {
            sb.append(" /*");
            sb.append(P(t14VarC));
            sb.append("*/");
        }
        if (zk1Var.q() != null) {
            if (zk1Var.p() ? ot8Var.I0() : el1.a(ot8Var)) {
                StringBuilder sb2 = new StringBuilder(" = ");
                gn2 gn2VarQ = zk1Var.q();
                gn2VarQ.getClass();
                sb2.append((String) gn2VarQ.B(ot8Var));
                sb.append(sb2.toString());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public final void X(StringBuilder sb, List list, boolean z) {
        boolean z2;
        zk1 zk1Var = this.a;
        mj0 mj0Var = zk1Var.E;
        nw3 nw3Var = zk1.Z[29];
        mj0Var.getClass();
        nw3Var.getClass();
        int iOrdinal = ((ah5) mj0Var.Y).ordinal();
        if (iOrdinal == 0) {
            z2 = true;
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    b61.c();
                    return;
                }
            } else if (!z) {
                z2 = true;
            }
            z2 = false;
        }
        int size = list.size();
        zk1Var.C().getClass();
        sb.append("(");
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            ot8 ot8Var = (ot8) it.next();
            zk1Var.C().getClass();
            ot8Var.getClass();
            W(ot8Var, z2, sb, false);
            zk1Var.C().getClass();
            if (i != size - 1) {
                sb.append(", ");
            }
            i = i2;
        }
        zk1Var.C().getClass();
        sb.append(")");
    }

    public final boolean Y(fl1 fl1Var, StringBuilder sb) {
        zk1 zk1Var = this.a;
        if (!zk1Var.u().contains(xk1.f0)) {
            return false;
        }
        mj0 mj0Var = zk1Var.n;
        nw3 nw3Var = zk1.Z[12];
        mj0Var.getClass();
        nw3Var.getClass();
        if (((Boolean) mj0Var.Y).booleanValue()) {
            fl1Var = gl1.g(fl1Var.a.k());
        }
        if (!zk1Var.x() && dh3.f(fl1Var, gl1.j)) {
            return false;
        }
        sb.append(z(fl1Var.a.d()));
        sb.append(" ");
        return true;
    }

    public final void Z(List list, StringBuilder sb) {
        if (this.a.E()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hi8 hi8Var = (hi8) it.next();
            List upperBounds = hi8Var.getUpperBounds();
            upperBounds.getClass();
            for (t14 t14Var : wv0.o0(upperBounds, 1)) {
                v15 name = hi8Var.getName();
                name.getClass();
                StringBuilder sb2 = new StringBuilder(F(name, false));
                sb2.append(" : ");
                t14Var.getClass();
                sb2.append(P(t14Var));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(" ");
        sb.append(z("where"));
        sb.append(" ");
        wv0.x0(arrayList, sb, ", ", null, null, null, 124);
    }

    @Override // defpackage.yk1
    public final void a(boolean z) {
        this.a.a(true);
    }

    @Override // defpackage.yk1
    public final void b(Set set) {
        set.getClass();
        this.a.b(set);
    }

    @Override // defpackage.yk1
    public final void c(boolean z) {
        this.a.c(false);
    }

    @Override // defpackage.yk1
    public final void d(ae6 ae6Var) {
        this.a.d(ae6Var);
    }

    @Override // defpackage.yk1
    public final void e(boolean z) {
        this.a.e(true);
    }

    @Override // defpackage.yk1
    public final void f(boolean z) {
        this.a.f(true);
    }

    @Override // defpackage.yk1
    public final void g(boolean z) {
        this.a.g(true);
    }

    @Override // defpackage.yk1
    public final void h(boolean z) {
        this.a.h(true);
    }

    @Override // defpackage.yk1
    public final void i(ah5 ah5Var) {
        this.a.i(ah5Var);
    }

    @Override // defpackage.yk1
    public final void j(qt0 qt0Var) {
        this.a.j(qt0Var);
    }

    @Override // defpackage.yk1
    public final void k(boolean z) {
        this.a.k(true);
    }

    public final String l(String str) {
        return this.a.B().a(str);
    }

    public final String n(ed1 ed1Var) {
        ed1 ed1VarP;
        String str;
        StringBuilder sb = new StringBuilder();
        ed1Var.J(new vk1((Object) this, (byte) 0), sb);
        zk1 zk1Var = this.a;
        mj0 mj0Var = zk1Var.c;
        nw3[] nw3VarArr = zk1.Z;
        nw3VarArr[1].getClass();
        if (((Boolean) mj0Var.Y).booleanValue() && !(ed1Var instanceof tf5) && !(ed1Var instanceof n74) && (ed1VarP = ed1Var.p()) != null && !(ed1VarP instanceof vx4)) {
            sb.append(" ");
            int iOrdinal = zk1Var.B().ordinal();
            if (iOrdinal == 0) {
                str = "defined in";
            } else {
                if (iOrdinal != 1) {
                    b61.c();
                    return null;
                }
                str = "<i>defined in</i>";
            }
            sb.append(str);
            sb.append(" ");
            gk2 gk2VarF = bl1.f(ed1VarP);
            gk2VarF.getClass();
            sb.append(gk2VarF.c() ? "root package" : l(os4.I(gk2.f(gk2VarF))));
            mj0 mj0Var2 = zk1Var.d;
            nw3VarArr[2].getClass();
            if (((Boolean) mj0Var2.Y).booleanValue() && (ed1VarP instanceof tf5) && (ed1Var instanceof gd1)) {
                ((gd1) ed1Var).getSource().getClass();
            }
        }
        return sb.toString();
    }

    public final String o(gm gmVar, nm nmVar) throws IOException {
        gs0 gs0VarT0;
        List listL;
        gmVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (nmVar != null) {
            sb.append(nmVar.X + ':');
        }
        t14 t14VarC = gmVar.c();
        sb.append(P(t14VarC));
        zk1 zk1Var = this.a;
        if (zk1Var.m().X) {
            Map mapE = gmVar.e();
            mj0 mj0Var = zk1Var.I;
            nw3 nw3Var = zk1.Z[33];
            mj0Var.getClass();
            nw3Var.getClass();
            List list = null;
            sx4 sx4VarD = ((Boolean) mj0Var.Y).booleanValue() ? el1.d(gmVar) : null;
            if (sx4VarD != null && (gs0VarT0 = sx4VarD.t0()) != null && (listL = gs0VarT0.L()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listL) {
                    if (((ot8) obj).I0()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(xv0.Z(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ot8) it.next()).getName());
                }
                list = arrayList2;
            }
            if (list == null) {
                list = d02.X;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (!mapE.containsKey((v15) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(xv0.Z(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((v15) it2.next()).b() + " = ...");
            }
            Set<Map.Entry> setEntrySet = mapE.entrySet();
            ArrayList arrayList5 = new ArrayList(xv0.Z(setEntrySet, 10));
            for (Map.Entry entry : setEntrySet) {
                v15 v15Var = (v15) entry.getKey();
                s21 s21Var = (s21) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(v15Var.b());
                sb2.append(" = ");
                sb2.append(!list.contains(v15Var) ? s(s21Var) : "...");
                arrayList5.add(sb2.toString());
            }
            List listR0 = wv0.R0(wv0.H0(arrayList4, arrayList5));
            if (zk1Var.m().Y || !listR0.isEmpty()) {
                wv0.x0(listR0, sb, ", ", "(", ")", null, 112);
            }
        }
        if (zk1Var.D() && (vr3.J(t14VarC) || (t14VarC.n0().x() instanceof e65))) {
            sb.append(" /* annotation class not found */");
        }
        return sb.toString();
    }

    public final void p(StringBuilder sb, zk zkVar, nm nmVar) {
        Set setS;
        zk1 zk1Var = this.a;
        if (zk1Var.u().contains(xk1.i0)) {
            if (zkVar instanceof t14) {
                setS = zk1Var.s();
            } else {
                mj0 mj0Var = zk1Var.K;
                nw3 nw3Var = zk1.Z[35];
                mj0Var.getClass();
                nw3Var.getClass();
                setS = (Set) mj0Var.Y;
            }
            mj0 mj0Var2 = zk1Var.M;
            nw3 nw3Var2 = zk1.Z[37];
            mj0Var2.getClass();
            nw3Var2.getClass();
            gn2 gn2Var = (gn2) mj0Var2.Y;
            for (gm gmVar : zkVar.getAnnotations()) {
                if (!wv0.m0(setS, gmVar.d()) && !dh3.f(gmVar.d(), tg7.r) && (gn2Var == null || ((Boolean) gn2Var.B(gmVar)).booleanValue())) {
                    sb.append(o(gmVar, nmVar));
                    mj0 mj0Var3 = zk1Var.J;
                    nw3 nw3Var3 = zk1.Z[34];
                    mj0Var3.getClass();
                    nw3Var3.getClass();
                    if (((Boolean) mj0Var3.Y).booleanValue()) {
                        sb.append('\n');
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    public final void r(pt0 pt0Var, StringBuilder sb) {
        List listK0 = pt0Var.k0();
        listK0.getClass();
        List listG = pt0Var.l().g();
        listG.getClass();
        if (this.a.D() && pt0Var.n() && listG.size() > listK0.size()) {
            sb.append(" /*captured type parameters: ");
            T(listG.subList(listK0.size(), listG.size()), sb);
            sb.append("*/");
        }
    }

    public final String s(s21 s21Var) {
        mj0 mj0Var = this.a.v;
        nw3 nw3Var = zk1.Z[20];
        mj0Var.getClass();
        nw3Var.getClass();
        gn2 gn2Var = (gn2) mj0Var.Y;
        if (gn2Var != null) {
            return (String) gn2Var.B(s21Var);
        }
        if (s21Var instanceof du) {
            Iterable iterable = (Iterable) ((du) s21Var).a;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String strS = s((s21) it.next());
                if (strS != null) {
                    arrayList.add(strS);
                }
            }
            return wv0.y0(arrayList, ", ", "{", "}", null, 56);
        }
        if (s21Var instanceof qm) {
            return fm7.x0("@", o((gm) ((qm) s21Var).a, null));
        }
        if (!(s21Var instanceof kv3)) {
            return s21Var.toString();
        }
        jv3 jv3Var = (jv3) ((kv3) s21Var).a;
        if (jv3Var instanceof hv3) {
            return ((hv3) jv3Var).a + "::class";
        }
        if (!(jv3Var instanceof iv3)) {
            b61.c();
            return null;
        }
        vs0 vs0Var = ((iv3) jv3Var).a;
        String strL = vs0Var.a.a().a.a;
        int i = vs0Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            strL = p61.l('>', "kotlin.Array<", strL);
        }
        return pc6.o(strL, "::class");
    }

    public final void t(List list, StringBuilder sb) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            t14 t14VarC = ((i44) it.next()).c();
            t14VarC.getClass();
            sb.append(x(t14VarC, true));
            if (i == list.size() - 1) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i = i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0053  */
    /* JADX WARN: Code duplicated, block: B:17:0x006b  */
    /* JADX WARN: Code duplicated, block: B:18:0x0074  */
    public final void u(StringBuilder sb, aa7 aa7Var) {
        mj0 mj0Var;
        p(sb, aa7Var, null);
        if (vr3.J(aa7Var)) {
            boolean z = aa7Var instanceof q32;
            zk1 zk1Var = this.a;
            if (z && ((q32) aa7Var).f0.Y) {
                mj0 mj0Var2 = zk1Var.W;
                nw3 nw3Var = zk1.Z[47];
                mj0Var2.getClass();
                nw3Var.getClass();
                if (((Boolean) mj0Var2.Y).booleanValue()) {
                    u32 u32Var = u32.a;
                    if (z) {
                        boolean z2 = ((q32) aa7Var).f0.Y;
                    }
                    lh8 lh8VarN0 = aa7Var.n0();
                    lh8VarN0.getClass();
                    sb.append(v(((r32) lh8VarN0).Y[0]));
                } else {
                    if (z) {
                        mj0Var = zk1Var.Y;
                        nw3 nw3Var2 = zk1.Z[49];
                        mj0Var.getClass();
                        nw3Var2.getClass();
                        if (((Boolean) mj0Var.Y).booleanValue()) {
                            sb.append(aa7Var.n0().toString());
                        } else {
                            sb.append(((q32) aa7Var).j0);
                        }
                    } else {
                        sb.append(aa7Var.n0().toString());
                    }
                    sb.append(Q(aa7Var.l0()));
                }
            } else {
                if (z) {
                    mj0Var = zk1Var.Y;
                    nw3 nw3Var3 = zk1.Z[49];
                    mj0Var.getClass();
                    nw3Var3.getClass();
                    if (((Boolean) mj0Var.Y).booleanValue()) {
                        sb.append(((q32) aa7Var).j0);
                    } else {
                        sb.append(aa7Var.n0().toString());
                    }
                } else {
                    sb.append(aa7Var.n0().toString());
                }
                sb.append(Q(aa7Var.l0()));
            }
        } else {
            lh8 lh8VarN1 = aa7Var.n0();
            ot0 ot0VarX = aa7Var.n0().x();
            f63 f63VarC = pw7.c(aa7Var, ot0VarX instanceof pt0 ? (pt0) ot0VarX : null, 0);
            if (f63VarC == null) {
                sb.append(R(lh8VarN1));
                sb.append(Q(aa7Var.l0()));
            } else {
                K(sb, f63VarC);
            }
        }
        if (aa7Var.o0()) {
            sb.append("?");
        }
        if (aa7Var instanceof hh1) {
            sb.append(" & Any");
        }
    }

    public final String v(String str) {
        int iOrdinal = this.a.B().ordinal();
        if (iOrdinal == 0) {
            return str;
        }
        if (iOrdinal == 1) {
            return pc6.p("<font color=red><b>", str, "</b></font>");
        }
        b61.c();
        return null;
    }

    public final String w(String str, String str2, zz3 zz3Var) {
        str.getClass();
        str2.getClass();
        byte b = 0;
        if (os4.V(str, str2)) {
            return mm7.Z(str2, false, "(") ? pc6.p("(", str, ")!") : str.concat("!");
        }
        String strH = os4.H(str, str2, new tk1(this, zz3Var, b), new tk1(this, zz3Var, (byte) 1), new d0(1, this, wk1.class, "escape", "escape(Ljava/lang/String;)Ljava/lang/String;", 0, (byte) 6));
        if (strH != null) {
            return strH;
        }
        return "(" + str + ".." + str2 + ')';
    }

    public final String x(t14 t14Var, boolean z) {
        String strP = P(t14Var);
        return ((!a0(t14Var) || cj8.e(t14Var)) && !(t14Var instanceof hh1) && (!z || t14Var.getAnnotations().isEmpty())) ? strP : p61.l(')', "(", strP);
    }

    public final void y(pt8 pt8Var, StringBuilder sb) {
        s21 s21VarH;
        String strS;
        mj0 mj0Var = this.a.u;
        nw3 nw3Var = zk1.Z[19];
        mj0Var.getClass();
        nw3Var.getClass();
        if (!((Boolean) mj0Var.Y).booleanValue() || (s21VarH = pt8Var.H()) == null || (strS = s(s21VarH)) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(l(strS));
    }

    public final String z(String str) {
        zk1 zk1Var = this.a;
        int iOrdinal = zk1Var.B().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                b61.c();
                return null;
            }
            if (!zk1Var.n()) {
                return pc6.p("<b>", str, "</b>");
            }
        }
        return str;
    }
}
