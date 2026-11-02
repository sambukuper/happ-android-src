package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class vl1 extends m0 implements ed1 {
    public final fy5 g0;
    public final s50 h0;
    public final ke7 i0;
    public final qs0 j0;
    public final fx4 k0;
    public final fl1 l0;
    public final us0 m0;
    public final jl1 n0;
    public final et4 o0;
    public final ul1 p0;
    public final gx6 q0;
    public final z47 r0;
    public final ed1 s0;
    public final se4 t0;
    public final te4 u0;
    public final se4 v0;
    public final c06 w0;
    public final sm x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public vl1(jl1 jl1Var, fy5 fy5Var, w15 w15Var, s50 s50Var, ke7 ke7Var) {
        us0 us0Var;
        super(((hl1) jl1Var.X).a, u70.L(w15Var, fy5Var.g0).f());
        jl1Var.getClass();
        fy5Var.getClass();
        w15Var.getClass();
        ke7Var.getClass();
        this.g0 = fy5Var;
        this.h0 = s50Var;
        this.i0 = ke7Var;
        this.j0 = u70.L(w15Var, fy5Var.g0);
        this.k0 = lh4.R0((xy5) md2.e.e(fy5Var.f0));
        this.l0 = dh3.q((b06) md2.d.e(fy5Var.f0));
        ey5 ey5Var = (ey5) md2.f.e(fy5Var.f0);
        int i = ey5Var == null ? -1 : h06.b[ey5Var.ordinal()];
        us0 us0Var2 = us0.Z;
        us0 us0Var3 = us0.X;
        switch (i) {
            case 1:
            default:
                us0Var = us0Var3;
                break;
            case 2:
                us0Var3 = us0.Y;
                us0Var = us0Var3;
                break;
            case 3:
                us0Var = us0Var2;
                break;
            case 4:
                us0Var3 = us0.f0;
                us0Var = us0Var3;
                break;
            case 5:
                us0Var3 = us0.g0;
                us0Var = us0Var3;
                break;
            case 6:
            case 7:
                us0Var3 = us0.h0;
                us0Var = us0Var3;
                break;
        }
        this.m0 = us0Var;
        List list = fy5Var.i0;
        list.getClass();
        tz5 tz5Var = fy5Var.C0;
        tz5Var.getClass();
        ux4 ux4Var = new ux4(tz5Var);
        dv8 dv8Var = dv8.b;
        a06 a06Var = fy5Var.E0;
        a06Var.getClass();
        jl1 jl1VarA = jl1Var.a(this, list, w15Var, ux4Var, z38.b(a06Var), s50Var);
        hl1 hl1Var = (hl1) jl1VarA.X;
        ve4 ve4Var = hl1Var.a;
        this.n0 = jl1VarA;
        boolean zBooleanValue = md2.m.e(fy5Var.f0).booleanValue();
        et4 tl1Var = new tl1(this);
        byte b = 0;
        if (us0Var == us0Var2) {
            boolean z = zBooleanValue || dh3.f(hl1Var.s.o(), Boolean.TRUE);
            String strB = getName().b();
            strB.getClass();
            tl1Var = dh3.o(strB, eu.W(new et4[]{tl1Var, new ki7(ve4Var, this, z)}));
        }
        this.o0 = tl1Var;
        this.p0 = new ul1(this);
        we5 we5Var = gx6.d;
        ((q45) hl1Var.q).getClass();
        d0 d0Var = new d0(1, this, sl1.class, "<init>", "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lkotlin/reflect/jvm/internal/impl/types/checker/KotlinTypeRefiner;)V", 0, (byte) 8);
        we5Var.getClass();
        ve4Var.getClass();
        this.q0 = new gx6(this, ve4Var, d0Var);
        this.r0 = us0Var == us0Var2 ? new z47(this) : null;
        ed1 ed1Var = (ed1) jl1Var.Z;
        this.s0 = ed1Var;
        this.t0 = new se4(ve4Var, new ol1(this, b));
        this.u0 = new te4(ve4Var, new ol1(this, (byte) 1));
        new se4(ve4Var, new ol1(this, (byte) 2));
        ve4Var.a(new ol1(this, (byte) 3));
        this.v0 = new se4(ve4Var, new ol1(this, (byte) 4));
        w15 w15Var2 = (w15) jl1VarA.Y;
        ux4 ux4Var2 = (ux4) jl1VarA.f0;
        vl1 vl1Var = ed1Var instanceof vl1 ? (vl1) ed1Var : null;
        this.w0 = new c06(fy5Var, w15Var2, ux4Var2, ke7Var, vl1Var != null ? vl1Var.w0 : null);
        this.x0 = !md2.c.e(fy5Var.f0).booleanValue() ? oy1.f0 : new u55(ve4Var, new ol1(this, (byte) 5));
    }

    @Override // defpackage.sx4
    public final Collection B() {
        return (Collection) this.u0.invoke();
    }

    public final sl1 B0() {
        ((q45) ((hl1) this.n0.X).q).getClass();
        gx6 gx6Var = this.q0;
        gx6Var.getClass();
        m0 m0Var = gx6Var.a;
        int i = el1.a;
        bl1.c(m0Var).getClass();
        return (sl1) ((et4) hi5.e0(gx6Var.c, gx6.e[0]));
    }

    @Override // defpackage.ts4
    public final boolean C() {
        return md2.j.e(this.g0.f0).booleanValue();
    }

    public final aa7 C0(v15 v15Var) {
        Iterator it = B0().f(v15Var, x45.i0).iterator();
        boolean z = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
                break;
            }
            Object next = it.next();
            fx5 fx5Var = (fx5) next;
            if (fx5Var.S() == null && fx5Var.Y().isEmpty()) {
                if (!z) {
                    z = true;
                    obj = next;
                }
            }
            obj = null;
            break;
        }
        fx5 fx5Var2 = (fx5) obj;
        return (aa7) (fx5Var2 != null ? fx5Var2.c() : null);
    }

    @Override // defpackage.sx4, defpackage.ts4
    public final fl1 e() {
        return this.l0;
    }

    @Override // defpackage.sx4
    public final List f0() {
        jl1 jl1Var = this.n0;
        List listP = vr3.p(this.g0, (ux4) jl1Var.f0);
        ArrayList arrayList = new ArrayList(xv0.Z(listP, 10));
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add(new i44(p0(), new g51(this, ((fc8) jl1Var.j0).i((nz5) it.next()), (v15) null), oy1.f0));
        }
        return arrayList;
    }

    @Override // defpackage.sx4
    public final us0 g0() {
        return this.m0;
    }

    @Override // defpackage.zk
    public final sm getAnnotations() {
        return this.x0;
    }

    @Override // defpackage.gd1
    public final ke7 getSource() {
        return this.i0;
    }

    @Override // defpackage.sx4
    public final boolean i() {
        if (!md2.k.e(this.g0.f0).booleanValue()) {
            return false;
        }
        s50 s50Var = this.h0;
        int i = s50Var.b;
        if (i >= 1) {
            if (i > 1) {
                return false;
            }
            int i2 = s50Var.c;
            if (i2 >= 4 && (i2 > 4 || s50Var.d > 1)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ts4
    public final boolean j0() {
        return false;
    }

    @Override // defpackage.ts4
    public final boolean k() {
        return md2.i.e(this.g0.f0).booleanValue();
    }

    @Override // defpackage.sx4, defpackage.pt0
    public final List k0() {
        return ((fc8) this.n0.j0).b();
    }

    @Override // defpackage.ot0
    public final lh8 l() {
        return this.p0;
    }

    @Override // defpackage.sx4, defpackage.ts4
    public final fx4 m() {
        return this.k0;
    }

    @Override // defpackage.pt0
    public final boolean n() {
        return md2.g.e(this.g0.f0).booleanValue();
    }

    @Override // defpackage.sx4
    public final et4 o0() {
        return this.o0;
    }

    @Override // defpackage.ed1
    public final ed1 p() {
        return this.s0;
    }

    @Override // defpackage.sx4
    public final et4 s0(z14 z14Var) {
        gx6 gx6Var = this.q0;
        m0 m0Var = gx6Var.a;
        int i = el1.a;
        bl1.c(m0Var).getClass();
        return (et4) hi5.e0(gx6Var.c, gx6.e[0]);
    }

    @Override // defpackage.sx4
    public final gs0 t0() {
        return (gs0) this.t0.invoke();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("deserialized ");
        sb.append(C() ? "expect " : _UrlKt.FRAGMENT_ENCODE_SET);
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    @Override // defpackage.sx4
    public final ft8 u0() {
        return (ft8) this.v0.invoke();
    }

    @Override // defpackage.sx4
    public final boolean v0() {
        return md2.f.e(this.g0.f0) == ey5.COMPANION_OBJECT;
    }

    @Override // defpackage.sx4
    public final boolean w0() {
        return md2.h.e(this.g0.f0).booleanValue();
    }

    @Override // defpackage.sx4
    public final boolean x0() {
        return md2.l.e(this.g0.f0).booleanValue();
    }

    @Override // defpackage.sx4
    public final boolean y0() {
        return md2.k.e(this.g0.f0).booleanValue() && this.h0.a(1, 4, 2);
    }
}
