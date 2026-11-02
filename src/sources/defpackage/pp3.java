package defpackage;

import java.io.Closeable;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class pp3 extends mb1 {
    public LinkedList X;
    public final transient Closeable Y;

    public pp3(eq2 eq2Var, String str) {
        super(str);
        this.Y = eq2Var;
    }

    public static pp3 d(Throwable th, op3 op3Var) {
        pp3 pp3Var;
        Object objB;
        if (th instanceof pp3) {
            pp3Var = (pp3) th;
        } else {
            String strH = it0.h(th);
            if (strH == null || strH.isEmpty()) {
                strH = "(was " + th.getClass().getName() + ")";
            }
            pp3Var = new pp3((!(th instanceof hj3) || (objB = ((hj3) th).b()) == null) ? null : (Closeable) objB, strH, th);
        }
        LinkedList linkedList = pp3Var.X;
        if (linkedList == null) {
            linkedList = new LinkedList();
            pp3Var.X = linkedList;
        }
        if (linkedList.size() < 1000) {
            pp3Var.X.addFirst(op3Var);
        }
        return pp3Var;
    }

    @Override // defpackage.hj3
    public final Object b() {
        return this.Y;
    }

    public final String c() {
        String message = super.getMessage();
        if (this.X == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(message);
        sb.append(" (through reference chain: ");
        LinkedList linkedList = this.X;
        if (linkedList != null) {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                sb.append(((op3) it.next()).toString());
                if (it.hasNext()) {
                    sb.append("->");
                }
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return c();
    }

    @Override // defpackage.lq3, java.lang.Throwable
    public final String getMessage() {
        return c();
    }

    @Override // defpackage.lq3, java.lang.Throwable
    public final String toString() {
        return getClass().getName() + ": " + c();
    }

    public pp3(Closeable closeable, String str, Throwable th) {
        super(str, th);
        this.Y = closeable;
    }
}
