package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.domain.routing.entity.GeoFileKey;
import su.happ.proxyutility.domain.routing.entity.StateDownloadFileV2;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gr2 {
    public static final void a(final GeoFileKey geoFileKey, StateDownloadFileV2.Error error, final gn2 gn2Var, kx4 kx4Var, lp2 lp2Var, int i) {
        int i2;
        final gn2 gn2Var2;
        int i3;
        final byte b;
        lp2 lp2Var2 = lp2Var;
        lp2Var2.X(1977879011);
        if ((i & 6) == 0) {
            i2 = (lp2Var2.f(geoFileKey) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var2.f(error) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var2.h(gn2Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= lp2Var2.f(kx4Var) ? 2048 : 1024;
        }
        if (lp2Var2.N(i2 & 1, (i2 & 1171) != 1170)) {
            tw0 tw0VarA = rw0.a(new ft(16.0f, new bt()), pz2.q0, lp2Var2, 6);
            int iHashCode = Long.hashCode(lp2Var2.T);
            kl5 kl5VarL = lp2Var2.l();
            kx4 kx4VarQ = w45.Q(lp2Var2, kx4Var);
            uz0.j.getClass();
            lp2Var2.Z();
            if (lp2Var2.S) {
                lp2Var2.k();
            } else {
                lp2Var2.j0();
            }
            dx0 dx0Var = pz2.B0;
            pn7.m(dx0Var, lp2Var2, tw0VarA);
            dx0 dx0Var2 = pz2.A0;
            pn7.m(dx0Var2, lp2Var2, kl5VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            dx0 dx0Var3 = pz2.C0;
            pn7.m(dx0Var3, lp2Var2, numValueOf);
            pn7.l(lp2Var2);
            dx0 dx0Var4 = pz2.z0;
            pn7.m(dx0Var4, lp2Var2, kx4VarQ);
            FillElement fillElement = b.a;
            if (error instanceof StateDownloadFileV2.Error.Failure) {
                i3 = y46.geo_file_download_failure;
            } else {
                if (!(error instanceof StateDownloadFileV2.Error.LinkNotCorrect)) {
                    b61.c();
                    return;
                }
                i3 = y46.geo_file_download_link_not_correct;
            }
            int i4 = i2;
            zc1.g(vj8.j0(i3, lp2Var2), fillElement, o88.a(ys0.D(lp2Var2).d, ys0.y(lp2Var2).c.c, 0L, null, null, 0L, 0L, null, 16777214), 0, 0, 0, 0, false, null, lp2Var2, 48, 504);
            wq6 wq6VarA = vq6.a(new ft(8.0f, new bt()), pz2.n0, lp2Var2, 6);
            int iHashCode2 = Long.hashCode(lp2Var2.T);
            kl5 kl5VarL2 = lp2Var2.l();
            kx4 kx4VarQ2 = w45.Q(lp2Var2, fillElement);
            lp2Var2.Z();
            if (lp2Var2.S) {
                lp2Var2.k();
            } else {
                lp2Var2.j0();
            }
            pn7.m(dx0Var, lp2Var2, wq6VarA);
            pn7.m(dx0Var2, lp2Var2, kl5VarL2);
            oi0.u(iHashCode2, lp2Var2, dx0Var3, lp2Var2);
            pn7.m(dx0Var4, lp2Var2, kx4VarQ2);
            kx4 kx4VarF = u15.f(new d44(1.0f, true), ys0.y(lp2Var2).g.i, u70.e);
            ig5 ig5Var = new ig5(16.0f, 16.0f, 16.0f, 16.0f);
            o88 o88VarA = o88.a(ys0.D(lp2Var2).c, 0L, 0L, dj2.f0, null, 0L, 0L, null, 16777211);
            String strJ0 = vj8.j0(y46.geo_file_download_open_profile, lp2Var2);
            long j = ys0.y(lp2Var2).g.e;
            long j2 = ys0.y(lp2Var2).g.i;
            dw0 dw0Var = new dw0(j);
            dw0 dw0Var2 = new dw0(j2);
            int i5 = i4 & 896;
            int i6 = i4 & 14;
            boolean z = (i6 == 4) | (i5 == 256);
            Object objK = lp2Var2.K();
            be beVar = zz0.a;
            if (z || objK == beVar) {
                b = 0;
                objK = new dn2() { // from class: fr2
                    @Override // defpackage.dn2
                    public final Object invoke() {
                        byte b2 = b;
                        dn8 dn8Var = dn8.a;
                        GeoFileKey geoFileKey2 = geoFileKey;
                        gn2 gn2Var3 = gn2Var;
                        switch (b2) {
                            case 0:
                                String profileId = geoFileKey2.getProfileId();
                                profileId.getClass();
                                gn2Var3.B(new wq2(profileId));
                                break;
                            default:
                                gn2Var3.B(new xq2(geoFileKey2));
                                break;
                        }
                        return dn8Var;
                    }
                };
                lp2Var2.g0(objK);
            } else {
                b = 0;
            }
            byte b2 = b;
            gn2Var2 = gn2Var;
            km4.e(strJ0, kx4VarF, false, false, o88VarA, 0, 0, 1, 0, false, ig5Var, null, dw0Var, null, dw0Var2, null, (dn2) objK, lp2Var, 12582912, 486252);
            String strJ1 = vj8.j0(y46.geo_file_download_retry, lp2Var);
            long j3 = ys0.y(lp2Var).g.e;
            long j4 = ys0.y(lp2Var).g.i;
            dw0 dw0Var3 = new dw0(j3);
            dw0 dw0Var4 = new dw0(j4);
            byte b3 = i5 == 256 ? (byte) 1 : b2;
            if (i6 == 4) {
                b2 = 1;
            }
            int i7 = b3 | b2;
            Object objK2 = lp2Var.K();
            if (i7 != 0 || objK2 == beVar) {
                final byte b4 = 1;
                objK2 = new dn2() { // from class: fr2
                    @Override // defpackage.dn2
                    public final Object invoke() {
                        byte b5 = b4;
                        dn8 dn8Var = dn8.a;
                        GeoFileKey geoFileKey2 = geoFileKey;
                        gn2 gn2Var3 = gn2Var2;
                        switch (b5) {
                            case 0:
                                String profileId = geoFileKey2.getProfileId();
                                profileId.getClass();
                                gn2Var3.B(new wq2(profileId));
                                break;
                            default:
                                gn2Var3.B(new xq2(geoFileKey2));
                                break;
                        }
                        return dn8Var;
                    }
                };
                lp2Var.g0(objK2);
            }
            km4.e(strJ1, kx4VarF, false, false, o88VarA, 0, 0, 1, 0, false, ig5Var, null, dw0Var3, null, dw0Var4, null, (dn2) objK2, lp2Var, 12582912, 486252);
            lp2Var2 = lp2Var;
            lp2Var2.p(true);
            lp2Var2.p(true);
        } else {
            gn2Var2 = gn2Var;
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new i40(geoFileKey, error, gn2Var2, kx4Var, i, (byte) 2);
        }
    }

    public static final void b(ir2 ir2Var, kx4 kx4Var, lp2 lp2Var, int i) {
        int i2;
        lp2 lp2Var2 = lp2Var;
        lp2Var2.X(1734850066);
        if ((i & 6) == 0) {
            i2 = i | (lp2Var2.f(ir2Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var2.f(kx4Var) ? 32 : 16;
        }
        if (lp2Var2.N(i2 & 1, (i2 & 19) != 18)) {
            tw0 tw0VarA = rw0.a(new ft(4.0f, new bt()), pz2.q0, lp2Var2, 6);
            int iHashCode = Long.hashCode(lp2Var2.T);
            kl5 kl5VarL = lp2Var2.l();
            kx4 kx4VarQ = w45.Q(lp2Var2, kx4Var);
            uz0.j.getClass();
            lp2Var2.Z();
            if (lp2Var2.S) {
                lp2Var2.k();
            } else {
                lp2Var2.j0();
            }
            pn7.m(pz2.B0, lp2Var2, tw0VarA);
            pn7.m(pz2.A0, lp2Var2, kl5VarL);
            pn7.m(pz2.C0, lp2Var2, Integer.valueOf(iHashCode));
            pn7.l(lp2Var2);
            pn7.m(pz2.z0, lp2Var2, kx4VarQ);
            FillElement fillElement = b.a;
            String str = ir2Var.e;
            ox1 ox1Var = es.a;
            o88 o88Var = ((ds) lp2Var2.j(ox1Var)).b;
            ox1 ox1Var2 = ep.z;
            long j = ((dp) lp2Var2.j(ox1Var2)).c.a;
            dj2 dj2Var = dj2.f0;
            zc1.g(str, fillElement, o88.a(o88Var, j, 0L, dj2Var, null, 0L, 0L, null, 16777210), 0, 0, 1, 0, false, null, lp2Var, 196656, 472);
            lp2Var2 = lp2Var;
            ol olVar = new ol();
            olVar.b(vj8.j0(y46.geo_file_download_item_profile, lp2Var2));
            olVar.b(": ");
            int iD = olVar.d(new qe7(0L, 0L, dj2Var, (bj2) null, (cj2) null, (gi2) null, (String) null, 0L, (x20) null, (g78) null, (ge4) null, 0L, (x38) null, (t67) null, 65531));
            try {
                olVar.b(ir2Var.c);
                olVar.c(iD);
                zc1.f(olVar.e(), fillElement, o88.a(((ds) lp2Var2.j(ox1Var)).d, ((dp) lp2Var2.j(ox1Var2)).c.c, 0L, null, null, 0L, 0L, null, 16777214), 0, 0, 1, 0, false, lp2Var2, 196656, 216);
                lp2Var2.W(-772759061);
                ol olVar2 = new ol();
                olVar2.b(vj8.j0(y46.geo_file_download_item_subscription, lp2Var2));
                olVar2.b(": ");
                lp2Var2.W(-772754301);
                int iD2 = olVar2.d(new qe7(0L, 0L, dj2Var, (bj2) null, (cj2) null, (gi2) null, (String) null, 0L, (x20) null, (g78) null, (ge4) null, 0L, (x38) null, (t67) null, 65531));
                try {
                    String strJ0 = ir2Var.d;
                    if (strJ0 == null) {
                        lp2Var2.W(1154611757);
                        strJ0 = vj8.j0(y46.title_server_list, lp2Var2);
                    } else {
                        lp2Var2.W(1154609804);
                    }
                    lp2Var2.p(false);
                    olVar2.b(strJ0);
                    olVar2.c(iD2);
                    lp2Var2.p(false);
                    ql qlVarE = olVar2.e();
                    lp2Var2.p(false);
                    zc1.f(qlVarE, fillElement, o88.a(((ds) lp2Var2.j(ox1Var)).d, ((dp) lp2Var2.j(ox1Var2)).c.c, 0L, null, null, 0L, 0L, null, 16777214), 0, 0, 1, 0, false, lp2Var2, 196656, 216);
                    lp2Var2.p(true);
                } catch (Throwable th) {
                    olVar2.c(iD2);
                    throw th;
                }
            } catch (Throwable th2) {
                olVar.c(iD);
                throw th2;
            }
        } else {
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new sl((byte) 4, i, ir2Var, kx4Var);
        }
    }

    public static final void c(ir2 ir2Var, gn2 gn2Var, kx4 kx4Var, lp2 lp2Var, int i) {
        StateDownloadFileV2 stateDownloadFileV2 = ir2Var.b;
        gn2Var.getClass();
        lp2Var.X(-265945755);
        int i2 = i | (lp2Var.f(ir2Var) ? 4 : 2) | (lp2Var.h(gn2Var) ? 32 : 16) | (lp2Var.f(kx4Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (lp2Var.N(i2 & 1, (i2 & 147) != 146)) {
            kx4 kx4VarE = g33.e(kx4Var);
            tw0 tw0VarA = rw0.a(ht.c, pz2.q0, lp2Var, 0);
            int iHashCode = Long.hashCode(lp2Var.T);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, kx4VarE);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            dx0 dx0Var = pz2.B0;
            pn7.m(dx0Var, lp2Var, tw0VarA);
            dx0 dx0Var2 = pz2.A0;
            pn7.m(dx0Var2, lp2Var, kl5VarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            dx0 dx0Var3 = pz2.C0;
            pn7.m(dx0Var3, lp2Var, numValueOf);
            pn7.l(lp2Var);
            dx0 dx0Var4 = pz2.z0;
            pn7.m(dx0Var4, lp2Var, kx4VarQ);
            FillElement fillElement = b.a;
            wq6 wq6VarA = vq6.a(new ft(8.0f, new bt()), pz2.o0, lp2Var, 54);
            int iHashCode2 = Long.hashCode(lp2Var.T);
            kl5 kl5VarL2 = lp2Var.l();
            kx4 kx4VarQ2 = w45.Q(lp2Var, fillElement);
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(dx0Var, lp2Var, wq6VarA);
            pn7.m(dx0Var2, lp2Var, kl5VarL2);
            oi0.u(iHashCode2, lp2Var, dx0Var3, lp2Var);
            pn7.m(dx0Var4, lp2Var, kx4VarQ2);
            e(stateDownloadFileV2, b.g(hx4.X, 24.0f), lp2Var, 48);
            b(ir2Var, new d44(1.0f, true), lp2Var, i2 & 14);
            lp2Var.p(true);
            kx4 kx4VarA = os4.A(fillElement, 0.0f, 16.0f, 0.0f, 0.0f, 13);
            if (stateDownloadFileV2 instanceof StateDownloadFileV2.Error) {
                lp2Var.W(922210628);
                a(ir2Var.a, (StateDownloadFileV2.Error) stateDownloadFileV2, gn2Var, kx4VarA, lp2Var, ((i2 << 3) & 896) | 3072);
                lp2Var.p(false);
            } else if (stateDownloadFileV2 instanceof StateDownloadFileV2.Loading) {
                lp2Var.W(922218886);
                d((StateDownloadFileV2.Loading) stateDownloadFileV2, kx4VarA, lp2Var, 48);
                lp2Var.p(false);
            } else {
                if (!(stateDownloadFileV2 instanceof StateDownloadFileV2.Success)) {
                    lp2Var.W(922207700);
                    lp2Var.p(false);
                    b61.c();
                    return;
                }
                lp2Var.W(922224120);
                lp2Var.p(false);
            }
            lp2Var.p(true);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new fh(ir2Var, gn2Var, kx4Var, i, (byte) 2);
        }
    }

    public static final void d(StateDownloadFileV2.Loading loading, kx4 kx4Var, lp2 lp2Var, int i) {
        lp2Var.X(-1605496002);
        int i2 = (lp2Var.f(loading) ? 4 : 2) | i;
        if (lp2Var.N(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object objK = lp2Var.K();
            be beVar = zz0.a;
            dn2 dn2Var = null;
            if (z || objK == beVar) {
                loading.getClass();
                objK = loading instanceof StateDownloadFileV2.Loading.Progress ? (StateDownloadFileV2.Loading.Progress) loading : null;
                lp2Var.g0(objK);
            }
            StateDownloadFileV2.Loading.Progress progress = (StateDownloadFileV2.Loading.Progress) objK;
            tw0 tw0VarA = rw0.a(new ft(8.0f, new bt()), pz2.q0, lp2Var, 6);
            int iHashCode = Long.hashCode(lp2Var.T);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, kx4Var);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(pz2.B0, lp2Var, tw0VarA);
            pn7.m(pz2.A0, lp2Var, kl5VarL);
            pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode));
            pn7.l(lp2Var);
            pn7.m(pz2.z0, lp2Var, kx4VarQ);
            FillElement fillElement = b.a;
            Integer progress2 = progress != null ? progress.getProgress() : null;
            if (progress2 == null) {
                lp2Var.W(-777269212);
            } else {
                lp2Var.W(-777269211);
                int iIntValue = progress2.intValue();
                boolean zD = lp2Var.d(iIntValue);
                Object objK2 = lp2Var.K();
                if (zD || objK2 == beVar) {
                    objK2 = new th2((byte) 1, iIntValue);
                    lp2Var.g0(objK2);
                }
                dn2Var = (dn2) objK2;
            }
            lp2Var.p(false);
            hi5.K(fillElement, dn2Var, ((dp) lp2Var.j(ep.z)).l.b, lp2Var);
            zc1.d(progress != null, fillElement, null, null, null, jm4.U(-16323920, new m30(progress, (byte) 4), lp2Var), lp2Var, 1573254);
            lp2Var.p(true);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new i9((byte) 11, i, loading, kx4Var);
        }
    }

    public static final void e(StateDownloadFileV2 stateDownloadFileV2, kx4 kx4Var, lp2 lp2Var, int i) {
        lp2Var.X(-1891832412);
        int i2 = (lp2Var.f(stateDownloadFileV2) ? 4 : 2) | i;
        if (!lp2Var.N(i2 & 1, (i2 & 19) != 18)) {
            lp2Var.Q();
        } else if (stateDownloadFileV2 instanceof StateDownloadFileV2.Error) {
            lp2Var.W(-1279777156);
            os4.a(u28.p(q36.ic_error, lp2Var), kx4Var, vj8.j0(y46.toast_failure, lp2Var), 0L, lp2Var, 48, 8);
            lp2Var.p(false);
        } else if (stateDownloadFileV2 instanceof StateDownloadFileV2.Success) {
            lp2Var.W(-1279769986);
            os4.a(u28.p(q36.ic_success, lp2Var), kx4Var, vj8.j0(y46.toast_success, lp2Var), 0L, lp2Var, 48, 8);
            lp2Var.p(false);
        } else if (!(stateDownloadFileV2 instanceof StateDownloadFileV2.Loading)) {
            lp2Var.W(-1279778425);
            lp2Var.p(false);
            b61.c();
            return;
        } else {
            lp2Var.W(-1279762896);
            mb6.c(kx4Var, lp2Var, 6);
            lp2Var.p(false);
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new i9((byte) 10, i, stateDownloadFileV2, kx4Var);
        }
    }
}
