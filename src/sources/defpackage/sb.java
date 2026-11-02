package defpackage;

import android.os.Build;
import android.view.SoundEffectConstants;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.platform.AndroidComposeView;
import su.happ.proxyutility.domain.sub.SubId;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sb implements rn2 {
    public final /* synthetic */ byte X;
    public final Object Y;

    public /* synthetic */ sb(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        byte b = this.X;
        be beVar = zz0.a;
        hx4 hx4Var = hx4.X;
        dn8 dn8Var = dn8.a;
        Object obj3 = this.Y;
        switch (b) {
            case 0:
                int i = ((ug2) obj).a;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                Integer numB = ah2.b(i);
                if (numB != null) {
                    int iIntValue = numB.intValue();
                    ((AndroidComposeView) obj3).playSoundEffect(Build.VERSION.SDK_INT >= 31 ? jn.a.a(iIntValue, zBooleanValue) : SoundEffectConstants.getContantForFocusDirection(iIntValue));
                }
                break;
            case 1:
                lp2 lp2Var = (lp2) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                lr lrVar = (lr) obj3;
                if (!lp2Var.N(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    lp2Var.Q();
                } else {
                    String strB = w79.B(a56.m3c_dialog, lp2Var);
                    ig5 ig5Var = n8.a;
                    kx4 kx4VarJ = b.j(hx4Var, 280.0f, 0.0f, 560.0f, 10);
                    boolean zF = lp2Var.f(strB);
                    Object objK = lp2Var.K();
                    if (zF || objK == beVar) {
                        objK = new m40(strB, (byte) 1);
                        lp2Var.g0(objK);
                    }
                    kx4 kx4VarY = kx4VarJ.y(v07.a(hx4Var, false, (gn2) objK));
                    xr4 xr4VarC = g80.c(pz2.Z, true);
                    int I = km4.I(lp2Var);
                    kl5 kl5VarL = lp2Var.l();
                    kx4 kx4VarQ = w45.Q(lp2Var, kx4VarY);
                    uz0.j.getClass();
                    lp2Var.Z();
                    if (lp2Var.S) {
                        lp2Var.k();
                    } else {
                        lp2Var.j0();
                    }
                    pn7.m(pz2.B0, lp2Var, xr4VarC);
                    pn7.m(pz2.A0, lp2Var, kl5VarL);
                    dx0 dx0Var = pz2.C0;
                    if (lp2Var.S || !dh3.f(lp2Var.K(), Integer.valueOf(I))) {
                        p61.v(I, lp2Var, I, dx0Var);
                    }
                    pn7.m(pz2.z0, lp2Var, kx4VarQ);
                    ((zy0) lrVar.f0).K(lp2Var, 0);
                    lp2Var.p(true);
                }
                break;
            case 2:
                lp2 lp2Var2 = (lp2) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!lp2Var2.N(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    lp2Var2.Q();
                } else {
                    o50 o50Var = pz2.o0;
                    sn2 sn2Var = ((ma7) obj3).f;
                    wq6 wq6VarA = vq6.a(ht.b, o50Var, lp2Var2, 54);
                    int I2 = km4.I(lp2Var2);
                    kl5 kl5VarL2 = lp2Var2.l();
                    kx4 kx4VarQ2 = w45.Q(lp2Var2, hx4Var);
                    uz0.j.getClass();
                    lp2Var2.Z();
                    if (lp2Var2.S) {
                        lp2Var2.k();
                    } else {
                        lp2Var2.j0();
                    }
                    pn7.m(pz2.B0, lp2Var2, wq6VarA);
                    pn7.m(pz2.A0, lp2Var2, kl5VarL2);
                    dx0 dx0Var2 = pz2.C0;
                    if (lp2Var2.S || !dh3.f(lp2Var2.K(), Integer.valueOf(I2))) {
                        p61.v(I2, lp2Var2, I2, dx0Var2);
                    }
                    pn7.m(pz2.z0, lp2Var2, kx4VarQ2);
                    sn2Var.x(xq6.a, lp2Var2, 6);
                    lp2Var2.p(true);
                }
                break;
            case 3:
                String value = ((SubId) obj).getValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                value.getClass();
                ((MainActivity) obj3).G().B(value, zBooleanValue2);
                break;
            case 4:
                lp2 lp2Var3 = (lp2) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!lp2Var3.N(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    lp2Var3.Q();
                } else {
                    Object objK2 = lp2Var3.K();
                    if (objK2 == beVar) {
                        objK2 = new dx4((byte) 0);
                        lp2Var3.g0(objK2);
                    }
                    kx4 kx4VarA = v07.a(hx4Var, false, (gn2) objK2);
                    y05 y05Var = (y05) obj3;
                    xr4 xr4VarC2 = g80.c(pz2.Z, false);
                    int I3 = km4.I(lp2Var3);
                    kl5 kl5VarL3 = lp2Var3.l();
                    kx4 kx4VarQ3 = w45.Q(lp2Var3, kx4VarA);
                    uz0.j.getClass();
                    lp2Var3.Z();
                    if (lp2Var3.S) {
                        lp2Var3.k();
                    } else {
                        lp2Var3.j0();
                    }
                    pn7.m(pz2.B0, lp2Var3, xr4VarC2);
                    pn7.m(pz2.A0, lp2Var3, kl5VarL3);
                    dx0 dx0Var3 = pz2.C0;
                    if (lp2Var3.S || !dh3.f(lp2Var3.K(), Integer.valueOf(I3))) {
                        p61.v(I3, lp2Var3, I3, dx0Var3);
                    }
                    pn7.m(pz2.z0, lp2Var3, kx4VarQ3);
                    ((rn2) y05Var.getValue()).K(lp2Var3, 0);
                    lp2Var3.p(true);
                }
                break;
            default:
                lp2 lp2Var4 = (lp2) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (!lp2Var4.N(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    lp2Var4.Q();
                } else {
                    u78.b((String) obj3, null, 0L, null, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, lp2Var4, 0, 0, 262142);
                }
                break;
        }
        return dn8Var;
    }
}
