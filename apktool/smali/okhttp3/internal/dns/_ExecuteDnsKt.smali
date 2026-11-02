.class public final Lokhttp3/internal/dns/_ExecuteDnsKt;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007\u00a8\u0006\u0004"
    }
    d2 = {
        "execute",
        "",
        "Lokhttp3/Dns$Record;",
        "Lokhttp3/Dns$Call;",
        "okhttp"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final execute(Lokhttp3/Dns$Call;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/Dns$Call;",
            ")",
            "Ljava/util/List<",
            "Lokhttp3/Dns$Record;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/net/UnknownHostException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lokhttp3/internal/dns/_ExecuteDnsKt$execute$1;

    .line 10
    .line 11
    invoke-direct {v1, p0, v0}, Lokhttp3/internal/dns/_ExecuteDnsKt$execute$1;-><init>(Lokhttp3/Dns$Call;Ljava/util/concurrent/LinkedBlockingQueue;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p0, v1}, Lokhttp3/Dns$Call;->enqueue(Lokhttp3/Dns$Callback;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/concurrent/LinkedBlockingQueue;->take()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    check-cast p0, Lsj6;

    .line 25
    .line 26
    iget-object p0, p0, Lsj6;->X:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    check-cast p0, Ljava/util/List;

    .line 32
    .line 33
    return-object p0
.end method
