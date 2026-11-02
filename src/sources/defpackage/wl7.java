package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Spanned;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import coil3.compose.ImagePainter;
import com.google.accompanist.drawablepainter.DrawablePainter;
import io.sentry.c2;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: C:\Users\nzboost\Documents\workspace\happ-src\raw\classes2.dex */
public abstract class wl7 {
    public static final Object[] a = new Object[0];
    public static final yl1 b = new yl1();
    public static final cg c = new cg((byte) 3);
    public static final e37[] d = new e37[0];
    public static final c75 e = new c75((byte) 7);
    public static mj3 f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static u91 A(byte[] bArr) {
        bArr.getClass();
        if (bArr.length > 10240) {
            bt.i("Data cannot occupy more than 10240 bytes when serialized");
            return null;
        }
        if (bArr.length == 0) {
            return u91.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            int i = 0;
            boolean z = bArr2[0] == -84 && bArr2[1] == -19;
            byteArrayInputStream.reset();
            if (z) {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i2 = objectInputStream.readInt();
                    while (i < i2) {
                        linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        i++;
                    }
                    objectInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        oc.h(objectInputStream, th);
                        throw th2;
                    }
                }
            } else {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                try {
                    short s = dataInputStream.readShort();
                    if (s == -21521) {
                        short s2 = dataInputStream.readShort();
                        if (s2 != 1) {
                            kp5.h(pc6.j(s2, "Unsupported version number: "));
                        }
                    } else {
                        kp5.h(pc6.j(s, "Magic number doesn't match: "));
                    }
                    int i3 = dataInputStream.readInt();
                    while (i < i3) {
                        linkedHashMap.put(dataInputStream.readUTF(), B(dataInputStream, dataInputStream.readByte()));
                        i++;
                    }
                    dataInputStream.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        oc.h(dataInputStream, th3);
                        throw th4;
                    }
                }
            }
        } catch (IOException unused) {
            int i4 = kb1.a;
            lh4.P0().getClass();
        } catch (ClassNotFoundException unused2) {
            int i5 = kb1.a;
            lh4.P0().getClass();
        }
        return new u91(linkedHashMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
    public static final Serializable B(DataInputStream dataInputStream, byte b2) throws IOException {
        if (b2 == 0) {
            return null;
        }
        if (b2 == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b2 == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b2 == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b2 == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b2 == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b2 == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b2 == 7) {
            return dataInputStream.readUTF();
        }
        int i = 0;
        if (b2 == 8) {
            int i2 = dataInputStream.readInt();
            ?? r0 = new Boolean[i2];
            while (i < i2) {
                r0[i] = Boolean.valueOf(dataInputStream.readBoolean());
                i++;
            }
            return r0;
        }
        if (b2 == 9) {
            int i3 = dataInputStream.readInt();
            ?? r1 = new Byte[i3];
            while (i < i3) {
                r1[i] = Byte.valueOf(dataInputStream.readByte());
                i++;
            }
            return r1;
        }
        if (b2 == 10) {
            int i4 = dataInputStream.readInt();
            ?? r2 = new Integer[i4];
            while (i < i4) {
                r2[i] = Integer.valueOf(dataInputStream.readInt());
                i++;
            }
            return r2;
        }
        if (b2 == 11) {
            int i5 = dataInputStream.readInt();
            ?? r3 = new Long[i5];
            while (i < i5) {
                r3[i] = Long.valueOf(dataInputStream.readLong());
                i++;
            }
            return r3;
        }
        if (b2 == 12) {
            int i6 = dataInputStream.readInt();
            ?? r4 = new Float[i6];
            while (i < i6) {
                r4[i] = Float.valueOf(dataInputStream.readFloat());
                i++;
            }
            return r4;
        }
        if (b2 == 13) {
            int i7 = dataInputStream.readInt();
            ?? r5 = new Double[i7];
            while (i < i7) {
                r5[i] = Double.valueOf(dataInputStream.readDouble());
                i++;
            }
            return r5;
        }
        if (b2 != 14) {
            bt.i(pc6.j(b2, "Unsupported type "));
            return null;
        }
        int i8 = dataInputStream.readInt();
        ?? r6 = new String[i8];
        while (i < i8) {
            String utf = dataInputStream.readUTF();
            if (dh3.f(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                utf = null;
            }
            r6[i] = utf;
            i++;
        }
        return r6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String E(Uri uri) {
        uri.getClass();
        String fragment = uri.getFragment();
        if (fragment == null) {
            return null;
        }
        ss8 ss8Var = ss8.a;
        return ss8.K(fragment);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final yy1 F() {
        if (!yy1.d()) {
            return null;
        }
        yy1 yy1VarA = yy1.a();
        if (yy1VarA.c() == 1) {
            return yy1VarA;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static kc3 N(hx1 hx1Var, int i) {
        return new kc3(hx1Var, be6.X);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final ArrayList R(List list, dn2 dn2Var) {
        cb0 cb0Var;
        if (!((Boolean) dn2Var.invoke()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            tr4 tr4Var = (tr4) list.get(i);
            Object objW = tr4Var.w();
            objW.getClass();
            jn0 jn0Var = ((g88) objW).X;
            b88 b88Var = (b88) jn0Var.Y;
            pl plVar = (pl) jn0Var.Z;
            x78 x78Var = (x78) b88Var.a.getValue();
            if (x78Var == null) {
                cb0Var = new cb0(0, 0, new mq7((byte) 25));
            } else {
                pl plVarC = b88.c(plVar, x78Var);
                if (plVarC == null) {
                    cb0Var = new cb0(0, 0, new mq7((byte) 26));
                } else {
                    lf3 lf3VarL = os4.L(x78Var.j(plVarC.b, plVarC.c).d());
                    cb0Var = new cb0(lf3VarL.d(), lf3VarL.b(), new v38(lf3VarL, (byte) 3));
                }
            }
            int i2 = cb0Var.Y;
            int i3 = cb0Var.Z;
            arrayList.add(new qg5(tr4Var.o(z68.B(i2, i2, i3, i3)), (dn2) cb0Var.f0));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static wf7 V(float f2, float f3, Object obj, int i) {
        if ((i & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new wf7(f2, f3, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean W() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Google")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Google")) {
                return false;
            }
        }
        String str3 = Build.MODEL;
        str3.getClass();
        String upperCase = str3.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return ExtraSupportedSurfaceCombinationsQuirk.c.contains(upperCase);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:15:0x003f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:? A[LOOP:0: B:7:0x002d->B:16:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x0019  */
    /* JADX WARN: Code duplicated, block: B:9:0x0033  */
    public static boolean X() {
        String upperCase;
        Iterator it;
        String str = Build.MANUFACTURER;
        str.getClass();
        if (str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.MODEL;
            str2.getClass();
            upperCase = str2.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            it = ExtraSupportedSurfaceCombinationsQuirk.d.iterator();
            while (it.hasNext()) {
                if (mm7.Z(upperCase, false, (String) it.next())) {
                    return true;
                }
            }
        } else {
            String str3 = Build.BRAND;
            str3.getClass();
            if (str3.equalsIgnoreCase("Samsung")) {
                String str4 = Build.MODEL;
                str4.getClass();
                upperCase = str4.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                it = ExtraSupportedSurfaceCombinationsQuirk.d.iterator();
                while (it.hasNext()) {
                    if (mm7.Z(upperCase, false, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final kx4 Y(kx4 kx4Var, ql qlVar, o88 o88Var, gn2 gn2Var, int i, boolean z, int i2, int i3, fi2 fi2Var, List list, gn2 gn2Var2, gn2 gn2Var3, mx mxVar) {
        return kx4Var.y(hx4.X).y(new TextAnnotatedStringElement(qlVar, o88Var, fi2Var, gn2Var, i, z, i2, i3, list, gn2Var2, mxVar, gn2Var3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object[] Z(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArrCopyOf, i2);
            }
            i = i2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:119:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:125:0x01fb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:129:0x0216 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:130:0x0218  */
    public static final void a(final ql qlVar, final kx4 kx4Var, final o88 o88Var, final gn2 gn2Var, final int i, final boolean z, final int i2, final int i3, final Map map, final mx mxVar, lp2 lp2Var, final int i4, final int i5) {
        int i6;
        o88 o88Var2;
        boolean z2;
        Map map2;
        int i7;
        boolean z3;
        int i8;
        boolean z4;
        fi2 fi2Var;
        boolean z5;
        Object objK;
        y05 y05Var;
        boolean zF;
        Object objK2;
        List list;
        lp2 lp2Var2 = lp2Var;
        lp2Var2.X(-1343466571);
        if ((i4 & 6) == 0) {
            i6 = (lp2Var2.f(qlVar) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= lp2Var2.f(kx4Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            o88Var2 = o88Var;
            i6 |= lp2Var2.f(o88Var2) ? 256 : 128;
        } else {
            o88Var2 = o88Var;
        }
        if ((i4 & 3072) == 0) {
            i6 |= lp2Var2.h(gn2Var) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= lp2Var2.d(i) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            z2 = z;
            i6 |= lp2Var2.g(z2) ? 131072 : 65536;
        } else {
            z2 = z;
        }
        if ((1572864 & i4) == 0) {
            i6 |= lp2Var2.d(i2) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i6 |= lp2Var2.d(i3) ? XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW : 4194304;
        }
        if ((100663296 & i4) == 0) {
            map2 = map;
            i6 |= lp2Var2.h(map2) ? 67108864 : 33554432;
        } else {
            map2 = map;
        }
        int i9 = i6 | 805306368;
        if ((i5 & 6) == 0) {
            i7 = i5 | ((i5 & 8) == 0 ? lp2Var2.f(mxVar) : lp2Var2.h(mxVar) ? 4 : 2);
        } else {
            i7 = i5;
        }
        int i10 = 0;
        if (lp2Var2.N(i9 & 1, ((i9 & 306783379) == 306783378 && (i7 & 3) == 2) ? false : true)) {
            vr3.k0(i3, i2);
            if (lp2Var2.j(q07.a) != null) {
                c2.m();
                return;
            }
            lp2Var2.W(1588900273);
            lp2Var2.p(false);
            qg5 qg5Var = tl.a;
            int length = qlVar.Y.length();
            List list2 = qlVar.X;
            if (list2 != null) {
                int size = list2.size();
                while (true) {
                    if (i10 < size) {
                        i8 = i9;
                        pl plVar = (pl) list2.get(i10);
                        if (plVar.a instanceof ul7) {
                            list = list2;
                            if ("androidx.compose.foundation.text.inlineContent".equals(plVar.d)) {
                                if (rl.b(0, length, plVar.b, plVar.c)) {
                                    z4 = false;
                                    z3 = true;
                                }
                            }
                            i10++;
                            list2 = list;
                            i9 = i8;
                        } else {
                            list = list2;
                        }
                        i10++;
                        list2 = list;
                        i9 = i8;
                    } else {
                        z3 = false;
                    }
                    boolean zI = u28.i(qlVar);
                    fi2Var = (fi2) lp2Var2.j(y01.k);
                    if (!z3 || zI) {
                        int i11 = i7;
                        lp2Var2.W(1590195670);
                        if ((i8 & 14) == 4) {
                            z5 = true;
                        } else {
                            z5 = z4;
                        }
                        objK = lp2Var2.K();
                        be beVar = zz0.a;
                        if (z5 || objK == beVar) {
                            objK = z51.H(qlVar);
                            lp2Var2.g0(objK);
                        }
                        y05Var = (y05) objK;
                        ql qlVar2 = (ql) y05Var.getValue();
                        zF = lp2Var2.f(y05Var);
                        objK2 = lp2Var2.K();
                        if (zF || objK2 == beVar) {
                            objK2 = new gh(y05Var, (byte) 2);
                            lp2Var2.g0(objK2);
                        }
                        int i12 = i8 << 6;
                        d(kx4Var, qlVar2, gn2Var, z3, map2, o88Var, i, z, i2, i3, fi2Var, (gn2) objK2, mxVar, lp2Var2, ((i8 >> 3) & 910) | ((i8 >> 12) & 57344) | ((i8 << 9) & 458752) | (3670016 & i12) | (29360128 & i12) | (234881024 & i12) | (i12 & 1879048192), ((i8 >> 21) & 896) | ((i11 << 12) & 57344));
                        lp2Var2 = lp2Var2;
                        lp2Var2.p(false);
                    } else {
                        lp2Var2.W(1589148149);
                        f40.a(qlVar, o88Var2, fi2Var, (List) null, z2, lp2Var2);
                        kx4 kx4VarY = Y(kx4Var, qlVar, o88Var, gn2Var, i, z, i2, i3, fi2Var, null, null, null, mxVar);
                        ld ldVar = ld.f;
                        int iHashCode = Long.hashCode(lp2Var2.T);
                        kx4 kx4VarQ = w45.Q(lp2Var2, kx4VarY);
                        kl5 kl5VarL = lp2Var2.l();
                        uz0.j.getClass();
                        lp2Var2.Z();
                        if (lp2Var2.S) {
                            lp2Var2.k();
                        } else {
                            lp2Var2.j0();
                        }
                        pn7.m(pz2.B0, lp2Var2, ldVar);
                        pn7.m(pz2.A0, lp2Var2, kl5VarL);
                        pn7.l(lp2Var2);
                        pn7.m(pz2.z0, lp2Var2, kx4VarQ);
                        pn7.m(pz2.C0, lp2Var2, Integer.valueOf(iHashCode));
                        lp2Var2.p(true);
                        lp2Var2.p(false);
                        lp2Var2 = lp2Var2;
                    }
                }
            } else {
                z3 = false;
            }
            i8 = i9;
            z4 = z3;
            boolean zI2 = u28.i(qlVar);
            fi2Var = (fi2) lp2Var2.j(y01.k);
            if (z3) {
                int i13 = i7;
                lp2Var2.W(1590195670);
                if ((i8 & 14) == 4) {
                    z5 = true;
                } else {
                    z5 = z4;
                }
                objK = lp2Var2.K();
                be beVar2 = zz0.a;
                if (z5) {
                    objK = z51.H(qlVar);
                    lp2Var2.g0(objK);
                } else {
                    objK = z51.H(qlVar);
                    lp2Var2.g0(objK);
                }
                y05Var = (y05) objK;
                ql qlVar3 = (ql) y05Var.getValue();
                zF = lp2Var2.f(y05Var);
                objK2 = lp2Var2.K();
                if (zF) {
                    objK2 = new gh(y05Var, (byte) 2);
                    lp2Var2.g0(objK2);
                } else {
                    objK2 = new gh(y05Var, (byte) 2);
                    lp2Var2.g0(objK2);
                }
                int i14 = i8 << 6;
                d(kx4Var, qlVar3, gn2Var, z3, map2, o88Var, i, z, i2, i3, fi2Var, (gn2) objK2, mxVar, lp2Var2, ((i8 >> 3) & 910) | ((i8 >> 12) & 57344) | ((i8 << 9) & 458752) | (3670016 & i14) | (29360128 & i14) | (234881024 & i14) | (i14 & 1879048192), ((i8 >> 21) & 896) | ((i13 << 12) & 57344));
                lp2Var2 = lp2Var2;
                lp2Var2.p(false);
            } else {
                int i15 = i7;
                lp2Var2.W(1590195670);
                if ((i8 & 14) == 4) {
                    z5 = true;
                } else {
                    z5 = z4;
                }
                objK = lp2Var2.K();
                be beVar3 = zz0.a;
                if (z5) {
                    objK = z51.H(qlVar);
                    lp2Var2.g0(objK);
                } else {
                    objK = z51.H(qlVar);
                    lp2Var2.g0(objK);
                }
                y05Var = (y05) objK;
                ql qlVar4 = (ql) y05Var.getValue();
                zF = lp2Var2.f(y05Var);
                objK2 = lp2Var2.K();
                if (zF) {
                    objK2 = new gh(y05Var, (byte) 2);
                    lp2Var2.g0(objK2);
                } else {
                    objK2 = new gh(y05Var, (byte) 2);
                    lp2Var2.g0(objK2);
                }
                int i16 = i8 << 6;
                d(kx4Var, qlVar4, gn2Var, z3, map2, o88Var, i, z, i2, i3, fi2Var, (gn2) objK2, mxVar, lp2Var2, ((i8 >> 3) & 910) | ((i8 >> 12) & 57344) | ((i8 << 9) & 458752) | (3670016 & i16) | (29360128 & i16) | (234881024 & i16) | (i16 & 1879048192), ((i8 >> 21) & 896) | ((i15 << 12) & 57344));
                lp2Var2 = lp2Var2;
                lp2Var2.p(false);
            }
        } else {
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: z30
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = w79.P(i4 | 1);
                    int iP2 = w79.P(i5);
                    ql qlVar5 = qlVar;
                    kx4 kx4Var2 = kx4Var;
                    o88 o88Var3 = o88Var;
                    gn2 gn2Var2 = gn2Var;
                    byte b2 = i;
                    boolean z6 = z;
                    int i17 = i2;
                    boolean z7 = i3;
                    Map map3 = map;
                    mx mxVar2 = mxVar;
                    wl7.a(qlVar5, kx4Var2, o88Var3, gn2Var2, b2, z6, i17, z7 ? 1 : 0, map3, mxVar2, (lp2) obj, iP, iP2);
                    return dn8.a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object[] a0(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    objNewInstance.getClass();
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i2);
                        }
                        objArr[i2] = null;
                        return objArr;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:100:0x0118  */
    /* JADX WARN: Code duplicated, block: B:102:0x011c  */
    /* JADX WARN: Code duplicated, block: B:103:0x011e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0121  */
    /* JADX WARN: Code duplicated, block: B:106:0x0123  */
    /* JADX WARN: Code duplicated, block: B:108:0x0127  */
    /* JADX WARN: Code duplicated, block: B:109:0x0129  */
    /* JADX WARN: Code duplicated, block: B:112:0x0136  */
    /* JADX WARN: Code duplicated, block: B:114:0x0151  */
    /* JADX WARN: Code duplicated, block: B:123:0x0188  */
    /* JADX WARN: Code duplicated, block: B:125:0x0194 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:126:0x0196  */
    /* JADX WARN: Code duplicated, block: B:131:0x0203  */
    /* JADX WARN: Code duplicated, block: B:132:0x0207  */
    /* JADX WARN: Code duplicated, block: B:134:0x022e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0232  */
    /* JADX WARN: Code duplicated, block: B:139:0x0243  */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00db  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:90:0x0100  */
    /* JADX WARN: Code duplicated, block: B:91:0x0102  */
    /* JADX WARN: Code duplicated, block: B:94:0x010b  */
    /* JADX WARN: Code duplicated, block: B:96:0x010e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0111  */
    /* JADX WARN: Code duplicated, block: B:99:0x0115  */
    public static final void b(final String str, final kx4 kx4Var, final o88 o88Var, gn2 gn2Var, int i, boolean z, final int i2, int i3, mx mxVar, lp2 lp2Var, final int i4, final int i5) {
        int i6;
        o88 o88Var2;
        gn2 gn2Var2;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean zH;
        int i15;
        boolean z3;
        final int i16;
        final mx mxVar2;
        final gn2 gn2Var3;
        final boolean z4;
        final int i17;
        j86 j86VarR;
        gn2 gn2Var4;
        int i18;
        boolean z5;
        int i19;
        mx mxVar3;
        fi2 fi2Var;
        Executor executor;
        fi2 fi2Var2;
        int i20;
        int i21;
        gn2 gn2Var5;
        boolean z6;
        kx4 kx4VarY;
        int i22;
        lp2Var.X(-1040751001);
        if ((i4 & 6) == 0) {
            i6 = (lp2Var.f(str) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= lp2Var.f(kx4Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            o88Var2 = o88Var;
            i6 |= lp2Var.f(o88Var2) ? 256 : 128;
        } else {
            o88Var2 = o88Var;
        }
        int i23 = i5 & 8;
        if (i23 == 0) {
            if ((i4 & 3072) == 0) {
                gn2Var2 = gn2Var;
                i6 |= lp2Var.h(gn2Var2) ? 2048 : 1024;
            }
            i7 = i5 & 16;
            if (i7 != 0) {
                if ((i4 & 24576) == 0) {
                    if (lp2Var.d(i)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i6 |= i8;
                }
                i9 = i5 & 32;
                if (i9 != 0) {
                    if ((196608 & i4) == 0) {
                        z2 = z;
                        if (lp2Var.g(z2)) {
                            i10 = 131072;
                        } else {
                            i10 = 65536;
                        }
                        i6 |= i10;
                    }
                    if ((1572864 & i4) == 0) {
                        if (lp2Var.d(i2)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i6 |= i22;
                    }
                    i11 = i5 & 128;
                    if (i11 != 0) {
                        i6 |= 12582912;
                    } else if ((i4 & 12582912) == 0) {
                        if (lp2Var.d(i3)) {
                            i12 = XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW;
                        } else {
                            i12 = 4194304;
                        }
                        i6 |= i12;
                    }
                    i13 = i6 | 100663296;
                    i14 = i5 & 512;
                    if (i14 != 0) {
                        i13 = i6 | 905969664;
                    } else if ((805306368 & i4) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zH = lp2Var.f(mxVar);
                        } else {
                            zH = lp2Var.h(mxVar);
                        }
                        if (zH) {
                            i15 = 536870912;
                        } else {
                            i15 = 268435456;
                        }
                        i13 |= i15;
                    }
                    if ((i13 & 306783379) != 306783378) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (lp2Var.N(i13 & 1, z3)) {
                        if (i23 != 0) {
                            gn2Var4 = null;
                        } else {
                            gn2Var4 = gn2Var2;
                        }
                        if (i7 != 0) {
                            i18 = 1;
                        } else {
                            i18 = i;
                        }
                        if (i9 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i11 != 0) {
                            i19 = 1;
                        } else {
                            i19 = i3;
                        }
                        if (i14 != 0) {
                            mxVar3 = null;
                        } else {
                            mxVar3 = mxVar;
                        }
                        vr3.k0(i19, i2);
                        if (lp2Var.j(q07.a) == null) {
                            c2.m();
                            return;
                        }
                        lp2Var.W(357055103);
                        lp2Var.p(false);
                        fi2Var = (fi2) lp2Var.j(y01.k);
                        executor = (Executor) lp2Var.j(f40.a);
                        if (executor == null && f40.b(str.length())) {
                            lp2Var.W(-1250263182);
                            boolean z7 = z5;
                            try {
                                e40 e40Var = new e40(o88Var2, (z24) lp2Var.j(y01.n), str, (fi1) lp2Var.j(y01.h), fi2Var, z7);
                                fi2Var2 = fi2Var;
                                z5 = z7;
                                try {
                                    executor.execute(e40Var);
                                } catch (RejectedExecutionException unused) {
                                }
                            } catch (RejectedExecutionException unused2) {
                                fi2Var2 = fi2Var;
                                z5 = z7;
                            }
                            lp2Var.p(false);
                        } else {
                            fi2Var2 = fi2Var;
                            lp2Var.W(-1248455541);
                            lp2Var.p(false);
                        }
                        if (gn2Var4 == null || mxVar3 != null) {
                            i20 = i19;
                            i21 = i18;
                            lp2Var.W(357432497);
                            gn2Var5 = gn2Var4;
                            z6 = true;
                            kx4VarY = Y(kx4Var, new ql(str), o88Var, gn2Var5, i21, z5, i2, i20, (fi2) lp2Var.j(y01.k), null, null, null, mxVar3);
                            lp2Var.p(false);
                        } else {
                            lp2Var.W(358076243);
                            lp2Var.p(false);
                            i20 = i19;
                            i21 = i18;
                            kx4VarY = kx4Var.y(new TextStringSimpleElement(str, o88Var, fi2Var2, i21, z5, i2, i20));
                            gn2Var5 = gn2Var4;
                            z6 = true;
                        }
                        ld ldVar = ld.f;
                        int iHashCode = Long.hashCode(lp2Var.T);
                        kx4 kx4VarQ = w45.Q(lp2Var, kx4VarY);
                        kl5 kl5VarL = lp2Var.l();
                        uz0.j.getClass();
                        lp2Var.Z();
                        if (lp2Var.S) {
                            lp2Var.k();
                        } else {
                            lp2Var.j0();
                        }
                        pn7.m(pz2.B0, lp2Var, ldVar);
                        pn7.m(pz2.A0, lp2Var, kl5VarL);
                        pn7.l(lp2Var);
                        pn7.m(pz2.z0, lp2Var, kx4VarQ);
                        pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode));
                        lp2Var.p(z6);
                        z4 = z5;
                        i16 = i20;
                        mxVar2 = mxVar3;
                        i17 = i21;
                        gn2Var3 = gn2Var5;
                    } else {
                        lp2Var.Q();
                        i16 = i3;
                        mxVar2 = mxVar;
                        gn2Var3 = gn2Var2;
                        z4 = z2;
                        i17 = i;
                    }
                    j86VarR = lp2Var.r();
                    if (j86VarR != null) {
                        j86VarR.d = new rn2() { // from class: y30
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            public final Object K(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                wl7.b(str, kx4Var, o88Var, gn2Var3, i17, z4, i2, i16, mxVar2, (lp2) obj, w79.P(i4 | 1), i5);
                                return dn8.a;
                            }
                        };
                    }
                }
                i6 |= 196608;
                z2 = z;
                if ((1572864 & i4) == 0) {
                    if (lp2Var.d(i2)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i6 |= i22;
                }
                i11 = i5 & 128;
                if (i11 != 0) {
                    i6 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    if (lp2Var.d(i3)) {
                        i12 = XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW;
                    } else {
                        i12 = 4194304;
                    }
                    i6 |= i12;
                }
                i13 = i6 | 100663296;
                i14 = i5 & 512;
                if (i14 != 0) {
                    i13 = i6 | 905969664;
                } else if ((805306368 & i4) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zH = lp2Var.f(mxVar);
                    } else {
                        zH = lp2Var.h(mxVar);
                    }
                    if (zH) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i13 |= i15;
                }
                if ((i13 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (lp2Var.N(i13 & 1, z3)) {
                    if (i23 != 0) {
                        gn2Var4 = null;
                    } else {
                        gn2Var4 = gn2Var2;
                    }
                    if (i7 != 0) {
                        i18 = 1;
                    } else {
                        i18 = i;
                    }
                    if (i9 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i11 != 0) {
                        i19 = 1;
                    } else {
                        i19 = i3;
                    }
                    if (i14 != 0) {
                        mxVar3 = null;
                    } else {
                        mxVar3 = mxVar;
                    }
                    vr3.k0(i19, i2);
                    if (lp2Var.j(q07.a) == null) {
                        c2.m();
                        return;
                    }
                    lp2Var.W(357055103);
                    lp2Var.p(false);
                    fi2Var = (fi2) lp2Var.j(y01.k);
                    executor = (Executor) lp2Var.j(f40.a);
                    if (executor == null) {
                        fi2Var2 = fi2Var;
                        lp2Var.W(-1248455541);
                        lp2Var.p(false);
                    } else {
                        fi2Var2 = fi2Var;
                        lp2Var.W(-1248455541);
                        lp2Var.p(false);
                    }
                    if (gn2Var4 == null) {
                        i20 = i19;
                        i21 = i18;
                        lp2Var.W(357432497);
                        gn2Var5 = gn2Var4;
                        z6 = true;
                        kx4VarY = Y(kx4Var, new ql(str), o88Var, gn2Var5, i21, z5, i2, i20, (fi2) lp2Var.j(y01.k), null, null, null, mxVar3);
                        lp2Var.p(false);
                    } else {
                        i20 = i19;
                        i21 = i18;
                        lp2Var.W(357432497);
                        gn2Var5 = gn2Var4;
                        z6 = true;
                        kx4VarY = Y(kx4Var, new ql(str), o88Var, gn2Var5, i21, z5, i2, i20, (fi2) lp2Var.j(y01.k), null, null, null, mxVar3);
                        lp2Var.p(false);
                    }
                    ld ldVar2 = ld.f;
                    int iHashCode2 = Long.hashCode(lp2Var.T);
                    kx4 kx4VarQ2 = w45.Q(lp2Var, kx4VarY);
                    kl5 kl5VarL2 = lp2Var.l();
                    uz0.j.getClass();
                    lp2Var.Z();
                    if (lp2Var.S) {
                        lp2Var.k();
                    } else {
                        lp2Var.j0();
                    }
                    pn7.m(pz2.B0, lp2Var, ldVar2);
                    pn7.m(pz2.A0, lp2Var, kl5VarL2);
                    pn7.l(lp2Var);
                    pn7.m(pz2.z0, lp2Var, kx4VarQ2);
                    pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode2));
                    lp2Var.p(z6);
                    z4 = z5;
                    i16 = i20;
                    mxVar2 = mxVar3;
                    i17 = i21;
                    gn2Var3 = gn2Var5;
                } else {
                    lp2Var.Q();
                    i16 = i3;
                    mxVar2 = mxVar;
                    gn2Var3 = gn2Var2;
                    z4 = z2;
                    i17 = i;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: y30
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        public final Object K(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            wl7.b(str, kx4Var, o88Var, gn2Var3, i17, z4, i2, i16, mxVar2, (lp2) obj, w79.P(i4 | 1), i5);
                            return dn8.a;
                        }
                    };
                }
            }
            i6 |= 24576;
            i9 = i5 & 32;
            if (i9 != 0) {
                if ((196608 & i4) == 0) {
                    z2 = z;
                    if (lp2Var.g(z2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i6 |= i10;
                }
                if ((1572864 & i4) == 0) {
                    if (lp2Var.d(i2)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i6 |= i22;
                }
                i11 = i5 & 128;
                if (i11 != 0) {
                    i6 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    if (lp2Var.d(i3)) {
                        i12 = XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW;
                    } else {
                        i12 = 4194304;
                    }
                    i6 |= i12;
                }
                i13 = i6 | 100663296;
                i14 = i5 & 512;
                if (i14 != 0) {
                    i13 = i6 | 905969664;
                } else if ((805306368 & i4) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zH = lp2Var.f(mxVar);
                    } else {
                        zH = lp2Var.h(mxVar);
                    }
                    if (zH) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i13 |= i15;
                }
                if ((i13 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (lp2Var.N(i13 & 1, z3)) {
                    if (i23 != 0) {
                        gn2Var4 = null;
                    } else {
                        gn2Var4 = gn2Var2;
                    }
                    if (i7 != 0) {
                        i18 = 1;
                    } else {
                        i18 = i;
                    }
                    if (i9 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i11 != 0) {
                        i19 = 1;
                    } else {
                        i19 = i3;
                    }
                    if (i14 != 0) {
                        mxVar3 = null;
                    } else {
                        mxVar3 = mxVar;
                    }
                    vr3.k0(i19, i2);
                    if (lp2Var.j(q07.a) == null) {
                        c2.m();
                        return;
                    }
                    lp2Var.W(357055103);
                    lp2Var.p(false);
                    fi2Var = (fi2) lp2Var.j(y01.k);
                    executor = (Executor) lp2Var.j(f40.a);
                    if (executor == null) {
                        fi2Var2 = fi2Var;
                        lp2Var.W(-1248455541);
                        lp2Var.p(false);
                    } else {
                        fi2Var2 = fi2Var;
                        lp2Var.W(-1248455541);
                        lp2Var.p(false);
                    }
                    if (gn2Var4 == null) {
                        i20 = i19;
                        i21 = i18;
                        lp2Var.W(357432497);
                        gn2Var5 = gn2Var4;
                        z6 = true;
                        kx4VarY = Y(kx4Var, new ql(str), o88Var, gn2Var5, i21, z5, i2, i20, (fi2) lp2Var.j(y01.k), null, null, null, mxVar3);
                        lp2Var.p(false);
                    } else {
                        i20 = i19;
                        i21 = i18;
                        lp2Var.W(357432497);
                        gn2Var5 = gn2Var4;
                        z6 = true;
                        kx4VarY = Y(kx4Var, new ql(str), o88Var, gn2Var5, i21, z5, i2, i20, (fi2) lp2Var.j(y01.k), null, null, null, mxVar3);
                        lp2Var.p(false);
                    }
                    ld ldVar3 = ld.f;
                    int iHashCode3 = Long.hashCode(lp2Var.T);
                    kx4 kx4VarQ3 = w45.Q(lp2Var, kx4VarY);
                    kl5 kl5VarL3 = lp2Var.l();
                    uz0.j.getClass();
                    lp2Var.Z();
                    if (lp2Var.S) {
                        lp2Var.k();
                    } else {
                        lp2Var.j0();
                    }
                    pn7.m(pz2.B0, lp2Var, ldVar3);
                    pn7.m(pz2.A0, lp2Var, kl5VarL3);
                    pn7.l(lp2Var);
                    pn7.m(pz2.z0, lp2Var, kx4VarQ3);
                    pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode3));
                    lp2Var.p(z6);
                    z4 = z5;
                    i16 = i20;
                    mxVar2 = mxVar3;
                    i17 = i21;
                    gn2Var3 = gn2Var5;
                } else {
                    lp2Var.Q();
                    i16 = i3;
                    mxVar2 = mxVar;
                    gn2Var3 = gn2Var2;
                    z4 = z2;
                    i17 = i;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: y30
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        public final Object K(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            wl7.b(str, kx4Var, o88Var, gn2Var3, i17, z4, i2, i16, mxVar2, (lp2) obj, w79.P(i4 | 1), i5);
                            return dn8.a;
                        }
                    };
                }
            }
            i6 |= 196608;
            z2 = z;
            if ((1572864 & i4) == 0) {
                if (lp2Var.d(i2)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i6 |= i22;
            }
            i11 = i5 & 128;
            if (i11 != 0) {
                i6 |= 12582912;
            } else if ((i4 & 12582912) == 0) {
                if (lp2Var.d(i3)) {
                    i12 = XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW;
                } else {
                    i12 = 4194304;
                }
                i6 |= i12;
            }
            i13 = i6 | 100663296;
            i14 = i5 & 512;
            if (i14 != 0) {
                i13 = i6 | 905969664;
            } else if ((805306368 & i4) == 0) {
                if ((1073741824 & i4) == 0) {
                    zH = lp2Var.f(mxVar);
                } else {
                    zH = lp2Var.h(mxVar);
                }
                if (zH) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i13 |= i15;
            }
            if ((i13 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (lp2Var.N(i13 & 1, z3)) {
                if (i23 != 0) {
                    gn2Var4 = null;
                } else {
                    gn2Var4 = gn2Var2;
                }
                if (i7 != 0) {
                    i18 = 1;
                } else {
                    i18 = i;
                }
                if (i9 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i11 != 0) {
                    i19 = 1;
                } else {
                    i19 = i3;
                }
                if (i14 != 0) {
                    mxVar3 = null;
                } else {
                    mxVar3 = mxVar;
                }
                vr3.k0(i19, i2);
                if (lp2Var.j(q07.a) == null) {
                    c2.m();
                    return;
                }
                lp2Var.W(357055103);
                lp2Var.p(false);
                fi2Var = (fi2) lp2Var.j(y01.k);
                executor = (Executor) lp2Var.j(f40.a);
                if (executor == null) {
                    fi2Var2 = fi2Var;
                    lp2Var.W(-1248455541);
                    lp2Var.p(false);
                } else {
                    fi2Var2 = fi2Var;
                    lp2Var.W(-1248455541);
                    lp2Var.p(false);
                }
                if (gn2Var4 == null) {
                    i20 = i19;
                    i21 = i18;
                    lp2Var.W(357432497);
                    gn2Var5 = gn2Var4;
                    z6 = true;
                    kx4VarY = Y(kx4Var, new ql(str), o88Var, gn2Var5, i21, z5, i2, i20, (fi2) lp2Var.j(y01.k), null, null, null, mxVar3);
                    lp2Var.p(false);
                } else {
                    i20 = i19;
                    i21 = i18;
                    lp2Var.W(357432497);
                    gn2Var5 = gn2Var4;
                    z6 = true;
                    kx4VarY = Y(kx4Var, new ql(str), o88Var, gn2Var5, i21, z5, i2, i20, (fi2) lp2Var.j(y01.k), null, null, null, mxVar3);
                    lp2Var.p(false);
                }
                ld ldVar4 = ld.f;
                int iHashCode4 = Long.hashCode(lp2Var.T);
                kx4 kx4VarQ4 = w45.Q(lp2Var, kx4VarY);
                kl5 kl5VarL4 = lp2Var.l();
                uz0.j.getClass();
                lp2Var.Z();
                if (lp2Var.S) {
                    lp2Var.k();
                } else {
                    lp2Var.j0();
                }
                pn7.m(pz2.B0, lp2Var, ldVar4);
                pn7.m(pz2.A0, lp2Var, kl5VarL4);
                pn7.l(lp2Var);
                pn7.m(pz2.z0, lp2Var, kx4VarQ4);
                pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode4));
                lp2Var.p(z6);
                z4 = z5;
                i16 = i20;
                mxVar2 = mxVar3;
                i17 = i21;
                gn2Var3 = gn2Var5;
            } else {
                lp2Var.Q();
                i16 = i3;
                mxVar2 = mxVar;
                gn2Var3 = gn2Var2;
                z4 = z2;
                i17 = i;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new rn2() { // from class: y30
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final Object K(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        wl7.b(str, kx4Var, o88Var, gn2Var3, i17, z4, i2, i16, mxVar2, (lp2) obj, w79.P(i4 | 1), i5);
                        return dn8.a;
                    }
                };
            }
        }
        i6 |= 3072;
        gn2Var2 = gn2Var;
        i7 = i5 & 16;
        if (i7 != 0) {
            if ((i4 & 24576) == 0) {
                if (lp2Var.d(i)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i6 |= i8;
            }
            i9 = i5 & 32;
            if (i9 != 0) {
                if ((196608 & i4) == 0) {
                    z2 = z;
                    if (lp2Var.g(z2)) {
                        i10 = 131072;
                    } else {
                        i10 = 65536;
                    }
                    i6 |= i10;
                }
                if ((1572864 & i4) == 0) {
                    if (lp2Var.d(i2)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i6 |= i22;
                }
                i11 = i5 & 128;
                if (i11 != 0) {
                    i6 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    if (lp2Var.d(i3)) {
                        i12 = XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW;
                    } else {
                        i12 = 4194304;
                    }
                    i6 |= i12;
                }
                i13 = i6 | 100663296;
                i14 = i5 & 512;
                if (i14 != 0) {
                    i13 = i6 | 905969664;
                } else if ((805306368 & i4) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zH = lp2Var.f(mxVar);
                    } else {
                        zH = lp2Var.h(mxVar);
                    }
                    if (zH) {
                        i15 = 536870912;
                    } else {
                        i15 = 268435456;
                    }
                    i13 |= i15;
                }
                if ((i13 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (lp2Var.N(i13 & 1, z3)) {
                    if (i23 != 0) {
                        gn2Var4 = null;
                    } else {
                        gn2Var4 = gn2Var2;
                    }
                    if (i7 != 0) {
                        i18 = 1;
                    } else {
                        i18 = i;
                    }
                    if (i9 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i11 != 0) {
                        i19 = 1;
                    } else {
                        i19 = i3;
                    }
                    if (i14 != 0) {
                        mxVar3 = null;
                    } else {
                        mxVar3 = mxVar;
                    }
                    vr3.k0(i19, i2);
                    if (lp2Var.j(q07.a) == null) {
                        c2.m();
                        return;
                    }
                    lp2Var.W(357055103);
                    lp2Var.p(false);
                    fi2Var = (fi2) lp2Var.j(y01.k);
                    executor = (Executor) lp2Var.j(f40.a);
                    if (executor == null) {
                        fi2Var2 = fi2Var;
                        lp2Var.W(-1248455541);
                        lp2Var.p(false);
                    } else {
                        fi2Var2 = fi2Var;
                        lp2Var.W(-1248455541);
                        lp2Var.p(false);
                    }
                    if (gn2Var4 == null) {
                        i20 = i19;
                        i21 = i18;
                        lp2Var.W(357432497);
                        gn2Var5 = gn2Var4;
                        z6 = true;
                        kx4VarY = Y(kx4Var, new ql(str), o88Var, gn2Var5, i21, z5, i2, i20, (fi2) lp2Var.j(y01.k), null, null, null, mxVar3);
                        lp2Var.p(false);
                    } else {
                        i20 = i19;
                        i21 = i18;
                        lp2Var.W(357432497);
                        gn2Var5 = gn2Var4;
                        z6 = true;
                        kx4VarY = Y(kx4Var, new ql(str), o88Var, gn2Var5, i21, z5, i2, i20, (fi2) lp2Var.j(y01.k), null, null, null, mxVar3);
                        lp2Var.p(false);
                    }
                    ld ldVar5 = ld.f;
                    int iHashCode5 = Long.hashCode(lp2Var.T);
                    kx4 kx4VarQ5 = w45.Q(lp2Var, kx4VarY);
                    kl5 kl5VarL5 = lp2Var.l();
                    uz0.j.getClass();
                    lp2Var.Z();
                    if (lp2Var.S) {
                        lp2Var.k();
                    } else {
                        lp2Var.j0();
                    }
                    pn7.m(pz2.B0, lp2Var, ldVar5);
                    pn7.m(pz2.A0, lp2Var, kl5VarL5);
                    pn7.l(lp2Var);
                    pn7.m(pz2.z0, lp2Var, kx4VarQ5);
                    pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode5));
                    lp2Var.p(z6);
                    z4 = z5;
                    i16 = i20;
                    mxVar2 = mxVar3;
                    i17 = i21;
                    gn2Var3 = gn2Var5;
                } else {
                    lp2Var.Q();
                    i16 = i3;
                    mxVar2 = mxVar;
                    gn2Var3 = gn2Var2;
                    z4 = z2;
                    i17 = i;
                }
                j86VarR = lp2Var.r();
                if (j86VarR != null) {
                    j86VarR.d = new rn2() { // from class: y30
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        public final Object K(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            wl7.b(str, kx4Var, o88Var, gn2Var3, i17, z4, i2, i16, mxVar2, (lp2) obj, w79.P(i4 | 1), i5);
                            return dn8.a;
                        }
                    };
                }
            }
            i6 |= 196608;
            z2 = z;
            if ((1572864 & i4) == 0) {
                if (lp2Var.d(i2)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i6 |= i22;
            }
            i11 = i5 & 128;
            if (i11 != 0) {
                i6 |= 12582912;
            } else if ((i4 & 12582912) == 0) {
                if (lp2Var.d(i3)) {
                    i12 = XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW;
                } else {
                    i12 = 4194304;
                }
                i6 |= i12;
            }
            i13 = i6 | 100663296;
            i14 = i5 & 512;
            if (i14 != 0) {
                i13 = i6 | 905969664;
            } else if ((805306368 & i4) == 0) {
                if ((1073741824 & i4) == 0) {
                    zH = lp2Var.f(mxVar);
                } else {
                    zH = lp2Var.h(mxVar);
                }
                if (zH) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i13 |= i15;
            }
            if ((i13 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (lp2Var.N(i13 & 1, z3)) {
                if (i23 != 0) {
                    gn2Var4 = null;
                } else {
                    gn2Var4 = gn2Var2;
                }
                if (i7 != 0) {
                    i18 = 1;
                } else {
                    i18 = i;
                }
                if (i9 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i11 != 0) {
                    i19 = 1;
                } else {
                    i19 = i3;
                }
                if (i14 != 0) {
                    mxVar3 = null;
                } else {
                    mxVar3 = mxVar;
                }
                vr3.k0(i19, i2);
                if (lp2Var.j(q07.a) == null) {
                    c2.m();
                    return;
                }
                lp2Var.W(357055103);
                lp2Var.p(false);
                fi2Var = (fi2) lp2Var.j(y01.k);
                executor = (Executor) lp2Var.j(f40.a);
                if (executor == null) {
                    fi2Var2 = fi2Var;
                    lp2Var.W(-1248455541);
                    lp2Var.p(false);
                } else {
                    fi2Var2 = fi2Var;
                    lp2Var.W(-1248455541);
                    lp2Var.p(false);
                }
                if (gn2Var4 == null) {
                    i20 = i19;
                    i21 = i18;
                    lp2Var.W(357432497);
                    gn2Var5 = gn2Var4;
                    z6 = true;
                    kx4VarY = Y(kx4Var, new ql(str), o88Var, gn2Var5, i21, z5, i2, i20, (fi2) lp2Var.j(y01.k), null, null, null, mxVar3);
                    lp2Var.p(false);
                } else {
                    i20 = i19;
                    i21 = i18;
                    lp2Var.W(357432497);
                    gn2Var5 = gn2Var4;
                    z6 = true;
                    kx4VarY = Y(kx4Var, new ql(str), o88Var, gn2Var5, i21, z5, i2, i20, (fi2) lp2Var.j(y01.k), null, null, null, mxVar3);
                    lp2Var.p(false);
                }
                ld ldVar6 = ld.f;
                int iHashCode6 = Long.hashCode(lp2Var.T);
                kx4 kx4VarQ6 = w45.Q(lp2Var, kx4VarY);
                kl5 kl5VarL6 = lp2Var.l();
                uz0.j.getClass();
                lp2Var.Z();
                if (lp2Var.S) {
                    lp2Var.k();
                } else {
                    lp2Var.j0();
                }
                pn7.m(pz2.B0, lp2Var, ldVar6);
                pn7.m(pz2.A0, lp2Var, kl5VarL6);
                pn7.l(lp2Var);
                pn7.m(pz2.z0, lp2Var, kx4VarQ6);
                pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode6));
                lp2Var.p(z6);
                z4 = z5;
                i16 = i20;
                mxVar2 = mxVar3;
                i17 = i21;
                gn2Var3 = gn2Var5;
            } else {
                lp2Var.Q();
                i16 = i3;
                mxVar2 = mxVar;
                gn2Var3 = gn2Var2;
                z4 = z2;
                i17 = i;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new rn2() { // from class: y30
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final Object K(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        wl7.b(str, kx4Var, o88Var, gn2Var3, i17, z4, i2, i16, mxVar2, (lp2) obj, w79.P(i4 | 1), i5);
                        return dn8.a;
                    }
                };
            }
        }
        i6 |= 24576;
        i9 = i5 & 32;
        if (i9 != 0) {
            if ((196608 & i4) == 0) {
                z2 = z;
                if (lp2Var.g(z2)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i6 |= i10;
            }
            if ((1572864 & i4) == 0) {
                if (lp2Var.d(i2)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i6 |= i22;
            }
            i11 = i5 & 128;
            if (i11 != 0) {
                i6 |= 12582912;
            } else if ((i4 & 12582912) == 0) {
                if (lp2Var.d(i3)) {
                    i12 = XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW;
                } else {
                    i12 = 4194304;
                }
                i6 |= i12;
            }
            i13 = i6 | 100663296;
            i14 = i5 & 512;
            if (i14 != 0) {
                i13 = i6 | 905969664;
            } else if ((805306368 & i4) == 0) {
                if ((1073741824 & i4) == 0) {
                    zH = lp2Var.f(mxVar);
                } else {
                    zH = lp2Var.h(mxVar);
                }
                if (zH) {
                    i15 = 536870912;
                } else {
                    i15 = 268435456;
                }
                i13 |= i15;
            }
            if ((i13 & 306783379) != 306783378) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (lp2Var.N(i13 & 1, z3)) {
                if (i23 != 0) {
                    gn2Var4 = null;
                } else {
                    gn2Var4 = gn2Var2;
                }
                if (i7 != 0) {
                    i18 = 1;
                } else {
                    i18 = i;
                }
                if (i9 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i11 != 0) {
                    i19 = 1;
                } else {
                    i19 = i3;
                }
                if (i14 != 0) {
                    mxVar3 = null;
                } else {
                    mxVar3 = mxVar;
                }
                vr3.k0(i19, i2);
                if (lp2Var.j(q07.a) == null) {
                    c2.m();
                    return;
                }
                lp2Var.W(357055103);
                lp2Var.p(false);
                fi2Var = (fi2) lp2Var.j(y01.k);
                executor = (Executor) lp2Var.j(f40.a);
                if (executor == null) {
                    fi2Var2 = fi2Var;
                    lp2Var.W(-1248455541);
                    lp2Var.p(false);
                } else {
                    fi2Var2 = fi2Var;
                    lp2Var.W(-1248455541);
                    lp2Var.p(false);
                }
                if (gn2Var4 == null) {
                    i20 = i19;
                    i21 = i18;
                    lp2Var.W(357432497);
                    gn2Var5 = gn2Var4;
                    z6 = true;
                    kx4VarY = Y(kx4Var, new ql(str), o88Var, gn2Var5, i21, z5, i2, i20, (fi2) lp2Var.j(y01.k), null, null, null, mxVar3);
                    lp2Var.p(false);
                } else {
                    i20 = i19;
                    i21 = i18;
                    lp2Var.W(357432497);
                    gn2Var5 = gn2Var4;
                    z6 = true;
                    kx4VarY = Y(kx4Var, new ql(str), o88Var, gn2Var5, i21, z5, i2, i20, (fi2) lp2Var.j(y01.k), null, null, null, mxVar3);
                    lp2Var.p(false);
                }
                ld ldVar7 = ld.f;
                int iHashCode7 = Long.hashCode(lp2Var.T);
                kx4 kx4VarQ7 = w45.Q(lp2Var, kx4VarY);
                kl5 kl5VarL7 = lp2Var.l();
                uz0.j.getClass();
                lp2Var.Z();
                if (lp2Var.S) {
                    lp2Var.k();
                } else {
                    lp2Var.j0();
                }
                pn7.m(pz2.B0, lp2Var, ldVar7);
                pn7.m(pz2.A0, lp2Var, kl5VarL7);
                pn7.l(lp2Var);
                pn7.m(pz2.z0, lp2Var, kx4VarQ7);
                pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode7));
                lp2Var.p(z6);
                z4 = z5;
                i16 = i20;
                mxVar2 = mxVar3;
                i17 = i21;
                gn2Var3 = gn2Var5;
            } else {
                lp2Var.Q();
                i16 = i3;
                mxVar2 = mxVar;
                gn2Var3 = gn2Var2;
                z4 = z2;
                i17 = i;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new rn2() { // from class: y30
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    public final Object K(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        wl7.b(str, kx4Var, o88Var, gn2Var3, i17, z4, i2, i16, mxVar2, (lp2) obj, w79.P(i4 | 1), i5);
                        return dn8.a;
                    }
                };
            }
        }
        i6 |= 196608;
        z2 = z;
        if ((1572864 & i4) == 0) {
            if (lp2Var.d(i2)) {
                i22 = 1048576;
            } else {
                i22 = 524288;
            }
            i6 |= i22;
        }
        i11 = i5 & 128;
        if (i11 != 0) {
            i6 |= 12582912;
        } else if ((i4 & 12582912) == 0) {
            if (lp2Var.d(i3)) {
                i12 = XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW;
            } else {
                i12 = 4194304;
            }
            i6 |= i12;
        }
        i13 = i6 | 100663296;
        i14 = i5 & 512;
        if (i14 != 0) {
            i13 = i6 | 905969664;
        } else if ((805306368 & i4) == 0) {
            if ((1073741824 & i4) == 0) {
                zH = lp2Var.f(mxVar);
            } else {
                zH = lp2Var.h(mxVar);
            }
            if (zH) {
                i15 = 536870912;
            } else {
                i15 = 268435456;
            }
            i13 |= i15;
        }
        if ((i13 & 306783379) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (lp2Var.N(i13 & 1, z3)) {
            if (i23 != 0) {
                gn2Var4 = null;
            } else {
                gn2Var4 = gn2Var2;
            }
            if (i7 != 0) {
                i18 = 1;
            } else {
                i18 = i;
            }
            if (i9 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            if (i11 != 0) {
                i19 = 1;
            } else {
                i19 = i3;
            }
            if (i14 != 0) {
                mxVar3 = null;
            } else {
                mxVar3 = mxVar;
            }
            vr3.k0(i19, i2);
            if (lp2Var.j(q07.a) == null) {
                c2.m();
                return;
            }
            lp2Var.W(357055103);
            lp2Var.p(false);
            fi2Var = (fi2) lp2Var.j(y01.k);
            executor = (Executor) lp2Var.j(f40.a);
            if (executor == null) {
                fi2Var2 = fi2Var;
                lp2Var.W(-1248455541);
                lp2Var.p(false);
            } else {
                fi2Var2 = fi2Var;
                lp2Var.W(-1248455541);
                lp2Var.p(false);
            }
            if (gn2Var4 == null) {
                i20 = i19;
                i21 = i18;
                lp2Var.W(357432497);
                gn2Var5 = gn2Var4;
                z6 = true;
                kx4VarY = Y(kx4Var, new ql(str), o88Var, gn2Var5, i21, z5, i2, i20, (fi2) lp2Var.j(y01.k), null, null, null, mxVar3);
                lp2Var.p(false);
            } else {
                i20 = i19;
                i21 = i18;
                lp2Var.W(357432497);
                gn2Var5 = gn2Var4;
                z6 = true;
                kx4VarY = Y(kx4Var, new ql(str), o88Var, gn2Var5, i21, z5, i2, i20, (fi2) lp2Var.j(y01.k), null, null, null, mxVar3);
                lp2Var.p(false);
            }
            ld ldVar8 = ld.f;
            int iHashCode8 = Long.hashCode(lp2Var.T);
            kx4 kx4VarQ8 = w45.Q(lp2Var, kx4VarY);
            kl5 kl5VarL8 = lp2Var.l();
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(pz2.B0, lp2Var, ldVar8);
            pn7.m(pz2.A0, lp2Var, kl5VarL8);
            pn7.l(lp2Var);
            pn7.m(pz2.z0, lp2Var, kx4VarQ8);
            pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode8));
            lp2Var.p(z6);
            z4 = z5;
            i16 = i20;
            mxVar2 = mxVar3;
            i17 = i21;
            gn2Var3 = gn2Var5;
        } else {
            lp2Var.Q();
            i16 = i3;
            mxVar2 = mxVar;
            gn2Var3 = gn2Var2;
            z4 = z2;
            i17 = i;
        }
        j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: y30
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wl7.b(str, kx4Var, o88Var, gn2Var3, i17, z4, i2, i16, mxVar2, (lp2) obj, w79.P(i4 | 1), i5);
                    return dn8.a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final String b0(int i, String str) {
        byte[] bytes = str.getBytes(iq0.a);
        bytes.getClass();
        String strEncodeToString = Base64.encodeToString(bytes, i);
        strEncodeToString.getClass();
        return strEncodeToString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void c(boolean z, boolean z2, dn2 dn2Var, lp2 lp2Var, int i, int i2) {
        boolean z3 = (i2 & 4) != 0 ? true : z2;
        ox1 ox1Var = ep.z;
        long j = ((dp) lp2Var.j(ox1Var)).f.a;
        long j2 = ((dp) lp2Var.j(ox1Var)).f.a;
        long j3 = ((dp) lp2Var.j(ox1Var)).f.b;
        long j4 = ((dp) lp2Var.j(ox1Var)).f.b;
        iw0 iw0Var = (iw0) lp2Var.j(kw0.a);
        j66 j66Var = iw0Var.Z;
        if (j66Var == null) {
            j66 j66Var2 = new j66(kw0.b(iw0Var, oc.q), kw0.b(iw0Var, oc.s), dw0.b(0.38f, kw0.b(iw0Var, oc.n)), dw0.b(0.38f, kw0.b(iw0Var, oc.o)));
            iw0Var.Z = j66Var2;
            j66Var = j66Var2;
        }
        long j5 = j != 16 ? j : j66Var.a;
        if (j2 == 16) {
            j2 = j66Var.b;
        }
        long j6 = j2;
        if (j3 == 16) {
            j3 = j66Var.c;
        }
        long j7 = j3;
        if (j4 == 16) {
            j4 = j66Var.d;
        }
        int i3 = i << 3;
        hi5.M(z, dn2Var, hx4.X, z3, new j66(j5, j6, j7, j4), lp2Var, (i & 14) | ((i >> 6) & 112) | (i3 & 896) | (i3 & 7168));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static byte[] c0(u91 u91Var) {
        u91Var.getClass();
        HashMap map = u91Var.a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    d0(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                byteArray.getClass();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    oc.h(dataOutputStream, th);
                    throw th2;
                }
            }
        } catch (IOException unused) {
            int i = kb1.a;
            lh4.P0().getClass();
            return new byte[0];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:157:0x01ff  */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r3v34 */
    public static final void d(final kx4 kx4Var, final ql qlVar, final gn2 gn2Var, final boolean z, final Map map, final o88 o88Var, final int i, final boolean z2, final int i2, final int i3, final fi2 fi2Var, final gn2 gn2Var2, final mx mxVar, lp2 lp2Var, final int i4, final int i5) {
        b88 b88Var;
        dn2 dn2Var;
        qg5 qg5Var;
        gn2 gn2Var3;
        gn2 gn2Var4;
        cb4 yfVar;
        boolean z3;
        ?? r3;
        ArrayList arrayList;
        lp2Var.X(-2118572703);
        int i6 = (i4 & 6) == 0 ? (lp2Var.f(kx4Var) ? 4 : 2) | i4 : i4;
        if ((i4 & 48) == 0) {
            i6 |= lp2Var.f(qlVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= lp2Var.h(gn2Var) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= lp2Var.g(z) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= lp2Var.h(map) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i6 |= lp2Var.f(o88Var) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i6 |= lp2Var.d(i) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i6 |= lp2Var.g(z2) ? XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i6 |= lp2Var.d(i2) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i6 |= lp2Var.d(i3) ? 536870912 : 268435456;
        }
        int i7 = (i5 & 6) == 0 ? i5 | (lp2Var.h(fi2Var) ? 4 : 2) : i5;
        int i8 = i6;
        if ((i5 & 48) == 0) {
            i7 |= lp2Var.h((Object) null) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= lp2Var.h((Object) null) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= lp2Var.h(gn2Var2) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= (32768 & i5) == 0 ? lp2Var.f(mxVar) : lp2Var.h(mxVar) ? 16384 : 8192;
        }
        if (lp2Var.N(i8 & 1, ((i8 & 306783379) == 306783378 && (i7 & 9363) == 9362) ? false : true)) {
            boolean zI = u28.i(qlVar);
            Object obj = zz0.a;
            if (zI) {
                lp2Var.W(145641571);
                boolean z4 = (i8 & 112) == 32;
                Object objK = lp2Var.K();
                if (z4 || objK == obj) {
                    objK = new b88(qlVar);
                    lp2Var.g0(objK);
                }
                lp2Var.p(false);
                b88Var = (b88) objK;
            } else {
                lp2Var.W(145707228);
                lp2Var.p(false);
                b88Var = null;
            }
            if (u28.i(qlVar)) {
                lp2Var.W(145905443);
                boolean zF = ((i8 & 112) == 32) | lp2Var.f(b88Var);
                Object objK2 = lp2Var.K();
                if (zF || objK2 == obj) {
                    objK2 = new p5(b88Var, qlVar, (byte) 10);
                    lp2Var.g0(objK2);
                }
                dn2Var = (dn2) objK2;
                lp2Var.p(false);
            } else {
                lp2Var.W(146002721);
                boolean z5 = (i8 & 112) == 32;
                Object objK3 = lp2Var.K();
                if (z5 || objK3 == obj) {
                    objK3 = new o7(qlVar, (byte) 11);
                    lp2Var.g0(objK3);
                }
                dn2Var = (dn2) objK3;
                lp2Var.p(false);
            }
            if (z) {
                if (map != null) {
                    qg5 qg5Var2 = tl.a;
                    if (map.isEmpty()) {
                        dn2Var = dn2Var;
                        qg5Var = tl.a;
                    } else {
                        int length = qlVar.Y.length();
                        List list = qlVar.X;
                        if (list != null) {
                            arrayList = new ArrayList(list.size());
                            int size = list.size();
                            int i9 = 0;
                            while (i9 < size) {
                                List list2 = list;
                                pl plVar = (pl) list.get(i9);
                                int i10 = size;
                                Object obj2 = plVar.a;
                                int i11 = i9;
                                int i12 = plVar.c;
                                int i13 = plVar.b;
                                String str = plVar.d;
                                if ((obj2 instanceof ul7) && "androidx.compose.foundation.text.inlineContent".equals(str) && rl.b(0, length, i13, i12)) {
                                    Object obj3 = plVar.a;
                                    obj3.getClass();
                                    arrayList.add(new pl(str, i13, i12, ((ul7) obj3).a));
                                }
                                i9 = i11 + 1;
                                size = i10;
                                list = list2;
                            }
                        } else {
                            arrayList = d02.X;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        int size2 = arrayList.size();
                        for (int i14 = 0; i14 < size2; i14++) {
                            if (map.get(((pl) arrayList.get(i14)).a) != null) {
                                c2.m();
                                return;
                            }
                        }
                        qg5Var = new qg5(arrayList2, arrayList3);
                    }
                } else {
                    dn2Var = dn2Var;
                    qg5Var = tl.a;
                }
                gn2Var3 = null;
            } else {
                b88Var = b88Var;
                dn2Var = dn2Var;
                gn2Var3 = null;
                qg5Var = new qg5((Object) null, (Object) null);
            }
            List list3 = (List) qg5Var.X;
            List list4 = (List) qg5Var.Y;
            if (z) {
                lp2Var.W(146318828);
                Object objK4 = lp2Var.K();
                if (objK4 == obj) {
                    objK4 = z51.H(gn2Var3);
                    lp2Var.g0(objK4);
                }
                lp2Var.p(false);
                gn2Var4 = (y05) objK4;
            } else {
                lp2Var.W(146406588);
                lp2Var.p(false);
                gn2Var4 = gn2Var3;
            }
            if (z) {
                lp2Var.W(146499837);
                boolean zF2 = lp2Var.f(gn2Var4);
                Object objK5 = lp2Var.K();
                if (zF2 || objK5 == obj) {
                    objK5 = new gh(gn2Var4, (byte) 3);
                    lp2Var.g0(objK5);
                }
                gn2Var3 = (gn2) objK5;
                lp2Var.p(false);
            } else {
                lp2Var.W(146571260);
                lp2Var.p(false);
            }
            gn2 gn2Var5 = gn2Var3;
            int i15 = (i8 >> 3) & 14;
            gn2 gn2Var6 = gn2Var4;
            b88 b88Var2 = b88Var;
            f40.a(qlVar, o88Var, fi2Var, list3, z2, lp2Var);
            ql qlVar2 = (ql) dn2Var.invoke();
            boolean zH = lp2Var.h(b88Var2) | ((i8 & 896) == 256);
            Object objK6 = lp2Var.K();
            if (zH || objK6 == obj) {
                objK6 = new a40(b88Var2, gn2Var, (byte) 0);
                lp2Var.g0(objK6);
            }
            kx4 kx4VarY = Y(kx4Var, qlVar2, o88Var, (gn2) objK6, i, z2, i2, i3, fi2Var, list3, gn2Var5, gn2Var2, mxVar);
            if (z) {
                lp2Var.W(147956465);
                boolean zH2 = lp2Var.h(b88Var2);
                Object objK7 = lp2Var.K();
                if (zH2 || objK7 == obj) {
                    objK7 = new b40(b88Var2, (byte) 1);
                    lp2Var.g0(objK7);
                }
                dn2 dn2Var2 = (dn2) objK7;
                boolean zF3 = lp2Var.f(gn2Var6);
                Object objK8 = lp2Var.K();
                if (zF3 || objK8 == obj) {
                    objK8 = new eh(gn2Var6, (byte) 2);
                    lp2Var.g0(objK8);
                }
                yfVar = new yf(dn2Var2, (dn2) objK8, (byte) 1);
                lp2Var.p(false);
            } else {
                lp2Var.W(147779703);
                boolean zH3 = lp2Var.h(b88Var2);
                Object objK9 = lp2Var.K();
                if (zH3 || objK9 == obj) {
                    r3 = 0;
                    objK9 = new b40(b88Var2, (byte) 0);
                    lp2Var.g0(objK9);
                } else {
                    r3 = 0;
                }
                yfVar = new cb4((dn2) objK9, (byte) r3);
                lp2Var.p((boolean) r3);
            }
            int iHashCode = Long.hashCode(lp2Var.T);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, kx4VarY);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(pz2.B0, lp2Var, yfVar);
            pn7.m(pz2.A0, lp2Var, kl5VarL);
            pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode));
            pn7.l(lp2Var);
            pn7.m(pz2.z0, lp2Var, kx4VarQ);
            if (b88Var2 == null) {
                lp2Var.W(-433557001);
                z3 = false;
            } else {
                z3 = false;
                lp2Var.W(-291080374);
                b88Var2.a(0, lp2Var);
            }
            lp2Var.p(z3);
            if (list4 == null) {
                lp2Var.W(-433506223);
            } else {
                lp2Var.W(-433506222);
                tl.a(qlVar, list4, lp2Var, i15);
            }
            lp2Var.p(z3);
            lp2Var.p(true);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: c40
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final Object K(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int iP = w79.P(i4 | 1);
                    int iP2 = w79.P(i5);
                    kx4 kx4Var2 = kx4Var;
                    ql qlVar3 = qlVar;
                    gn2 gn2Var7 = gn2Var;
                    boolean z6 = z;
                    Map map2 = map;
                    o88 o88Var2 = o88Var;
                    byte b2 = i;
                    boolean z7 = z2;
                    int i16 = i2;
                    boolean z8 = i3;
                    fi2 fi2Var2 = fi2Var;
                    gn2 gn2Var8 = gn2Var2;
                    mx mxVar2 = mxVar;
                    wl7.d(kx4Var2, qlVar3, gn2Var7, z6, map2, o88Var2, b2, z7, i16, z8 ? 1 : 0, fi2Var2, gn2Var8, mxVar2, (lp2) obj4, iP, iP2);
                    return dn8.a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void d0(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
        int i;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                bt.q(oi0.l("Unsupported value type ", yb6.a.b(obj.getClass()).E()));
                return;
            }
            Object[] objArr = (Object[]) obj;
            Class<?> cls = objArr.getClass();
            zb6 zb6Var = yb6.a;
            zu3 zu3VarB = zb6Var.b(cls);
            if (zu3VarB.equals(zb6Var.b(Boolean[].class))) {
                i = 8;
            } else if (zu3VarB.equals(zb6Var.b(Byte[].class))) {
                i = 9;
            } else if (zu3VarB.equals(zb6Var.b(Integer[].class))) {
                i = 10;
            } else if (zu3VarB.equals(zb6Var.b(Long[].class))) {
                i = 11;
            } else if (zu3VarB.equals(zb6Var.b(Float[].class))) {
                i = 12;
            } else if (zu3VarB.equals(zb6Var.b(Double[].class))) {
                i = 13;
            } else {
                if (!zu3VarB.equals(zb6Var.b(String[].class))) {
                    bt.q(oi0.l("Unsupported value type ", zb6Var.b(objArr.getClass()).p()));
                    return;
                }
                i = 14;
            }
            dataOutputStream.writeByte(i);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i == 9) {
                    Byte b2 = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b2 != null ? b2.byteValue() : (byte) 0);
                } else if (i == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i == 11) {
                    Long l = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                } else if (i == 12) {
                    Float f2 = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f2 != null ? f2.floatValue() : 0.0f);
                } else if (i == 13) {
                    Double d2 = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d2 != null ? d2.doubleValue() : 0.0d);
                } else if (i == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v29 */
    public static final void e(lg4 lg4Var, gn2 gn2Var, j74 j74Var, gg5 gg5Var, oh2 oh2Var, kx4 kx4Var, lp2 lp2Var, int i) {
        int i2;
        ?? r11;
        lp2Var.X(1950854297);
        if ((i & 6) == 0) {
            i2 = (lp2Var.f(lg4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.h(gn2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.f(j74Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= lp2Var.f(gg5Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= lp2Var.f(oh2Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= lp2Var.f(kx4Var) ? 131072 : 65536;
        }
        if (lp2Var.N(i2 & 1, (74899 & i2) != 74898)) {
            z24 z24Var = (z24) lp2Var.j(y01.n);
            boolean zT = oc.t(lp2Var);
            float fS = os4.S(60.0f, lp2Var);
            Object objK = lp2Var.K();
            Object obj = zz0.a;
            if (objK == obj) {
                objK = z51.H(Boolean.FALSE);
                lp2Var.g0(objK);
            }
            y05 y05Var = (y05) objK;
            Object objK2 = lp2Var.K();
            if (objK2 == obj) {
                objK2 = u70.D(lp2Var);
                lp2Var.g0(objK2);
            }
            b71 b71Var = (b71) objK2;
            Boolean boolValueOf = Boolean.valueOf(zT);
            boolean zG = lp2Var.g(zT) | ((i2 & 57344) == 16384);
            Object objK3 = lp2Var.K();
            if (zG || objK3 == obj) {
                objK3 = new r5(zT, oh2Var, (q51) null);
                lp2Var.g0(objK3);
            }
            u70.h((rn2) objK3, lp2Var, boolValueOf);
            Integer numValueOf = Integer.valueOf(lg4Var.c);
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objK4 = lp2Var.K();
            if (z || objK4 == obj) {
                objK4 = new r5(j74Var, (q51) null, (byte) 20);
                lp2Var.g0(objK4);
            }
            u70.h((rn2) objK4, lp2Var, numValueOf);
            kx4 kx4VarA = os4.A(u15.f(kx4Var, ys0.y(lp2Var).b.b, u70.e), os4.h(gg5Var, z24Var), 0.0f, os4.g(gg5Var, z24Var), 0.0f, 10);
            tw0 tw0VarA = rw0.a(ht.c, pz2.q0, lp2Var, 0);
            int iHashCode = Long.hashCode(lp2Var.T);
            kl5 kl5VarL = lp2Var.l();
            kx4 kx4VarQ = w45.Q(lp2Var, kx4VarA);
            uz0.j.getClass();
            lp2Var.Z();
            if (lp2Var.S) {
                lp2Var.k();
            } else {
                lp2Var.j0();
            }
            pn7.m(pz2.B0, lp2Var, tw0VarA);
            pn7.m(pz2.A0, lp2Var, kl5VarL);
            pn7.m(pz2.C0, lp2Var, Integer.valueOf(iHashCode));
            pn7.l(lp2Var);
            pn7.m(pz2.z0, lp2Var, kx4VarQ);
            ch3.f(lp2Var, b.b(hx4.X, gg5Var.d()));
            gg4 gg4Var = lg4Var.a;
            String strJ0 = gg4Var != null ? gg4Var.b : null;
            if (strJ0 == null) {
                lp2Var.W(222153030);
                strJ0 = vj8.j0(y46.title_logs, lp2Var);
                r11 = 0;
            } else {
                r11 = 0;
                lp2Var.W(222152131);
            }
            lp2Var.p((boolean) r11);
            FillElement fillElement = b.a;
            oc.b(strJ0, os4.w(fillElement, ((gr) lp2Var.j(hr.a)).a.b), lp2Var, (int) r11);
            if (lg4Var.g) {
                lp2Var.W(-1703008969);
                w45.e(lg4Var, gn2Var, ch3.u(new r03(pz2.r0)), lp2Var, i2 & 126);
                lp2Var.p(false);
            } else {
                lp2Var.W(-1702755265);
                lp2Var.p(false);
            }
            ig5 ig5VarE = os4.e(2, gg5Var.a() + 32.0f);
            lp2Var.W(222210555);
            lp2Var.W(222184508);
            kx4 kx4VarY = fillElement.y(new d44(1.0f, true));
            if (zT != 0) {
                kx4VarY = os4.x(kx4VarY, 16.0f);
            }
            kx4 kx4VarI = zc1.I(kx4VarY, oh2Var);
            Object objK5 = lp2Var.K();
            if (objK5 == obj) {
                objK5 = new gh(y05Var, (byte) 8);
                lp2Var.g0(objK5);
            }
            kx4 kx4VarJ = z51.J(kx4VarI, (gn2) objK5);
            if (zT != 0) {
                boolean zH = (i3 == 256) | lp2Var.h(b71Var) | lp2Var.c(fS);
                Object objK6 = lp2Var.K();
                if (zH || objK6 == obj) {
                    objK6 = new xh4(j74Var, b71Var, fS);
                    lp2Var.g0(objK6);
                }
                kx4VarJ = mb6.T(kx4VarJ, (gn2) objK6);
            }
            lp2Var.p(false);
            if (zT != 0 && ((Boolean) y05Var.getValue()).booleanValue()) {
                ox1 ox1Var = ur.a;
                kx4VarJ = u15.f(kx4VarJ.y(new o97(((tr) lp2Var.j(ox1Var)).c.a, new s67(12.0f, 56, dw0.b(0.55f, ys0.y(lp2Var).a)))), ys0.y(lp2Var).b.b, ((tr) lp2Var.j(ox1Var)).c.a).y(new c70(2.0f, new fe7(ys0.y(lp2Var).a), ((tr) lp2Var.j(ox1Var)).c.a));
            }
            lp2Var.p(false);
            kx4 kx4VarV = ch3.v(kx4VarJ, zT, (xz4) null);
            boolean z2 = (i2 & 14) == 4;
            Object objK7 = lp2Var.K();
            if (z2 || objK7 == obj) {
                objK7 = new vj2(lg4Var, (byte) 16);
                lp2Var.g0(objK7);
            }
            jb5.a(kx4VarV, j74Var, 0.0f, ig5VarE, (gt) null, (p8) null, (he2) null, false, (td) null, false, (gn2) objK7, lp2Var, (i2 >> 3) & 112, 2036);
            lp2Var.p(true);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new wu(lg4Var, gn2Var, j74Var, gg5Var, oh2Var, kx4Var, i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Editable e0(String str) {
        str.getClass();
        Editable editableNewEditable = Editable.Factory.getInstance().newEditable(str);
        editableNewEditable.getClass();
        return editableNewEditable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void f(ci4 ci4Var, kx4 kx4Var, lp2 lp2Var, int i) {
        ci4Var.getClass();
        lp2Var.X(-1808542755);
        y05 y05VarO = i21.o(ci4Var.d, lp2Var);
        boolean zH = lp2Var.h(ci4Var);
        Object objK = lp2Var.K();
        be beVar = zz0.a;
        if (zH || objK == beVar) {
            d0 d0Var = new d0(1, ci4Var, ci4.class, "onUiIntent", "onUiIntent(Lsu/happ/proxyutility/feature/logs/view/LogViewSettingsUiIntent;)V", 0, (byte) 23);
            lp2Var.g0(d0Var);
            objK = d0Var;
        }
        pv3 pv3Var = (pv3) objK;
        ng4 ng4Var = (ng4) y05VarO.getValue();
        lg4 lg4Var = ng4Var instanceof lg4 ? (lg4) ng4Var : null;
        j74 j74VarA = l74.a(lp2Var);
        Object objK2 = lp2Var.K();
        if (objK2 == beVar) {
            objK2 = new oh2();
            lp2Var.g0(objK2);
        }
        oh2 oh2Var = (oh2) objK2;
        n84 n84Var = n84.ON_RESUME;
        boolean zF = lp2Var.f(pv3Var);
        Object objK3 = lp2Var.K();
        if (zF || objK3 == beVar) {
            objK3 = new aa3(pv3Var, (byte) 1);
            lp2Var.g0(objK3);
        }
        yn0.i(n84Var, (d94) null, (dn2) objK3, lp2Var, 6);
        sx2.b(kx4Var, jm4.U(-199933984, new i9(lg4Var, pv3Var, (byte) 21), lp2Var), (rn2) null, (rn2) null, 0, 0L, (v09) null, jm4.U(-1774784009, new df4(lg4Var, ci4Var, j74VarA, pv3Var, oh2Var, y05VarO), lp2Var), lp2Var, 12582966);
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new i9((byte) 22, i, ci4Var, kx4Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int[] f0(String str) {
        List listE0 = fm7.E0(str, new char[]{'.'});
        ArrayList arrayList = new ArrayList();
        Iterator it = listE0.iterator();
        while (it.hasNext()) {
            Integer numB0 = mm7.b0((String) it.next());
            if (numB0 != null) {
                arrayList.add(numB0);
            }
        }
        if (arrayList.size() != 4) {
            arrayList = null;
        }
        if (arrayList != null) {
            return wv0.X0(arrayList);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void g(final y68 y68Var, final kx4 kx4Var, boolean z, final o88 o88Var, q58 q58Var, final sn2 sn2Var, final boolean z2, final de3 de3Var, final wx3 wx3Var, final w58 w58Var, ay6 ay6Var, x67 x67Var, final i48 i48Var, gg5 gg5Var, lp2 lp2Var, final int i, final int i2) {
        int i3;
        sn2 sn2Var2;
        wx3 wx3Var2;
        w58 w58Var2;
        final boolean z3;
        final q58 q58Var2;
        final ay6 ay6Var2;
        final x67 x67Var2;
        final gg5 gg5Var2;
        q58 q58Var3;
        ay6 ay6VarG;
        x67 x67VarB;
        gg5 ig5Var;
        long j;
        boolean z4;
        lp2Var.X(-2007078942);
        if ((i & 6) == 0) {
            i3 = (lp2Var.f(y68Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= lp2Var.f(kx4Var) ? 32 : 16;
        }
        int i4 = i3 | 3456;
        if ((i & 24576) == 0) {
            i4 |= lp2Var.f(o88Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i4 |= 65536;
        }
        if ((i & 1572864) == 0) {
            sn2Var2 = sn2Var;
            i4 |= lp2Var.h(sn2Var2) ? 1048576 : 524288;
        } else {
            sn2Var2 = sn2Var;
        }
        int i5 = i4 | 12582912;
        if ((i & 100663296) == 0) {
            i5 |= lp2Var.h((Object) null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i5 |= lp2Var.h((Object) null) ? 536870912 : 268435456;
        }
        int i6 = i2 | 54;
        if ((i2 & 384) == 0) {
            i6 |= lp2Var.h((Object) null) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i6 |= lp2Var.g(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i6 |= lp2Var.f(de3Var) ? 16384 : 8192;
        }
        int i7 = i6 | 196608;
        if ((i2 & 1572864) == 0) {
            wx3Var2 = wx3Var;
            i7 |= lp2Var.f(wx3Var2) ? 1048576 : 524288;
        } else {
            wx3Var2 = wx3Var;
        }
        int i8 = i7 | 12582912;
        if ((i2 & 100663296) == 0) {
            w58Var2 = w58Var;
            i8 |= lp2Var.f(w58Var2) ? 67108864 : 33554432;
        } else {
            w58Var2 = w58Var;
        }
        boolean z5 = true;
        if (lp2Var.N(i5 & 1, ((i5 & 306783379) == 306783378 && ((i8 | 805306368) & 306783379) == 306783378 && (((lp2Var.f(i48Var) ? (char) 256 : (char) 128) | 25618) & 9363) == 9362) ? false : true)) {
            lp2Var.S();
            if ((i & 1) == 0 || lp2Var.x()) {
                q58Var3 = new q58();
                ay6VarG = dh3.G(lp2Var);
                x67VarB = q77.b(nr4.g, lp2Var);
                ig5Var = new ig5(16.0f, 16.0f, 16.0f, 16.0f);
            } else {
                lp2Var.Q();
                z5 = z;
                q58Var3 = q58Var;
                ay6VarG = ay6Var;
                x67VarB = x67Var;
                ig5Var = gg5Var;
            }
            lp2Var.q();
            lp2Var.W(1647415065);
            Object objK = lp2Var.K();
            if (objK == zz0.a) {
                objK = new xz4();
                lp2Var.g0(objK);
            }
            xz4 xz4Var = (xz4) objK;
            lp2Var.p(false);
            lp2Var.W(-362494116);
            long jB = o88Var.b();
            if (jB != 16) {
                z4 = false;
            } else {
                boolean zBooleanValue = ((Boolean) km4.s(xz4Var, lp2Var, 0).getValue()).booleanValue();
                if (z5) {
                    if (z2) {
                        j = i48Var.d;
                    } else {
                        j = zBooleanValue ? i48Var.a : i48Var.b;
                    }
                    jB = j;
                } else {
                    jB = i48Var.c;
                }
                z4 = false;
            }
            long j2 = jB;
            lp2Var.p(z4);
            sn2 sn2Var3 = sn2Var2;
            w58 w58Var3 = w58Var2;
            boolean z6 = z5;
            mb6.a(i88.a.a(i48Var.k), jm4.U(-416142558, new ie5(kx4Var, sn2Var3, q58Var3, z2, i48Var, y68Var, z6, w58Var3, xz4Var, ig5Var, de3Var, o88Var.d(new o88(j2, 0L, (dj2) null, (bj2) null, 0L, 0, 0, 0L, 16777214)), wx3Var2, ay6VarG, x67VarB), lp2Var), lp2Var, 56);
            q58Var2 = q58Var3;
            z3 = z6;
            gg5Var2 = ig5Var;
            ay6Var2 = ay6VarG;
            x67Var2 = x67VarB;
        } else {
            lp2Var.Q();
            z3 = z;
            q58Var2 = q58Var;
            ay6Var2 = ay6Var;
            x67Var2 = x67Var;
            gg5Var2 = gg5Var;
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: ge5
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = w79.P(i | 1);
                    int iP2 = w79.P(i2);
                    wl7.g(y68Var, kx4Var, z3, o88Var, q58Var2, sn2Var, z2, de3Var, wx3Var, w58Var, ay6Var2, x67Var2, i48Var, gg5Var2, (lp2) obj, iP, iP2);
                    return dn8.a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String g0(int i) {
        return "OperatingMode(mode=" + i + ')';
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:258:0x053c  */
    /* JADX WARN: Code duplicated, block: B:261:0x0577  */
    /* JADX WARN: Code duplicated, block: B:262:0x057b  */
    /* JADX WARN: Code duplicated, block: B:267:0x0596  */
    public static final void h(final zy0 zy0Var, sn2 sn2Var, rn2 rn2Var, final rn2 rn2Var2, final rn2 rn2Var3, rn2 rn2Var4, final rn2 rn2Var5, final boolean z, final q58 q58Var, o58 o58Var, final gn2 gn2Var, final zy0 zy0Var2, rn2 rn2Var6, final gg5 gg5Var, lp2 lp2Var, final int i, final int i2) {
        int i3;
        int i4;
        sn2 sn2Var2;
        rn2 rn2Var7;
        rn2 rn2Var8;
        lp2 lp2Var2;
        rn2 rn2Var9;
        p50 p50Var;
        boolean z2;
        p50 p50Var2;
        float f2;
        rn2 rn2Var10;
        boolean z3;
        boolean z4;
        Object objK;
        int I;
        final o58 o58Var2 = o58Var;
        p50 p50Var3 = pz2.i0;
        p50 p50Var4 = pz2.Z;
        lp2Var.X(753699262);
        int i5 = i & 6;
        hx4 hx4Var = hx4.X;
        if (i5 == 0) {
            i3 = i | (lp2Var.f(hx4Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= lp2Var.h(zy0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= lp2Var.h(sn2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= lp2Var.h(rn2Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= lp2Var.h(rn2Var2) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= lp2Var.h(rn2Var3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= lp2Var.h(rn2Var4) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= lp2Var.h(rn2Var5) ? XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= lp2Var.g(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= lp2Var.f(q58Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | ((i2 & 8) == 0 ? lp2Var.f(o58Var2) : lp2Var.h(o58Var2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= lp2Var.h(gn2Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= lp2Var.h(zy0Var2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= lp2Var.h(rn2Var6) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= lp2Var.f(gg5Var) ? 16384 : 8192;
        }
        int i6 = i4;
        if (lp2Var.N(i3 & 1, ((i3 & 306783379) == 306783378 && (i6 & 9363) == 9362) ? false : true)) {
            float fN = pn7.n(lp2Var);
            int i7 = i6 & 14;
            boolean zC = ((i6 & 57344) == 16384) | ((i6 & 112) == 32) | ((i3 & 234881024) == 67108864) | ((i3 & 1879048192) == 536870912) | (i7 == 4 || ((i6 & 8) != 0 && lp2Var.f(o58Var2))) | lp2Var.c(fN);
            Object objK2 = lp2Var.K();
            be beVar = zz0.a;
            if (zC || objK2 == beVar) {
                p50Var = p50Var3;
                lp2Var2 = lp2Var;
                ke5 ke5Var = new ke5(gn2Var, z, q58Var, o58Var2, gg5Var, fN);
                lp2Var2.g0(ke5Var);
                objK2 = ke5Var;
            } else {
                p50Var = p50Var3;
                lp2Var2 = lp2Var;
            }
            ke5 ke5Var2 = (ke5) objK2;
            z24 z24Var = (z24) lp2Var2.j(y01.n);
            int I2 = km4.I(lp2Var2);
            kl5 kl5VarL = lp2Var2.l();
            kx4 kx4VarQ = w45.Q(lp2Var2, (kx4) r21);
            uz0.j.getClass();
            lp2Var2.Z();
            if (lp2Var2.S) {
                lp2Var2.k();
            } else {
                lp2Var2.j0();
            }
            dx0 dx0Var = pz2.B0;
            pn7.m(dx0Var, lp2Var2, ke5Var2);
            dx0 dx0Var2 = pz2.A0;
            pn7.m(dx0Var2, lp2Var2, kl5VarL);
            dx0 dx0Var3 = pz2.C0;
            if (lp2Var2.S || !dh3.f(lp2Var2.K(), Integer.valueOf(I2))) {
                p61.v(I2, lp2Var2, I2, dx0Var3);
            }
            dx0 dx0Var4 = pz2.z0;
            pn7.m(dx0Var4, lp2Var2, kx4VarQ);
            zy0Var2.K(lp2Var2, Integer.valueOf((i6 >> 6) & 14));
            xv4 xv4Var = xv4.X;
            if (rn2Var2 != null) {
                lp2Var2.W(2145628269);
                kx4 kx4VarY = x97.O(hx4Var, "Leading").y(xv4Var);
                xr4 xr4VarC = g80.c(p50Var, false);
                int I3 = km4.I(lp2Var2);
                kl5 kl5VarL2 = lp2Var2.l();
                kx4 kx4VarQ2 = w45.Q(lp2Var2, kx4VarY);
                lp2Var2.Z();
                if (lp2Var2.S) {
                    lp2Var2.k();
                } else {
                    lp2Var2.j0();
                }
                pn7.m(dx0Var, lp2Var2, xr4VarC);
                pn7.m(dx0Var2, lp2Var2, kl5VarL2);
                if (lp2Var2.S || !dh3.f(lp2Var2.K(), Integer.valueOf(I3))) {
                    p61.v(I3, lp2Var2, I3, dx0Var3);
                }
                pn7.m(dx0Var4, lp2Var2, kx4VarQ2);
                rn2Var2.K(lp2Var2, Integer.valueOf((i3 >> 12) & 14));
                lp2Var2.p(true);
                z2 = false;
                lp2Var2.p(false);
            } else {
                z2 = false;
                lp2Var2.W(2145874285);
                lp2Var2.p(false);
            }
            if (rn2Var3 != null) {
                lp2Var2.W(2145917003);
                kx4 kx4VarY2 = x97.O((kx4) r21, "Trailing").y(xv4Var);
                xr4 xr4VarC2 = g80.c(p50Var, z2);
                int I4 = km4.I(lp2Var2);
                kl5 kl5VarL3 = lp2Var2.l();
                kx4 kx4VarQ3 = w45.Q(lp2Var2, kx4VarY2);
                lp2Var2.Z();
                if (lp2Var2.S) {
                    lp2Var2.k();
                } else {
                    lp2Var2.j0();
                }
                pn7.m(dx0Var, lp2Var2, xr4VarC2);
                pn7.m(dx0Var2, lp2Var2, kl5VarL3);
                if (lp2Var2.S || !dh3.f(lp2Var2.K(), Integer.valueOf(I4))) {
                    p61.v(I4, lp2Var2, I4, dx0Var3);
                }
                pn7.m(dx0Var4, lp2Var2, kx4VarQ3);
                rn2Var3.K(lp2Var2, Integer.valueOf((i3 >> 15) & 14));
                lp2Var2.p(true);
                lp2Var2.p(false);
            } else {
                lp2Var2.W(2146164941);
                lp2Var2.p(z2);
            }
            float fH = os4.h(gg5Var, z24Var);
            float fG = os4.g(gg5Var, z24Var);
            if (rn2Var2 != null) {
                fH -= fN;
                if (fH < 0.0f) {
                    fH = 0.0f;
                }
            }
            float f3 = fH;
            if (rn2Var3 != null) {
                fG -= fN;
                if (fG < 0.0f) {
                    fG = 0.0f;
                }
            }
            if (rn2Var4 != null) {
                lp2Var2.W(2146868920);
                kx4 kx4VarA = os4.A(b.m(b.c(x97.O((kx4) r21, "Prefix"), 24.0f, 2)), f3, 0.0f, 2.0f, 0.0f, 10);
                p50Var2 = p50Var4;
                xr4 xr4VarC3 = g80.c(p50Var2, false);
                int I5 = km4.I(lp2Var2);
                kl5 kl5VarL4 = lp2Var2.l();
                kx4 kx4VarQ4 = w45.Q(lp2Var2, kx4VarA);
                lp2Var2.Z();
                if (lp2Var2.S) {
                    lp2Var2.k();
                } else {
                    lp2Var2.j0();
                }
                pn7.m(dx0Var, lp2Var2, xr4VarC3);
                pn7.m(dx0Var2, lp2Var2, kl5VarL4);
                if (lp2Var2.S || !dh3.f(lp2Var2.K(), Integer.valueOf(I5))) {
                    p61.v(I5, lp2Var2, I5, dx0Var3);
                }
                pn7.m(dx0Var4, lp2Var2, kx4VarQ4);
                rn2Var8 = rn2Var4;
                rn2Var8.K(lp2Var2, Integer.valueOf((i3 >> 18) & 14));
                lp2Var2.p(true);
                lp2Var2.p(false);
            } else {
                rn2Var8 = rn2Var4;
                p50Var2 = r18;
                lp2Var2.W(2147196621);
                lp2Var2.p(false);
            }
            if (rn2Var5 != null) {
                lp2Var2.W(2147239866);
                f2 = fG;
                kx4 kx4VarA2 = os4.A(b.m(b.c(x97.O((kx4) r21, "Suffix"), 24.0f, 2)), 2.0f, 0.0f, f2, 0.0f, 10);
                xr4 xr4VarC4 = g80.c(p50Var2, false);
                int I6 = km4.I(lp2Var2);
                kl5 kl5VarL5 = lp2Var2.l();
                kx4 kx4VarQ5 = w45.Q(lp2Var2, kx4VarA2);
                lp2Var2.Z();
                if (lp2Var2.S) {
                    lp2Var2.k();
                } else {
                    lp2Var2.j0();
                }
                pn7.m(dx0Var, lp2Var2, xr4VarC4);
                pn7.m(dx0Var2, lp2Var2, kl5VarL5);
                if (lp2Var2.S || !dh3.f(lp2Var2.K(), Integer.valueOf(I6))) {
                    p61.v(I6, lp2Var2, I6, dx0Var3);
                }
                pn7.m(dx0Var4, lp2Var2, kx4VarQ5);
                rn2Var10 = rn2Var5;
                rn2Var10.K(lp2Var2, Integer.valueOf((i3 >> 21) & 14));
                lp2Var2.p(true);
                lp2Var2.p(false);
            } else {
                f2 = fG;
                rn2Var10 = rn2Var5;
                lp2Var2.W(-2147401651);
                lp2Var2.p(false);
            }
            kx4 kx4VarA3 = os4.A(b.m(b.c((kx4) r21, 24.0f, 2)), rn2Var8 == null ? f3 : 0.0f, 0.0f, rn2Var10 == null ? f2 : 0.0f, 0.0f, 10);
            if (sn2Var != null) {
                lp2Var2.W(-2147031666);
                sn2Var2 = sn2Var;
                sn2Var2.x(x97.O((kx4) r21, "Hint").y(kx4VarA3), lp2Var2, Integer.valueOf((i3 >> 3) & 112));
                lp2Var2.p(false);
            } else {
                sn2Var2 = sn2Var;
                lp2Var2.W(-2146940371);
                lp2Var2.p(false);
            }
            kx4 kx4VarY3 = x97.O((kx4) r21, "TextField").y(kx4VarA3);
            xr4 xr4VarC5 = g80.c(p50Var2, true);
            int I7 = km4.I(lp2Var2);
            kl5 kl5VarL6 = lp2Var2.l();
            kx4 kx4VarQ6 = w45.Q(lp2Var2, kx4VarY3);
            lp2Var2.Z();
            if (lp2Var2.S) {
                lp2Var2.k();
            } else {
                lp2Var2.j0();
            }
            pn7.m(dx0Var, lp2Var2, xr4VarC5);
            pn7.m(dx0Var2, lp2Var2, kl5VarL6);
            if (lp2Var2.S || !dh3.f(lp2Var2.K(), Integer.valueOf(I7))) {
                p61.v(I7, lp2Var2, I7, dx0Var3);
            }
            pn7.m(dx0Var4, lp2Var2, kx4VarQ6);
            zy0Var.K(lp2Var2, Integer.valueOf((i3 >> 3) & 14));
            lp2Var2.p(true);
            if (rn2Var != null) {
                lp2Var2.W(-2146287790);
                if (i7 != 4) {
                    o58Var2 = o58Var;
                    z4 = (i6 & 8) != 0 && lp2Var2.h(o58Var2);
                    objK = lp2Var2.K();
                    if (z4 || objK == beVar) {
                        objK = new ee5(o58Var2, (byte) 0);
                        lp2Var2.g0(objK);
                    }
                    kx4 kx4VarY4 = x97.O(b.m(z68.q0((kx4) r21, new zt0((dn2) objK, (byte) 1))), "Label").y((kx4) r21);
                    xr4 xr4VarC6 = g80.c(p50Var2, false);
                    I = km4.I(lp2Var2);
                    kl5 kl5VarL7 = lp2Var2.l();
                    kx4 kx4VarQ7 = w45.Q(lp2Var2, kx4VarY4);
                    lp2Var2.Z();
                    if (lp2Var2.S) {
                        lp2Var2.k();
                    } else {
                        lp2Var2.j0();
                    }
                    pn7.m(dx0Var, lp2Var2, xr4VarC6);
                    pn7.m(dx0Var2, lp2Var2, kl5VarL7);
                    if (lp2Var2.S || !dh3.f(lp2Var2.K(), Integer.valueOf(I))) {
                        p61.v(I, lp2Var2, I, dx0Var3);
                    }
                    pn7.m(dx0Var4, lp2Var2, kx4VarQ7);
                    rn2Var7 = rn2Var;
                    rn2Var7.K(lp2Var2, Integer.valueOf((i3 >> 9) & 14));
                    lp2Var2.p(true);
                    lp2Var2.p(false);
                } else {
                    o58Var2 = o58Var;
                }
                objK = lp2Var2.K();
                if (z4) {
                    objK = new ee5(o58Var2, (byte) 0);
                    lp2Var2.g0(objK);
                } else {
                    objK = new ee5(o58Var2, (byte) 0);
                    lp2Var2.g0(objK);
                }
                kx4 kx4VarY5 = x97.O(b.m(z68.q0((kx4) r21, new zt0((dn2) objK, (byte) 1))), "Label").y((kx4) r21);
                xr4 xr4VarC7 = g80.c(p50Var2, false);
                I = km4.I(lp2Var2);
                kl5 kl5VarL8 = lp2Var2.l();
                kx4 kx4VarQ8 = w45.Q(lp2Var2, kx4VarY5);
                lp2Var2.Z();
                if (lp2Var2.S) {
                    lp2Var2.k();
                } else {
                    lp2Var2.j0();
                }
                pn7.m(dx0Var, lp2Var2, xr4VarC7);
                pn7.m(dx0Var2, lp2Var2, kl5VarL8);
                if (lp2Var2.S) {
                    p61.v(I, lp2Var2, I, dx0Var3);
                } else {
                    p61.v(I, lp2Var2, I, dx0Var3);
                }
                pn7.m(dx0Var4, lp2Var2, kx4VarQ8);
                rn2Var7 = rn2Var;
                rn2Var7.K(lp2Var2, Integer.valueOf((i3 >> 9) & 14));
                lp2Var2.p(true);
                lp2Var2.p(false);
            } else {
                rn2Var7 = rn2Var;
                o58Var2 = o58Var;
                lp2Var2.W(-2145892819);
                lp2Var2.p(false);
            }
            if (rn2Var6 != null) {
                lp2Var2.W(-2145844304);
                kx4 kx4VarW = os4.w(b.m(b.c(x97.O((kx4) r21, "Supporting"), 16.0f, 2)), new ig5(16.0f, 4.0f, 16.0f, 0.0f));
                xr4 xr4VarC8 = g80.c(p50Var2, false);
                int I8 = km4.I(lp2Var2);
                kl5 kl5VarL9 = lp2Var2.l();
                kx4 kx4VarQ9 = w45.Q(lp2Var2, kx4VarW);
                lp2Var2.Z();
                if (lp2Var2.S) {
                    lp2Var2.k();
                } else {
                    lp2Var2.j0();
                }
                pn7.m(dx0Var, lp2Var2, xr4VarC8);
                pn7.m(dx0Var2, lp2Var2, kl5VarL9);
                if (lp2Var2.S || !dh3.f(lp2Var2.K(), Integer.valueOf(I8))) {
                    p61.v(I8, lp2Var2, I8, dx0Var3);
                }
                pn7.m(dx0Var4, lp2Var2, kx4VarQ9);
                rn2Var9 = rn2Var6;
                rn2Var9.K(lp2Var2, Integer.valueOf((i6 >> 9) & 14));
                z3 = true;
                lp2Var2.p(true);
                lp2Var2.p(false);
            } else {
                rn2Var9 = rn2Var6;
                z3 = true;
                lp2Var2.W(-2145508915);
                lp2Var2.p(false);
            }
            lp2Var2.p(z3);
        } else {
            sn2Var2 = sn2Var;
            rn2Var7 = rn2Var;
            rn2Var8 = rn2Var4;
            lp2Var2 = lp2Var;
            rn2Var9 = rn2Var6;
            lp2Var2.Q();
        }
        j86 j86VarR = lp2Var2.r();
        if (j86VarR != null) {
            final rn2 rn2Var11 = rn2Var8;
            final rn2 rn2Var12 = rn2Var7;
            final rn2 rn2Var13 = rn2Var9;
            final sn2 sn2Var3 = sn2Var2;
            j86VarR.d = new rn2() { // from class: fe5
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = w79.P(i | 1);
                    int iP2 = w79.P(i2);
                    wl7.h(zy0Var, sn2Var3, rn2Var12, rn2Var2, rn2Var3, rn2Var11, rn2Var5, z, q58Var, o58Var2, gn2Var, zy0Var2, rn2Var13, gg5Var, (lp2) obj, iP, iP2);
                    return dn8.a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static fk2 h0(v15 v15Var) {
        v15Var.getClass();
        String strB = v15Var.b();
        strB.getClass();
        return new fk2(new gk2(strB, fk2.c.a, v15Var));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void i(final kx4 kx4Var, final zy0 zy0Var, final rn2 rn2Var, rn2 rn2Var2, final rn2 rn2Var3, final int i, final long j, long j2, final v09 v09Var, final zy0 zy0Var2, lp2 lp2Var, final int i2) {
        final rn2 rn2Var4;
        final long j3;
        int i3;
        rn2 rn2Var5;
        long jA;
        lp2Var.X(-1211482744);
        int i4 = i2 | (lp2Var.f(kx4Var) ? 4 : 2) | (lp2Var.h(zy0Var) ? 32 : 16) | (lp2Var.h(rn2Var) ? 256 : 128) | 3072 | (lp2Var.h(rn2Var3) ? 16384 : 8192) | (lp2Var.d(i) ? 131072 : 65536) | (lp2Var.e(j) ? 1048576 : 524288) | 4194304 | (lp2Var.f(v09Var) ? 67108864 : 33554432) | (lp2Var.h(zy0Var2) ? 536870912 : 268435456);
        if (lp2Var.N(i4 & 1, (306783379 & i4) != 306783378)) {
            lp2Var.S();
            if ((i2 & 1) == 0 || lp2Var.x()) {
                i3 = i4 & (-29360129);
                rn2Var5 = ez0.a;
                jA = kw0.a(j, lp2Var);
            } else {
                lp2Var.Q();
                i3 = i4 & (-29360129);
                rn2Var5 = rn2Var2;
                jA = j2;
            }
            lp2Var.q();
            int i5 = (234881024 & i3) ^ 100663296;
            boolean z = (i5 > 67108864 && lp2Var.f(v09Var)) || (i3 & 100663296) == 67108864;
            Object objK = lp2Var.K();
            Object obj = zz0.a;
            if (z || objK == obj) {
                objK = new e15(v09Var);
                lp2Var.g0(objK);
            }
            e15 e15Var = (e15) objK;
            int i6 = i3;
            boolean zF = lp2Var.f(e15Var) | ((i5 > 67108864 && lp2Var.f(v09Var)) || (i6 & 100663296) == 67108864);
            Object objK2 = lp2Var.K();
            if (zF || objK2 == obj) {
                objK2 = new gq6(e15Var, v09Var, (byte) 1);
                lp2Var.g0(objK2);
            }
            ay7.a(z51.I(kx4Var, (gn2) objK2), (x67) null, j, jA, 0.0f, 0.0f, jm4.U(848889571, new lw6(i, zy0Var, zy0Var2, rn2Var5, rn2Var3, e15Var, rn2Var), lp2Var), lp2Var, ((i6 >> 12) & 896) | 12582912, 114);
            j3 = jA;
            rn2Var4 = rn2Var5;
        } else {
            lp2Var.Q();
            rn2Var4 = rn2Var2;
            j3 = j2;
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2(kx4Var, zy0Var, rn2Var, rn2Var4, rn2Var3, i, j, j3, v09Var, zy0Var2, i2) { // from class: hw6
                public final /* synthetic */ kx4 X;
                public final /* synthetic */ zy0 Y;
                public final /* synthetic */ rn2 Z;
                public final /* synthetic */ rn2 f0;
                public final /* synthetic */ rn2 g0;
                public final /* synthetic */ byte h0;
                public final /* synthetic */ long i0;
                public final /* synthetic */ long j0;
                public final /* synthetic */ v09 k0;
                public final /* synthetic */ zy0 l0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final Object K(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = w79.P(1);
                    wl7.i(this.X, this.Y, this.Z, this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, (lp2) obj2, iP);
                    return dn8.a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static sg8 i0(int i, int i2, xx1 xx1Var) {
        if ((i2 & 1) != 0) {
            i = 300;
        }
        int i3 = (i2 & 2) != 0 ? 0 : 90;
        if ((i2 & 4) != 0) {
            xx1Var = yx1.a;
        }
        return new sg8(i, i3, xx1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void j(final int i, final zy0 zy0Var, final zy0 zy0Var2, final rn2 rn2Var, final rn2 rn2Var2, final v09 v09Var, final rn2 rn2Var3, lp2 lp2Var, final int i2) {
        int i3;
        int i4;
        lp2Var.X(-280287501);
        int i5 = i2 | (lp2Var.d(i) ? 4 : 2) | (lp2Var.h(zy0Var) ? 32 : 16) | (lp2Var.h(zy0Var2) ? 256 : 128) | (lp2Var.h(rn2Var) ? 2048 : 1024) | (lp2Var.h(rn2Var2) ? 16384 : 8192) | (lp2Var.f(v09Var) ? 131072 : 65536) | (lp2Var.h(rn2Var3) ? 1048576 : 524288);
        if (lp2Var.N(i5 & 1, (599187 & i5) != 599186)) {
            Object objK = lp2Var.K();
            be beVar = zz0.a;
            if (objK == beVar) {
                objK = new mw6();
                lp2Var.g0(objK);
            }
            mw6 mw6Var = (mw6) objK;
            boolean z = (i5 & 112) == 32;
            Object objK2 = lp2Var.K();
            if (z || objK2 == beVar) {
                objK2 = new zy0(605195056, true, new l8(zy0Var, (byte) 2));
                lp2Var.g0(objK2);
            }
            rn2 rn2Var4 = (rn2) objK2;
            boolean z2 = (i5 & 7168) == 2048;
            Object objK3 = lp2Var.K();
            if (z2 || objK3 == beVar) {
                objK3 = new zy0(418899191, true, new i8(rn2Var, (byte) 5));
                lp2Var.g0(objK3);
            }
            rn2 rn2Var5 = (rn2) objK3;
            boolean z3 = (57344 & i5) == 16384;
            Object objK4 = lp2Var.K();
            if (z3 || objK4 == beVar) {
                objK4 = new zy0(338600263, true, new i8(rn2Var2, (byte) 4));
                lp2Var.g0(objK4);
            }
            rn2 rn2Var6 = (rn2) objK4;
            boolean z4 = (i5 & 896) == 256;
            Object objK5 = lp2Var.K();
            if (z4 || objK5 == beVar) {
                objK5 = new zy0(-1776388365, true, new n40(zy0Var2, mw6Var));
                lp2Var.g0(objK5);
            }
            rn2 rn2Var7 = (rn2) objK5;
            boolean z5 = (i5 & 3670016) == 1048576;
            Object objK6 = lp2Var.K();
            if (z5 || objK6 == beVar) {
                objK6 = new zy0(-1731662488, true, new i8(rn2Var3, (byte) 3));
                lp2Var.g0(objK6);
            }
            rn2 rn2Var8 = (rn2) objK6;
            boolean zF = ((i5 & 458752) == 131072) | lp2Var.f(rn2Var4) | lp2Var.f(rn2Var5) | lp2Var.f(rn2Var6) | ((i5 & 14) == 4) | lp2Var.f(rn2Var8) | lp2Var.f(rn2Var7);
            Object objK7 = lp2Var.K();
            if (zF || objK7 == beVar) {
                i3 = 0;
                i4 = 1;
                iw6 iw6Var = new iw6(v09Var, rn2Var4, rn2Var5, rn2Var6, i, rn2Var8, mw6Var, rn2Var7);
                lp2Var.g0(iw6Var);
                objK7 = iw6Var;
            } else {
                i3 = 0;
                i4 = 1;
            }
            sp7.a((kx4) null, (rn2) objK7, lp2Var, i3, i4);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2(i, zy0Var, zy0Var2, rn2Var, rn2Var2, v09Var, rn2Var3, i2) { // from class: jw6
                public final /* synthetic */ byte X;
                public final /* synthetic */ zy0 Y;
                public final /* synthetic */ zy0 Z;
                public final /* synthetic */ rn2 f0;
                public final /* synthetic */ rn2 g0;
                public final /* synthetic */ v09 h0;
                public final /* synthetic */ rn2 i0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = w79.P(1);
                    wl7.j(this.X, this.Y, this.Z, this.f0, this.g0, this.h0, this.i0, (lp2) obj, iP);
                    return dn8.a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void k(z64 z64Var, Object obj, int i, Object obj2, lp2 lp2Var, int i2) {
        lp2Var.X(1439843069);
        int i3 = (lp2Var.f(z64Var) ? 4 : 2) | i2 | (lp2Var.f(obj) ? 32 : 16) | (lp2Var.d(i) ? 256 : 128) | (lp2Var.f(obj2) ? 2048 : 1024);
        if (lp2Var.N(i3 & 1, (i3 & 1171) != 1170)) {
            ((iv6) obj).b(obj2, jm4.U(980966366, new g64(i, z64Var, obj2), lp2Var), lp2Var, 48);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new g8(z64Var, obj, i, obj2, i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final boolean l(pw3 pw3Var, pw3 pw3Var2) {
        pw3Var.getClass();
        pw3Var2.getClass();
        return z68.p0(pw3Var, pw3Var2) && z68.p0(pw3Var2, pw3Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final og5 m(d53 d53Var, Context context) {
        if (!(d53Var instanceof d60)) {
            if (!(d53Var instanceof yv1)) {
                return new ImagePainter(d53Var);
            }
            Drawable drawableMutate = z39.g(d53Var, context.getResources()).mutate();
            drawableMutate.setFilterBitmap(true);
            return new DrawablePainter(drawableMutate);
        }
        Bitmap bitmap = ((d60) d53Var).a;
        BitmapPainter bitmapPainter = new BitmapPainter(new je(bitmap), (((long) bitmap.getWidth()) << 32) | (((long) bitmap.getHeight()) & 4294967295L));
        bitmapPainter.j0 = true;
        return bitmapPainter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final void n(int i, StringBuilder sb) {
        if (i <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add("?");
        }
        sb.append(wv0.y0(arrayList, ",", (String) null, (String) null, (gn2) null, 62));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Set o(e37 e37Var) {
        e37Var.getClass();
        if (e37Var instanceof tc0) {
            return ((tc0) e37Var).b();
        }
        HashSet hashSet = new HashSet(e37Var.e());
        int iE = e37Var.e();
        for (int i = 0; i < iE; i++) {
            hashSet.add(e37Var.f(i));
        }
        return hashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void s(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            bt.f(i3, oi0.r(i, "startIndex: ", i2, ", endIndex: ", ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            bt.q(pc6.m("startIndex: ", i, i2, " > endIndex: "));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void t(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            bt.f(i3, oi0.r(i, "fromIndex: ", i2, ", toIndex: ", ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            bt.q(pc6.m("fromIndex: ", i, i2, " > toIndex: "));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final e37[] u(List list) {
        e37[] e37VarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (e37VarArr = (e37[]) list.toArray(new e37[0])) == null) ? d : e37VarArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static jh8 w(boolean z, lh4 lh4Var, y14 y14Var, int i) {
        z14 z14Var = z14.t;
        if ((i & 4) != 0) {
            lh4Var = lh4.E0;
        }
        lh4 lh4Var2 = lh4Var;
        if ((i & 8) != 0) {
            y14Var = y14.i;
        }
        return new jh8(z, true, true, lh4Var2, y14Var, z14Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final Object x(na1 na1Var, rn2 rn2Var, s51 s51Var) {
        return na1Var.u(new hs5(rn2Var, (q51) null, (byte) 1), s51Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final int y(int i, String str) {
        ?? r5;
        ?? r6;
        int spanEnd;
        yy1 yy1VarF = F();
        Integer num = null;
        if (yy1VarF != null) {
            mb6.s("Not initialized yet", yy1VarF.c() == 1);
            mb6.r((Object) str, "charSequence cannot be null");
            lr lrVar = yy1VarF.e.b;
            lrVar.getClass();
            if (i < 0 || i >= str.length()) {
                r6 = str;
                spanEnd = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                pj8[] pj8VarArr = (pj8[]) spanned.getSpans(i, i + 1, pj8.class);
                if (pj8VarArr.length > 0) {
                    spanEnd = spanned.getSpanEnd(pj8VarArr[0]);
                    r6 = str;
                } else {
                    ?? r7 = str;
                    spanEnd = ((lz1) lrVar.y((CharSequence) r7, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new lz1(i))).Z;
                    r6 = r7;
                }
            } else {
                ?? r8 = str;
                spanEnd = ((lz1) lrVar.y((CharSequence) r8, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new lz1(i))).Z;
                r6 = r8;
            }
            Integer numValueOf = Integer.valueOf(spanEnd);
            r5 = r6;
            if (spanEnd != -1) {
                num = numValueOf;
            }
        } else {
            r5 = str;
        }
        if (num != null) {
            r5 = r6;
            return num.intValue();
        }
        r5 = r6;
        ?? characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(r5);
        return characterInstance.following(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static final int z(int i, String str) {
        yy1 yy1VarF = F();
        Integer num = null;
        if (yy1VarF != null) {
            Integer numValueOf = Integer.valueOf(yy1VarF.b(str, Math.max(0, i - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object C(r06 r06Var) {
        throw new IllegalStateException("");
    }

    public abstract int D(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int G();

    public abstract int H();

    public abstract int I();

    public abstract int J();

    public abstract int K(View view);

    public abstract int L(CoordinatorLayout coordinatorLayout);

    public abstract int M();

    public abstract boolean O(float f2);

    public abstract boolean P(View view);

    public abstract boolean Q(float f2, float f3);

    public abstract void T(Typeface typeface);

    public abstract boolean U(View view, float f2);

    public abstract void j0(ViewGroup.MarginLayoutParams marginLayoutParams, int i);

    public abstract void k0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    public abstract int p(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float q(int i);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void r(int i) {
        new Handler(Looper.getMainLooper()).post(new wf6(this, i, (byte) 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean v(r06 r06Var) {
        return false;
    }

    public void S(int i) {
    }
}
