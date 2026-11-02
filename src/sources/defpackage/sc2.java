package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import java.util.concurrent.CancellationException;
import su.happ.proxyutility.feature.main.MainActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class sc2 extends uy7 implements rn2 {
    public /* synthetic */ Object g0;
    public final /* synthetic */ hd6 h0;
    public final /* synthetic */ kd6 i0;
    public final /* synthetic */ tc2 j0;
    public final /* synthetic */ Context k0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc2(hd6 hd6Var, kd6 kd6Var, tc2 tc2Var, Context context, q51 q51Var) {
        super(2, q51Var);
        this.h0 = hd6Var;
        this.i0 = kd6Var;
        this.j0 = tc2Var;
        this.k0 = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object K(Object obj, Object obj2) {
        sc2 sc2VarN = n((q51) obj2, (b71) obj);
        dn8 dn8Var = dn8.a;
        sc2VarN.q(dn8Var);
        return dn8Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q51 n(q51 q51Var, Object obj) {
        sc2 sc2Var = new sc2(this.h0, this.i0, this.j0, this.k0, q51Var);
        sc2Var.g0 = obj;
        return sc2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object q(Object obj) {
        da1 rj6Var;
        String str;
        String str2;
        Long lC0;
        tc2 tc2Var = this.j0;
        vz7 vz7Var = tc2Var.b;
        b71 b71Var = (b71) this.g0;
        w39.n0(obj);
        hd6 hd6Var = this.h0;
        try {
            um3 um3Var = vm3.d;
            String str3 = (String) hd6Var.c().get("data-locale");
            if (str3 == null) {
                str3 = "";
            }
            g55 g55Var = ((vm3) um3Var).b;
            rj6Var = (da1) um3Var.a(da1.Companion.serializer(), str3);
        } catch (Throwable th) {
            if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                throw th;
            }
            rj6Var = new rj6(th);
        }
        if (rj6Var instanceof rj6) {
            rj6Var = null;
        }
        da1 da1Var = rj6Var;
        dn8 dn8Var = dn8.a;
        if (da1Var != null && (str = (String) hd6Var.c().get("remote-push-id")) != null && (str2 = (String) hd6Var.c().get("expire")) != null && (lC0 = mm7.c0(str2)) != null) {
            long jLongValue = lC0.longValue();
            String str4 = (String) hd6Var.c().get("background-image");
            Context context = this.k0;
            if (str4 != null) {
                jm4.Q(b71Var, (u61) null, new r0(tc2Var, context, str4, (q51) null, (byte) 20), 3);
            }
            kd6 kd6Var = this.i0;
            jm4.Q(b71Var, (u61) null, new q0(tc2Var, new ld6(str, da1Var, jLongValue, str4, kd6Var, false), (q51) null, (byte) 24), 3);
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationManager notificationManager = (NotificationManager) vz7Var.getValue();
                dn.e();
                notificationManager.createNotificationChannel(new NotificationChannel("happ_push_notification", "Happ Push Notifications", 4));
            }
            PendingIntent activity = PendingIntent.getActivity(context, 100, new Intent(context, (Class<?>) MainActivity.class).setFlags(268468224).putExtra("show_stories", true).putExtra("show_stories_force", kd6Var == kd6.Y), 201326592);
            ga1 ga1VarC = da1Var.c();
            String str5 = ga1VarC.X;
            Spanned spannedFromHtml = Html.fromHtml(str5 != null ? str5 : "", 63);
            spannedFromHtml.getClass();
            String str6 = ga1VarC.Y;
            str6.getClass();
            Spanned spannedFromHtml2 = Html.fromHtml(str6, 63);
            spannedFromHtml2.getClass();
            ((kf4) tc2Var.c.getValue()).g(new rc2(ga1VarC, jLongValue, (byte) 0));
            r65 r65Var = new r65(context, "happ_push_notification");
            r65Var.v.icon = q36.ic_stat_name;
            r65Var.j = 2;
            q65 q65Var = new q65();
            ((s65) q65Var).c = r65.c(spannedFromHtml);
            ((s65) q65Var).d = r65.c(spannedFromHtml);
            ((s65) q65Var).a = true;
            q65Var.e = r65.c(spannedFromHtml2);
            r65Var.f(q65Var);
            r65Var.g = activity;
            r65Var.d(16, true);
            ((NotificationManager) vz7Var.getValue()).notify(2, r65Var.b());
        }
        return dn8Var;
    }
}
