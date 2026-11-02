package io.sentry.android.core.internal.tombstone;

import defpackage.b10;
import defpackage.jt4;
import defpackage.k32;
import defpackage.k42;
import defpackage.mb8;
import defpackage.nc6;
import defpackage.nv0;
import defpackage.p61;
import defpackage.ra;
import defpackage.u28;
import defpackage.we5;
import defpackage.x50;
import io.sentry.j5;
import io.sentry.k2;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.a0;
import io.sentry.protocol.b0;
import io.sentry.protocol.c0;
import io.sentry.protocol.e0;
import io.sentry.protocol.f;
import io.sentry.protocol.o;
import io.sentry.protocol.p;
import io.sentry.protocol.v;
import io.sentry.s5;
import io.sentry.z;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.url._UrlKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Closeable {
    public final InputStream X;
    public final List Y;
    public final List Z;
    public final String f0;
    public final HashMap g0;

    public c(InputStream inputStream, List list, List list2, String str) {
        HashMap map = new HashMap();
        this.g0 = map;
        this.X = inputStream;
        this.Y = list;
        this.Z = list2;
        this.f0 = str;
        map.put("SIGILL", "IllegalInstruction");
        map.put("SIGTRAP", "Trap");
        map.put("SIGABRT", "Abort");
        map.put("SIGBUS", "BusError");
        map.put("SIGFPE", "FloatingPointException");
        map.put("SIGSEGV", "Segfault");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.X.close();
    }

    public final j5 g() throws IOException {
        DebugImage debugImageA;
        Map map;
        int i;
        DebugImage debugImageA2;
        x50 x50Var;
        int i2;
        int i3;
        x50 x50Var2;
        x50 x50Var3;
        ArrayList arrayList;
        x50 x50Var4;
        ArrayList arrayList2;
        int i4;
        int i5;
        x50 x50Var5;
        x50 x50Var6;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i6 = this.X.read(bArr);
            if (i6 == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i6);
        }
        x50 x50Var7 = new x50((byte) 2, byteArrayOutputStream.toByteArray());
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        String str = _UrlKt.FRAGMENT_ENCODE_SET;
        int iJ = 0;
        int iJ2 = 0;
        int iJ3 = 0;
        String strH = _UrlKt.FRAGMENT_ENCODE_SET;
        nv0 nv0Var = null;
        while (true) {
            int i7 = x50Var7.i();
            if (i7 == 0) {
                String str2 = str;
                int i8 = iJ2;
                List listUnmodifiableList = Collections.unmodifiableList(arrayList3);
                Collections.unmodifiableList(arrayList4);
                Collections.unmodifiableList(arrayList5);
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map2);
                Collections.unmodifiableMap(map3);
                List listUnmodifiableList2 = Collections.unmodifiableList(arrayList6);
                Collections.unmodifiableList(arrayList7);
                Collections.unmodifiableList(arrayList8);
                j5 j5Var = new j5();
                j5Var.w0 = s5.FATAL;
                j5Var.j0 = "native";
                p pVar = new p();
                StringBuilder sb = new StringBuilder();
                Iterator it = listUnmodifiableList.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it.next());
                        if (it.hasNext()) {
                            sb.append((CharSequence) " ");
                        }
                    }
                }
                String string = sb.toString();
                if (nv0Var != null) {
                    Locale locale = Locale.ROOT;
                    pVar.X = (!strH.isEmpty() ? strH.concat(": ") : str2) + "Fatal signal " + ((String) nv0Var.Z) + " (" + nv0Var.X + "), " + ((String) nv0Var.f0) + " (" + nv0Var.Y + "), pid = " + iJ + " (" + string + ")";
                } else {
                    Locale locale2 = Locale.ROOT;
                    pVar.X = "Fatal exit pid = " + iJ + " (" + string + ")";
                }
                j5Var.s0 = pVar;
                ArrayList arrayList9 = new ArrayList();
                Iterator it2 = listUnmodifiableList2.iterator();
                b bVar = null;
                while (it2.hasNext()) {
                    jt4 jt4Var = (jt4) it2.next();
                    boolean z = jt4Var.d;
                    long j = jt4Var.b;
                    long j2 = jt4Var.a;
                    Map map4 = mapUnmodifiableMap;
                    Iterator it3 = it2;
                    long j3 = jt4Var.c;
                    String str3 = jt4Var.f;
                    String str4 = jt4Var.e;
                    if (z && !str4.isEmpty()) {
                        map = map4;
                        if (!str4.startsWith("/dev/")) {
                            if (str3.isEmpty()) {
                                i = iJ;
                                if (bVar != null) {
                                    long j4 = iJ3;
                                    if (bVar.a.equals(str4)) {
                                        long j5 = bVar.f;
                                        if (j2 >= j5) {
                                            long j6 = bVar.g;
                                            if (j3 >= j6) {
                                                long j7 = (j2 - j5) - (j3 - (j6 + (j5 - bVar.e)));
                                                if (j4 <= 0) {
                                                    j4 = 4096;
                                                }
                                                long jMax = Math.max(j4, Http2Stream.EMIT_BUFFER_SIZE);
                                                if (j7 >= (-jMax) && j7 <= jMax) {
                                                    bVar.d = Math.max(bVar.d, j);
                                                    bVar.e = j2;
                                                    bVar.f = j;
                                                    bVar.g = j3;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (bVar != null && bVar.a.equals(str4) && bVar.b.equals(str3)) {
                                bVar.d = Math.max(bVar.d, j);
                                bVar.e = j2;
                                bVar.f = j;
                                bVar.g = j3;
                            } else {
                                if (bVar != null && (debugImageA2 = bVar.a()) != null) {
                                    arrayList9.add(debugImageA2);
                                }
                                bVar = new b();
                                bVar.a = str4;
                                bVar.b = str3;
                                bVar.c = j2;
                                bVar.d = j;
                                bVar.e = j2;
                                bVar.f = j;
                                bVar.g = j3;
                            }
                        }
                        it2 = it3;
                        mapUnmodifiableMap = map;
                        iJ = i;
                    } else {
                        map = map4;
                    }
                    i = iJ;
                    it2 = it3;
                    mapUnmodifiableMap = map;
                    iJ = i;
                }
                Map map5 = mapUnmodifiableMap;
                int i9 = iJ;
                if (bVar != null && (debugImageA = bVar.a()) != null) {
                    arrayList9.add(debugImageA);
                }
                f fVar = new f();
                fVar.b(arrayList9);
                j5Var.p0 = fVar;
                v vVar = new v();
                if (nv0Var != null) {
                    String str5 = (String) nv0Var.Z;
                    vVar.X = str5;
                    vVar.Y = (String) this.g0.get(str5);
                    o oVar = new o();
                    oVar.X = a.TOMBSTONE.getValue();
                    oVar.f0 = Boolean.FALSE;
                    oVar.i0 = Boolean.TRUE;
                    HashMap map6 = new HashMap();
                    map6.put("number", Integer.valueOf(nv0Var.X));
                    map6.put("name", (String) nv0Var.Z);
                    map6.put("code", Integer.valueOf(nv0Var.Y));
                    map6.put("code_name", (String) nv0Var.f0);
                    oVar.g0 = new HashMap(map6);
                    vVar.h0 = oVar;
                }
                vVar.f0 = Long.valueOf(i8);
                ArrayList arrayList10 = new ArrayList(1);
                arrayList10.add(vVar);
                j5Var.h(arrayList10);
                ArrayList arrayListD = j5Var.d();
                Objects.requireNonNull(arrayListD);
                v vVar2 = (v) arrayListD.get(0);
                ArrayList arrayList11 = new ArrayList();
                Iterator it4 = map5.entrySet().iterator();
                while (it4.hasNext()) {
                    Map.Entry entry = (Map.Entry) it4.next();
                    mb8 mb8Var = (mb8) entry.getValue();
                    e0 e0Var = new e0();
                    e0Var.X = Long.valueOf(((Integer) entry.getKey()).intValue());
                    e0Var.Z = mb8Var.b;
                    ArrayList arrayList12 = new ArrayList();
                    Iterator it5 = mb8Var.d.iterator();
                    while (it5.hasNext()) {
                        b10 b10Var = (b10) it5.next();
                        String str6 = b10Var.d;
                        long j8 = b10Var.b;
                        String str7 = b10Var.c;
                        it4 = it4;
                        if (!str6.endsWith("libart.so") && (!str6.startsWith("<anonymous") || !str7.isEmpty())) {
                            a0 a0Var = new a0();
                            a0Var.n0 = str6;
                            a0Var.g0 = str7;
                            Iterator it6 = it5;
                            a0Var.s0 = String.format("0x%x", Long.valueOf(j8));
                            if (!b10Var.e.isEmpty()) {
                                long j9 = b10Var.a;
                                if (j8 >= j9) {
                                    a0Var.q0 = String.format("0x%x", Long.valueOf(j8 - j9));
                                }
                            }
                            Boolean boolC = str7.isEmpty() ? Boolean.FALSE : z.c(str7, this.Y, this.Z);
                            String str8 = this.f0;
                            a0Var.m0 = Boolean.valueOf((boolC != null && boolC.booleanValue()) || (str8 != null && str6.startsWith(str8)));
                            arrayList12.add(0, a0Var);
                            it5 = it6;
                        }
                    }
                    Iterator it7 = it4;
                    c0 c0Var = new c0();
                    c0Var.X = arrayList12;
                    c0Var.f0 = b0.NONE;
                    HashMap map7 = new HashMap();
                    for (nc6 nc6Var : mb8Var.c) {
                        map7.put(nc6Var.a, String.format("0x%x", Long.valueOf(nc6Var.b)));
                    }
                    c0Var.Y = map7;
                    e0Var.k0 = c0Var;
                    int i10 = mb8Var.a;
                    if (i8 == i10) {
                        e0Var.g0 = Boolean.TRUE;
                        vVar2.g0 = c0Var;
                    }
                    int i11 = i9;
                    if (i11 == i10) {
                        e0Var.Z = "main";
                        e0Var.j0 = Boolean.TRUE;
                    }
                    arrayList11.add(e0Var);
                    i9 = i11;
                    it4 = it7;
                }
                j5Var.u0 = new k2(arrayList11);
                return j5Var;
            }
            int i12 = i7 >>> 3;
            int i13 = i7 & 7;
            String str9 = str;
            switch (i12) {
                case 1:
                    x50Var = x50Var7;
                    arrayList4 = arrayList4;
                    iJ2 = iJ2;
                    i2 = 2;
                    x50.c(i12, 0, i13);
                    int iJ4 = (int) x50Var.j();
                    int[] iArrG = p61.G(6);
                    int length = iArrG.length;
                    for (int i14 = 0; i14 < length && p61.d(iArrG[i14]) != iJ4; i14++) {
                    }
                    iJ2 = iJ2;
                    str = str9;
                    x50Var7 = x50Var;
                    arrayList4 = arrayList4;
                    break;
                case 2:
                    x50Var = x50Var7;
                    arrayList4 = arrayList4;
                    i2 = 2;
                    x50.c(i12, 2, i13);
                    x50Var.h();
                    str = str9;
                    x50Var7 = x50Var;
                    arrayList4 = arrayList4;
                    break;
                case 3:
                    x50Var = x50Var7;
                    arrayList4 = arrayList4;
                    i2 = 2;
                    x50.c(i12, 2, i13);
                    x50Var.h();
                    str = str9;
                    x50Var7 = x50Var;
                    arrayList4 = arrayList4;
                    break;
                case 4:
                    x50Var = x50Var7;
                    arrayList4 = arrayList4;
                    i2 = 2;
                    x50.c(i12, 2, i13);
                    x50Var.h();
                    str = str9;
                    x50Var7 = x50Var;
                    arrayList4 = arrayList4;
                    break;
                case 5:
                    x50Var = x50Var7;
                    i3 = iJ2;
                    x50.c(i12, 0, i13);
                    iJ = (int) x50Var.j();
                    iJ2 = i3;
                    i2 = 2;
                    str = str9;
                    x50Var7 = x50Var;
                    arrayList4 = arrayList4;
                    break;
                case 6:
                    x50Var = x50Var7;
                    arrayList4 = arrayList4;
                    x50.c(i12, 0, i13);
                    iJ2 = (int) x50Var.j();
                    i2 = 2;
                    str = str9;
                    x50Var7 = x50Var;
                    arrayList4 = arrayList4;
                    break;
                case 7:
                    x50Var = x50Var7;
                    i3 = iJ2;
                    x50.c(i12, 0, i13);
                    x50Var.j();
                    iJ2 = i3;
                    i2 = 2;
                    str = str9;
                    x50Var7 = x50Var;
                    arrayList4 = arrayList4;
                    break;
                case 8:
                    x50Var = x50Var7;
                    arrayList4 = arrayList4;
                    x50.c(i12, 2, i13);
                    x50Var.h();
                    i2 = 2;
                    str = str9;
                    x50Var7 = x50Var;
                    arrayList4 = arrayList4;
                    break;
                case 9:
                    x50Var = x50Var7;
                    arrayList4 = arrayList4;
                    iJ2 = iJ2;
                    i2 = 2;
                    x50.c(i12, 2, i13);
                    arrayList3.add(x50Var.h());
                    iJ2 = iJ2;
                    str = str9;
                    x50Var7 = x50Var;
                    arrayList4 = arrayList4;
                    break;
                case 10:
                    x50Var = x50Var7;
                    i3 = iJ2;
                    x50.c(i12, 2, i13);
                    x50 x50VarG = x50Var.g();
                    String strH2 = str9;
                    String strH3 = strH2;
                    int iJ5 = 0;
                    int iJ6 = 0;
                    while (true) {
                        int i15 = x50VarG.i();
                        if (i15 == 0) {
                            nv0 nv0Var2 = new nv0();
                            nv0Var2.X = iJ5;
                            nv0Var2.Z = strH2;
                            nv0Var2.Y = iJ6;
                            nv0Var2.f0 = strH3;
                            nv0Var = nv0Var2;
                            iJ2 = i3;
                            i2 = 2;
                            str = str9;
                            x50Var7 = x50Var;
                            arrayList4 = arrayList4;
                        } else {
                            int i16 = i15 >>> 3;
                            int i17 = i15 & 7;
                            switch (i16) {
                                case 1:
                                    x50Var2 = x50VarG;
                                    x50.c(i16, 0, i17);
                                    iJ5 = (int) x50Var2.j();
                                    break;
                                case 2:
                                    x50Var2 = x50VarG;
                                    x50.c(i16, 2, i17);
                                    strH2 = x50Var2.h();
                                    break;
                                case 3:
                                    x50Var2 = x50VarG;
                                    x50.c(i16, 0, i17);
                                    iJ6 = (int) x50Var2.j();
                                    iJ5 = iJ5;
                                    break;
                                case 4:
                                    x50Var2 = x50VarG;
                                    x50.c(i16, 2, i17);
                                    strH3 = x50Var2.h();
                                    break;
                                case 5:
                                    x50Var2 = x50VarG;
                                    x50.c(i16, 0, i17);
                                    x50Var2.e();
                                    break;
                                case 6:
                                    x50Var2 = x50VarG;
                                    x50.c(i16, 0, i17);
                                    x50Var2.j();
                                    break;
                                case 7:
                                    x50Var2 = x50VarG;
                                    x50.c(i16, 0, i17);
                                    x50Var2.j();
                                    break;
                                case 8:
                                    x50Var2 = x50VarG;
                                    x50.c(i16, 0, i17);
                                    x50Var2.e();
                                    break;
                                case 9:
                                    x50Var2 = x50VarG;
                                    x50.c(i16, 0, i17);
                                    x50Var2.j();
                                    break;
                                case 10:
                                    x50Var2 = x50VarG;
                                    x50.c(i16, 2, i17);
                                    u28.e(x50Var2.g());
                                    break;
                                default:
                                    x50VarG.k(i17);
                                    x50Var2 = x50VarG;
                                    break;
                            }
                            x50VarG = x50Var2;
                        }
                        break;
                    }
                    break;
                case 11:
                case FileClientSessionCache.MAX_SIZE /* 12 */:
                case 13:
                default:
                    x50Var7.k(i13);
                    x50Var = x50Var7;
                    iJ2 = iJ2;
                    i2 = 2;
                    iJ2 = iJ2;
                    str = str9;
                    x50Var7 = x50Var;
                    arrayList4 = arrayList4;
                    break;
                case 14:
                    x50Var = x50Var7;
                    arrayList4 = arrayList4;
                    i2 = 2;
                    x50.c(i12, 2, i13);
                    strH = x50Var.h();
                    str = str9;
                    x50Var7 = x50Var;
                    arrayList4 = arrayList4;
                    break;
                case 15:
                    x50Var = x50Var7;
                    iJ2 = iJ2;
                    i2 = 2;
                    x50.c(i12, 2, i13);
                    x50 x50VarG2 = x50Var.g();
                    while (true) {
                        int i18 = x50VarG2.i();
                        if (i18 != 0) {
                            int i19 = i18 >>> 3;
                            int i20 = i18 & 7;
                            if (i19 != 1) {
                                if (i19 != i2) {
                                    x50VarG2.k(i20);
                                } else {
                                    x50.c(i19, i2, i20);
                                    x50 x50VarG3 = x50VarG2.g();
                                    while (true) {
                                        int i21 = x50VarG3.i();
                                        if (i21 != 0) {
                                            int i22 = i21 >>> 3;
                                            int i23 = i21 & 7;
                                            x50 x50Var8 = x50VarG2;
                                            if (i22 == 1) {
                                                x50Var4 = x50VarG3;
                                                arrayList2 = arrayList4;
                                                x50.c(i22, 0, i23);
                                                int iJ7 = (int) x50Var4.j();
                                                int i24 = 2;
                                                int[] iArrG2 = p61.G(2);
                                                int length2 = iArrG2.length;
                                                int i25 = 0;
                                                while (i25 < length2) {
                                                    int i26 = iArrG2[i25];
                                                    int[] iArr = iArrG2;
                                                    if (i26 == 1) {
                                                        i4 = 0;
                                                    } else {
                                                        if (i26 != i24) {
                                                            throw null;
                                                        }
                                                        i4 = 1;
                                                    }
                                                    if (i4 == iJ7) {
                                                    }
                                                    i25++;
                                                    iArrG2 = iArr;
                                                    i24 = 2;
                                                    break;
                                                }
                                            } else if (i22 == i2) {
                                                x50Var4 = x50VarG3;
                                                arrayList2 = arrayList4;
                                                x50.c(i22, 0, i23);
                                                int iJ8 = (int) x50Var4.j();
                                                for (int i27 : p61.G(6)) {
                                                    switch (i27) {
                                                        case 1:
                                                            i5 = 0;
                                                            break;
                                                        case 2:
                                                            i5 = 1;
                                                            break;
                                                        case 3:
                                                            i5 = 2;
                                                            break;
                                                        case 4:
                                                            i5 = 3;
                                                            break;
                                                        case 5:
                                                            i5 = 4;
                                                            break;
                                                        case 6:
                                                            i5 = 5;
                                                            break;
                                                        default:
                                                            throw null;
                                                    }
                                                    if (i5 == iJ8) {
                                                    }
                                                    break;
                                                }
                                            } else if (i22 != 3) {
                                                x50VarG3.k(i23);
                                                x50Var4 = x50VarG3;
                                                arrayList2 = arrayList4;
                                            } else {
                                                x50.c(i22, i2, i23);
                                                x50 x50VarG4 = x50VarG3.g();
                                                ArrayList arrayList13 = new ArrayList();
                                                ArrayList arrayList14 = new ArrayList();
                                                while (true) {
                                                    int i28 = x50VarG4.i();
                                                    if (i28 != 0) {
                                                        int i29 = i28 >>> 3;
                                                        x50 x50Var9 = x50VarG3;
                                                        int i30 = i28 & 7;
                                                        switch (i29) {
                                                            case 1:
                                                                arrayList4 = arrayList4;
                                                                x50.c(i29, 0, i30);
                                                                x50VarG4.j();
                                                                break;
                                                            case 2:
                                                                arrayList4 = arrayList4;
                                                                x50.c(i29, 0, i30);
                                                                x50VarG4.j();
                                                                break;
                                                            case 3:
                                                                arrayList4 = arrayList4;
                                                                x50.c(i29, 0, i30);
                                                                x50VarG4.j();
                                                                break;
                                                            case 4:
                                                                x50.c(i29, 2, i30);
                                                                arrayList13.add(u28.d(x50VarG4.g()));
                                                                break;
                                                            case 5:
                                                                arrayList4 = arrayList4;
                                                                x50.c(i29, 0, i30);
                                                                x50VarG4.j();
                                                                break;
                                                            case 6:
                                                                x50.c(i29, 2, i30);
                                                                arrayList14.add(u28.d(x50VarG4.g()));
                                                                break;
                                                            default:
                                                                x50VarG4.k(i30);
                                                                break;
                                                        }
                                                        x50VarG3 = x50Var9;
                                                        arrayList4 = arrayList4;
                                                    } else {
                                                        x50Var4 = x50VarG3;
                                                        arrayList2 = arrayList4;
                                                        Collections.unmodifiableList(arrayList13);
                                                        Collections.unmodifiableList(arrayList14);
                                                    }
                                                }
                                            }
                                            x50VarG2 = x50Var8;
                                            x50VarG3 = x50Var4;
                                            arrayList4 = arrayList2;
                                            i2 = 2;
                                        }
                                    }
                                }
                                x50Var3 = x50VarG2;
                                arrayList = arrayList4;
                            } else {
                                x50Var3 = x50VarG2;
                                arrayList = arrayList4;
                                x50.c(i19, i2, i20);
                                x50Var3.h();
                            }
                            x50VarG2 = x50Var3;
                            arrayList4 = arrayList;
                        } else {
                            arrayList4 = arrayList4;
                            arrayList5.add(new ra((byte) 10, false));
                        }
                    }
                    iJ2 = iJ2;
                    str = str9;
                    x50Var7 = x50Var;
                    arrayList4 = arrayList4;
                    break;
                case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                    x50Var = x50Var7;
                    i2 = 2;
                    x50.c(i12, 2, i13);
                    u28.f(x50Var.g(), map2);
                    arrayList4 = arrayList4;
                    iJ2 = iJ2;
                    str = str9;
                    x50Var7 = x50Var;
                    arrayList4 = arrayList4;
                    break;
                case 17:
                    x50Var = x50Var7;
                    x50.c(i12, 2, i13);
                    x50 x50VarG5 = x50Var.g();
                    String strH4 = str9;
                    String strH5 = strH4;
                    long j10 = 0;
                    long j11 = 0;
                    long j12 = 0;
                    boolean zE = false;
                    while (true) {
                        int i31 = x50VarG5.i();
                        if (i31 == 0) {
                            arrayList6.add(new jt4(j10, j11, j12, zE, strH4, strH5));
                            i2 = 2;
                            iJ2 = iJ2;
                            str = str9;
                            x50Var7 = x50Var;
                            arrayList4 = arrayList4;
                            break;
                        } else {
                            int i32 = i31 >>> 3;
                            int i33 = i31 & 7;
                            switch (i32) {
                                case 1:
                                    x50.c(i32, 0, i33);
                                    j10 = x50VarG5.j();
                                    break;
                                case 2:
                                    x50.c(i32, 0, i33);
                                    j11 = x50VarG5.j();
                                    break;
                                case 3:
                                    x50.c(i32, 0, i33);
                                    j12 = x50VarG5.j();
                                    break;
                                case 4:
                                    x50.c(i32, 0, i33);
                                    zE = x50VarG5.e();
                                    break;
                                case 5:
                                    x50.c(i32, 0, i33);
                                    x50VarG5.e();
                                    break;
                                case 6:
                                    x50.c(i32, 0, i33);
                                    x50VarG5.e();
                                    break;
                                case 7:
                                    x50.c(i32, 2, i33);
                                    strH4 = x50VarG5.h();
                                    break;
                                case 8:
                                    x50.c(i32, 2, i33);
                                    strH5 = x50VarG5.h();
                                    break;
                                case 9:
                                    x50.c(i32, 0, i33);
                                    x50VarG5.j();
                                    break;
                                default:
                                    x50VarG5.k(i33);
                                    break;
                            }
                        }
                    }
                    break;
                case 18:
                    x50Var = x50Var7;
                    x50.c(i12, 2, i13);
                    x50 x50VarG6 = x50Var.g();
                    ArrayList arrayList15 = new ArrayList();
                    while (true) {
                        int i34 = x50VarG6.i();
                        if (i34 == 0) {
                            k32 k32Var = new k32();
                            Collections.unmodifiableList(arrayList15);
                            arrayList7.add(k32Var);
                            i2 = 2;
                            arrayList4 = arrayList4;
                            iJ2 = iJ2;
                            str = str9;
                            x50Var7 = x50Var;
                            arrayList4 = arrayList4;
                        } else {
                            int i35 = i34 >>> 3;
                            int i36 = i34 & 7;
                            if (i35 == 1) {
                                x50Var5 = x50VarG6;
                                x50.c(i35, 2, i36);
                                x50Var5.h();
                            } else if (i35 != 2) {
                                x50VarG6.k(i36);
                                x50Var5 = x50VarG6;
                            } else {
                                x50.c(i35, 2, i36);
                                x50 x50VarG7 = x50VarG6.g();
                                while (true) {
                                    int i37 = x50VarG7.i();
                                    if (i37 != 0) {
                                        int i38 = i37 >>> 3;
                                        int i39 = i37 & 7;
                                        switch (i38) {
                                            case 1:
                                                x50VarG6 = x50VarG6;
                                                x50.c(i38, 2, i39);
                                                x50VarG7.h();
                                                break;
                                            case 2:
                                                x50.c(i38, 0, i39);
                                                x50VarG7.j();
                                                break;
                                            case 3:
                                                x50.c(i38, 0, i39);
                                                x50VarG7.j();
                                                break;
                                            case 4:
                                                x50.c(i38, 0, i39);
                                                x50VarG7.j();
                                                break;
                                            case 5:
                                                x50.c(i38, 2, i39);
                                                x50VarG7.h();
                                                break;
                                            case 6:
                                                x50VarG6 = x50VarG6;
                                                x50.c(i38, 2, i39);
                                                x50VarG7.h();
                                                break;
                                            default:
                                                x50VarG7.k(i39);
                                                break;
                                        }
                                        x50VarG6 = x50VarG6;
                                    } else {
                                        x50Var5 = x50VarG6;
                                        arrayList15.add(new k42());
                                    }
                                }
                            }
                            x50VarG6 = x50Var5;
                        }
                        break;
                    }
                    break;
                case 19:
                    x50Var = x50Var7;
                    i2 = 2;
                    x50.c(i12, 2, i13);
                    x50 x50VarG8 = x50Var.g();
                    while (true) {
                        int i40 = x50VarG8.i();
                        if (i40 == 0) {
                            arrayList8.add(new k32());
                            arrayList4 = arrayList4;
                            iJ2 = iJ2;
                            str = str9;
                            x50Var7 = x50Var;
                            arrayList4 = arrayList4;
                            break;
                        } else {
                            int i41 = i40 >>> 3;
                            int i42 = i40 & 7;
                            if (i41 == 1) {
                                x50.c(i41, 0, i42);
                                x50VarG8.j();
                            } else if (i41 == 2) {
                                x50.c(i41, 2, i42);
                                x50VarG8.h();
                            } else if (i41 == 3) {
                                x50.c(i41, 2, i42);
                                x50VarG8.h();
                            } else if (i41 != 4) {
                                x50VarG8.k(i42);
                            } else {
                                x50.c(i41, 0, i42);
                                x50VarG8.j();
                            }
                        }
                    }
                    break;
                case 20:
                    x50Var = x50Var7;
                    i3 = iJ2;
                    x50.c(i12, 0, i13);
                    x50Var.j();
                    iJ2 = i3;
                    i2 = 2;
                    str = str9;
                    x50Var7 = x50Var;
                    arrayList4 = arrayList4;
                    break;
                case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                    x50Var = x50Var7;
                    int i43 = 2;
                    x50.c(i12, 2, i13);
                    x50 x50VarG9 = x50Var.g();
                    while (true) {
                        int i44 = x50VarG9.i();
                        if (i44 == 0) {
                            arrayList4.add(new ra((byte) 18, false));
                            i2 = 2;
                            iJ2 = iJ2;
                            str = str9;
                            x50Var7 = x50Var;
                            arrayList4 = arrayList4;
                        } else {
                            int i45 = i44 >>> 3;
                            int i46 = i44 & 7;
                            if (i45 == 1) {
                                x50.c(i45, i43, i46);
                                x50VarG9.f();
                            } else if (i45 != i43) {
                                x50VarG9.k(i46);
                            } else {
                                x50.c(i45, i43, i46);
                                x50VarG9.f();
                            }
                            i43 = 2;
                        }
                        break;
                    }
                    break;
                case 22:
                    x50Var = x50Var7;
                    i3 = iJ2;
                    x50.c(i12, 0, i13);
                    iJ3 = (int) x50Var.j();
                    iJ2 = i3;
                    i2 = 2;
                    str = str9;
                    x50Var7 = x50Var;
                    arrayList4 = arrayList4;
                    break;
                case 23:
                    x50Var = x50Var7;
                    i3 = iJ2;
                    x50.c(i12, 0, i13);
                    x50Var.e();
                    iJ2 = i3;
                    i2 = 2;
                    str = str9;
                    x50Var7 = x50Var;
                    arrayList4 = arrayList4;
                    break;
                case 24:
                    x50Var = x50Var7;
                    i3 = iJ2;
                    x50.c(i12, 0, i13);
                    int iJ9 = (int) x50Var.j();
                    int[] iArrG3 = p61.G(6);
                    int length3 = iArrG3.length;
                    for (int i47 = 0; i47 < length3 && p61.d(iArrG3[i47]) != iJ9; i47++) {
                    }
                    iJ2 = i3;
                    i2 = 2;
                    str = str9;
                    x50Var7 = x50Var;
                    arrayList4 = arrayList4;
                    break;
                case 25:
                    x50Var = x50Var7;
                    x50.c(i12, 2, i13);
                    u28.f(x50Var.g(), map3);
                    i2 = 2;
                    iJ2 = iJ2;
                    str = str9;
                    x50Var7 = x50Var;
                    arrayList4 = arrayList4;
                    break;
                case 26:
                    x50.c(i12, 2, i13);
                    x50 x50VarG10 = x50Var7.g();
                    ArrayList arrayList16 = new ArrayList();
                    while (true) {
                        int i48 = x50VarG10.i();
                        if (i48 == 0) {
                            x50Var = x50Var7;
                            i3 = iJ2;
                            Collections.unmodifiableList(arrayList16);
                            iJ2 = i3;
                            i2 = 2;
                            str = str9;
                            x50Var7 = x50Var;
                            arrayList4 = arrayList4;
                        } else {
                            x50 x50Var10 = x50Var7;
                            int i49 = i48 >>> 3;
                            int i50 = i48 & 7;
                            int i51 = iJ2;
                            if (i49 == 1) {
                                x50Var6 = x50VarG10;
                                x50.c(i49, 0, i50);
                                x50Var6.j();
                            } else if (i49 != 2) {
                                x50VarG10.k(i50);
                                x50Var6 = x50VarG10;
                            } else {
                                x50.c(i49, 2, i50);
                                x50 x50VarG11 = x50VarG10.g();
                                while (true) {
                                    int i52 = x50VarG11.i();
                                    if (i52 != 0) {
                                        int i53 = i52 >>> 3;
                                        int i54 = i52 & 7;
                                        x50 x50Var11 = x50VarG10;
                                        if (i53 == 1) {
                                            x50.c(i53, 2, i54);
                                            u28.d(x50VarG11.g());
                                        } else if (i53 == 2) {
                                            x50.c(i53, 0, i54);
                                            x50VarG11.j();
                                        } else if (i53 != 3) {
                                            x50VarG11.k(i54);
                                        } else {
                                            x50.c(i53, 0, i54);
                                            x50VarG11.j();
                                        }
                                        x50VarG10 = x50Var11;
                                    } else {
                                        x50Var6 = x50VarG10;
                                        arrayList16.add(new we5((byte) 24));
                                    }
                                }
                            }
                            x50VarG10 = x50Var6;
                            x50Var7 = x50Var10;
                            iJ2 = i51;
                        }
                        break;
                    }
                    break;
            }
        }
    }
}
