package su.happ.proxyutility.firebase;

import defpackage.ad6;
import defpackage.kd6;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsu/happ/proxyutility/firebase/FirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "app"}, k = XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.cwndMultiplierMin, mv = {XRayConfig.OutboundBean.StreamSettingsBean.HysteriaSettingsBean.udpIdleTimeoutMin, 4, 0}, xi = 48)
public final class FirebaseMessagingService extends com.google.firebase.messaging.FirebaseMessagingService {
    public static final /* synthetic */ int n0 = 0;
    public final m51 k0;
    public final vz7 l0;
    public final vz7 m0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FirebaseMessagingService() {
        ow7 ow7VarB = pw7.b();
        nf1 nf1Var = tp1.a;
        this.k0 = gv3.c(g33.K(ow7VarB, dm4.a));
        this.l0 = new vz7(new tb2(this, (byte) 0));
        this.m0 = new vz7(new j72((byte) 7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(hd6 hd6Var) {
        kd6 kd6Var;
        ad6 ad6Var;
        Object next;
        String str = (String) hd6Var.c().get("type-push");
        if (str != null) {
            kd6.X.getClass();
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            kd6Var = lowerCase.equals("force") ? kd6.Y : kd6.Z;
        } else {
            kd6Var = null;
        }
        m51 m51Var = this.k0;
        if (kd6Var != null) {
            jm4.Q(m51Var, (u61) null, new r0(this, hd6Var, kd6Var, (q51) null, (byte) 18), 3);
            return;
        }
        String str2 = (String) hd6Var.c().get("remote-control-type");
        if (str2 != null) {
            ad6.Y.getClass();
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Iterator it = ad6.f0.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((ad6) next).X.equals(lowerCase2));
            ad6Var = (ad6) next;
        } else {
            ad6Var = null;
        }
        if (ad6Var != null) {
            jm4.Q(m51Var, (u61) null, new r0(this, hd6Var, ad6Var, (q51) null, (byte) 19), 3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void e(String str) {
        str.getClass();
    }
}
