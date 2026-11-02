package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ss0 implements Comparable, Serializable {
    public String X;
    public Class Y;
    public int Z;

    public ss0(Class cls) {
        this.Y = cls;
        String name = cls.getName();
        this.X = name;
        this.Z = name.hashCode();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.X.compareTo(((ss0) obj).X);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass() == ss0.class && ((ss0) obj).Y == this.Y;
    }

    public final int hashCode() {
        return this.Z;
    }

    public final String toString() {
        return this.X;
    }
}
