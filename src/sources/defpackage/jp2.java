package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jp2 extends m01 {
    public final long a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final t05 e;
    public final rh5 f;
    public final /* synthetic */ lp2 g;

    public jp2(lp2 lp2Var, long j, boolean z, boolean z2, yr2 yr2Var) {
        this.g = lp2Var;
        this.a = j;
        this.b = z;
        this.c = z2;
        t05 t05Var = vw6.a;
        this.e = new t05();
        this.f = new rh5(kl5.f0, lh4.x0);
    }

    @Override // defpackage.m01
    public final void a(r01 r01Var, rn2 rn2Var) {
        this.g.b.a(r01Var, rn2Var);
    }

    @Override // defpackage.m01
    public final t05 b(r01 r01Var, u87 u87Var, rn2 rn2Var) {
        return this.g.b.b(r01Var, u87Var, rn2Var);
    }

    @Override // defpackage.m01
    public final void c() {
        this.g.A--;
    }

    @Override // defpackage.m01
    public final boolean d() {
        return this.g.b.d();
    }

    @Override // defpackage.m01
    public final boolean e() {
        return this.b;
    }

    @Override // defpackage.m01
    public final boolean f() {
        return this.c;
    }

    @Override // defpackage.m01
    public final long g() {
        return this.a;
    }

    @Override // defpackage.m01
    public final l01 h() {
        return this.g.h;
    }

    @Override // defpackage.m01
    public final kl5 i() {
        return (kl5) this.f.getValue();
    }

    @Override // defpackage.m01
    public final s61 j() {
        return this.g.b.j();
    }

    @Override // defpackage.m01
    public final boolean k() {
        return this.g.b.k();
    }

    @Override // defpackage.m01
    public final void l(r01 r01Var) {
        lp2 lp2Var = this.g;
        m01 m01Var = lp2Var.b;
        m01Var.l(lp2Var.h);
        m01Var.l(r01Var);
    }

    @Override // defpackage.m01
    public final vy4 m(wy4 wy4Var) {
        return this.g.b.m(wy4Var);
    }

    @Override // defpackage.m01
    public final t05 n(r01 r01Var, u87 u87Var, t05 t05Var) {
        return this.g.b.n(r01Var, u87Var, t05Var);
    }

    @Override // defpackage.m01
    public final void o(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.m01
    public final void p(lp2 lp2Var) {
        this.e.a(lp2Var);
    }

    @Override // defpackage.m01
    public final void q(j86 j86Var) {
        this.g.b.q(j86Var);
    }

    @Override // defpackage.m01
    public final void r(r01 r01Var) {
        this.g.b.r(r01Var);
    }

    @Override // defpackage.m01
    public final pm0 s(tb2 tb2Var) {
        return this.g.b.s(tb2Var);
    }

    @Override // defpackage.m01
    public final void t() {
        this.g.A++;
    }

    @Override // defpackage.m01
    public final void u(lp2 lp2Var) {
        HashSet<Set> hashSet = this.d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                lp2Var.getClass();
                set.remove(lp2Var.v());
            }
        }
        if (lp2Var != null) {
            this.e.l(lp2Var);
        }
    }

    @Override // defpackage.m01
    public final void v(r01 r01Var) {
        this.g.b.v(r01Var);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0063 A[LOOP:0: B:9:0x0017->B:22:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0066 A[EDGE_INSN: B:26:0x0066->B:23:0x0066 BREAK  A[LOOP:0: B:9:0x0017->B:22:0x0063], SYNTHETIC] */
    public final void w() {
        t05 t05Var = this.e;
        if (t05Var.h()) {
            HashSet hashSet = this.d;
            if (hashSet != null) {
                Object[] objArr = t05Var.b;
                long[] jArr = t05Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    lp2 lp2Var = (lp2) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(lp2Var.v());
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
            t05Var.b();
        }
    }
}
