package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bz3 extends i21 {
    public final int i0;

    public bz3(int i) {
        this.i0 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bz3) && this.i0 == ((bz3) obj).i0;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i0);
    }

    public final String toString() {
        return pc6.r(new StringBuilder("TypeParameter(id="), this.i0, ')');
    }
}
