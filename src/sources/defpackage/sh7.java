package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sh7 {
    public int a;
    public m61 b;
    public int[][] c = new int[10][];
    public m61[] d = new m61[10];

    public static sh7 b(m61 m61Var) {
        sh7 sh7Var = new sh7();
        sh7Var.a(StateSet.WILD_CARD, m61Var);
        return sh7Var;
    }

    public final void a(int[] iArr, m61 m61Var) {
        int i = this.a;
        if (i == 0 || iArr.length == 0) {
            this.b = m61Var;
        }
        int[][] iArr2 = this.c;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            int[][] iArr3 = new int[i2][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.c = iArr3;
            m61[] m61VarArr = new m61[i2];
            System.arraycopy(this.d, 0, m61VarArr, 0, i);
            this.d = m61VarArr;
        }
        int[][] iArr4 = this.c;
        int i3 = this.a;
        iArr4[i3] = iArr;
        this.d[i3] = m61Var;
        this.a = i3 + 1;
    }

    public final m61 c(int[] iArr) {
        int i;
        int[][] iArr2 = this.c;
        int i2 = 0;
        while (true) {
            i = -1;
            if (i2 >= this.a) {
                i2 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                break;
            }
            i2++;
        }
        if (i2 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.c;
            for (int i3 = 0; i3 < this.a; i3++) {
                if (StateSet.stateSetMatches(iArr4[i3], iArr3)) {
                    i = i3;
                    break;
                }
            }
            i2 = i;
        }
        return i2 < 0 ? this.b : this.d[i2];
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, v56.ShapeAppearance) : theme.obtainStyledAttributes(attributeSet, v56.ShapeAppearance, 0, 0);
                m61 m61VarI = a77.i(typedArrayObtainAttributes, v56.ShapeAppearance_cornerSize, new c0(0.0f));
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != u26.cornerSize) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i] = attributeNameResource;
                        i = i3;
                    }
                }
                a(StateSet.trimStateSet(iArr, i), m61VarI);
            }
        }
    }
}
