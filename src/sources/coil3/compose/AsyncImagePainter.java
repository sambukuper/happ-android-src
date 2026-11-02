package coil3.compose;

import android.os.Trace;
import defpackage.ab7;
import defpackage.ae8;
import defpackage.ah1;
import defpackage.av;
import defpackage.b02;
import defpackage.b71;
import defpackage.b73;
import defpackage.be;
import defpackage.bm3;
import defpackage.bv;
import defpackage.c73;
import defpackage.dh3;
import defpackage.dq;
import defpackage.e71;
import defpackage.ev;
import defpackage.g60;
import defpackage.gn2;
import defpackage.gv3;
import defpackage.gx1;
import defpackage.h76;
import defpackage.jm4;
import defpackage.jw7;
import defpackage.lx1;
import defpackage.og5;
import defpackage.og7;
import defpackage.oh7;
import defpackage.os4;
import defpackage.ph7;
import defpackage.pw6;
import defpackage.pz2;
import defpackage.q51;
import defpackage.q61;
import defpackage.rh5;
import defpackage.s61;
import defpackage.s63;
import defpackage.sv1;
import defpackage.td8;
import defpackage.tp1;
import defpackage.tr5;
import defpackage.u61;
import defpackage.u63;
import defpackage.ua7;
import defpackage.v63;
import defpackage.v71;
import defpackage.vc6;
import defpackage.vj8;
import defpackage.w51;
import defpackage.xs8;
import defpackage.y2;
import defpackage.y41;
import defpackage.yu;
import defpackage.z41;
import defpackage.z51;
import defpackage.z63;
import defpackage.z68;
import defpackage.zg1;
import defpackage.zu;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcoil3/compose/AsyncImagePainter;", "Log5;", "Lvc6;", "yu", "av", "io.coil-kt.coil3_coil-compose-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AsyncImagePainter extends og5 implements vc6 {
    public static final y2 v0 = new y2((byte) 23);
    public g60 j0;
    public boolean k0;
    public bm3 l0;
    public b71 n0;
    public ev q0;
    public yu r0;
    public final oh7 s0;
    public final oh7 t0;
    public final h76 u0;
    public final rh5 h0 = z51.H(null);
    public float i0 = 1.0f;
    public long m0 = 9205357640488583168L;
    public gn2 o0 = v0;
    public z41 p0 = y41.a;

    public AsyncImagePainter(yu yuVar) {
        this.r0 = yuVar;
        this.s0 = ph7.a(yuVar);
        oh7 oh7VarA = ph7.a(zu.a);
        this.t0 = oh7VarA;
        this.u0 = jm4.n(oh7VarA);
    }

    @Override // defpackage.vc6
    public final void a() {
        bm3 bm3Var = this.l0;
        if (bm3Var != null) {
            bm3Var.m(null);
        }
        this.l0 = null;
        Object objJ = j();
        vc6 vc6Var = objJ instanceof vc6 ? (vc6) objJ : null;
        if (vc6Var != null) {
            vc6Var.a();
        }
        this.k0 = false;
    }

    @Override // defpackage.vc6
    public final void b() {
        bm3 bm3Var = this.l0;
        if (bm3Var != null) {
            bm3Var.m(null);
        }
        this.l0 = null;
        Object objJ = j();
        vc6 vc6Var = objJ instanceof vc6 ? (vc6) objJ : null;
        if (vc6Var != null) {
            vc6Var.b();
        }
        this.k0 = false;
    }

    @Override // defpackage.vc6
    public final void c() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            Object objJ = j();
            vc6 vc6Var = objJ instanceof vc6 ? (vc6) objJ : null;
            if (vc6Var != null) {
                vc6Var.c();
            }
            k();
            this.k0 = true;
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.og5
    public final boolean d(float f) {
        this.i0 = f;
        return true;
    }

    @Override // defpackage.og5
    public final boolean e(g60 g60Var) {
        this.j0 = g60Var;
        return true;
    }

    @Override // defpackage.og5
    /* JADX INFO: renamed from: h */
    public final long getR0() {
        og5 og5VarJ = j();
        if (og5VarJ != null) {
            return og5VarJ.getR0();
        }
        return 9205357640488583168L;
    }

    @Override // defpackage.og5
    public final void i(sv1 sv1Var) {
        long jE = sv1Var.e();
        if (!ua7.a(this.m0, jE)) {
            this.m0 = jE;
        }
        og5 og5VarJ = j();
        if (og5VarJ != null) {
            og5VarJ.g(sv1Var, sv1Var.e(), this.i0, this.j0);
        }
    }

    public final og5 j() {
        return (og5) this.h0.getValue();
    }

    public final void k() {
        yu yuVar = this.r0;
        if (yuVar == null) {
            return;
        }
        b71 b71Var = this.n0;
        q51 q51Var = null;
        if (b71Var == null) {
            dh3.T("scope");
            throw null;
        }
        bv bvVar = new bv(this, yuVar, q51Var, (byte) 0);
        s61 coroutineContext = b71Var.getCoroutineContext();
        int i = xs8.b;
        q61 q61VarH0 = coroutineContext.H0(pz2.E0);
        u61 u61Var = q61VarH0 instanceof u61 ? (u61) q61VarH0 : null;
        e71 e71Var = e71.f0;
        og7 og7VarF = (u61Var == null || u61Var.equals(tp1.b)) ? w51.F(b71Var, tp1.b, e71Var, bvVar) : w51.F(gv3.c(new zg1(b71Var.getCoroutineContext())), new ah1(u61Var), e71Var, bvVar);
        bm3 bm3Var = this.l0;
        if (bm3Var != null) {
            bm3Var.m(null);
        }
        this.l0 = og7VarF;
    }

    public final void l(yu yuVar) {
        if (dh3.f(this.r0, yuVar)) {
            return;
        }
        this.r0 = yuVar;
        if (yuVar == null) {
            bm3 bm3Var = this.l0;
            if (bm3Var != null) {
                bm3Var.m(null);
            }
            this.l0 = null;
        } else if (this.k0) {
            k();
        }
        if (yuVar != null) {
            this.s0.n(null, yuVar);
        }
    }

    public final v63 m(v63 v63Var, boolean z) {
        s63 s63VarA = v63.a(v63Var);
        s63VarA.d = new dq((Object) v63Var, (Object) this, (byte) 20);
        u63 u63Var = v63Var.s;
        if (u63Var.d == null) {
            s63VarA.i = ab7.F;
        }
        if (u63Var.e == null) {
            z41 z41Var = this.p0;
            int i = xs8.b;
            s63VarA.j = (dh3.f(z41Var, y41.a) || dh3.f(z41Var, y41.b)) ? pw6.Y : pw6.X;
        }
        if (u63Var.f == null) {
            s63VarA.k = tr5.Y;
        }
        if (z) {
            b02 b02Var = b02.X;
            s63VarA.f = b02Var;
            s63VarA.g = b02Var;
            s63VarA.h = b02Var;
        }
        return s63VarA.a();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0080  */
    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:29:0x0097  */
    /* JADX WARN: Code duplicated, block: B:31:0x009f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    public final void n(av avVar) {
        c73 c73Var;
        og5 og5VarA;
        Object objA;
        vc6 vc6Var;
        vc6 vc6Var2;
        oh7 oh7Var = this.t0;
        av avVar2 = (av) oh7Var.getValue();
        av avVar3 = (av) this.o0.B(avVar);
        oh7Var.m(avVar3);
        z41 z41Var = this.p0;
        if (!(avVar3 instanceof AsyncImagePainter$State$Success)) {
            if (avVar3 instanceof AsyncImagePainter$State$Error) {
                c73Var = ((AsyncImagePainter$State$Error) avVar3).a;
            } else {
                og5VarA = null;
            }
            if (og5VarA == null) {
                og5VarA = avVar3.getPainter();
            }
            this.h0.setValue(og5VarA);
            if (avVar2.getPainter() != avVar3.getPainter()) {
                objA = avVar2.getPainter();
                if (objA instanceof vc6) {
                    vc6Var = (vc6) objA;
                } else {
                    vc6Var = null;
                }
                if (vc6Var != null) {
                    vc6Var.b();
                }
                Object objA2 = avVar3.getPainter();
                vc6Var2 = objA2 instanceof vc6 ? (vc6) objA2 : null;
                if (vc6Var2 != null) {
                    vc6Var2.c();
                }
            }
        }
        c73Var = ((AsyncImagePainter$State$Success) avVar3).a;
        ae8 ae8VarA = ((td8) z68.F(c73Var.getRequest(), b73.a)).a(os4.X, c73Var);
        if (ae8VarA instanceof v71) {
            og5 og5VarA2 = avVar2.getPainter();
            if (!(avVar2 instanceof AsyncImagePainter$State$Loading)) {
                og5VarA2 = null;
            }
            og5 og5VarA3 = avVar3.getPainter();
            be beVar = gx1.Y;
            og5VarA = new CrossfadePainter(og5VarA2, og5VarA3, z41Var, vj8.l0(((v71) ae8VarA).c, lx1.MILLISECONDS), ((c73Var instanceof jw7) && ((jw7) c73Var).g) ? false : true, ((Boolean) z68.F(c73Var.getRequest(), z63.b)).booleanValue());
        } else {
            og5VarA = null;
        }
        if (og5VarA == null) {
            og5VarA = avVar3.getPainter();
        }
        this.h0.setValue(og5VarA);
        if (avVar2.getPainter() != avVar3.getPainter()) {
            objA = avVar2.getPainter();
            if (objA instanceof vc6) {
                vc6Var = (vc6) objA;
            } else {
                vc6Var = null;
            }
            if (vc6Var != null) {
                vc6Var.b();
            }
            Object objA3 = avVar3.getPainter();
            if (objA3 instanceof vc6) {
            }
            if (vc6Var2 != null) {
                vc6Var2.c();
            }
        }
    }
}
