package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class fa9 extends is2 {
    @Override // defpackage.u10
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        return iInterfaceQueryLocalInterface instanceof ja9 ? (ja9) iInterfaceQueryLocalInterface : new ja9(iBinder);
    }

    @Override // defpackage.u10
    public final k82[] d() {
        return vr3.j;
    }

    @Override // defpackage.u10
    public final int f() {
        return 261200000;
    }

    @Override // defpackage.u10
    public final String i() {
        return "com.google.android.gms.cloudmessaging.internal.ICloudMessagingService";
    }

    @Override // defpackage.u10
    public final String j() {
        return "com.google.android.gms.cloudmessaging.service.START";
    }
}
