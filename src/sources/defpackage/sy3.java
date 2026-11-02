package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sy3 extends py3 {
    public final String a;

    public sy3(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.py3
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sy3) && dh3.f(this.a, ((sy3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
