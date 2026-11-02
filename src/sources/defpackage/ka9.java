package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ka9 extends m99 {
    public final IBinder g;
    public final /* synthetic */ u10 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka9(u10 u10Var, int i, IBinder iBinder, Bundle bundle) {
        super(u10Var, i, bundle);
        this.h = u10Var;
        this.g = iBinder;
    }

    @Override // defpackage.m99
    public final boolean a() {
        IBinder iBinder = this.g;
        try {
            w45.s(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            u10 u10Var = this.h;
            if (!u10Var.i().equals(interfaceDescriptor)) {
                new StringBuilder(u10Var.i().length() + 34 + String.valueOf(interfaceDescriptor).length());
                return false;
            }
            IInterface iInterfaceA = u10Var.a(iBinder);
            if (iInterfaceA != null && (u10Var.o(2, 4, iInterfaceA) || u10Var.o(3, 4, iInterfaceA))) {
                u10Var.t = null;
                rb8 rb8Var = u10Var.n;
                if (rb8Var == null) {
                    return true;
                }
                ((ps2) rb8Var.Y).g();
                return true;
            }
            return false;
        } catch (RemoteException unused) {
        }
    }

    @Override // defpackage.m99
    public final void b(x11 x11Var) {
        q09 q09Var = this.h.o;
        if (q09Var != null) {
            ((qs2) q09Var.X).b(x11Var);
        }
        System.currentTimeMillis();
    }
}
