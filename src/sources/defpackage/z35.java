package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class z35 extends e31 {
    public final ConnectivityManager f;
    public final Object g;
    public volatile boolean h;
    public final q7 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z35(Context context, y5 y5Var) {
        super(context, y5Var);
        Object systemService = ((e31) this).b.getSystemService("connectivity");
        systemService.getClass();
        this.f = (ConnectivityManager) systemService;
        this.g = new Object();
        this.i = new q7(this, (byte) 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object a() {
        return y35.a(this.f, this.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        try {
            lh4 lh4VarP0 = lh4.P0();
            int i = y35.a;
            lh4VarP0.getClass();
            ConnectivityManager connectivityManager = this.f;
            q7 q7Var = this.i;
            connectivityManager.getClass();
            q7Var.getClass();
            connectivityManager.registerDefaultNetworkCallback(q7Var);
        } catch (IllegalArgumentException unused) {
            lh4 lh4VarP1 = lh4.P0();
            int i2 = y35.a;
            lh4VarP1.getClass();
        } catch (SecurityException unused2) {
            lh4 lh4VarP2 = lh4.P0();
            int i3 = y35.a;
            lh4VarP2.getClass();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d() {
        try {
            lh4 lh4VarP0 = lh4.P0();
            int i = y35.a;
            lh4VarP0.getClass();
            this.f.unregisterNetworkCallback((ConnectivityManager.NetworkCallback) this.i);
        } catch (IllegalArgumentException unused) {
            lh4 lh4VarP1 = lh4.P0();
            int i2 = y35.a;
            lh4VarP1.getClass();
        } catch (SecurityException unused2) {
            lh4 lh4VarP2 = lh4.P0();
            int i3 = y35.a;
            lh4VarP2.getClass();
        }
    }
}
