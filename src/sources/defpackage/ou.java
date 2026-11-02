package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ou {
    public final String a;
    public final int b;

    public ou(String str) {
        this.a = str;
        this.b = gv3.Z(str).hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou)) {
            return false;
        }
        return gv3.k(this.a, ((ou) obj).a);
    }

    public final int hashCode() {
        return this.b;
    }
}
