package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ud7 implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ byte a;

    public static vd7 a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = ud7.class.getClassLoader();
        }
        int i = parcel.readInt();
        if (i == 0) {
            return new vd7();
        }
        rm5 rm5VarF = fc7.Y.f();
        for (int i2 = 0; i2 < i; i2++) {
            rm5VarF.add(parcel.readValue(classLoader));
        }
        return new vd7(rm5VarF.c());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return a(parcel, null);
            case 1:
                return new l70(parcel, null);
            case 2:
                return new g61(parcel, null);
            case 3:
                return new pk2(parcel, null);
            case 4:
                return new m96(parcel, null);
            case 5:
                return new y87(parcel, null);
            default:
                return new pb8(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new vd7[i];
            case 1:
                return new l70[i];
            case 2:
                return new g61[i];
            case 3:
                return new pk2[i];
            case 4:
                return new m96[i];
            case 5:
                return new y87[i];
            default:
                return new pb8[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                return new l70(parcel, classLoader);
            case 2:
                return new g61(parcel, classLoader);
            case 3:
                return new pk2(parcel, classLoader);
            case 4:
                return new m96(parcel, classLoader);
            case 5:
                return new y87(parcel, classLoader);
            default:
                return new pb8(parcel, classLoader);
        }
    }
}
