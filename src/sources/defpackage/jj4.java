package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jj4 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ kj4 Y;

    public /* synthetic */ jj4(kj4 kj4Var, byte b) {
        this.X = b;
        this.Y = kj4Var;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        kj4 kj4Var = this.Y;
        switch (b) {
            case 0:
                fi1 fi1Var = kj4Var.A0;
                if (fi1Var == null) {
                    fi1Var = yn0.Z(kj4Var).A0;
                    kj4Var.A0 = fi1Var;
                }
                long j = ((z85) kj4Var.q0.B(fi1Var)).a;
                if ((j & 9223372034707292159L) == 9205357640488583168L || (9223372034707292159L & kj4Var.Y0()) == 9205357640488583168L) {
                    kj4Var.E0 = 9205357640488583168L;
                    vo5 vo5Var = kj4Var.B0;
                    if (vo5Var != null) {
                        ((xo5) vo5Var).b();
                    }
                } else {
                    kj4Var.E0 = z85.f(kj4Var.Y0(), j);
                    vo5 vo5Var2 = kj4Var.B0;
                    if (vo5Var2 == null) {
                        if (vo5Var2 != null) {
                            ((xo5) vo5Var2).b();
                        }
                        View viewS = kj4Var.z0;
                        if (viewS == null) {
                            viewS = ys0.S(kj4Var);
                        }
                        View view = viewS;
                        kj4Var.z0 = view;
                        fi1 fi1Var2 = kj4Var.A0;
                        if (fi1Var2 == null) {
                            fi1Var2 = yn0.Z(kj4Var).A0;
                        }
                        kj4Var.A0 = fi1Var2;
                        kj4Var.B0 = kj4Var.y0.a(view, kj4Var.t0, kj4Var.u0, kj4Var.v0, kj4Var.w0, kj4Var.x0, fi1Var2, kj4Var.s0);
                        kj4Var.Z0();
                    }
                    vo5 vo5Var3 = kj4Var.B0;
                    if (vo5Var3 != null) {
                        vo5Var3.a(kj4Var.E0, 9205357640488583168L, kj4Var.s0);
                    }
                    kj4Var.Z0();
                }
                return dn8.a;
            case 1:
                return new z85(kj4Var.E0);
            default:
                y24 y24Var = (y24) kj4Var.C0.getValue();
                return new z85(y24Var != null ? y24Var.I(0L) : 9205357640488583168L);
        }
    }
}
