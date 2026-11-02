package defpackage;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class uc8 implements kq8 {
    public final kh7 a;
    public qq8 b;
    public final boolean c;
    public tc8 d;
    public final yz4 e;
    public final boolean f;
    public final int g;
    public final yz4 h;
    public ux0 i;
    public ux0 j;

    public uc8(qj0 qj0Var, kh7 kh7Var, pr8 pr8Var) {
        qj0Var.getClass();
        kh7Var.getClass();
        pr8Var.getClass();
        this.a = kh7Var;
        this.c = u70.Y(qj0Var);
        boolean z = false;
        this.e = new yz4(0);
        ij0 ij0Var = jj0.h;
        jj0 jj0Var = qj0Var.b;
        ij0Var.getClass();
        jj0Var.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 35 && nn.f(jj0Var)) {
            z = true;
        }
        this.f = z;
        int iD = i >= 35 ? nn.d(jj0Var) : 1;
        this.g = iD;
        if (i >= 35) {
            nn.e(jj0Var);
        }
        this.h = new yz4(Integer.valueOf(iD));
    }

    public static ux0 a(uc8 uc8Var, boolean z, int i) {
        int i2;
        Object objD;
        boolean z2 = (i & 2) != 0;
        kh7 kh7Var = uc8Var.a;
        hi5.i0("CXCP");
        ux0 ux0Var = new ux0();
        if (uc8Var.c) {
            qq8 qq8Var = uc8Var.b;
            if (qq8Var != null) {
                uc8Var.c(z ? 1 : 0);
                ux0 ux0Var2 = uc8Var.i;
                if (z2) {
                    if (ux0Var2 != null) {
                        p61.y("There is a new enableTorch being set", ux0Var2);
                    }
                    uc8Var.i = null;
                } else if (ux0Var2 != null) {
                    zc1.f0(ux0Var, ux0Var2);
                }
                uc8Var.i = ux0Var;
                Integer num = z ? 1 : null;
                synchronized (kh7Var.d) {
                    kh7Var.k = num;
                }
                kh7Var.f();
                List list = s7.b;
                s7 s7VarZ = i21.z(kh7Var.e());
                if (s7VarZ != null) {
                    i2 = s7VarZ.a;
                } else {
                    if (hi5.m0()) {
                        kh7Var.e();
                    }
                    i2 = 1;
                }
                if (z) {
                    if (z) {
                        Integer num2 = (Integer) uc8Var.h.d();
                        if (num2 != null) {
                            uc8Var.d(num2.intValue());
                        }
                    } else {
                        uc8Var.d(uc8Var.g);
                    }
                    objD = qq8Var.a();
                } else {
                    objD = qq8Var.d(i2);
                }
                b58 b58Var = new b58((byte) 5);
                objD.getClass();
                ((rm3) objD).D(new sn(objD, (Object) ux0Var, (Object) b58Var, (byte) 3));
            } else {
                p61.y("Camera is not active.", ux0Var);
            }
        } else {
            ux0Var.l0(new IllegalStateException("No flash unit"));
        }
        return ux0Var;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0019  */
    @Override // defpackage.kq8
    public final void b(qq8 qq8Var) {
        boolean z;
        this.b = qq8Var;
        if (this.d != null) {
            Integer num = (Integer) this.e.d();
            if (num != null) {
                z = num.intValue() == 1;
            }
            a(this, z, 4);
        }
    }

    public final void c(int i) {
        this.d = new tc8(i);
        int i2 = i != 1 ? 0 : 1;
        boolean zC = s08.c();
        yz4 yz4Var = this.e;
        if (zC) {
            yz4Var.j(Integer.valueOf(i2));
        } else {
            yz4Var.k(Integer.valueOf(i2));
        }
    }

    public final void d(int i) {
        xg1 xg1VarH;
        ux0 ux0Var = new ux0();
        if (Build.VERSION.SDK_INT < 35 || !this.f) {
            ux0Var.l0(new UnsupportedOperationException("Configuring torch strength is not supported on the device."));
            return;
        }
        ux0 ux0Var2 = this.j;
        if (ux0Var2 != null) {
            if (ux0Var2 != null) {
                p61.y("There is a new torch strength being set", ux0Var2);
            }
            this.j = null;
        }
        this.j = ux0Var;
        ux0Var.D(new py7((Object) this, (byte) 9));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        nn.g(linkedHashMap, i);
        qq8 qq8Var = this.b;
        if (qq8Var == null || (xg1VarH = qq8Var.h(linkedHashMap, oq8.b)) == null) {
            p61.y("Camera is not active.", ux0Var);
        } else {
            zc1.f0(xg1VarH, ux0Var);
        }
    }

    @Override // defpackage.kq8
    public final void reset() {
        ux0 ux0Var = this.i;
        if (ux0Var != null) {
            p61.y("There is a new enableTorch being set", ux0Var);
        }
        this.i = null;
        ux0 ux0Var2 = this.j;
        if (ux0Var2 != null) {
            p61.y("There is a new torch strength being set", ux0Var2);
        }
        this.j = null;
        if (this.d != null) {
            c(0);
            a(this, false, 6);
            this.d = null;
        }
    }
}
