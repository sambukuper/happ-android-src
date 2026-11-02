package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class sa4 extends AbstractCollection implements Deque {
    public su5 X;
    public su5 Y;

    public final void a() {
        if (isEmpty()) {
            bt.n();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque, java.util.Queue
    public final boolean add(Object obj) {
        return offerLast((su5) obj);
    }

    @Override // java.util.Deque
    public final void addFirst(Object obj) {
        su5 su5Var = (su5) obj;
        if (b(su5Var)) {
            kp5.e();
            return;
        }
        su5 su5Var2 = this.X;
        this.X = su5Var;
        if (su5Var2 == null) {
            this.Y = su5Var;
        } else {
            su5Var2.Y = su5Var;
            su5Var.Z = su5Var2;
        }
    }

    @Override // java.util.Deque
    public final void addLast(Object obj) {
        if (offerLast((su5) obj)) {
            return;
        }
        kp5.e();
    }

    public final boolean b(su5 su5Var) {
        return (su5Var.Y == null && su5Var.Z == null && su5Var != this.X) ? false : true;
    }

    @Override // java.util.Deque
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final boolean offerLast(su5 su5Var) {
        if (b(su5Var)) {
            return false;
        }
        su5 su5Var2 = this.Y;
        this.Y = su5Var;
        if (su5Var2 == null) {
            this.X = su5Var;
            return true;
        }
        su5Var2.Z = su5Var;
        su5Var.Y = su5Var2;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        su5 su5Var = this.X;
        while (su5Var != null) {
            su5 su5Var2 = su5Var.Z;
            su5Var.Y = null;
            su5Var.Z = null;
            su5Var = su5Var2;
        }
        this.Y = null;
        this.X = null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final boolean contains(Object obj) {
        return (obj instanceof su5) && b((su5) obj);
    }

    @Override // java.util.Deque
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final su5 pollFirst() {
        if (isEmpty()) {
            return null;
        }
        su5 su5Var = this.X;
        su5 su5Var2 = su5Var.Z;
        su5Var.Z = null;
        this.X = su5Var2;
        if (su5Var2 == null) {
            this.Y = null;
            return su5Var;
        }
        su5Var2.Y = null;
        return su5Var;
    }

    @Override // java.util.Deque
    public final Iterator descendingIterator() {
        return new ra4(this.Y, (byte) 1);
    }

    @Override // java.util.Deque, java.util.Queue
    public final Object element() {
        a();
        return this.X;
    }

    @Override // java.util.Deque
    public final Object getFirst() {
        a();
        return this.X;
    }

    @Override // java.util.Deque
    public final Object getLast() {
        a();
        return this.Y;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.X == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Deque
    public final Iterator iterator() {
        return new ra4(this.X, (byte) 0);
    }

    @Override // java.util.Deque, java.util.Queue
    public final boolean offer(Object obj) {
        return offerLast((su5) obj);
    }

    @Override // java.util.Deque
    public final boolean offerFirst(Object obj) {
        su5 su5Var = (su5) obj;
        if (b(su5Var)) {
            return false;
        }
        su5 su5Var2 = this.X;
        this.X = su5Var;
        if (su5Var2 == null) {
            this.Y = su5Var;
            return true;
        }
        su5Var2.Y = su5Var;
        su5Var.Z = su5Var2;
        return true;
    }

    @Override // java.util.Deque, java.util.Queue
    public final Object peek() {
        return this.X;
    }

    @Override // java.util.Deque
    public final Object peekFirst() {
        return this.X;
    }

    @Override // java.util.Deque
    public final Object peekLast() {
        return this.Y;
    }

    @Override // java.util.Deque, java.util.Queue
    public final Object poll() {
        return pollFirst();
    }

    @Override // java.util.Deque
    public final Object pollLast() {
        if (isEmpty()) {
            return null;
        }
        su5 su5Var = this.Y;
        su5 su5Var2 = su5Var.Y;
        su5Var.Y = null;
        this.Y = su5Var2;
        if (su5Var2 == null) {
            this.X = null;
            return su5Var;
        }
        su5Var2.Z = null;
        return su5Var;
    }

    @Override // java.util.Deque
    public final Object pop() {
        a();
        return pollFirst();
    }

    @Override // java.util.Deque
    public final void push(Object obj) {
        su5 su5Var = (su5) obj;
        if (b(su5Var)) {
            kp5.e();
            return;
        }
        su5 su5Var2 = this.X;
        this.X = su5Var;
        if (su5Var2 == null) {
            this.Y = su5Var;
        } else {
            su5Var2.Y = su5Var;
            su5Var.Z = su5Var2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final boolean remove(Object obj) {
        if (!(obj instanceof su5)) {
            return false;
        }
        su5 su5Var = (su5) obj;
        if (!b(su5Var)) {
            return false;
        }
        su5 su5Var2 = su5Var.Y;
        su5 su5Var3 = su5Var.Z;
        if (su5Var2 == null) {
            this.X = su5Var3;
        } else {
            su5Var2.Z = su5Var3;
            su5Var.Y = null;
        }
        if (su5Var3 == null) {
            this.Y = su5Var2;
            return true;
        }
        su5Var3.Y = su5Var2;
        su5Var.Z = null;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Deque
    public final Object removeFirst() {
        a();
        return pollFirst();
    }

    @Override // java.util.Deque
    public final boolean removeFirstOccurrence(Object obj) {
        return remove(obj);
    }

    @Override // java.util.Deque
    public final Object removeLast() {
        a();
        if (isEmpty()) {
            return null;
        }
        su5 su5Var = this.Y;
        su5 su5Var2 = su5Var.Y;
        su5Var.Y = null;
        this.Y = su5Var2;
        if (su5Var2 == null) {
            this.X = null;
            return su5Var;
        }
        su5Var2.Z = null;
        return su5Var;
    }

    @Override // java.util.Deque
    public final boolean removeLastOccurrence(Object obj) {
        return remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Deque
    public final int size() {
        int i = 0;
        for (su5 su5Var = this.X; su5Var != null; su5Var = su5Var.Z) {
            i++;
        }
        return i;
    }

    @Override // java.util.Deque, java.util.Queue
    public final Object remove() {
        a();
        return pollFirst();
    }
}
