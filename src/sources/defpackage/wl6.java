package defpackage;

import android.content.Context;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk;
import androidx.recyclerview.widget.f;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class wl6 implements lt4, sb4, m63, uq, t10, p95, Callback, b76, nr5, t97 {
    public static wl6 Z;
    public static final xl6 f0 = new xl6(0, false, false, 0, 0);
    public static final wl6 g0 = new wl6((Object) new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f}, (byte) 1);
    public static final oc5 h0;
    public static final nc5 i0;
    public final /* synthetic */ byte X;
    public Object Y;

    static {
        byte b = 23;
        h0 = new oc5(b);
        i0 = new nc5(b);
    }

    public wl6(byte b) {
        this.X = b;
        switch (b) {
            case 11:
                this.Y = new AtomicReference(null);
                break;
            case 19:
                i26 i26Var = um1.a;
                this.Y = (CloseCameraDeviceOnCameraGraphCloseQuirk) um1.a().b(CloseCameraDeviceOnCameraGraphCloseQuirk.class);
                break;
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                TimeUnit.MINUTES.getClass();
                this.Y = new ry1(f28.h);
                break;
            case 23:
                this.Y = r15.a();
                break;
            case 24:
                this.Y = new HashSet();
                break;
            case 26:
                this.Y = new y45(jq2.h);
                break;
            default:
                if (Build.VERSION.SDK_INT < 26) {
                    this.Y = new i4(this);
                } else {
                    this.Y = new j4(this);
                }
                break;
        }
    }

    public static synchronized wl6 P() {
        wl6 wl6Var;
        wl6Var = Z;
        if (wl6Var == null) {
            wl6Var = new wl6((byte) 0, false);
            Z = wl6Var;
        }
        return wl6Var;
    }

    @Override // defpackage.t10
    public void A(x11 x11Var) {
        boolean z = x11Var.Y == 0;
        u10 u10Var = (u10) this.Y;
        if (z) {
            u10Var.g(null, ((is2) u10Var).y);
            return;
        }
        q09 q09Var = u10Var.o;
        if (q09Var != null) {
            ((qs2) q09Var.X).b(x11Var);
        }
    }

    @Override // defpackage.p95
    public w19 C(View view, w19 w19Var) {
        q70 q70Var = (q70) this.Y;
        p70 p70Var = q70Var.p0;
        if (p70Var != null) {
            q70Var.i0.c0.remove(p70Var);
        }
        p70 p70Var2 = new p70(q70Var.l0, w19Var);
        q70Var.p0 = p70Var2;
        p70Var2.e(q70Var.getWindow());
        BottomSheetBehavior bottomSheetBehavior = q70Var.i0;
        p70 p70Var3 = q70Var.p0;
        ArrayList arrayList = bottomSheetBehavior.c0;
        if (!arrayList.contains(p70Var3)) {
            arrayList.add(p70Var3);
        }
        return w19Var;
    }

    @Override // defpackage.lt4
    public void D(nt4 nt4Var) {
        lt4 lt4Var = ((ActionMenuView) this.Y).A0;
        if (lt4Var != null) {
            lt4Var.D(nt4Var);
        }
    }

    @Override // defpackage.sb4
    public void F(int i, int i2, Object obj) {
        ((f) this.Y).a.d(i, i2, obj);
    }

    public s91 K() {
        Context context = (Context) this.Y;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        s91 s91Var = new s91();
        s91Var.Y = ss1.a(q52.a);
        f4 f4Var = new f4(context);
        s91Var.h0 = f4Var;
        s91Var.Z = ss1.a(new zz2(f4Var, new yr2((Object) f4Var, (byte) 18), (byte) 13));
        f4 f4Var2 = (f4) s91Var.h0;
        s91Var.i0 = new l42(f4Var2, (byte) 1);
        v06 v06VarA = ss1.a(new xd6((l42) s91Var.i0, ss1.a(new l42(f4Var2, (byte) 0)), (byte) 3));
        s91Var.f0 = v06VarA;
        g55 g55Var = new g55((byte) 20);
        f4 f4Var3 = (f4) s91Var.h0;
        f63 f63Var = new f63((Object) f4Var3, (Object) v06VarA, (Object) g55Var, (byte) 24);
        v06 v06Var = (v06) s91Var.Y;
        v06 v06Var2 = (v06) s91Var.Z;
        s91Var.g0 = ss1.a(new zv7(new y5((Object) v06Var, (Object) v06Var2, (Object) f63Var, (Object) v06VarA, (Object) v06VarA, (byte) 7), new xy0(f4Var3, v06Var2, v06VarA, f63Var, v06Var, v06VarA, v06VarA), new yr6(v06Var, v06VarA, f63Var, v06VarA, (byte) 15)));
        return s91Var;
    }

    public h4 L(int i) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:211:0x0376 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:212:0x0378  */
    /* JADX WARN: Code duplicated, block: B:213:0x037a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:214:0x037c  */
    /* JADX WARN: Code duplicated, block: B:215:0x037e  */
    /* JADX WARN: Code duplicated, block: B:216:0x0380 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:217:0x0382  */
    /* JADX WARN: Code duplicated, block: B:218:0x0384 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:219:0x0386  */
    /* JADX WARN: Code duplicated, block: B:220:0x0388  */
    /* JADX WARN: Code duplicated, block: B:223:0x0396  */
    /* JADX WARN: Code duplicated, block: B:226:0x039b  */
    /* JADX WARN: Code duplicated, block: B:228:0x039e  */
    /* JADX WARN: Code duplicated, block: B:230:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:232:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:234:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:235:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:236:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:237:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:240:0x03be A[LOOP:21: B:247:0x0236->B:240:0x03be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:290:0x0374 A[SYNTHETIC] */
    public v67 M(sa2 sa2Var) {
        int iD;
        gx4 gx4Var;
        int i;
        boolean z;
        int i2;
        String str;
        int iD2;
        av8 av8VarK = sa2Var.k();
        int i3 = sa2Var.j().a;
        pj2 pj2VarJ = sa2Var.j();
        av8 av8VarK2 = sa2Var.k();
        int i4 = p61.G(8)[pj2VarJ.b];
        w50 w50Var = (w50) sa2Var.a;
        int i5 = w50Var.Y;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            for (int i8 = 0; i8 < i5; i8++) {
                if (oi0.a(i4, i7, i8)) {
                    w50Var.a(i8, i7);
                }
            }
        }
        int i9 = av8VarK2.a * 4;
        int i10 = i9 + 17;
        int i11 = av8VarK2.d;
        w50 w50Var2 = new w50(i10, i10);
        w50Var2.c(0, 0, 9, 9);
        int i12 = i9 + 9;
        w50Var2.c(i12, 0, 8, 9);
        w50Var2.c(0, i12, 9, 8);
        int[] iArr = av8VarK2.b;
        int length = iArr.length;
        int i13 = 0;
        while (i13 < length) {
            int i14 = iArr[i13] - 2;
            for (int i15 = i6; i15 < length; i15++) {
                if ((i13 != 0 || (i15 != 0 && i15 != length - 1)) && (i13 != length - 1 || i15 != 0)) {
                    w50Var2.c(iArr[i15] - 2, i14, 5, 5);
                }
            }
            i13++;
            i6 = 0;
        }
        int i16 = 2;
        int i17 = 6;
        int i18 = 1;
        w50Var2.c(6, 9, 1, i9);
        w50Var2.c(9, 6, i9, 1);
        if (av8VarK2.a > 6) {
            int i19 = i9 + 6;
            w50Var2.c(i19, 0, 3, 6);
            w50Var2.c(0, i19, 6, 3);
        }
        byte[] bArr = new byte[i11];
        int i20 = i5 - 1;
        int i21 = i20;
        boolean z2 = true;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        while (i21 > 0) {
            if (i21 == i17) {
                i21--;
            }
            int i25 = 0;
            while (i25 < i5) {
                int i26 = z2 ? i20 - i25 : i25;
                int i27 = i18;
                int i28 = 0;
                for (int i29 = i16; i28 < i29; i29 = 2) {
                    int i30 = i21 - i28;
                    if (!w50Var2.b(i30, i26)) {
                        i23++;
                        i24 <<= 1;
                        if (w50Var.b(i30, i26)) {
                            i24 |= 1;
                        }
                        if (i23 == 8) {
                            bArr[i22] = (byte) i24;
                            i22++;
                            i23 = 0;
                            i24 = 0;
                        }
                    }
                    i28++;
                }
                i25++;
                i18 = i27;
                i16 = 2;
            }
            z2 = !z2;
            i21 -= 2;
            i17 = 6;
            i16 = 2;
        }
        int i31 = i18;
        if (i22 != i11) {
            throw oj2.a();
        }
        if (i11 != av8VarK.d) {
            kp5.e();
            return null;
        }
        j70 j70Var = av8VarK.c[p61.B(i3)];
        zu8[] zu8VarArr = (zu8[]) j70Var.Y;
        byte b = j70Var.X;
        int i32 = 0;
        for (zu8 zu8Var : zu8VarArr) {
            i32 += zu8Var.a;
        }
        j70[] j70VarArr = new j70[i32];
        int i33 = 0;
        for (zu8 zu8Var2 : zu8VarArr) {
            int i34 = 0;
            while (i34 < zu8Var2.a) {
                byte b2 = zu8Var2.b;
                j70VarArr[i33] = new j70(b2, new byte[b + b2]);
                i34++;
                i33++;
            }
        }
        int length2 = ((byte[]) j70VarArr[0].Y).length;
        int i35 = i32 - 1;
        while (i35 >= 0 && ((byte[]) j70VarArr[i35].Y).length != length2) {
            i35--;
        }
        int i36 = i35 + 1;
        int i37 = length2 - b;
        int i38 = 0;
        for (int i39 = 0; i39 < i37; i39++) {
            int i40 = 0;
            while (i40 < i33) {
                ((byte[]) j70VarArr[i40].Y)[i39] = bArr[i38];
                i40++;
                i38++;
            }
        }
        int i41 = i36;
        while (i41 < i33) {
            ((byte[]) j70VarArr[i41].Y)[i37] = bArr[i38];
            i41++;
            i38++;
        }
        int length3 = ((byte[]) j70VarArr[0].Y).length;
        while (i37 < length3) {
            int i42 = i38;
            int i43 = 0;
            while (i43 < i33) {
                ((byte[]) j70VarArr[i43].Y)[i43 < i36 ? i37 : i37 + 1] = bArr[i42];
                i43++;
                i42++;
            }
            i37++;
            i38 = i42;
        }
        int i44 = 0;
        for (int i45 = 0; i45 < i32; i45++) {
            i44 += j70VarArr[i45].X;
        }
        byte[] bArr2 = new byte[i44];
        int i46 = 0;
        int i47 = 0;
        int i48 = 0;
        while (i47 < i32) {
            j70 j70Var2 = j70VarArr[i47];
            byte[] bArr3 = (byte[]) j70Var2.Y;
            byte b3 = j70Var2.X;
            int length4 = bArr3.length;
            int[] iArr2 = new int[length4];
            for (int i49 = 0; i49 < length4; i49++) {
                iArr2[i49] = bArr3[i49] & 255;
            }
            try {
                int iA = ((y45) this.Y).A(iArr2, bArr3.length - b3);
                for (int i50 = 0; i50 < b3; i50++) {
                    bArr3[i50] = (byte) iArr2[i50];
                }
                i46 += iA;
                int i51 = i48;
                int i52 = 0;
                while (i52 < b3) {
                    bArr2[i51] = bArr3[i52];
                    i52++;
                    i51++;
                }
                i47++;
                i48 = i51;
            } catch (z96 unused) {
                fr0 fr0Var = fr0.Z;
                if (c76.X) {
                    throw new fr0();
                }
                throw fr0.Z;
            }
        }
        boolean z3 = false;
        x50 x50Var = new x50((byte) 0, bArr2);
        StringBuilder sb = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(i31);
        boolean z4 = false;
        int iD3 = -1;
        int iD4 = -1;
        hq0 hq0Var = null;
        boolean z5 = false;
        while (true) {
            try {
                int iB = x50Var.b();
                gx4 gx4Var2 = gx4.TERMINATOR;
                if (iB < 4 || (iD = x50Var.d(4)) == 0) {
                    gx4Var = gx4Var2;
                } else if (iD == 1) {
                    gx4Var = gx4.NUMERIC;
                } else if (iD == 2) {
                    gx4Var = gx4.ALPHANUMERIC;
                } else if (iD == 3) {
                    gx4Var = gx4.STRUCTURED_APPEND;
                } else if (iD == 4) {
                    gx4Var = gx4.BYTE;
                } else if (iD == 5) {
                    gx4Var = gx4.FNC1_FIRST_POSITION;
                } else if (iD == 7) {
                    gx4Var = gx4.ECI;
                } else if (iD == 8) {
                    gx4Var = gx4.KANJI;
                } else if (iD == 9) {
                    gx4Var = gx4.FNC1_SECOND_POSITION;
                } else {
                    if (iD != 13) {
                        throw new IllegalArgumentException();
                    }
                    gx4Var = gx4.HANZI;
                }
                int iOrdinal = gx4Var.ordinal();
                if (iOrdinal != 0) {
                    i = i46;
                    if (iOrdinal == 3) {
                        z = z3;
                        if (x50Var.b() < 16) {
                            throw oj2.a();
                        }
                        iD3 = x50Var.d(8);
                        iD4 = x50Var.d(8);
                        z3 = z;
                    } else if (iOrdinal == 5) {
                        boolean z6 = z3;
                        int iD5 = x50Var.d(8);
                        if ((iD5 & 128) == 0) {
                            iD2 = iD5 & 127;
                        } else if ((iD5 & 192) == 128) {
                            iD2 = ((iD5 & 63) << 8) | x50Var.d(8);
                        } else {
                            if ((iD5 & 224) != 192) {
                                throw oj2.a();
                            }
                            iD2 = ((iD5 & 31) << 16) | x50Var.d(16);
                        }
                        HashMap map = hq0.Z;
                        if (iD2 < 0 || iD2 >= 900) {
                            throw oj2.a();
                        }
                        hq0Var = (hq0) hq0.Z.get(Integer.valueOf(iD2));
                        if (hq0Var == null) {
                            throw oj2.a();
                        }
                        z3 = z6;
                    } else if (iOrdinal == 7) {
                        z3 = true;
                        z5 = true;
                    } else if (iOrdinal == 8) {
                        z5 = true;
                        z4 = true;
                    } else if (iOrdinal != 9) {
                        int iD6 = x50Var.d(gx4Var.a(av8VarK));
                        int iOrdinal2 = gx4Var.ordinal();
                        z = z3;
                        if (iOrdinal2 == 1) {
                            jb5.o(x50Var, sb, iD6);
                        } else if (iOrdinal2 == 2) {
                            jb5.k(x50Var, sb, iD6, z5);
                        } else if (iOrdinal2 == 4) {
                            jb5.l(x50Var, sb, iD6, hq0Var, arrayList);
                        } else {
                            if (iOrdinal2 != 6) {
                                throw oj2.a();
                            }
                            jb5.n(x50Var, sb, iD6);
                        }
                    } else {
                        z = z3;
                        int iD7 = x50Var.d(4);
                        int iD8 = x50Var.d(gx4Var.a(av8VarK));
                        if (iD7 == 1) {
                            jb5.m(x50Var, sb, iD8);
                        }
                    }
                    if (gx4Var == gx4Var2) {
                        if (hq0Var != null) {
                            if (z3) {
                                i2 = 4;
                            } else if (z4) {
                                i2 = 6;
                            } else {
                                i2 = 2;
                            }
                        } else if (z3) {
                            i2 = 3;
                        } else if (z4) {
                            i2 = 5;
                        } else {
                            i2 = 1;
                        }
                        int i53 = iD3;
                        String string = sb.toString();
                        if (arrayList.isEmpty()) {
                            arrayList = null;
                        }
                        if (i3 != 1) {
                            str = "L";
                        } else if (i3 != 2) {
                            str = "M";
                        } else if (i3 != 3) {
                            str = "Q";
                        } else {
                            if (i3 == 4) {
                                throw null;
                            }
                            str = "H";
                        }
                        v67 v67Var = new v67(bArr2, string, arrayList, str, i53, iD4, i2);
                        v67Var.g = Integer.valueOf(i);
                        return v67Var;
                    }
                    i46 = i;
                } else {
                    i = i46;
                    z = z3;
                }
                z3 = z;
                if (gx4Var == gx4Var2) {
                    if (hq0Var != null) {
                        if (z3) {
                            i2 = 4;
                        } else if (z4) {
                            i2 = 6;
                        } else {
                            i2 = 2;
                        }
                    } else if (z3) {
                        i2 = 3;
                    } else if (z4) {
                        i2 = 5;
                    } else {
                        i2 = 1;
                    }
                    int i54 = iD3;
                    String string2 = sb.toString();
                    if (arrayList.isEmpty()) {
                        arrayList = null;
                    }
                    if (i3 != 1) {
                        str = "L";
                    } else if (i3 != 2) {
                        str = "M";
                    } else if (i3 != 3) {
                        str = "Q";
                    } else {
                        if (i3 == 4) {
                            throw null;
                        }
                        str = "H";
                    }
                    v67 v67Var2 = new v67(bArr2, string2, arrayList, str, i54, iD4, i2);
                    v67Var2.g = Integer.valueOf(i);
                    return v67Var2;
                }
                i46 = i;
            } catch (IllegalArgumentException unused2) {
                throw oj2.a();
            }
        }
    }

    public h4 N(int i) {
        return null;
    }

    public lh7 O() {
        yy1 yy1VarA = yy1.a();
        if (yy1VarA.c() == 1) {
            return new w73(true);
        }
        rh5 rh5VarH = z51.H(Boolean.FALSE);
        yy1VarA.h(new ve1(rh5VarH, this));
        return rh5VarH;
    }

    public void Q(float f, float f2, float f3, float f4) {
        lr lrVar = (lr) this.Y;
        sm0 sm0VarK = lrVar.k();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (lrVar.p() >> 32)) - (f3 + f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lrVar.p() & 4294967295L)) - (f4 + f2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            vc3.a("Width and height must be greater than or equal to zero");
        }
        lrVar.D(jFloatToRawIntBits);
        sm0VarK.n(f, f2);
    }

    public void R(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((v20) this.Y).a(0);
    }

    public boolean S(int i, int i2, Bundle bundle) {
        return false;
    }

    public void T(float f, long j) {
        sm0 sm0VarK = ((lr) this.Y).k();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        sm0VarK.n(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        sm0VarK.b(f);
        sm0VarK.n(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void U(float f, float f2, long j) {
        sm0 sm0VarK = ((lr) this.Y).k();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        sm0VarK.n(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        sm0VarK.a(f, f2);
        sm0VarK.n(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void V(float f, float f2) {
        ((lr) this.Y).k().n(f, f2);
    }

    @Override // defpackage.m63
    public ByteBuffer c() {
        return ((Image.Plane) this.Y).getBuffer();
    }

    @Override // defpackage.m63
    public int j() {
        return ((Image.Plane) this.Y).getRowStride();
    }

    @Override // defpackage.sb4
    public void k(int i, int i2) {
        ((f) this.Y).a.c(i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0042 A[RETURN] */
    @Override // defpackage.lt4
    public boolean l(nt4 nt4Var, MenuItem menuItem) {
        boolean zOnMenuItemSelected;
        k5 k5Var = ((ActionMenuView) this.Y).F0;
        if (k5Var != null) {
            Toolbar toolbar = (Toolbar) ((lr5) k5Var).Y;
            Iterator it = ((CopyOnWriteArrayList) toolbar.L0.Z).iterator();
            while (it.hasNext()) {
                if (((fl2) it.next()).a.q()) {
                    zOnMenuItemSelected = true;
                    if (zOnMenuItemSelected) {
                        return true;
                    }
                }
            }
            ob8 ob8Var = toolbar.N0;
            zOnMenuItemSelected = ob8Var != null ? ((qb8) ob8Var).a.h.onMenuItemSelected(0, menuItem) : false;
            if (zOnMenuItemSelected) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.t97
    public void lock() {
        ((ReentrantLock) this.Y).lock();
    }

    @Override // defpackage.b76
    public l11 m() {
        return (l11) this.Y;
    }

    @Override // defpackage.sb4
    public void o(int i, int i2) {
        ((f) this.Y).a.e(i, i2);
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        ((mm0) this.Y).f(w39.t(iOException));
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        ((mm0) this.Y).y(response, oe0.Y);
    }

    public String toString() {
        switch (this.X) {
            case 1:
                return "Bradford";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.t97
    public void unlock() {
        ((ReentrantLock) this.Y).unlock();
    }

    @Override // defpackage.sb4
    public void w(int i, int i2) {
        ((f) this.Y).a.f(i, i2);
    }

    @Override // defpackage.nr5
    public long x(lf3 lf3Var, long j, z24 z24Var, long j2) {
        long j3 = ((hf3) ((dn2) this.Y).invoke()).a;
        int iS = u70.s(lf3Var.a + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), z24Var == z24.X);
        return (((long) u70.s(lf3Var.b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true)) & 4294967295L) | (((long) iS) << 32);
    }

    @Override // defpackage.m63
    public int z() {
        return ((Image.Plane) this.Y).getPixelStride();
    }

    public void E(int i) {
    }

    public void y(int i) {
    }

    @Override // defpackage.uq
    public void I(int i, float f) {
    }

    public /* synthetic */ wl6(Object obj, byte b) {
        this.X = b;
        this.Y = obj;
    }

    public wl6(u10 u10Var) {
        this.X = (byte) 12;
        Objects.requireNonNull(u10Var);
        this.Y = u10Var;
    }

    public wl6(boolean z) {
        this.X = (byte) 10;
        this.Y = new AtomicBoolean(z);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a A[PHI: r10
  0x002a: PHI (r10v1 int) = (r10v0 int), (r10v3 int), (r10v4 int) binds: [B:5:0x001a, B:10:0x0023, B:12:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    public wl6(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        this.X = (byte) 9;
        int i2 = 1;
        int length = fArr.length - 1;
        xs[][] xsVarArr = new xs[length][];
        int i3 = 1;
        int i4 = 1;
        int i5 = 0;
        while (i5 < length) {
            int i6 = iArr[i5];
            int i7 = 3;
            if (i6 == 0) {
                i = i7;
            } else if (i6 == i2) {
                i3 = i2;
                i = i3;
            } else {
                if (i6 != 2) {
                    if (i6 != 3) {
                        i7 = 4;
                        if (i6 != 4) {
                            i7 = 5;
                            if (i6 != 5) {
                                i = i4;
                            } else {
                                i = i7;
                            }
                        } else {
                            i = i7;
                        }
                    } else {
                        if (i3 != i2) {
                            i3 = i2;
                        }
                        i = i3;
                    }
                }
                i3 = 2;
                i = i3;
            }
            float[] fArr3 = fArr2[i5];
            int i8 = i5 + 1;
            float[] fArr4 = fArr2[i8];
            float f = fArr[i5];
            float f2 = fArr[i8];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            xs[] xsVarArr2 = new xs[length2];
            int i9 = 0;
            while (i9 < length2) {
                int i10 = i9 * 2;
                int i11 = i9;
                int i12 = i10 + 1;
                xsVarArr2[i11] = new xs(i, f, f2, fArr3[i10], fArr3[i12], fArr4[i10], fArr4[i12]);
                i9 = i11 + 1;
            }
            xsVarArr[i5] = xsVarArr2;
            i5 = i8;
            i4 = i;
            i2 = 1;
        }
        this.Y = xsVarArr;
    }

    public wl6(yz4 yz4Var, ud0 ud0Var) {
        this.X = (byte) 2;
        this.Y = ud0Var;
    }

    public /* synthetic */ wl6(byte b, boolean z) {
        this.X = b;
    }

    public void J(int i, h4 h4Var, String str, Bundle bundle) {
    }
}
