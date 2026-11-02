package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.google.android.material.slider.Slider;
import java.util.Collections;
import java.util.Map;
import su.happ.proxyutility.domain.routing.entity.StateDownloadFileV2;
import su.happ.proxyutility.feature.ping.PingSettingsActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m30 implements sn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ m30(q15 q15Var, p15 p15Var) {
        this.X = (byte) 5;
        this.Y = q15Var;
    }

    @Override // defpackage.sn2
    public final Object x(Object obj, Object obj2, Object obj3) {
        int iX0;
        byte b = this.X;
        byte b2 = 2;
        boolean z = true;
        byte b3 = 0;
        dn8 dn8Var = dn8.a;
        Object obj4 = this.Y;
        switch (b) {
            case 0:
                zr4 zr4Var = (zr4) obj;
                tr4 tr4Var = (tr4) obj2;
                float f = ((kt1) ((y78) obj4).f.getValue()).X;
                int iX1 = zr4Var.x0(f);
                eo5 eo5VarO = tr4Var.o(s31.e(((q31) obj3).a, s31.a(0, Integer.MAX_VALUE, iX1, kt1.b(f, 0.0f) ? Integer.MAX_VALUE : iX1)));
                return zr4Var.g0(eo5VarO.X, eo5VarO.Y, e02.X, new d1(eo5VarO, b2));
            case 1:
                return new p90(obj3, (x90) obj4, (tz6) obj, b3);
            case 2:
                ((vj2) obj4).B((Throwable) obj);
                return dn8Var;
            case 3:
                ((gn2) obj4).B(new z85(((hq5) obj2).c));
                return dn8Var;
            case 4:
                StateDownloadFileV2.Loading.Progress progress = (StateDownloadFileV2.Loading.Progress) obj4;
                lp2 lp2Var = (lp2) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ek) obj).getClass();
                if (!lp2Var.N(iIntValue & 1, (iIntValue & 17) != 16)) {
                    lp2Var.Q();
                } else if (progress != null) {
                    lp2Var.W(-974514244);
                    FillElement fillElement = b.a;
                    wq6 wq6VarA = vq6.a(new ft(8.0f, new bt()), pz2.n0, lp2Var, 6);
                    int iHashCode = Long.hashCode(lp2Var.T);
                    kl5 kl5VarL = lp2Var.l();
                    kx4 kx4VarQ = w45.Q(lp2Var, fillElement);
                    uz0.j.getClass();
                    lp2Var.Z();
                    if (lp2Var.S) {
                        lp2Var.k();
                    } else {
                        lp2Var.j0();
                    }
                    pn7.m(pz2.B0, lp2Var, wq6VarA);
                    pn7.m(pz2.A0, lp2Var, kl5VarL);
                    pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode));
                    pn7.l(lp2Var);
                    pn7.m(pz2.z0, lp2Var, kx4VarQ);
                    kx4 kx4VarA = xq6.a();
                    String strG = x79.g(progress.getDownloadBytes());
                    Long lE = progress.getTotalBytes();
                    String strG2 = lE != null ? x79.g(lE.longValue()) : null;
                    if (strG2 == null) {
                        lp2Var.W(-1843348495);
                        strG2 = vj8.j0(y46.unknown, lp2Var);
                    } else {
                        lp2Var.W(-1843351068);
                    }
                    lp2Var.p(false);
                    String strP = pc6.p(strG, " / ", strG2);
                    ox1 ox1Var = es.a;
                    o88 o88Var = ((ds) lp2Var.j(ox1Var)).d;
                    ox1 ox1Var2 = ep.z;
                    zc1.g(strP, kx4VarA, o88.a(o88Var, ((dp) lp2Var.j(ox1Var2)).c.c, 0L, null, null, 0L, 0L, null, 16777214), 5, 0, 1, 0, false, null, lp2Var, 196608, 464);
                    if (progress.getProgress() != null) {
                        lp2Var.W(-1308918588);
                        zc1.g(progress.getProgress() + "%", xq6.a(), o88.a(((ds) lp2Var.j(ox1Var)).d, ((dp) lp2Var.j(ox1Var2)).c.c, 0L, null, null, 0L, 0L, null, 16777214), 6, 0, 1, 0, false, null, lp2Var, 196608, 464);
                        lp2Var.p(false);
                    } else {
                        lp2Var.W(-1308484495);
                        lp2Var.p(false);
                    }
                    lp2Var.p(true);
                    lp2Var.p(false);
                } else {
                    lp2Var.W(-973232270);
                    lp2Var.p(false);
                }
                return dn8Var;
            case 5:
                q15 q15Var = (q15) obj4;
                q15.k0.set(q15Var, null);
                q15Var.m(null);
                return dn8Var;
            case 6:
                float fFloatValue = ((Float) obj2).floatValue();
                ((Boolean) obj3).getClass();
                int i = PingSettingsActivity.U0;
                ((Slider) obj).getClass();
                ((PingSettingsActivity) obj4).A().l((int) fFloatValue, "pref_proxy_ping_timeout");
                return dn8Var;
            case 7:
                ((j17) obj4).c();
                return dn8Var;
            case 8:
                wb7 wb7Var = (wb7) obj4;
                zr4 zr4Var2 = (zr4) obj;
                eo5 eo5VarO2 = ((tr4) obj2).o(((q31) obj3).a);
                if (kt1.b(Float.NaN, Float.NaN)) {
                    iX0 = wb7Var.n0 == sd5.X ? eo5VarO2.X / 2 : eo5VarO2.Y / 2;
                } else {
                    iX0 = zr4Var2.x0(Float.NaN);
                }
                int i2 = eo5VarO2.X;
                int i3 = eo5VarO2.Y;
                Map mapSingletonMap = Collections.singletonMap(vb7.f, Integer.valueOf(iX0));
                mapSingletonMap.getClass();
                return zr4Var2.g0(i2, i3, mapSingletonMap, new d1(eo5VarO2, (byte) 12));
            case 9:
                pv3 pv3Var = (pv3) obj4;
                fu7 fu7Var = (fu7) obj;
                lp2 lp2Var2 = (lp2) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                fu7Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= lp2Var2.f(fu7Var) ? (byte) 4 : (byte) 2;
                }
                if (lp2Var2.N(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    eu7.a(fu7Var, (gn2) pv3Var, b.c, lp2Var2, (iIntValue2 & 14) | 384);
                } else {
                    lp2Var2.Q();
                }
                return dn8Var;
            default:
                y48 y48Var = (y48) obj4;
                int iIntValue3 = ((Integer) obj).intValue();
                int iIntValue4 = ((Integer) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                kd8 kd8Var = y48Var.s0;
                h48 h48VarC = zBooleanValue ? kd8Var.a.c() : kd8Var.d();
                long j = h48VarC.f0;
                if (!y48Var.w0 || Math.min(iIntValue3, iIntValue4) < 0 || Math.max(iIntValue3, iIntValue4) > h48VarC.Z.length()) {
                    z = false;
                } else {
                    int i4 = f88.c;
                    if (iIntValue3 != ((int) (j >> 32)) || iIntValue4 != ((int) (j & 4294967295L))) {
                        long jC = ct7.c(iIntValue3, iIntValue4);
                        if (zBooleanValue || iIntValue3 == iIntValue4) {
                            y48Var.u0.y(s88.X);
                        } else {
                            y48Var.u0.y(s88.Z);
                        }
                        kd8 kd8Var2 = y48Var.s0;
                        if (zBooleanValue) {
                            kd8Var2.k(jC);
                        } else {
                            kd8Var2.j(jC);
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ m30(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }
}
