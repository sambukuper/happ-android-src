package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.view.View;
import java.lang.reflect.Array;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class cb0 implements rs, lu8 {
    public final /* synthetic */ byte X;
    public int Y;
    public int Z;
    public Object f0;

    public cb0(int i, int i2, byte b) {
        this.X = b;
        switch (b) {
            case 2:
                this.f0 = null;
                this.Y = i;
                int i3 = i2 & 7;
                this.Z = i3 == 0 ? 8 : i3;
                break;
            default:
                this.f0 = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
                this.Y = i;
                this.Z = i2;
                break;
        }
    }

    public void b(int i) {
        int[] iArr = (int[]) this.f0;
        int i2 = this.Y;
        iArr[i2] = i;
        int i3 = this.Z & (i2 + 1);
        this.Y = i3;
        if (i3 == 0) {
            int length = iArr.length;
            int i4 = length << 1;
            if (i4 < 0) {
                kp5.t("Max array capacity exceeded");
                return;
            }
            int[] iArr2 = new int[i4];
            eu.e0(0, 0, length, iArr, iArr2);
            eu.e0(length, 0, 0, (int[]) this.f0, iArr2);
            this.f0 = iArr2;
            this.Y = length;
            this.Z = i4 - 1;
        }
    }

    public void c() {
        int i;
        int i2;
        int i3 = this.Y;
        if (i3 != 2) {
            if (i3 != 3 && i3 != 1) {
                this.f0 = null;
                return;
            }
            ej4 ej4Var = (ej4) this.f0;
            if (ej4Var != null) {
                synchronized (ej4Var.c) {
                    i = ej4Var.a;
                }
                if (i == Integer.MAX_VALUE) {
                    return;
                }
            }
            this.f0 = new ej4(Integer.MAX_VALUE);
            return;
        }
        int i4 = this.Z;
        if (i4 <= 0) {
            kp5.e();
            return;
        }
        ej4 ej4Var2 = (ej4) this.f0;
        if (ej4Var2 != null) {
            synchronized (ej4Var2.c) {
                i2 = ej4Var2.a;
            }
            i4 = this.Z;
            if (i2 == i4) {
                return;
            }
        }
        this.f0 = new ej4(i4);
    }

    public byte e(int i, int i2) {
        return ((byte[][]) this.f0)[i2][i];
    }

    @Override // defpackage.rs
    public Object f() {
        return ((rs) this.f0).f();
    }

    @Override // defpackage.rs
    public void g(int i, Object obj) {
        ((rs) this.f0).g(i + (this.Z == 0 ? this.Y : 0), obj);
    }

    @Override // defpackage.rs
    public void h(Object obj) {
        this.Z++;
        ((rs) this.f0).h(obj);
    }

    @Override // defpackage.rs
    public void i() {
        ((rs) this.f0).i();
    }

    @Override // defpackage.rs
    public void j(int i, int i2, int i3) {
        int i4 = this.Z == 0 ? this.Y : 0;
        ((rs) this.f0).j(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.rs
    public void k(int i, int i2) {
        ((rs) this.f0).k(i + (this.Z == 0 ? this.Y : 0), i2);
    }

    @Override // defpackage.rs
    public void l() {
        if (this.Z <= 0) {
            d01.a("OffsetApplier up called with no corresponding down");
        }
        this.Z--;
        ((rs) this.f0).l();
    }

    @Override // defpackage.ju8
    public wk m(long j, wk wkVar, wk wkVar2, wk wkVar3) {
        return ((yr6) this.f0).m(j, wkVar, wkVar2, wkVar3);
    }

    @Override // defpackage.rs
    public void n(int i, Object obj) {
        ((rs) this.f0).n(i + (this.Z == 0 ? this.Y : 0), obj);
    }

    @Override // defpackage.rs
    public void p(rn2 rn2Var, Object obj) {
        ((rs) this.f0).p(rn2Var, obj);
    }

    public int q(int i) {
        if (i >= 0) {
            int i2 = this.Y;
            int i3 = this.Z;
            if (i < (i2 & i3)) {
                return ((int[]) this.f0)[i & i3];
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public boolean r() {
        return this.Y < this.Z;
    }

    public al8 s() {
        int i = this.Y;
        if (i >= this.Z) {
            bt.n();
            return null;
        }
        al8 al8Var = (al8) this.f0;
        this.Y = i + 1;
        return al8Var.b(i);
    }

    public void t(int i, int i2, int i3) {
        ((byte[][]) this.f0)[i2][i] = (byte) i3;
    }

    public String toString() {
        switch (this.X) {
            case 0:
                int i = this.Y;
                int i2 = this.Z;
                StringBuilder sb = new StringBuilder((i * 2 * i2) + 2);
                for (int i3 = 0; i3 < i2; i3++) {
                    byte[] bArr = ((byte[][]) this.f0)[i3];
                    for (int i4 = 0; i4 < i; i4++) {
                        byte b = bArr[i4];
                        if (b == 0) {
                            sb.append(" 0");
                        } else if (b != 1) {
                            sb.append("  ");
                        } else {
                            sb.append(" 1");
                        }
                    }
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0049 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:3:0x0001, B:7:0x0007, B:12:0x0027, B:14:0x002e, B:16:0x0040, B:26:0x0063, B:21:0x0049, B:23:0x005c, B:29:0x0067, B:33:0x006f), top: B:38:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:32:0x006e  */
    public synchronized int u() {
        List<ResolveInfo> listQueryBroadcastReceivers;
        try {
            int i = this.Z;
            if (i != 0) {
                return i;
            }
            Context context = (Context) this.f0;
            PackageManager packageManager = context.getPackageManager();
            if (n59.a(context).a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                return 0;
            }
            int i2 = 1;
            if (zc1.T()) {
                Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                intent.setPackage("com.google.android.gms");
                listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                if (listQueryBroadcastReceivers != null) {
                }
                if (true != zc1.T()) {
                    i2 = 2;
                }
                this.Z = i2;
                return i2;
            }
            Intent intent2 = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent2.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
            if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                Intent intent3 = new Intent("com.google.iid.TOKEN_REQUEST");
                intent3.setPackage("com.google.android.gms");
                listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent3, 0);
                if (listQueryBroadcastReceivers != null || listQueryBroadcastReceivers.isEmpty()) {
                    if (true != zc1.T()) {
                        i2 = 2;
                    }
                    this.Z = i2;
                    return i2;
                }
                i2 = 2;
            }
            this.Z = i2;
            return i2;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.lu8
    public int v() {
        return this.Z;
    }

    public synchronized int w() {
        PackageInfo packageInfo;
        if (this.Y == 0) {
            try {
                packageInfo = n59.a((Context) this.f0).a.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                "Failed to find package ".concat(e.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.Y = packageInfo.versionCode;
            }
        }
        return this.Y;
    }

    @Override // defpackage.lu8
    public int x() {
        return this.Y;
    }

    @Override // defpackage.ju8
    public wk z(long j, wk wkVar, wk wkVar2, wk wkVar3) {
        return ((yr6) this.f0).z(j, wkVar, wkVar2, wkVar3);
    }

    public cb0(Context context) {
        this.X = (byte) 10;
        this.Z = 0;
        this.f0 = context;
    }

    public /* synthetic */ cb0(byte b) {
        this.X = b;
    }

    public cb0(View view) {
        this.X = (byte) 7;
        this.f0 = view;
    }

    public cb0(Bitmap bitmap, int i, int i2) {
        this.X = (byte) 9;
        bitmap.getClass();
        this.f0 = bitmap;
        this.Y = i;
        this.Z = i2;
    }

    public cb0() {
        this.X = (byte) 2;
        this.f0 = new cb0[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
        this.Y = 0;
        this.Z = 0;
    }

    public cb0(rs rsVar, int i) {
        this.X = (byte) 3;
        this.f0 = rsVar;
        this.Y = i;
    }

    public cb0(int i, int i2, dn2 dn2Var) {
        this.X = (byte) 4;
        this.Y = i;
        this.Z = i2;
        this.f0 = dn2Var;
    }

    public cb0(int i, int i2, xx1 xx1Var) {
        this.X = (byte) 6;
        this.Y = i;
        this.Z = i2;
        this.f0 = new yr6(new ue2(i, i2, xx1Var));
    }
}
