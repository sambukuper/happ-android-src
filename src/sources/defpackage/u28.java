package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.internal.url._UrlKt;
import okhttp3.internal.ws.WebSocketProtocol;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u28 {
    public static final LinkedHashMap a(ArrayList arrayList) {
        String str = oi5.Y;
        oi5 oi5VarR = g55.r("/");
        LinkedHashMap linkedHashMapK = zp4.K(new qg5(oi5VarR, new k79(oi5VarR, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (k79 k79Var : wv0.S0(arrayList, new mv4((byte) 13))) {
            if (((k79) linkedHashMapK.put(k79Var.a, k79Var)) == null) {
                while (true) {
                    oi5 oi5Var = k79Var.a;
                    oi5 oi5VarC = oi5Var.c();
                    if (oi5VarC == null) {
                        break;
                    }
                    k79 k79Var2 = (k79) linkedHashMapK.get(oi5VarC);
                    if (k79Var2 != null) {
                        k79Var2.q.add(oi5Var);
                        break;
                    }
                    k79 k79Var3 = new k79(oi5VarC, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                    linkedHashMapK.put(oi5VarC, k79Var3);
                    k79Var3.q.add(oi5Var);
                    k79Var = k79Var3;
                }
            }
        }
        return linkedHashMapK;
    }

    public static boolean b(File file, Resources resources, int i) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                boolean zC = c(file, inputStreamOpenRawResource);
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused) {
                    }
                }
                return zC;
            } catch (Throwable th) {
                th = th;
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean c(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i != -1) {
                            fileOutputStream2.write(bArr, 0, i);
                        } else {
                            try {
                                break;
                            } catch (IOException unused) {
                            }
                        }
                    }
                    fileOutputStream2.close();
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    e.getMessage();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused3) {
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static b10 d(x50 x50Var) throws IOException {
        long j = 0;
        long j2 = 0;
        String strH = _UrlKt.FRAGMENT_ENCODE_SET;
        String strH2 = strH;
        String strH3 = strH2;
        while (true) {
            int i = x50Var.i();
            if (i == 0) {
                return new b10(strH, strH2, j, strH3, j2);
            }
            int i2 = i >>> 3;
            int i3 = i & 7;
            switch (i2) {
                case 1:
                    x50.c(i2, 0, i3);
                    j = x50Var.j();
                    break;
                case 2:
                    x50.c(i2, 0, i3);
                    j2 = x50Var.j();
                    break;
                case 3:
                    x50.c(i2, 0, i3);
                    x50Var.j();
                    break;
                case 4:
                    x50.c(i2, 2, i3);
                    strH = x50Var.h();
                    break;
                case 5:
                    x50.c(i2, 0, i3);
                    x50Var.j();
                    break;
                case 6:
                    x50.c(i2, 2, i3);
                    strH2 = x50Var.h();
                    break;
                case 7:
                    x50.c(i2, 0, i3);
                    x50Var.j();
                    break;
                case 8:
                    x50.c(i2, 2, i3);
                    strH3 = x50Var.h();
                    break;
                default:
                    x50Var.k(i3);
                    break;
            }
        }
    }

    public static k42 e(x50 x50Var) throws IOException {
        while (true) {
            int i = x50Var.i();
            if (i == 0) {
                return new k42();
            }
            int i2 = i >>> 3;
            int i3 = i & 7;
            if (i2 == 1) {
                x50.c(i2, 2, i3);
                x50Var.h();
            } else if (i2 == 2) {
                x50.c(i2, 2, i3);
                x50Var.h();
            } else if (i2 == 3) {
                x50.c(i2, 0, i3);
                x50Var.j();
            } else if (i2 == 4) {
                x50.c(i2, 2, i3);
                x50Var.f();
            } else if (i2 != 6) {
                x50Var.k(i3);
            } else {
                x50.c(i2, 2, i3);
                x50 x50VarG = x50Var.g();
                while (true) {
                    int i4 = x50VarG.i();
                    if (i4 != 0) {
                        int i5 = i4 >>> 3;
                        int i6 = i4 & 7;
                        if (i5 != 1) {
                            x50VarG.k(i6);
                        } else {
                            x50.c(i5, 2, i6);
                            x50VarG.f();
                        }
                    }
                }
            }
        }
    }

    public static void f(x50 x50Var, HashMap map) throws IOException {
        int i;
        int i2;
        x50 x50Var2;
        int i3 = 0;
        mb8 mb8Var = null;
        int iJ = 0;
        while (true) {
            int i4 = x50Var.i();
            if (i4 == 0) {
                if (mb8Var != null) {
                    map.put(Integer.valueOf(iJ), mb8Var);
                    return;
                }
                return;
            }
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            int i7 = 1;
            if (i5 == 1) {
                i = i3;
                x50.c(i5, i, i6);
                iJ = (int) x50Var.j();
            } else if (i5 != 2) {
                x50Var.k(i6);
                i = i3;
            } else {
                x50.c(i5, 2, i6);
                x50 x50VarG = x50Var.g();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int iJ2 = i3;
                String strH = _UrlKt.FRAGMENT_ENCODE_SET;
                while (true) {
                    int i8 = x50VarG.i();
                    if (i8 != 0) {
                        int i9 = i8 >>> 3;
                        int i10 = i8 & 7;
                        switch (i9) {
                            case 1:
                                i2 = i3;
                                x50Var2 = x50VarG;
                                x50.c(i9, i2, i10);
                                iJ2 = (int) x50Var2.j();
                                break;
                            case 2:
                                x50Var2 = x50VarG;
                                x50.c(i9, 2, i10);
                                strH = x50Var2.h();
                                i2 = 0;
                                break;
                            case 3:
                                x50.c(i9, 2, i10);
                                x50 x50VarG2 = x50VarG.g();
                                String strH2 = _UrlKt.FRAGMENT_ENCODE_SET;
                                long j = 0;
                                while (true) {
                                    int i11 = x50VarG2.i();
                                    if (i11 == 0) {
                                        x50Var2 = x50VarG;
                                        arrayList.add(new nc6(j, strH2));
                                        i2 = 0;
                                    } else {
                                        int i12 = i11 >>> 3;
                                        x50 x50Var3 = x50VarG;
                                        int i13 = i11 & 7;
                                        if (i12 == i7) {
                                            x50.c(i12, 2, i13);
                                            strH2 = x50VarG2.h();
                                        } else if (i12 != 2) {
                                            x50VarG2.k(i13);
                                        } else {
                                            x50.c(i12, 0, i13);
                                            j = x50VarG2.j();
                                        }
                                        x50VarG = x50Var3;
                                        i7 = 1;
                                    }
                                    break;
                                }
                                break;
                            case 4:
                                x50.c(i9, 2, i10);
                                arrayList4.add(d(x50VarG.g()));
                                x50Var2 = x50VarG;
                                i2 = 0;
                                break;
                            case 5:
                                x50.c(i9, 2, i10);
                                arrayList5.add(e(x50VarG.g()));
                                x50Var2 = x50VarG;
                                i2 = 0;
                                break;
                            case 6:
                                x50.c(i9, i3, i10);
                                x50VarG.j();
                                i2 = i3;
                                x50Var2 = x50VarG;
                                break;
                            case 7:
                                x50.c(i9, 2, i10);
                                arrayList2.add(x50VarG.h());
                                x50Var2 = x50VarG;
                                i2 = 0;
                                break;
                            case 8:
                                x50.c(i9, i3, i10);
                                x50VarG.j();
                                i2 = i3;
                                x50Var2 = x50VarG;
                                break;
                            case 9:
                                x50.c(i9, 2, i10);
                                arrayList3.add(x50VarG.h());
                                x50Var2 = x50VarG;
                                i2 = 0;
                                break;
                            default:
                                x50VarG.k(i10);
                                x50Var2 = x50VarG;
                                i2 = 0;
                                break;
                        }
                        i3 = i2;
                        x50VarG = x50Var2;
                        i7 = 1;
                    } else {
                        i = i3;
                        mb8Var = new mb8(iJ2, strH, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
                    }
                }
            }
            i3 = i;
        }
    }

    public static final String g(int i) {
        km4.q(16);
        String string = Integer.toString(i, 16);
        string.getClass();
        return "0x".concat(string);
    }

    public static File h(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, pc6.j(i, str));
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static final boolean i(ql qlVar) {
        int length = qlVar.Y.length();
        List list = qlVar.X;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                pl plVar = (pl) list.get(i);
                if ((plVar.a instanceof pa4) && rl.b(0, length, plVar.b, plVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0318  */
    /* JADX WARN: Code duplicated, block: B:134:0x0391  */
    /* JADX WARN: Code duplicated, block: B:135:0x0396  */
    /* JADX WARN: Code duplicated, block: B:141:0x03b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:142:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:143:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:150:0x03d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:153:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:156:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:157:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:160:0x03fa  */
    public static final h73 j(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i) throws XmlPullParserException, IOException {
        long jD;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ne neVarH;
        int i9;
        Shader shader;
        d90 fe7Var;
        Shader shader2;
        d90 fe7Var2;
        d90 d90Var;
        int i10;
        int i11;
        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser2);
        di diVar = new di();
        diVar.d = xmlResourceParser2;
        diVar.a = 0;
        q02 q02Var = new q02((byte) 28);
        q02Var.Y = new float[64];
        diVar.e = q02Var;
        XmlPullParser xmlPullParser = (XmlPullParser) diVar.d;
        TypedArray typedArrayQ = a28.q(resources, theme, attributeSetAsAttributeSet, w51.a);
        diVar.d(typedArrayQ.getChangingConfigurations());
        boolean z = !a28.i(xmlResourceParser2, "autoMirrored") ? false : typedArrayQ.getBoolean(5, false);
        diVar.d(typedArrayQ.getChangingConfigurations());
        float fB = diVar.b(typedArrayQ, "viewportWidth", 7, 0.0f);
        float fB2 = diVar.b(typedArrayQ, "viewportHeight", 8, 0.0f);
        if (fB <= 0.0f) {
            throw new XmlPullParserException(pc6.o(typedArrayQ.getPositionDescription(), "<VectorGraphic> tag requires viewportWidth > 0"));
        }
        if (fB2 <= 0.0f) {
            throw new XmlPullParserException(pc6.o(typedArrayQ.getPositionDescription(), "<VectorGraphic> tag requires viewportHeight > 0"));
        }
        float dimension = typedArrayQ.getDimension(3, 0.0f);
        diVar.d(typedArrayQ.getChangingConfigurations());
        float dimension2 = typedArrayQ.getDimension(2, 0.0f);
        diVar.d(typedArrayQ.getChangingConfigurations());
        if (typedArrayQ.hasValue(1)) {
            TypedValue typedValue = new TypedValue();
            typedArrayQ.getValue(1, typedValue);
            if (typedValue.type == 2) {
                jD = dw0.g;
            } else {
                ColorStateList colorStateListG = a28.g(typedArrayQ, xmlResourceParser2, theme);
                diVar.d(typedArrayQ.getChangingConfigurations());
                jD = colorStateListG != null ? z51.d(colorStateListG.getDefaultColor()) : dw0.g;
            }
        } else {
            jD = dw0.g;
        }
        int i12 = typedArrayQ.getInt(6, -1);
        diVar.d(typedArrayQ.getChangingConfigurations());
        if (i12 == -1) {
            i2 = 5;
        } else if (i12 == 3) {
            i2 = 3;
        } else if (i12 == 5) {
            i2 = 5;
        } else if (i12 != 9) {
            switch (i12) {
                case 14:
                    i2 = 13;
                    break;
                case 15:
                    i2 = 14;
                    break;
                case WebSocketProtocol.B0_FLAG_RSV3 /* 16 */:
                    i2 = 12;
                    break;
                default:
                    i2 = 5;
                    break;
            }
        } else {
            i2 = 9;
        }
        float f = dimension / resources.getDisplayMetrics().density;
        float f2 = dimension2 / resources.getDisplayMetrics().density;
        typedArrayQ.recycle();
        int i13 = 1;
        int i14 = 2;
        f73 f73Var = new f73(null, f, f2, fB, fB2, jD, i2, z, 1);
        int i15 = 0;
        for (int i16 = 3; xmlResourceParser2.getEventType() != i13 && (xmlResourceParser2.getDepth() >= i13 || xmlResourceParser2.getEventType() != i16); i16 = 3) {
            q02 q02Var2 = (q02) diVar.e;
            int eventType = xmlPullParser.getEventType();
            ArrayList arrayList = f73Var.i;
            if (eventType != i14) {
                if (eventType == i16 && "group".equals(xmlPullParser.getName())) {
                    int i17 = i15 + 1;
                    int i18 = 0;
                    while (i18 < i17) {
                        if (f73Var.k) {
                            wc3.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                        }
                        e73 e73Var = (e73) arrayList.remove(arrayList.size() - i13);
                        ((e73) oi0.h(i13, arrayList)).j.add(new fu8(e73Var.a, e73Var.b, e73Var.c, e73Var.d, e73Var.e, e73Var.f, e73Var.g, e73Var.h, e73Var.i, e73Var.j));
                        i18++;
                        i13 = 1;
                    }
                    int[] iArr = (int[]) diVar.b;
                    if (iArr == null || (i11 = diVar.c) == 0) {
                        i4 = 1;
                        i15 = 0;
                    } else {
                        int i19 = i11 - 1;
                        diVar.c = i19;
                        i15 = iArr[i19];
                    }
                    i3 = 2;
                } else {
                    i4 = i13;
                    i3 = i14;
                }
                xmlResourceParser.next();
                xmlResourceParser2 = xmlResourceParser;
                i13 = i4;
                i14 = i3;
            } else {
                String name = xmlPullParser.getName();
                if (name != null) {
                    int iHashCode = name.hashCode();
                    List listP = d02.X;
                    if (iHashCode != -1649314686) {
                        if (iHashCode != 3433509) {
                            if (iHashCode == 98629247 && name.equals("group")) {
                                TypedArray typedArrayQ2 = a28.q(resources, theme, attributeSetAsAttributeSet, w51.b);
                                diVar.d(typedArrayQ2.getChangingConfigurations());
                                float fB3 = diVar.b(typedArrayQ2, "rotation", 5, 0.0f);
                                float f3 = typedArrayQ2.getFloat(1, 0.0f);
                                diVar.d(typedArrayQ2.getChangingConfigurations());
                                float f4 = typedArrayQ2.getFloat(2, 0.0f);
                                diVar.d(typedArrayQ2.getChangingConfigurations());
                                float fB4 = diVar.b(typedArrayQ2, "scaleX", 3, 1.0f);
                                float fB5 = diVar.b(typedArrayQ2, "scaleY", 4, 1.0f);
                                float fB6 = diVar.b(typedArrayQ2, "translateX", 6, 0.0f);
                                float fB7 = diVar.b(typedArrayQ2, "translateY", 7, 0.0f);
                                String string = typedArrayQ2.getString(0);
                                diVar.d(typedArrayQ2.getChangingConfigurations());
                                String str = string == null ? _UrlKt.FRAGMENT_ENCODE_SET : string;
                                typedArrayQ2.recycle();
                                int i20 = gu8.a;
                                if (f73Var.k) {
                                    wc3.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                arrayList.add(new e73(str, fB3, f3, f4, fB4, fB5, fB6, fB7, listP, 512));
                                int[] iArrCopyOf = (int[]) diVar.b;
                                if (iArrCopyOf == null) {
                                    iArrCopyOf = new int[4];
                                    diVar.b = iArrCopyOf;
                                } else if (diVar.c >= iArrCopyOf.length) {
                                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
                                    diVar.b = iArrCopyOf;
                                }
                                int i21 = diVar.c;
                                diVar.c = i21 + 1;
                                iArrCopyOf[i21] = i15;
                                i4 = 1;
                                i15 = 0;
                            }
                        } else if (name.equals("path")) {
                            TypedArray typedArrayQ3 = a28.q(resources, theme, attributeSetAsAttributeSet, w51.c);
                            diVar.d(typedArrayQ3.getChangingConfigurations());
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") == null) {
                                bt.q("No path data available");
                                return null;
                            }
                            String string2 = typedArrayQ3.getString(0);
                            diVar.d(typedArrayQ3.getChangingConfigurations());
                            String str2 = string2 == null ? _UrlKt.FRAGMENT_ENCODE_SET : string2;
                            String string3 = typedArrayQ3.getString(2);
                            diVar.d(typedArrayQ3.getChangingConfigurations());
                            if (string3 == null) {
                                int i22 = gu8.a;
                            } else {
                                listP = q02.P(q02Var2, string3);
                            }
                            List list = listP;
                            ne neVarH2 = a28.h(typedArrayQ3, xmlPullParser, theme, "fillColor", 1);
                            diVar.d(typedArrayQ3.getChangingConfigurations());
                            float fB8 = diVar.b(typedArrayQ3, "fillAlpha", 12, 1.0f);
                            if (a28.i(xmlPullParser, "strokeLineCap")) {
                                i5 = -1;
                                i6 = typedArrayQ3.getInt(8, -1);
                            } else {
                                i6 = -1;
                                i5 = -1;
                            }
                            diVar.d(typedArrayQ3.getChangingConfigurations());
                            if (i6 == 0) {
                                i7 = 0;
                            } else if (i6 == 1) {
                                i7 = 1;
                            } else if (i6 != 2) {
                                i7 = 0;
                            } else {
                                i7 = 2;
                            }
                            int i23 = !a28.i(xmlPullParser, "strokeLineJoin") ? i5 : typedArrayQ3.getInt(9, i5);
                            diVar.d(typedArrayQ3.getChangingConfigurations());
                            if (i23 != 0) {
                                if (i23 == 1) {
                                    i8 = 1;
                                } else if (i23 == 2) {
                                    i8 = 2;
                                }
                                float fB9 = diVar.b(typedArrayQ3, "strokeMiterLimit", 10, 4.0f);
                                neVarH = a28.h(typedArrayQ3, xmlPullParser, theme, "strokeColor", 3);
                                diVar.d(typedArrayQ3.getChangingConfigurations());
                                float fB10 = diVar.b(typedArrayQ3, "strokeAlpha", 11, 1.0f);
                                float fB11 = diVar.b(typedArrayQ3, "strokeWidth", 4, 1.0f);
                                float fB12 = diVar.b(typedArrayQ3, "trimPathEnd", 6, 1.0f);
                                float fB13 = diVar.b(typedArrayQ3, "trimPathOffset", 7, 0.0f);
                                float fB14 = diVar.b(typedArrayQ3, "trimPathStart", 5, 0.0f);
                                if (a28.i(xmlPullParser, "fillType")) {
                                    i9 = typedArrayQ3.getInt(13, 0);
                                } else {
                                    i9 = 0;
                                }
                                diVar.d(typedArrayQ3.getChangingConfigurations());
                                typedArrayQ3.recycle();
                                shader = (Shader) neVarH2.c;
                                if (shader == null && neVarH2.b == 0) {
                                    fe7Var = null;
                                } else if (shader != null) {
                                    fe7Var = new e90(shader);
                                } else {
                                    fe7Var = new fe7(z51.d(neVarH2.b));
                                }
                                shader2 = (Shader) neVarH.c;
                                if (shader2 != null && neVarH.b == 0) {
                                    d90Var = null;
                                } else {
                                    if (shader2 != null) {
                                        fe7Var2 = new e90(shader2);
                                    } else {
                                        fe7Var2 = new fe7(z51.d(neVarH.b));
                                    }
                                    d90Var = fe7Var2;
                                }
                                if (i9 == 0) {
                                    i10 = 0;
                                } else {
                                    i10 = 1;
                                }
                                if (f73Var.k) {
                                    wc3.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                                }
                                ((e73) oi0.h(1, arrayList)).j.add(new iu8(str2, list, i10, fe7Var, fB8, d90Var, fB10, fB11, i7, i8, fB9, fB14, fB12, fB13));
                                i4 = 1;
                                i3 = 2;
                            }
                            i8 = 0;
                            float fB15 = diVar.b(typedArrayQ3, "strokeMiterLimit", 10, 4.0f);
                            neVarH = a28.h(typedArrayQ3, xmlPullParser, theme, "strokeColor", 3);
                            diVar.d(typedArrayQ3.getChangingConfigurations());
                            float fB16 = diVar.b(typedArrayQ3, "strokeAlpha", 11, 1.0f);
                            float fB17 = diVar.b(typedArrayQ3, "strokeWidth", 4, 1.0f);
                            float fB18 = diVar.b(typedArrayQ3, "trimPathEnd", 6, 1.0f);
                            float fB19 = diVar.b(typedArrayQ3, "trimPathOffset", 7, 0.0f);
                            float fB110 = diVar.b(typedArrayQ3, "trimPathStart", 5, 0.0f);
                            if (a28.i(xmlPullParser, "fillType")) {
                                i9 = 0;
                            } else {
                                i9 = typedArrayQ3.getInt(13, 0);
                            }
                            diVar.d(typedArrayQ3.getChangingConfigurations());
                            typedArrayQ3.recycle();
                            shader = (Shader) neVarH2.c;
                            if (shader == null) {
                                fe7Var = null;
                            } else if (shader != null) {
                                fe7Var = new e90(shader);
                            } else {
                                fe7Var = new fe7(z51.d(neVarH2.b));
                            }
                            shader2 = (Shader) neVarH.c;
                            if (shader2 != null) {
                                if (shader2 != null) {
                                    fe7Var2 = new e90(shader2);
                                } else {
                                    fe7Var2 = new fe7(z51.d(neVarH.b));
                                }
                                d90Var = fe7Var2;
                            } else {
                                d90Var = null;
                            }
                            if (i9 == 0) {
                                i10 = 0;
                            } else {
                                i10 = 1;
                            }
                            if (f73Var.k) {
                                wc3.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                            }
                            ((e73) oi0.h(1, arrayList)).j.add(new iu8(str2, list, i10, fe7Var, fB8, d90Var, fB16, fB17, i7, i8, fB15, fB110, fB18, fB19));
                            i4 = 1;
                            i3 = 2;
                        } else {
                            i4 = 1;
                        }
                        i3 = 2;
                    } else {
                        i3 = 2;
                        if (name.equals("clip-path")) {
                            TypedArray typedArrayQ4 = a28.q(resources, theme, attributeSetAsAttributeSet, w51.d);
                            diVar.d(typedArrayQ4.getChangingConfigurations());
                            String string4 = typedArrayQ4.getString(0);
                            diVar.d(typedArrayQ4.getChangingConfigurations());
                            String str3 = string4 == null ? _UrlKt.FRAGMENT_ENCODE_SET : string4;
                            i4 = 1;
                            String string5 = typedArrayQ4.getString(1);
                            diVar.d(typedArrayQ4.getChangingConfigurations());
                            if (string5 == null) {
                                int i24 = gu8.a;
                            } else {
                                listP = q02.P(q02Var2, string5);
                            }
                            List list2 = listP;
                            typedArrayQ4.recycle();
                            if (f73Var.k) {
                                wc3.b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                            }
                            arrayList.add(new e73(str3, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, list2, 512));
                            i15++;
                        } else {
                            i4 = 1;
                        }
                    }
                }
                xmlResourceParser.next();
                xmlResourceParser2 = xmlResourceParser;
                i13 = i4;
                i14 = i3;
            }
            i4 = 1;
            i3 = 2;
            xmlResourceParser.next();
            xmlResourceParser2 = xmlResourceParser;
            i13 = i4;
            i14 = i3;
        }
        return new h73(f73Var.b(), i | diVar.a);
    }

    public static MappedByteBuffer k(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b6 A[Catch: all -> 0x014a, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x014a, blocks: (B:3:0x000d, B:5:0x001b, B:6:0x0023, B:16:0x007a, B:18:0x0084, B:66:0x0149, B:62:0x0142, B:69:0x014e, B:97:0x01a9, B:100:0x01b6, B:95:0x01a4, B:107:0x01c2, B:110:0x01ce, B:111:0x01d5, B:112:0x01d6, B:113:0x01d9, B:114:0x01da, B:115:0x01ef, B:59:0x013d, B:92:0x019f, B:19:0x008d, B:21:0x0096, B:24:0x00a7, B:50:0x012c, B:46:0x0125, B:53:0x0130, B:54:0x0135, B:7:0x002c, B:9:0x0035, B:15:0x005b, B:104:0x01ba, B:105:0x01bf), top: B:131:0x000d, inners: #0, #1, #6, #10 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01a9 A[Catch: all -> 0x014a, TRY_LEAVE, TryCatch #4 {all -> 0x014a, blocks: (B:3:0x000d, B:5:0x001b, B:6:0x0023, B:16:0x007a, B:18:0x0084, B:66:0x0149, B:62:0x0142, B:69:0x014e, B:97:0x01a9, B:100:0x01b6, B:95:0x01a4, B:107:0x01c2, B:110:0x01ce, B:111:0x01d5, B:112:0x01d6, B:113:0x01d9, B:114:0x01da, B:115:0x01ef, B:59:0x013d, B:92:0x019f, B:19:0x008d, B:21:0x0096, B:24:0x00a7, B:50:0x012c, B:46:0x0125, B:53:0x0130, B:54:0x0135, B:7:0x002c, B:9:0x0035, B:15:0x005b, B:104:0x01ba, B:105:0x01bf), top: B:131:0x000d, inners: #0, #1, #6, #10 }] */
    public static final l79 l(oi5 oi5Var, s92 s92Var, gn2 gn2Var) {
        j76 j76Var;
        Throwable th;
        Throwable th2;
        Throwable th3;
        s92Var.getClass();
        g92 g92VarOpenReadOnly = s92Var.openReadOnly(oi5Var);
        try {
            long size = g92VarOpenReadOnly.size();
            long j = size - 22;
            long j2 = 0;
            if (j < 0) {
                throw new IOException("not a zip: size=" + g92VarOpenReadOnly.size());
            }
            long jMax = Math.max(size - 65558, 0L);
            do {
                j76 j76Var2 = new j76(g92VarOpenReadOnly.p(j));
                try {
                    if (j76Var2.k() == 101010256) {
                        int iP = j76Var2.p() & 65535;
                        int iP2 = j76Var2.p() & 65535;
                        long jP = j76Var2.p() & 65535;
                        if (jP != (j76Var2.p() & 65535) || iP != 0 || iP2 != 0) {
                            throw new IOException("unsupported zip: spanned");
                        }
                        j76Var2.skip(4L);
                        long jK = ((long) j76Var2.k()) & 4294967295L;
                        int iP3 = j76Var2.p() & 65535;
                        y22 y22Var = new y22(iP3, jP, jK);
                        j76Var2.o(iP3);
                        j76Var2.close();
                        long j3 = j - 20;
                        if (j3 > 0) {
                            j76 j76Var3 = new j76(g92VarOpenReadOnly.p(j3));
                            try {
                                if (j76Var3.k() == 117853008) {
                                    int iK = j76Var3.k();
                                    long jM = j76Var3.m();
                                    if (j76Var3.k() != 1 || iK != 0) {
                                        throw new IOException("unsupported zip: spanned");
                                    }
                                    j76 j76Var4 = new j76(g92VarOpenReadOnly.p(jM));
                                    try {
                                        int iK2 = j76Var4.k();
                                        if (iK2 != 101075792) {
                                            throw new IOException("bad zip: expected " + g(101075792) + " but was " + g(iK2));
                                        }
                                        j76Var4.skip(12L);
                                        int iK3 = j76Var4.k();
                                        int iK4 = j76Var4.k();
                                        long jM2 = j76Var4.m();
                                        if (jM2 != j76Var4.m() || iK3 != 0 || iK4 != 0) {
                                            throw new IOException("unsupported zip: spanned");
                                        }
                                        j76Var4.skip(8L);
                                        y22 y22Var2 = new y22(iP3, jM2, j76Var4.m());
                                        try {
                                            j76Var4.close();
                                            th3 = null;
                                        } catch (Throwable th4) {
                                            th3 = th4;
                                        }
                                        y22Var = y22Var2;
                                        if (th3 != null) {
                                            throw th3;
                                        }
                                    } catch (Throwable th5) {
                                        try {
                                            j76Var4.close();
                                        } catch (Throwable th6) {
                                            gv3.g(th5, th6);
                                        }
                                        th3 = th5;
                                    }
                                }
                                try {
                                    j76Var3.close();
                                    th2 = null;
                                } catch (Throwable th7) {
                                    th2 = th7;
                                }
                            } catch (Throwable th8) {
                                try {
                                    j76Var3.close();
                                } catch (Throwable th9) {
                                    gv3.g(th8, th9);
                                }
                                th2 = th8;
                            }
                            if (th2 != null) {
                                throw th2;
                            }
                        }
                        ArrayList arrayList = new ArrayList();
                        j76 j76Var5 = new j76(g92VarOpenReadOnly.p(y22Var.b));
                        try {
                            long j4 = y22Var.a;
                            while (j2 < j4) {
                                k79 k79VarM = m(j76Var5);
                                j76Var = j76Var5;
                                try {
                                    if (k79VarM.h >= y22Var.b) {
                                        throw new IOException("bad zip: local file header offset >= central directory offset");
                                    }
                                    if (((Boolean) gn2Var.B(k79VarM)).booleanValue()) {
                                        arrayList.add(k79VarM);
                                    }
                                    j2++;
                                    j76Var5 = j76Var;
                                } catch (Throwable th10) {
                                    th = th10;
                                    th = th;
                                    try {
                                        j76Var.close();
                                    } catch (Throwable th11) {
                                        gv3.g(th, th11);
                                    }
                                    if (th == null) {
                                        throw th;
                                    }
                                    l79 l79Var = new l79(oi5Var, s92Var, a(arrayList));
                                    try {
                                        g92VarOpenReadOnly.close();
                                    } catch (Throwable unused) {
                                    }
                                    return l79Var;
                                }
                            }
                            try {
                                j76Var5.close();
                                th = null;
                            } catch (Throwable th12) {
                                th = th12;
                            }
                        } catch (Throwable th13) {
                            th = th13;
                            j76Var = j76Var5;
                        }
                        if (th == null) {
                            throw th;
                        }
                        l79 l79Var2 = new l79(oi5Var, s92Var, a(arrayList));
                        g92VarOpenReadOnly.close();
                        return l79Var2;
                    }
                    j76Var2.close();
                    j--;
                } catch (Throwable th14) {
                    j76Var2.close();
                    throw th14;
                }
            } while (j >= jMax);
            throw new IOException("not a zip: end of central directory signature not found");
        } catch (Throwable th15) {
            if (g92VarOpenReadOnly == null) {
                throw th15;
            }
            try {
                g92VarOpenReadOnly.close();
                throw th15;
            } catch (Throwable th16) {
                gv3.g(th15, th16);
                throw th15;
            }
        }
    }

    public static final k79 m(final j76 j76Var) throws IOException {
        int iK = j76Var.k();
        if (iK != 33639248) {
            throw new IOException("bad zip: expected " + g(33639248) + " but was " + g(iK));
        }
        j76Var.skip(4L);
        short sP = j76Var.p();
        int i = sP & 65535;
        if ((sP & 1) != 0) {
            u52.s("unsupported zip: general purpose bit flag=".concat(g(i)));
            return null;
        }
        int iP = j76Var.p() & 65535;
        int iP2 = j76Var.p() & 65535;
        int iP3 = j76Var.p() & 65535;
        long jK = ((long) j76Var.k()) & 4294967295L;
        final da6 da6Var = new da6();
        da6Var.X = ((long) j76Var.k()) & 4294967295L;
        final da6 da6Var2 = new da6();
        da6Var2.X = ((long) j76Var.k()) & 4294967295L;
        int iP4 = j76Var.p() & 65535;
        int iP5 = j76Var.p() & 65535;
        int iP6 = j76Var.p() & 65535;
        j76Var.skip(8L);
        final da6 da6Var3 = new da6();
        da6Var3.X = ((long) j76Var.k()) & 4294967295L;
        String strO = j76Var.o(iP4);
        if (fm7.e0(strO, (char) 0)) {
            u52.s("bad zip: filename contains 0x00");
            return null;
        }
        long j = da6Var2.X == 4294967295L ? 8L : 0L;
        if (da6Var.X == 4294967295L) {
            j += 8;
        }
        if (da6Var3.X == 4294967295L) {
            j += 8;
        }
        final long j2 = j;
        final ea6 ea6Var = new ea6();
        final ea6 ea6Var2 = new ea6();
        final ea6 ea6Var3 = new ea6();
        final aa6 aa6Var = new aa6();
        n(j76Var, iP5, new rn2() { // from class: n79
            @Override // defpackage.rn2
            public final Object K(Object obj, Object obj2) throws IOException {
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                j76 j76Var2 = j76Var;
                if (iIntValue == 1) {
                    aa6 aa6Var2 = aa6Var;
                    if (aa6Var2.X) {
                        u52.s("bad zip: zip64 extra repeated");
                        return null;
                    }
                    aa6Var2.X = true;
                    if (jLongValue < j2) {
                        u52.s("bad zip: zip64 extra too short");
                        return null;
                    }
                    da6 da6Var4 = da6Var2;
                    long jM = da6Var4.X;
                    if (jM == 4294967295L) {
                        jM = j76Var2.m();
                    }
                    da6Var4.X = jM;
                    da6 da6Var5 = da6Var;
                    da6Var5.X = da6Var5.X == 4294967295L ? j76Var2.m() : 0L;
                    da6 da6Var6 = da6Var3;
                    da6Var6.X = da6Var6.X == 4294967295L ? j76Var2.m() : 0L;
                } else if (iIntValue == 10) {
                    if (jLongValue < 4) {
                        u52.s("bad zip: NTFS extra too short");
                        return null;
                    }
                    j76Var2.skip(4L);
                    u28.n(j76Var2, (int) (jLongValue - 4), new m79(ea6Var, j76Var2, ea6Var2, ea6Var3));
                }
                return dn8.a;
            }
        });
        if (j2 > 0 && !aa6Var.X) {
            u52.s("bad zip: zip64 extra required but absent");
            return null;
        }
        String strO2 = j76Var.o(iP6);
        String str = oi5.Y;
        return new k79(g55.r("/").f(strO), mm7.R(strO, false, "/"), strO2, jK, da6Var.X, da6Var2.X, iP, da6Var3.X, iP3, iP2, (Long) ea6Var.X, (Long) ea6Var2.X, (Long) ea6Var3.X, 57344);
    }

    public static final void n(j76 j76Var, int i, rn2 rn2Var) throws IOException {
        i90 i90Var = j76Var.Y;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                u52.s("bad zip: truncated header in extra field");
                return;
            }
            int iP = j76Var.p() & 65535;
            long jP = ((long) j76Var.p()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
            long j2 = j - 4;
            if (j2 < jP) {
                u52.s("bad zip: truncated value in extra field");
                return;
            }
            j76Var.T0(jP);
            long j3 = i90Var.Y;
            rn2Var.K(Integer.valueOf(iP), Long.valueOf(jP));
            long j4 = (i90Var.Y + jP) - j3;
            if (j4 < 0) {
                u52.s(pc6.j(iP, "unsupported zip: too many bytes processed for "));
                return;
            } else {
                if (j4 > 0) {
                    i90Var.skip(j4);
                }
                j = j2 - jP;
            }
        }
    }

    public static final k79 o(j76 j76Var, k79 k79Var) throws IOException {
        int iK = j76Var.k();
        if (iK != 67324752) {
            throw new IOException("bad zip: expected " + g(67324752) + " but was " + g(iK));
        }
        j76Var.skip(2L);
        short sP = j76Var.p();
        int i = sP & 65535;
        if ((sP & 1) != 0) {
            u52.s("unsupported zip: general purpose bit flag=".concat(g(i)));
            return null;
        }
        j76Var.skip(18L);
        long jP = ((long) j76Var.p()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        int iP = j76Var.p() & 65535;
        j76Var.skip(jP);
        if (k79Var == null) {
            j76Var.skip(iP);
            return null;
        }
        ea6 ea6Var = new ea6();
        ea6 ea6Var2 = new ea6();
        ea6 ea6Var3 = new ea6();
        n(j76Var, iP, new m79(j76Var, ea6Var, ea6Var2, ea6Var3));
        return new k79(k79Var.a, k79Var.b, k79Var.c, k79Var.d, k79Var.e, k79Var.f, k79Var.g, k79Var.h, k79Var.i, k79Var.j, k79Var.k, k79Var.l, k79Var.m, (Integer) ea6Var.X, (Integer) ea6Var2.X, (Integer) ea6Var3.X);
    }

    public static final g73 p(int i, lp2 lp2Var) {
        Context context = (Context) lp2Var.j(pc.b);
        Resources resources = (Resources) lp2Var.j(pc.c);
        Resources.Theme theme = context.getTheme();
        Object configuration = resources.getConfiguration();
        boolean zF = lp2Var.f(configuration) | lp2Var.d(i) | lp2Var.f(resources) | lp2Var.f(theme);
        Object objK = lp2Var.K();
        if (zF || objK == zz0.a) {
            TypedValue typedValue = new TypedValue();
            resources.getValue(i, typedValue, true);
            XmlResourceParser xml = resources.getXml(i);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            objK = j(theme, resources, xml, typedValue.changingConfigurations).a;
            lp2Var.g0(objK);
        }
        return (g73) objK;
    }
}
