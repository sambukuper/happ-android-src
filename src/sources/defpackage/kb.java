package defpackage;

import android.content.ClipData;
import android.os.Build;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class kb implements iu0 {
    public final dq a;

    public kb(dq dqVar) {
        this.a = dqVar;
    }

    public final void a(gu0 gu0Var) {
        dq dqVar = this.a;
        if (gu0Var != null) {
            dqVar.v().setPrimaryClip(gu0Var.a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            en.c(dqVar.v());
        } else {
            dqVar.v().setPrimaryClip(ClipData.newPlainText(_UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET));
        }
    }
}
