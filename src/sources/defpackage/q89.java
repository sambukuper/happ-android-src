package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class q89 extends g89 implements ps2, qs2 {
    public static final z79 o = r89.a;
    public final Context h;
    public final Handler i;
    public final z79 j;
    public final Set k;
    public final fu6 l;
    public z87 m;
    public bl n;

    public q89(Context context, f99 f99Var, fu6 fu6Var) {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.h = context;
        this.i = f99Var;
        this.l = fu6Var;
        this.k = (Set) fu6Var.Y;
        this.j = o;
    }

    @Override // defpackage.qs2
    public final void b(x11 x11Var) {
        this.n.j(x11Var);
    }

    @Override // defpackage.ps2
    public final void f(int i) {
        bl blVar = this.n;
        i89 i89Var = (i89) ((rs2) blVar.h0).j.get((qn) blVar.Z);
        if (i89Var != null) {
            if (i89Var.o) {
                i89Var.m(new x11(17, null, null));
            } else {
                i89Var.f(i);
            }
        }
    }

    @Override // defpackage.ps2
    public final void g() {
        GoogleSignInAccount googleSignInAccountC;
        z87 z87Var = this.m;
        z87Var.getClass();
        boolean z = false;
        try {
            z87Var.A.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                Context context = z87Var.c;
                ReentrantLock reentrantLock = vj7.c;
                w45.s(context);
                ReentrantLock reentrantLock2 = vj7.c;
                reentrantLock2.lock();
                try {
                    vj7 vj7Var = vj7.d;
                    if (vj7Var == null) {
                        vj7Var = new vj7(context.getApplicationContext());
                        vj7.d = vj7Var;
                    }
                    reentrantLock2.unlock();
                    String strA = vj7Var.a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(strA)) {
                        StringBuilder sb = new StringBuilder(20 + String.valueOf(strA).length());
                        sb.append("googleSignInAccount:");
                        sb.append(strA);
                        String strA2 = vj7Var.a(sb.toString());
                        if (strA2 != null) {
                            try {
                                googleSignInAccountC = GoogleSignInAccount.c(strA2);
                            } catch (JSONException unused) {
                                googleSignInAccountC = null;
                            }
                        }
                    }
                    googleSignInAccountC = null;
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            } else {
                googleSignInAccountC = null;
            }
            Integer num = z87Var.C;
            w45.s(num);
            j99 j99Var = new j99(2, account, num.intValue(), googleSignInAccountC);
            t89 t89Var = (t89) z87Var.h();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(t89Var.h);
            int i = n89.a;
            parcelObtain.writeInt(1);
            int iS0 = mb6.s0(parcelObtain, 20293);
            mb6.r0(parcelObtain, 1, 4);
            parcelObtain.writeInt(1);
            mb6.m0(parcelObtain, 2, j99Var, 0);
            mb6.t0(parcelObtain, iS0);
            parcelObtain.writeStrongBinder(this);
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                t89Var.g.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        } catch (RemoteException e) {
            try {
                this.i.post(new zo2((byte) 17, this, new e99(1, new x11(8, null, null), null), z));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }
}
