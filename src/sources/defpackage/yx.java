package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class yx extends eu0 {
    public final qx a;

    public yx(qx qxVar) {
        this.a = qxVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eu0)) {
            return false;
        }
        eu0 eu0Var = (eu0) obj;
        Object obj2 = du0.X;
        if (obj2.equals(obj2)) {
            return this.a.equals(((yx) eu0Var).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ ((du0.X.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + du0.X + ", androidClientInfo=" + this.a + "}";
    }
}
