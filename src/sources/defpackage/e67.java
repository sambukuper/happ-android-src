package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public final class e67 {
    public final boolean a;
    public final boolean b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e67(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static e67 a(e67 e67Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = e67Var.a;
        }
        if ((i & 2) != 0) {
            z2 = e67Var.b;
        }
        return new e67(z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e67)) {
            return false;
        }
        e67 e67Var = (e67) obj;
        return this.a == e67Var.a && this.b == e67Var.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "SettingsState(isUpdateSheetVisible=" + this.a + ", isAppUpdateChecking=" + this.b + ")";
    }
}
