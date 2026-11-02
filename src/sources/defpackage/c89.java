package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import io.sentry.c2;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c89 implements fa5, zc6, r51 {
    public final Object X;
    public final Object Y;

    public c89(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.X = new Messenger(iBinder);
            this.Y = null;
        } else {
            if (!Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
                "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor));
                throw new RemoteException();
            }
            this.Y = new ha9(iBinder);
            this.X = null;
        }
    }

    public void a(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        Map map3 = (Map) this.X;
        synchronized (map3) {
            map = new HashMap(map3);
        }
        Map map4 = (Map) this.Y;
        synchronized (map4) {
            map2 = new HashMap(map4);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                entry.getKey().getClass();
                c2.m();
                return;
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((z18) entry2.getKey()).b(new pn(status));
            }
        }
    }

    @Override // defpackage.zc6
    public void accept(Object obj, Object obj2) {
        int i;
        h99 h99Var = (h99) this.X;
        fa9 fa9Var = (fa9) obj;
        ms4 ms4Var = new ms4(h99Var, (z18) obj2);
        Context context = h99Var.a;
        try {
            i = n59.a(context).a.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            i = 0;
        }
        oc6 oc6Var = (oc6) this.Y;
        oc6Var.h0 = i;
        ja9 ja9Var = (ja9) fa9Var.h();
        zx0 zx0Var = new zx0(-1, -1, 0, true);
        Parcelable.Creator<so> creator = so.CREATOR;
        so soVar = new so(zx0Var, false);
        soVar.Z = false;
        boolean z = soVar.Z;
        so soVar2 = new so(soVar.X, true);
        soVar2.Z = z;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.gms.cloudmessaging.internal.ICloudMessagingService");
        int i2 = aa9.a;
        parcelObtain.writeStrongBinder(ms4Var);
        parcelObtain.writeInt(1);
        oc6Var.writeToParcel(parcelObtain, 0);
        parcelObtain.writeInt(1);
        soVar2.writeToParcel(parcelObtain, 0);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            ja9Var.g.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain.recycle();
            parcelObtain2.recycle();
        }
    }

    @Override // defpackage.r51
    public Object g(fb9 fb9Var) {
        Bundle bundle;
        yq6 yq6Var = (yq6) this.X;
        Bundle bundle2 = (Bundle) this.Y;
        if (!fb9Var.i() || (bundle = (Bundle) fb9Var.g()) == null || !bundle.containsKey("google.messenger")) {
            return fb9Var;
        }
        fb9 fb9VarB = yq6Var.b(bundle2);
        dp1 dp1Var = dp1.f0;
        fb9 fb9Var2 = new fb9();
        fb9VarB.b.r(new na9(dp1Var, s18.Y, fb9Var2));
        fb9VarB.n();
        return fb9Var2;
    }

    @Override // defpackage.fa5
    public void i(fb9 fb9Var) {
        ((Map) ((c89) this.Y).Y).remove((z18) this.X);
    }

    public c89(g99 g99Var, AlertDialog alertDialog) {
        this.X = alertDialog;
        this.Y = g99Var;
    }

    public c89() {
        this.X = Collections.synchronizedMap(new WeakHashMap());
        this.Y = Collections.synchronizedMap(new WeakHashMap());
    }

    public /* synthetic */ c89(Parcelable parcelable, Object obj) {
        this.X = obj;
        this.Y = parcelable;
    }

    public c89(c89 c89Var, z18 z18Var) {
        this.X = z18Var;
        Objects.requireNonNull(c89Var);
        this.Y = c89Var;
    }
}
