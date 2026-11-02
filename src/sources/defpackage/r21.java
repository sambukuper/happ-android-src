package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class r21 extends n75 {
    public final String c;

    public r21(String str) {
        super(Integer.valueOf(str.length()), "the predefined string ".concat(str));
        this.c = str;
    }

    @Override // defpackage.n75
    public final o75 a(String str, int i, int i2, Object obj) {
        String string = str.subSequence(i, i2).toString();
        String str2 = this.c;
        if (dh3.f(string, str2)) {
            return null;
        }
        return new z31(str2, (byte) 2);
    }
}
