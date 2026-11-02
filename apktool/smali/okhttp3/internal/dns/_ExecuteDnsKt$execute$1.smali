.class public final Lokhttp3/internal/dns/_ExecuteDnsKt$execute$1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lokhttp3/Dns$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lokhttp3/internal/dns/_ExecuteDnsKt;->execute(Lokhttp3/Dns$Call;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010!\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J-\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u001d\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "okhttp3/internal/dns/_ExecuteDnsKt$execute$1",
        "Lokhttp3/Dns$Callback;",
        "Ljava/io/IOException;",
        "e",
        "Ldn8;",
        "complete",
        "(Ljava/io/IOException;)V",
        "Lokhttp3/Dns$Call;",
        "call",
        "",
        "last",
        "",
        "Lokhttp3/Dns$Record;",
        "records",
        "onRecords",
        "(Lokhttp3/Dns$Call;ZLjava/util/List;)V",
        "onFailure",
        "(Lokhttp3/Dns$Call;Ljava/io/IOException;)V",
        "",
        "allRecords",
        "Ljava/util/List;",
        "getAllRecords",
        "()Ljava/util/List;",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $queue:Ljava/util/concurrent/LinkedBlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "Lsj6;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $this_execute:Lokhttp3/Dns$Call;

.field private final allRecords:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokhttp3/Dns$Record;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lokhttp3/Dns$Call;Ljava/util/concurrent/LinkedBlockingQueue;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/Dns$Call;",
            "Ljava/util/concurrent/LinkedBlockingQueue<",
            "Lsj6;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lokhttp3/internal/dns/_ExecuteDnsKt$execute$1;->$this_execute:Lokhttp3/Dns$Call;

    .line 2
    .line 3
    iput-object p2, p0, Lokhttp3/internal/dns/_ExecuteDnsKt$execute$1;->$queue:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance p1, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lokhttp3/internal/dns/_ExecuteDnsKt$execute$1;->allRecords:Ljava/util/List;

    .line 14
    .line 15
    return-void
.end method

.method private final complete(Ljava/io/IOException;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lokhttp3/internal/dns/_ExecuteDnsKt$execute$1;->allRecords:Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, Lokhttp3/Dns$Record;

    .line 27
    .line 28
    instance-of v1, v1, Lokhttp3/Dns$Record$IpAddress;

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    iget-object p1, p0, Lokhttp3/internal/dns/_ExecuteDnsKt$execute$1;->allRecords:Ljava/util/List;

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_2
    :goto_0
    if-nez p1, :cond_3

    .line 36
    .line 37
    new-instance p1, Ljava/net/UnknownHostException;

    .line 38
    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v1, "DNS returned no addresses for "

    .line 42
    .line 43
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Lokhttp3/internal/dns/_ExecuteDnsKt$execute$1;->$this_execute:Lokhttp3/Dns$Call;

    .line 47
    .line 48
    invoke-interface {v1}, Lokhttp3/Dns$Call;->getRequest()Lokhttp3/Dns$Request;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v1}, Lokhttp3/Dns$Request;->hostname()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-direct {p1, v0}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :cond_3
    new-instance v0, Lrj6;

    .line 67
    .line 68
    invoke-direct {v0, p1}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    move-object p1, v0

    .line 72
    :goto_1
    iget-object p0, p0, Lokhttp3/internal/dns/_ExecuteDnsKt$execute$1;->$queue:Ljava/util/concurrent/LinkedBlockingQueue;

    .line 73
    .line 74
    new-instance v0, Lsj6;

    .line 75
    .line 76
    invoke-direct {v0, p1}, Lsj6;-><init>(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v0}, Ljava/util/concurrent/LinkedBlockingQueue;->put(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public static synthetic complete$default(Lokhttp3/internal/dns/_ExecuteDnsKt$execute$1;Ljava/io/IOException;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1}, Lokhttp3/internal/dns/_ExecuteDnsKt$execute$1;->complete(Ljava/io/IOException;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final getAllRecords()Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lokhttp3/Dns$Record;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/_ExecuteDnsKt$execute$1;->allRecords:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public onFailure(Lokhttp3/Dns$Call;Ljava/io/IOException;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p2}, Lokhttp3/internal/dns/_ExecuteDnsKt$execute$1;->complete(Ljava/io/IOException;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public onRecords(Lokhttp3/Dns$Call;ZLjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/Dns$Call;",
            "Z",
            "Ljava/util/List<",
            "+",
            "Lokhttp3/Dns$Record;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, Lokhttp3/internal/dns/_ExecuteDnsKt$execute$1;->allRecords:Ljava/util/List;

    .line 8
    .line 9
    invoke-static {p1, p3}, Lbw0;->d0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 10
    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-static {p0, p2, p1, p2}, Lokhttp3/internal/dns/_ExecuteDnsKt$execute$1;->complete$default(Lokhttp3/internal/dns/_ExecuteDnsKt$execute$1;Ljava/io/IOException;ILjava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method
