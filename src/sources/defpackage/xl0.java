package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.net.VpnService;
import libxray.XRayPoint;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xl0 implements dn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ Context Y;

    public /* synthetic */ xl0(Context context, byte b) {
        this.X = b;
        this.Y = context;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        byte b = this.X;
        Context context = this.Y;
        switch (b) {
            case 0:
                return new dm6(context);
            case 1:
                Object systemService = context.getSystemService("notification");
                systemService.getClass();
                return (NotificationManager) systemService;
            case 2:
                f63 f63Var = new f63(context);
                t63 t63VarA = t63.a((t63) f63Var.Z, null, 16351);
                f63Var.Z = t63VarA;
                t63 t63VarA2 = t63.a(t63VarA, null, 16367);
                f63Var.Z = t63VarA2;
                f63Var.Z = t63.a(t63VarA2, null, 16319);
                return f63Var.k();
            case 3:
                return Boolean.valueOf(ue3.y(context));
            case 4:
                Object systemService2 = context.getSystemService("notification");
                systemService2.getClass();
                return (NotificationManager) systemService2;
            default:
                if (VpnService.prepare(context) == null) {
                    XRayPoint xRayPoint = n69.a;
                    n69.b(context, true);
                }
                return dn8.a;
        }
    }
}
