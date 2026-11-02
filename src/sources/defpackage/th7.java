package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class th7 implements y67 {
    public final int a;
    public final a77 b;
    public final int[][] c;
    public final a77[] d;
    public final sh7 e;
    public final sh7 f;
    public final sh7 g;
    public final sh7 h;

    public th7(t23 t23Var) {
        this.a = t23Var.b;
        this.b = (a77) t23Var.c;
        this.c = (int[][]) t23Var.d;
        this.d = (a77[]) t23Var.e;
        this.e = (sh7) t23Var.f;
        this.f = (sh7) t23Var.g;
        this.g = (sh7) t23Var.h;
        this.h = (sh7) t23Var.i;
    }

    public static th7 g(Context context, TypedArray typedArray, int i) {
        int next;
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        t23 t23Var = new t23((byte) 1);
        t23Var.e();
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    i(t23Var, context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                return t23Var.c();
            } catch (Throwable th) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            t23Var.e();
        }
    }

    public static void i(t23 t23Var, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, v56.MaterialShape) : theme.obtainStyledAttributes(attributeSet, v56.MaterialShape, 0, 0);
                int resourceId = typedArrayObtainAttributes.getResourceId(v56.MaterialShape_shapeAppearance, 0);
                int resourceId2 = typedArrayObtainAttributes.getResourceId(v56.MaterialShape_shapeAppearanceOverlay, 0);
                c0 c0Var = new c0(0.0f);
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
                if (resourceId2 != 0) {
                    contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
                }
                a77 a77VarA = a77.h(contextThemeWrapper.obtainStyledAttributes(v56.ShapeAppearance), c0Var).a();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != u26.shapeAppearance && attributeNameResource != u26.shapeAppearanceOverlay) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i] = attributeNameResource;
                        i = i3;
                    }
                }
                t23Var.a(StateSet.trimStateSet(iArr, i), a77VarA);
            }
        }
    }

    @Override // defpackage.y67
    public final a77 a(float f) {
        return h().a(f);
    }

    @Override // defpackage.y67
    public final a77 b(int[] iArr) {
        int i;
        int i2;
        int[][] iArr2;
        int i3 = 0;
        while (true) {
            i = -1;
            i2 = this.a;
            iArr2 = this.c;
            if (i3 >= i2) {
                i3 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                break;
            }
            i3++;
        }
        if (i3 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            for (int i4 = 0; i4 < i2; i4++) {
                if (StateSet.stateSetMatches(iArr2[i4], iArr3)) {
                    i = i4;
                    break;
                }
            }
            i3 = i;
        }
        a77[] a77VarArr = this.d;
        sh7 sh7Var = this.h;
        sh7 sh7Var2 = this.g;
        sh7 sh7Var3 = this.f;
        sh7 sh7Var4 = this.e;
        if (sh7Var4 == null && sh7Var3 == null && sh7Var2 == null && sh7Var == null) {
            return a77VarArr[i3];
        }
        z67 z67VarK = a77VarArr[i3].k();
        if (sh7Var4 != null) {
            z67VarK.e = sh7Var4.c(iArr);
        }
        if (sh7Var3 != null) {
            z67VarK.f = sh7Var3.c(iArr);
        }
        if (sh7Var2 != null) {
            z67VarK.h = sh7Var2.c(iArr);
        }
        if (sh7Var != null) {
            z67VarK.g = sh7Var.c(iArr);
        }
        return z67VarK.a();
    }

    @Override // defpackage.y67
    public final a77[] c() {
        return this.d;
    }

    @Override // defpackage.y67
    public final a77 d() {
        return h();
    }

    @Override // defpackage.y67
    public final a77 e(rc6 rc6Var) {
        return h().e(rc6Var);
    }

    @Override // defpackage.y67
    public final boolean f() {
        sh7 sh7Var;
        sh7 sh7Var2;
        sh7 sh7Var3;
        sh7 sh7Var4;
        return this.a > 1 || ((sh7Var = this.e) != null && sh7Var.a > 1) || (((sh7Var2 = this.f) != null && sh7Var2.a > 1) || (((sh7Var3 = this.g) != null && sh7Var3.a > 1) || ((sh7Var4 = this.h) != null && sh7Var4.a > 1)));
    }

    public final a77 h() {
        a77 a77Var = this.b;
        sh7 sh7Var = this.h;
        sh7 sh7Var2 = this.g;
        sh7 sh7Var3 = this.f;
        sh7 sh7Var4 = this.e;
        if (sh7Var4 == null && sh7Var3 == null && sh7Var2 == null && sh7Var == null) {
            return a77Var;
        }
        z67 z67VarK = a77Var.k();
        if (sh7Var4 != null) {
            z67VarK.e = sh7Var4.b;
        }
        if (sh7Var3 != null) {
            z67VarK.f = sh7Var3.b;
        }
        if (sh7Var2 != null) {
            z67VarK.h = sh7Var2.b;
        }
        if (sh7Var != null) {
            z67VarK.g = sh7Var.b;
        }
        return z67VarK.a();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [int[][], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [a77[], java.io.Serializable] */
    public final t23 j() {
        t23 t23Var = new t23((byte) 1);
        int i = this.a;
        t23Var.b = i;
        t23Var.c = this.b;
        int[][] iArr = this.c;
        ?? r3 = new int[iArr.length][];
        t23Var.d = r3;
        a77[] a77VarArr = this.d;
        t23Var.e = new a77[a77VarArr.length];
        System.arraycopy(iArr, 0, r3, 0, i);
        System.arraycopy(a77VarArr, 0, (a77[]) t23Var.e, 0, t23Var.b);
        t23Var.f = this.e;
        t23Var.g = this.f;
        t23Var.h = this.g;
        t23Var.i = this.h;
        return t23Var;
    }
}
