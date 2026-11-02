package j$.time.format;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements e {
    public final String a;

    public m(String str) {
        this.a = str;
    }

    @Override // j$.time.format.e
    public final boolean t(q qVar, StringBuilder sb) {
        sb.append(this.a);
        return true;
    }

    public final String toString() {
        return "'" + this.a.replace("'", "''") + "'";
    }

    @Override // j$.time.format.e
    public final int x(o oVar, CharSequence charSequence, int i) {
        if (i > charSequence.length() || i < 0) {
            throw new IndexOutOfBoundsException();
        }
        String str = this.a;
        return !oVar.g(charSequence, i, str, 0, str.length()) ? ~i : str.length() + i;
    }
}
