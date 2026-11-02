package defpackage;

import android.graphics.Matrix;
import android.util.Xml;
import io.sentry.s6;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal.dns._DnsMessageKt;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.url._UrlKt;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import org.conscrypt.HpkeSuite;
import org.conscrypt.metrics.ConscryptStatsLog;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class pu6 {
    public f63 a;
    public ct6 b;
    public boolean c;
    public int d;
    public boolean e;
    public nu6 f;
    public StringBuilder g;
    public boolean h;
    public StringBuilder i;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:150:0x0264  */
    /* JADX WARN: Code duplicated, block: B:174:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:233:0x036d  */
    /* JADX WARN: Code duplicated, block: B:309:0x0480  */
    /* JADX WARN: Code duplicated, block: B:343:0x04da  */
    /* JADX WARN: Code duplicated, block: B:388:0x0572  */
    public static void C(ys6 ys6Var, String str, String str2) {
        int i;
        int i2;
        String strN;
        ks6 ks6VarS;
        int i3;
        int i4;
        ks6 ks6VarK;
        int i5;
        int i6;
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        int iOrdinal = mu6.a(str).ordinal();
        yr6 yr6Var = null;
        ks6 ks6VarS2 = null;
        ks6VarArr = null;
        ks6VarArr = null;
        ks6VarArr = null;
        ks6VarArr = null;
        ks6VarArr = null;
        ks6[] ks6VarArr = null;
        String strSubstring = null;
        Boolean bool = null;
        yr6Var = null;
        yr6Var = null;
        if (iOrdinal == 1) {
            if (!"auto".equals(str2) && str2.startsWith("rect(")) {
                nv0 nv0Var = new nv0(str2.substring(5));
                nv0Var.T();
                ks6 ks6VarU = u(nv0Var);
                nv0Var.S();
                ks6 ks6VarU2 = u(nv0Var);
                nv0Var.S();
                ks6 ks6VarU3 = u(nv0Var);
                nv0Var.S();
                ks6 ks6VarU4 = u(nv0Var);
                nv0Var.T();
                if (nv0Var.s(')') || nv0Var.w()) {
                    yr6Var = new yr6((byte) 0);
                    yr6Var.Y = ks6VarU;
                    yr6Var.Z = ks6VarU2;
                    yr6Var.f0 = ks6VarU3;
                    yr6Var.g0 = ks6VarU4;
                }
            }
            ys6Var.r0 = yr6Var;
            if (yr6Var != null) {
                ys6Var.X |= s6.MAX_EVENT_SIZE_BYTES;
                return;
            }
            return;
        }
        if (iOrdinal == 2) {
            ys6Var.z0 = r(str2);
            ys6Var.X |= 268435456;
            return;
        }
        if (iOrdinal == 4) {
            ys6Var.M0 = "nonzero".equals(str2) ? 1 : "evenodd".equals(str2) ? 2 : 0;
            ys6Var.X |= 536870912;
        }
        try {
            if (iOrdinal == 5) {
                ys6Var.m0 = n(str2);
                ys6Var.X |= 4096;
                return;
            }
            if (iOrdinal == 8) {
                int i7 = str2.equals("ltr") ? 1 : !str2.equals("rtl") ? 0 : 2;
                ys6Var.K0 = i7;
                if (i7 != 0) {
                    ys6Var.X |= 68719476736L;
                    return;
                }
                return;
            }
            if (iOrdinal == 35) {
                ys6Var.A0 = r(str2);
                ys6Var.X |= 1073741824;
                return;
            }
            if (iOrdinal == 40) {
                ys6Var.l0 = v(str2);
                ys6Var.X |= 2048;
                return;
            }
            if (iOrdinal == 42) {
                switch (str2) {
                    case "hidden":
                    case "scroll":
                        bool = Boolean.FALSE;
                        break;
                    case "auto":
                    case "visible":
                        bool = Boolean.TRUE;
                        break;
                }
                ys6Var.q0 = bool;
                if (bool != null) {
                    ys6Var.X |= 524288;
                    return;
                }
                return;
            }
            if (iOrdinal == 78) {
                int i8 = str2.equals("none") ? 1 : !str2.equals("non-scaling-stroke") ? 0 : 2;
                ys6Var.N0 = i8;
                if (i8 != 0) {
                    ys6Var.X |= 34359738368L;
                    return;
                }
                return;
            }
            cs6 cs6Var = cs6.X;
            if (iOrdinal == 58) {
                if (str2.equals("currentColor")) {
                    ys6Var.B0 = cs6Var;
                } else {
                    try {
                        ys6Var.B0 = n(str2);
                    } catch (gu6 e) {
                        e.getMessage();
                        return;
                    }
                }
                ys6Var.X |= 2147483648L;
                return;
            }
            if (iOrdinal == 59) {
                ys6Var.C0 = v(str2);
                ys6Var.X |= 4294967296L;
                return;
            }
            if (iOrdinal == 74) {
                switch (str2) {
                    case "middle":
                        i = 2;
                        break;
                    case "end":
                        i = 3;
                        break;
                    case "start":
                        i = 1;
                        break;
                    default:
                        i = 0;
                        break;
                }
                ys6Var.L0 = i;
                if (i != 0) {
                    ys6Var.X |= _HeadersCommonKt.HEADER_LIMIT;
                    return;
                }
                return;
            }
            if (iOrdinal == 75) {
                switch (str2) {
                    case "line-through":
                        i2 = 4;
                        break;
                    case "underline":
                        i2 = 2;
                        break;
                    case "none":
                        i2 = 1;
                        break;
                    case "blink":
                        i2 = 5;
                        break;
                    case "overline":
                        i2 = 3;
                        break;
                    default:
                        i2 = 0;
                        break;
                }
                ys6Var.J0 = i2;
                if (i2 != 0) {
                    ys6Var.X |= 131072;
                    return;
                }
                return;
            }
            switch (iOrdinal) {
                case 14:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains("|" + str2 + '|')) {
                            ys6Var.v0 = Boolean.valueOf(!str2.equals("none"));
                            ys6Var.X |= 16777216;
                            break;
                        }
                    }
                    break;
                case 15:
                    ht6 ht6VarW = w(str2);
                    ys6Var.Y = ht6VarW;
                    if (ht6VarW != null) {
                        ys6Var.X |= 1;
                    }
                    break;
                case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                    int i9 = "nonzero".equals(str2) ? 1 : "evenodd".equals(str2) ? 2 : 0;
                    ys6Var.F0 = i9;
                    if (i9 != 0) {
                        ys6Var.X |= 2;
                    }
                    break;
                case 17:
                    Float fV = v(str2);
                    ys6Var.Z = fV;
                    if (fV != null) {
                        ys6Var.X |= 4;
                    }
                    break;
                case 18:
                    if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains("|" + str2 + '|')) {
                        nv0 nv0Var2 = new nv0(str2);
                        Integer num = null;
                        String str3 = null;
                        int i10 = 0;
                        while (true) {
                            strN = nv0Var2.N('/', false);
                            nv0Var2.T();
                            if (strN == null) {
                                break;
                            } else if (num == null || i10 == 0) {
                                if (!strN.equals("normal") && (num != null || (num = (Integer) ku6.a.get(strN)) == null)) {
                                    if (i10 == 0) {
                                        switch (strN) {
                                            case "oblique":
                                                i10 = 3;
                                                break;
                                            case "italic":
                                                i10 = 2;
                                                break;
                                            case "normal":
                                                i10 = 1;
                                                break;
                                            default:
                                                i10 = 0;
                                                break;
                                        }
                                        if (i10 != 0) {
                                            continue;
                                        }
                                    }
                                    if (str3 == null && strN.equals("small-caps")) {
                                        str3 = strN;
                                    }
                                }
                            }
                        }
                        try {
                            ks6VarS = (ks6) ju6.a.get(strN);
                            if (ks6VarS == null) {
                                ks6VarS = s(strN);
                            }
                        } catch (gu6 unused) {
                            ks6VarS = null;
                        }
                        if (nv0Var2.s('/')) {
                            nv0Var2.T();
                            String strM = nv0Var2.M();
                            if (strM != null) {
                                s(strM);
                            }
                            nv0Var2.T();
                        }
                        if (!nv0Var2.w()) {
                            int i11 = nv0Var2.X;
                            nv0Var2.X = nv0Var2.Y;
                            strSubstring = ((String) nv0Var2.Z).substring(i11);
                        }
                        ys6Var.n0 = q(strSubstring);
                        ys6Var.o0 = ks6VarS;
                        ys6Var.p0 = Integer.valueOf(num == null ? 400 : num.intValue());
                        ys6Var.I0 = i10 == 0 ? 1 : i10;
                        ys6Var.X |= 122880;
                        break;
                    }
                    break;
                case 19:
                    ArrayList arrayListQ = q(str2);
                    ys6Var.n0 = arrayListQ;
                    if (arrayListQ != null) {
                        ys6Var.X |= 8192;
                    }
                    break;
                case 20:
                    try {
                        ks6 ks6Var = (ks6) ju6.a.get(str2);
                        ks6VarS2 = ks6Var == null ? s(str2) : ks6Var;
                        break;
                    } catch (gu6 unused2) {
                    }
                    ys6Var.o0 = ks6VarS2;
                    if (ks6VarS2 != null) {
                        ys6Var.X |= Http2Stream.EMIT_BUFFER_SIZE;
                    }
                    break;
                case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                    Integer num2 = (Integer) ku6.a.get(str2);
                    ys6Var.p0 = num2;
                    if (num2 != null) {
                        ys6Var.X |= 32768;
                    }
                    break;
                case 22:
                    switch (str2) {
                        case "oblique":
                            i3 = 3;
                            break;
                        case "italic":
                            i3 = 2;
                            break;
                        case "normal":
                            i3 = 1;
                            break;
                        default:
                            i3 = 0;
                            break;
                    }
                    ys6Var.I0 = i3;
                    if (i3 != 0) {
                        ys6Var.X |= 65536;
                    }
                    break;
                default:
                    switch (iOrdinal) {
                        case 27:
                            switch (str2) {
                                case "optimizeQuality":
                                    i4 = 2;
                                    break;
                                case "auto":
                                    i4 = 1;
                                    break;
                                case "optimizeSpeed":
                                    i4 = 3;
                                    break;
                                default:
                                    i4 = 0;
                                    break;
                            }
                            ys6Var.O0 = i4;
                            if (i4 != 0) {
                                ys6Var.X |= 137438953472L;
                            }
                            break;
                        case _DnsMessageKt.TYPE_AAAA /* 28 */:
                            String strR = r(str2);
                            ys6Var.s0 = strR;
                            ys6Var.t0 = strR;
                            ys6Var.u0 = strR;
                            ys6Var.X |= 14680064;
                            break;
                        case 29:
                            ys6Var.s0 = r(str2);
                            ys6Var.X |= 2097152;
                            break;
                        case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
                            ys6Var.t0 = r(str2);
                            ys6Var.X |= 4194304;
                            break;
                        case 31:
                            ys6Var.u0 = r(str2);
                            ys6Var.X |= 8388608;
                            break;
                        default:
                            switch (iOrdinal) {
                                case 62:
                                    if (str2.equals("currentColor")) {
                                        ys6Var.x0 = cs6Var;
                                    } else {
                                        try {
                                            ys6Var.x0 = n(str2);
                                        } catch (gu6 e2) {
                                            e2.getMessage();
                                            return;
                                        }
                                    }
                                    ys6Var.X |= 67108864;
                                    break;
                                case 63:
                                    ys6Var.y0 = v(str2);
                                    ys6Var.X |= 134217728;
                                    break;
                                case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                                    ht6 ht6VarW2 = w(str2);
                                    ys6Var.f0 = ht6VarW2;
                                    if (ht6VarW2 != null) {
                                        ys6Var.X |= 8;
                                    }
                                    break;
                                case 65:
                                    if (!"none".equals(str2)) {
                                        nv0 nv0Var3 = new nv0(str2);
                                        nv0Var3.T();
                                        if (!nv0Var3.w() && (ks6VarK = nv0Var3.K()) != null && !ks6VarK.f()) {
                                            float f = ks6VarK.X;
                                            ArrayList arrayList = new ArrayList();
                                            arrayList.add(ks6VarK);
                                            while (true) {
                                                if (!nv0Var3.w()) {
                                                    nv0Var3.S();
                                                    ks6 ks6VarK2 = nv0Var3.K();
                                                    if (ks6VarK2 != null && !ks6VarK2.f()) {
                                                        arrayList.add(ks6VarK2);
                                                        f += ks6VarK2.X;
                                                    }
                                                } else if (f != 0.0f) {
                                                    ks6VarArr = (ks6[]) arrayList.toArray(new ks6[arrayList.size()]);
                                                }
                                            }
                                        }
                                        ys6Var.j0 = ks6VarArr;
                                        if (ks6VarArr != null) {
                                            ys6Var.X |= 512;
                                        }
                                    } else {
                                        ys6Var.j0 = null;
                                        ys6Var.X |= 512;
                                    }
                                    break;
                                case HpkeSuite.KEM_MLKEM_1024 /* 66 */:
                                    ys6Var.k0 = s(str2);
                                    ys6Var.X |= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
                                    break;
                                case 67:
                                    if ("butt".equals(str2)) {
                                        i5 = 1;
                                    } else if ("round".equals(str2)) {
                                        i5 = 2;
                                    } else {
                                        i5 = "square".equals(str2) ? 3 : 0;
                                    }
                                    ys6Var.G0 = i5;
                                    if (i5 != 0) {
                                        ys6Var.X |= 64;
                                    }
                                    break;
                                case 68:
                                    if ("miter".equals(str2)) {
                                        i6 = 1;
                                    } else if ("round".equals(str2)) {
                                        i6 = 2;
                                    } else {
                                        i6 = "bevel".equals(str2) ? 3 : 0;
                                    }
                                    ys6Var.H0 = i6;
                                    if (i6 != 0) {
                                        ys6Var.X |= 128;
                                    }
                                    break;
                                case 69:
                                    ys6Var.i0 = Float.valueOf(p(str2));
                                    ys6Var.X |= 256;
                                    break;
                                case 70:
                                    Float fV2 = v(str2);
                                    ys6Var.g0 = fV2;
                                    if (fV2 != null) {
                                        ys6Var.X |= 16;
                                    }
                                    break;
                                case 71:
                                    ys6Var.h0 = s(str2);
                                    ys6Var.X |= 32;
                                    break;
                                default:
                                    switch (iOrdinal) {
                                        case 88:
                                            if (str2.equals("currentColor")) {
                                                ys6Var.D0 = cs6Var;
                                            } else {
                                                try {
                                                    ys6Var.D0 = n(str2);
                                                } catch (gu6 e3) {
                                                    e3.getMessage();
                                                    return;
                                                }
                                            }
                                            ys6Var.X |= 8589934592L;
                                            break;
                                        case 89:
                                            ys6Var.E0 = v(str2);
                                            ys6Var.X |= 17179869184L;
                                            break;
                                        case 90:
                                            if (str2.indexOf(124) < 0) {
                                                if ("|visible|hidden|collapse|".contains("|" + str2 + '|')) {
                                                    ys6Var.w0 = Boolean.valueOf(str2.equals("visible"));
                                                    ys6Var.X |= 33554432;
                                                    break;
                                                }
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } catch (gu6 unused3) {
        }
    }

    public static int b(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    public static int d(float f, float f2, float f3) {
        float f4 = 0.0f;
        float f5 = f % 360.0f;
        if (f < 0.0f) {
            f5 += 360.0f;
        }
        float f6 = f5 / 60.0f;
        float f7 = f2 / 100.0f;
        float f8 = f3 / 100.0f;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (f8 >= 0.0f) {
            f4 = f8 > 1.0f ? 1.0f : f8;
        }
        float f9 = f4 <= 0.5f ? (f7 + 1.0f) * f4 : (f4 + f7) - (f7 * f4);
        float f10 = (f4 * 2.0f) - f9;
        return b(e(f10, f9, f6 - 2.0f) * 256.0f) | (b(e(f10, f9, f6 + 2.0f) * 256.0f) << 16) | (b(e(f10, f9, f6) * 256.0f) << 8);
    }

    public static float e(float f, float f2, float f3) {
        if (f3 < 0.0f) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        if (f3 < 1.0f) {
            return p61.e(f2, f, f3, f);
        }
        if (f3 < 3.0f) {
            return f2;
        }
        return f3 < 4.0f ? p61.e(4.0f, f3, f2 - f, f) : f;
    }

    public static void f(at6 at6Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iH = pc6.h(attributes, i);
            if (iH != 73) {
                switch (iH) {
                    case 52:
                        nv0 nv0Var = new nv0(strTrim);
                        HashSet hashSet = new HashSet();
                        while (!nv0Var.w()) {
                            String strM = nv0Var.M();
                            if (strM.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet.add(strM.substring(35));
                            } else {
                                hashSet.add("UNSUPPORTED");
                            }
                            nv0Var.T();
                        }
                        at6Var.d(hashSet);
                        break;
                    case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_CBC_SHA /* 53 */:
                        at6Var.i(strTrim);
                        break;
                    case 54:
                        nv0 nv0Var2 = new nv0(strTrim);
                        HashSet hashSet2 = new HashSet();
                        while (!nv0Var2.w()) {
                            hashSet2.add(nv0Var2.M());
                            nv0Var2.T();
                        }
                        at6Var.j(hashSet2);
                        break;
                    case 55:
                        ArrayList arrayListQ = q(strTrim);
                        at6Var.h(arrayListQ != null ? new HashSet(arrayListQ) : new HashSet(0));
                        break;
                }
            } else {
                nv0 nv0Var3 = new nv0(strTrim);
                HashSet hashSet3 = new HashSet();
                while (!nv0Var3.w()) {
                    String strM2 = nv0Var3.M();
                    int iIndexOf = strM2.indexOf(45);
                    if (iIndexOf != -1) {
                        strM2 = strM2.substring(0, iIndexOf);
                    }
                    hashSet3.add(new Locale(strM2, _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET).getLanguage());
                    nv0Var3.T();
                }
                at6Var.k(hashSet3);
            }
        }
    }

    public static void g(et6 et6Var, Attributes attributes) throws gu6 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                et6Var.c = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i).trim();
                if ("default".equals(strTrim)) {
                    et6Var.d = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(strTrim)) {
                        throw new gu6(oi0.l("Invalid value for \"xml:space\" attribute: ", strTrim));
                    }
                    et6Var.d = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    public static void h(fs6 fs6Var, Attributes attributes) throws gu6 {
        int i;
        for (int i2 = 0; i2 < attributes.getLength(); i2++) {
            String strTrim = attributes.getValue(i2).trim();
            int iH = pc6.h(attributes, i2);
            if (iH == 23) {
                fs6Var.j = z(strTrim);
            } else if (iH != 24) {
                if (iH != 26) {
                    if (iH == 60) {
                        if (strTrim != null) {
                            try {
                                if (strTrim.equals("pad")) {
                                    i = 1;
                                } else if (strTrim.equals("reflect")) {
                                    i = 2;
                                } else if (strTrim.equals("repeat")) {
                                    i = 3;
                                } else {
                                    bt.q("No enum constant com.caverock.androidsvg.SVG.GradientSpread.".concat(strTrim));
                                }
                                fs6Var.k = i;
                            } catch (IllegalArgumentException unused) {
                                throw new gu6(pc6.p("Invalid spreadMethod attribute. \"", strTrim, "\" is not a valid value."));
                            }
                        } else {
                            b61.i("Name is null");
                        }
                        i = 0;
                        fs6Var.k = i;
                    } else {
                        continue;
                    }
                } else if (_UrlKt.FRAGMENT_ENCODE_SET.equals(attributes.getURI(i2)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i2))) {
                    fs6Var.l = strTrim;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                fs6Var.i = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    kp5.r("Invalid value for attribute gradientUnits");
                    return;
                }
                fs6Var.i = Boolean.TRUE;
            }
        }
    }

    public static void i(ts6 ts6Var, Attributes attributes, String str) throws gu6 {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (mu6.a(attributes.getLocalName(i)) == mu6.Y) {
                nv0 nv0Var = new nv0(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                nv0Var.T();
                while (!nv0Var.w()) {
                    float fJ = nv0Var.J();
                    if (Float.isNaN(fJ)) {
                        throw new gu6(pc6.p("Invalid <", str, "> points attribute. Non-coordinate content found in list."));
                    }
                    nv0Var.S();
                    float fJ2 = nv0Var.J();
                    if (Float.isNaN(fJ2)) {
                        throw new gu6(pc6.p("Invalid <", str, "> points attribute. There should be an even number of coordinates."));
                    }
                    nv0Var.S();
                    arrayList.add(Float.valueOf(fJ));
                    arrayList.add(Float.valueOf(fJ2));
                }
                ts6Var.o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    ts6Var.o[i2] = ((Float) it.next()).floatValue();
                    i2++;
                }
            }
        }
    }

    public static void j(et6 et6Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (strTrim.length() != 0) {
                int iH = pc6.h(attributes, i);
                if (iH == 0) {
                    sb0 sb0Var = new sb0(strTrim);
                    ArrayList arrayList = null;
                    while (!sb0Var.w()) {
                        String strM = sb0Var.M();
                        if (strM != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(strM);
                            sb0Var.T();
                        }
                    }
                    et6Var.g = arrayList;
                } else if (iH != 72) {
                    ys6 ys6Var = et6Var.e;
                    if (ys6Var == null) {
                        ys6Var = new ys6();
                        et6Var.e = ys6Var;
                    }
                    C(ys6Var, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    nv0 nv0Var = new nv0(strTrim.replaceAll("/\\*.*?\\*/", _UrlKt.FRAGMENT_ENCODE_SET));
                    while (true) {
                        String strN = nv0Var.N(':', false);
                        nv0Var.T();
                        if (!nv0Var.s(':')) {
                            break;
                        }
                        nv0Var.T();
                        String strN2 = nv0Var.N(';', true);
                        if (strN2 == null) {
                            break;
                        }
                        nv0Var.T();
                        if (nv0Var.w() || nv0Var.s(';')) {
                            ys6 ys6Var2 = et6Var.f;
                            if (ys6Var2 == null) {
                                ys6Var2 = new ys6();
                                et6Var.f = ys6Var2;
                            }
                            C(ys6Var2, strN, strN2);
                            nv0Var.T();
                        }
                    }
                }
            }
        }
    }

    public static void k(tt6 tt6Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iH = pc6.h(attributes, i);
            if (iH == 9) {
                tt6Var.p = t(strTrim);
            } else if (iH == 10) {
                tt6Var.q = t(strTrim);
            } else if (iH == 82) {
                tt6Var.n = t(strTrim);
            } else if (iH == 83) {
                tt6Var.o = t(strTrim);
            }
        }
    }

    public static void l(is6 is6Var, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (mu6.a(attributes.getLocalName(i)) == mu6.Z) {
                is6Var.l(z(attributes.getValue(i)));
            }
        }
    }

    public static void m(kt6 kt6Var, Attributes attributes) throws gu6 {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iH = pc6.h(attributes, i);
            if (iH == 48) {
                x(kt6Var, strTrim);
            } else if (iH != 80) {
                continue;
            } else {
                nv0 nv0Var = new nv0(strTrim);
                nv0Var.T();
                float fJ = nv0Var.J();
                nv0Var.S();
                float fJ2 = nv0Var.J();
                nv0Var.S();
                float fJ3 = nv0Var.J();
                nv0Var.S();
                float fJ4 = nv0Var.J();
                if (Float.isNaN(fJ) || Float.isNaN(fJ2) || Float.isNaN(fJ3) || Float.isNaN(fJ4)) {
                    kp5.r("Invalid viewBox definition - should have four numbers");
                    return;
                } else if (fJ3 < 0.0f) {
                    kp5.r("Invalid viewBox. width cannot be negative");
                    return;
                } else {
                    if (fJ4 < 0.0f) {
                        kp5.r("Invalid viewBox. height cannot be negative");
                        return;
                    }
                    kt6Var.o = new r05(fJ, fJ2, fJ3, fJ4);
                }
            }
        }
    }

    public static bs6 n(String str) throws gu6 {
        long j;
        int i;
        if (str.charAt(0) == '#') {
            int length = str.length();
            xe3 xe3Var = null;
            if (1 < length) {
                long j2 = 0;
                int i2 = 1;
                while (true) {
                    if (i2 < length) {
                        char cCharAt = str.charAt(i2);
                        if (cCharAt < '0' || cCharAt > '9') {
                            if (cCharAt >= 'A' && cCharAt <= 'F') {
                                j = j2 * 16;
                                i = cCharAt - 'A';
                            } else if (cCharAt >= 'a' && cCharAt <= 'f') {
                                j = j2 * 16;
                                i = cCharAt - 'a';
                            }
                            j2 = j + ((long) i) + 10;
                        } else {
                            j2 = (j2 * 16) + ((long) (cCharAt - '0'));
                        }
                        if (j2 <= 4294967295L) {
                            i2++;
                        }
                    }
                    if (i2 != 1) {
                        xe3Var = new xe3(j2, i2);
                    }
                }
            }
            if (xe3Var == null) {
                throw new gu6("Bad hex colour value: ".concat(str));
            }
            long j3 = xe3Var.Y;
            int i3 = xe3Var.X;
            if (i3 == 4) {
                int i4 = (int) j3;
                int i5 = i4 & 3840;
                int i6 = i4 & 240;
                int i7 = i4 & 15;
                return new bs6(i7 | (i5 << 8) | (-16777216) | (i5 << 12) | (i6 << 8) | (i6 << 4) | (i7 << 4));
            }
            if (i3 != 5) {
                if (i3 == 7) {
                    return new bs6(((int) j3) | (-16777216));
                }
                if (i3 != 9) {
                    throw new gu6("Bad hex colour value: ".concat(str));
                }
                int i8 = (int) j3;
                return new bs6((i8 >>> 8) | (i8 << 24));
            }
            int i9 = (int) j3;
            int i10 = 61440 & i9;
            int i11 = i9 & 3840;
            int i12 = i9 & 240;
            int i13 = i9 & 15;
            return new bs6((i13 << 24) | (i13 << 28) | (i10 << 8) | (i10 << 4) | (i11 << 4) | i11 | i12 | (i12 >> 4));
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (zStartsWith || lowerCase.startsWith("rgb(")) {
            nv0 nv0Var = new nv0(str.substring(zStartsWith ? 5 : 4));
            nv0Var.T();
            float fJ = nv0Var.J();
            if (!Float.isNaN(fJ) && nv0Var.s('%')) {
                fJ = (fJ * 256.0f) / 100.0f;
            }
            float fJ2 = nv0Var.j(fJ);
            if (!Float.isNaN(fJ2) && nv0Var.s('%')) {
                fJ2 = (fJ2 * 256.0f) / 100.0f;
            }
            float fJ3 = nv0Var.j(fJ2);
            if (!Float.isNaN(fJ3) && nv0Var.s('%')) {
                fJ3 = (fJ3 * 256.0f) / 100.0f;
            }
            if (!zStartsWith) {
                nv0Var.T();
                if (Float.isNaN(fJ3) || !nv0Var.s(')')) {
                    throw new gu6("Bad rgb() colour value: ".concat(str));
                }
                return new bs6((b(fJ) << 16) | (-16777216) | (b(fJ2) << 8) | b(fJ3));
            }
            float fJ4 = nv0Var.j(fJ3);
            nv0Var.T();
            if (Float.isNaN(fJ4) || !nv0Var.s(')')) {
                throw new gu6("Bad rgba() colour value: ".concat(str));
            }
            return new bs6((b(fJ4 * 256.0f) << 24) | (b(fJ) << 16) | (b(fJ2) << 8) | b(fJ3));
        }
        boolean zStartsWith2 = lowerCase.startsWith("hsla(");
        if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
            Integer num = (Integer) iu6.a.get(lowerCase);
            if (num != null) {
                return new bs6(num.intValue());
            }
            throw new gu6("Invalid colour keyword: ".concat(lowerCase));
        }
        nv0 nv0Var2 = new nv0(str.substring(zStartsWith2 ? 5 : 4));
        nv0Var2.T();
        float fJ5 = nv0Var2.J();
        float fJ6 = nv0Var2.j(fJ5);
        if (!Float.isNaN(fJ6)) {
            nv0Var2.s('%');
        }
        float fJ7 = nv0Var2.j(fJ6);
        if (!Float.isNaN(fJ7)) {
            nv0Var2.s('%');
        }
        if (!zStartsWith2) {
            nv0Var2.T();
            if (Float.isNaN(fJ7) || !nv0Var2.s(')')) {
                throw new gu6("Bad hsl() colour value: ".concat(str));
            }
            return new bs6(d(fJ5, fJ6, fJ7) | (-16777216));
        }
        float fJ8 = nv0Var2.j(fJ7);
        nv0Var2.T();
        if (Float.isNaN(fJ8) || !nv0Var2.s(')')) {
            throw new gu6("Bad hsla() colour value: ".concat(str));
        }
        return new bs6((b(fJ8 * 256.0f) << 24) | d(fJ5, fJ6, fJ7));
    }

    public static float o(int i, String str) throws gu6 {
        float fB = new r75((byte) 0).b(0, i, str);
        if (Float.isNaN(fB)) {
            throw new gu6(oi0.l("Invalid float value: ", str));
        }
        return fB;
    }

    public static float p(String str) throws gu6 {
        int length = str.length();
        if (length != 0) {
            return o(length, str);
        }
        kp5.r("Invalid float value (empty string)");
        return 0.0f;
    }

    public static ArrayList q(String str) {
        nv0 nv0Var = new nv0(str);
        ArrayList arrayList = null;
        do {
            String strL = nv0Var.L();
            if (strL == null) {
                strL = nv0Var.N(',', true);
            }
            if (strL == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strL);
            nv0Var.S();
        } while (!nv0Var.w());
        return arrayList;
    }

    public static String r(String str) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    public static ks6 s(String str) throws gu6 {
        int iX;
        if (str.length() == 0) {
            kp5.r("Invalid length value (empty string)");
            return null;
        }
        int length = str.length();
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            iX = 9;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                iX = pc6.x(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new gu6("Invalid length unit specifier: ".concat(str));
            }
        } else {
            iX = 1;
        }
        try {
            return new ks6(iX, o(length, str));
        } catch (NumberFormatException e) {
            throw new gu6("Invalid length value: ".concat(str), e);
        }
    }

    public static ArrayList t(String str) throws gu6 {
        if (str.length() == 0) {
            kp5.r("Invalid length list (empty string)");
            return null;
        }
        ArrayList arrayList = new ArrayList(1);
        nv0 nv0Var = new nv0(str);
        nv0Var.T();
        while (!nv0Var.w()) {
            float fJ = nv0Var.J();
            if (Float.isNaN(fJ)) {
                StringBuilder sb = new StringBuilder("Invalid length list value: ");
                String str2 = (String) nv0Var.Z;
                int i = nv0Var.X;
                while (!nv0Var.w() && !nv0.F(str2.charAt(nv0Var.X))) {
                    nv0Var.X++;
                }
                String strSubstring = str2.substring(i, nv0Var.X);
                nv0Var.X = i;
                sb.append(strSubstring);
                throw new gu6(sb.toString());
            }
            int iO = nv0Var.O();
            if (iO == 0) {
                iO = 1;
            }
            arrayList.add(new ks6(iO, fJ));
            nv0Var.S();
        }
        return arrayList;
    }

    public static ks6 u(nv0 nv0Var) {
        return nv0Var.u("auto") ? new ks6(0.0f) : nv0Var.K();
    }

    public static Float v(String str) {
        try {
            float fP = p(str);
            float f = 0.0f;
            if (fP < 0.0f) {
                fP = f;
            } else {
                f = 1.0f;
                if (fP > 1.0f) {
                    fP = f;
                }
            }
            return Float.valueOf(fP);
        } catch (gu6 unused) {
            return null;
        }
    }

    public static ht6 w(String str) {
        boolean zStartsWith = str.startsWith("url(");
        ht6 ht6VarN = bs6.Z;
        cs6 cs6Var = cs6.X;
        ht6 ht6Var = null;
        if (!zStartsWith) {
            if (str.equals("none")) {
                return ht6VarN;
            }
            if (str.equals("currentColor")) {
                return cs6Var;
            }
            try {
                return n(str);
            } catch (gu6 unused) {
                return null;
            }
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new ps6(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        if (strTrim2.length() > 0) {
            if (!strTrim2.equals("none")) {
                if (strTrim2.equals("currentColor")) {
                    ht6VarN = cs6Var;
                } else {
                    try {
                        ht6VarN = n(strTrim2);
                    } catch (gu6 unused2) {
                        ht6VarN = null;
                    }
                }
            }
            ht6Var = ht6VarN;
        }
        return new ps6(strTrim, ht6Var);
    }

    public static void x(it6 it6Var, String str) throws gu6 {
        int i;
        nv0 nv0Var = new nv0(str);
        nv0Var.T();
        String strM = nv0Var.M();
        if ("defer".equals(strM)) {
            nv0Var.T();
            strM = nv0Var.M();
        }
        ys5 ys5Var = (ys5) hu6.a.get(strM);
        nv0Var.T();
        if (nv0Var.w()) {
            i = 0;
        } else {
            String strM2 = nv0Var.M();
            strM2.getClass();
            if (strM2.equals("meet")) {
                i = 1;
            } else {
                if (!strM2.equals("slice")) {
                    throw new gu6("Invalid preserveAspectRatio definition: ".concat(str));
                }
                i = 2;
            }
        }
        it6Var.n = new zs5(ys5Var, i);
    }

    public static HashMap y(nv0 nv0Var) {
        HashMap map = new HashMap();
        nv0Var.T();
        String strN = nv0Var.N('=', false);
        while (strN != null) {
            nv0Var.s('=');
            map.put(strN, nv0Var.L());
            nv0Var.T();
            strN = nv0Var.N('=', false);
        }
        return map;
    }

    public static Matrix z(String str) throws gu6 {
        Matrix matrix = new Matrix();
        nv0 nv0Var = new nv0(str);
        nv0Var.T();
        while (!nv0Var.w()) {
            String str2 = (String) nv0Var.Z;
            String strSubstring = null;
            if (!nv0Var.w()) {
                int i = nv0Var.X;
                int iCharAt = str2.charAt(i);
                while (true) {
                    if ((iCharAt >= 97 && iCharAt <= 122) || (iCharAt >= 65 && iCharAt <= 90)) {
                        iCharAt = nv0Var.g();
                    }
                }
                int i2 = nv0Var.X;
                while (nv0.F(iCharAt)) {
                    iCharAt = nv0Var.g();
                }
                if (iCharAt == 40) {
                    nv0Var.X++;
                    strSubstring = str2.substring(i, i2);
                } else {
                    nv0Var.X = i;
                }
            }
            if (strSubstring == null) {
                throw new gu6("Bad transform function encountered in transform list: ".concat(str));
            }
            switch (strSubstring) {
                case "matrix":
                    nv0Var.T();
                    float fJ = nv0Var.J();
                    nv0Var.S();
                    float fJ2 = nv0Var.J();
                    nv0Var.S();
                    float fJ3 = nv0Var.J();
                    nv0Var.S();
                    float fJ4 = nv0Var.J();
                    nv0Var.S();
                    float fJ5 = nv0Var.J();
                    nv0Var.S();
                    float fJ6 = nv0Var.J();
                    nv0Var.T();
                    if (Float.isNaN(fJ6) || !nv0Var.s(')')) {
                        throw new gu6("Invalid transform list: ".concat(str));
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fJ, fJ3, fJ5, fJ2, fJ4, fJ6, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    nv0Var.T();
                    float fJ7 = nv0Var.J();
                    float fP = nv0Var.P();
                    float fP2 = nv0Var.P();
                    nv0Var.T();
                    if (Float.isNaN(fJ7) || !nv0Var.s(')')) {
                        throw new gu6("Invalid transform list: ".concat(str));
                    }
                    if (Float.isNaN(fP)) {
                        matrix.preRotate(fJ7);
                    } else {
                        if (Float.isNaN(fP2)) {
                            throw new gu6("Invalid transform list: ".concat(str));
                        }
                        matrix.preRotate(fJ7, fP, fP2);
                    }
                    break;
                    break;
                case "scale":
                    nv0Var.T();
                    float fJ8 = nv0Var.J();
                    float fP3 = nv0Var.P();
                    nv0Var.T();
                    if (Float.isNaN(fJ8) || !nv0Var.s(')')) {
                        throw new gu6("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fP3)) {
                        matrix.preScale(fJ8, fP3);
                    } else {
                        matrix.preScale(fJ8, fJ8);
                    }
                    break;
                    break;
                case "skewX":
                    nv0Var.T();
                    float fJ9 = nv0Var.J();
                    nv0Var.T();
                    if (Float.isNaN(fJ9) || !nv0Var.s(')')) {
                        throw new gu6("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fJ9)), 0.0f);
                    break;
                    break;
                case "skewY":
                    nv0Var.T();
                    float fJ10 = nv0Var.J();
                    nv0Var.T();
                    if (Float.isNaN(fJ10) || !nv0Var.s(')')) {
                        throw new gu6("Invalid transform list: ".concat(str));
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fJ10)));
                    break;
                    break;
                case "translate":
                    nv0Var.T();
                    float fJ11 = nv0Var.J();
                    float fP4 = nv0Var.P();
                    nv0Var.T();
                    if (Float.isNaN(fJ11) || !nv0Var.s(')')) {
                        throw new gu6("Invalid transform list: ".concat(str));
                    }
                    if (!Float.isNaN(fP4)) {
                        matrix.preTranslate(fJ11, fP4);
                    } else {
                        matrix.preTranslate(fJ11, 0.0f);
                    }
                    break;
                    break;
                default:
                    throw new gu6(pc6.p("Invalid transform list fn: ", strSubstring, ")"));
            }
            if (nv0Var.w()) {
                return matrix;
            }
            nv0Var.S();
        }
        return matrix;
    }

    public final void A(InputStream inputStream) throws gu6 {
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            lu6 lu6Var = new lu6(this);
            xMLReader.setContentHandler(lu6Var);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", lu6Var);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e) {
            throw new gu6("Stream error", e);
        } catch (ParserConfigurationException e2) {
            throw new gu6("XML parser problem", e2);
        } catch (SAXException e3) {
            throw new gu6("SVG parse error", e3);
        }
    }

    public final void B(InputStream inputStream) throws gu6 {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                ou6 ou6Var = new ou6();
                ou6Var.a = xmlPullParserNewPullParser;
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        D();
                    } else if (eventType == 8) {
                        xmlPullParserNewPullParser.getText();
                        nv0 nv0Var = new nv0(xmlPullParserNewPullParser.getText());
                        String strM = nv0Var.M();
                        y(nv0Var);
                        strM.equals("xml-stylesheet");
                    } else if (eventType == 10) {
                        if (((zs6) this.a.Y) == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                inputStream.reset();
                                A(inputStream);
                                return;
                            } catch (IOException unused) {
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                        }
                        E(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, ou6Var);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        c(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        G(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        F(xmlPullParserNewPullParser.getText());
                    }
                }
            } catch (IOException e) {
                throw new gu6("Stream error", e);
            }
        } catch (XmlPullParserException e2) {
            throw new gu6("XML parser problem", e2);
        }
    }

    public final void D() {
        f63 f63Var = new f63((byte) 22);
        f63Var.Y = null;
        f63Var.Z = new cc0((byte) 0);
        f63Var.f0 = new HashMap();
        this.a = f63Var;
    }

    /* JADX WARN: Code duplicated, block: B:453:0x0846  */
    /* JADX WARN: Code duplicated, block: B:456:0x084d  */
    /* JADX WARN: Code duplicated, block: B:826:0x0872 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:833:0x086b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final void E(String str, String str2, String str3, Attributes attributes) throws gu6 {
        char c;
        float fJ;
        float fJ2;
        float f;
        float fJ3;
        float f2;
        int i;
        char cCharAt;
        boolean z;
        if (this.c) {
            this.d++;
            return;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || _UrlKt.FRAGMENT_ENCODE_SET.equals(str)) {
            nu6 nu6Var = (nu6) nu6.g0.get(str2.length() > 0 ? str2 : str3);
            if (nu6Var == null) {
                nu6Var = nu6.f0;
            }
            int i2 = 77;
            int i3 = 0;
            switch (nu6Var.ordinal()) {
                case 0:
                    zs6 zs6Var = new zs6();
                    zs6Var.a = this.a;
                    zs6Var.b = this.b;
                    g(zs6Var, attributes);
                    j(zs6Var, attributes);
                    f(zs6Var, attributes);
                    m(zs6Var, attributes);
                    while (i3 < attributes.getLength()) {
                        String strTrim = attributes.getValue(i3).trim();
                        int iH = pc6.h(attributes, i3);
                        if (iH == 25) {
                            ks6 ks6VarS = s(strTrim);
                            zs6Var.s = ks6VarS;
                            if (ks6VarS.f()) {
                                kp5.r("Invalid <svg> element. height cannot be negative");
                                return;
                            }
                        } else if (iH != 79) {
                            switch (iH) {
                                case 81:
                                    ks6 ks6VarS2 = s(strTrim);
                                    zs6Var.r = ks6VarS2;
                                    if (ks6VarS2.f()) {
                                        kp5.r("Invalid <svg> element. width cannot be negative");
                                        return;
                                    }
                                    break;
                                    break;
                                case 82:
                                    zs6Var.p = s(strTrim);
                                    break;
                                case 83:
                                    zs6Var.q = s(strTrim);
                                    break;
                            }
                        } else {
                            continue;
                        }
                        i3++;
                    }
                    ct6 ct6Var = this.b;
                    if (ct6Var == null) {
                        this.a.Y = zs6Var;
                    } else {
                        ct6Var.e(zs6Var);
                    }
                    this.b = zs6Var;
                    return;
                case 1:
                case 7:
                    if (this.b == null) {
                        kp5.r("Invalid document. Root element must be <svg>");
                        return;
                    }
                    hs6 hs6Var = new hs6();
                    hs6Var.a = this.a;
                    hs6Var.b = this.b;
                    g(hs6Var, attributes);
                    j(hs6Var, attributes);
                    l(hs6Var, attributes);
                    f(hs6Var, attributes);
                    this.b.e(hs6Var);
                    this.b = hs6Var;
                    return;
                case 2:
                    ct6 ct6Var2 = this.b;
                    if (ct6Var2 == null) {
                        kp5.r("Invalid document. Root element must be <svg>");
                        return;
                    }
                    zr6 zr6Var = new zr6();
                    zr6Var.a = this.a;
                    zr6Var.b = ct6Var2;
                    g(zr6Var, attributes);
                    j(zr6Var, attributes);
                    l(zr6Var, attributes);
                    f(zr6Var, attributes);
                    for (int i4 = 0; i4 < attributes.getLength(); i4++) {
                        String strTrim2 = attributes.getValue(i4).trim();
                        int iH2 = pc6.h(attributes, i4);
                        if (iH2 == 6) {
                            zr6Var.o = s(strTrim2);
                        } else if (iH2 == 7) {
                            zr6Var.p = s(strTrim2);
                        } else if (iH2 != 49) {
                            continue;
                        } else {
                            ks6 ks6VarS3 = s(strTrim2);
                            zr6Var.q = ks6VarS3;
                            if (ks6VarS3.f()) {
                                kp5.r("Invalid <circle> element. r cannot be negative");
                                return;
                            }
                        }
                    }
                    this.b.e(zr6Var);
                    return;
                case 3:
                    if (this.b == null) {
                        kp5.r("Invalid document. Root element must be <svg>");
                        return;
                    }
                    as6 as6Var = new as6();
                    as6Var.a = this.a;
                    as6Var.b = this.b;
                    g(as6Var, attributes);
                    j(as6Var, attributes);
                    l(as6Var, attributes);
                    f(as6Var, attributes);
                    for (int i5 = 0; i5 < attributes.getLength(); i5++) {
                        String strTrim3 = attributes.getValue(i5).trim();
                        if (pc6.h(attributes, i5) == 3) {
                            if ("objectBoundingBox".equals(strTrim3)) {
                                as6Var.o = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(strTrim3)) {
                                    kp5.r("Invalid value for attribute clipPathUnits");
                                    return;
                                }
                                as6Var.o = Boolean.TRUE;
                            }
                        }
                    }
                    this.b.e(as6Var);
                    this.b = as6Var;
                    return;
                case 4:
                    if (this.b == null) {
                        kp5.r("Invalid document. Root element must be <svg>");
                        return;
                    }
                    ds6 ds6Var = new ds6();
                    ds6Var.a = this.a;
                    ds6Var.b = this.b;
                    g(ds6Var, attributes);
                    j(ds6Var, attributes);
                    l(ds6Var, attributes);
                    this.b.e(ds6Var);
                    this.b = ds6Var;
                    return;
                case 5:
                case 26:
                    this.e = true;
                    this.f = nu6Var;
                    return;
                case 6:
                    ct6 ct6Var3 = this.b;
                    if (ct6Var3 == null) {
                        kp5.r("Invalid document. Root element must be <svg>");
                        return;
                    }
                    es6 es6Var = new es6();
                    es6Var.a = this.a;
                    es6Var.b = ct6Var3;
                    g(es6Var, attributes);
                    j(es6Var, attributes);
                    l(es6Var, attributes);
                    f(es6Var, attributes);
                    for (int i6 = 0; i6 < attributes.getLength(); i6++) {
                        String strTrim4 = attributes.getValue(i6).trim();
                        int iH3 = pc6.h(attributes, i6);
                        if (iH3 == 6) {
                            es6Var.o = s(strTrim4);
                        } else if (iH3 == 7) {
                            es6Var.p = s(strTrim4);
                        } else if (iH3 == 56) {
                            ks6 ks6VarS4 = s(strTrim4);
                            es6Var.q = ks6VarS4;
                            if (ks6VarS4.f()) {
                                kp5.r("Invalid <ellipse> element. rx cannot be negative");
                                return;
                            }
                        } else if (iH3 != 57) {
                            continue;
                        } else {
                            ks6 ks6VarS5 = s(strTrim4);
                            es6Var.r = ks6VarS5;
                            if (ks6VarS5.f()) {
                                kp5.r("Invalid <ellipse> element. ry cannot be negative");
                                return;
                            }
                        }
                    }
                    this.b.e(es6Var);
                    return;
                case 8:
                    if (this.b == null) {
                        kp5.r("Invalid document. Root element must be <svg>");
                        return;
                    }
                    js6 js6Var = new js6();
                    js6Var.a = this.a;
                    js6Var.b = this.b;
                    g(js6Var, attributes);
                    j(js6Var, attributes);
                    l(js6Var, attributes);
                    f(js6Var, attributes);
                    for (int i7 = 0; i7 < attributes.getLength(); i7++) {
                        String strTrim5 = attributes.getValue(i7).trim();
                        int iH4 = pc6.h(attributes, i7);
                        if (iH4 == 25) {
                            ks6 ks6VarS6 = s(strTrim5);
                            js6Var.s = ks6VarS6;
                            if (ks6VarS6.f()) {
                                kp5.r("Invalid <use> element. height cannot be negative");
                                return;
                            }
                        } else if (iH4 != 26) {
                            if (iH4 != 48) {
                                switch (iH4) {
                                    case 81:
                                        ks6 ks6VarS7 = s(strTrim5);
                                        js6Var.r = ks6VarS7;
                                        if (ks6VarS7.f()) {
                                            kp5.r("Invalid <use> element. width cannot be negative");
                                            return;
                                        }
                                        break;
                                        break;
                                    case 82:
                                        js6Var.p = s(strTrim5);
                                        break;
                                    case 83:
                                        js6Var.q = s(strTrim5);
                                        break;
                                }
                            } else {
                                x(js6Var, strTrim5);
                            }
                        } else if (_UrlKt.FRAGMENT_ENCODE_SET.equals(attributes.getURI(i7)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i7))) {
                            js6Var.o = strTrim5;
                        }
                    }
                    this.b.e(js6Var);
                    this.b = js6Var;
                    return;
                case 9:
                    ct6 ct6Var4 = this.b;
                    if (ct6Var4 == null) {
                        kp5.r("Invalid document. Root element must be <svg>");
                        return;
                    }
                    ls6 ls6Var = new ls6();
                    ls6Var.a = this.a;
                    ls6Var.b = ct6Var4;
                    g(ls6Var, attributes);
                    j(ls6Var, attributes);
                    l(ls6Var, attributes);
                    f(ls6Var, attributes);
                    for (int i8 = 0; i8 < attributes.getLength(); i8++) {
                        String strTrim6 = attributes.getValue(i8).trim();
                        switch (pc6.h(attributes, i8)) {
                            case 84:
                                ls6Var.o = s(strTrim6);
                                break;
                            case 85:
                                ls6Var.p = s(strTrim6);
                                break;
                            case 86:
                                ls6Var.q = s(strTrim6);
                                break;
                            case 87:
                                ls6Var.r = s(strTrim6);
                                break;
                        }
                    }
                    this.b.e(ls6Var);
                    return;
                case 10:
                    if (this.b == null) {
                        kp5.r("Invalid document. Root element must be <svg>");
                        return;
                    }
                    ft6 ft6Var = new ft6();
                    ft6Var.a = this.a;
                    ft6Var.b = this.b;
                    g(ft6Var, attributes);
                    j(ft6Var, attributes);
                    h(ft6Var, attributes);
                    for (int i9 = 0; i9 < attributes.getLength(); i9++) {
                        String strTrim7 = attributes.getValue(i9).trim();
                        switch (pc6.h(attributes, i9)) {
                            case 84:
                                ft6Var.m = s(strTrim7);
                                break;
                            case 85:
                                ft6Var.n = s(strTrim7);
                                break;
                            case 86:
                                ft6Var.o = s(strTrim7);
                                break;
                            case 87:
                                ft6Var.p = s(strTrim7);
                                break;
                        }
                    }
                    this.b.e(ft6Var);
                    this.b = ft6Var;
                    return;
                case 11:
                    if (this.b == null) {
                        kp5.r("Invalid document. Root element must be <svg>");
                        return;
                    }
                    ms6 ms6Var = new ms6();
                    ms6Var.a = this.a;
                    ms6Var.b = this.b;
                    g(ms6Var, attributes);
                    j(ms6Var, attributes);
                    f(ms6Var, attributes);
                    m(ms6Var, attributes);
                    for (int i10 = 0; i10 < attributes.getLength(); i10++) {
                        String strTrim8 = attributes.getValue(i10).trim();
                        int iH5 = pc6.h(attributes, i10);
                        if (iH5 != 41) {
                            if (iH5 == 50) {
                                ms6Var.q = s(strTrim8);
                            } else if (iH5 != 51) {
                                switch (iH5) {
                                    case 32:
                                        ks6 ks6VarS8 = s(strTrim8);
                                        ms6Var.t = ks6VarS8;
                                        if (ks6VarS8.f()) {
                                            kp5.r("Invalid <marker> element. markerHeight cannot be negative");
                                            return;
                                        }
                                        continue;
                                    case 33:
                                        if ("strokeWidth".equals(strTrim8)) {
                                            ms6Var.p = false;
                                            continue;
                                        } else {
                                            if (!"userSpaceOnUse".equals(strTrim8)) {
                                                kp5.r("Invalid value for attribute markerUnits");
                                                return;
                                            }
                                            ms6Var.p = true;
                                        }
                                        break;
                                    case 34:
                                        ks6 ks6VarS9 = s(strTrim8);
                                        ms6Var.s = ks6VarS9;
                                        if (ks6VarS9.f()) {
                                            kp5.r("Invalid <marker> element. markerWidth cannot be negative");
                                            return;
                                        }
                                        break;
                                }
                            } else {
                                ms6Var.r = s(strTrim8);
                            }
                        } else if ("auto".equals(strTrim8)) {
                            ms6Var.u = Float.valueOf(Float.NaN);
                        } else {
                            ms6Var.u = Float.valueOf(p(strTrim8));
                        }
                    }
                    this.b.e(ms6Var);
                    this.b = ms6Var;
                    return;
                case FileClientSessionCache.MAX_SIZE /* 12 */:
                    if (this.b == null) {
                        kp5.r("Invalid document. Root element must be <svg>");
                        return;
                    }
                    ns6 ns6Var = new ns6();
                    ns6Var.a = this.a;
                    ns6Var.b = this.b;
                    g(ns6Var, attributes);
                    j(ns6Var, attributes);
                    f(ns6Var, attributes);
                    for (int i11 = 0; i11 < attributes.getLength(); i11++) {
                        String strTrim9 = attributes.getValue(i11).trim();
                        int iH6 = pc6.h(attributes, i11);
                        if (iH6 == 25) {
                            ks6 ks6VarS10 = s(strTrim9);
                            ns6Var.q = ks6VarS10;
                            if (ks6VarS10.f()) {
                                kp5.r("Invalid <mask> element. height cannot be negative");
                                return;
                            }
                        } else if (iH6 != 36) {
                            if (iH6 != 37) {
                                switch (iH6) {
                                    case 81:
                                        ks6 ks6VarS11 = s(strTrim9);
                                        ns6Var.p = ks6VarS11;
                                        if (ks6VarS11.f()) {
                                            kp5.r("Invalid <mask> element. width cannot be negative");
                                            return;
                                        }
                                        break;
                                        break;
                                    case 82:
                                        s(strTrim9);
                                        break;
                                    case 83:
                                        s(strTrim9);
                                        break;
                                }
                            } else if ("objectBoundingBox".equals(strTrim9)) {
                                ns6Var.n = Boolean.FALSE;
                            } else {
                                if (!"userSpaceOnUse".equals(strTrim9)) {
                                    kp5.r("Invalid value for attribute maskUnits");
                                    return;
                                }
                                ns6Var.n = Boolean.TRUE;
                            }
                        } else if ("objectBoundingBox".equals(strTrim9)) {
                            ns6Var.o = Boolean.FALSE;
                        } else {
                            if (!"userSpaceOnUse".equals(strTrim9)) {
                                kp5.r("Invalid value for attribute maskContentUnits");
                                return;
                            }
                            ns6Var.o = Boolean.TRUE;
                        }
                    }
                    this.b.e(ns6Var);
                    this.b = ns6Var;
                    return;
                case 13:
                    ct6 ct6Var5 = this.b;
                    if (ct6Var5 == null) {
                        kp5.r("Invalid document. Root element must be <svg>");
                        return;
                    }
                    qs6 qs6Var = new qs6();
                    qs6Var.a = this.a;
                    qs6Var.b = ct6Var5;
                    g(qs6Var, attributes);
                    j(qs6Var, attributes);
                    l(qs6Var, attributes);
                    f(qs6Var, attributes);
                    int i12 = 0;
                    while (i12 < attributes.getLength()) {
                        String strTrim10 = attributes.getValue(i12).trim();
                        int iH7 = pc6.h(attributes, i12);
                        if (iH7 == 13) {
                            nv0 nv0Var = new nv0(strTrim10);
                            nv0 nv0Var2 = new nv0();
                            nv0Var2.X = i3;
                            nv0Var2.Y = i3;
                            nv0Var2.Z = new byte[8];
                            nv0Var2.f0 = new float[16];
                            if (!nv0Var.w()) {
                                int iIntValue = nv0Var.I().intValue();
                                int i13 = 109;
                                if (iIntValue == i2 || iIntValue == 109) {
                                    float f3 = 0.0f;
                                    float fJ4 = 0.0f;
                                    float f4 = 0.0f;
                                    float f5 = 0.0f;
                                    float f6 = 0.0f;
                                    float f7 = 0.0f;
                                    while (true) {
                                        nv0Var.T();
                                        switch (iIntValue) {
                                            case 65:
                                            case 97:
                                                float f8 = f4;
                                                c = 'a';
                                                float fJ5 = nv0Var.J();
                                                float fJ6 = nv0Var.j(fJ5);
                                                float fJ7 = nv0Var.j(fJ6);
                                                Boolean boolI = nv0Var.i(Float.valueOf(fJ7));
                                                Boolean boolI2 = nv0Var.i(boolI);
                                                if (boolI2 == null) {
                                                    fJ = Float.NaN;
                                                } else {
                                                    nv0Var.S();
                                                    fJ = nv0Var.J();
                                                }
                                                float fJ8 = nv0Var.j(fJ);
                                                if (!Float.isNaN(fJ8) && fJ5 >= 0.0f && fJ6 >= 0.0f) {
                                                    if (iIntValue == 97) {
                                                        fJ += f3;
                                                        fJ8 += f8;
                                                    }
                                                    float f9 = fJ;
                                                    float f10 = fJ8;
                                                    nv0Var2.d(fJ5, fJ6, fJ7, boolI.booleanValue(), boolI2.booleanValue(), f9, f10);
                                                    f3 = f9;
                                                    fJ4 = f3;
                                                    f4 = f10;
                                                    f5 = f4;
                                                    nv0Var.S();
                                                    if (nv0Var.w()) {
                                                        i = nv0Var.X;
                                                        if (i != nv0Var.Y && (((cCharAt = ((String) nv0Var.Z).charAt(i)) >= c && cCharAt <= 'z') || (cCharAt >= 'A' && cCharAt <= 'Z'))) {
                                                            iIntValue = nv0Var.I().intValue();
                                                        }
                                                        i13 = 109;
                                                    }
                                                }
                                                break;
                                            case 67:
                                            case 99:
                                                c = 'a';
                                                float fJ9 = nv0Var.J();
                                                float fJ10 = nv0Var.j(fJ9);
                                                float fJ11 = nv0Var.j(fJ10);
                                                float fJ12 = nv0Var.j(fJ11);
                                                float fJ13 = nv0Var.j(fJ12);
                                                float fJ14 = nv0Var.j(fJ13);
                                                if (!Float.isNaN(fJ14)) {
                                                    if (iIntValue == 99) {
                                                        fJ13 += f3;
                                                        fJ14 += f4;
                                                        fJ9 += f3;
                                                        fJ10 += f4;
                                                        fJ11 += f3;
                                                        fJ12 += f4;
                                                    }
                                                    fJ2 = fJ14;
                                                    f = fJ13;
                                                    fJ3 = fJ12;
                                                    f2 = fJ11;
                                                    nv0Var2.c(fJ9, fJ10, f2, fJ3, f, fJ2);
                                                    fJ4 = f2;
                                                    f5 = fJ3;
                                                    f3 = f;
                                                    f4 = fJ2;
                                                    nv0Var.S();
                                                    if (nv0Var.w()) {
                                                        i = nv0Var.X;
                                                        if (i != nv0Var.Y) {
                                                            iIntValue = nv0Var.I().intValue();
                                                        }
                                                        i13 = 109;
                                                    }
                                                }
                                                break;
                                            case 72:
                                            case 104:
                                                c = 'a';
                                                float fJ15 = nv0Var.J();
                                                if (!Float.isNaN(fJ15)) {
                                                    if (iIntValue == 104) {
                                                        fJ15 += f3;
                                                    }
                                                    f3 = fJ15;
                                                    nv0Var2.e(f3, f4);
                                                    fJ4 = f3;
                                                    nv0Var.S();
                                                    if (nv0Var.w()) {
                                                        i = nv0Var.X;
                                                        if (i != nv0Var.Y) {
                                                            iIntValue = nv0Var.I().intValue();
                                                        }
                                                        i13 = 109;
                                                    }
                                                }
                                                break;
                                            case 76:
                                            case 108:
                                                c = 'a';
                                                float fJ16 = nv0Var.J();
                                                float fJ17 = nv0Var.j(fJ16);
                                                if (!Float.isNaN(fJ17)) {
                                                    if (iIntValue == 108) {
                                                        fJ16 += f3;
                                                        fJ17 += f4;
                                                    }
                                                    f3 = fJ16;
                                                    f4 = fJ17;
                                                    nv0Var2.e(f3, f4);
                                                    fJ4 = f3;
                                                    f5 = f4;
                                                    nv0Var.S();
                                                    if (nv0Var.w()) {
                                                        i = nv0Var.X;
                                                        if (i != nv0Var.Y) {
                                                            iIntValue = nv0Var.I().intValue();
                                                        }
                                                        i13 = 109;
                                                    }
                                                }
                                                break;
                                            case 77:
                                            case 109:
                                                c = 'a';
                                                float fJ18 = nv0Var.J();
                                                float fJ19 = nv0Var.j(fJ18);
                                                if (!Float.isNaN(fJ19)) {
                                                    if (iIntValue == i13 && nv0Var2.X != 0) {
                                                        fJ18 += f3;
                                                        fJ19 += f4;
                                                    }
                                                    f3 = fJ18;
                                                    f4 = fJ19;
                                                    nv0Var2.b(f3, f4);
                                                    fJ4 = f3;
                                                    f6 = fJ4;
                                                    f5 = f4;
                                                    f7 = f5;
                                                    iIntValue = iIntValue != i13 ? 76 : 108;
                                                    nv0Var.S();
                                                    if (nv0Var.w()) {
                                                        i = nv0Var.X;
                                                        if (i != nv0Var.Y) {
                                                            iIntValue = nv0Var.I().intValue();
                                                        }
                                                        i13 = 109;
                                                    }
                                                }
                                                break;
                                            case 81:
                                            case 113:
                                                c = 'a';
                                                fJ4 = nv0Var.J();
                                                float fJ20 = nv0Var.j(fJ4);
                                                float fJ21 = nv0Var.j(fJ20);
                                                float fJ22 = nv0Var.j(fJ21);
                                                if (!Float.isNaN(fJ22)) {
                                                    if (iIntValue == 113) {
                                                        fJ21 += f3;
                                                        fJ22 += f4;
                                                        fJ4 += f3;
                                                        fJ20 += f4;
                                                    }
                                                    f3 = fJ21;
                                                    f4 = fJ22;
                                                    f5 = fJ20;
                                                    nv0Var2.a(fJ4, f5, f3, f4);
                                                    nv0Var.S();
                                                    if (nv0Var.w()) {
                                                        i = nv0Var.X;
                                                        if (i != nv0Var.Y) {
                                                            iIntValue = nv0Var.I().intValue();
                                                        }
                                                        i13 = 109;
                                                    }
                                                }
                                                break;
                                            case 83:
                                            case 115:
                                                float f11 = (f3 * 2.0f) - fJ4;
                                                float f12 = (2.0f * f4) - f5;
                                                float fJ23 = nv0Var.J();
                                                fJ3 = nv0Var.j(fJ23);
                                                float fJ24 = nv0Var.j(fJ3);
                                                fJ2 = nv0Var.j(fJ24);
                                                if (!Float.isNaN(fJ2)) {
                                                    if (iIntValue == 115) {
                                                        fJ24 += f3;
                                                        fJ2 += f4;
                                                        fJ23 += f3;
                                                        fJ3 += f4;
                                                    }
                                                    f = fJ24;
                                                    c = 'a';
                                                    f2 = fJ23;
                                                    nv0Var2.c(f11, f12, f2, fJ3, f, fJ2);
                                                    fJ4 = f2;
                                                    f5 = fJ3;
                                                    f3 = f;
                                                    f4 = fJ2;
                                                    nv0Var.S();
                                                    if (nv0Var.w()) {
                                                        i = nv0Var.X;
                                                        if (i != nv0Var.Y) {
                                                            iIntValue = nv0Var.I().intValue();
                                                        }
                                                        i13 = 109;
                                                    }
                                                }
                                                break;
                                            case 84:
                                            case 116:
                                                fJ4 = (f3 * 2.0f) - fJ4;
                                                f5 = (2.0f * f4) - f5;
                                                float fJ25 = nv0Var.J();
                                                float fJ26 = nv0Var.j(fJ25);
                                                if (!Float.isNaN(fJ26)) {
                                                    if (iIntValue == 116) {
                                                        fJ25 += f3;
                                                        fJ26 += f4;
                                                    }
                                                    f3 = fJ25;
                                                    f4 = fJ26;
                                                    nv0Var2.a(fJ4, f5, f3, f4);
                                                    c = 'a';
                                                    nv0Var.S();
                                                    if (nv0Var.w()) {
                                                        i = nv0Var.X;
                                                        if (i != nv0Var.Y) {
                                                            iIntValue = nv0Var.I().intValue();
                                                        }
                                                        i13 = 109;
                                                    }
                                                }
                                                break;
                                            case 86:
                                            case 118:
                                                float fJ27 = nv0Var.J();
                                                if (!Float.isNaN(fJ27)) {
                                                    if (iIntValue == 118) {
                                                        fJ27 += f4;
                                                    }
                                                    f4 = fJ27;
                                                    nv0Var2.e(f3, f4);
                                                    f5 = f4;
                                                    c = 'a';
                                                    nv0Var.S();
                                                    if (nv0Var.w()) {
                                                        i = nv0Var.X;
                                                        if (i != nv0Var.Y) {
                                                            iIntValue = nv0Var.I().intValue();
                                                        }
                                                        i13 = 109;
                                                    }
                                                }
                                                break;
                                            case 90:
                                            case 122:
                                                nv0Var2.close();
                                                f3 = f6;
                                                fJ4 = f3;
                                                f4 = f7;
                                                f5 = f4;
                                                c = 'a';
                                                nv0Var.S();
                                                if (nv0Var.w()) {
                                                    i = nv0Var.X;
                                                    if (i != nv0Var.Y) {
                                                        iIntValue = nv0Var.I().intValue();
                                                    }
                                                    i13 = 109;
                                                }
                                                break;
                                        }
                                    }
                                }
                            }
                            qs6Var.o = nv0Var2;
                        } else if (iH7 == 43 && p(strTrim10) < 0.0f) {
                            kp5.r("Invalid <path> element. pathLength cannot be negative");
                            return;
                        }
                        i12++;
                        i2 = 77;
                        i3 = 0;
                    }
                    this.b.e(qs6Var);
                    return;
                case 14:
                    if (this.b == null) {
                        kp5.r("Invalid document. Root element must be <svg>");
                        return;
                    }
                    ss6 ss6Var = new ss6();
                    ss6Var.a = this.a;
                    ss6Var.b = this.b;
                    g(ss6Var, attributes);
                    j(ss6Var, attributes);
                    f(ss6Var, attributes);
                    m(ss6Var, attributes);
                    while (i3 < attributes.getLength()) {
                        String strTrim11 = attributes.getValue(i3).trim();
                        int iH8 = pc6.h(attributes, i3);
                        if (iH8 == 25) {
                            ks6 ks6VarS12 = s(strTrim11);
                            ss6Var.v = ks6VarS12;
                            if (ks6VarS12.f()) {
                                kp5.r("Invalid <pattern> element. height cannot be negative");
                                return;
                            }
                        } else if (iH8 != 26) {
                            switch (iH8) {
                                case 44:
                                    if ("objectBoundingBox".equals(strTrim11)) {
                                        ss6Var.q = Boolean.FALSE;
                                    } else {
                                        if (!"userSpaceOnUse".equals(strTrim11)) {
                                            kp5.r("Invalid value for attribute patternContentUnits");
                                            return;
                                        }
                                        ss6Var.q = Boolean.TRUE;
                                    }
                                    break;
                                case 45:
                                    ss6Var.r = z(strTrim11);
                                    break;
                                case 46:
                                    if ("objectBoundingBox".equals(strTrim11)) {
                                        ss6Var.p = Boolean.FALSE;
                                    } else {
                                        if (!"userSpaceOnUse".equals(strTrim11)) {
                                            kp5.r("Invalid value for attribute patternUnits");
                                            return;
                                        }
                                        ss6Var.p = Boolean.TRUE;
                                    }
                                    break;
                                default:
                                    switch (iH8) {
                                        case 81:
                                            ks6 ks6VarS13 = s(strTrim11);
                                            ss6Var.u = ks6VarS13;
                                            if (ks6VarS13.f()) {
                                                kp5.r("Invalid <pattern> element. width cannot be negative");
                                                return;
                                            }
                                            break;
                                            break;
                                        case 82:
                                            ss6Var.s = s(strTrim11);
                                            break;
                                        case 83:
                                            ss6Var.t = s(strTrim11);
                                            break;
                                    }
                                    break;
                            }
                        } else if (_UrlKt.FRAGMENT_ENCODE_SET.equals(attributes.getURI(i3)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i3))) {
                            ss6Var.w = strTrim11;
                        }
                        i3++;
                    }
                    this.b.e(ss6Var);
                    this.b = ss6Var;
                    return;
                case 15:
                    ct6 ct6Var6 = this.b;
                    if (ct6Var6 == null) {
                        kp5.r("Invalid document. Root element must be <svg>");
                        return;
                    }
                    us6 us6Var = new us6();
                    us6Var.a = this.a;
                    us6Var.b = ct6Var6;
                    g(us6Var, attributes);
                    j(us6Var, attributes);
                    l(us6Var, attributes);
                    f(us6Var, attributes);
                    i(us6Var, attributes, "polygon");
                    this.b.e(us6Var);
                    return;
                case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                    ct6 ct6Var7 = this.b;
                    if (ct6Var7 == null) {
                        kp5.r("Invalid document. Root element must be <svg>");
                        return;
                    }
                    ts6 ts6Var = new ts6();
                    ts6Var.a = this.a;
                    ts6Var.b = ct6Var7;
                    g(ts6Var, attributes);
                    j(ts6Var, attributes);
                    l(ts6Var, attributes);
                    f(ts6Var, attributes);
                    i(ts6Var, attributes, "polyline");
                    this.b.e(ts6Var);
                    return;
                case 17:
                    if (this.b == null) {
                        kp5.r("Invalid document. Root element must be <svg>");
                        return;
                    }
                    jt6 jt6Var = new jt6();
                    jt6Var.a = this.a;
                    jt6Var.b = this.b;
                    g(jt6Var, attributes);
                    j(jt6Var, attributes);
                    h(jt6Var, attributes);
                    while (i3 < attributes.getLength()) {
                        String strTrim12 = attributes.getValue(i3).trim();
                        int iH9 = pc6.h(attributes, i3);
                        if (iH9 == 6) {
                            jt6Var.m = s(strTrim12);
                        } else if (iH9 == 7) {
                            jt6Var.n = s(strTrim12);
                        } else if (iH9 == 11) {
                            jt6Var.p = s(strTrim12);
                        } else if (iH9 == 12) {
                            jt6Var.q = s(strTrim12);
                        } else if (iH9 != 49) {
                            continue;
                        } else {
                            ks6 ks6VarS14 = s(strTrim12);
                            jt6Var.o = ks6VarS14;
                            if (ks6VarS14.f()) {
                                kp5.r("Invalid <radialGradient> element. r cannot be negative");
                                return;
                            }
                        }
                        i3++;
                    }
                    this.b.e(jt6Var);
                    this.b = jt6Var;
                    return;
                case 18:
                    ct6 ct6Var8 = this.b;
                    if (ct6Var8 == null) {
                        kp5.r("Invalid document. Root element must be <svg>");
                        return;
                    }
                    vs6 vs6Var = new vs6();
                    vs6Var.a = this.a;
                    vs6Var.b = ct6Var8;
                    g(vs6Var, attributes);
                    j(vs6Var, attributes);
                    l(vs6Var, attributes);
                    f(vs6Var, attributes);
                    while (i3 < attributes.getLength()) {
                        String strTrim13 = attributes.getValue(i3).trim();
                        int iH10 = pc6.h(attributes, i3);
                        if (iH10 == 25) {
                            ks6 ks6VarS15 = s(strTrim13);
                            vs6Var.r = ks6VarS15;
                            if (ks6VarS15.f()) {
                                kp5.r("Invalid <rect> element. height cannot be negative");
                                return;
                            }
                        } else if (iH10 == 56) {
                            ks6 ks6VarS16 = s(strTrim13);
                            vs6Var.s = ks6VarS16;
                            if (ks6VarS16.f()) {
                                kp5.r("Invalid <rect> element. rx cannot be negative");
                                return;
                            }
                        } else if (iH10 != 57) {
                            switch (iH10) {
                                case 81:
                                    ks6 ks6VarS17 = s(strTrim13);
                                    vs6Var.q = ks6VarS17;
                                    if (ks6VarS17.f()) {
                                        kp5.r("Invalid <rect> element. width cannot be negative");
                                        return;
                                    }
                                    break;
                                    break;
                                case 82:
                                    vs6Var.o = s(strTrim13);
                                    break;
                                case 83:
                                    vs6Var.p = s(strTrim13);
                                    break;
                            }
                        } else {
                            ks6 ks6VarS18 = s(strTrim13);
                            vs6Var.t = ks6VarS18;
                            if (ks6VarS18.f()) {
                                kp5.r("Invalid <rect> element. ry cannot be negative");
                                return;
                            }
                        }
                        i3++;
                    }
                    this.b.e(vs6Var);
                    return;
                case 19:
                    ct6 ct6Var9 = this.b;
                    if (ct6Var9 == null) {
                        kp5.r("Invalid document. Root element must be <svg>");
                        return;
                    }
                    ws6 ws6Var = new ws6();
                    ws6Var.a = this.a;
                    ws6Var.b = ct6Var9;
                    g(ws6Var, attributes);
                    j(ws6Var, attributes);
                    this.b.e(ws6Var);
                    this.b = ws6Var;
                    return;
                case 20:
                    ct6 ct6Var10 = this.b;
                    if (ct6Var10 == null) {
                        kp5.r("Invalid document. Root element must be <svg>");
                        return;
                    }
                    if (!(ct6Var10 instanceof fs6)) {
                        kp5.r("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
                        return;
                    }
                    xs6 xs6Var = new xs6();
                    xs6Var.a = this.a;
                    xs6Var.b = ct6Var10;
                    g(xs6Var, attributes);
                    j(xs6Var, attributes);
                    for (int i14 = 0; i14 < attributes.getLength(); i14++) {
                        String strTrim14 = attributes.getValue(i14).trim();
                        if (pc6.h(attributes, i14) == 39) {
                            if (strTrim14.length() == 0) {
                                kp5.r("Invalid offset value in <stop> (empty string)");
                                return;
                            }
                            int length = strTrim14.length();
                            if (strTrim14.charAt(strTrim14.length() - 1) == '%') {
                                length--;
                                z = true;
                            } else {
                                z = false;
                            }
                            try {
                                float fO = o(length, strTrim14);
                                float f13 = 100.0f;
                                if (z) {
                                    fO /= 100.0f;
                                }
                                if (fO < 0.0f) {
                                    f13 = 0.0f;
                                } else if (fO <= 100.0f) {
                                    f13 = fO;
                                }
                                xs6Var.h = Float.valueOf(f13);
                            } catch (NumberFormatException e) {
                                throw new gu6("Invalid offset value in <stop>: ".concat(strTrim14), e);
                            }
                        }
                    }
                    this.b.e(xs6Var);
                    this.b = xs6Var;
                    return;
                case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                    if (this.b == null) {
                        kp5.r("Invalid document. Root element must be <svg>");
                        return;
                    }
                    String str4 = "all";
                    boolean zEquals = true;
                    while (i3 < attributes.getLength()) {
                        String strTrim15 = attributes.getValue(i3).trim();
                        int iH11 = pc6.h(attributes, i3);
                        if (iH11 == 38) {
                            str4 = strTrim15;
                        } else if (iH11 == 77) {
                            zEquals = strTrim15.equals("text/css");
                        }
                        i3++;
                    }
                    if (zEquals) {
                        sb0 sb0Var = new sb0(str4);
                        sb0Var.T();
                        for (tb0 tb0Var : fc0.c(sb0Var)) {
                            if (tb0Var == tb0.X || tb0Var == tb0.Y) {
                                this.h = true;
                                return;
                            }
                        }
                    }
                    this.c = true;
                    this.d = 1;
                    return;
                case 22:
                    if (this.b == null) {
                        kp5.r("Invalid document. Root element must be <svg>");
                        return;
                    }
                    lt6 lt6Var = new lt6();
                    lt6Var.a = this.a;
                    lt6Var.b = this.b;
                    g(lt6Var, attributes);
                    j(lt6Var, attributes);
                    l(lt6Var, attributes);
                    f(lt6Var, attributes);
                    this.b.e(lt6Var);
                    this.b = lt6Var;
                    return;
                case 23:
                    if (this.b == null) {
                        kp5.r("Invalid document. Root element must be <svg>");
                        return;
                    }
                    mt6 mt6Var = new mt6();
                    mt6Var.a = this.a;
                    mt6Var.b = this.b;
                    g(mt6Var, attributes);
                    j(mt6Var, attributes);
                    f(mt6Var, attributes);
                    m(mt6Var, attributes);
                    this.b.e(mt6Var);
                    this.b = mt6Var;
                    return;
                case 24:
                    if (this.b == null) {
                        kp5.r("Invalid document. Root element must be <svg>");
                        return;
                    }
                    pt6 pt6Var = new pt6();
                    pt6Var.a = this.a;
                    pt6Var.b = this.b;
                    g(pt6Var, attributes);
                    j(pt6Var, attributes);
                    l(pt6Var, attributes);
                    f(pt6Var, attributes);
                    k(pt6Var, attributes);
                    this.b.e(pt6Var);
                    this.b = pt6Var;
                    return;
                case 25:
                    if (this.b == null) {
                        kp5.r("Invalid document. Root element must be <svg>");
                        return;
                    }
                    st6 st6Var = new st6();
                    st6Var.a = this.a;
                    st6Var.b = this.b;
                    g(st6Var, attributes);
                    j(st6Var, attributes);
                    f(st6Var, attributes);
                    while (i3 < attributes.getLength()) {
                        String strTrim16 = attributes.getValue(i3).trim();
                        int iH12 = pc6.h(attributes, i3);
                        if (iH12 != 26) {
                            if (iH12 == 61) {
                                st6Var.o = s(strTrim16);
                            }
                        } else if (_UrlKt.FRAGMENT_ENCODE_SET.equals(attributes.getURI(i3)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i3))) {
                            st6Var.n = strTrim16;
                        }
                        i3++;
                    }
                    this.b.e(st6Var);
                    this.b = st6Var;
                    ct6 ct6Var11 = st6Var.b;
                    if (ct6Var11 instanceof pt6) {
                        st6Var.p = (pt6) ct6Var11;
                        return;
                    } else {
                        st6Var.p = ((qt6) ct6Var11).c();
                        return;
                    }
                case 27:
                    ct6 ct6Var12 = this.b;
                    if (ct6Var12 == null) {
                        kp5.r("Invalid document. Root element must be <svg>");
                        return;
                    }
                    if (!(ct6Var12 instanceof rt6)) {
                        kp5.r("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
                        return;
                    }
                    nt6 nt6Var = new nt6();
                    nt6Var.a = this.a;
                    nt6Var.b = this.b;
                    g(nt6Var, attributes);
                    j(nt6Var, attributes);
                    f(nt6Var, attributes);
                    while (i3 < attributes.getLength()) {
                        String strTrim17 = attributes.getValue(i3).trim();
                        if (pc6.h(attributes, i3) == 26 && (_UrlKt.FRAGMENT_ENCODE_SET.equals(attributes.getURI(i3)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i3)))) {
                            nt6Var.n = strTrim17;
                        }
                        i3++;
                    }
                    this.b.e(nt6Var);
                    ct6 ct6Var13 = nt6Var.b;
                    if (ct6Var13 instanceof pt6) {
                        nt6Var.o = (pt6) ct6Var13;
                        return;
                    } else {
                        nt6Var.o = ((qt6) ct6Var13).c();
                        return;
                    }
                case _DnsMessageKt.TYPE_AAAA /* 28 */:
                    ct6 ct6Var14 = this.b;
                    if (ct6Var14 == null) {
                        kp5.r("Invalid document. Root element must be <svg>");
                        return;
                    }
                    if (!(ct6Var14 instanceof rt6)) {
                        kp5.r("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
                        return;
                    }
                    ot6 ot6Var = new ot6();
                    ot6Var.a = this.a;
                    ot6Var.b = this.b;
                    g(ot6Var, attributes);
                    j(ot6Var, attributes);
                    f(ot6Var, attributes);
                    k(ot6Var, attributes);
                    this.b.e(ot6Var);
                    this.b = ot6Var;
                    ct6 ct6Var15 = ot6Var.b;
                    if (ct6Var15 instanceof pt6) {
                        ot6Var.r = (pt6) ct6Var15;
                        return;
                    } else {
                        ot6Var.r = ((qt6) ct6Var15).c();
                        return;
                    }
                case 29:
                    if (this.b == null) {
                        kp5.r("Invalid document. Root element must be <svg>");
                        return;
                    }
                    vt6 vt6Var = new vt6();
                    vt6Var.a = this.a;
                    vt6Var.b = this.b;
                    g(vt6Var, attributes);
                    j(vt6Var, attributes);
                    l(vt6Var, attributes);
                    f(vt6Var, attributes);
                    while (i3 < attributes.getLength()) {
                        String strTrim18 = attributes.getValue(i3).trim();
                        int iH13 = pc6.h(attributes, i3);
                        if (iH13 == 25) {
                            ks6 ks6VarS19 = s(strTrim18);
                            vt6Var.s = ks6VarS19;
                            if (ks6VarS19.f()) {
                                kp5.r("Invalid <use> element. height cannot be negative");
                                return;
                            }
                        } else if (iH13 != 26) {
                            switch (iH13) {
                                case 81:
                                    ks6 ks6VarS20 = s(strTrim18);
                                    vt6Var.r = ks6VarS20;
                                    if (ks6VarS20.f()) {
                                        kp5.r("Invalid <use> element. width cannot be negative");
                                        return;
                                    }
                                    break;
                                    break;
                                case 82:
                                    vt6Var.p = s(strTrim18);
                                    break;
                                case 83:
                                    vt6Var.q = s(strTrim18);
                                    break;
                            }
                        } else if (_UrlKt.FRAGMENT_ENCODE_SET.equals(attributes.getURI(i3)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i3))) {
                            vt6Var.o = strTrim18;
                        }
                        i3++;
                    }
                    this.b.e(vt6Var);
                    this.b = vt6Var;
                    return;
                case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
                    if (this.b == null) {
                        kp5.r("Invalid document. Root element must be <svg>");
                        return;
                    }
                    wt6 wt6Var = new wt6();
                    wt6Var.a = this.a;
                    wt6Var.b = this.b;
                    g(wt6Var, attributes);
                    f(wt6Var, attributes);
                    m(wt6Var, attributes);
                    this.b.e(wt6Var);
                    this.b = wt6Var;
                    return;
                default:
                    this.c = true;
                    this.d = 1;
                    return;
            }
        }
    }

    public final void F(String str) {
        if (this.c) {
            return;
        }
        if (this.e) {
            StringBuilder sb = this.g;
            if (sb == null) {
                sb = new StringBuilder(str.length());
                this.g = sb;
            }
            sb.append(str);
            return;
        }
        if (!this.h) {
            if (this.b instanceof rt6) {
                a(str);
            }
        } else {
            StringBuilder sb2 = this.i;
            if (sb2 == null) {
                sb2 = new StringBuilder(str.length());
                this.i = sb2;
            }
            sb2.append(str);
        }
    }

    public final void G(char[] cArr, int i, int i2) {
        if (this.c) {
            return;
        }
        if (this.e) {
            StringBuilder sb = this.g;
            if (sb == null) {
                sb = new StringBuilder(i2);
                this.g = sb;
            }
            sb.append(cArr, i, i2);
            return;
        }
        if (!this.h) {
            if (this.b instanceof rt6) {
                a(new String(cArr, i, i2));
            }
        } else {
            StringBuilder sb2 = this.i;
            if (sb2 == null) {
                sb2 = new StringBuilder(i2);
                this.i = sb2;
            }
            sb2.append(cArr, i, i2);
        }
    }

    public final void a(String str) {
        bt6 bt6Var = (bt6) this.b;
        int size = bt6Var.i.size();
        gt6 gt6Var = size == 0 ? null : (gt6) bt6Var.i.get(size - 1);
        if (gt6Var instanceof ut6) {
            ut6 ut6Var = (ut6) gt6Var;
            ut6Var.c = oi0.p(new StringBuilder(), ut6Var.c, str);
        } else {
            ct6 ct6Var = this.b;
            ut6 ut6Var2 = new ut6();
            ut6Var2.c = str;
            ct6Var.e(ut6Var2);
        }
    }

    public final void c(String str, String str2, String str3) {
        if (this.c) {
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                this.c = false;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || _UrlKt.FRAGMENT_ENCODE_SET.equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            nu6 nu6Var = (nu6) nu6.g0.get(str2);
            if (nu6Var == null) {
                nu6Var = nu6.f0;
            }
            switch (nu6Var.ordinal()) {
                case 0:
                case 3:
                case 4:
                case 7:
                case 8:
                case 10:
                case 11:
                case FileClientSessionCache.MAX_SIZE /* 12 */:
                case 14:
                case 17:
                case 19:
                case 20:
                case 22:
                case 23:
                case 24:
                case 25:
                case _DnsMessageKt.TYPE_AAAA /* 28 */:
                case 29:
                case XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_MAX_IDLE_TIMEOUT /* 30 */:
                    this.b = ((gt6) this.b).b;
                    break;
                case 5:
                case 26:
                    this.e = false;
                    if (this.g != null) {
                        nu6 nu6Var2 = this.f;
                        if (nu6Var2 == nu6.Z || nu6Var2 == nu6.X) {
                            this.a.getClass();
                        }
                        this.g.setLength(0);
                    }
                    break;
                case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                    StringBuilder sb = this.i;
                    if (sb != null) {
                        this.h = false;
                        String string = sb.toString();
                        fc0 fc0Var = new fc0(1);
                        f63 f63Var = this.a;
                        sb0 sb0Var = new sb0(string);
                        sb0Var.T();
                        ((cc0) f63Var.Z).b(fc0Var.e(sb0Var));
                        this.i.setLength(0);
                    }
                    break;
            }
        }
    }
}
