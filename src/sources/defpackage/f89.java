package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class f89 extends is2 {
    @Override // defpackage.u10
    public final IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
        return iInterfaceQueryLocalInterface instanceof a99 ? (a99) iInterfaceQueryLocalInterface : new a99(iBinder, "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService");
    }

    @Override // defpackage.u10
    public final k82[] d() {
        return ch3.h;
    }

    @Override // defpackage.u10
    public final int f() {
        return 253600000;
    }

    @Override // defpackage.u10
    public final String i() {
        return "com.google.android.gms.common.internal.service.IClientNotificationTelemetryService";
    }

    @Override // defpackage.u10
    public final String j() {
        return "com.google.android.gms.common.telemetry.notification.service.START";
    }

    @Override // defpackage.u10
    public final boolean k() {
        return true;
    }
}
