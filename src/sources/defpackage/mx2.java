package defpackage;

import android.os.ParcelFileDescriptor;
import libxray.Libxray;
import libxray.XRayPoint;
import su.happ.proxyutility.dto.ServerConfig;
import su.happ.proxyutility.dto.SubscriptionItem;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mx2 implements rn2 {
    public final /* synthetic */ byte X = 1;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;
    public final /* synthetic */ Object h0;

    public /* synthetic */ mx2(ev2 ev2Var, da6 da6Var, da6 da6Var2, r68 r68Var, boolean z) {
        this.Z = da6Var;
        this.f0 = r68Var;
        this.g0 = ev2Var;
        this.h0 = da6Var2;
        this.Y = z;
    }

    @Override // defpackage.rn2
    public final Object K(Object obj, Object obj2) {
        int iF;
        int iF2;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        Object obj3 = this.h0;
        Object obj4 = this.g0;
        Object obj5 = this.f0;
        Object obj6 = this.Z;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = w79.P(3073);
                z68.e((ox2) obj6, this.Y, (dn2) obj5, (kx4) obj4, (ig5) obj3, (lp2) obj, iP);
                break;
            case 1:
                da6 da6Var = (da6) obj6;
                r68 r68Var = (r68) obj5;
                ev2 ev2Var = (ev2) obj4;
                da6 da6Var2 = (da6) obj3;
                da6Var.X = z85.f(da6Var.X, ((z85) obj2).a);
                y78 y78Var = r68Var.b;
                kd8 kd8Var = r68Var.a;
                x78 x78VarC = y78Var.c();
                if (x78VarC != null) {
                    bz4 bz4Var = x78VarC.b;
                    r68Var.B(ev2Var, z85.f(da6Var2.X, da6Var.X));
                    boolean z = this.Y;
                    if (z) {
                        iF = bz4Var.f(r68Var.n());
                    } else {
                        long j = kd8Var.d().f0;
                        int i = f88.c;
                        iF = (int) (j >> 32);
                    }
                    int i2 = iF;
                    if (z) {
                        long j2 = kd8Var.d().f0;
                        int i3 = f88.c;
                        iF2 = (int) (j2 & 4294967295L);
                    } else {
                        iF2 = bz4Var.f(r68Var.n());
                    }
                    int i4 = iF2;
                    long j3 = kd8Var.d().f0;
                    long jC = r68Var.C(kd8Var.d(), i2, i4, z, lh4.D0, false, false, new fz2(9));
                    if (f88.b(j3) || !f88.b(jC)) {
                        kd8Var.j(jC);
                    }
                }
                break;
            default:
                SubscriptionItem subscriptionItem = (SubscriptionItem) obj6;
                ServerConfig serverConfig = (ServerConfig) obj5;
                h69 h69Var = (h69) obj4;
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj3;
                String str = (String) obj;
                String str2 = (String) obj2;
                XRayPoint xRayPoint = n69.a;
                str.getClass();
                n69.i = new c68((byte) 7);
                if (subscriptionItem == null || !subscriptionItem.G()) {
                    Libxray.enableWrapperLogs();
                    xRayPoint.getLogWriter().enable();
                } else {
                    Libxray.disableWrapperLogs();
                    xRayPoint.getLogWriter().disable();
                }
                m51 m51Var = n69.b;
                nf1 nf1Var = tp1.a;
                jm4.Q(m51Var, dm4.a, new m69(str, str2, serverConfig, h69Var, this.Y, parcelFileDescriptor, null), 2);
                break;
        }
        return dn8Var;
    }

    public /* synthetic */ mx2(ox2 ox2Var, boolean z, dn2 dn2Var, kx4 kx4Var, ig5 ig5Var, int i) {
        this.Z = ox2Var;
        this.Y = z;
        this.f0 = dn2Var;
        this.g0 = kx4Var;
        this.h0 = ig5Var;
    }

    public /* synthetic */ mx2(SubscriptionItem subscriptionItem, ServerConfig serverConfig, h69 h69Var, boolean z, ParcelFileDescriptor parcelFileDescriptor) {
        this.Z = subscriptionItem;
        this.f0 = serverConfig;
        this.g0 = h69Var;
        this.Y = z;
        this.h0 = parcelFileDescriptor;
    }
}
