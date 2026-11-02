package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class lo3 implements Serializable {
    public static final lo3 Z = new lo3(0, 0);
    public final int X;
    public final int Y;

    public lo3(int i, int i2) {
        this.X = i;
        this.Y = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != lo3.class) {
            return false;
        }
        lo3 lo3Var = (lo3) obj;
        return lo3Var.X == this.X && lo3Var.Y == this.Y;
    }

    public final int hashCode() {
        return this.Y + this.X;
    }

    public final String toString() {
        return this == Z ? "EMPTY" : String.format("(enabled=0x%x,disabled=0x%x)", Integer.valueOf(this.X), Integer.valueOf(this.Y));
    }
}
