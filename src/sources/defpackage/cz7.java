package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cz7 extends jx4 implements mq5, fi1, kq5 {
    public Object q0;
    public Object r0;
    public PointerInputEventHandler s0;
    public og7 t0;
    public aq5 u0 = yy7.a;
    public final c15 v0;
    public final c15 w0;
    public final c15 x0;
    public aq5 y0;
    public long z0;

    public cz7(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.q0 = obj;
        this.r0 = obj2;
        this.s0 = pointerInputEventHandler;
        c15 c15Var = new c15(0, new bz7[16]);
        this.v0 = c15Var;
        this.w0 = c15Var;
        this.x0 = new c15(0, new bz7[16]);
        this.z0 = 0L;
    }

    @Override // defpackage.kq5
    public final void F0() {
        a1();
    }

    @Override // defpackage.kq5
    public final void I() {
        aq5 aq5Var = this.y0;
        if (aq5Var == null) {
            return;
        }
        List list = aq5Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((hq5) list.get(i)).d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    hq5 hq5Var = (hq5) list.get(i2);
                    long j = hq5Var.a;
                    long j2 = hq5Var.c;
                    long j3 = hq5Var.b;
                    float f = hq5Var.e;
                    boolean z = hq5Var.d;
                    arrayList.add(new hq5(j, j3, j2, false, f, j3, j2, z, z, hq5Var.i, 0L, 1.0f, 0L));
                }
                aq5 aq5Var2 = new aq5(arrayList, null);
                this.u0 = aq5Var2;
                Z0(aq5Var2, bq5.X);
                Z0(aq5Var2, bq5.Y);
                Z0(aq5Var2, bq5.Z);
                this.y0 = null;
                return;
            }
        }
    }

    @Override // defpackage.jx4
    public final void R0() {
        a1();
    }

    public final Object Y0(rn2 rn2Var, q51 q51Var) {
        mm0 mm0Var = new mm0(1, mb6.H(q51Var));
        mm0Var.s();
        bz7 bz7Var = new bz7(this, mm0Var);
        synchronized (this.w0) {
            this.v0.b(bz7Var);
            new tu6(mb6.H(mb6.w(bz7Var, bz7Var, rn2Var)), c71.X).f(dn8.a);
        }
        mm0Var.u(new zo6(bz7Var, (byte) 3));
        return mm0Var.q();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0020, B:17:0x0023, B:20:0x002f, B:22:0x0037, B:24:0x003b, B:25:0x0040, B:26:0x0043, B:28:0x004c, B:30:0x0054, B:32:0x0058), top: B:41:0x000d }] */
    public final void Z0(aq5 aq5Var, bq5 bq5Var) {
        Object[] objArr;
        int i;
        int i2;
        bz7 bz7Var;
        mm0 mm0Var;
        mm0 mm0Var2;
        synchronized (this.w0) {
            c15 c15Var = this.x0;
            c15Var.c(c15Var.Z, this.v0);
        }
        try {
            int iOrdinal = bq5Var.ordinal();
            if (iOrdinal == 0) {
                c15 c15Var2 = this.x0;
                objArr = c15Var2.X;
                i = c15Var2.Z;
                for (i2 = 0; i2 < i; i2++) {
                    bz7Var = (bz7) objArr[i2];
                    if (bq5Var != bz7Var.f0 && (mm0Var = bz7Var.Z) != null) {
                        bz7Var.Z = null;
                        mm0Var.f(aq5Var);
                    }
                }
            } else if (iOrdinal == 1) {
                c15 c15Var3 = this.x0;
                int i3 = c15Var3.Z - 1;
                Object[] objArr2 = c15Var3.X;
                if (i3 < objArr2.length) {
                    while (i3 >= 0) {
                        bz7 bz7Var2 = (bz7) objArr2[i3];
                        if (bq5Var == bz7Var2.f0 && (mm0Var2 = bz7Var2.Z) != null) {
                            bz7Var2.Z = null;
                            mm0Var2.f(aq5Var);
                        }
                        i3--;
                    }
                }
            } else {
                if (iOrdinal != 2) {
                    throw new b55();
                }
                c15 c15Var4 = this.x0;
                objArr = c15Var4.X;
                i = c15Var4.Z;
                while (i2 < i) {
                    bz7Var = (bz7) objArr[i2];
                    if (bq5Var != bz7Var.f0) {
                    }
                }
            }
            this.x0.g();
        } catch (Throwable th) {
            this.x0.g();
            throw th;
        }
    }

    public final void a1() {
        og7 og7Var = this.t0;
        if (og7Var != null) {
            og7Var.l(new lq5("Pointer input was reset"));
            this.t0 = null;
        }
    }

    @Override // defpackage.fi1
    public final float b0() {
        return yn0.Z(this).A0.b0();
    }

    @Override // defpackage.nh1, defpackage.kq5
    public final void c() {
        a1();
    }

    @Override // defpackage.fi1
    public final float getDensity() {
        return yn0.Z(this).A0.getDensity();
    }

    @Override // defpackage.kq5
    public final void z(aq5 aq5Var, bq5 bq5Var, long j) {
        this.z0 = j;
        if (bq5Var == bq5.X) {
            this.u0 = aq5Var;
        }
        q51 q51Var = null;
        if (this.t0 == null) {
            this.t0 = w51.G(M0(), null, e71.f0, new tk0(this, q51Var, (byte) 7), 1);
        }
        Z0(aq5Var, bq5Var);
        List list = aq5Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!vr3.m((hq5) list.get(i))) {
                this.y0 = aq5Var;
            }
        }
        aq5Var = null;
        this.y0 = aq5Var;
    }
}
