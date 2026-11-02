package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class c35 {
    public ViewParent a;
    public ViewParent b;
    public final ViewGroup c;
    public boolean d;
    public int[] e;

    public c35(ViewGroup viewGroup) {
        this.c = viewGroup;
    }

    public final boolean a(float f, float f2) {
        ViewParent viewParentD;
        if (this.d && (viewParentD = d(0)) != null) {
            try {
                return viewParentD.onNestedPreFling(this.c, f, f2);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentD);
            }
        }
        return false;
    }

    public final boolean b(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent viewParentD;
        int i4;
        int i5;
        int[] iArr3;
        ViewGroup viewGroup;
        if (!this.d || (viewParentD = d(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup2 = this.c;
        if (iArr2 != null) {
            viewGroup2.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            int[] iArr4 = this.e;
            if (iArr4 == null) {
                iArr4 = new int[2];
                this.e = iArr4;
            }
            iArr3 = iArr4;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentD instanceof d35) {
            ((d35) viewParentD).f(viewGroup2, i, i2, iArr3, i3);
            viewGroup = viewGroup2;
        } else {
            viewGroup = viewGroup2;
            if (i3 == 0) {
                try {
                    viewParentD.onNestedPreScroll(viewGroup, i, i2, iArr3);
                } catch (AbstractMethodError unused) {
                    Objects.toString(viewParentD);
                }
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    public final boolean c(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentD;
        int i6;
        int i7;
        int[] iArr3;
        ViewGroup viewGroup;
        if (this.d && (viewParentD = d(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                ViewGroup viewGroup2 = this.c;
                if (iArr != null) {
                    viewGroup2.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    int[] iArr4 = this.e;
                    if (iArr4 == null) {
                        iArr4 = new int[2];
                        this.e = iArr4;
                    }
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (!(viewParentD instanceof e35)) {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (viewParentD instanceof d35) {
                        d35 d35Var = (d35) viewParentD;
                        viewGroup = viewGroup2;
                        d35Var.b(viewGroup, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            viewParentD.onNestedScroll(viewGroup2, i, i2, i3, i4);
                        } catch (AbstractMethodError unused) {
                            Objects.toString(viewParentD);
                        }
                    }
                    if (iArr != null) {
                        viewGroup2.getLocationInWindow(iArr);
                        iArr[0] = iArr[0] - i6;
                        iArr[1] = iArr[1] - i7;
                    }
                    return true;
                }
                e35 e35Var = (e35) viewParentD;
                viewGroup = viewGroup2;
                e35Var.a(viewGroup, i, i2, i3, i4, i5, iArr3);
                viewGroup2 = viewGroup;
                if (iArr != null) {
                    viewGroup2.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent d(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return null;
        }
        return this.b;
    }

    public final boolean e(int i) {
        return d(i) != null;
    }

    public final boolean f(int i, int i2) {
        boolean zOnStartNestedScroll;
        if (!e(i2)) {
            if (this.d) {
                View view = this.c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z = parent instanceof d35;
                    if (z) {
                        zOnStartNestedScroll = ((d35) parent).c(view2, view, i, i2);
                    } else if (i2 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                        } catch (AbstractMethodError unused) {
                            Objects.toString(parent);
                            zOnStartNestedScroll = false;
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i2 == 0) {
                            this.a = parent;
                        } else if (i2 == 1) {
                            this.b = parent;
                        }
                        if (z) {
                            ((d35) parent).d(view2, view, i, i2);
                        } else if (i2 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i);
                            } catch (AbstractMethodError unused2) {
                                Objects.toString(parent);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void g(int i) {
        ViewParent viewParentD = d(i);
        if (viewParentD != null) {
            boolean z = viewParentD instanceof d35;
            ViewGroup viewGroup = this.c;
            if (z) {
                ((d35) viewParentD).e(viewGroup, i);
            } else if (i == 0) {
                try {
                    viewParentD.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError unused) {
                    Objects.toString(viewParentD);
                }
            }
            if (i == 0) {
                this.a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.b = null;
            }
        }
    }
}
