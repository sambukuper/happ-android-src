package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b89 implements IInterface {
    public final IBinder g;
    public final String h;

    public b89(IBinder iBinder, String str) {
        this.g = iBinder;
        this.h = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.g;
    }
}
