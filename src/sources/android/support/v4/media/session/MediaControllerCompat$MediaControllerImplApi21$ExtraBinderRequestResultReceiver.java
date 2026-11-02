package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import defpackage.e43;
import defpackage.f43;
import defpackage.g43;
import defpackage.ms4;
import io.sentry.c2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {
    public WeakReference X;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        g43 g43Var;
        a aVar = (a) this.X.get();
        if (aVar == null || bundle == null) {
            return;
        }
        synchronized (aVar.b) {
            try {
                MediaSessionCompat$Token mediaSessionCompat$Token = aVar.e;
                IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                int i2 = f43.g;
                if (binder == null) {
                    g43Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof g43)) {
                        e43 e43Var = new e43();
                        e43Var.g = binder;
                        g43Var = e43Var;
                    } else {
                        g43Var = (g43) iInterfaceQueryLocalInterface;
                    }
                }
                mediaSessionCompat$Token.Y = g43Var;
                MediaSessionCompat$Token mediaSessionCompat$Token2 = aVar.e;
                bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE");
                mediaSessionCompat$Token2.getClass();
                ArrayList arrayList = aVar.c;
                if (aVar.e.Y != null) {
                    Iterator it = arrayList.iterator();
                    if (!it.hasNext()) {
                        arrayList.clear();
                    } else {
                        if (it.next() == null) {
                            aVar.d.put(null, new ms4());
                            throw null;
                        }
                        c2.m();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
