package defpackage;

import okhttp3.internal.url._UrlKt;

/* JADX INFO: loaded from: classes.dex */
public final class gc6 implements dn2 {
    public final /* synthetic */ byte X;
    public final String Y;

    public /* synthetic */ gc6(String str, byte b) {
        this.X = b;
        this.Y = str;
    }

    @Override // defpackage.dn2
    public final Object invoke() {
        String str;
        byte b = this.X;
        String str2 = this.Y;
        switch (b) {
            case 0:
                String strO = oi0.o(new StringBuilder(), ug7.m.a.a, '.');
                str = mm7.Z(str2, false, strO) ? strO : null;
                return str == null ? _UrlKt.FRAGMENT_ENCODE_SET : str;
            default:
                String strO2 = oi0.o(new StringBuilder(), ug7.k.a.a, '.');
                str = mm7.Z(str2, false, strO2) ? strO2 : null;
                return str == null ? _UrlKt.FRAGMENT_ENCODE_SET : str;
        }
    }
}
