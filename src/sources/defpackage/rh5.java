package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rh5 extends zh7 implements Parcelable, od7 {
    public static final Parcelable.Creator<rh5> CREATOR = new qh5(0);
    public final qd7 Y;
    public pd7 Z;

    public rh5(Object obj, qd7 qd7Var) {
        this.Y = qd7Var;
        dd7 dd7VarH = kd7.h();
        pd7 pd7Var = new pd7(dd7VarH.g(), obj);
        if (!(dd7VarH instanceof es2)) {
            pd7Var.b = new pd7(1L, obj);
        }
        this.Z = pd7Var;
    }

    @Override // defpackage.yh7
    public final bi7 c() {
        return this.Z;
    }

    @Override // defpackage.od7
    public final qd7 d() {
        return this.Y;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.yh7
    public final bi7 e(bi7 bi7Var, bi7 bi7Var2, bi7 bi7Var3) {
        if (this.Y.X(((pd7) bi7Var2).c, ((pd7) bi7Var3).c)) {
            return bi7Var2;
        }
        return null;
    }

    @Override // defpackage.lh7
    public final Object getValue() {
        return ((pd7) kd7.s(this.Z, this)).c;
    }

    @Override // defpackage.y05
    public final void setValue(Object obj) {
        dd7 dd7VarH;
        pd7 pd7Var = (pd7) kd7.f(this.Z);
        if (this.Y.X(pd7Var.c, obj)) {
            return;
        }
        pd7 pd7Var2 = this.Z;
        synchronized (kd7.c) {
            dd7VarH = kd7.h();
            ((pd7) kd7.n(pd7Var2, this, dd7VarH, pd7Var)).c = obj;
        }
        kd7.l(dd7VarH, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((pd7) kd7.f(this.Z)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        lh4 lh4Var = lh4.i0;
        qd7 qd7Var = this.Y;
        if (qd7Var.equals(lh4Var)) {
            i2 = 0;
        } else if (qd7Var.equals(qe4.v0)) {
            i2 = 1;
        } else {
            if (!qd7Var.equals(lh4.x0)) {
                bt.i("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }

    @Override // defpackage.yh7
    public final void y(bi7 bi7Var) {
        this.Z = (pd7) bi7Var;
    }
}
