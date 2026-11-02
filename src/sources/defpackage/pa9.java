package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pa9 extends g89 implements IInterface {
    public final int h;

    public pa9(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        if (bArr.length == 25) {
            this.h = Arrays.hashCode(bArr);
        } else {
            kp5.e();
            throw null;
        }
    }

    public static byte[] p(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            bt.g(e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pa9)) {
            return false;
        }
        try {
            pa9 pa9Var = (pa9) obj;
            if (pa9Var.h != this.h) {
                return false;
            }
            return Arrays.equals(o(), (byte[]) new l85(pa9Var.o()).h);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public final int hashCode() {
        return this.h;
    }

    @Override // defpackage.g89
    public final boolean n(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.h);
            return true;
        }
        l85 l85Var = new l85(o());
        parcel2.writeNoException();
        int i2 = ba9.a;
        parcel2.writeStrongBinder(l85Var);
        return true;
    }

    public abstract byte[] o();
}
