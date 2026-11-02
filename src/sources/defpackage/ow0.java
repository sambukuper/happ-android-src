package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ow0 {
    public static final ThreadLocal a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0093  */
    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        float f;
        int iG;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z = true;
        int depth2 = xmlPullParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr = new int[20];
        int i = 0;
        int i2 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == z || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr2 = c66.ColorStateListItem;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr2) : theme.obtainStyledAttributes(attributeSet, iArr2, i, i);
                int resourceId = typedArrayObtainAttributes.getResourceId(c66.ColorStateListItem_android_color, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = a;
                    TypedValue typedValue = (TypedValue) threadLocal.get();
                    if (typedValue == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    }
                    resources.getValue(resourceId, typedValue, z);
                    int i3 = typedValue.type;
                    if (i3 < 28 || i3 > 31) {
                        try {
                            color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = typedArrayObtainAttributes.getColor(c66.ColorStateListItem_android_color, -65281);
                        }
                    } else {
                        color = typedArrayObtainAttributes.getColor(c66.ColorStateListItem_android_color, -65281);
                    }
                } else {
                    color = typedArrayObtainAttributes.getColor(c66.ColorStateListItem_android_color, -65281);
                }
                float f2 = 1.0f;
                if (typedArrayObtainAttributes.hasValue(c66.ColorStateListItem_android_alpha)) {
                    f = typedArrayObtainAttributes.getFloat(c66.ColorStateListItem_android_alpha, 1.0f);
                } else {
                    f = typedArrayObtainAttributes.hasValue(c66.ColorStateListItem_alpha) ? typedArrayObtainAttributes.getFloat(c66.ColorStateListItem_alpha, 1.0f) : 1.0f;
                }
                boolean z2 = z;
                float f3 = (Build.VERSION.SDK_INT < 31 || !typedArrayObtainAttributes.hasValue(c66.ColorStateListItem_android_lStar)) ? typedArrayObtainAttributes.getFloat(c66.ColorStateListItem_lStar, -1.0f) : typedArrayObtainAttributes.getFloat(c66.ColorStateListItem_android_lStar, -1.0f);
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i4 = i;
                int i5 = i4;
                while (i4 < attributeCount) {
                    float f4 = f2;
                    int attributeNameResource = attributeSet.getAttributeNameResource(i4);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != p26.alpha && attributeNameResource != p26.lStar) {
                        int i6 = i5 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i4, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr3[i5] = attributeNameResource;
                        i5 = i6;
                    }
                    i4++;
                    f2 = f4;
                }
                float f5 = f2;
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr3, i5);
                float f6 = 100.0f;
                Object[] objArr2 = (f3 < 0.0f || f3 > 100.0f) ? null : z2 ? 1 : 0;
                if (f == f5 && objArr2 == null) {
                    iArrTrimStateSet = iArrTrimStateSet;
                    depth2 = depth2;
                } else {
                    int iM = z91.m((int) ((Color.alpha(color) * f) + 0.5f), 0, 255);
                    if (objArr2 != null) {
                        pe0 pe0VarA = pe0.a(color);
                        float f7 = pe0VarA.a;
                        float f8 = pe0VarA.b;
                        jy8 jy8Var = jy8.k;
                        if (f8 >= 1.0d && Math.round(f3) > 0.0d && Math.round(f3) < 100.0d) {
                            float fMin = f7 < 0.0f ? 0.0f : Math.min(360.0f, f7);
                            float f9 = 0.0f;
                            float f10 = f8;
                            Object[] objArr3 = z2 ? 1 : 0;
                            pe0 pe0Var = null;
                            while (true) {
                                if (Math.abs(f9 - f8) < 0.4f) {
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                    if (pe0Var != null) {
                                        iG = pe0Var.c(jy8Var);
                                        break;
                                    }
                                    iG = mb6.G(f3);
                                    break;
                                }
                                float f11 = 1000.0f;
                                float f12 = f6;
                                float f13 = 0.0f;
                                float f14 = 1000.0f;
                                pe0 pe0Var2 = null;
                                while (true) {
                                    if (Math.abs(f13 - f12) <= 0.01f) {
                                        iArrTrimStateSet = iArrTrimStateSet;
                                        depth2 = depth2;
                                        f6 = f6;
                                        break;
                                    }
                                    f6 = f6;
                                    float f15 = ((f12 - f13) / 2.0f) + f13;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    int iC = pe0.b(f15, f10, fMin).c(jy8.k);
                                    float fN = mb6.N(Color.red(iC));
                                    float fN2 = mb6.N(Color.green(iC));
                                    float fN3 = mb6.N(Color.blue(iC));
                                    float[] fArr = mb6.f0[z2 ? 1 : 0];
                                    float f16 = ((fN3 * fArr[2]) + ((fN2 * fArr[z2 ? 1 : 0]) + (fN * fArr[0]))) / f6;
                                    float fCbrt = f16 <= 0.008856452f ? f16 * 903.2963f : (((float) Math.cbrt(f16)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f3 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        pe0 pe0VarA2 = pe0.a(iC);
                                        pe0 pe0VarB = pe0.b(pe0VarA2.c, pe0VarA2.b, fMin);
                                        float f17 = pe0VarA2.d - pe0VarB.d;
                                        float f18 = pe0VarA2.e - pe0VarB.e;
                                        float f19 = pe0VarA2.f - pe0VarB.f;
                                        depth2 = depth2;
                                        float fPow = (float) (Math.pow(Math.sqrt((f19 * f19) + (f18 * f18) + (f17 * f17)), 0.63d) * 1.41d);
                                        if (fPow <= f5) {
                                            f14 = fPow;
                                            f11 = fAbs;
                                            pe0Var2 = pe0VarA2;
                                        }
                                    } else {
                                        depth2 = depth2;
                                    }
                                    if (f11 == 0.0f && f14 == 0.0f) {
                                        break;
                                    }
                                    if (fCbrt < f3) {
                                        f13 = f15;
                                    } else {
                                        f12 = f15;
                                    }
                                    f6 = f6;
                                    iArrTrimStateSet = iArrTrimStateSet;
                                    depth2 = depth2;
                                }
                                pe0 pe0Var3 = pe0Var2;
                                if (objArr3 == null) {
                                    if (pe0Var3 == null) {
                                        f8 = f10;
                                    } else {
                                        pe0Var = pe0Var3;
                                        f9 = f10;
                                    }
                                    f10 = ((f8 - f9) / 2.0f) + f9;
                                } else {
                                    if (pe0Var3 != null) {
                                        iG = pe0Var3.c(jy8Var);
                                        break;
                                    }
                                    f10 = ((f8 - f9) / 2.0f) + f9;
                                    objArr3 = null;
                                }
                            }
                        } else {
                            iArrTrimStateSet = iArrTrimStateSet;
                            depth2 = depth2;
                            iG = mb6.G(f3);
                        }
                        color = iG;
                    } else {
                        iArrTrimStateSet = iArrTrimStateSet;
                        depth2 = depth2;
                    }
                    color = (16777215 & color) | (iM << 24);
                }
                int i7 = i2 + 1;
                if (i7 > iArr.length) {
                    int[] iArr4 = new int[i2 <= 4 ? 8 : i2 * 2];
                    System.arraycopy(iArr, 0, iArr4, 0, i2);
                    iArr = iArr4;
                }
                iArr[i2] = color;
                if (i7 > objArr.length) {
                    Object[] objArr4 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2 > 4 ? i2 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr4, 0, i2);
                    objArr = objArr4;
                }
                objArr[i2] = iArrTrimStateSet;
                objArr = (int[][]) objArr;
                i2 = i7;
                z = z2 ? 1 : 0;
                depth2 = depth2;
                i = 0;
            } else {
                int i8 = depth2;
                z = z ? 1 : 0;
                depth2 = i8;
                i = 0;
            }
        }
        int[] iArr5 = new int[i2];
        int[][] iArr6 = new int[i2][];
        System.arraycopy(iArr, 0, iArr5, 0, i2);
        System.arraycopy(objArr, 0, iArr6, 0, i2);
        return new ColorStateList(iArr6, iArr5);
    }
}
