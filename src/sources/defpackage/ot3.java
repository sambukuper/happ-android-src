package defpackage;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ot3 implements Comparable {
    public final int X;
    public final int Y;
    public final int Z;

    static {
        new ot3(hv4.g.a);
        new ot3(hv4.h.a);
    }

    public ot3(int i, int i2, int i3) {
        this.X = i;
        this.Y = i2;
        this.Z = i3;
        if (i < 0) {
            bt.q("Major version should be not less than 0");
            throw null;
        }
        if (i2 < 0) {
            bt.q("Minor version should be not less than 0");
            throw null;
        }
        if (i3 >= 0) {
            return;
        }
        bt.q("Patch version should be not less than 0");
        throw null;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ot3 ot3Var) {
        ot3Var.getClass();
        int iK = dh3.k(this.X, ot3Var.X);
        if (iK != 0) {
            return iK;
        }
        int iK2 = dh3.k(this.Y, ot3Var.Y);
        return iK2 != 0 ? iK2 : dh3.k(this.Z, ot3Var.Z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ot3.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        ot3 ot3Var = (ot3) obj;
        return this.X == ot3Var.X && this.Y == ot3Var.Y && this.Z == ot3Var.Z;
    }

    public final int hashCode() {
        return (((this.X * 31) + this.Y) * 31) + this.Z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.X);
        sb.append('.');
        sb.append(this.Y);
        sb.append('.');
        sb.append(this.Z);
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ot3(int[] iArr) {
        this(iArr[0], iArr[1], iArr[2]);
        iArr.getClass();
    }
}
