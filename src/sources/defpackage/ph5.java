package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ph5 extends zh7 implements Parcelable, od7, lh7, y05 {
    public static final Parcelable.Creator<ph5> CREATOR = new dh5((byte) 12);
    public nd7 Y;

    public ph5(long j) {
        dd7 dd7VarH = kd7.h();
        nd7 nd7Var = new nd7(dd7VarH.g(), j);
        if (!(dd7VarH instanceof es2)) {
            nd7Var.b = new nd7(1L, j);
        }
        this.Y = nd7Var;
    }

    @Override // defpackage.yh7
    public final bi7 c() {
        return this.Y;
    }

    @Override // defpackage.od7
    public final qd7 d() {
        return qe4.v0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.yh7
    public final bi7 e(bi7 bi7Var, bi7 bi7Var2, bi7 bi7Var3) {
        if (((nd7) bi7Var2).c == ((nd7) bi7Var3).c) {
            return bi7Var2;
        }
        return null;
    }

    @Override // defpackage.lh7
    public final Object getValue() {
        return Long.valueOf(l());
    }

    public final long l() {
        return ((nd7) kd7.s(this.Y, this)).c;
    }

    public final void m(long j) {
        dd7 dd7VarH;
        nd7 nd7Var = (nd7) kd7.f(this.Y);
        if (nd7Var.c != j) {
            nd7 nd7Var2 = this.Y;
            synchronized (kd7.c) {
                dd7VarH = kd7.h();
                ((nd7) kd7.n(nd7Var2, this, dd7VarH, nd7Var)).c = j;
            }
            kd7.l(dd7VarH, this);
        }
    }

    @Override // defpackage.y05
    public final void setValue(Object obj) {
        m(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((nd7) kd7.f(this.Y)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(l());
    }

    @Override // defpackage.yh7
    public final void y(bi7 bi7Var) {
        this.Y = (nd7) bi7Var;
    }
}
