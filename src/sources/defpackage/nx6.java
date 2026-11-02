package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class nx6 extends i96 {
    public i01 a;
    public final ViewPager2 b;
    public final nx8 c;
    public final LinearLayoutManager d;
    public int e;
    public byte f;
    public final mx6 g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;

    public nx6(ViewPager2 viewPager2) {
        this.b = viewPager2;
        nx8 nx8Var = viewPager2.o0;
        this.c = nx8Var;
        this.d = (LinearLayoutManager) nx8Var.getLayoutManager();
        this.g = new mx6();
        d();
    }

    @Override // defpackage.i96
    public final void a(RecyclerView recyclerView, int i) {
        i01 i01Var;
        i01 i01Var2;
        int i2 = this.e;
        if (!(i2 == 1 && this.f == 1) && i == 1) {
            this.e = 1;
            int i3 = this.i;
            if (i3 != -1) {
                this.h = i3;
                this.i = -1;
            } else if (this.h == -1) {
                this.h = this.d.k1();
            }
            c(1);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.k) {
                c(2);
                this.j = true;
                return;
            }
            return;
        }
        mx6 mx6Var = this.g;
        if ((i2 == 1 || i2 == 4) && i == 0) {
            e();
            if (!this.k) {
                int i4 = mx6Var.a;
                if (i4 != -1 && (i01Var2 = this.a) != null) {
                    i01Var2.b(i4, 0.0f, 0);
                }
            } else if (mx6Var.c == 0) {
                int i5 = this.h;
                int i6 = mx6Var.a;
                if (i5 != i6 && (i01Var = this.a) != null) {
                    i01Var.c(i6);
                }
            }
            c(0);
            d();
        }
        if (this.e == 2 && i == 0 && this.l) {
            e();
            if (mx6Var.c == 0) {
                int i7 = this.i;
                int i8 = mx6Var.a;
                if (i7 != i8) {
                    if (i8 == -1) {
                        i8 = 0;
                    }
                    i01 i01Var3 = this.a;
                    if (i01Var3 != null) {
                        i01Var3.c(i8);
                    }
                }
                c(0);
                d();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    @Override // defpackage.i96
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int i3;
        i01 i01Var;
        this.k = true;
        e();
        boolean z = this.j;
        mx6 mx6Var = this.g;
        if (z) {
            this.j = false;
            if (i2 <= 0) {
                if (i2 == 0) {
                    if ((i < 0) == (this.b.l0.Y.getLayoutDirection() == 1)) {
                        if (mx6Var.c != 0) {
                            i3 = mx6Var.a + 1;
                        }
                    }
                }
                i3 = mx6Var.a;
            } else if (mx6Var.c != 0) {
                i3 = mx6Var.a + 1;
            } else {
                i3 = mx6Var.a;
            }
            this.i = i3;
            if (this.h != i3 && (i01Var = this.a) != null) {
                i01Var.c(i3);
            }
        } else if (this.e == 0) {
            int i4 = mx6Var.a;
            if (i4 == -1) {
                i4 = 0;
            }
            i01 i01Var2 = this.a;
            if (i01Var2 != null) {
                i01Var2.c(i4);
            }
        }
        int i5 = mx6Var.a;
        if (i5 == -1) {
            i5 = 0;
        }
        float f = mx6Var.b;
        int i6 = mx6Var.c;
        i01 i01Var3 = this.a;
        if (i01Var3 != null) {
            i01Var3.b(i5, f, i6);
        }
        int i7 = mx6Var.a;
        int i8 = this.i;
        if ((i7 == i8 || i8 == -1) && mx6Var.c == 0 && this.f != 1) {
            c(0);
            d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(int i) {
        if ((this.e == 3 && this.f == 0) || this.f == i) {
            return;
        }
        this.f = i;
        i01 i01Var = this.a;
        if (i01Var != null) {
            i01Var.a(i);
        }
    }

    public final void d() {
        this.e = 0;
        this.f = (byte) 0;
        mx6 mx6Var = this.g;
        mx6Var.a = -1;
        mx6Var.b = 0.0f;
        mx6Var.c = 0;
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.k = false;
        this.l = false;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0133  */
    /* JADX WARN: Code duplicated, block: B:65:0x013f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0149 A[LOOP:2: B:64:0x013d->B:67:0x0149, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x014c A[SYNTHETIC] */
    public final void e() {
        int top;
        int I;
        int top2;
        int i;
        int bottom;
        int i2;
        LinearLayoutManager linearLayoutManager = this.d;
        int iK1 = linearLayoutManager.k1();
        mx6 mx6Var = this.g;
        mx6Var.a = iK1;
        if (iK1 == -1) {
            mx6Var.a = -1;
            mx6Var.b = 0.0f;
            mx6Var.c = 0;
            return;
        }
        View viewD = linearLayoutManager.D(iK1);
        if (viewD == null) {
            mx6Var.a = -1;
            mx6Var.b = 0.0f;
            mx6Var.c = 0;
            return;
        }
        int i3 = ((RecyclerView.LayoutParams) viewD.getLayoutParams()).Y.left;
        int i4 = ((RecyclerView.LayoutParams) viewD.getLayoutParams()).Y.right;
        int i5 = ((RecyclerView.LayoutParams) viewD.getLayoutParams()).Y.top;
        int i6 = ((RecyclerView.LayoutParams) viewD.getLayoutParams()).Y.bottom;
        ViewGroup.LayoutParams layoutParams = viewD.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i3 += marginLayoutParams.leftMargin;
            i4 += marginLayoutParams.rightMargin;
            i5 += marginLayoutParams.topMargin;
            i6 += marginLayoutParams.bottomMargin;
        }
        int height = viewD.getHeight() + i5 + i6;
        int width = viewD.getWidth() + i3 + i4;
        int i7 = linearLayoutManager.r0;
        nx8 nx8Var = this.c;
        if (i7 == 0) {
            top = (viewD.getLeft() - i3) - nx8Var.getPaddingLeft();
            if (this.b.l0.Y.getLayoutDirection() == 1) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewD.getTop() - i5) - nx8Var.getPaddingTop();
        }
        int i8 = -top;
        mx6Var.c = i8;
        if (i8 >= 0) {
            mx6Var.b = height != 0 ? i8 / height : 0.0f;
            return;
        }
        int I2 = linearLayoutManager.I();
        if (I2 != 0) {
            boolean z = linearLayoutManager.r0 == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, I2, 2);
            for (int i9 = 0; i9 < I2; i9++) {
                View viewH = linearLayoutManager.H(i9);
                if (viewH == null) {
                    bt.i("null view contained in the view hierarchy");
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = viewH.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : si.a;
                int[] iArr2 = iArr[i9];
                if (z) {
                    top2 = viewH.getLeft();
                    i = marginLayoutParams2.leftMargin;
                } else {
                    top2 = viewH.getTop();
                    i = marginLayoutParams2.topMargin;
                }
                iArr2[0] = top2 - i;
                int[] iArr3 = iArr[i9];
                if (z) {
                    bottom = viewH.getRight();
                    i2 = marginLayoutParams2.rightMargin;
                } else {
                    bottom = viewH.getBottom();
                    i2 = marginLayoutParams2.bottomMargin;
                }
                iArr3[1] = bottom + i2;
            }
            Arrays.sort(iArr, new l71((byte) 7));
            int i10 = 1;
            while (true) {
                if (i10 >= I2) {
                    int[] iArr4 = iArr[0];
                    int i11 = iArr4[1];
                    int i12 = iArr4[0];
                    int i13 = i11 - i12;
                    if (i12 <= 0 && iArr[I2 - 1][1] >= i13) {
                        if (linearLayoutManager.I() <= 1) {
                        }
                    }
                } else if (iArr[i10 - 1][1] == iArr[i10][0]) {
                    i10++;
                }
                I = linearLayoutManager.I();
                for (int i14 = 0; i14 < I; i14++) {
                    if (!si.a(linearLayoutManager.H(i14))) {
                        bt.i("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                        return;
                    }
                }
            }
        } else if (linearLayoutManager.I() <= 1) {
            I = linearLayoutManager.I();
            while (i14 < I) {
                if (!si.a(linearLayoutManager.H(i14))) {
                    bt.i("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
                    return;
                }
            }
        }
        Locale locale = Locale.US;
        bt.i(pc6.j(mx6Var.c, "Page can only be offset by a positive amount, not by "));
    }
}
