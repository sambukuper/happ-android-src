package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class jz4 extends cw0 {
    public final s05 f0;
    public final ArrayList g0;
    public final s05 h0;
    public final o61 i0;

    public jz4() {
        super((byte) 4);
        this.f0 = w39.n();
        this.g0 = new ArrayList();
        this.h0 = new s05();
        b1 b1Var = new b1(this, (byte) 14);
        kd7.b(kd7.a);
        synchronized (kd7.c) {
            kd7.h = wv0.I0(kd7.h, b1Var);
        }
        this.i0 = new o61(b1Var, (byte) 26);
    }

    @Override // defpackage.cw0
    public final gn2 B0(n17 n17Var) {
        s05 s05Var = this.h0;
        gn2 zw2Var = (gn2) s05Var.g(n17Var);
        if (zw2Var == null) {
            zw2Var = new zw2(this, n17Var, (byte) 18);
            int iF = s05Var.f(n17Var);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = s05Var.c;
            Object obj = objArr[iF];
            s05Var.b[iF] = n17Var;
            objArr[iF] = zw2Var;
        }
        return zw2Var;
    }

    @Override // defpackage.cw0
    public final void C0(jp0 jp0Var) {
        this.h0.j(jp0Var);
        g0(jp0Var);
        p0();
    }

    @Override // defpackage.cw0
    public final void g0(n17 n17Var) {
        this.g0.add(new hz4(n17Var));
    }

    @Override // defpackage.cw0
    public final void p0() {
        synchronized (this.X) {
            try {
                ArrayList arrayList = this.g0;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    iz4 iz4Var = (iz4) arrayList.get(i);
                    if (iz4Var instanceof gz4) {
                        w39.g(this.f0, ((gz4) iz4Var).a, ((gz4) iz4Var).b);
                    } else {
                        if (!(iz4Var instanceof hz4)) {
                            throw new b55();
                        }
                        w39.j0(this.f0, ((hz4) iz4Var).a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.g0.clear();
    }

    @Override // defpackage.cw0
    public final void r0() {
        this.i0.h();
        this.g0.clear();
        this.h0.a();
        synchronized (this.X) {
            this.f0.a();
        }
    }
}
