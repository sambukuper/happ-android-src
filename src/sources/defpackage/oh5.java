package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class oh5 extends zh7 implements Parcelable, od7, lh7, y05 {
    public static final Parcelable.Creator<oh5> CREATOR = new dh5((byte) 11);
    public md7 Y;

    public oh5(int i) {
        dd7 dd7VarH = kd7.h();
        md7 md7Var = new md7(dd7VarH.g(), i);
        if (!(dd7VarH instanceof es2)) {
            md7Var.b = new md7(1L, i);
        }
        this.Y = md7Var;
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
        if (((md7) bi7Var2).c == ((md7) bi7Var3).c) {
            return bi7Var2;
        }
        return null;
    }

    @Override // defpackage.lh7
    public final Object getValue() {
        return Integer.valueOf(l());
    }

    public final int l() {
        return ((md7) kd7.s(this.Y, this)).c;
    }

    public final void m(int i) {
        dd7 dd7VarH;
        md7 md7Var = (md7) kd7.f(this.Y);
        if (md7Var.c != i) {
            md7 md7Var2 = this.Y;
            synchronized (kd7.c) {
                dd7VarH = kd7.h();
                ((md7) kd7.n(md7Var2, this, dd7VarH, md7Var)).c = i;
            }
            kd7.l(dd7VarH, this);
        }
    }

    @Override // defpackage.y05
    public final void setValue(Object obj) {
        m(((Number) obj).intValue());
    }

    public final String toString() {
        return pc6.m("MutableIntState(value=", ((md7) kd7.f(this.Y)).c, hashCode(), ")@");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(l());
    }

    @Override // defpackage.yh7
    public final void y(bi7 bi7Var) {
        this.Y = (md7) bi7Var;
    }
}
