package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class es4 {
    public final Context a;
    public final MediaBrowser b;
    public final Bundle c;
    public final ds4 d = new ds4(this);
    public final vt e = new vt(0);
    public zz2 f;
    public Messenger g;
    public MediaSessionCompat$Token h;

    public es4(Context context, ComponentName componentName, fu6 fu6Var) {
        this.a = context;
        Bundle bundle = new Bundle();
        this.c = bundle;
        bundle.putInt("extra_client_version", 1);
        fu6Var.Z = this;
        this.b = new MediaBrowser(context, componentName, (gs4) fu6Var.Y, bundle);
    }
}
