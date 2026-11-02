package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.OutputConfiguration;
import android.media.MediaCodec;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.conscrypt.FileClientSessionCache;
import org.conscrypt.PSKKeyManager;
import su.happ.proxyutility.ui.BaseActivity;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class be implements et, gt, r61, z41, i86 {
    public final /* synthetic */ byte X;

    public /* synthetic */ be(byte b) {
        this.X = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static af f(Surface surface, Integer num, lh4 lh4Var, bf5 bf5Var, af5 af5Var, cf5 cf5Var, List list, Size size, boolean z, int i, String str, int i2) {
        Class cls;
        OutputConfiguration outputConfigurationB;
        OutputConfiguration outputConfigurationA;
        Surface outputConfiguration = surface;
        lh4 lh4Var2 = lh4.n0;
        Integer num2 = (i2 & 2) != 0 ? null : num;
        lh4 lh4Var3 = (i2 & 4) != 0 ? lh4Var2 : lh4Var;
        boolean z2 = (i2 & 512) != 0 ? false : z;
        int i3 = (i2 & 1024) != 0 ? -1 : i;
        lh4Var3.getClass();
        if (lh4Var3 == lh4.q0 && Build.VERSION.SDK_INT >= 35) {
            if (num2 == null) {
                bt.i("Required value was null.");
                return null;
            }
            if (size == null) {
                bt.i("Required value was null.");
                return null;
            }
            outputConfigurationA = mn.a(num2.intValue(), size);
        } else if (lh4Var3 != lh4Var2) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 < 26) {
                bt.i(ie2.h("Deferred OutputConfigurations are not supported on API ", i4, " (requires API 26)"));
                return null;
            }
            if (size == null) {
                bt.i("Size must defined when creating a deferred OutputConfiguration.");
                return null;
            }
            if (lh4Var3 == lh4.p0) {
                cls = SurfaceTexture.class;
            } else if (lh4Var3 == lh4.o0) {
                cls = SurfaceHolder.class;
            } else if (lh4Var3 != lh4.r0) {
                if (lh4Var3 != lh4.s0) {
                    u52.r(lh4Var3, "Unsupported OutputType: ");
                    return null;
                }
                if (i4 < 35) {
                    bt.i("OutputType.MEDIA_RECORDER requires API 35 or higher.");
                    return null;
                }
                cls = MediaRecorder.class;
            } else {
                if (i4 < 35) {
                    bt.i("OutputType.MEDIA_CODEC requires API 35 or higher.");
                    return null;
                }
                cls = MediaCodec.class;
            }
            outputConfigurationB = dn.b(size, cls);
        } else {
            if (outputConfiguration == 0) {
                bt.i("non-null surface!");
                return null;
            }
            try {
                outputConfiguration = i3 != -1 ? new OutputConfiguration(i3, outputConfiguration) : new OutputConfiguration(outputConfiguration);
                outputConfigurationB = outputConfiguration;
            } catch (Throwable unused) {
                Objects.toString(outputConfiguration);
                return null;
            }
        }
        if (z2 && Build.VERSION.SDK_INT >= 26) {
            outputConfigurationB = outputConfigurationA;
            ue3.p(outputConfigurationB);
        }
        outputConfigurationB = outputConfigurationA;
        outputConfigurationB = outputConfigurationA;
        if (str != null) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 < 28) {
                kp5.h(ie2.h("physicalCameraId is not supported on API ", i5, " (requires API 28)"));
                return null;
            }
            if (i5 >= 28) {
                en.X(outputConfigurationB, str);
            }
        }
        if (bf5Var != null) {
            byte b = bf5Var.a;
            if (Build.VERSION.SDK_INT >= 33) {
                c4.E(outputConfigurationB, b);
            } else if (b != 0) {
                bf5.a(b);
            }
        }
        if (af5Var != null) {
            long j = af5Var.a;
            if (Build.VERSION.SDK_INT >= 33) {
                c4.B(outputConfigurationB, j);
            } else if (j != 1) {
                af5.a(j);
            }
        }
        if (cf5Var != null && Build.VERSION.SDK_INT >= 33) {
            c4.G(outputConfigurationB, cf5Var.a);
        }
        if (!list.isEmpty()) {
            if (Build.VERSION.SDK_INT >= 31) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw p61.k(it);
                }
            } else {
                list.toString();
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            en.s(outputConfigurationB);
        }
        return new af(outputConfigurationB);
    }

    public static byte[] g(byte[] bArr, byte[] bArr2, byte[] bArr3) throws NoSuchAlgorithmException, InvalidKeyException {
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(new SecretKeySpec(bArr, "HmacSHA256"));
        mac.update(bArr2);
        mac.update((byte) 46);
        return mac.doFinal(bArr3);
    }

    public static wr0 k(String str) {
        wr0 wr0Var = new wr0(str);
        wr0.d.put(str, wr0Var);
        return wr0Var;
    }

    public static void m(BaseActivity baseActivity, String str, String str2, String str3, String str4, String str5, Integer num, dn2 dn2Var, dn2 dn2Var2, int i) {
        boolean z = (i & 2) != 0;
        String str6 = (i & 4) != 0 ? null : str;
        String str7 = (i & 8) != 0 ? null : str2;
        String str8 = (i & 16) != 0 ? null : str3;
        String str9 = (i & 32) != 0 ? null : str4;
        String str10 = (i & 64) != 0 ? null : str5;
        Integer num2 = (i & 128) != 0 ? null : num;
        boolean z2 = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0;
        dn2 dn2Var3 = (i & 512) != 0 ? null : dn2Var;
        dn2 dn2Var4 = (i & 1024) != 0 ? null : dn2Var2;
        baseActivity.getClass();
        d8.a0(baseActivity, new en1(z, str6, str7, str8, str9, str10, num2, z2, dn2Var3, dn2Var4), "DialogAlert");
    }

    public static ea4 n(List list) {
        return new ea4(list, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L));
    }

    @Override // defpackage.et, defpackage.gt
    public float a() {
        return 0.0f;
    }

    @Override // defpackage.z41
    public long b(long j, long j2) {
        float fM = ci8.m(j, j2);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fM)) << 32) | (((long) Float.floatToRawIntBits(fM)) & 4294967295L);
        int i = sw6.a;
        return jFloatToRawIntBits;
    }

    @Override // defpackage.i86
    public t14 c() {
        switch (this.X) {
            case 23:
                throw new IllegalStateException("This method should not be called");
            default:
                throw new IllegalStateException("This method should not be called");
        }
    }

    @Override // defpackage.et
    public void d(zr4 zr4Var, int i, int[] iArr, z24 z24Var, int[] iArr2) {
        if (z24Var == z24.X) {
            ht.a(i, iArr, iArr2, false);
        } else {
            ht.a(i, iArr, iArr2, true);
        }
    }

    @Override // defpackage.gt
    public void e(int i, zr4 zr4Var, int[] iArr, int[] iArr2) {
        ht.a(i, iArr, iArr2, false);
    }

    public synchronized wr0 h(String str) {
        wr0 wr0Var;
        String strConcat;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = wr0.d;
            wr0Var = (wr0) linkedHashMap.get(str);
            if (wr0Var == null) {
                if (mm7.Z(str, false, "TLS_")) {
                    strConcat = "SSL_".concat(str.substring(4));
                } else {
                    strConcat = mm7.Z(str, false, "SSL_") ? "TLS_".concat(str.substring(4)) : str;
                }
                wr0Var = (wr0) linkedHashMap.get(strConcat);
                if (wr0Var == null) {
                    wr0Var = new wr0(str);
                }
                linkedHashMap.put(str, wr0Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return wr0Var;
    }

    public wp1 i(Context context) {
        wp1 wp1Var;
        context.getClass();
        wp1 wp1Var2 = wp1.k;
        if (wp1Var2 != null) {
            return wp1Var2;
        }
        synchronized (this) {
            wp1Var = wp1.k;
            if (wp1Var == null) {
                Context contextA = o51.a(context);
                contextA.getClass();
                wp1Var = new wp1(contextA);
                wp1.k = wp1Var;
            }
        }
        return wp1Var;
    }

    public Signature[] j(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Code duplicated, block: B:39:0x0094  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0065->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0082 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0085 -> B:25:0x0065). Please report as a decompilation issue!!! */
    public Object l(List list, ra1 ra1Var, s51 s51Var) throws Throwable {
        ha1 ha1Var;
        List list2;
        Iterator it;
        ea6 ea6Var;
        Throwable th;
        gn2 gn2Var;
        if (s51Var instanceof ha1) {
            ha1Var = (ha1) s51Var;
            int i = ha1Var.j0;
            if ((i & Integer.MIN_VALUE) != 0) {
                ha1Var.j0 = i - Integer.MIN_VALUE;
            } else {
                ha1Var = new ha1(this, s51Var);
            }
        } else {
            ha1Var = new ha1(this, s51Var);
        }
        Object obj = ha1Var.h0;
        int i2 = ha1Var.j0;
        q51 q51Var = null;
        Object obj2 = c71.X;
        if (i2 == 0) {
            w39.n0(obj);
            ArrayList arrayList = new ArrayList();
            ia1 ia1Var = new ia1((Object) list, (Object) arrayList, q51Var, (byte) 0);
            ha1Var.f0 = arrayList;
            ha1Var.j0 = 1;
            if (ra1Var.a(ia1Var, ha1Var) != obj2) {
                list2 = arrayList;
            }
            return obj2;
        }
        if (i2 == 1) {
            list2 = (List) ha1Var.f0;
            w39.n0(obj);
        } else {
            if (i2 != 2) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = ha1Var.g0;
            ea6Var = (ea6) ha1Var.f0;
            try {
                w39.n0(obj);
            } catch (Throwable th2) {
                Object obj3 = ea6Var.X;
                if (obj3 == null) {
                    ea6Var.X = th2;
                } else {
                    gv3.g((Throwable) obj3, th2);
                }
            }
        }
        while (it.hasNext()) {
            gn2Var = (gn2) it.next();
            ha1Var.f0 = ea6Var;
            ha1Var.g0 = it;
            ha1Var.j0 = 2;
            if (gn2Var.B(ha1Var) == obj2) {
                return obj2;
            }
        }
        th = (Throwable) ea6Var.X;
        if (th == null) {
            return dn8.a;
        }
        throw th;
        ea6 ea6Var2 = new ea6();
        it = list2.iterator();
        ea6Var = ea6Var2;
        while (it.hasNext()) {
            gn2Var = (gn2) it.next();
            ha1Var.f0 = ea6Var;
            ha1Var.g0 = it;
            ha1Var.j0 = 2;
            if (gn2Var.B(ha1Var) == obj2) {
                return obj2;
            }
        }
        th = (Throwable) ea6Var.X;
        if (th == null) {
            return dn8.a;
        }
        throw th;
    }

    public String toString() {
        switch (this.X) {
            case 3:
                return "Arrangement#Center";
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return "Empty";
            case 13:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }
}
