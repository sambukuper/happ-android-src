package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import androidx.work.impl.WorkDatabase;
import androidx.work.multiprocess.RemoteWorkManagerService;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class td6 extends Binder implements p43 {
    public static final /* synthetic */ int h = 0;
    public static final byte[] i = new byte[0];
    public final x39 g;

    public td6(RemoteWorkManagerService remoteWorkManagerService) {
        attachInterface(this, p43.e);
        this.g = x39.v0(remoteWorkManagerService);
    }

    @Override // defpackage.p43
    public final void a(String str, r43 r43Var) {
        x39 x39Var = this.g;
        try {
            x39Var.getClass();
            y5 y5Var = x39Var.l0;
            str.getClass();
            ra raVar = (ra) x39Var.j0.j0;
            String strConcat = "CancelWorkByName_".concat(str);
            h37 h37Var = (h37) y5Var.Y;
            h37Var.getClass();
            new sd6((h37) y5Var.Y, r43Var, (ud0) os4.u(raVar, strConcat, h37Var, new hm0(str, x39Var)).Y, (byte) 5).d();
        } catch (Throwable th) {
            vb4.a(r43Var, th);
        }
    }

    @Override // defpackage.p43
    public final void j(r43 r43Var, byte[] bArr) {
        x39 x39Var = this.g;
        try {
            hh5 hh5Var = (hh5) w79.O(bArr, hh5.CREATOR);
            y5 y5Var = x39Var.l0;
            new sd6((h37) y5Var.Y, r43Var, new r39(x39Var.k0, x39Var.n0, y5Var).c(x39Var.i0, UUID.fromString(hh5Var.X), hh5Var.Y), (byte) 9).d();
        } catch (Throwable th) {
            vb4.a(r43Var, th);
        }
    }

    @Override // defpackage.p43
    public final void k(String str, byte[] bArr, r43 r43Var) {
        x39 x39Var = this.g;
        try {
            g49 g49Var = ((yh5) w79.O(bArr, yh5.CREATOR)).X;
            x39Var.getClass();
            y5 y5Var = x39Var.l0;
            str.getClass();
            g49Var.getClass();
            ra raVar = (ra) x39Var.j0.j0;
            String strConcat = "enqueueUniquePeriodic_".concat(str);
            h37 h37Var = (h37) y5Var.Y;
            h37Var.getClass();
            new sd6((h37) y5Var.Y, r43Var, (ud0) os4.u(raVar, strConcat, h37Var, new g00((Object) x39Var, (Object) str, (Object) g49Var, (byte) 22)).Y, (byte) 0).d();
        } catch (Throwable th) {
            vb4.a(r43Var, th);
        }
    }

    @Override // defpackage.p43
    public final void m(r43 r43Var, byte[] bArr) {
        try {
            uh5 uh5Var = (uh5) w79.O(bArr, uh5.CREATOR);
            x39 x39Var = this.g;
            th5 th5Var = uh5Var.X;
            th5Var.getClass();
            new sd6((h37) this.g.l0.Y, r43Var, (ud0) new l39(x39Var, th5Var.a, th5Var.b, th5Var.c, th5.a(x39Var, th5Var.d)).a().Y, (byte) 2).d();
        } catch (Throwable th) {
            vb4.a(r43Var, th);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
        String str = p43.e;
        if (i2 >= 1 && i2 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i2 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i2 == 16777215) {
            parcel2.writeNoException();
            parcel2.writeInt(1);
            return true;
        }
        switch (i2) {
            case 1:
                byte[] bArrCreateByteArray = parcel.createByteArray();
                r43 r43VarB = ed6.b(parcel.readStrongBinder());
                x39 x39Var = this.g;
                try {
                    ArrayList arrayList = ((zh5) w79.O(bArrCreateByteArray, zh5.CREATOR)).X;
                    x39Var.getClass();
                    if (arrayList.isEmpty()) {
                        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
                    }
                    new sd6((h37) x39Var.l0.Y, r43VarB, (ud0) new l39(x39Var, null, g62.Y, arrayList, null).a().Y, (byte) 1).d();
                    return true;
                } catch (Throwable th) {
                    vb4.a(r43VarB, th);
                }
                break;
            case 2:
                k(parcel.readString(), parcel.createByteArray(), ed6.b(parcel.readStrongBinder()));
                return true;
            case 3:
                m(ed6.b(parcel.readStrongBinder()), parcel.createByteArray());
                return true;
            case 4:
                String string = parcel.readString();
                r43 r43VarB2 = ed6.b(parcel.readStrongBinder());
                x39 x39Var2 = this.g;
                try {
                    UUID uuidFromString = UUID.fromString(string);
                    x39Var2.getClass();
                    y5 y5Var = x39Var2.l0;
                    uuidFromString.getClass();
                    ra raVar = (ra) x39Var2.j0.j0;
                    h37 h37Var = (h37) y5Var.Y;
                    h37Var.getClass();
                    new sd6((h37) y5Var.Y, r43VarB2, (ud0) os4.u(raVar, "CancelWorkById", h37Var, new p5(x39Var2, uuidFromString, (byte) 16)).Y, (byte) 3).d();
                    break;
                } catch (Throwable th2) {
                    vb4.a(r43VarB2, th2);
                }
                return true;
            case 5:
                String string2 = parcel.readString();
                r43 r43VarB3 = ed6.b(parcel.readStrongBinder());
                x39 x39Var3 = this.g;
                try {
                    x39Var3.getClass();
                    y5 y5Var2 = x39Var3.l0;
                    string2.getClass();
                    ra raVar2 = (ra) x39Var3.j0.j0;
                    String strConcat = "CancelWorkByTag_".concat(string2);
                    h37 h37Var2 = (h37) y5Var2.Y;
                    h37Var2.getClass();
                    new sd6((h37) y5Var2.Y, r43VarB3, (ud0) os4.u(raVar2, strConcat, h37Var2, new hm0(x39Var3, string2)).Y, (byte) 4).d();
                    break;
                } catch (Throwable th3) {
                    vb4.a(r43VarB3, th3);
                }
                return true;
            case 6:
                a(parcel.readString(), ed6.b(parcel.readStrongBinder()));
                return true;
            case 7:
                r43 r43VarB4 = ed6.b(parcel.readStrongBinder());
                x39 x39Var4 = this.g;
                try {
                    x39Var4.getClass();
                    y5 y5Var3 = x39Var4.l0;
                    ra raVar3 = (ra) x39Var4.j0.j0;
                    h37 h37Var3 = (h37) y5Var3.Y;
                    h37Var3.getClass();
                    new sd6((h37) y5Var3.Y, r43VarB4, (ud0) os4.u(raVar3, "CancelAllWork", h37Var3, new im0(x39Var4, (byte) 0)).Y, (byte) 6).d();
                    break;
                } catch (Throwable th4) {
                    vb4.a(r43VarB4, th4);
                }
                return true;
            case 8:
                byte[] bArrCreateByteArray2 = parcel.createByteArray();
                r43 r43VarB5 = ed6.b(parcel.readStrongBinder());
                try {
                    xh5 xh5Var = (xh5) w79.O(bArrCreateByteArray2, xh5.CREATOR);
                    x39 x39Var5 = this.g;
                    y5 y5Var4 = x39Var5.l0;
                    h37 h37Var4 = (h37) y5Var4.Y;
                    yr6 yr6Var = xh5Var.X;
                    WorkDatabase workDatabase = x39Var5.k0;
                    workDatabase.getClass();
                    t16 t16Var = new t16(yr6Var, (byte) 22);
                    h37 h37Var5 = (h37) y5Var4.Y;
                    h37Var5.getClass();
                    new sd6(h37Var4, r43VarB5, vr3.u(h37Var5, "loadStatusFuture", new a23((Object) t16Var, (Object) workDatabase, (byte) 22)), (byte) 7).d();
                    break;
                } catch (Throwable th5) {
                    vb4.a(r43VarB5, th5);
                }
                return true;
            case 9:
                byte[] bArrCreateByteArray3 = parcel.createByteArray();
                r43 r43VarB6 = ed6.b(parcel.readStrongBinder());
                try {
                    sh5 sh5Var = (sh5) w79.O(bArrCreateByteArray3, sh5.CREATOR);
                    x39 x39Var6 = this.g;
                    Context context = x39Var6.i0;
                    y5 y5Var5 = x39Var6.l0;
                    new sd6((h37) y5Var5.Y, r43VarB6, vr3.u((h37) y5Var5.Y, "updateProgress", new g00((Object) new e49(x39Var6.k0, y5Var5), (Object) UUID.fromString(sh5Var.X), (Object) sh5Var.Y.X, (byte) 21)), (byte) 8).d();
                    break;
                } catch (Throwable th6) {
                    vb4.a(r43VarB6, th6);
                }
                return true;
            case 10:
                j(ed6.b(parcel.readStrongBinder()), parcel.createByteArray());
                return true;
            default:
                return super.onTransact(i2, parcel, parcel2, i3);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
