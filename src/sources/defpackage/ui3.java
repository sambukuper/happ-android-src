package defpackage;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class ui3 implements h96 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ui3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.h96
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                yi3 yi3Var = (yi3) this.b;
                xb xbVar = yi3Var.s;
                yi3Var.x.onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = yi3Var.t;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (yi3Var.l != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int iFindPointerIndex = motionEvent.findPointerIndex(yi3Var.l);
                    if (iFindPointerIndex >= 0) {
                        yi3Var.j(actionMasked, iFindPointerIndex, motionEvent);
                    }
                    l lVar = yi3Var.c;
                    if (lVar != null) {
                        if (actionMasked != 1) {
                            if (actionMasked == 2) {
                                if (iFindPointerIndex >= 0) {
                                    yi3Var.r(yi3Var.o, iFindPointerIndex, motionEvent);
                                    yi3Var.p(lVar);
                                    yi3Var.r.removeCallbacks(xbVar);
                                    xbVar.run();
                                    yi3Var.r.invalidate();
                                }
                                break;
                            } else if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = yi3Var.t;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == yi3Var.l) {
                                    yi3Var.l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                                    yi3Var.r(yi3Var.o, actionIndex, motionEvent);
                                }
                                break;
                            }
                        }
                        yi3Var.q(null, 0);
                        yi3Var.l = -1;
                        break;
                    }
                }
                break;
            default:
                motionEvent.getClass();
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0080  */
    /* JADX WARN: Code duplicated, block: B:27:0x008a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a8  */
    @Override // defpackage.h96
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int iFindPointerIndex;
        l lVarI;
        qg5 qg5Var;
        byte b = this.a;
        vi3 vi3Var = null;
        Object obj = null;
        vi3Var = null;
        Object obj2 = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                yi3 yi3Var = (yi3) obj2;
                yi3Var.x.onTouchEvent(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    yi3Var.l = motionEvent.getPointerId(0);
                    yi3Var.d = motionEvent.getX();
                    yi3Var.e = motionEvent.getY();
                    VelocityTracker velocityTracker = yi3Var.t;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    yi3Var.t = VelocityTracker.obtain();
                    if (yi3Var.c == null) {
                        ArrayList arrayList = yi3Var.p;
                        if (!arrayList.isEmpty()) {
                            View viewM = yi3Var.m(motionEvent);
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                vi3 vi3Var2 = (vi3) arrayList.get(size);
                                if (vi3Var2.e.a == viewM) {
                                    vi3Var = vi3Var2;
                                }
                            }
                        }
                        if (vi3Var != null) {
                            l lVar = vi3Var.e;
                            yi3Var.d -= vi3Var.i;
                            yi3Var.e -= vi3Var.j;
                            yi3Var.l(lVar, true);
                            if (yi3Var.a.remove(lVar.a)) {
                                y42.a(lVar);
                            }
                            yi3Var.q(lVar, vi3Var.f);
                            yi3Var.r(yi3Var.o, 0, motionEvent);
                        }
                    }
                } else if (actionMasked == 3 || actionMasked == 1) {
                    yi3Var.l = -1;
                    yi3Var.q(null, 0);
                } else {
                    int i = yi3Var.l;
                    if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                        yi3Var.j(actionMasked, iFindPointerIndex, motionEvent);
                    }
                }
                VelocityTracker velocityTracker2 = yi3Var.t;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                return yi3Var.c != null;
            default:
                motionEvent.getClass();
                y42 y42Var = (y42) obj2;
                LinkedList linkedList = y42Var.g;
                int i2 = y42Var.e;
                if (i2 >= 0 && (lVarI = y42Var.c.I(i2)) != null) {
                    View view = lVarI.a;
                    view.getClass();
                    if (motionEvent.getAction() == 0) {
                        if (view.getTop() >= motionEvent.getY() || view.getBottom() <= motionEvent.getY()) {
                            if (!linkedList.contains(Integer.valueOf(y42Var.e))) {
                                linkedList.add(Integer.valueOf(y42Var.e));
                            }
                            y42Var.e = -1;
                            y42Var.i = 0;
                            y42Var.k();
                        } else if (!y42Var.k) {
                            md8 md8VarL0 = w27.l0(wv0.l0(y42Var.h), new py7(motionEvent, lVarI, b2));
                            Iterator it = md8VarL0.a.iterator();
                            while (it.hasNext()) {
                                Object objB = md8VarL0.b.B(it.next());
                                if (((Boolean) ((qg5) objB).X).booleanValue()) {
                                    obj = objB;
                                    qg5Var = (qg5) obj;
                                    if (qg5Var != null) {
                                        if (((Boolean) qg5Var.Y).booleanValue()) {
                                            y42Var.i++;
                                            if (y42Var.e > -1) {
                                                y42Var.k = true;
                                                view.requestLayout();
                                                view.invalidate();
                                            }
                                        } else {
                                            if (!linkedList.contains(Integer.valueOf(y42Var.e))) {
                                                linkedList.add(Integer.valueOf(y42Var.e));
                                            }
                                            y42Var.i = 0;
                                            y42Var.e = -1;
                                            y42Var.k();
                                        }
                                    }
                                }
                            }
                            qg5Var = (qg5) obj;
                            if (qg5Var != null) {
                                if (((Boolean) qg5Var.Y).booleanValue()) {
                                    y42Var.i++;
                                    if (y42Var.e > -1) {
                                        y42Var.k = true;
                                        view.requestLayout();
                                        view.invalidate();
                                    }
                                } else {
                                    if (!linkedList.contains(Integer.valueOf(y42Var.e))) {
                                        linkedList.add(Integer.valueOf(y42Var.e));
                                    }
                                    y42Var.i = 0;
                                    y42Var.e = -1;
                                    y42Var.k();
                                }
                            }
                        }
                    }
                }
                return false;
        }
    }

    @Override // defpackage.h96
    public final void e(boolean z) {
        switch (this.a) {
            case 0:
                if (z) {
                    ((yi3) this.b).q(null, 0);
                    break;
                }
                break;
        }
    }

    private final void b(boolean z) {
    }
}
