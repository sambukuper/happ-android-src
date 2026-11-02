package defpackage;

import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class bb9 {
    public final int a;
    public final z18 b = new z18();
    public final byte c;
    public final Bundle d;
    public final /* synthetic */ byte e;

    /* JADX WARN: Multi-variable type inference failed */
    public bb9(int i, int i2, Bundle bundle, byte b) {
        this.e = b;
        this.a = i;
        this.c = i2;
        this.d = bundle;
    }

    public final boolean a() {
        switch (this.e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            new StringBuilder(toString().length() + 16 + String.valueOf(bundle).length());
        }
        this.b.a(bundle);
    }

    public final void c(db9 db9Var) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            new StringBuilder(toString().length() + 14 + db9Var.toString().length());
        }
        this.b.a.k(db9Var);
    }

    public final String toString() {
        byte b = this.c;
        int length = String.valueOf((int) b).length();
        int i = this.a;
        int length2 = String.valueOf(i).length();
        boolean zA = a();
        StringBuilder sb = new StringBuilder(length + 19 + length2 + 8 + String.valueOf(zA).length() + 1);
        sb.append("Request { what=");
        sb.append((int) b);
        sb.append(" id=");
        sb.append(i);
        sb.append(" oneWay=");
        sb.append(zA);
        sb.append("}");
        return sb.toString();
    }
}
