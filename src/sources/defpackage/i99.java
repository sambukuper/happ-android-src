package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class i99 extends is2 {
    public final j28 z;

    public i99(Context context, Looper looper, fu6 fu6Var, j28 j28Var, i89 i89Var, i89 i89Var2) {
        super(context, looper, 270, fu6Var, i89Var, i89Var2);
        this.z = j28Var;
    }

    @Override // defpackage.u10
    public final IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof c99 ? (c99) iInterfaceQueryLocalInterface : new c99(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // defpackage.u10
    public final k82[] d() {
        return ch3.h;
    }

    @Override // defpackage.u10
    public final Bundle e() {
        this.z.getClass();
        return new Bundle();
    }

    @Override // defpackage.u10
    public final int f() {
        return 203400000;
    }

    @Override // defpackage.u10
    public final String i() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // defpackage.u10
    public final String j() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // defpackage.u10
    public final boolean k() {
        return true;
    }
}
