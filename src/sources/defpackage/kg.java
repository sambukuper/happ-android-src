package defpackage;

import android.os.Build;
import android.os.Trace;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kg implements gn2 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object f0;
    public final /* synthetic */ Object g0;

    public /* synthetic */ kg(y05 y05Var, ArrayList arrayList, List list, boolean z) {
        this.X = (byte) 1;
        this.Z = y05Var;
        this.f0 = arrayList;
        this.g0 = list;
        this.Y = z;
    }

    @Override // defpackage.gn2
    public final Object B(Object obj) throws Throwable {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        boolean z = this.Y;
        Object obj2 = this.g0;
        Object obj3 = this.f0;
        Object obj4 = this.Z;
        switch (b) {
            case 0:
                je jeVar = (je) obj3;
                g60 g60Var = (g60) obj2;
                p34 p34Var = (p34) obj;
                p34Var.a();
                um0 um0Var = p34Var.X;
                if (((Boolean) ((dn2) obj4).invoke()).booleanValue()) {
                    if (z) {
                        long jA0 = um0Var.A0();
                        lr lrVar = um0Var.Y;
                        long jP = lrVar.p();
                        lrVar.k().g();
                        try {
                            ((wl6) lrVar.Y).U(-1.0f, 1.0f, jA0);
                            sv1.U(p34Var, jeVar, 0L, 0.0f, g60Var, 0, 46);
                        } finally {
                            p61.w(lrVar, jP);
                        }
                    } else {
                        sv1.U(p34Var, jeVar, 0L, 0.0f, g60Var, 0, 46);
                    }
                }
                return dn8Var;
            case 1:
                y05 y05Var = (y05) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                List list = (List) obj2;
                do5 do5Var = (do5) obj;
                do5Var.X = true;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((f74) arrayList.get(i)).c(do5Var, z);
                }
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((f74) list.get(i2)).c(do5Var, z);
                }
                do5Var.X = false;
                y05Var.getValue();
                return dn8Var;
            case 2:
                return new o87(this.Y, (dn2) obj4, (dn2) obj3, (p87) obj, (gn2) obj2);
            default:
                ec4 ec4Var = (ec4) obj4;
                String strSubstring = (String) obj3;
                a59 a59Var = (a59) obj2;
                Throwable th = (Throwable) obj;
                if (th instanceof r49) {
                    ec4Var.d(((r49) th).X);
                }
                if (!z || strSubstring == null) {
                    return dn8Var;
                }
                int iHashCode = a59Var.a.hashCode();
                if (Build.VERSION.SDK_INT >= 29) {
                    if (strSubstring.length() > 127) {
                        strSubstring = strSubstring.substring(0, 127);
                    }
                    wa.m(iHashCode, strSubstring);
                    return dn8Var;
                }
                if (strSubstring.length() > 127) {
                    strSubstring = strSubstring.substring(0, 127);
                }
                try {
                    Method method = ln7.d;
                    if (method == null) {
                        method = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        ln7.d = method;
                    }
                    if (method == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    method.invoke(null, Long.valueOf(ln7.a), strSubstring, Integer.valueOf(iHashCode));
                    return dn8Var;
                } catch (Exception e) {
                    if (!(e instanceof InvocationTargetException)) {
                        return dn8Var;
                    }
                    Throwable cause = ((InvocationTargetException) e).getCause();
                    if (cause instanceof RuntimeException) {
                        throw cause;
                    }
                    u52.q(cause);
                    return null;
                }
        }
    }

    public /* synthetic */ kg(byte b, Object obj, Object obj2, Object obj3, boolean z) {
        this.X = b;
        this.Z = obj;
        this.Y = z;
        this.f0 = obj2;
        this.g0 = obj3;
    }

    public /* synthetic */ kg(boolean z, dn2 dn2Var, dn2 dn2Var2, gn2 gn2Var) {
        this.X = (byte) 2;
        this.Y = z;
        this.Z = dn2Var;
        this.f0 = dn2Var2;
        this.g0 = gn2Var;
    }
}
