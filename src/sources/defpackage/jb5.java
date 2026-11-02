package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.hardware.camera2.CaptureRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Xml;
import android.view.View;
import androidx.compose.foundation.layout.b;
import androidx.core.content.FileProvider;
import androidx.core.graphics.drawable.IconCompat;
import io.sentry.util.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.ProtocolException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import okhttp3.dnsoverhttps.DnsOverHttps;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.url._UrlKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.conscrypt.FileClientSessionCache;
import org.conscrypt.PSKKeyManager;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import su.happ.proxyutility.dto.XRayConfig;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jb5 implements zn2 {
    public static final r06 X = new r06(new x((byte) 29));
    public static final char[] Y = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ', '$', '%', '*', '+', '-', '.', '/', ':'};
    public static final int[] Z = {1, 10, 100, XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.ttiMax, 10000, 100000, 1000000, 10000000, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS};
    public static final int[] f0 = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};
    public static final int[] g0 = {3, 6};
    public static final int[] h0 = {1, 2, 4, 5, 7, 8};
    public static final StackTraceElement[] i0 = new StackTraceElement[0];
    public static final mc7 j0 = new mc7((byte) 1);
    public static final ic7 k0 = new ic7();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object B(Activity activity, Resources resources, ky2 ky2Var, String str, q51 q51Var) {
        vg4 vg4Var;
        Object rj6Var;
        if (q51Var instanceof vg4) {
            vg4Var = (vg4) q51Var;
            int i = vg4Var.h0;
            if ((i & Integer.MIN_VALUE) != 0) {
                vg4Var.h0 = i - Integer.MIN_VALUE;
            } else {
                vg4Var = new vg4(q51Var);
            }
        } else {
            vg4Var = new vg4(q51Var);
        }
        Object obj = vg4Var.g0;
        int i2 = vg4Var.h0;
        dn8 dn8Var = dn8.a;
        if (i2 == 0) {
            w39.n0(obj);
            if (activity != null) {
                try {
                    Uri uriC = FileProvider.c(activity, activity.getPackageName() + ".provider", new File(str));
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.STREAM", uriC);
                    intent.setClipData(ClipData.newRawUri("logs", uriC));
                    intent.addFlags(1);
                    activity.startActivity(Intent.createChooser(intent, resources.getString(y46.logcat_share)));
                    rj6Var = dn8Var;
                } catch (Throwable th) {
                    if ((th instanceof InterruptedException) || (th instanceof CancellationException)) {
                        throw th;
                    }
                    rj6Var = new rj6(th);
                }
                if (sj6.a(rj6Var) != null) {
                    String string = resources.getString(y46.toast_failure);
                    string.getClass();
                    by2 by2Var = new by2(string, my2.Y);
                    vg4Var.f0 = rj6Var;
                    vg4Var.h0 = 1;
                    Object objC = ky2Var.c(by2Var, vg4Var);
                    Object obj2 = c71.X;
                    if (objC == obj2) {
                        return obj2;
                    }
                }
            }
        } else {
            if (i2 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w39.n0(obj);
        }
        return dn8Var;
    }

    public static final long C(int i, int i2, boolean z, boolean z2) {
        long j = i;
        long j2 = ((long) i2) & 2147483647L;
        long j3 = z ? (j << 32) | Long.MIN_VALUE : (j << 32) & Long.MAX_VALUE;
        if (z2) {
            j2 |= 2147483648L;
        }
        return j2 | j3;
    }

    public static ne D(String str) throws ProtocolException {
        int i;
        String strSubstring;
        boolean Z2 = mm7.Z(str, false, "HTTP/1.");
        p06 p06Var = p06.HTTP_1_0;
        byte b = 9;
        if (Z2) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                p06Var = p06.HTTP_1_1;
            }
            i = 9;
        } else {
            if (!mm7.Z(str, false, "ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i3 = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                strSubstring = _UrlKt.FRAGMENT_ENCODE_SET;
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i + 4);
            }
            return new ne(p06Var, i3, strSubstring, b);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ti2 E(XmlResourceParser xmlResourceParser, Resources resources) throws Exception {
        int next;
        int i;
        String str;
        int i2;
        List list;
        String str2;
        boolean zIsTerminated;
        String str3;
        boolean zIsTerminated2;
        TimeUnit timeUnit = TimeUnit.DAYS;
        do {
            next = xmlResourceParser.next();
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        xmlResourceParser2.require(2, null, "font-family");
        if (!xmlResourceParser2.getName().equals("font-family")) {
            O(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser2), c66.FontFamily);
        String string = typedArrayObtainAttributes.getString(c66.FontFamily_fontProviderAuthority);
        String string2 = typedArrayObtainAttributes.getString(c66.FontFamily_fontProviderPackage);
        String string3 = typedArrayObtainAttributes.getString(c66.FontFamily_fontProviderQuery);
        String string4 = typedArrayObtainAttributes.getString(c66.FontFamily_fontProviderFallbackQuery);
        int resourceId = typedArrayObtainAttributes.getResourceId(c66.FontFamily_fontProviderCerts, 0);
        int integer = typedArrayObtainAttributes.getInteger(c66.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(c66.FontFamily_fontProviderFetchTimeout, 500);
        String string5 = typedArrayObtainAttributes.getString(c66.FontFamily_fontProviderSystemFontFamily);
        typedArrayObtainAttributes.recycle();
        int i3 = 3;
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), c66.FontFamilyFont);
                        int i4 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(c66.FontFamilyFont_fontWeight) ? c66.FontFamilyFont_fontWeight : c66.FontFamilyFont_android_fontWeight, 400);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(c66.FontFamilyFont_fontStyle) ? c66.FontFamilyFont_fontStyle : c66.FontFamilyFont_android_fontStyle, 0);
                        int i5 = typedArrayObtainAttributes2.hasValue(c66.FontFamilyFont_ttcIndex) ? c66.FontFamilyFont_ttcIndex : c66.FontFamilyFont_android_ttcIndex;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(c66.FontFamilyFont_fontVariationSettings) ? c66.FontFamilyFont_fontVariationSettings : c66.FontFamilyFont_android_fontVariationSettings);
                        int i6 = typedArrayObtainAttributes2.getInt(i5, 0);
                        int i7 = typedArrayObtainAttributes2.hasValue(c66.FontFamilyFont_font) ? c66.FontFamilyFont_font : c66.FontFamilyFont_android_font;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i7, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i7);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            O(xmlResourceParser);
                        }
                        arrayList.add(new vi2(i4, i6, resourceId2, string7, string6, z));
                    } else {
                        O(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new ui2((vi2[]) arrayList.toArray(new vi2[0]));
        }
        List listL = L(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser2.next() != i3) {
            if (xmlResourceParser2.getEventType() == i) {
                if (xmlResourceParser2.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser2), c66.FontFamilyProviderFallback);
                    try {
                        String string8 = typedArrayObtainAttributes3.getString(c66.FontFamilyProviderFallback_fontProviderQuery);
                        String string9 = typedArrayObtainAttributes3.getString(c66.FontFamilyProviderFallback_fontProviderSystemFontFamily);
                        String string10 = typedArrayObtainAttributes3.getString(c66.FontFamilyProviderFallback_fontVariationSettings);
                        if (string8 == null) {
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (true) {
                            str3 = string10;
                            if (xmlResourceParser2.next() == 3) {
                                break;
                            }
                            O(xmlResourceParser2);
                            string10 = str3;
                        }
                        int i8 = integer;
                        list = listL;
                        i2 = i8;
                        ni2 ni2Var = new ni2(string, string2, string8, list, string9, str3);
                        if (typedArrayObtainAttributes3 instanceof AutoCloseable) {
                            typedArrayObtainAttributes3.close();
                        } else {
                            if (typedArrayObtainAttributes3 instanceof ExecutorService) {
                                ExecutorService executorService = (ExecutorService) typedArrayObtainAttributes3;
                                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService.isTerminated())) {
                                    executorService.shutdown();
                                    boolean z2 = false;
                                    while (!zIsTerminated2) {
                                        String str4 = string;
                                        String str5 = string2;
                                        try {
                                            zIsTerminated2 = executorService.awaitTermination(1L, timeUnit);
                                        } catch (InterruptedException unused) {
                                            if (!z2) {
                                                executorService.shutdownNow();
                                                z2 = true;
                                            }
                                        }
                                        string = str4;
                                        string2 = str5;
                                    }
                                    str2 = string;
                                    str = string2;
                                    if (z2) {
                                        Thread.currentThread().interrupt();
                                    }
                                }
                            } else {
                                str2 = string;
                                str = string2;
                                typedArrayObtainAttributes3.recycle();
                            }
                            arrayList2.add(ni2Var);
                        }
                        str2 = string;
                        str = string2;
                        arrayList2.add(ni2Var);
                    } catch (Throwable th) {
                        if (typedArrayObtainAttributes3 == 0) {
                            throw th;
                        }
                        try {
                            if (typedArrayObtainAttributes3 instanceof AutoCloseable) {
                                typedArrayObtainAttributes3.close();
                                throw th;
                            }
                            if (!(typedArrayObtainAttributes3 instanceof ExecutorService)) {
                                typedArrayObtainAttributes3.recycle();
                                throw th;
                            }
                            ExecutorService executorService2 = (ExecutorService) typedArrayObtainAttributes3;
                            if (executorService2 == ForkJoinPool.commonPool() || (zIsTerminated = executorService2.isTerminated())) {
                                throw th;
                            }
                            executorService2.shutdown();
                            boolean z3 = false;
                            while (!zIsTerminated) {
                                try {
                                    zIsTerminated = executorService2.awaitTermination(1L, timeUnit);
                                } catch (InterruptedException unused2) {
                                    if (!z3) {
                                        executorService2.shutdownNow();
                                        z3 = true;
                                    }
                                }
                            }
                            if (!z3) {
                                throw th;
                            }
                            Thread.currentThread().interrupt();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } else {
                    str = string2;
                    i2 = integer;
                    list = listL;
                    str2 = string;
                    O(xmlResourceParser);
                }
                integer2 = integer2;
                listL = list;
                string = str2;
                string2 = str;
                i = 2;
                integer = i2;
                string5 = string5;
                i3 = 3;
                xmlResourceParser2 = xmlResourceParser;
            }
        }
        String str6 = string2;
        int i9 = integer;
        int i10 = integer2;
        String str7 = string5;
        List list2 = listL;
        String str8 = string;
        if (!arrayList2.isEmpty()) {
            return new wi2(arrayList2, i9, i10, str7);
        }
        if (string3 == null) {
            bt.q("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList2.add(new ni2(str8, str6, string3, list2, null, null));
        if (string4 != null) {
            arrayList2.add(new ni2(str8, str6, string4, list2, null, null));
        }
        return new wi2(arrayList2, i9, i10, str7);
    }

    public static final dq F(String str, String str2, int i, gn2 gn2Var) {
        char cCharAt = str.charAt(i);
        if (((Boolean) gn2Var.B(Character.valueOf(cCharAt))).booleanValue()) {
            return null;
        }
        return G(str, "Expected " + str2 + ", but got '" + cCharAt + "' at position " + i);
    }

    public static final dq G(String str, String str2) {
        return new dq((Object) (str2 + " when parsing an Instant from \"" + T(64, str) + '\"'), (Object) str, (byte) 3);
    }

    public static final int H(int i, String str) {
        return (str.charAt(i + 1) - '0') + ((str.charAt(i) - '0') * 10);
    }

    public static final ch I(dn2 dn2Var, lp2 lp2Var, int i) {
        View view = (View) lp2Var.j(pc.f);
        boolean zF = lp2Var.f(view);
        Object objK = lp2Var.K();
        Object obj = zz0.a;
        if (zF || objK == obj) {
            objK = new ch(view, null, dn2Var);
            lp2Var.g0(objK);
        }
        ch chVar = (ch) objK;
        boolean zH = lp2Var.h(chVar);
        Object objK2 = lp2Var.K();
        if (zH || objK2 == obj) {
            objK2 = new xg(chVar, (byte) 3);
            lp2Var.g0(objK2);
        }
        u70.a(chVar, (gn2) objK2, lp2Var);
        return chVar;
    }

    public static List L(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static HashSet M(String[] strArr) {
        Class<?> cls;
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            try {
                cls = Class.forName(str);
                if (!f26.class.isAssignableFrom(cls)) {
                    hi5.z0("QuirkSettingsLoader");
                    cls = null;
                }
            } catch (ClassNotFoundException unused) {
                hi5.z0("QuirkSettingsLoader");
            }
            if (cls != null) {
                hashSet.add(cls);
            }
        }
        return hashSet;
    }

    public static final fz3 N(Collection collection, gz3 gz3Var) {
        Iterator it = collection.iterator();
        fz3 fz3Var = null;
        while (it.hasNext()) {
            fz3 fz3Var2 = (fz3) it.next();
            if (dh3.f(fz3Var2.c(), gz3Var)) {
                if (fz3Var != null) {
                    u52.r(gz3Var, "Multiple extensions handle the same extension type: ");
                    return null;
                }
                fz3Var = fz3Var2;
            }
        }
        if (fz3Var != null) {
            return fz3Var;
        }
        u52.r(gz3Var, "No extensions handle the extension type: ");
        return null;
    }

    public static void O(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static char P(int i) throws oj2 {
        if (i < 45) {
            return Y[i];
        }
        throw oj2.a();
    }

    public static Icon Q(IconCompat iconCompat, Context context) {
        Icon iconCreateWithBitmap;
        InputStream inputStreamOpenInputStream;
        int i = iconCompat.a;
        String strZ = null;
        switch (i) {
            case -1:
                return (Icon) iconCompat.b;
            case 0:
            default:
                bt.q("Unknown type");
                return null;
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.b);
                break;
            case 2:
                if (i == -1) {
                    Object obj = iconCompat.b;
                    if (Build.VERSION.SDK_INT >= 28) {
                        strZ = en.z(obj);
                    } else {
                        try {
                            strZ = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                        }
                    }
                } else {
                    if (i != 2) {
                        u52.r(iconCompat, "called getResPackage() on ");
                        return null;
                    }
                    String str = iconCompat.j;
                    strZ = (str == null || TextUtils.isEmpty(str)) ? ((String) iconCompat.b).split(":", -1)[0] : iconCompat.j;
                }
                iconCreateWithBitmap = Icon.createWithResource(strZ, iconCompat.e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.b, iconCompat.e, iconCompat.f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.b);
                break;
            case 5:
                int i2 = Build.VERSION.SDK_INT;
                Object obj2 = iconCompat.b;
                iconCreateWithBitmap = i2 < 26 ? Icon.createWithBitmap(IconCompat.a((Bitmap) obj2, false)) : ue3.o((Bitmap) obj2);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    iconCreateWithBitmap = b4.b(iconCompat.e());
                } else {
                    if (context == null) {
                        c.a(iconCompat.e(), "Context is required to resolve the file uri of the icon: ");
                        return null;
                    }
                    Uri uriE = iconCompat.e();
                    String scheme = uriE.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriE);
                        } catch (Exception unused2) {
                            uriE.toString();
                            inputStreamOpenInputStream = null;
                        }
                    } else {
                        try {
                            inputStreamOpenInputStream = new FileInputStream(new File((String) iconCompat.b));
                        } catch (FileNotFoundException unused3) {
                            uriE.toString();
                            inputStreamOpenInputStream = null;
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        bt.p(iconCompat.e(), "Cannot load adaptive icon from uri: ");
                        return null;
                    }
                    if (Build.VERSION.SDK_INT < 26) {
                        iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.a(BitmapFactory.decodeStream(inputStreamOpenInputStream), false));
                    } else {
                        iconCreateWithBitmap = ue3.o(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                    }
                }
                break;
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.h;
        if (mode != IconCompat.k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public static final ev3 R(sx4 sx4Var) {
        Class clsQ = ms8.q(sx4Var);
        ev3 ev3Var = (ev3) (clsQ != null ? yb6.a.b(clsQ) : null);
        if (ev3Var != null) {
            return ev3Var;
        }
        u52.t(sx4Var.p(), "Type parameter container is not resolved: ");
        return null;
    }

    public static qs0 S(fk2 fk2Var) {
        fk2Var.getClass();
        return new qs0(fk2Var.b(), fk2Var.a.g());
    }

    public static final String T(int i, String str) {
        if (str.length() <= i) {
            return str.toString();
        }
        return str.subSequence(0, i).toString() + "...";
    }

    public static final boolean U(long j) {
        return (j & Long.MIN_VALUE) != 0;
    }

    public static final boolean V(long j) {
        return (j & 2147483648L) != 0;
    }

    public static final int W(long j) {
        return (int) ((j & 9223372032559808512L) >>> 32);
    }

    public static final void X(CaptureRequest.Builder builder, Map map) {
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key != null && (key instanceof CaptureRequest.Key)) {
                try {
                    builder.set((CaptureRequest.Key) key, value);
                } catch (IllegalArgumentException unused) {
                    ((CaptureRequest.Key) key).getName();
                    Objects.toString(value);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0098  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:70:0x012e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0146  */
    /* JADX WARN: Code duplicated, block: B:75:? A[RETURN, SYNTHETIC] */
    public static final void a(final kx4 kx4Var, j74 j74Var, float f, gg5 gg5Var, gt gtVar, p8 p8Var, he2 he2Var, boolean z, td tdVar, boolean z2, final gn2 gn2Var, lp2 lp2Var, final int i, final int i2) {
        int i3;
        final j74 j74VarA;
        gg5 ig5Var;
        int i4;
        int i5;
        int i6;
        boolean z3;
        final float f2;
        final gt gtVar2;
        final p8 p8Var2;
        final he2 he2Var2;
        final boolean z4;
        final td tdVar2;
        final boolean z5;
        final gg5 gg5Var2;
        j86 j86VarR;
        float f3;
        final p8 p8Var3;
        final he2 he2VarJ;
        final td tdVarA;
        final gt gtVar3;
        final boolean z6;
        final boolean z7;
        Object objK;
        int i7;
        gn2Var.getClass();
        lp2Var.X(-1919958082);
        if ((i & 6) == 0) {
            i3 = (lp2Var.f(kx4Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                j74VarA = j74Var;
                if (lp2Var.f(j74VarA)) {
                    i7 = 32;
                }
                i3 |= i7;
            } else {
                j74VarA = j74Var;
            }
            i7 = 16;
            i3 |= i7;
        } else {
            j74VarA = j74Var;
        }
        int i8 = i3 | 384;
        int i9 = i2 & 8;
        if (i9 == 0) {
            if ((i & 3072) == 0) {
                ig5Var = gg5Var;
                i8 |= lp2Var.f(ig5Var) ? 2048 : 1024;
            }
            i4 = i8 | 24576;
            if ((196608 & i) == 0) {
                i4 = 90112 | i8;
            }
            i5 = 1572864 | i4;
            if ((12582912 & i) == 0) {
                i5 = 5767168 | i4;
            }
            i6 = 100663296 | i5;
            if ((805306368 & i) == 0) {
                i6 = 369098752 | i5;
            }
            int i10 = (lp2Var.h(gn2Var) ? ' ' : (char) 16) | 6;
            if ((306783379 & i6) == 306783378 || (i10 & 19) != 18) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (lp2Var.N(i6 & 1, z3)) {
                lp2Var.S();
                if ((i & 1) != 0 || lp2Var.x()) {
                    if ((i2 & 2) != 0) {
                        j74VarA = l74.a(lp2Var);
                    }
                    if (i9 != 0) {
                        ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    f3 = 0.5f;
                    p8Var3 = pz2.q0;
                    he2VarJ = u70.J(lp2Var);
                    tdVarA = kf5.a(lp2Var);
                    gtVar3 = ht.c;
                    z6 = true;
                    z7 = true;
                } else {
                    lp2Var.Q();
                    f3 = f;
                    gtVar3 = gtVar;
                    p8Var3 = p8Var;
                    he2VarJ = he2Var;
                    z7 = z;
                    tdVarA = tdVar;
                    z6 = z2;
                }
                final gg5 gg5Var3 = ig5Var;
                final j74 j74Var2 = j74VarA;
                lp2Var.q();
                objK = lp2Var.K();
                if (objK == zz0.a) {
                    objK = new ex2(f3);
                    lp2Var.g0(objK);
                }
                mb6.a(y80.a.a((ex2) objK), jm4.U(-550545282, new rn2() { // from class: cx2
                    @Override // defpackage.rn2
                    public final Object K(Object obj, Object obj2) {
                        lp2 lp2Var2 = (lp2) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (lp2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                            kx4 kx4VarT = kx4Var;
                            boolean z8 = z6;
                            j74 j74Var3 = j74Var2;
                            if (z8) {
                                lp2Var2.W(1718860124);
                                lp2Var2.W(1813685158);
                                kx4VarT.getClass();
                                j74Var3.getClass();
                                long jB = dw0.b(0.6f, ((dp) lp2Var2.j(ep.z)).c.b);
                                long jB2 = dw0.b(0.12f, jB);
                                z24 z24Var = (z24) lp2Var2.j(y01.n);
                                boolean zH = lp2Var2.h(j74Var3) | lp2Var2.d(z24Var.ordinal()) | lp2Var2.e(jB2) | lp2Var2.e(jB);
                                Object objK2 = lp2Var2.K();
                                if (zH || objK2 == zz0.a) {
                                    y60 y60Var = new y60(j74Var3, z24Var, jB2, jB);
                                    lp2Var2.g0(y60Var);
                                    objK2 = y60Var;
                                }
                                kx4VarT = w79.t(kx4VarT, (gn2) objK2);
                                lp2Var2.p(false);
                            } else {
                                lp2Var2.W(1718860537);
                            }
                            lp2Var2.p(false);
                            jb5.c(kx4VarT, j74Var3, gg5Var3, gtVar3, p8Var3, he2VarJ, z7, tdVarA, gn2Var, lp2Var2, 0);
                        } else {
                            lp2Var2.Q();
                        }
                        return dn8.a;
                    }
                }, lp2Var), lp2Var, 56);
                f2 = f3;
                z5 = z6;
                j74VarA = j74Var2;
                gg5Var2 = gg5Var3;
                gtVar2 = gtVar3;
                p8Var2 = p8Var3;
                he2Var2 = he2VarJ;
                z4 = z7;
                tdVar2 = tdVarA;
            } else {
                lp2Var.Q();
                f2 = f;
                gtVar2 = gtVar;
                p8Var2 = p8Var;
                he2Var2 = he2Var;
                z4 = z;
                tdVar2 = tdVar;
                z5 = z2;
                gg5Var2 = ig5Var;
            }
            j86VarR = lp2Var.r();
            if (j86VarR != null) {
                j86VarR.d = new rn2() { // from class: dx2
                    @Override // defpackage.rn2
                    public final Object K(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iP = w79.P(i | 1);
                        jb5.a(kx4Var, j74VarA, f2, gg5Var2, gtVar2, p8Var2, he2Var2, z4, tdVar2, z5, gn2Var, (lp2) obj, iP, i2);
                        return dn8.a;
                    }
                };
            }
        }
        i8 = i3 | 3456;
        ig5Var = gg5Var;
        i4 = i8 | 24576;
        if ((196608 & i) == 0) {
            i4 = 90112 | i8;
        }
        i5 = 1572864 | i4;
        if ((12582912 & i) == 0) {
            i5 = 5767168 | i4;
        }
        i6 = 100663296 | i5;
        if ((805306368 & i) == 0) {
            i6 = 369098752 | i5;
        }
        int i11 = (lp2Var.h(gn2Var) ? ' ' : (char) 16) | 6;
        if ((306783379 & i6) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (lp2Var.N(i6 & 1, z3)) {
            lp2Var.S();
            if ((i & 1) != 0) {
                if ((i2 & 2) != 0) {
                    j74VarA = l74.a(lp2Var);
                }
                if (i9 != 0) {
                    ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                }
                f3 = 0.5f;
                p8Var3 = pz2.q0;
                he2VarJ = u70.J(lp2Var);
                tdVarA = kf5.a(lp2Var);
                gtVar3 = ht.c;
                z6 = true;
                z7 = true;
            } else {
                if ((i2 & 2) != 0) {
                    j74VarA = l74.a(lp2Var);
                }
                if (i9 != 0) {
                    ig5Var = new ig5(0.0f, 0.0f, 0.0f, 0.0f);
                }
                f3 = 0.5f;
                p8Var3 = pz2.q0;
                he2VarJ = u70.J(lp2Var);
                tdVarA = kf5.a(lp2Var);
                gtVar3 = ht.c;
                z6 = true;
                z7 = true;
            }
            final gg5 gg5Var4 = ig5Var;
            final j74 j74Var3 = j74VarA;
            lp2Var.q();
            objK = lp2Var.K();
            if (objK == zz0.a) {
                objK = new ex2(f3);
                lp2Var.g0(objK);
            }
            mb6.a(y80.a.a((ex2) objK), jm4.U(-550545282, new rn2() { // from class: cx2
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    lp2 lp2Var2 = (lp2) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (lp2Var2.N(iIntValue & 1, (iIntValue & 3) != 2)) {
                        kx4 kx4VarT = kx4Var;
                        boolean z8 = z6;
                        j74 j74Var4 = j74Var3;
                        if (z8) {
                            lp2Var2.W(1718860124);
                            lp2Var2.W(1813685158);
                            kx4VarT.getClass();
                            j74Var4.getClass();
                            long jB = dw0.b(0.6f, ((dp) lp2Var2.j(ep.z)).c.b);
                            long jB2 = dw0.b(0.12f, jB);
                            z24 z24Var = (z24) lp2Var2.j(y01.n);
                            boolean zH = lp2Var2.h(j74Var4) | lp2Var2.d(z24Var.ordinal()) | lp2Var2.e(jB2) | lp2Var2.e(jB);
                            Object objK2 = lp2Var2.K();
                            if (zH || objK2 == zz0.a) {
                                y60 y60Var = new y60(j74Var4, z24Var, jB2, jB);
                                lp2Var2.g0(y60Var);
                                objK2 = y60Var;
                            }
                            kx4VarT = w79.t(kx4VarT, (gn2) objK2);
                            lp2Var2.p(false);
                        } else {
                            lp2Var2.W(1718860537);
                        }
                        lp2Var2.p(false);
                        jb5.c(kx4VarT, j74Var4, gg5Var4, gtVar3, p8Var3, he2VarJ, z7, tdVarA, gn2Var, lp2Var2, 0);
                    } else {
                        lp2Var2.Q();
                    }
                    return dn8.a;
                }
            }, lp2Var), lp2Var, 56);
            f2 = f3;
            z5 = z6;
            j74VarA = j74Var3;
            gg5Var2 = gg5Var4;
            gtVar2 = gtVar3;
            p8Var2 = p8Var3;
            he2Var2 = he2VarJ;
            z4 = z7;
            tdVar2 = tdVarA;
        } else {
            lp2Var.Q();
            f2 = f;
            gtVar2 = gtVar;
            p8Var2 = p8Var;
            he2Var2 = he2Var;
            z4 = z;
            tdVar2 = tdVar;
            z5 = z2;
            gg5Var2 = ig5Var;
        }
        j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: dx2
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = w79.P(i | 1);
                    jb5.a(kx4Var, j74VarA, f2, gg5Var2, gtVar2, p8Var2, he2Var2, z4, tdVar2, z5, gn2Var, (lp2) obj, iP, i2);
                    return dn8.a;
                }
            };
        }
    }

    public static final void b(final kx4 kx4Var, final float f, final long j, lp2 lp2Var, final int i) {
        int i2;
        lp2Var.X(75144485);
        if ((i & 6) == 0) {
            i2 = (lp2Var.f(kx4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (lp2Var.e(j) ? 256 : 128);
        boolean z = true;
        if (lp2Var.N(i3 & 1, (i3 & 147) != 146)) {
            lp2Var.S();
            if ((i & 1) != 0 && !lp2Var.x()) {
                lp2Var.Q();
            }
            lp2Var.q();
            kx4 kx4VarB = b.b(kx4Var.y(b.a), f);
            if ((((i3 & 896) ^ 384) <= 256 || !lp2Var.e(j)) && (i3 & 384) != 256) {
                z = false;
            }
            Object objK = lp2Var.K();
            if (z || objK == zz0.a) {
                objK = new gn2() { // from class: mq1
                    @Override // defpackage.gn2
                    public final Object B(Object obj) {
                        sv1 sv1Var = (sv1) obj;
                        float f2 = f;
                        float fH0 = sv1Var.h0(f2);
                        float fH1 = sv1Var.h0(f2) / 2.0f;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fH1)) & 4294967295L);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (sv1Var.e() >> 32));
                        float fH2 = sv1Var.h0(f2) / 2.0f;
                        sv1.v0(sv1Var, j, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fH2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), fH0, 0, 496);
                        return dn8.a;
                    }
                };
                lp2Var.g0(objK);
            }
            yn0.b(0, (gn2) objK, lp2Var, kx4VarB);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new rn2() { // from class: nq1
                @Override // defpackage.rn2
                public final Object K(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    jb5.b(kx4Var, f, j, (lp2) obj, w79.P(i | 1));
                    return dn8.a;
                }
            };
        }
    }

    public static final void c(kx4 kx4Var, j74 j74Var, gg5 gg5Var, gt gtVar, p8 p8Var, he2 he2Var, boolean z, td tdVar, gn2 gn2Var, lp2 lp2Var, int i) {
        lp2Var.X(53695811);
        int i2 = i | (lp2Var.f(kx4Var) ? 4 : 2) | (lp2Var.f(j74Var) ? 32 : 16) | (lp2Var.f(gg5Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (lp2Var.g(false) ? 2048 : 1024) | (lp2Var.f(gtVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (lp2Var.f(p8Var) ? 131072 : DnsOverHttps.MAX_RESPONSE_SIZE) | (lp2Var.f(he2Var) ? 1048576 : 524288) | (lp2Var.g(z) ? XRayConfig.OutboundBean.StreamSettingsBean.QuicParamsBean.DEFAULT_STREAM_WINDOW : 4194304) | (lp2Var.f(tdVar) ? 67108864 : 33554432) | (lp2Var.h(gn2Var) ? 536870912 : 268435456);
        if (lp2Var.N(i2 & 1, (306783379 & i2) != 306783378)) {
            lp2Var.S();
            if ((i & 1) != 0 && !lp2Var.x()) {
                lp2Var.Q();
            }
            lp2Var.q();
            int i3 = i2 >> 3;
            w39.d(kx4Var, j74Var, gg5Var, he2Var, z, tdVar, p8Var, gtVar, gn2Var, lp2Var, (i2 & 14) | 24576 | (i2 & 112) | (i2 & 896) | (i2 & 7168) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128) | ((i2 << 12) & 1879048192), ((i2 >> 12) & 14) | ((i2 >> 18) & 7168));
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new ix2(kx4Var, j74Var, gg5Var, gtVar, p8Var, he2Var, z, tdVar, gn2Var, i);
        }
    }

    public static final void d(kx4 kx4Var, zy0 zy0Var, lp2 lp2Var, int i) {
        int i2;
        lp2Var.X(2064964257);
        if ((i & 6) == 0) {
            i2 = (lp2Var.f(kx4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.h(zy0Var) ? 32 : 16;
        }
        byte b = 0;
        if (lp2Var.N(i2 & 1, (i2 & 19) != 18)) {
            e(kx4Var, zy0Var, lp2Var, ((i2 << 3) & 896) | (i2 & 14) | 48);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new dh(kx4Var, zy0Var, i, b);
        }
    }

    public static final void e(kx4 kx4Var, zy0 zy0Var, lp2 lp2Var, int i) {
        int i2;
        lp2Var.X(771959668);
        if ((i & 6) == 0) {
            i2 = (lp2Var.f(kx4Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= lp2Var.h(null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= lp2Var.h(zy0Var) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        byte b = 0;
        byte b2 = 1;
        if (lp2Var.N(i2 & 1, (i2 & 147) != 146)) {
            Object objK = lp2Var.K();
            be beVar = zz0.a;
            if (objK == beVar) {
                rh5 rh5Var = new rh5(null, lh4.i0);
                lp2Var.g0(rh5Var);
                objK = rh5Var;
            }
            y05 y05Var = (y05) objK;
            Object objK2 = lp2Var.K();
            if (objK2 == beVar) {
                objK2 = new eh(y05Var, b);
                lp2Var.g0(objK2);
            }
            mb6.a(r38.b.a(I((dn2) objK2, lp2Var, 0)), jm4.U(-291176396, new fh(kx4Var, y05Var, zy0Var, b), lp2Var), lp2Var, 56);
        } else {
            lp2Var.Q();
        }
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new dh(kx4Var, zy0Var, i, b2);
        }
    }

    public static final void f(p67 p67Var, za3 za3Var, lp2 lp2Var, int i) {
        p67Var.getClass();
        lp2Var.X(20802214);
        y05 y05VarO = i21.o(p67Var.d, lp2Var);
        boolean zH = lp2Var.h(p67Var);
        Object objK = lp2Var.K();
        be beVar = zz0.a;
        if (zH || objK == beVar) {
            al5 al5Var = new al5(1, p67Var, p67.class, "onUiIntent", "onUiIntent(Lsu/happ/proxyutility/feature/settings/SettingsUiIntent;)V", 0, (byte) 12);
            lp2Var.g0(al5Var);
            objK = al5Var;
        }
        pv3 pv3Var = (pv3) objK;
        Object objK2 = lp2Var.K();
        if (objK2 == beVar) {
            objK2 = new zx6((byte) 7);
            lp2Var.g0(objK2);
        }
        byte b = 0;
        o87 o87VarF = zw4.f((gn2) objK2, lp2Var, 54, 0);
        Object objK3 = lp2Var.K();
        if (objK3 == beVar) {
            objK3 = new ky2();
            lp2Var.g0(objK3);
        }
        ky2 ky2Var = (ky2) objK3;
        mb6.a(ly2.a.a(ky2Var), jm4.U(-252457498, new fm4(p67Var, pv3Var, za3Var, o87VarF, ky2Var, y05VarO), lp2Var), lp2Var, 56);
        j86 j86VarR = lp2Var.r();
        if (j86VarR != null) {
            j86VarR.d = new d67(b, i, p67Var, za3Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object g(Collection collection, s51 s51Var) {
        if (collection.isEmpty()) {
            return d02.X;
        }
        xg1[] xg1VarArr = (xg1[]) collection.toArray(new xg1[0]);
        b00 b00Var = new b00(xg1VarArr);
        mm0 mm0Var = new mm0(1, mb6.H(s51Var));
        mm0Var.s();
        int length = xg1VarArr.length;
        zz[] zzVarArr = new zz[length];
        for (int i = 0; i < length; i++) {
            og7 og7Var = xg1VarArr[i];
            og7Var.start();
            zz zzVar = new zz(b00Var, mm0Var);
            zzVar.h0 = u70.W(og7Var, true, zzVar);
            zzVarArr[i] = zzVar;
        }
        a00 a00Var = new a00(zzVarArr);
        for (int i2 = 0; i2 < length; i2++) {
            zz zzVar2 = zzVarArr[i2];
            zzVar2.getClass();
            iu.a.putObjectVolatile(zzVar2, zz.j0, a00Var);
        }
        if (mm0Var.r() instanceof b65) {
            mm0Var.v(a00Var);
        } else {
            a00Var.a();
        }
        return mm0Var.q();
    }

    public static g26 h(Context context, Bundle bundle) {
        boolean z = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] strArrZ = z(context, bundle, "androidx.camera.core.quirks.FORCE_ENABLED");
        String[] strArrZ2 = z(context, bundle, "androidx.camera.core.quirks.FORCE_DISABLED");
        hi5.z0("QuirkSettingsLoader");
        hi5.z0("QuirkSettingsLoader");
        Arrays.toString(strArrZ);
        hi5.z0("QuirkSettingsLoader");
        Arrays.toString(strArrZ2);
        hi5.z0("QuirkSettingsLoader");
        return new g26(z, new HashSet(M(strArrZ)), new HashSet(M(strArrZ2)));
    }

    public static void i(Object obj, String str) {
        if (obj != null) {
            return;
        }
        b61.i(str);
    }

    public static xg0 j(xg0... xg0VarArr) {
        List listAsList = Arrays.asList(xg0VarArr);
        if (listAsList.isEmpty()) {
            return new zg0();
        }
        return listAsList.size() == 1 ? (xg0) listAsList.get(0) : new yg0(listAsList);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    public static void k(x50 x50Var, StringBuilder sb, int i, boolean z) throws oj2 {
        while (i > 1) {
            if (x50Var.b() < 11) {
                throw oj2.a();
            }
            int iD = x50Var.d(11);
            sb.append(P(iD / 45));
            sb.append(P(iD % 45));
            i -= 2;
        }
        if (i == 1) {
            if (x50Var.b() < 6) {
                throw oj2.a();
            }
            sb.append(P(x50Var.d(6)));
        }
        if (z) {
            for (int length = sb.length(); length < sb.length(); length++) {
                if (sb.charAt(length) == '%') {
                    if (length < sb.length() - 1) {
                        int i2 = length + 1;
                        if (sb.charAt(i2) == '%') {
                            sb.deleteCharAt(i2);
                        } else {
                            sb.setCharAt(length, (char) 29);
                        }
                    } else {
                        sb.setCharAt(length, (char) 29);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:132:0x0157  */
    /* JADX WARN: Code duplicated, block: B:157:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x00da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f2  */
    public static void l(x50 x50Var, StringBuilder sb, int i, hq0 hq0Var, ArrayList arrayList) throws oj2 {
        Charset charsetForName;
        boolean z;
        byte b;
        if (i * 8 > x50Var.b()) {
            throw oj2.a();
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) x50Var.d(8);
        }
        if (hq0Var == null) {
            Charset charset = am7.b;
            boolean z2 = true;
            if (i <= 2 || !(((b = bArr[0]) == -2 && bArr[1] == -1) || (b == -1 && bArr[1] == -2))) {
                boolean z3 = charset != null;
                boolean z4 = i > 3 && bArr[0] == -17 && bArr[1] == -69 && bArr[2] == -65;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                boolean z5 = z3;
                boolean z6 = true;
                while (i6 < i && (z2 || z5 || z6)) {
                    Charset charset2 = charset;
                    byte b2 = bArr[i6];
                    boolean z7 = z2;
                    int i15 = b2 & 255;
                    if (z6) {
                        if (i7 > 0) {
                            if ((b2 & 128) != 0) {
                                i7--;
                            }
                            if (z7) {
                                if (i15 <= 127 && i15 < 160) {
                                    z7 = false;
                                } else if (i15 > 159 && (i15 < 192 || i15 == 215 || i15 == 247)) {
                                    i12++;
                                }
                            }
                            if (!z5) {
                                if (i8 > 0) {
                                    if (i15 >= 64 || i15 == 127 || i15 > 252) {
                                        z5 = false;
                                    } else {
                                        i8--;
                                    }
                                } else if (i15 != 128 || i15 == 160 || i15 > 239) {
                                    z5 = false;
                                } else if (i15 <= 160 || i15 >= 224) {
                                    if (i15 > 127) {
                                        i8++;
                                        int i16 = i13 + 1;
                                        if (i16 > i4) {
                                            i4 = i16;
                                            i13 = i4;
                                        } else {
                                            i13 = i16;
                                        }
                                    } else {
                                        i13 = 0;
                                    }
                                    i14 = 0;
                                } else {
                                    i5++;
                                    int i17 = i14 + 1;
                                    if (i17 > i2) {
                                        i2 = i17;
                                        i14 = i2;
                                    } else {
                                        i14 = i17;
                                    }
                                    i13 = 0;
                                }
                            }
                            i6++;
                            charset = charset2;
                            z2 = z7;
                        } else {
                            z = z6;
                            if ((b2 & 128) != 0) {
                                if ((b2 & 64) != 0) {
                                    int i18 = i7 + 1;
                                    if ((b2 & 32) == 0) {
                                        i9++;
                                    } else {
                                        i18 = i7 + 2;
                                        if ((b2 & 16) == 0) {
                                            i10++;
                                        } else {
                                            i7 += 3;
                                            if ((b2 & 8) == 0) {
                                                i11++;
                                            }
                                            if (z7) {
                                                if (i15 <= 127) {
                                                    if (i15 > 159) {
                                                        i12++;
                                                    }
                                                } else if (i15 > 159) {
                                                    i12++;
                                                }
                                            }
                                            if (!z5) {
                                                if (i8 > 0) {
                                                    if (i15 >= 64) {
                                                        z5 = false;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                } else if (i15 != 128) {
                                                    z5 = false;
                                                } else {
                                                    z5 = false;
                                                }
                                            }
                                            i6++;
                                            charset = charset2;
                                            z2 = z7;
                                        }
                                    }
                                    i7 = i18;
                                }
                            }
                        }
                        z6 = false;
                        if (z7) {
                            if (i15 <= 127) {
                                if (i15 > 159) {
                                    i12++;
                                }
                            } else if (i15 > 159) {
                                i12++;
                            }
                        }
                        if (!z5) {
                            if (i8 > 0) {
                                if (i15 >= 64) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                            } else if (i15 != 128) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                        }
                        i6++;
                        charset = charset2;
                        z2 = z7;
                    } else {
                        z = z6;
                    }
                    z6 = z;
                    if (z7) {
                        if (i15 <= 127) {
                            if (i15 > 159) {
                                i12++;
                            }
                        } else if (i15 > 159) {
                            i12++;
                        }
                    }
                    if (!z5) {
                        if (i8 > 0) {
                            if (i15 >= 64) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                        } else if (i15 != 128) {
                            z5 = false;
                        } else {
                            z5 = false;
                        }
                    }
                    i6++;
                    charset = charset2;
                    z2 = z7;
                }
                Charset charset3 = charset;
                boolean z8 = z2;
                boolean z9 = z6;
                boolean z10 = (!z9 || i7 <= 0) ? z9 : false;
                boolean z11 = (!z5 || i8 <= 0) ? z5 : false;
                if (z10 && (z4 || i9 + i10 + i11 > 0)) {
                    charsetForName = StandardCharsets.UTF_8;
                } else if (z11 && (am7.d || i2 >= 3 || i4 >= 3)) {
                    charsetForName = charset3;
                } else if (z8 && z11) {
                    if (!(i2 == 2 && i5 == 2) && i12 * 10 < i) {
                        charsetForName = StandardCharsets.ISO_8859_1;
                    } else {
                        charsetForName = charset3;
                    }
                } else if (z8) {
                    charsetForName = StandardCharsets.ISO_8859_1;
                } else if (z11) {
                    charsetForName = charset3;
                } else {
                    charsetForName = z10 ? StandardCharsets.UTF_8 : am7.a;
                }
            } else {
                charsetForName = StandardCharsets.UTF_16;
            }
        } else {
            charsetForName = Charset.forName(hq0Var.name());
        }
        sb.append(new String(bArr, charsetForName));
        arrayList.add(bArr);
    }

    public static void m(x50 x50Var, StringBuilder sb, int i) throws oj2 {
        if (am7.c == null) {
            throw oj2.a();
        }
        if (i * 13 > x50Var.b()) {
            throw oj2.a();
        }
        byte[] bArr = new byte[i * 2];
        int i2 = 0;
        while (i > 0) {
            int iD = x50Var.d(13);
            int i3 = (iD % 96) | ((iD / 96) << 8);
            int i4 = i3 + (i3 < 2560 ? 41377 : 42657);
            bArr[i2] = (byte) ((i4 >> 8) & 255);
            bArr[i2 + 1] = (byte) (i4 & 255);
            i2 += 2;
            i--;
        }
        sb.append(new String(bArr, am7.c));
    }

    public static void n(x50 x50Var, StringBuilder sb, int i) throws oj2 {
        if (am7.b == null) {
            throw oj2.a();
        }
        if (i * 13 > x50Var.b()) {
            throw oj2.a();
        }
        byte[] bArr = new byte[i * 2];
        int i2 = 0;
        while (i > 0) {
            int iD = x50Var.d(13);
            int i3 = (iD % 192) | ((iD / 192) << 8);
            int i4 = i3 + (i3 < 7936 ? 33088 : 49472);
            bArr[i2] = (byte) (i4 >> 8);
            bArr[i2 + 1] = (byte) i4;
            i2 += 2;
            i--;
        }
        sb.append(new String(bArr, am7.b));
    }

    public static void o(x50 x50Var, StringBuilder sb, int i) throws oj2 {
        while (i >= 3) {
            if (x50Var.b() < 10) {
                throw oj2.a();
            }
            int iD = x50Var.d(10);
            if (iD >= 1000) {
                throw oj2.a();
            }
            sb.append(P(iD / 100));
            sb.append(P((iD / 10) % 10));
            sb.append(P(iD % 10));
            i -= 3;
        }
        if (i == 2) {
            if (x50Var.b() < 7) {
                throw oj2.a();
            }
            int iD2 = x50Var.d(7);
            if (iD2 >= 100) {
                throw oj2.a();
            }
            sb.append(P(iD2 / 10));
            sb.append(P(iD2 % 10));
            return;
        }
        if (i == 1) {
            if (x50Var.b() < 4) {
                throw oj2.a();
            }
            int iD3 = x50Var.d(4);
            if (iD3 >= 10) {
                throw oj2.a();
            }
            sb.append(P(iD3));
        }
    }

    public static Object p(List list, d91 d91Var, w45 w45Var) {
        wl6 wl6Var = new wl6((byte) 24);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q(it.next(), d91Var, wl6Var, w45Var);
        }
        return w45Var.R();
    }

    public static void q(Object obj, d91 d91Var, wl6 wl6Var, w45 w45Var) {
        if (obj != null) {
            if (((HashSet) wl6Var.Y).add(obj) && w45Var.j(obj)) {
                Iterator it = d91Var.a(obj).iterator();
                while (it.hasNext()) {
                    q(it.next(), d91Var, wl6Var, w45Var);
                }
                w45Var.i(obj);
                return;
            }
            return;
        }
        Object[] objArr = new Object[3];
        switch (22) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case 17:
            case 20:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (22) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case FileClientSessionCache.MAX_SIZE /* 12 */:
            case 13:
            case 14:
            case 15:
            case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case XRayConfig.OutboundBean.StreamSettingsBean.KcpSettingsBean.mtuMin /* 21 */:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final void s(StringBuilder sb, StringBuilder sb2, int i) {
        if (i < 10) {
            sb.append('0');
        }
        sb2.append(i);
    }

    public static qs0 t(String str, boolean z) {
        String strW;
        str.getClass();
        int iL0 = fm7.l0(str, '`', 0, 6);
        if (iL0 == -1) {
            iL0 = str.length();
        }
        int iR0 = fm7.r0(str, "/", iL0, 4);
        String str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        if (iR0 == -1) {
            strW = mm7.W(str, "`", _UrlKt.FRAGMENT_ENCODE_SET, false);
        } else {
            String strReplace = str.substring(0, iR0).replace('/', '.');
            strReplace.getClass();
            strW = mm7.W(str.substring(iR0 + 1), "`", _UrlKt.FRAGMENT_ENCODE_SET, false);
            str2 = strReplace;
        }
        return new qs0(new fk2(str2), new fk2(strW), z);
    }

    public static final gt4 u(cz5 cz5Var, w15 w15Var, ux4 ux4Var, boolean z, boolean z2, boolean z3) {
        w15Var.getClass();
        aq2 aq2Var = lu3.d;
        aq2Var.getClass();
        fu3 fu3Var = (fu3) ch3.y(cz5Var, aq2Var);
        if (fu3Var != null) {
            if (z) {
                r62 r62Var = mu3.a;
                kt3 kt3VarB = mu3.b(cz5Var, w15Var, ux4Var, z3);
                if (kt3VarB != null) {
                    return gv3.u(kt3VarB);
                }
            } else if (z2 && (fu3Var.Y & 2) == 2) {
                du3 du3Var = fu3Var.f0;
                du3Var.getClass();
                return new gt4(w15Var.getString(du3Var.Z).concat(w15Var.getString(du3Var.f0)));
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean[], java.io.Serializable] */
    public static Boolean w(List list, d91 d91Var, gn2 gn2Var) {
        return (Boolean) p(list, d91Var, new c91(gn2Var, new boolean[1], (byte) 0));
    }

    public static final boolean x(lb1 lb1Var, int i, int i2) {
        lb1Var.getClass();
        if (i > i2 && lb1Var.k) {
            return false;
        }
        Set set = lb1Var.l;
        return lb1Var.j && (set == null || !set.contains(Integer.valueOf(i)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object y(Collection collection, q51 q51Var) {
        e00 e00Var;
        Iterator it;
        int i;
        if (q51Var instanceof e00) {
            e00Var = (e00) q51Var;
            int i2 = e00Var.i0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e00Var.i0 = i2 - Integer.MIN_VALUE;
            } else {
                e00Var = new e00(q51Var);
            }
        } else {
            e00Var = new e00(q51Var);
        }
        Object obj = e00Var.h0;
        int i3 = e00Var.i0;
        if (i3 == 0) {
            w39.n0(obj);
            it = collection.iterator();
            i = 0;
        } else {
            if (i3 != 1) {
                bt.i("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = e00Var.g0;
            it = e00Var.f0;
            w39.n0(obj);
        }
        while (it.hasNext()) {
            bm3 bm3Var = (bm3) it.next();
            e00Var.f0 = it;
            e00Var.g0 = i;
            e00Var.i0 = 1;
            Object objV0 = bm3Var.V0(e00Var);
            c71 c71Var = c71.X;
            if (objV0 == c71Var) {
                return c71Var;
            }
        }
        return dn8.a;
    }

    public static String[] z(Context context, Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            hi5.z0("QuirkSettingsLoader");
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i);
        } catch (Resources.NotFoundException unused) {
            hi5.z0("QuirkSettingsLoader");
            return new String[0];
        }
    }

    public abstract Object A();

    public abstract void J(String str);

    public abstract void K(String str);

    public boolean r(rt6 rt6Var) {
        return true;
    }
}
