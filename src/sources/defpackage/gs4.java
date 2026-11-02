package defpackage;

import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class gs4 extends MediaBrowser.ConnectionCallback {
    public final q02 a;

    public gs4(q02 q02Var) {
        this.a = q02Var;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        g43 g43Var;
        g43 g43Var2;
        fu6 fu6Var = (fu6) this.a.Y;
        es4 es4Var = (es4) fu6Var.Z;
        if (es4Var != null) {
            ds4 ds4Var = es4Var.d;
            MediaBrowser mediaBrowser = es4Var.b;
            Bundle extras = mediaBrowser.getExtras();
            if (extras != null) {
                boolean z = false;
                extras.getInt("extra_service_version", 0);
                IBinder binder = extras.getBinder("extra_messenger");
                if (binder != null) {
                    Bundle bundle = es4Var.c;
                    zz2 zz2Var = new zz2((byte) 11, z);
                    zz2Var.Y = new Messenger(binder);
                    zz2Var.Z = bundle;
                    es4Var.f = zz2Var;
                    Messenger messenger = new Messenger(ds4Var);
                    es4Var.g = messenger;
                    ds4Var.getClass();
                    ds4Var.b = new WeakReference(messenger);
                    try {
                        zz2 zz2Var2 = es4Var.f;
                        Context context = es4Var.a;
                        Messenger messenger2 = es4Var.g;
                        zz2Var2.getClass();
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("data_package_name", context.getPackageName());
                        bundle2.putBundle("data_root_hints", (Bundle) zz2Var2.Z);
                        Message messageObtain = Message.obtain();
                        messageObtain.what = 6;
                        messageObtain.arg1 = 1;
                        messageObtain.setData(bundle2);
                        messageObtain.replyTo = messenger2;
                        ((Messenger) zz2Var2.Y).send(messageObtain);
                    } catch (RemoteException unused) {
                    }
                }
                IBinder binder2 = extras.getBinder("extra_session_binder");
                int i = f43.g;
                if (binder2 == null) {
                    g43Var2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = binder2.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof g43)) {
                        e43 e43Var = new e43();
                        e43Var.g = binder2;
                        g43Var2 = e43Var;
                    } else {
                        g43Var = (g43) iInterfaceQueryLocalInterface;
                    }
                }
                if (g43Var2 != null) {
                    g43Var2 = g43Var;
                    MediaSession.Token sessionToken = mediaBrowser.getSessionToken();
                    es4Var.h = sessionToken != null ? new MediaSessionCompat$Token(sessionToken, g43Var2) : null;
                }
            }
        }
        try {
            g43Var2 = g43Var;
            Context context2 = (Context) fu6Var.f0;
            es4 es4Var2 = (es4) ((vk1) fu6Var.i0).Y;
            MediaSessionCompat$Token mediaSessionCompat$Token = es4Var2.h;
            if (mediaSessionCompat$Token == null) {
                MediaSession.Token sessionToken2 = es4Var2.b.getSessionToken();
                MediaSessionCompat$Token mediaSessionCompat$Token2 = sessionToken2 != null ? new MediaSessionCompat$Token(sessionToken2, null) : null;
                es4Var2.h = mediaSessionCompat$Token2;
                mediaSessionCompat$Token = mediaSessionCompat$Token2;
            }
            new HashSet();
            if (mediaSessionCompat$Token == null) {
                throw new IllegalArgumentException("sessionToken must not be null");
            }
            ns4 ns4Var = new ns4(context2, mediaSessionCompat$Token);
            KeyEvent keyEvent = (KeyEvent) ((Intent) fu6Var.g0).getParcelableExtra("android.intent.extra.KEY_EVENT");
            if (keyEvent == null) {
                throw new IllegalArgumentException("KeyEvent may not be null");
            }
            ns4Var.a.dispatchMediaButtonEvent(keyEvent);
            fu6Var.T();
        } catch (RemoteException unused2) {
        }
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        ((fu6) this.a.Y).T();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        fu6 fu6Var = (fu6) this.a.Y;
        es4 es4Var = (es4) fu6Var.Z;
        if (es4Var != null) {
            es4Var.f = null;
            es4Var.g = null;
            es4Var.h = null;
            ds4 ds4Var = es4Var.d;
            ds4Var.getClass();
            ds4Var.b = new WeakReference(null);
        }
        fu6Var.T();
    }
}
