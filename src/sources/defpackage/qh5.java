package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class qh5 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ byte a;

    public /* synthetic */ qh5(byte b) {
        this.a = b;
    }

    public static rh5 a(Parcel parcel, ClassLoader classLoader) {
        qd7 qd7Var;
        if (classLoader == null) {
            classLoader = qh5.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            qd7Var = lh4.i0;
        } else if (i == 1) {
            qd7Var = qe4.v0;
        } else {
            if (i != 2) {
                bt.i(ie2.h("Unsupported MutableState policy ", i, " was restored"));
                return null;
            }
            qd7Var = lh4.x0;
        }
        return new rh5(value, qd7Var);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return b0.Y;
                }
                bt.i("superState must be null");
                return null;
            case 2:
                return new dr0(parcel, null);
            case 3:
                return new jw1(parcel, null);
            case 4:
                return new pq4(parcel, null);
            case 5:
                return new hz6(parcel, null);
            case 6:
                return new n78(parcel, null);
            default:
                ox8 ox8Var = new ox8(parcel, null);
                ox8Var.X = parcel.readInt();
                ox8Var.Y = parcel.readInt();
                ox8Var.Z = parcel.readParcelable(null);
                return ox8Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new rh5[i];
            case 1:
                return new b0[i];
            case 2:
                return new dr0[i];
            case 3:
                return new jw1[i];
            case 4:
                return new pq4[i];
            case 5:
                return new hz6[i];
            case 6:
                return new n78[i];
            default:
                return new ox8[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return b0.Y;
                }
                bt.i("superState must be null");
                return null;
            case 2:
                return new dr0(parcel, classLoader);
            case 3:
                return new jw1(parcel, classLoader);
            case 4:
                return new pq4(parcel, classLoader);
            case 5:
                return new hz6(parcel, classLoader);
            case 6:
                return new n78(parcel, classLoader);
            default:
                ox8 ox8Var = new ox8(parcel, classLoader);
                ox8Var.X = parcel.readInt();
                ox8Var.Y = parcel.readInt();
                ox8Var.Z = parcel.readParcelable(classLoader);
                return ox8Var;
        }
    }
}
