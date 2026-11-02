package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class wz2 extends k09 {
    @Override // defpackage.mi1
    public final void a(mi1 mi1Var) {
        f10 f10Var = (f10) this.b;
        int i = f10Var.s0;
        si1 si1Var = this.h;
        Iterator it = si1Var.l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((si1) it.next()).g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            si1Var.d(i3 + f10Var.u0);
        } else {
            si1Var.d(i2 + f10Var.u0);
        }
    }

    @Override // defpackage.k09
    public final void d() {
        m31 m31Var = this.b;
        if (m31Var instanceof f10) {
            si1 si1Var = this.h;
            si1Var.b = true;
            ArrayList arrayList = si1Var.l;
            f10 f10Var = (f10) m31Var;
            int i = f10Var.s0;
            boolean z = f10Var.t0;
            int i2 = 0;
            if (i == 0) {
                si1Var.e = 4;
                while (i2 < f10Var.r0) {
                    m31 m31Var2 = f10Var.q0[i2];
                    if (z || m31Var2.g0 != 8) {
                        si1 si1Var2 = m31Var2.d.h;
                        si1Var2.k.add(si1Var);
                        arrayList.add(si1Var2);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 1) {
                si1Var.e = 5;
                while (i2 < f10Var.r0) {
                    m31 m31Var3 = f10Var.q0[i2];
                    if (z || m31Var3.g0 != 8) {
                        si1 si1Var3 = m31Var3.d.i;
                        si1Var3.k.add(si1Var);
                        arrayList.add(si1Var3);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            if (i == 2) {
                si1Var.e = 6;
                while (i2 < f10Var.r0) {
                    m31 m31Var4 = f10Var.q0[i2];
                    if (z || m31Var4.g0 != 8) {
                        si1 si1Var4 = m31Var4.e.h;
                        si1Var4.k.add(si1Var);
                        arrayList.add(si1Var4);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
                return;
            }
            if (i != 3) {
                return;
            }
            si1Var.e = 7;
            while (i2 < f10Var.r0) {
                m31 m31Var5 = f10Var.q0[i2];
                if (z || m31Var5.g0 != 8) {
                    si1 si1Var5 = m31Var5.e.i;
                    si1Var5.k.add(si1Var);
                    arrayList.add(si1Var5);
                }
                i2++;
            }
            m(this.b.e.h);
            m(this.b.e.i);
        }
    }

    @Override // defpackage.k09
    public final void e() {
        m31 m31Var = this.b;
        if (m31Var instanceof f10) {
            int i = ((f10) m31Var).s0;
            si1 si1Var = this.h;
            if (i == 0 || i == 1) {
                m31Var.Y = si1Var.g;
            } else {
                m31Var.Z = si1Var.g;
            }
        }
    }

    @Override // defpackage.k09
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // defpackage.k09
    public final boolean k() {
        return false;
    }

    public final void m(si1 si1Var) {
        si1 si1Var2 = this.h;
        si1Var2.k.add(si1Var);
        si1Var.l.add(si1Var2);
    }
}
