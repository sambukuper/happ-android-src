package defpackage;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.textclassifier.TextClassification;
import android.widget.Magnifier;
import androidx.compose.foundation.layout.b;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ts2 implements wo5, wp5 {
    public static ts2 X;
    public static final ts2 Y = new ts2();
    public static final ts2 Z = new ts2();

    public static Typeface c(String str, dj2 dj2Var, int i) {
        if (i == 0 && dh3.f(dj2Var, dj2.g0) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        if (i == 0 && dh3.f(dj2Var, dj2.i0) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT_BOLD;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), dj2Var.X, i == 1);
    }

    public static void e(i51 i51Var, Context context, u38 u38Var) {
        if (context == null) {
            return;
        }
        int i = u38Var.c;
        TextClassification textClassification = u38Var.b;
        Drawable drawable = u38Var.d;
        byte b = 1;
        if (i < 0) {
            i51.b(i51Var, new b1(textClassification, (byte) 26), drawable != null ? new zy0(-1123224187, true, new m38(drawable, (byte) 0)) : null, new a23((Object) context, (Object) textClassification, (byte) 25), 6);
        } else {
            RemoteAction remoteAction = textClassification.getActions().get(i);
            i51.b(i51Var, new b1(remoteAction, (byte) 27), drawable != null ? new zy0(1106162332, true, new m38(drawable, b)) : null, new hr5(remoteAction, (byte) 29), 6);
        }
    }

    public static final String f(TextClassification textClassification, lp2 lp2Var) {
        lp2Var.W(950061013);
        String strValueOf = String.valueOf(textClassification.getLabel());
        lp2Var.p(false);
        return strValueOf;
    }

    public static final String g(RemoteAction remoteAction, lp2 lp2Var) {
        lp2Var.W(-1376593684);
        String string = remoteAction.getTitle().toString();
        lp2Var.p(false);
        return string;
    }

    public static final void h(RemoteAction remoteAction) {
        PendingIntent actionIntent = remoteAction.getActionIntent();
        if (Build.VERSION.SDK_INT >= 34) {
            u3.B(actionIntent);
        } else {
            actionIntent.send();
        }
    }

    public static final boolean i(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo;
        v99 v99Var;
        int i;
        if (packageInfo != null) {
            boolean z = (("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) && ((applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 129) == 0)) ? false : true;
            try {
                v99 v99Var2 = z ? ta9.c : ta9.b;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 28) {
                    Signature[] signatureArr = packageInfo.signatures;
                    byte[] byteArray = null;
                    if (signatureArr != null && signatureArr.length == 1) {
                        byteArray = signatureArr[0].toByteArray();
                    }
                    if (byteArray != null) {
                        p99 p99Var = t99.Y;
                        Object[] objArr = {byteArray};
                        p38.g(1, objArr);
                        v99Var = new v99(1, objArr);
                    } else {
                        p99 p99Var2 = t99.Y;
                        v99Var = v99.g0;
                    }
                } else {
                    if (i2 < 28) {
                        throw new IllegalStateException();
                    }
                    SigningInfo signingInfo = packageInfo.signingInfo;
                    if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
                        p99 p99Var3 = t99.Y;
                        v99Var = v99.g0;
                    } else {
                        p99 p99Var4 = t99.Y;
                        Object[] objArrCopyOf = new Object[4];
                        Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                        int length = signingCertificateHistory.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            byte[] byteArray2 = signingCertificateHistory[i3].toByteArray();
                            byteArray2.getClass();
                            int length2 = objArrCopyOf.length;
                            int i5 = i4 + 1;
                            if (i5 < 0) {
                                throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
                            }
                            if (i5 <= length2) {
                                i = length2;
                            } else {
                                i = (length2 >> 1) + length2 + 1;
                                if (i < i5) {
                                    int iHighestOneBit = Integer.highestOneBit(i4);
                                    i = iHighestOneBit + iHighestOneBit;
                                }
                                if (i < 0) {
                                    i = Integer.MAX_VALUE;
                                }
                            }
                            if (i > length2) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i);
                            }
                            objArrCopyOf[i4] = byteArray2;
                            i3++;
                            i4 = i5;
                        }
                        v99Var = i4 == 0 ? v99.g0 : new v99(i4, objArrCopyOf);
                    }
                }
                if (v99Var.isEmpty()) {
                    throw new IllegalArgumentException("Unable to obtain package certificate history.");
                }
                t99 t99VarE = v99Var.e();
                int size = t99VarE.size();
                int i6 = 0;
                while (i6 < size) {
                    byte[] bArr = (byte[]) t99VarE.get(i6);
                    p99 p99VarListIterator = v99Var2.listIterator(0);
                    do {
                        int i7 = i6 + 1;
                        if (!p99VarListIterator.hasNext()) {
                            i6 = i7;
                        }
                    } while (!Arrays.equals(bArr, (byte[]) p99VarListIterator.next()));
                    return true;
                }
            } catch (IllegalArgumentException unused) {
                if ((z ? j(packageInfo, ta9.a) : j(packageInfo, ta9.a[0])) == null) {
                    return false;
                }
            }
        }
        return false;
    }

    public static pa9 j(PackageInfo packageInfo, pa9... pa9VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        sa9 sa9Var = new sa9(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < pa9VarArr.length; i++) {
            if (pa9VarArr[i].equals(sa9Var)) {
                return pa9VarArr[i];
            }
        }
        return null;
    }

    @Override // defpackage.wo5
    public vo5 a(View view, boolean z, long j, float f, float f2, boolean z2, fi1 fi1Var, float f3) {
        return new xo5(new Magnifier(view));
    }

    public void b(Drawable drawable, lp2 lp2Var, int i) {
        lp2Var.X(257732500);
        byte b = 4;
        byte b2 = 2;
        int i2 = (lp2Var.h(drawable) ? 4 : 2) | i;
        if (lp2Var.N(i2 & 1, (i2 & 3) != 2)) {
            kx4 kx4VarG = b.g(hx4.X, j51.e);
            boolean zH = lp2Var.h(drawable);
            Object objK = lp2Var.K();
            if (zH || objK == zz0.a) {
                objK = new py7(drawable, b2);
                lp2Var.g0(objK);
            }
            g80.a(w79.r(kx4VarG, (gn2) objK), lp2Var, 0);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new d67(b, i, this, drawable);
        }
    }

    @Override // defpackage.wp5
    public Typeface d(dj2 dj2Var, int i) {
        return c(null, dj2Var, i);
    }

    @Override // defpackage.wp5
    public Typeface k(iq2 iq2Var, dj2 dj2Var, int i) {
        return c(iq2Var.f, dj2Var, i);
    }
}
