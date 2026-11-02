package defpackage;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lt8 extends ct4 {
    public final byte c;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public lt8(int i) {
        StringBuilder sbL = ie2.l("must have at least ", i, " value parameter");
        sbL.append(i > 1 ? "s" : _UrlKt.FRAGMENT_ENCODE_SET);
        super(sbL.toString(), (byte) 1);
        this.c = i;
    }

    @Override // defpackage.jq0
    public final boolean b(dl3 dl3Var) {
        return dl3Var.L().size() >= this.c;
    }
}
