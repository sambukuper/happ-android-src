package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nh5 extends zh7 implements Parcelable, od7, lh7, y05 {
    public static final Parcelable.Creator<nh5> CREATOR = new dh5((byte) 10);
    public ld7 Y;

    public nh5(float f) {
        dd7 dd7VarH = kd7.h();
        ld7 ld7Var = new ld7(f, dd7VarH.g());
        if (!(dd7VarH instanceof es2)) {
            ld7Var.b = new ld7(f, 1L);
        }
        this.Y = ld7Var;
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
        if (((ld7) bi7Var2).c == ((ld7) bi7Var3).c) {
            return bi7Var2;
        }
        return null;
    }

    @Override // defpackage.lh7
    public final Object getValue() {
        return Float.valueOf(l());
    }

    public final float l() {
        return ((ld7) kd7.s(this.Y, this)).c;
    }

    public final void m(float f) {
        dd7 dd7VarH;
        ld7 ld7Var = (ld7) kd7.f(this.Y);
        if (ld7Var.c == f) {
            return;
        }
        ld7 ld7Var2 = this.Y;
        synchronized (kd7.c) {
            dd7VarH = kd7.h();
            ((ld7) kd7.n(ld7Var2, this, dd7VarH, ld7Var)).c = f;
        }
        kd7.l(dd7VarH, this);
    }

    @Override // defpackage.y05
    public final void setValue(Object obj) {
        m(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((ld7) kd7.f(this.Y)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(l());
    }

    @Override // defpackage.yh7
    public final void y(bi7 bi7Var) {
        this.Y = (ld7) bi7Var;
    }
}
