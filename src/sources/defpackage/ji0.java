package defpackage;

import android.os.Build;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ji0 {
    public final boolean a;
    public final r75 b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX WARN: Code duplicated, block: B:32:0x0070  */
    public ji0(boolean z, r75 r75Var, int i, boolean z2, int i2) {
        boolean z3;
        if ((i2 & 2) != 0) {
            z = Build.VERSION.SDK_INT >= 30;
        }
        r75Var = (i2 & 4) != 0 ? new r75(0, ki0.X) : r75Var;
        i = (i2 & 16) != 0 ? 0 : i;
        if ((i2 & 32) != 0) {
            Map map = jg0.c;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 > 27) {
                String str = Build.HARDWARE;
                if (!dh3.f(str, "samsungexynos7870") && (!mm7.S(str, "qcom") || i3 > 31)) {
                    Map map2 = jg0.d;
                    String str2 = Build.BRAND;
                    str2.getClass();
                    Locale locale = Locale.ROOT;
                    String lowerCase = str2.toLowerCase(locale);
                    lowerCase.getClass();
                    Set set = (Set) map2.get(lowerCase);
                    if (set != null) {
                        String str3 = Build.MODEL;
                        str3.getClass();
                        String lowerCase2 = str3.toLowerCase(locale);
                        lowerCase2.getClass();
                        z3 = set.contains(lowerCase2) ? true : z3;
                    }
                    z3 = false;
                }
            }
        }
        z2 = (i2 & 64) != 0 ? false : z2;
        boolean z4 = (i2 & 128) == 0;
        this.a = z;
        this.b = r75Var;
        this.c = i;
        this.d = z3;
        this.e = z2;
        this.f = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ji0) {
            ji0 ji0Var = (ji0) obj;
            if (this.a == ji0Var.a && this.b == ji0Var.b && this.c == ji0Var.c && this.d == ji0Var.d && this.e == ji0Var.e && this.f == ji0Var.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + pc6.f(pc6.f(oi0.e(this.c, (this.b.hashCode() + pc6.f(Boolean.hashCode(false) * 31, 31, this.a)) * 961, 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "Flags(configureBlankSessionOnStop=false, abortCapturesOnStop=" + this.a + ", awaitRepeatingRequestBeforeCapture=" + this.b + ", awaitRepeatingRequestOnDisconnect=null, finalizeSessionOnCloseBehavior=" + ((Object) ("FinalizeSessionOnCloseBehavior(value=" + this.c + ')')) + ", closeCaptureSessionOnDisconnect=" + this.d + ", closeCameraDeviceOnClose=" + this.e + ", enableRestartDelays=" + this.f + ')';
    }
}
