package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qw {
    public final byte a;

    public final boolean equals(Object obj) {
        if (obj instanceof qw) {
            return this.a == ((qw) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return "AudioRestrictionMode(value=" + ((int) this.a) + ')';
    }
}
