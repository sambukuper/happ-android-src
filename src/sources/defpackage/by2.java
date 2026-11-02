package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class by2 {
    public final String a;
    public final my2 b;
    public final List c = d02.X;

    public by2(String str, my2 my2Var) {
        this.a = str;
        this.b = my2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by2)) {
            return false;
        }
        by2 by2Var = (by2) obj;
        return this.a.equals(by2Var.a) && this.b == by2Var.b && this.c.equals(by2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "HappSnackbarData(message=" + this.a + ", status=" + this.b + ", actions=" + this.c + ")";
    }
}
