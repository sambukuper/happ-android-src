package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pd2 implements kq8 {
    public final kh7 a;
    public qq8 b;
    public volatile int c;
    public ux0 d;

    public pd2(qj0 qj0Var, kh7 kh7Var, pr8 pr8Var, uc8 uc8Var, lh4 lh4Var) {
        qj0Var.getClass();
        kh7Var.getClass();
        pr8Var.getClass();
        uc8Var.getClass();
        this.a = kh7Var;
        this.c = 2;
        vr3.a(dn8.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(s51 s51Var) {
        od2 od2Var;
        int i;
        if (s51Var instanceof od2) {
            od2Var = (od2) s51Var;
            int i2 = od2Var.i0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                od2Var.i0 = i2 - Integer.MIN_VALUE;
            } else {
                od2Var = new od2(this, s51Var);
            }
        } else {
            od2Var = new od2(this, s51Var);
        }
        Object obj = od2Var.g0;
        c71 c71Var = c71.X;
        int i3 = od2Var.i0;
        if (i3 == 0) {
            w39.n0(obj);
            hi5.i0("CXCP");
            int i4 = this.c;
            ux0 ux0VarA = this.d;
            if (ux0VarA == null) {
                ux0VarA = vr3.a(dn8.a);
            }
            od2Var.f0 = i4;
            od2Var.i0 = 1;
            if (ux0VarA.V0(od2Var) == c71Var) {
                return c71Var;
            }
            i = i4;
        } else {
            if (i3 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = od2Var.f0;
            w39.n0(obj);
        }
        hi5.i0("CXCP");
        return new Integer(i);
    }

    @Override // defpackage.kq8
    public final void b(qq8 qq8Var) {
        this.b = qq8Var;
        c(this.c, false);
    }

    public final ux0 c(int i, boolean z) {
        if (hi5.i0("CXCP")) {
            Objects.toString(this.b);
        }
        ux0 ux0Var = new ux0();
        if (this.b == null) {
            p61.y("Camera is not active.", ux0Var);
            return ux0Var;
        }
        this.c = i;
        ux0 ux0Var2 = this.d;
        if (z) {
            if (ux0Var2 != null) {
                p61.y("There is a new flash mode being set or camera was closed", ux0Var2);
            }
            this.d = null;
        } else if (ux0Var2 != null) {
            zc1.f0(ux0Var, ux0Var2);
        }
        this.d = ux0Var;
        kh7 kh7Var = this.a;
        synchronized (kh7Var.d) {
            kh7Var.h = i;
        }
        zc1.f0(kh7Var.f(), ux0Var);
        return ux0Var;
    }

    @Override // defpackage.kq8
    public final void reset() {
        this.c = 2;
        ux0 ux0Var = this.d;
        if (ux0Var != null) {
            p61.y("There is a new flash mode being set or camera was closed", ux0Var);
        }
        this.d = null;
        c(2, true);
    }
}
