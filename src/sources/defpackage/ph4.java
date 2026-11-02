package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final /* synthetic */ class ph4 implements sn2 {
    public final /* synthetic */ sf4 X;
    public final /* synthetic */ lf4 Y;
    public final /* synthetic */ cm5 Z;
    public final /* synthetic */ gn2 f0;
    public final /* synthetic */ int g0;
    public final /* synthetic */ oh2 h0;
    public final /* synthetic */ oh2 i0;
    public final /* synthetic */ oh2 j0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ph4(sf4 sf4Var, lf4 lf4Var, cm5 cm5Var, gn2 gn2Var, int i, oh2 oh2Var, oh2 oh2Var2, oh2 oh2Var3) {
        this.X = sf4Var;
        this.Y = lf4Var;
        this.Z = cm5Var;
        this.f0 = gn2Var;
        this.g0 = i;
        this.h0 = oh2Var;
        this.i0 = oh2Var2;
        this.j0 = oh2Var3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object x(Object obj, Object obj2, Object obj3) {
        lf4 lf4Var = this.Y;
        String str = lf4Var.b;
        lp2 lp2Var = (lp2) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((k44) obj).getClass();
        if (lp2Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
            FillElement fillElement = b.a;
            final sf4 sf4Var = this.X;
            boolean zF = dh3.f(sf4Var.g, str);
            final cm5 cm5Var = this.Z;
            Object obj4 = cm5Var.get(str);
            if (obj4 == null) {
                bt.q("Required value was null.");
                return null;
            }
            oh2 oh2Var = (oh2) obj4;
            boolean zF2 = lp2Var.f(sf4Var);
            final int i = this.g0;
            boolean zD = zF2 | lp2Var.d(i) | lp2Var.f(cm5Var);
            final oh2 oh2Var2 = this.h0;
            boolean zF3 = zD | lp2Var.f(oh2Var2);
            final oh2 oh2Var3 = this.i0;
            boolean zF4 = zF3 | lp2Var.f(oh2Var3);
            final oh2 oh2Var4 = this.j0;
            boolean zF5 = zF4 | lp2Var.f(oh2Var4);
            Object objK = lp2Var.K();
            if (zF5 || objK == zz0.a) {
                dn2 dn2Var = new dn2() { // from class: qh4
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
                    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
                    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
                    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
                    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
                    public final Object invoke() {
                        String str2;
                        boolean zA;
                        Boolean boolValueOf;
                        boolean zA2;
                        oh2 oh2Var5;
                        j2 j2Var = sf4Var.f;
                        int i2 = i;
                        lf4 lf4Var2 = (lf4) wv0.u0(i2 + 1, j2Var);
                        if (lf4Var2 == null || (str2 = lf4Var2.b) == null) {
                            lf4 lf4Var3 = (lf4) wv0.u0(i2 - 1, j2Var);
                            str2 = lf4Var3 != null ? lf4Var3.b : null;
                        }
                        if (str2 == null || (oh2Var5 = (oh2) cm5Var.get(str2)) == null) {
                            zA = oh2.a(oh2Var2);
                            boolValueOf = Boolean.valueOf(zA);
                            if (!zA) {
                                boolValueOf = null;
                            }
                            if (boolValueOf == null) {
                                zA2 = oh2.a(oh2Var3);
                                if ((zA2 ? Boolean.valueOf(zA2) : null) == null) {
                                    oh2.a(oh2Var4);
                                }
                            }
                        } else {
                            boolean zA3 = oh2.a(oh2Var5);
                            Boolean boolValueOf2 = Boolean.valueOf(zA3);
                            if (!zA3) {
                                boolValueOf2 = null;
                            }
                            if (boolValueOf2 == null) {
                                zA = oh2.a(oh2Var2);
                                boolValueOf = Boolean.valueOf(zA);
                                if (!zA) {
                                    boolValueOf = null;
                                }
                                if (boolValueOf == null) {
                                    zA2 = oh2.a(oh2Var3);
                                    if ((zA2 ? Boolean.valueOf(zA2) : null) == null) {
                                        oh2.a(oh2Var4);
                                    }
                                }
                            }
                        }
                        return dn8.a;
                    }
                };
                lp2Var.g0(dn2Var);
                objK = dn2Var;
            }
            jm4.j(lf4Var, oh2Var, this.f0, fillElement, (dn2) objK, zF, false, lp2Var, 3072, 64);
        } else {
            lp2Var.Q();
        }
        return dn8.a;
    }
}
