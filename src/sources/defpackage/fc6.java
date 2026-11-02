package defpackage;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: loaded from: classes.dex */
public final class fc6 implements gn2 {
    public final boolean X;

    public fc6(boolean z) {
        this.X = z;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) {
        uw3 uw3Var = (uw3) obj;
        uw3Var.getClass();
        return (this.X ? "(raw) " : _UrlKt.FRAGMENT_ENCODE_SET) + uw3Var;
    }
}
