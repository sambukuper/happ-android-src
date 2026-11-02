package okhttp3.internal.dns;

import defpackage.bw0;
import defpackage.rj6;
import defpackage.sj6;
import defpackage.w39;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Metadata;
import okhttp3.Dns;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"execute", _UrlKt.FRAGMENT_ENCODE_SET, "Lokhttp3/Dns$Record;", "Lokhttp3/Dns$Call;", "okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class _ExecuteDnsKt {
    public static final List<Dns.Record> execute(final Dns.Call call) throws UnknownHostException {
        call.getClass();
        final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        call.enqueue(new Dns.Callback() { // from class: okhttp3.internal.dns._ExecuteDnsKt.execute.1
            private final List<Dns.Record> allRecords = new ArrayList();

            /* JADX WARN: Code duplicated, block: B:14:0x0024  */
            /* JADX WARN: Instruction removed from duplicated block: B:14:0x0024, please report this as an issue */
            private final void complete(IOException e) throws InterruptedException {
                Object rj6Var;
                List<Dns.Record> list = this.allRecords;
                if (list == null || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((Dns.Record) it.next()) instanceof Dns.Record.IpAddress) {
                            rj6Var = this.allRecords;
                        }
                    }
                    if (e == null) {
                        e = new UnknownHostException("DNS returned no addresses for " + call.getRequest().getHostname());
                    }
                    rj6Var = new rj6(e);
                } else {
                    if (e == null) {
                        e = new UnknownHostException("DNS returned no addresses for " + call.getRequest().getHostname());
                    }
                    rj6Var = new rj6(e);
                }
                linkedBlockingQueue.put(new sj6(rj6Var));
            }

            public static /* synthetic */ void complete$default(AnonymousClass1 anonymousClass1, IOException iOException, int i, Object obj) throws InterruptedException {
                if ((i & 1) != 0) {
                    iOException = null;
                }
                anonymousClass1.complete(iOException);
            }

            public final List<Dns.Record> getAllRecords() {
                return this.allRecords;
            }

            @Override // okhttp3.Dns.Callback
            public void onFailure(Dns.Call call2, IOException e) throws InterruptedException {
                call2.getClass();
                e.getClass();
                complete(e);
            }

            @Override // okhttp3.Dns.Callback
            public void onRecords(Dns.Call call2, boolean last, List<? extends Dns.Record> records) throws InterruptedException {
                call2.getClass();
                records.getClass();
                bw0.d0(this.allRecords, records);
                if (last) {
                    complete$default(this, null, 1, null);
                }
            }
        });
        Object objTake = linkedBlockingQueue.take();
        objTake.getClass();
        Object obj = ((sj6) objTake).X;
        w39.n0(obj);
        return (List) obj;
    }
}
