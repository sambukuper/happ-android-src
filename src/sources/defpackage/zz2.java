package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.compose.ui.node.LayoutNode;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import okhttp3.internal.http2.Http2;
import org.conscrypt.PSKKeyManager;
import org.json.JSONException;
import org.json.JSONObject;
import su.happ.proxyutility.feature.main.MainActivity;
import su.happ.proxyutility.feature.main.MainViewModel;
import su.happ.proxyutility.ui.ScannerActivity;

/* JADX INFO: loaded from: classes.dex */
public final class zz2 implements ov8, is0, yp7, g83, v06, g75, pm0, vc5, nt0, f53, bd6 {
    public final /* synthetic */ byte X;
    public Object Y;
    public Object Z;

    public zz2(byte b) {
        this.X = b;
        int i = 0;
        switch (b) {
            case 6:
                this.Y = new ArrayList(0);
                this.Z = new ArrayList(0);
                break;
            case 15:
                this.Y = new s05();
                this.Z = new s05();
                break;
            case 17:
                this.Y = new c15(0, new LayoutNode[16]);
                break;
            default:
                this.Y = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
                byte[] bArr = new byte[128];
                this.Z = bArr;
                for (int i2 = 0; i2 < 128; i2++) {
                    bArr[i2] = -1;
                }
                while (true) {
                    byte[] bArr2 = (byte[]) this.Y;
                    if (i >= bArr2.length) {
                        bArr[65] = bArr[97];
                        bArr[66] = bArr[98];
                        bArr[67] = bArr[99];
                        bArr[68] = bArr[100];
                        bArr[69] = bArr[101];
                        bArr[70] = bArr[102];
                    } else {
                        bArr[bArr2[i]] = (byte) i;
                        i++;
                    }
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [jx4] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [jx4] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [c15] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [c15] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    public static void U(LayoutNode layoutNode) {
        if (layoutNode.P0 > 0) {
            if (layoutNode.I0.d == k34.g0 && !layoutNode.p() && !layoutNode.q() && !layoutNode.Q0 && layoutNode.L()) {
                jx4 jx4Var = (jx4) layoutNode.H0.i0;
                if ((jx4Var.f0 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                    while (jx4Var != null) {
                        if ((jx4Var.Z & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                            ?? T = jx4Var;
                            ?? c15Var = 0;
                            while (T != 0) {
                                if (T instanceof as2) {
                                    as2 as2Var = (as2) T;
                                    as2Var.e0(yn0.X(as2Var, PSKKeyManager.MAX_KEY_LENGTH_BYTES));
                                } else if ((T.Z & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 && (T instanceof oh1)) {
                                    jx4 jx4Var2 = ((oh1) T).r0;
                                    int i = 0;
                                    T = T;
                                    c15Var = c15Var;
                                    while (jx4Var2 != null) {
                                        if ((jx4Var2.Z & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
                                            i++;
                                            if (i == 1) {
                                                c15Var = c15Var;
                                                T = jx4Var2;
                                            } else {
                                                if (c15Var == 0) {
                                                    c15Var = new c15(0, new jx4[16]);
                                                }
                                                if (T != 0) {
                                                    c15Var.b(T);
                                                    T = 0;
                                                }
                                                c15Var.b(jx4Var2);
                                            }
                                        }
                                        jx4Var2 = jx4Var2.h0;
                                        T = T;
                                        c15Var = c15Var;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                T = yn0.T(c15Var);
                            }
                        }
                        if ((jx4Var.f0 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
                            break;
                        } else {
                            jx4Var = jx4Var.h0;
                        }
                    }
                }
            }
            layoutNode.O0 = false;
            c15 c15VarC = layoutNode.C();
            Object[] objArr = c15VarC.X;
            int i2 = c15VarC.Z;
            for (int i3 = 0; i3 < i2; i3++) {
                U((LayoutNode) objArr[i3]);
            }
        }
    }

    @Override // defpackage.xi8
    public zk6 A(x14 x14Var) {
        aa7 aa7VarS0;
        x14Var.getClass();
        ce2 ce2VarO = z68.o(x14Var);
        if (ce2VarO != null && (aa7VarS0 = z68.s0(ce2VarO)) != null) {
            return aa7VarS0;
        }
        aa7 aa7VarP = z68.p(x14Var);
        aa7VarP.getClass();
        return aa7VarP;
    }

    @Override // defpackage.xi8
    public /* bridge */ bh8 A0(x14 x14Var, int i) {
        return z68.D(x14Var, i);
    }

    @Override // defpackage.xi8
    public /* bridge */ x14 B(fo0 fo0Var) {
        return z68.t0(fo0Var);
    }

    @Override // defpackage.xi8
    public boolean B0(x14 x14Var) {
        x14Var.getClass();
        return !dh3.f(z68.L0(A(x14Var)), z68.L0(a0(x14Var)));
    }

    @Override // defpackage.xi8
    public /* bridge */ Collection C(mh8 mh8Var) {
        return z68.H0(mh8Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ boolean C0(x14 x14Var) {
        return z68.g0(x14Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ boolean D(mh8 mh8Var) {
        return z68.b0(mh8Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ mh8 E(zk6 zk6Var) {
        return z68.L0(zk6Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ ah8 E0(zk6 zk6Var) {
        return z68.l(zk6Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ un0 F(fo0 fo0Var) {
        return z68.s(fo0Var);
    }

    public da7 F0(zk6 zk6Var) {
        aa7 aa7Var;
        hh1 hh1VarN = z68.n(zk6Var);
        return (hh1VarN == null || (aa7Var = hh1VarN.Y) == null) ? (da7) zk6Var : aa7Var;
    }

    @Override // defpackage.xi8
    public boolean G(x14 x14Var) {
        x14Var.getClass();
        return z68.g0(A(x14Var)) != z68.g0(a0(x14Var));
    }

    @Override // defpackage.xi8
    public /* bridge */ boolean G0(x14 x14Var) {
        return z68.i0(x14Var);
    }

    @Override // defpackage.xi8
    public boolean H(x14 x14Var) {
        x14Var.getClass();
        aa7 aa7VarP = z68.p(x14Var);
        return (aa7VarP != null ? z68.n(aa7VarP) : null) != null;
    }

    @Override // defpackage.nt0
    public /* bridge */ mo8 H0(da7 da7Var, da7 da7Var2) {
        return z68.w(this, da7Var, da7Var2);
    }

    @Override // defpackage.nt0
    public /* bridge */ aa7 I(t14 t14Var) {
        return z68.p(t14Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ x14 I0(x14 x14Var) {
        return z68.N0(this, x14Var);
    }

    @Override // defpackage.xi8
    public boolean J(zk6 zk6Var) {
        zk6Var.getClass();
        return z68.n(zk6Var) != null;
    }

    @Override // defpackage.xi8
    public /* bridge */ boolean J0(x14 x14Var) {
        return z68.c0(x14Var);
    }

    @Override // defpackage.bd6
    public void K(Object obj, ed6 ed6Var) {
        ((p43) obj).j(ed6Var, w79.K(new hh5((String) this.Y, (kj2) this.Z)));
    }

    public bz K0() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Http2.INITIAL_MAX_FRAME_SIZE];
        try {
            FileInputStream fileInputStream = new FileInputStream(k0());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, Http2.INITIAL_MAX_FRAME_SIZE);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = bz.h;
        byte b = (byte) (((byte) (0 | 2)) | 1);
        int i3 = p61.G(5)[iOptInt];
        if (i3 == 0) {
            b61.i("Null registrationStatus");
            return null;
        }
        byte b2 = (byte) (((byte) (b | 2)) | 1);
        if (b2 == 3 && i3 != 0) {
            return new bz(strOptString, i3, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        StringBuilder sb = new StringBuilder();
        if (i3 == 0) {
            sb.append(" registrationStatus");
        }
        if ((b2 & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((b2 & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        u52.r(sb, "Missing required properties:");
        return null;
    }

    @Override // defpackage.xi8
    public boolean L(zk6 zk6Var) {
        return z68.e0(z68.L0(zk6Var));
    }

    @Override // defpackage.f53
    public void M(s57 s57Var) throws f65, fr0, oj2 {
        Object rj6Var;
        lr5 lr5Var = (lr5) this.Y;
        lr5 lr5Var2 = (lr5) this.Z;
        try {
            Bitmap bitmapR = w39.r(s57Var);
            int[] iArr = new int[bitmapR.getWidth() * bitmapR.getHeight()];
            bitmapR.getPixels(iArr, 0, bitmapR.getWidth(), 0, 0, bitmapR.getWidth(), bitmapR.getHeight());
            i66 i66Var = new i66(bitmapR.getWidth(), bitmapR.getHeight(), iArr);
            byte b = 22;
            try {
                rj6Var = lr5Var2.B(new dq(new lr(i66Var), b));
            } catch (Throwable th) {
                if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                    throw th;
                }
                rj6Var = new rj6(th);
            }
            if (sj6.a(rj6Var) != null) {
                try {
                    rj6Var = lr5Var2.B(new dq(new lr(new gi3(i66Var)), b));
                } catch (Throwable th2) {
                    if ((th2 instanceof InterruptedException) || (th2 instanceof CancellationException)) {
                        throw th2;
                    }
                    rj6Var = new rj6(th2);
                }
            }
            w39.n0(rj6Var);
            String str = ((vj6) rj6Var).a;
            ScannerActivity scannerActivity = (ScannerActivity) lr5Var.Y;
            int i = ScannerActivity.T0;
            scannerActivity.B(str);
        } catch (Throwable th3) {
            try {
                if (th3 instanceof InterruptedException) {
                    throw th3;
                }
                if (th3 instanceof CancellationException) {
                    throw th3;
                }
            } catch (Throwable th4) {
                s57Var.close();
                throw th4;
            }
        }
        s57Var.close();
    }

    public boolean N(long j) {
        Object obj;
        ArrayList arrayList = (ArrayList) ((zz2) this.Z).Y;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i);
            if (jm4.w(((jq5) obj).a, j)) {
                break;
            }
            i++;
        }
        jq5 jq5Var = (jq5) obj;
        if (jq5Var != null) {
            return jq5Var.h;
        }
        return false;
    }

    @Override // defpackage.yp7
    public boolean O(Object obj, Object obj2) {
        f64 f64Var = (f64) this.Y;
        return dh3.f(f64Var.b(obj), f64Var.b(obj2));
    }

    @Override // defpackage.xi8
    public rn2 P() {
        return null;
    }

    @Override // defpackage.xi8
    public /* bridge */ ji8 Q(mh8 mh8Var) {
        return z68.M(mh8Var);
    }

    public byte[] R(int i, String str) throws IOException {
        byte[] bArr = (byte[]) this.Z;
        if (str == null) {
            b61.i("'str' cannot be null");
            return null;
        }
        if (i < 0 || str.length() - i < 0) {
            kp5.k("invalid offset and/or length specified");
            return null;
        }
        if ((i & 1) != 0) {
            u52.s("a hexadecimal encoding must have an even number of characters");
            return null;
        }
        int i2 = i >>> 1;
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = i3 + 1;
            byte b = bArr[str.charAt(i3)];
            i3 += 2;
            int i6 = bArr[str.charAt(i5)] | (b << 4);
            if (i6 < 0) {
                u52.s("invalid characters encountered in Hex string");
                return null;
            }
            bArr2[i4] = (byte) i6;
        }
        return bArr2;
    }

    @Override // defpackage.xi8
    public /* bridge */ dt7 S(zk6 zk6Var) {
        return z68.G0(this, zk6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void T() {
        Object[] objArr;
        c15 c15Var = (c15) this.Y;
        Arrays.sort(c15Var.X, 0, c15Var.Z, l71.h0);
        int i = c15Var.Z;
        LayoutNode[] layoutNodeArr = (LayoutNode[]) this.Z;
        if (layoutNodeArr == null || layoutNodeArr.length < i) {
            objArr = layoutNodeArr;
            objArr = new LayoutNode[Math.max(16, i)];
        }
        objArr = layoutNodeArr;
        this.Z = null;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c15Var.X[i2];
        }
        c15Var.g();
        while (true) {
            i--;
            if (-1 >= i) {
                this.Z = objArr;
                return;
            }
            LayoutNode layoutNode = objArr[i];
            layoutNode.getClass();
            if (layoutNode.O0) {
                U(layoutNode);
            }
            objArr[i] = 0;
        }
    }

    @Override // defpackage.xi8
    public /* bridge */ Collection V(zk6 zk6Var) {
        return z68.x0(this, zk6Var);
    }

    @Override // defpackage.xi8
    public x14 W(x14 x14Var) {
        return z68.u0(x14Var);
    }

    public void X(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.Y;
        n06 n06Var = new n06(byteArrayOutputStream, map, (HashMap) this.Z);
        b85 b85Var = (b85) map.get(obj.getClass());
        if (b85Var != null) {
            b85Var.a(obj, n06Var);
            return;
        }
        throw new z02("No encoder for " + obj.getClass());
    }

    @Override // defpackage.xi8
    public /* bridge */ void Y(zk6 zk6Var) {
        z68.n0(zk6Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ int Z(mh8 mh8Var) {
        return z68.w0(mh8Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ boolean a(ji8 ji8Var, mh8 mh8Var) {
        return z68.S(ji8Var, mh8Var);
    }

    @Override // defpackage.xi8
    public zk6 a0(x14 x14Var) {
        aa7 aa7VarM0;
        x14Var.getClass();
        ce2 ce2VarO = z68.o(x14Var);
        if (ce2VarO != null && (aa7VarM0 = z68.M0(ce2VarO)) != null) {
            return aa7VarM0;
        }
        aa7 aa7VarP = z68.p(x14Var);
        aa7VarP.getClass();
        return aa7VarP;
    }

    @Override // defpackage.vc5
    public List b(Integer num) {
        List listB = ((vc5) this.Y).b(null);
        bc7 bc7Var = (bc7) this.Z;
        int i = bc7Var.v;
        return i < 0 ? listB : wv0.H0(nr4.k(bc7Var, num, i, Integer.valueOf(bc7Var.D(bc7Var.b, i))), listB);
    }

    @Override // defpackage.xi8
    public /* bridge */ fo0 b0(da7 da7Var) {
        return z68.m(this, da7Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ int c(x14 x14Var) {
        return z68.k(x14Var);
    }

    public CctBackendFactory c0(String str) {
        Bundle bundle;
        ServiceInfo serviceInfo;
        Map map = (Map) this.Z;
        if (map == null) {
            Context context = (Context) this.Y;
            try {
                PackageManager packageManager = context.getPackageManager();
                bundle = (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128)) == null) ? null : serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (bundle == null) {
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map2 = new HashMap();
                for (String str2 : bundle.keySet()) {
                    Object obj = bundle.get(str2);
                    if ((obj instanceof String) && str2.startsWith("backend:")) {
                        for (String str3 : ((String) obj).split(",", -1)) {
                            String strTrim = str3.trim();
                            if (!strTrim.isEmpty()) {
                                map2.put(strTrim, str2.substring(8));
                            }
                        }
                    }
                }
                map = map2;
            }
            this.Z = map;
        }
        String str4 = (String) map.get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused2) {
            StringBuilder sb = new StringBuilder("Class ");
            sb.append(str4);
            sb.append(" is not found.");
            return null;
        } catch (IllegalAccessException unused3) {
            StringBuilder sb2 = new StringBuilder("Could not instantiate ");
            sb2.append(str4);
            sb2.append(".");
            return null;
        } catch (InstantiationException unused4) {
            StringBuilder sb3 = new StringBuilder("Could not instantiate ");
            sb3.append(str4);
            sb3.append(".");
            return null;
        } catch (NoSuchMethodException unused5) {
            "Could not instantiate ".concat(str4);
            return null;
        } catch (InvocationTargetException unused6) {
            "Could not instantiate ".concat(str4);
            return null;
        }
    }

    @Override // defpackage.pm0
    public void cancel() {
        if (((rv) this.Z).compareAndSet(1, 1)) {
            return;
        }
        ((g00) this.Y).invoke();
    }

    @Override // defpackage.xi8
    public boolean d(fo0 fo0Var) {
        return fo0Var instanceof zn0;
    }

    @Override // defpackage.xi8
    public x14 d0(ArrayList arrayList) {
        aa7 aa7Var;
        int size = arrayList.size();
        if (size == 0) {
            bt.i("Expected some types");
            return null;
        }
        if (size == 1) {
            return (mo8) wv0.N0(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(xv0.Z(arrayList, 10));
        Iterator it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            mo8 mo8Var = (mo8) it.next();
            z = z || vr3.J(mo8Var);
            if (mo8Var instanceof aa7) {
                aa7Var = (aa7) mo8Var;
            } else {
                if (!(mo8Var instanceof ce2)) {
                    b61.c();
                    return null;
                }
                aa7Var = ((ce2) mo8Var).Y;
                z2 = true;
            }
            arrayList2.add(aa7Var);
        }
        if (z) {
            return u32.c(s32.INTERSECTION_OF_ERROR_TYPES, arrayList.toString());
        }
        bi8 bi8Var = bi8.a;
        if (!z2) {
            return bi8Var.b(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(xv0.Z(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(yn0.h0((mo8) it2.next()));
        }
        return dh3.s(bi8Var.b(arrayList2), bi8Var.b(arrayList3));
    }

    @Override // defpackage.yp7
    public void e(xp7 xp7Var) {
        f05 f05Var = (f05) this.Z;
        f05Var.a();
        l05 l05Var = (l05) xp7Var.Y;
        Object[] objArr = l05Var.b;
        long[] jArr = l05Var.c;
        int i = l05Var.e;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object objB = ((f64) this.Y).b(obj);
            int iD = f05Var.d(objB);
            int i3 = iD >= 0 ? f05Var.c[iD] : 0;
            if (i3 == 7) {
                xp7Var.remove(obj);
            } else {
                f05Var.g(i3 + 1, objB);
            }
            i = i2;
        }
    }

    @Override // defpackage.xi8
    public /* bridge */ bh8 e0(x14 x14Var) {
        return z68.q(x14Var);
    }

    @Override // defpackage.nt0
    public zz3 f() {
        throw new UnsupportedOperationException("Not supported");
    }

    @Override // defpackage.xi8
    public /* bridge */ bh8 f0(eo0 eo0Var) {
        return z68.y0(eo0Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ zk6 g(zk6 zk6Var) {
        return z68.O0(zk6Var, false);
    }

    @Override // defpackage.xi8
    public /* bridge */ boolean g0(zk6 zk6Var, zk6 zk6Var2) {
        return z68.T(zk6Var, zk6Var2);
    }

    @Override // defpackage.v06
    public Object get() {
        return new zu4((Context) ((f4) this.Y).X, (lr) ((yr2) this.Z).get());
    }

    @Override // defpackage.ov8
    public View getRoot() {
        return (RelativeLayout) this.Y;
    }

    @Override // defpackage.xi8
    public /* bridge */ zk6 h(fe2 fe2Var) {
        return z68.M0(fe2Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ ji8 h0(mh8 mh8Var, int i) {
        return z68.I(mh8Var, i);
    }

    @Override // defpackage.xi8
    public /* bridge */ zk6 i(fe2 fe2Var) {
        return z68.s0(fe2Var);
    }

    @Override // defpackage.xi8
    public boolean i0(mh8 mh8Var, mh8 mh8Var2) {
        mh8Var.getClass();
        mh8Var2.getClass();
        if (!(mh8Var instanceof lh8)) {
            bt.q("Failed requirement.");
            return false;
        }
        if (!(mh8Var2 instanceof lh8)) {
            bt.q("Failed requirement.");
            return false;
        }
        if (z68.j(mh8Var, mh8Var2)) {
            return true;
        }
        lh8 lh8Var = (lh8) mh8Var;
        lh8 lh8Var2 = (lh8) mh8Var2;
        Map map = (Map) this.Y;
        if (((u14) this.Z).g(lh8Var, lh8Var2)) {
            return true;
        }
        if (map != null) {
            lh8 lh8Var3 = (lh8) map.get(lh8Var);
            lh8 lh8Var4 = (lh8) map.get(lh8Var2);
            if (lh8Var3 != null && lh8Var3.equals(lh8Var2)) {
                return true;
            }
            if (lh8Var4 != null && lh8Var4.equals(lh8Var)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.xi8
    public /* bridge */ boolean j(bh8 bh8Var) {
        return z68.m0(bh8Var);
    }

    @Override // defpackage.xi8
    public boolean j0(zk6 zk6Var) {
        aa7 aa7VarP = z68.p(zk6Var);
        return (aa7VarP != null ? z68.m(this, F0(aa7VarP)) : null) != null;
    }

    @Override // defpackage.xi8
    public int k(ah8 ah8Var) {
        ah8Var.getClass();
        if (ah8Var instanceof zk6) {
            return z68.k((x14) ah8Var);
        }
        if (ah8Var instanceof at) {
            return ((at) ah8Var).size();
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(ah8Var);
        kp5.o(sb, yb6.a.b(ah8Var.getClass()));
        return 0;
    }

    public File k0() {
        if (((File) this.Y) == null) {
            synchronized (this) {
                try {
                    if (((File) this.Y) == null) {
                        String str = "PersistedInstallation." + ((xa2) this.Z).c() + ".json";
                        xa2 xa2Var = (xa2) this.Z;
                        xa2Var.a();
                        File file = new File(xa2Var.a.getNoBackupFilesDir(), str);
                        this.Y = file;
                        if (file.exists()) {
                            return (File) this.Y;
                        }
                        xa2 xa2Var2 = (xa2) this.Z;
                        xa2Var2.a();
                        File file2 = new File(xa2Var2.a.getFilesDir(), str);
                        if (file2.exists() && !file2.renameTo((File) this.Y)) {
                            new IOException("Unable to move the file from back up to non back up directory");
                            return file2;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (File) this.Y;
    }

    @Override // defpackage.xi8
    public /* bridge */ dj8 l(bh8 bh8Var) {
        return z68.O(bh8Var);
    }

    @Override // defpackage.xi8
    public boolean l0(x14 x14Var) {
        x14Var.getClass();
        return x14Var instanceof j65;
    }

    @Override // defpackage.xi8
    public /* bridge */ boolean m(x14 x14Var) {
        return z68.l0(x14Var);
    }

    public xr4 m0() {
        return (xr4) ((rh5) this.Z).getValue();
    }

    @Override // defpackage.xi8
    public /* bridge */ List n(ji8 ji8Var) {
        return z68.N(ji8Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ void n0(zk6 zk6Var) {
        z68.o0(zk6Var);
    }

    @Override // defpackage.xi8
    public void o(x14 x14Var) {
        x14Var.getClass();
        z68.o(x14Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ fe2 o0(x14 x14Var) {
        return z68.o(x14Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ x14 p(bh8 bh8Var) {
        return z68.L(this, bh8Var);
    }

    @Override // defpackage.xi8
    public mh8 p0(x14 x14Var) {
        x14Var.getClass();
        zk6 zk6VarP = z68.p(x14Var);
        if (zk6VarP == null) {
            zk6VarP = A(x14Var);
        }
        return z68.L0(zk6VarP);
    }

    @Override // defpackage.xi8
    public /* bridge */ boolean q(mh8 mh8Var) {
        return z68.f0(mh8Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ boolean q0(mh8 mh8Var) {
        return z68.e0(mh8Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ eo0 r(fo0 fo0Var) {
        return z68.K0(fo0Var);
    }

    public void r0(bz bzVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bzVar.a);
            jSONObject.put("Status", p61.B(bzVar.b));
            jSONObject.put("AuthToken", bzVar.c);
            jSONObject.put("RefreshToken", bzVar.d);
            jSONObject.put("TokenCreationEpochInSecs", bzVar.f);
            jSONObject.put("ExpiresInSecs", bzVar.e);
            jSONObject.put("FisError", bzVar.g);
            xa2 xa2Var = (xa2) this.Z;
            xa2Var.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", xa2Var.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(k0())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    @Override // defpackage.xi8
    public /* bridge */ boolean s(mh8 mh8Var) {
        return z68.Z(mh8Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ zk6 s0(zk6 zk6Var) {
        return z68.r(zk6Var);
    }

    @Override // defpackage.g83
    public Object t(boolean z, s51 s51Var) {
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        switch (b) {
            case 9:
                u84 u84VarH = i21.H((MainActivity) this.Y);
                nf1 nf1Var = tp1.a;
                jm4.Q(u84VarH, dm4.a, new r5((sn) this.Z, z, null, (byte) 21), 2);
                break;
            default:
                MainViewModel mainViewModel = (MainViewModel) this.Z;
                ca6 ca6Var = (ca6) this.Y;
                int i = ca6Var.X - 1;
                ca6Var.X = i;
                if (i <= 0) {
                    mainViewModel.s();
                    q02 q02Var = mainViewModel.v;
                    if (q02Var != null) {
                        m51 m51Var = ko1.B1;
                        km4.x(((MainActivity) q02Var.Y).n());
                    }
                }
                break;
        }
        return dn8Var;
    }

    @Override // defpackage.xi8
    public /* bridge */ zk6 t0(x14 x14Var) {
        return z68.p(x14Var);
    }

    public String toString() {
        switch (this.X) {
            case 24:
                String str = "[ ";
                if (((ge7) this.Y) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((ge7) this.Y).j0[i] + " ";
                    }
                }
                return str + "] " + ((ge7) this.Y);
            default:
                return super.toString();
        }
    }

    @Override // defpackage.xi8
    public boolean u(zk6 zk6Var) {
        zk6Var.getClass();
        return z68.h0(p0(zk6Var)) && !z68.i0(zk6Var);
    }

    @Override // defpackage.xi8
    public fo0 u0(zk6 zk6Var) {
        return z68.m(this, F0(zk6Var));
    }

    @Override // defpackage.xi8
    public boolean v(zk6 zk6Var) {
        zk6Var.getClass();
        return z68.Z(z68.L0(zk6Var));
    }

    @Override // defpackage.xi8
    public /* bridge */ boolean v0(mh8 mh8Var) {
        return z68.X(mh8Var);
    }

    @Override // defpackage.xi8
    public bh8 w(zk6 zk6Var, int i) {
        if (i < 0 || i >= z68.k(zk6Var)) {
            return null;
        }
        return z68.D(zk6Var, i);
    }

    @Override // defpackage.xi8
    public /* bridge */ boolean w0(fo0 fo0Var) {
        return z68.k0(fo0Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ dj8 x(ji8 ji8Var) {
        return z68.P(ji8Var);
    }

    @Override // defpackage.xi8
    public /* bridge */ boolean x0(mh8 mh8Var) {
        return z68.h0(mh8Var);
    }

    @Override // defpackage.is0
    public hs0 y(qs0 qs0Var) {
        qs0Var.getClass();
        y45 y45Var = (y45) this.Y;
        zl1 zl1Var = (zl1) this.Z;
        zl1Var.c().c.getClass();
        qb6 qb6VarA = w51.A(y45Var, qs0Var, hv4.g);
        if (qb6VarA == null) {
            return null;
        }
        ia6.a(qb6VarA.a).equals(qs0Var);
        return zl1Var.g(qb6VarA);
    }

    @Override // defpackage.xi8
    public bh8 y0(ah8 ah8Var, int i) {
        ah8Var.getClass();
        if (ah8Var instanceof da7) {
            return z68.D((x14) ah8Var, i);
        }
        if (ah8Var instanceof at) {
            E e = ((at) ah8Var).get(i);
            e.getClass();
            return (bh8) e;
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(ah8Var);
        kp5.o(sb, yb6.a.b(ah8Var.getClass()));
        return null;
    }

    @Override // defpackage.vc5
    public boolean z() {
        return ((vc5) this.Y).z();
    }

    @Override // defpackage.xi8
    public /* bridge */ boolean z0(mh8 mh8Var) {
        return z68.a0(mh8Var);
    }

    @Override // defpackage.nt0, defpackage.xi8
    public /* bridge */ aa7 h(fe2 fe2Var) {
        return z68.M0(fe2Var);
    }

    @Override // defpackage.nt0, defpackage.xi8
    public /* bridge */ aa7 i(fe2 fe2Var) {
        return z68.s0(fe2Var);
    }

    @Override // defpackage.nt0, defpackage.xi8
    public /* bridge */ aa7 g(zk6 zk6Var) {
        return z68.O0(zk6Var, true);
    }

    @Override // defpackage.xi8
    public void D0(zk6 zk6Var, mh8 mh8Var) {
    }

    public /* synthetic */ zz2(byte b, boolean z) {
        this.X = b;
    }

    public /* synthetic */ zz2(Object obj, byte b) {
        this.X = b;
        this.Z = obj;
    }

    public /* synthetic */ zz2(Object obj, Object obj2, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
    }

    public zz2(lr5 lr5Var) {
        this.X = (byte) 28;
        this.Y = lr5Var;
        this.Z = new lr5((byte) 3);
    }

    public zz2(HashMap map, u14 u14Var) {
        this.X = (byte) 20;
        u14Var.getClass();
        this.Y = map;
        this.Z = u14Var;
    }

    public zz2(LayoutNode layoutNode, xr4 xr4Var) {
        this.X = (byte) 2;
        this.Y = layoutNode;
        this.Z = z51.H(xr4Var);
    }

    public zz2(Locale locale) {
        this.X = (byte) 22;
        this.Y = locale;
        this.Z = DateFormatSymbols.getInstance(locale).getShortMonths();
        Calendar calendar = Calendar.getInstance(locale);
        int minimum = calendar.getMinimum(5);
        int maximum = calendar.getMaximum(5);
        String[] strArr = new String[(maximum - minimum) + 1];
        for (int i = minimum; i <= maximum; i++) {
            strArr[i - minimum] = String.format("%02d", Integer.valueOf(i));
        }
    }

    public zz2(g00 g00Var) {
        this.X = (byte) 18;
        this.Y = g00Var;
        this.Z = new rv(0);
    }

    public zz2(Context context) {
        this.X = (byte) 12;
        this.Z = null;
        this.Y = context;
    }

    public zz2(Map map) {
        this.X = (byte) 16;
        this.Y = map;
        this.Z = new ve4("Java nullability annotation states").c(new f0(this, (byte) 25));
    }

    public zz2(f64 f64Var) {
        this.X = (byte) 7;
        this.Y = f64Var;
        f05 f05Var = g85.a;
        this.Z = new f05();
    }
}
