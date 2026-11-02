package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import defpackage.a4;
import defpackage.bt;
import defpackage.cw8;
import defpackage.g4;
import defpackage.h4;
import defpackage.ia4;
import defpackage.ja4;
import defpackage.mj0;
import defpackage.oi0;
import defpackage.pc6;
import defpackage.q96;
import defpackage.u52;
import defpackage.xr0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public static final Set R0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(17, 66, 33, 130)));
    public boolean G0;
    public int H0;
    public int[] I0;
    public View[] J0;
    public final SparseIntArray K0;
    public final SparseIntArray L0;
    public final mj0 M0;
    public final Rect N0;
    public int O0;
    public int P0;
    public int Q0;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.G0 = false;
        this.H0 = -1;
        this.K0 = new SparseIntArray();
        this.L0 = new SparseIntArray();
        this.M0 = new mj0((byte) 29);
        this.N0 = new Rect();
        this.O0 = -1;
        this.P0 = -1;
        this.Q0 = -1;
        Q1(j.U(context, attributeSet, i, i2).b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.j
    public final int A(q96 q96Var) {
        return e1(q96Var);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a9 A[EDGE_INSN: B:122:0x01a9->B:166:0x027c BREAK  A[LOOP:2: B:126:0x01b9->B:135:0x01e2, LOOP_LABEL: LOOP:2: B:126:0x01b9->B:135:0x01e2]] */
    /* JADX WARN: Code duplicated, block: B:123:0x01ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:131:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:134:0x01da A[LOOP:3: B:129:0x01c7->B:134:0x01da, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:139:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:142:0x0213  */
    /* JADX WARN: Code duplicated, block: B:143:0x0215  */
    /* JADX WARN: Code duplicated, block: B:145:0x0218 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x0227  */
    /* JADX WARN: Code duplicated, block: B:153:0x0235  */
    /* JADX WARN: Code duplicated, block: B:156:0x0243  */
    /* JADX WARN: Code duplicated, block: B:163:0x0262  */
    /* JADX WARN: Code duplicated, block: B:167:0x027e  */
    /* JADX WARN: Code duplicated, block: B:209:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x01e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:? A[LOOP:4: B:137:0x01ed->B:214:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x0249 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x022f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x026e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:? A[LOOP:7: B:161:0x025c->B:224:?, LOOP_END, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.j
    public final boolean B0(int i, Bundle bundle) {
        View viewH;
        l lVarM;
        int iIntValue;
        int i2;
        TreeMap treeMap;
        int i3;
        Iterator it;
        Integer num;
        int iIntValue2;
        Iterator it2;
        Integer num2;
        TreeMap treeMap2;
        int i4;
        Iterator it3;
        Integer num3;
        int iIntValue3;
        Iterator it4;
        Integer num4;
        if (i == a4.t.a() && i != -1) {
            int i5 = 0;
            while (true) {
                if (i5 >= I()) {
                    viewH = null;
                    break;
                }
                View viewH2 = H(i5);
                Objects.requireNonNull(viewH2);
                if (viewH2.isAccessibilityFocused()) {
                    viewH = H(i5);
                    break;
                }
                i5++;
            }
            if (viewH != null && bundle != null) {
                int i6 = bundle.getInt("android.view.accessibility.action.ARGUMENT_DIRECTION_INT", -1);
                if (R0.contains(Integer.valueOf(i6)) && (lVarM = this.Y.M(viewH)) != null) {
                    int iB = lVarM.b();
                    int iI1 = I1(iB);
                    int iH1 = H1(iB);
                    if (iI1 >= 0 && iH1 >= 0) {
                        if (!J1(iB).contains(Integer.valueOf(this.P0)) || !K1(H1(iB), iB).contains(Integer.valueOf(this.Q0))) {
                            this.P0 = iI1;
                            this.Q0 = iH1;
                        }
                        int i7 = this.P0;
                        if (i7 == -1) {
                            i7 = iI1;
                        }
                        int i8 = this.Q0;
                        if (i8 != -1) {
                            iH1 = i8;
                        }
                        if (i6 == 17) {
                            iIntValue = iB - 1;
                            while (true) {
                                if (iIntValue >= 0) {
                                    int iI2 = I1(iIntValue);
                                    int iH2 = H1(iIntValue);
                                    if (iI2 >= 0 && iH2 >= 0) {
                                        if (this.r0 != 1) {
                                            if (J1(iIntValue).contains(Integer.valueOf(i7)) && iH2 < iH1) {
                                                this.Q0 = iH2;
                                                break;
                                            }
                                            iIntValue--;
                                        } else {
                                            if ((iI2 == i7 && iH2 < iH1) || iI2 < i7) {
                                                this.P0 = iI2;
                                                this.Q0 = iH2;
                                                break;
                                            }
                                            iIntValue--;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iI1 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < S()) {
                                                    it2 = J1(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iI1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.P0 = iIntValue2;
                                                                this.Q0 = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iI1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < S()) {
                                                it4 = J1(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iI1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.P0 = iIntValue3;
                                                            this.Q0 = H1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                N0(iIntValue);
                                this.O0 = iIntValue;
                                return true;
                            }
                        } else if (i6 == 33) {
                            iIntValue = iB - 1;
                            while (true) {
                                if (iIntValue >= 0) {
                                    int iI3 = I1(iIntValue);
                                    int iH3 = H1(iIntValue);
                                    if (iI3 >= 0 && iH3 >= 0) {
                                        if (this.r0 != 1) {
                                            if (iI3 < i7 && iH3 == iH1) {
                                                this.P0 = ((Integer) Collections.max(J1(iIntValue))).intValue();
                                                break;
                                            }
                                            iIntValue--;
                                        } else {
                                            if (iI3 < i7 && K1(H1(iIntValue), iIntValue).contains(Integer.valueOf(iH1))) {
                                                this.P0 = iI3;
                                                break;
                                            }
                                            iIntValue--;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iI1 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < S()) {
                                                    it2 = J1(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iI1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.P0 = iIntValue2;
                                                                this.Q0 = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iI1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < S()) {
                                                it4 = J1(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iI1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.P0 = iIntValue3;
                                                            this.Q0 = H1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                N0(iIntValue);
                                this.O0 = iIntValue;
                                return true;
                            }
                        } else if (i6 == 66) {
                            iIntValue = iB + 1;
                            while (true) {
                                if (iIntValue < S()) {
                                    int iI4 = I1(iIntValue);
                                    int iH4 = H1(iIntValue);
                                    if (iI4 >= 0 && iH4 >= 0) {
                                        if (this.r0 != 1) {
                                            if (iH4 > iH1 && J1(iIntValue).contains(Integer.valueOf(i7))) {
                                                this.Q0 = iH4;
                                                break;
                                            }
                                            iIntValue++;
                                        } else {
                                            if ((iI4 == i7 && iH4 > iH1) || iI4 > i7) {
                                                this.P0 = iI4;
                                                this.Q0 = iH4;
                                                break;
                                            }
                                            iIntValue++;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iI1 < 0) {
                                            treeMap = new TreeMap();
                                            i3 = 0;
                                            loop5: while (true) {
                                                if (i3 < S()) {
                                                    it2 = J1(i3).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            num2 = (Integer) it2.next();
                                                            if (num2.intValue() < 0) {
                                                                if (!treeMap.containsKey(num2)) {
                                                                    treeMap.put(num2, Integer.valueOf(i3));
                                                                }
                                                            }
                                                        } else {
                                                            i3++;
                                                        }
                                                    }
                                                } else {
                                                    it = treeMap.keySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            num = (Integer) it.next();
                                                            iIntValue2 = num.intValue();
                                                            if (iIntValue2 > iI1) {
                                                                iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                                this.P0 = iIntValue2;
                                                                this.Q0 = 0;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                }
                                                iIntValue = -1;
                                                break loop2;
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                } else {
                                    if (iI1 < 0) {
                                        treeMap2 = new TreeMap(Collections.reverseOrder());
                                        i4 = 0;
                                        loop2: while (true) {
                                            if (i4 < S()) {
                                                it4 = J1(i4).iterator();
                                                while (true) {
                                                    if (it4.hasNext()) {
                                                        num4 = (Integer) it4.next();
                                                        if (num4.intValue() < 0) {
                                                            treeMap2.put(num4, Integer.valueOf(i4));
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                            } else {
                                                it3 = treeMap2.keySet().iterator();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        num3 = (Integer) it3.next();
                                                        iIntValue3 = num3.intValue();
                                                        if (iIntValue3 < iI1) {
                                                            iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                            this.P0 = iIntValue3;
                                                            this.Q0 = H1(iIntValue);
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                    iIntValue = -1;
                                    break loop2;
                                }
                            }
                            if (iIntValue != -1) {
                                N0(iIntValue);
                                this.O0 = iIntValue;
                                return true;
                            }
                        } else if (i6 == 130) {
                            iIntValue = iB + 1;
                            while (true) {
                                if (iIntValue < S()) {
                                    int iI5 = I1(iIntValue);
                                    int iH5 = H1(iIntValue);
                                    if (iI5 >= 0 && iH5 >= 0) {
                                        if (this.r0 != 1) {
                                            if (iI5 > i7 && iH5 == iH1) {
                                                this.P0 = I1(iIntValue);
                                                break;
                                            }
                                            iIntValue++;
                                        } else {
                                            if (iI5 > i7 && (iH5 == iH1 || K1(H1(iIntValue), iIntValue).contains(Integer.valueOf(iH1)))) {
                                                this.P0 = iI5;
                                                break;
                                            }
                                            iIntValue++;
                                        }
                                    }
                                }
                                iIntValue = -1;
                                break;
                            }
                            if (iIntValue == -1 && (i2 = this.r0) == 0) {
                                if (i6 == 17) {
                                    if (i6 == 66) {
                                        if (iI1 < 0 || i2 == 1) {
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                        treeMap = new TreeMap();
                                        i3 = 0;
                                        loop5: while (true) {
                                            if (i3 < S()) {
                                                it2 = J1(i3).iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        num2 = (Integer) it2.next();
                                                        if (num2.intValue() < 0) {
                                                            if (!treeMap.containsKey(num2)) {
                                                                treeMap.put(num2, Integer.valueOf(i3));
                                                            }
                                                        }
                                                    } else {
                                                        i3++;
                                                    }
                                                }
                                            } else {
                                                it = treeMap.keySet().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        num = (Integer) it.next();
                                                        iIntValue2 = num.intValue();
                                                        if (iIntValue2 > iI1) {
                                                            iIntValue = ((Integer) treeMap.get(num)).intValue();
                                                            this.P0 = iIntValue2;
                                                            this.Q0 = 0;
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                            iIntValue = -1;
                                            break loop2;
                                        }
                                    }
                                } else {
                                    if (iI1 < 0 || i2 == 1) {
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                    treeMap2 = new TreeMap(Collections.reverseOrder());
                                    i4 = 0;
                                    loop2: while (true) {
                                        if (i4 < S()) {
                                            it4 = J1(i4).iterator();
                                            while (true) {
                                                if (it4.hasNext()) {
                                                    num4 = (Integer) it4.next();
                                                    if (num4.intValue() < 0) {
                                                        treeMap2.put(num4, Integer.valueOf(i4));
                                                    }
                                                } else {
                                                    i4++;
                                                }
                                            }
                                        } else {
                                            it3 = treeMap2.keySet().iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    num3 = (Integer) it3.next();
                                                    iIntValue3 = num3.intValue();
                                                    if (iIntValue3 < iI1) {
                                                        iIntValue = ((Integer) treeMap2.get(num3)).intValue();
                                                        this.P0 = iIntValue3;
                                                        this.Q0 = H1(iIntValue);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        iIntValue = -1;
                                        break loop2;
                                    }
                                }
                            }
                            if (iIntValue != -1) {
                                N0(iIntValue);
                                this.O0 = iIntValue;
                                return true;
                            }
                        }
                    }
                }
            }
        } else {
            if (i != 16908343 || bundle == null) {
                return super.B0(i, bundle);
            }
            int i9 = bundle.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT", -1);
            int i10 = bundle.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT", -1);
            if (i9 != -1 && i10 != -1) {
                int iA = this.Y.r0.a();
                int i11 = 0;
                while (true) {
                    if (i11 >= iA) {
                        i11 = -1;
                        break;
                    }
                    RecyclerView recyclerView = this.Y;
                    int iN1 = N1(i11, recyclerView.k1, recyclerView.h0);
                    RecyclerView recyclerView2 = this.Y;
                    int iM1 = M1(i11, recyclerView2.k1, recyclerView2.h0);
                    if (this.r0 != 1) {
                        if (iN1 == i9 && iM1 == i10) {
                            break;
                        }
                        i11++;
                    } else {
                        if (iN1 == i10 && iM1 == i9) {
                            break;
                        }
                        i11++;
                    }
                }
                if (i11 > -1) {
                    this.z0 = i11;
                    this.A0 = 0;
                    ja4 ja4Var = this.B0;
                    if (ja4Var != null) {
                        ja4Var.X = -1;
                    }
                    K0();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void B1(boolean z) {
        if (z) {
            u52.k("GridLayoutManager does not support stack from end. Consider using reverse layout");
        } else {
            super.B1(false);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.j
    public final RecyclerView.LayoutParams E() {
        return this.r0 == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.j
    public final RecyclerView.LayoutParams F(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public final void F1(int i) {
        int i2;
        int[] iArr = this.I0;
        int i3 = this.H0;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.I0 = iArr;
    }

    @Override // androidx.recyclerview.widget.j
    public final RecyclerView.LayoutParams G(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams2 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams2.g0 = -1;
            layoutParams2.h0 = 0;
            return layoutParams2;
        }
        LayoutParams layoutParams3 = new LayoutParams(layoutParams);
        layoutParams3.g0 = -1;
        layoutParams3.h0 = 0;
        return layoutParams3;
    }

    public final void G1() {
        View[] viewArr = this.J0;
        if (viewArr == null || viewArr.length != this.H0) {
            this.J0 = new View[this.H0];
        }
    }

    public final int H1(int i) {
        int i2 = this.r0;
        RecyclerView recyclerView = this.Y;
        if (i2 == 0) {
            return M1(i, recyclerView.k1, recyclerView.h0);
        }
        return N1(i, recyclerView.k1, recyclerView.h0);
    }

    public final int I1(int i) {
        int i2 = this.r0;
        RecyclerView recyclerView = this.Y;
        if (i2 == 1) {
            return M1(i, recyclerView.k1, recyclerView.h0);
        }
        return N1(i, recyclerView.k1, recyclerView.h0);
    }

    public final HashSet J1(int i) {
        return K1(I1(i), i);
    }

    @Override // androidx.recyclerview.widget.j
    public final int K(k kVar, q96 q96Var) {
        if (this.r0 == 1) {
            return Math.min(this.H0, S());
        }
        if (q96Var.b() < 1) {
            return 0;
        }
        return M1(q96Var.b() - 1, q96Var, kVar) + 1;
    }

    public final HashSet K1(int i, int i2) {
        HashSet hashSet = new HashSet();
        RecyclerView recyclerView = this.Y;
        int iO1 = O1(i2, recyclerView.k1, recyclerView.h0);
        for (int i3 = i; i3 < i + iO1; i3++) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    public final int L1(int i, int i2) {
        if (this.r0 != 1 || !t1()) {
            int[] iArr = this.I0;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.I0;
        int i3 = this.H0;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.j
    public final int M0(int i, q96 q96Var, k kVar) {
        R1();
        G1();
        return super.M0(i, q96Var, kVar);
    }

    public final int M1(int i, q96 q96Var, k kVar) {
        boolean z = q96Var.g;
        mj0 mj0Var = this.M0;
        if (!z) {
            int i2 = this.H0;
            mj0Var.getClass();
            return mj0.R(i, i2);
        }
        int iB = kVar.b(i);
        if (iB == -1) {
            return 0;
        }
        int i3 = this.H0;
        mj0Var.getClass();
        return mj0.R(iB, i3);
    }

    public final int N1(int i, q96 q96Var, k kVar) {
        boolean z = q96Var.g;
        mj0 mj0Var = this.M0;
        if (!z) {
            int i2 = this.H0;
            mj0Var.getClass();
            return i % i2;
        }
        int i3 = this.L0.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int iB = kVar.b(i);
        if (iB == -1) {
            return 0;
        }
        int i4 = this.H0;
        mj0Var.getClass();
        return iB % i4;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.j
    public final int O0(int i, q96 q96Var, k kVar) {
        R1();
        G1();
        return super.O0(i, q96Var, kVar);
    }

    public final int O1(int i, q96 q96Var, k kVar) {
        boolean z = q96Var.g;
        mj0 mj0Var = this.M0;
        if (!z) {
            mj0Var.getClass();
            return 1;
        }
        int i2 = this.K0.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (kVar.b(i) == -1) {
            return 1;
        }
        mj0Var.getClass();
        return 1;
    }

    public final void P1(View view, int i, boolean z) {
        int iJ;
        int iJ2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.Y;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int iL1 = L1(layoutParams.g0, layoutParams.h0);
        if (this.r0 == 1) {
            iJ2 = j.J(iL1, false, i, i3, ((ViewGroup.MarginLayoutParams) layoutParams).width);
            iJ = j.J(this.t0.n(), true, this.o0, i2, ((ViewGroup.MarginLayoutParams) layoutParams).height);
        } else {
            int iJ3 = j.J(iL1, false, i, i2, ((ViewGroup.MarginLayoutParams) layoutParams).height);
            int iJ4 = j.J(this.t0.n(), true, this.n0, i3, ((ViewGroup.MarginLayoutParams) layoutParams).width);
            iJ = iJ3;
            iJ2 = iJ4;
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z ? W0(view, iJ2, iJ, layoutParams2) : U0(view, iJ2, iJ, layoutParams2)) {
            view.measure(iJ2, iJ);
        }
    }

    public final void Q1(int i) {
        if (i == this.H0) {
            return;
        }
        this.G0 = true;
        if (i < 1) {
            bt.q(pc6.j(i, "Span count should be at least 1. Provided "));
            return;
        }
        this.H0 = i;
        this.M0.S();
        K0();
    }

    @Override // androidx.recyclerview.widget.j
    public final void R0(Rect rect, int i, int i2) {
        int iS;
        int iS2;
        if (this.I0 == null) {
            super.R0(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.r0 == 1) {
            int iHeight = rect.height() + paddingBottom;
            RecyclerView recyclerView = this.Y;
            WeakHashMap weakHashMap = cw8.a;
            iS2 = j.s(i2, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.I0;
            iS = j.s(i, iArr[iArr.length - 1] + paddingRight, this.Y.getMinimumWidth());
        } else {
            int iWidth = rect.width() + paddingRight;
            RecyclerView recyclerView2 = this.Y;
            WeakHashMap weakHashMap2 = cw8.a;
            iS = j.s(i, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.I0;
            iS2 = j.s(i2, iArr2[iArr2.length - 1] + paddingBottom, this.Y.getMinimumHeight());
        }
        this.Y.setMeasuredDimension(iS, iS2);
    }

    public final void R1() {
        int paddingBottom;
        int paddingTop;
        if (this.r0 == 1) {
            paddingBottom = this.p0 - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            paddingBottom = this.q0 - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        F1(paddingBottom - paddingTop);
    }

    @Override // androidx.recyclerview.widget.j
    public final int V(k kVar, q96 q96Var) {
        if (this.r0 == 0) {
            return Math.min(this.H0, S());
        }
        if (q96Var.b() < 1) {
            return 0;
        }
        return M1(q96Var.b() - 1, q96Var, kVar) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.j
    public final boolean Z0() {
        return this.B0 == null && !this.G0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void b1(q96 q96Var, b bVar, xr0 xr0Var) {
        int i;
        int i2 = this.H0;
        for (int i3 = 0; i3 < this.H0 && (i = bVar.d) >= 0 && i < q96Var.b() && i2 > 0; i3++) {
            xr0Var.b(bVar.d, Math.max(0, bVar.g));
            this.M0.getClass();
            i2--;
            bVar.d += bVar.e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c9, code lost:
    
        if (r13 == (r2 > r15)) goto L49;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View i0(android.view.View r23, int r24, androidx.recyclerview.widget.k r25, defpackage.q96 r26) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.i0(android.view.View, int, androidx.recyclerview.widget.k, q96):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.j
    public final void k0(k kVar, q96 q96Var, h4 h4Var) {
        super.k0(kVar, q96Var, h4Var);
        h4Var.m(GridView.class.getName());
        f fVar = this.Y.r0;
        if (fVar == null || fVar.a() <= 1) {
            return;
        }
        h4Var.b(a4.t);
    }

    @Override // androidx.recyclerview.widget.j
    public final void m0(k kVar, q96 q96Var, View view, h4 h4Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            l0(view, h4Var);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int iM1 = M1(layoutParams2.X.c(), q96Var, kVar);
        int i = this.r0;
        int i2 = layoutParams2.g0;
        int i3 = layoutParams2.h0;
        if (i == 0) {
            h4Var.o(g4.a(i2, false, i3, iM1, 1));
        } else {
            h4Var.o(g4.a(iM1, false, 1, i2, i3));
        }
    }

    @Override // androidx.recyclerview.widget.j
    public final void o0(int i, int i2) {
        mj0 mj0Var = this.M0;
        mj0Var.S();
        ((SparseIntArray) mj0Var.Z).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View o1(k kVar, q96 q96Var, boolean z, boolean z2) {
        int i;
        int I;
        int I2 = I();
        int i2 = 1;
        if (z2) {
            I = I() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = I2;
            I = 0;
        }
        int iB = q96Var.b();
        g1();
        int iM = this.t0.m();
        int i3 = this.t0.i();
        View view = null;
        View view2 = null;
        while (I != i) {
            View viewH = H(I);
            int iT = j.T(viewH);
            if (iT >= 0 && iT < iB && N1(iT, q96Var, kVar) == 0) {
                if (((RecyclerView.LayoutParams) viewH.getLayoutParams()).X.i()) {
                    if (view2 == null) {
                        view2 = viewH;
                    }
                } else {
                    if (this.t0.g(viewH) < i3 && this.t0.d(viewH) >= iM) {
                        return viewH;
                    }
                    if (view == null) {
                        view = viewH;
                    }
                }
            }
            I += i2;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.j
    public final void p0() {
        mj0 mj0Var = this.M0;
        mj0Var.S();
        ((SparseIntArray) mj0Var.Z).clear();
    }

    @Override // androidx.recyclerview.widget.j
    public final void q0(int i, int i2) {
        mj0 mj0Var = this.M0;
        mj0Var.S();
        ((SparseIntArray) mj0Var.Z).clear();
    }

    @Override // androidx.recyclerview.widget.j
    public final boolean r(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.j
    public final void r0(int i, int i2) {
        mj0 mj0Var = this.M0;
        mj0Var.S();
        ((SparseIntArray) mj0Var.Z).clear();
    }

    @Override // androidx.recyclerview.widget.j
    public final void t0(RecyclerView recyclerView, int i, int i2) {
        mj0 mj0Var = this.M0;
        mj0Var.S();
        ((SparseIntArray) mj0Var.Z).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.j
    public final void u0(k kVar, q96 q96Var) {
        boolean z = q96Var.g;
        SparseIntArray sparseIntArray = this.L0;
        SparseIntArray sparseIntArray2 = this.K0;
        if (z) {
            int I = I();
            for (int i = 0; i < I; i++) {
                LayoutParams layoutParams = (LayoutParams) H(i).getLayoutParams();
                int iC = layoutParams.X.c();
                sparseIntArray2.put(iC, layoutParams.h0);
                sparseIntArray.put(iC, layoutParams.g0);
            }
        }
        super.u0(kVar, q96Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void u1(k kVar, q96 q96Var, b bVar, ia4 ia4Var) {
        int i;
        int i2;
        int i3;
        int iF;
        int paddingLeft;
        int paddingTop;
        int iJ;
        int iJ2;
        boolean z;
        int i4;
        View viewB;
        int iL = this.t0.l();
        boolean z2 = iL != 1073741824;
        int i5 = I() > 0 ? this.I0[this.H0] : 0;
        if (z2) {
            R1();
        }
        boolean z3 = bVar.e == 1;
        int iN1 = this.H0;
        if (!z3) {
            iN1 = N1(bVar.d, q96Var, kVar) + O1(bVar.d, q96Var, kVar);
        }
        int i6 = 0;
        while (i6 < this.H0 && (i4 = bVar.d) >= 0 && i4 < q96Var.b() && iN1 > 0) {
            int i7 = bVar.d;
            int iO1 = O1(i7, q96Var, kVar);
            if (iO1 > this.H0) {
                bt.q(oi0.n(oi0.r(i7, "Item at position ", iO1, " requires ", " spans but GridLayoutManager has only "), this.H0, " spans."));
                return;
            }
            iN1 -= iO1;
            if (iN1 < 0 || (viewB = bVar.b(kVar)) == null) {
                break;
            }
            this.J0[i6] = viewB;
            i6++;
        }
        if (i6 == 0) {
            ia4Var.b = true;
            return;
        }
        if (z3) {
            i3 = 1;
            i2 = i6;
            i = 0;
        } else {
            i = i6 - 1;
            i2 = -1;
            i3 = -1;
        }
        int i8 = 0;
        while (i != i2) {
            View view = this.J0[i];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int iO2 = O1(j.T(view), q96Var, kVar);
            layoutParams.h0 = iO2;
            layoutParams.g0 = i8;
            i8 += iO2;
            i += i3;
        }
        float f = 0.0f;
        int i9 = 0;
        for (int i10 = 0; i10 < i6; i10++) {
            View view2 = this.J0[i10];
            if (bVar.k != null) {
                z = false;
                if (z3) {
                    m(view2, -1, true);
                } else {
                    m(view2, 0, true);
                }
            } else if (z3) {
                l(view2);
                z = false;
            } else {
                z = false;
                m(view2, 0, false);
            }
            o(view2, this.N0);
            P1(view2, iL, z);
            int iE = this.t0.e(view2);
            if (iE > i9) {
                i9 = iE;
            }
            float f2 = (this.t0.f(view2) * 1.0f) / ((LayoutParams) view2.getLayoutParams()).h0;
            if (f2 > f) {
                f = f2;
            }
        }
        if (z2) {
            F1(Math.max(Math.round(f * this.H0), i5));
            i9 = 0;
            for (int i11 = 0; i11 < i6; i11++) {
                View view3 = this.J0[i11];
                P1(view3, 1073741824, true);
                int iE2 = this.t0.e(view3);
                if (iE2 > i9) {
                    i9 = iE2;
                }
            }
        }
        for (int i12 = 0; i12 < i6; i12++) {
            View view4 = this.J0[i12];
            if (this.t0.e(view4) != i9) {
                LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
                Rect rect = layoutParams2.Y;
                int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                int iL1 = L1(layoutParams2.g0, layoutParams2.h0);
                if (this.r0 == 1) {
                    iJ2 = j.J(iL1, false, 1073741824, i14, ((ViewGroup.MarginLayoutParams) layoutParams2).width);
                    iJ = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i14, 1073741824);
                    iJ = j.J(iL1, false, 1073741824, i13, ((ViewGroup.MarginLayoutParams) layoutParams2).height);
                    iJ2 = iMakeMeasureSpec;
                }
                if (W0(view4, iJ2, iJ, (RecyclerView.LayoutParams) view4.getLayoutParams())) {
                    view4.measure(iJ2, iJ);
                }
            }
        }
        ia4Var.a = i9;
        int i15 = this.r0;
        int i16 = bVar.f;
        int iF2 = bVar.b;
        if (i15 != 1) {
            if (i16 == -1) {
                paddingLeft = iF2 - i9;
                iF = iF2;
            } else {
                iF = iF2 + i9;
                paddingLeft = iF2;
            }
            paddingTop = 0;
            iF2 = 0;
        } else if (i16 == -1) {
            paddingTop = iF2 - i9;
            paddingLeft = 0;
            iF = 0;
        } else {
            paddingTop = iF2;
            iF = 0;
            iF2 += i9;
            paddingLeft = 0;
        }
        int i17 = 0;
        while (true) {
            View[] viewArr = this.J0;
            if (i17 >= i6) {
                Arrays.fill(viewArr, (Object) null);
                return;
            }
            View view5 = viewArr[i17];
            LayoutParams layoutParams3 = (LayoutParams) view5.getLayoutParams();
            if (this.r0 != 1) {
                paddingTop = getPaddingTop() + this.I0[layoutParams3.g0];
                iF2 = this.t0.f(view5) + paddingTop;
            } else if (t1()) {
                int paddingLeft2 = getPaddingLeft() + this.I0[this.H0 - layoutParams3.g0];
                iF = paddingLeft2;
                paddingLeft = paddingLeft2 - this.t0.f(view5);
            } else {
                paddingLeft = getPaddingLeft() + this.I0[layoutParams3.g0];
                iF = this.t0.f(view5) + paddingLeft;
            }
            j.b0(view5, paddingLeft, paddingTop, iF, iF2);
            if (layoutParams3.X.i() || layoutParams3.X.l()) {
                ia4Var.c = true;
            }
            ia4Var.d = view5.hasFocusable() | ia4Var.d;
            i17++;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.j
    public final void v0(q96 q96Var) {
        View viewD;
        super.v0(q96Var);
        this.G0 = false;
        int i = this.O0;
        if (i == -1 || (viewD = D(i)) == null) {
            return;
        }
        viewD.sendAccessibilityEvent(67108864);
        this.O0 = -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void v1(k kVar, q96 q96Var, a aVar, int i) {
        R1();
        if (q96Var.b() > 0 && !q96Var.g) {
            boolean z = i == 1;
            int iN1 = N1(aVar.b, q96Var, kVar);
            if (z) {
                while (iN1 > 0) {
                    int i2 = aVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    aVar.b = i3;
                    iN1 = N1(i3, q96Var, kVar);
                }
            } else {
                int iB = q96Var.b() - 1;
                int i4 = aVar.b;
                while (i4 < iB) {
                    int i5 = i4 + 1;
                    int iN2 = N1(i5, q96Var, kVar);
                    if (iN2 <= iN1) {
                        break;
                    }
                    i4 = i5;
                    iN1 = iN2;
                }
                aVar.b = i4;
            }
        }
        G1();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.j
    public final int w(q96 q96Var) {
        return d1(q96Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.j
    public final int x(q96 q96Var) {
        return e1(q96Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.j
    public final int z(q96 q96Var) {
        return d1(q96Var);
    }

    /* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
    public static class LayoutParams extends RecyclerView.LayoutParams {
        public int g0;
        public int h0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.g0 = -1;
            this.h0 = 0;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.g0 = -1;
            this.h0 = 0;
        }
    }

    public GridLayoutManager(int i) {
        super(1);
        this.G0 = false;
        this.H0 = -1;
        this.K0 = new SparseIntArray();
        this.L0 = new SparseIntArray();
        this.M0 = new mj0((byte) 29);
        this.N0 = new Rect();
        this.O0 = -1;
        this.P0 = -1;
        this.Q0 = -1;
        Q1(i);
    }
}
