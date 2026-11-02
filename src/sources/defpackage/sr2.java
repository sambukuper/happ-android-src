package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sr2 extends v2 {
    public static final Parcelable.Creator<sr2> CREATOR = new lg7((byte) 28);
    public static final Scope[] q0 = new Scope[0];
    public static final k82[] r0 = new k82[0];
    public final int X;
    public final int Y;
    public final int Z;
    public String f0;
    public IBinder g0;
    public Scope[] h0;
    public Bundle i0;
    public Account j0;
    public k82[] k0;
    public k82[] l0;
    public final boolean m0;
    public final int n0;
    public boolean o0;
    public final String p0;

    public sr2(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, k82[] k82VarArr, k82[] k82VarArr2, boolean z, int i4, boolean z2, String str2) {
        scopeArr = scopeArr == null ? q0 : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        k82[] k82VarArr3 = r0;
        k82VarArr = k82VarArr == null ? k82VarArr3 : k82VarArr;
        k82VarArr2 = k82VarArr2 == null ? k82VarArr3 : k82VarArr2;
        this.X = i;
        this.Y = i2;
        this.Z = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f0 = "com.google.android.gms";
        } else {
            this.f0 = str;
        }
        if (i < 2) {
            Account accountB = null;
            if (iBinder != null) {
                int i5 = v4.h;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface cb9Var = iInterfaceQueryLocalInterface instanceof x23 ? (x23) iInterfaceQueryLocalInterface : new cb9(iBinder);
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    accountB = ((cb9) cb9Var).b();
                } catch (RemoteException unused) {
                } finally {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                }
            }
            this.j0 = accountB;
        } else {
            this.g0 = iBinder;
            this.j0 = account;
        }
        this.h0 = scopeArr;
        this.i0 = bundle;
        this.k0 = k82VarArr;
        this.l0 = k82VarArr2;
        this.m0 = z;
        this.n0 = i4;
        this.o0 = z2;
        this.p0 = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        lg7.a(this, parcel, i);
    }
}
