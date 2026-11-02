package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import androidx.media.MediaBrowserServiceCompat;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class js4 extends MediaBrowserService {
    public final y5 X;

    public js4(Context context, y5 y5Var) {
        attachBaseContext(context);
        this.X = y5Var;
    }

    @Override // android.service.media.MediaBrowserService
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        os4.p(bundle);
        Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        y5 y5Var = this.X;
        MediaBrowserServiceCompat mediaBrowserServiceCompat = (MediaBrowserServiceCompat) y5Var.f0;
        if (bundle2 != null && bundle2.getInt("extra_client_version", 0) != 0) {
            bundle2.remove("extra_client_version");
            y5Var.g0 = new Messenger((Handler) null);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("extra_service_version", 2);
            bundle3.putBinder("extra_messenger", ((Messenger) y5Var.g0).getBinder());
            ((ArrayList) y5Var.Y).add(bundle3);
        }
        new HashMap();
        if (Build.VERSION.SDK_INT >= 28) {
            fn.b(i, str);
        }
        mediaBrowserServiceCompat.a();
        return null;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        y5 y5Var = this.X;
        y5Var.getClass();
        ((MediaBrowserServiceCompat) y5Var.f0).b();
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadItem(String str, MediaBrowserService.Result result) {
        q02 q02Var = new q02((Object) result, (byte) 23);
        Object obj = this.X.h0;
        ((MediaBrowserService.Result) q02Var.Y).sendResult(null);
    }
}
