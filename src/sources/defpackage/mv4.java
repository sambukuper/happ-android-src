package defpackage;

import android.util.Size;
import android.view.View;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.conscrypt.FileClientSessionCache;
import su.happ.proxyutility.dto.SubscriptionItem;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class mv4 implements Comparator {
    public final /* synthetic */ byte X;

    public /* synthetic */ mv4(byte b) {
        this.X = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.valueOf(((long) size.getWidth()) * ((long) size.getHeight())).compareTo(Long.valueOf(((long) size2.getWidth()) * ((long) size2.getHeight())));
            case 1:
                return Long.valueOf(((SubscriptionItem) ((qg5) obj).Y).getAddedTime()).compareTo(Long.valueOf(((SubscriptionItem) ((qg5) obj2).Y).getAddedTime()));
            case 2:
                return Integer.valueOf(((fi5) obj2).a).compareTo(Integer.valueOf(((fi5) obj).a));
            case 3:
                return ((ge7) obj).Y - ((ge7) obj2).Y;
            case 4:
                ((m95) obj2).getClass();
                Integer num = 2;
                ((m95) obj).getClass();
                return num.compareTo(num);
            case 5:
                ((ud1) obj2).getClass();
                Integer num2 = 0;
                ((ud1) obj).getClass();
                return num2.compareTo(num2);
            case 6:
                return dh3.m((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 7:
                return dh3.m((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 8:
                Iterator it = ((fl0) obj).b.iterator();
                if (it.hasNext()) {
                    bl7 bl7Var = (bl7) it.next();
                    List list = cl7.p0;
                    lh4 lh4Var = bl7Var.h;
                    list.getClass();
                    Integer numValueOf = Integer.valueOf(list.indexOf(lh4Var));
                    while (it.hasNext()) {
                        bl7 bl7Var2 = (bl7) it.next();
                        List list2 = cl7.p0;
                        lh4 lh4Var2 = bl7Var2.h;
                        list2.getClass();
                        Integer numValueOf2 = Integer.valueOf(list2.indexOf(lh4Var2));
                        if (numValueOf.compareTo(numValueOf2) < 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                    Iterator it2 = ((fl0) obj2).b.iterator();
                    if (it2.hasNext()) {
                        bl7 bl7Var3 = (bl7) it2.next();
                        List list3 = cl7.p0;
                        lh4 lh4Var3 = bl7Var3.h;
                        list3.getClass();
                        Integer numValueOf3 = Integer.valueOf(list3.indexOf(lh4Var3));
                        while (it2.hasNext()) {
                            bl7 bl7Var4 = (bl7) it2.next();
                            List list4 = cl7.p0;
                            lh4 lh4Var4 = bl7Var4.h;
                            list4.getClass();
                            Integer numValueOf4 = Integer.valueOf(list4.indexOf(lh4Var4));
                            if (numValueOf3.compareTo(numValueOf4) < 0) {
                                numValueOf3 = numValueOf4;
                            }
                        }
                        return numValueOf.compareTo(numValueOf3);
                    }
                }
                bt.n();
                return 0;
            case 9:
                Iterator it3 = ((fl0) obj).b.iterator();
                if (it3.hasNext()) {
                    Integer numValueOf5 = Integer.valueOf(cl7.r0.indexOf(new yk7(((bl7) it3.next()).c)));
                    while (it3.hasNext()) {
                        Integer numValueOf6 = Integer.valueOf(cl7.r0.indexOf(new yk7(((bl7) it3.next()).c)));
                        if (numValueOf5.compareTo(numValueOf6) < 0) {
                            numValueOf5 = numValueOf6;
                        }
                    }
                    Iterator it4 = ((fl0) obj2).b.iterator();
                    if (it4.hasNext()) {
                        Integer numValueOf7 = Integer.valueOf(cl7.r0.indexOf(new yk7(((bl7) it4.next()).c)));
                        while (it4.hasNext()) {
                            Integer numValueOf8 = Integer.valueOf(cl7.r0.indexOf(new yk7(((bl7) it4.next()).c)));
                            if (numValueOf7.compareTo(numValueOf8) < 0) {
                                numValueOf7 = numValueOf8;
                            }
                        }
                        return numValueOf5.compareTo(numValueOf7);
                    }
                }
                bt.n();
                return 0;
            case 10:
                return dh3.m(((x08) obj).a, ((x08) obj2).a);
            case 11:
                return dh3.m(((a18) obj).a, ((a18) obj2).a);
            case FileClientSessionCache.MAX_SIZE /* 12 */:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            default:
                return dh3.m(((k79) obj).a, ((k79) obj2).a);
        }
    }
}
