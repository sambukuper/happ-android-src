package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class az3 extends i21 {
    public final String i0;

    public az3(String str) {
        str.getClass();
        this.i0 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof az3) && dh3.f(this.i0, ((az3) obj).i0);
    }

    public final int hashCode() {
        return this.i0.hashCode();
    }

    public final String toString() {
        return oi0.o(new StringBuilder("TypeAlias(name="), this.i0, ')');
    }
}
