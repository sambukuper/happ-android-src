package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c63 extends ru2 {
    public final boolean a = true;
    public final s82 b = s82.f0;

    @Override // defpackage.ru2
    public final s82 a() {
        return this.b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ImageFormatFeature(imageCaptureOutputFormat=");
        boolean z = this.a;
        if (!z) {
            str = "JPEG";
        } else if (!z) {
            str = "UNDEFINED(" + (z ? 1 : 0) + ')';
        } else {
            str = "JPEG_R";
        }
        return oi0.o(sb, str, ')');
    }
}
