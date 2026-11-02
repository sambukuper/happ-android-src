package defpackage;

import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.google.firebase.components.ComponentRegistrar;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import su.happ.proxyutility.ui.BaseActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ra implements z3, ei2, ch1, a08, z41, d61, vs, d91, i86, oq1, es5 {
    public static ra Y;
    public final /* synthetic */ byte X;

    public ra(byte b) {
        this.X = b;
        switch (b) {
            case 19:
                break;
            default:
                new ej4(16);
                long[] jArr = uw6.a;
                new s05();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d6 A[RETURN] */
    public static kb0 e(String str) {
        int i;
        char cCharAt;
        str.getClass();
        byte[] bArr = a.a;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i2 = (int) ((((long) length) * 6) / 8);
        byte[] bArrCopyOf = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i3 >= length) {
                int i7 = i4 % 4;
                if (i7 != 1) {
                    if (i7 == 2) {
                        bArrCopyOf[i6] = (byte) ((i5 << 12) >> 16);
                        i6++;
                    } else if (i7 == 3) {
                        int i8 = i5 << 6;
                        int i9 = i6 + 1;
                        bArrCopyOf[i6] = (byte) (i8 >> 16);
                        i6 += 2;
                        bArrCopyOf[i9] = (byte) (i8 >> 8);
                    }
                    if (i6 != i2) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i6);
                    }
                }
                if (bArrCopyOf != null) {
                    return new kb0(bArrCopyOf);
                }
                return null;
            }
            char cCharAt2 = str.charAt(i3);
            if ('A' <= cCharAt2 && cCharAt2 < '[') {
                i = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                i = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                i = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i = 62;
            } else {
                if (cCharAt2 != '/' && cCharAt2 != '_') {
                    if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                        break;
                    }
                } else {
                    i = 63;
                }
                i3++;
            }
            i5 = (i5 << 6) | i;
            i4++;
            if (i4 % 4 == 0) {
                bArrCopyOf[i6] = (byte) (i5 >> 16);
                int i10 = i6 + 2;
                bArrCopyOf[i6 + 1] = (byte) (i5 >> 8);
                i6 += 3;
                bArrCopyOf[i10] = (byte) i5;
            }
            i3++;
        }
        bArrCopyOf = null;
        if (bArrCopyOf != null) {
            return new kb0(bArrCopyOf);
        }
        return null;
    }

    public static kb0 f(String str) {
        if (str.length() % 2 != 0) {
            em7.c("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (gv3.o(str.charAt(i2 + 1)) + (gv3.o(str.charAt(i2)) << 4));
        }
        return new kb0(bArr);
    }

    public static kb0 g(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(iq0.a);
        bytes.getClass();
        kb0 kb0Var = new kb0(bytes);
        kb0Var.Z = str;
        return kb0Var;
    }

    public static hh1 j(mo8 mo8Var, boolean z) {
        boolean zE;
        mo8Var.getClass();
        if (mo8Var instanceof hh1) {
            return (hh1) mo8Var;
        }
        mo8Var.n0();
        if ((mo8Var.n0().x() instanceof hi8) || (mo8Var instanceof c45)) {
            ot0 ot0VarX = mo8Var.n0().x();
            ii8 ii8Var = ot0VarX instanceof ii8 ? (ii8) ot0VarX : null;
            zE = true;
            if (ii8Var == null || ii8Var.p0) {
                zE = (z && (mo8Var.n0().x() instanceof hi8)) ? cj8.e(mo8Var) : true ^ z68.R(lh4.E0.S0(), yn0.O(mo8Var), ih8.b);
            }
        } else {
            zE = false;
        }
        if (!zE) {
            return null;
        }
        if (mo8Var instanceof ce2) {
            ce2 ce2Var = (ce2) mo8Var;
            dh3.f(ce2Var.Y.n0(), ce2Var.Z.n0());
        }
        return new hh1(yn0.O(mo8Var).r0(false), z);
    }

    public static int k() {
        int i = pk1.d;
        pk1.d = i << 1;
        return i;
    }

    public static kb0 l(byte[] bArr) {
        kb0 kb0Var = kb0.f0;
        int length = bArr.length;
        os4.i(bArr.length, 0L, length);
        return new kb0(eu.j0(0, length, bArr));
    }

    public static void n(BaseActivity baseActivity, ml2 ml2Var, ho1 ho1Var, Bitmap bitmap, int i) {
        q51 q51Var = null;
        if ((i & 8) != 0) {
            bitmap = null;
        }
        io1 io1Var = new io1(ho1Var, bitmap, new w01((byte) 14));
        d8.Z(ml2Var, io1Var, "DialogSubscriptionShare");
        int iOrdinal = ho1Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            u84 u84VarZ = ys0.z(baseActivity.X);
            nf1 nf1Var = tp1.a;
            jm4.Q(u84VarZ, dm4.a, new q0(baseActivity, io1Var, q51Var, (byte) 22), 2);
        } else {
            if (iOrdinal == 2 || iOrdinal == 3) {
                return;
            }
            b61.c();
        }
    }

    @Override // defpackage.d91
    public Iterable a(Object obj) {
        Collection collectionQ;
        ld0 ld0Var = (ld0) obj;
        return (ld0Var == null || (collectionQ = ld0Var.q()) == null) ? d02.X : collectionQ;
    }

    @Override // defpackage.z41
    public long b(long j, long j2) {
        if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
            int i = sw6.a;
            return jFloatToRawIntBits;
        }
        float fM = ci8.m(j, j2);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fM)) << 32) | (((long) Float.floatToRawIntBits(fM)) & 4294967295L);
        int i2 = sw6.a;
        return jFloatToRawIntBits2;
    }

    @Override // defpackage.i86
    public t14 c() {
        throw new IllegalStateException("This method should not be called");
    }

    @Override // defpackage.ch1
    public zd7 create(SSLSocket sSLSocket) {
        switch (this.X) {
            case 2:
                Class<?> cls = sSLSocket.getClass();
                Class<?> superclass = cls;
                while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
                    superclass = superclass.getSuperclass();
                    if (superclass == null) {
                        bt.g(pc6.l(cls, "No OpenSSLSocketImpl superclass of socket of type "));
                        return null;
                    }
                }
                return new tg(superclass);
            default:
                return new p21();
        }
    }

    @Override // defpackage.es5
    public CharSequence d(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        if (TextUtils.isEmpty(null)) {
            return editTextPreference.X.getString(d56.not_set);
        }
        return null;
    }

    @Override // defpackage.vs
    public Object h(xx6 xx6Var, Float f, Float f2, gn2 gn2Var, wc7 wc7Var) {
        Object objT = u70.t(xx6Var, f.floatValue(), z68.b(0.0f, f2.floatValue(), 28), t9.b, gn2Var, wc7Var);
        return objT == c71.X ? objT : (mk) objT;
    }

    @Override // defpackage.d61
    public void i(u23 u23Var, List list) {
        u23Var.getClass();
    }

    @Override // defpackage.oq1
    public List lookup(String str) throws UnknownHostException {
        str.getClass();
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

    public List m(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (cy0 cy0Var : componentRegistrar.getComponents()) {
            String str = cy0Var.a;
            if (str != null) {
                jn0 jn0Var = new jn0(str, cy0Var, (byte) 1);
                Set set = cy0Var.b;
                Set set2 = cy0Var.c;
                boolean z = cy0Var.d;
                boolean z2 = cy0Var.e;
                cy0Var = new cy0(str, set, set2, z ? 1 : 0, z2 ? 1 : 0, jn0Var, cy0Var.g);
            }
            arrayList.add(cy0Var);
        }
        return arrayList;
    }

    @Override // defpackage.ch1
    public boolean matchesSocket(SSLSocket sSLSocket) {
        switch (this.X) {
            case 2:
                return mm7.Z(sSLSocket.getClass().getName(), false, "com.google.android.gms.org.conscrypt.");
            default:
                return o21.d && Conscrypt.isConscrypt(sSLSocket);
        }
    }

    @Override // defpackage.d61
    public List t(u23 u23Var) {
        u23Var.getClass();
        return d02.X;
    }

    public /* synthetic */ ra(byte b, boolean z) {
        this.X = b;
    }
}
