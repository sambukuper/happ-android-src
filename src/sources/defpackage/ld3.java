package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ld3 implements md3 {
    public final InputContentInfo X;

    public ld3(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.X = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // defpackage.md3
    public final ClipDescription a() {
        return this.X.getDescription();
    }

    @Override // defpackage.md3
    public final Uri e() {
        return this.X.getContentUri();
    }

    @Override // defpackage.md3
    public final void f() {
        this.X.requestPermission();
    }

    @Override // defpackage.md3
    public final Uri g() {
        return this.X.getLinkUri();
    }

    @Override // defpackage.md3
    public final Object h() {
        return this.X;
    }

    public ld3(Object obj) {
        this.X = (InputContentInfo) obj;
    }
}
