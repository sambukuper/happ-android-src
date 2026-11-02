package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.a;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class h70 implements oq1, hu4 {
    public final /* synthetic */ byte X;
    public boolean Y;
    public Object Z;

    public h70(Context context, lk0 lk0Var) {
        boolean z = true;
        this.X = (byte) 1;
        context.getClass();
        this.Y = Build.VERSION.SDK_INT >= 34 && u3.j(context) != 0;
        PackageManager packageManager = context.getPackageManager();
        Integer numB = lk0Var != null ? lk0Var.b() : null;
        boolean zHasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
        boolean zHasSystemFeature2 = packageManager.hasSystemFeature("android.hardware.camera.front");
        boolean z2 = zHasSystemFeature && (numB == null || numB.intValue() == 1);
        if (!zHasSystemFeature2 || (numB != null && numB.intValue() != 0)) {
            z = false;
        }
        this.Z = new wl0(z2, z);
    }

    public static boolean c(Set set, lk0 lk0Var) {
        try {
            lk0Var.c(new LinkedHashSet(set));
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    @Override // defpackage.hu4
    public boolean N(nt4 nt4Var) {
        ((sb8) this.Z).h.onMenuOpened(108, nt4Var);
        return true;
    }

    public boolean a() {
        return this.Y;
    }

    @Override // defpackage.hu4
    public void b(nt4 nt4Var, boolean z) {
        a aVar;
        sb8 sb8Var = (sb8) this.Z;
        if (this.Y) {
            return;
        }
        this.Y = true;
        ActionMenuView actionMenuView = sb8Var.g.a.f0;
        if (actionMenuView != null && (aVar = actionMenuView.y0) != null) {
            aVar.f();
            g5 g5Var = aVar.v0;
            if (g5Var != null && g5Var.b()) {
                g5Var.j.dismiss();
            }
        }
        sb8Var.h.onPanelClosed(108, nt4Var);
        this.Y = false;
    }

    public boolean d(LinkedHashSet linkedHashSet, Set set) {
        wl0 wl0Var = (wl0) this.Z;
        boolean z = wl0Var.b;
        boolean z2 = wl0Var.a;
        if (!this.Y && (z2 || z)) {
            lk0 lk0Var = lk0.c;
            lk0Var.getClass();
            boolean zC = c(linkedHashSet, lk0Var);
            lk0 lk0Var2 = lk0.b;
            lk0Var2.getClass();
            boolean zC2 = c(linkedHashSet, lk0Var2);
            Set set2 = set;
            ArrayList arrayList = new ArrayList(xv0.Z(set2, 10));
            Iterator it = set2.iterator();
            while (it.hasNext()) {
                arrayList.add(((wi0) it.next()).a());
            }
            Set setC1 = wv0.c1(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : linkedHashSet) {
                if (!setC1.contains(((cj0) obj).s().e())) {
                    arrayList2.add(obj);
                }
            }
            Set setC2 = wv0.c1(arrayList2);
            lk0 lk0Var3 = lk0.c;
            lk0Var3.getClass();
            boolean zC3 = c(setC2, lk0Var3);
            lk0 lk0Var4 = lk0.b;
            lk0Var4.getClass();
            boolean zC4 = c(setC2, lk0Var4);
            boolean z3 = z2 && zC && !zC3;
            boolean z4 = z && zC2 && !zC4;
            if (z3 || z4) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0036  */
    public boolean e(CharSequence charSequence, int i) {
        char c = 0;
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            kp5.e();
            return false;
        }
        if (((qe4) this.Z) == null) {
            return a();
        }
        c = 2;
        for (int i2 = 0; i2 < i && c == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            h70 h70Var = c48.a;
            if (directionality == 0) {
                c = 1;
                continue;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case 14:
                    case 15:
                        c = 1;
                        continue;
                    case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                    case 17:
                        break;
                    default:
                        c = 2;
                        continue;
                }
            }
        }
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            return a();
        }
        return false;
    }

    public void f() {
        this.Y = false;
    }

    public void g(byte b) {
        ((b8) this.Z).s(String.valueOf(b));
    }

    public void h(char c) {
        b8 b8Var = (b8) this.Z;
        b8Var.f(b8Var.b, 1);
        char[] cArr = (char[]) b8Var.c;
        int i = b8Var.b;
        b8Var.b = i + 1;
        cArr[i] = c;
    }

    public void i(int i) {
        ((b8) this.Z).s(String.valueOf(i));
    }

    public void j(long j) {
        ((b8) this.Z).s(String.valueOf(j));
    }

    public void k(short s) {
        ((b8) this.Z).s(String.valueOf(s));
    }

    public void l(String str) {
        byte b;
        str.getClass();
        b8 b8Var = (b8) this.Z;
        b8Var.f(b8Var.b, str.length() + 2);
        char[] cArr = (char[]) b8Var.c;
        int i = b8Var.b;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int i4 = i2;
        while (i4 < i3) {
            char c = cArr[i4];
            byte[] bArr = xl7.b;
            if (c < bArr.length && bArr[c] != 0) {
                int length2 = str.length();
                for (int i5 = i4 - i2; i5 < length2; i5++) {
                    b8Var.f(i4, 2);
                    char cCharAt = str.charAt(i5);
                    byte[] bArr2 = xl7.b;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i6 = i4 + 1;
                        ((char[]) b8Var.c)[i4] = cCharAt;
                        i4 = i6;
                    } else if (b == 1) {
                        String str2 = xl7.a[cCharAt];
                        str2.getClass();
                        b8Var.f(i4, str2.length());
                        str2.getChars(0, str2.length(), (char[]) b8Var.c, i4);
                        int length3 = str2.length() + i4;
                        b8Var.b = length3;
                        i4 = length3;
                    } else {
                        char[] cArr2 = (char[]) b8Var.c;
                        cArr2[i4] = '\\';
                        cArr2[i4 + 1] = (char) b;
                        i4 += 2;
                        b8Var.b = i4;
                    }
                }
                b8Var.f(i4, 1);
                ((char[]) b8Var.c)[i4] = '\"';
                b8Var.b = i4 + 1;
                return;
            }
            i4++;
        }
        cArr[i3] = '\"';
        b8Var.b = i3 + 1;
    }

    @Override // defpackage.oq1
    public List lookup(String str) throws UnknownHostException {
        String str2;
        str.getClass();
        if (!this.Y) {
            HashMap map = (HashMap) this.Z;
            if (map != null && (str2 = (String) map.get(str)) != null) {
                str = str2;
            }
            try {
                InetAddress[] allByName = InetAddress.getAllByName(str);
                allByName.getClass();
                return eu.K0(allByName);
            } catch (NullPointerException e) {
                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                unknownHostException.initCause(e);
                throw unknownHostException;
            }
        }
        try {
            InetAddress[] allByName2 = InetAddress.getAllByName(str);
            allByName2.getClass();
            List listK0 = eu.K0(allByName2);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listK0) {
                if (obj instanceof Inet4Address) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        } catch (NullPointerException e2) {
            UnknownHostException unknownHostException2 = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException2.initCause(e2);
            throw unknownHostException2;
        }
    }

    public void o(jk0 jk0Var) throws vl0 {
        wl0 wl0Var = (wl0) this.Z;
        jk0Var.getClass();
        if (this.Y) {
            jk0Var.c().size();
            hi5.z0("CameraValidator");
            return;
        }
        String str = Build.DEVICE;
        hi5.z0("CameraValidator");
        if (wl0Var.a) {
            try {
                lk0.c.c(jk0Var.c()).getClass();
            } catch (RuntimeException e) {
                e = e;
                hi5.z0("CameraValidator");
            }
        }
        e = null;
        if (wl0Var.b) {
            try {
                lk0.b.c(jk0Var.c()).getClass();
            } catch (RuntimeException e2) {
                hi5.z0("CameraValidator");
                if (e == null) {
                    e = e2;
                }
            }
        }
        if (e != null) {
            throw new vl0(jk0Var.c().size(), e);
        }
    }

    public String toString() {
        switch (this.X) {
            case 5:
                return this.Y ? "FALL_THROUGH" : String.valueOf(this.Z);
            default:
                return super.toString();
        }
    }

    public void m() {
    }

    public void n() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h70(Object obj, int i, byte b) {
        this.X = b;
        this.Z = obj;
        this.Y = i;
    }

    public /* synthetic */ h70(Object obj, boolean z, byte b) {
        this.X = b;
        this.Z = obj;
        this.Y = z;
    }

    public /* synthetic */ h70(boolean z, Object obj, byte b) {
        this.X = b;
        this.Y = z;
        this.Z = obj;
    }

    public h70(b8 b8Var) {
        this.X = (byte) 3;
        this.Z = b8Var;
        this.Y = true;
    }

    public /* synthetic */ h70(Object obj, byte b) {
        this.X = b;
        this.Z = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h70(qe4 qe4Var, boolean z) {
        this((Object) qe4Var, (byte) 6);
        this.X = (byte) 6;
        this.Y = z;
    }
}
