package defpackage;

import androidx.media.MediaBrowserServiceCompat;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class hs4 extends y5 {
    public final /* synthetic */ MediaBrowserServiceCompat i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs4(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        super(mediaBrowserServiceCompat);
        this.i0 = mediaBrowserServiceCompat;
    }

    @Override // defpackage.y5
    public final void W() {
        int i = ls4.a;
        ks4 ks4Var = new ks4(this.i0, this);
        this.Z = ks4Var;
        ks4Var.onCreate();
    }
}
