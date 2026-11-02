package defpackage;

import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class m70 {
    public final /* synthetic */ byte a;
    public int b;
    public boolean c;
    public final Object d;
    public final Object e;

    public m70(Context context, lb lbVar) {
        this.a = (byte) 1;
        this.d = lbVar;
        this.b = 0;
        this.e = new GestureDetector(context, new jc3(this));
    }

    public static void a(vv4[][][] vv4VarArr, int i, vv4 vv4Var) {
        vv4[] vv4VarArr2 = vv4VarArr[i + vv4Var.d][vv4Var.c];
        gx4 gx4Var = vv4Var.a;
        int iOrdinal = gx4Var.ordinal();
        char c = 2;
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                c = 1;
            } else if (iOrdinal == 4) {
                c = 3;
            } else {
                if (iOrdinal != 6) {
                    u52.r(gx4Var, "Illegal mode ");
                    return;
                }
                c = 0;
            }
        }
        vv4 vv4Var2 = vv4VarArr2[c];
        if (vv4Var2 == null || vv4Var2.f > vv4Var.f) {
            vv4VarArr2[c] = vv4Var;
        }
    }

    public static boolean c(gx4 gx4Var, char c) {
        int iOrdinal = gx4Var.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                if ((c < '`' ? t02.a[c] : -1) == -1) {
                    return false;
                }
            } else if (iOrdinal != 4) {
                if (iOrdinal != 6) {
                    return false;
                }
                return t02.b(String.valueOf(c));
            }
        } else if (c < '0' || c > '9') {
            return false;
        }
        return true;
    }

    public static av8 f(int i) {
        int iB = p61.B(i);
        if (iB != 0) {
            return iB != 1 ? av8.c(40) : av8.c(26);
        }
        return av8.c(9);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002f  */
    public void b(av8 av8Var, vv4[][][] vv4VarArr, int i, vv4 vv4Var) {
        int i2;
        String str = (String) this.d;
        wx1 wx1Var = (wx1) this.e;
        CharsetEncoder[] charsetEncoderArr = wx1Var.a;
        int length = charsetEncoderArr.length;
        int i3 = wx1Var.b;
        if (i3 >= 0) {
            char cCharAt = str.charAt(i);
            if (charsetEncoderArr[i3].canEncode(_UrlKt.FRAGMENT_ENCODE_SET + cCharAt)) {
                length = i3 + 1;
            } else {
                i3 = 0;
            }
        } else {
            i3 = 0;
        }
        int i4 = length;
        for (int i5 = i3; i5 < i4; i5++) {
            char cCharAt2 = str.charAt(i);
            if (charsetEncoderArr[i5].canEncode(_UrlKt.FRAGMENT_ENCODE_SET + cCharAt2)) {
                a(vv4VarArr, i, new vv4(this, gx4.BYTE, i, i5, 1, vv4Var, av8Var));
            }
        }
        char cCharAt3 = str.charAt(i);
        gx4 gx4Var = gx4.KANJI;
        if (c(gx4Var, cCharAt3)) {
            a(vv4VarArr, i, new vv4(this, gx4Var, i, 0, 1, vv4Var, av8Var));
        }
        int length2 = str.length();
        char cCharAt4 = str.charAt(i);
        gx4 gx4Var2 = gx4.ALPHANUMERIC;
        int i6 = 2;
        if (c(gx4Var2, cCharAt4)) {
            int i7 = i + 1;
            a(vv4VarArr, i, new vv4(this, gx4Var2, i, 0, (i7 >= length2 || !c(gx4Var2, str.charAt(i7))) ? 1 : 2, vv4Var, av8Var));
        }
        char cCharAt5 = str.charAt(i);
        gx4 gx4Var3 = gx4.NUMERIC;
        if (c(gx4Var3, cCharAt5)) {
            int i8 = i + 1;
            if (i8 >= length2 || !c(gx4Var3, str.charAt(i8))) {
                i2 = 1;
            } else {
                int i9 = i + 2;
                if (i9 < length2 && c(gx4Var3, str.charAt(i9))) {
                    i6 = 3;
                }
                i2 = i6;
            }
            a(vv4VarArr, i, new vv4(this, gx4Var3, i, 0, i2, vv4Var, av8Var));
        }
    }

    public void d(int i) {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj2;
                WeakReference weakReference = bottomSheetBehavior.Y;
                if (weakReference != null && weakReference.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        ((View) bottomSheetBehavior.Y.get()).postOnAnimation((xb) obj);
                        this.c = true;
                    }
                    break;
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj2;
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        ((View) sideSheetBehavior.p.get()).postOnAnimation((fl6) obj);
                        this.c = true;
                    }
                    break;
                }
                break;
        }
    }

    public f63 e(av8 av8Var) throws s59 {
        int i;
        String str = (String) this.d;
        int length = str.length();
        CharsetEncoder[] charsetEncoderArr = ((wx1) this.e).a;
        vv4[][][] vv4VarArr = (vv4[][][]) Array.newInstance((Class<?>) vv4.class, length + 1, charsetEncoderArr.length, 4);
        b(av8Var, vv4VarArr, 0, null);
        for (int i2 = 1; i2 <= length; i2++) {
            for (int i3 = 0; i3 < charsetEncoderArr.length; i3++) {
                for (int i4 = 0; i4 < 4; i4++) {
                    vv4 vv4Var = vv4VarArr[i2][i3][i4];
                    if (vv4Var != null && i2 < length) {
                        b(av8Var, vv4VarArr, i2, vv4Var);
                    }
                }
            }
        }
        int i5 = -1;
        int i6 = Integer.MAX_VALUE;
        int i7 = -1;
        for (int i8 = 0; i8 < charsetEncoderArr.length; i8++) {
            for (int i9 = 0; i9 < 4; i9++) {
                vv4 vv4Var2 = vv4VarArr[length][i8][i9];
                if (vv4Var2 != null && (i = vv4Var2.f) < i6) {
                    i5 = i8;
                    i7 = i9;
                    i6 = i;
                }
            }
        }
        if (i5 >= 0) {
            return new f63(this, av8Var, vv4VarArr[length][i5][i7]);
        }
        throw new s59(pc6.p("Internal error: failed to encode \"", str, "\""));
    }

    public m70(SideSheetBehavior sideSheetBehavior) {
        this.a = (byte) 3;
        this.e = sideSheetBehavior;
        this.d = new fl6((Object) this, (byte) 4);
    }

    public m70(BottomSheetBehavior bottomSheetBehavior) {
        this.a = (byte) 0;
        this.e = bottomSheetBehavior;
        this.d = new xb(this, (byte) 2);
    }

    public m70(String str, Charset charset, boolean z, int i) {
        this.a = (byte) 2;
        this.d = str;
        this.c = z;
        this.e = new wx1(str, charset);
        this.b = i;
    }
}
