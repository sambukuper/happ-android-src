package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ma extends g33 {
    public final int f;

    public ma(int i) {
        this.f = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ma) && ((ma) obj).f == this.f;
    }

    public final int hashCode() {
        return this.f * 31;
    }
}
