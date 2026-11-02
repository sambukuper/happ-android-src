.class final Lokhttp3/internal/dns/RealDnsCache$CacheQuery;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lokhttp3/internal/dns/DnsQuery;
.implements Lokhttp3/internal/dns/DnsQuery$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/internal/dns/RealDnsCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "CacheQuery"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u0008\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000c2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u001f\u001a\u0004\u0008 \u0010!R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010\"\u001a\u0004\u0008#\u0010$\"\u0004\u0008%\u0010\u000e\u00a8\u0006&"
    }
    d2 = {
        "Lokhttp3/internal/dns/RealDnsCache$CacheQuery;",
        "Lokhttp3/internal/dns/DnsQuery;",
        "Lokhttp3/internal/dns/DnsQuery$Callback;",
        "Lokhttp3/internal/dns/Question;",
        "question",
        "Lokhttp3/internal/dns/DnsQuery$Factory;",
        "delegate",
        "Lokhttp3/internal/dns/RealDnsCache$Entry;",
        "entry",
        "<init>",
        "(Lokhttp3/internal/dns/RealDnsCache;Lokhttp3/internal/dns/Question;Lokhttp3/internal/dns/DnsQuery$Factory;Lokhttp3/internal/dns/RealDnsCache$Entry;)V",
        "callback",
        "Ldn8;",
        "enqueue",
        "(Lokhttp3/internal/dns/DnsQuery$Callback;)V",
        "cancel",
        "()V",
        "Lokhttp3/internal/dns/DnsMessage;",
        "dnsResponse",
        "onResponse",
        "(Lokhttp3/internal/dns/DnsMessage;)V",
        "Ljava/io/IOException;",
        "e",
        "onFailure",
        "(Ljava/io/IOException;)V",
        "Lokhttp3/internal/dns/Question;",
        "getQuestion",
        "()Lokhttp3/internal/dns/Question;",
        "Lokhttp3/internal/dns/DnsQuery$Factory;",
        "getDelegate",
        "()Lokhttp3/internal/dns/DnsQuery$Factory;",
        "Lokhttp3/internal/dns/RealDnsCache$Entry;",
        "getEntry",
        "()Lokhttp3/internal/dns/RealDnsCache$Entry;",
        "Lokhttp3/internal/dns/DnsQuery$Callback;",
        "getCallback",
        "()Lokhttp3/internal/dns/DnsQuery$Callback;",
        "setCallback",
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
.field private callback:Lokhttp3/internal/dns/DnsQuery$Callback;

.field private final delegate:Lokhttp3/internal/dns/DnsQuery$Factory;

.field private final entry:Lokhttp3/internal/dns/RealDnsCache$Entry;

.field private final question:Lokhttp3/internal/dns/Question;

.field final synthetic this$0:Lokhttp3/internal/dns/RealDnsCache;


# direct methods
.method public constructor <init>(Lokhttp3/internal/dns/RealDnsCache;Lokhttp3/internal/dns/Question;Lokhttp3/internal/dns/DnsQuery$Factory;Lokhttp3/internal/dns/RealDnsCache$Entry;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/internal/dns/Question;",
            "Lokhttp3/internal/dns/DnsQuery$Factory;",
            "Lokhttp3/internal/dns/RealDnsCache$Entry;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->this$0:Lokhttp3/internal/dns/RealDnsCache;

    .line 11
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->question:Lokhttp3/internal/dns/Question;

    .line 16
    .line 17
    iput-object p3, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->delegate:Lokhttp3/internal/dns/DnsQuery$Factory;

    .line 18
    .line 19
    iput-object p4, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->entry:Lokhttp3/internal/dns/RealDnsCache$Entry;

    .line 20
    .line 21
    return-void
.end method

.method public static synthetic a(Lokhttp3/internal/dns/RealDnsCache$CacheQuery;)Ldn8;
    .locals 0

    .line 1
    invoke-static {p0}, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->cancel$lambda$0(Lokhttp3/internal/dns/RealDnsCache$CacheQuery;)Ldn8;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Lokhttp3/internal/dns/RealDnsCache$Result;Lokhttp3/internal/dns/DnsQuery$Callback;)Ldn8;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->enqueue$lambda$1(Lokhttp3/internal/dns/RealDnsCache$Result;Lokhttp3/internal/dns/DnsQuery$Callback;)Ldn8;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final cancel$lambda$0(Lokhttp3/internal/dns/RealDnsCache$CacheQuery;)Ldn8;
    .locals 2

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->callback:Lokhttp3/internal/dns/DnsQuery$Callback;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/io/IOException;

    .line 7
    .line 8
    const-string v1, "canceled"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p0, v0}, Lokhttp3/internal/dns/DnsQuery$Callback;->onFailure(Ljava/io/IOException;)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Ldn8;->a:Ldn8;

    .line 17
    .line 18
    return-object p0
.end method

.method private static final enqueue$lambda$1(Lokhttp3/internal/dns/RealDnsCache$Result;Lokhttp3/internal/dns/DnsQuery$Callback;)Ldn8;
    .locals 1

    .line 1
    instance-of v0, p0, Lokhttp3/internal/dns/RealDnsCache$Result$Success;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lokhttp3/internal/dns/RealDnsCache$Result$Success;

    .line 6
    .line 7
    invoke-virtual {p0}, Lokhttp3/internal/dns/RealDnsCache$Result$Success;->getMessage()Lokhttp3/internal/dns/DnsMessage;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p1, p0}, Lokhttp3/internal/dns/DnsQuery$Callback;->onResponse(Lokhttp3/internal/dns/DnsMessage;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    instance-of v0, p0, Lokhttp3/internal/dns/RealDnsCache$Result$Failure;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    check-cast p0, Lokhttp3/internal/dns/RealDnsCache$Result$Failure;

    .line 20
    .line 21
    invoke-virtual {p0}, Lokhttp3/internal/dns/RealDnsCache$Result$Failure;->getException()Ljava/io/IOException;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-interface {p1, p0}, Lokhttp3/internal/dns/DnsQuery$Callback;->onFailure(Ljava/io/IOException;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    invoke-static {}, Lb61;->c()V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    return-object p0
.end method


# virtual methods
.method public cancel()V
    .locals 9

    .line 1
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->entry:Lokhttp3/internal/dns/RealDnsCache$Entry;

    .line 2
    .line 3
    invoke-virtual {v0}, Lokhttp3/internal/dns/RealDnsCache$Entry;->getState()Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    move-object v1, v0

    .line 12
    check-cast v1, Lokhttp3/internal/dns/RealDnsCache$State;

    .line 13
    .line 14
    invoke-virtual {v1}, Lokhttp3/internal/dns/RealDnsCache$State;->getInFlightCall()Lokhttp3/internal/dns/RealDnsCache$InFlightCall;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_0
    invoke-virtual {v2}, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->getQueries()Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0, p0}, Lwv0;->D0(Ljava/util/List;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-virtual {v2}, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->getQueries()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-ne v0, v3, :cond_1

    .line 42
    .line 43
    :goto_1
    return-void

    .line 44
    :cond_1
    const/4 v6, 0x3

    .line 45
    const/4 v7, 0x0

    .line 46
    const/4 v3, 0x0

    .line 47
    const/4 v4, 0x0

    .line 48
    invoke-static/range {v2 .. v7}, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->copy$default(Lokhttp3/internal/dns/RealDnsCache$InFlightCall;Lokhttp3/internal/dns/DnsQuery;Lqx0;Ljava/util/List;ILjava/lang/Object;)Lokhttp3/internal/dns/RealDnsCache$InFlightCall;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    const/4 v5, 0x5

    .line 53
    const/4 v6, 0x0

    .line 54
    const/4 v2, 0x0

    .line 55
    invoke-static/range {v1 .. v6}, Lokhttp3/internal/dns/RealDnsCache$State;->copy$default(Lokhttp3/internal/dns/RealDnsCache$State;Lqx0;Lokhttp3/internal/dns/RealDnsCache$InFlightCall;Lokhttp3/internal/dns/RealDnsCache$Result;ILjava/lang/Object;)Lokhttp3/internal/dns/RealDnsCache$State;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-object v2, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->entry:Lokhttp3/internal/dns/RealDnsCache$Entry;

    .line 60
    .line 61
    invoke-virtual {v2}, Lokhttp3/internal/dns/RealDnsCache$Entry;->getState()Ljava/util/concurrent/atomic/AtomicReference;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    :cond_2
    invoke-virtual {v2, v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-eqz v3, :cond_3

    .line 70
    .line 71
    iget-object v0, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->this$0:Lokhttp3/internal/dns/RealDnsCache;

    .line 72
    .line 73
    invoke-static {v0}, Lokhttp3/internal/dns/RealDnsCache;->access$getTaskRunner$p(Lokhttp3/internal/dns/RealDnsCache;)Lokhttp3/internal/concurrent/TaskRunner;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Lokhttp3/internal/concurrent/TaskRunner;->newQueue()Lokhttp3/internal/concurrent/TaskQueue;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    new-instance v0, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    .line 85
    .line 86
    iget-object v2, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->question:Lokhttp3/internal/dns/Question;

    .line 87
    .line 88
    invoke-virtual {v2}, Lokhttp3/internal/dns/Question;->getName()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v2, " dns"

    .line 96
    .line 97
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    new-instance v6, Lokhttp3/internal/dns/c;

    .line 105
    .line 106
    invoke-direct {v6, p0}, Lokhttp3/internal/dns/c;-><init>(Lokhttp3/internal/dns/RealDnsCache$CacheQuery;)V

    .line 107
    .line 108
    .line 109
    const/4 v7, 0x6

    .line 110
    const/4 v8, 0x0

    .line 111
    const-wide/16 v3, 0x0

    .line 112
    .line 113
    const/4 v5, 0x0

    .line 114
    invoke-static/range {v1 .. v8}, Lokhttp3/internal/concurrent/TaskQueue;->execute$default(Lokhttp3/internal/concurrent/TaskQueue;Ljava/lang/String;JZLdn2;ILjava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_3
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    if-eq v3, v1, :cond_2

    .line 123
    .line 124
    goto :goto_0
.end method

.method public enqueue(Lokhttp3/internal/dns/DnsQuery$Callback;)V
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->callback:Lokhttp3/internal/dns/DnsQuery$Callback;

    .line 5
    .line 6
    if-nez v0, :cond_a

    .line 7
    .line 8
    iput-object p1, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->callback:Lokhttp3/internal/dns/DnsQuery$Callback;

    .line 9
    .line 10
    iget-object v0, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->this$0:Lokhttp3/internal/dns/RealDnsCache;

    .line 11
    .line 12
    invoke-static {v0}, Lokhttp3/internal/dns/RealDnsCache;->access$getCache$p(Lokhttp3/internal/dns/RealDnsCache;)Lokhttp3/internal/dns/RealDnsCache$cache$1;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Lokhttp3/internal/dns/MemoryCache;->getTimeSource()Lla8;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Lla8;->F0()Lka8;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->entry:Lokhttp3/internal/dns/RealDnsCache$Entry;

    .line 25
    .line 26
    invoke-virtual {v0}, Lokhttp3/internal/dns/RealDnsCache$Entry;->getState()Ljava/util/concurrent/atomic/AtomicReference;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    move-object v1, v0

    .line 35
    check-cast v1, Lokhttp3/internal/dns/RealDnsCache$State;

    .line 36
    .line 37
    invoke-virtual {v1}, Lokhttp3/internal/dns/RealDnsCache$State;->getResult()Lokhttp3/internal/dns/RealDnsCache$Result;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v1}, Lokhttp3/internal/dns/RealDnsCache$State;->getInFlightCall()Lokhttp3/internal/dns/RealDnsCache$InFlightCall;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    invoke-interface {v0}, Lokhttp3/internal/dns/RealDnsCache$Result;->getExpireAt()Lqx0;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {v2, v4}, Lka8;->a(Lqx0;)I

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-gez v4, :cond_0

    .line 56
    .line 57
    const/4 v4, 0x1

    .line 58
    :goto_1
    move v9, v4

    .line 59
    goto :goto_2

    .line 60
    :cond_0
    const/4 v4, 0x0

    .line 61
    goto :goto_1

    .line 62
    :goto_2
    if-eqz v3, :cond_1

    .line 63
    .line 64
    if-eqz v9, :cond_1

    .line 65
    .line 66
    move-object v7, v3

    .line 67
    goto :goto_5

    .line 68
    :cond_1
    if-eqz v3, :cond_2

    .line 69
    .line 70
    invoke-virtual {v3}, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->getQueries()Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-static {v4, p0}, Lwv0;->I0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    const/4 v7, 0x3

    .line 79
    const/4 v8, 0x0

    .line 80
    const/4 v4, 0x0

    .line 81
    const/4 v5, 0x0

    .line 82
    invoke-static/range {v3 .. v8}, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->copy$default(Lokhttp3/internal/dns/RealDnsCache$InFlightCall;Lokhttp3/internal/dns/DnsQuery;Lqx0;Ljava/util/List;ILjava/lang/Object;)Lokhttp3/internal/dns/RealDnsCache$InFlightCall;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    move-object v7, v3

    .line 87
    move-object v3, v4

    .line 88
    goto :goto_5

    .line 89
    :cond_2
    move-object v7, v3

    .line 90
    if-eqz v0, :cond_4

    .line 91
    .line 92
    invoke-interface {v0}, Lokhttp3/internal/dns/RealDnsCache$Result;->getRevalidateAt()Lqx0;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {v2, v3}, Lka8;->a(Lqx0;)I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-ltz v3, :cond_3

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_3
    const/4 v3, 0x0

    .line 104
    goto :goto_5

    .line 105
    :cond_4
    :goto_3
    new-instance v3, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;

    .line 106
    .line 107
    iget-object v4, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->delegate:Lokhttp3/internal/dns/DnsQuery$Factory;

    .line 108
    .line 109
    iget-object v5, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->question:Lokhttp3/internal/dns/Question;

    .line 110
    .line 111
    invoke-interface {v4, v5}, Lokhttp3/internal/dns/DnsQuery$Factory;->newQuery(Lokhttp3/internal/dns/Question;)Lokhttp3/internal/dns/DnsQuery;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    if-eqz v9, :cond_5

    .line 116
    .line 117
    sget-object v5, Ld02;->X:Ld02;

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_5
    invoke-static {p0}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    :goto_4
    invoke-direct {v3, v4, v2, v5}, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;-><init>(Lokhttp3/internal/dns/DnsQuery;Lqx0;Ljava/util/List;)V

    .line 125
    .line 126
    .line 127
    :goto_5
    const/4 v5, 0x4

    .line 128
    const/4 v6, 0x0

    .line 129
    const/4 v4, 0x0

    .line 130
    invoke-static/range {v1 .. v6}, Lokhttp3/internal/dns/RealDnsCache$State;->copy$default(Lokhttp3/internal/dns/RealDnsCache$State;Lqx0;Lokhttp3/internal/dns/RealDnsCache$InFlightCall;Lokhttp3/internal/dns/RealDnsCache$Result;ILjava/lang/Object;)Lokhttp3/internal/dns/RealDnsCache$State;

    .line 131
    .line 132
    .line 133
    move-result-object v3

    .line 134
    iget-object v4, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->entry:Lokhttp3/internal/dns/RealDnsCache$Entry;

    .line 135
    .line 136
    invoke-virtual {v4}, Lokhttp3/internal/dns/RealDnsCache$Entry;->getState()Ljava/util/concurrent/atomic/AtomicReference;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    :cond_6
    invoke-virtual {v4, v1, v3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-eqz v5, :cond_9

    .line 145
    .line 146
    iget-object v1, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->this$0:Lokhttp3/internal/dns/RealDnsCache;

    .line 147
    .line 148
    invoke-static {v1}, Lokhttp3/internal/dns/RealDnsCache;->access$getAtomicRequestCount$p(Lokhttp3/internal/dns/RealDnsCache;)Ljava/util/concurrent/atomic/AtomicInteger;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 153
    .line 154
    .line 155
    if-nez v7, :cond_7

    .line 156
    .line 157
    invoke-virtual {v3}, Lokhttp3/internal/dns/RealDnsCache$State;->getInFlightCall()Lokhttp3/internal/dns/RealDnsCache$InFlightCall;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    if-eqz v1, :cond_7

    .line 162
    .line 163
    iget-object v1, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->this$0:Lokhttp3/internal/dns/RealDnsCache;

    .line 164
    .line 165
    invoke-static {v1}, Lokhttp3/internal/dns/RealDnsCache;->access$getAtomicNetworkCount$p(Lokhttp3/internal/dns/RealDnsCache;)Ljava/util/concurrent/atomic/AtomicInteger;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 170
    .line 171
    .line 172
    invoke-virtual {v3}, Lokhttp3/internal/dns/RealDnsCache$State;->getInFlightCall()Lokhttp3/internal/dns/RealDnsCache$InFlightCall;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-virtual {v1}, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->getQuery()Lokhttp3/internal/dns/DnsQuery;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    invoke-interface {v1, p0}, Lokhttp3/internal/dns/DnsQuery;->enqueue(Lokhttp3/internal/dns/DnsQuery$Callback;)V

    .line 181
    .line 182
    .line 183
    :cond_7
    if-eqz v9, :cond_8

    .line 184
    .line 185
    iget-object v1, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->this$0:Lokhttp3/internal/dns/RealDnsCache;

    .line 186
    .line 187
    invoke-static {v1}, Lokhttp3/internal/dns/RealDnsCache;->access$getAtomicHitCount$p(Lokhttp3/internal/dns/RealDnsCache;)Ljava/util/concurrent/atomic/AtomicInteger;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 192
    .line 193
    .line 194
    iget-object v1, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->this$0:Lokhttp3/internal/dns/RealDnsCache;

    .line 195
    .line 196
    invoke-static {v1}, Lokhttp3/internal/dns/RealDnsCache;->access$getTaskRunner$p(Lokhttp3/internal/dns/RealDnsCache;)Lokhttp3/internal/concurrent/TaskRunner;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-virtual {v1}, Lokhttp3/internal/concurrent/TaskRunner;->newQueue()Lokhttp3/internal/concurrent/TaskQueue;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    new-instance v1, Ljava/lang/StringBuilder;

    .line 205
    .line 206
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 207
    .line 208
    .line 209
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->question:Lokhttp3/internal/dns/Question;

    .line 210
    .line 211
    invoke-virtual {p0}, Lokhttp3/internal/dns/Question;->getName()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    const-string p0, " dns"

    .line 219
    .line 220
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v3

    .line 227
    new-instance v7, Lokhttp3/internal/dns/b;

    .line 228
    .line 229
    invoke-direct {v7, v0, p1}, Lokhttp3/internal/dns/b;-><init>(Lokhttp3/internal/dns/RealDnsCache$Result;Lokhttp3/internal/dns/DnsQuery$Callback;)V

    .line 230
    .line 231
    .line 232
    const/4 v8, 0x6

    .line 233
    const/4 v9, 0x0

    .line 234
    const-wide/16 v4, 0x0

    .line 235
    .line 236
    const/4 v6, 0x0

    .line 237
    invoke-static/range {v2 .. v9}, Lokhttp3/internal/concurrent/TaskQueue;->execute$default(Lokhttp3/internal/concurrent/TaskQueue;Ljava/lang/String;JZLdn2;ILjava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    :cond_8
    return-void

    .line 241
    :cond_9
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v5

    .line 245
    if-eq v5, v1, :cond_6

    .line 246
    .line 247
    goto/16 :goto_0

    .line 248
    .line 249
    :cond_a
    const-string p0, "already enqueued"

    .line 250
    .line 251
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    return-void
.end method

.method public final getCallback()Lokhttp3/internal/dns/DnsQuery$Callback;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->callback:Lokhttp3/internal/dns/DnsQuery$Callback;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getDelegate()Lokhttp3/internal/dns/DnsQuery$Factory;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->delegate:Lokhttp3/internal/dns/DnsQuery$Factory;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getEntry()Lokhttp3/internal/dns/RealDnsCache$Entry;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->entry:Lokhttp3/internal/dns/RealDnsCache$Entry;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getQuestion()Lokhttp3/internal/dns/Question;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->question:Lokhttp3/internal/dns/Question;

    .line 2
    .line 3
    return-object p0
.end method

.method public onFailure(Ljava/io/IOException;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->entry:Lokhttp3/internal/dns/RealDnsCache$Entry;

    .line 5
    .line 6
    invoke-virtual {v0}, Lokhttp3/internal/dns/RealDnsCache$Entry;->getState()Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    move-object v1, v0

    .line 15
    check-cast v1, Lokhttp3/internal/dns/RealDnsCache$State;

    .line 16
    .line 17
    invoke-virtual {v1}, Lokhttp3/internal/dns/RealDnsCache$State;->getInFlightCall()Lokhttp3/internal/dns/RealDnsCache$InFlightCall;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->getSentAt()Lqx0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iget-object v2, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->this$0:Lokhttp3/internal/dns/RealDnsCache;

    .line 29
    .line 30
    invoke-virtual {v2}, Lokhttp3/internal/dns/RealDnsCache;->getFailureTimeToLive-UwyO8pc$okhttp()J

    .line 31
    .line 32
    .line 33
    move-result-wide v2

    .line 34
    iget-object v4, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->this$0:Lokhttp3/internal/dns/RealDnsCache;

    .line 35
    .line 36
    invoke-virtual {v4}, Lokhttp3/internal/dns/RealDnsCache;->getRevalidateBeforeExpire-UwyO8pc$okhttp()J

    .line 37
    .line 38
    .line 39
    move-result-wide v4

    .line 40
    invoke-static {v4, v5}, Lgx1;->k(J)J

    .line 41
    .line 42
    .line 43
    move-result-wide v4

    .line 44
    invoke-static {v2, v3, v4, v5}, Lgx1;->i(JJ)J

    .line 45
    .line 46
    .line 47
    move-result-wide v2

    .line 48
    new-instance v4, Lgx1;

    .line 49
    .line 50
    invoke-direct {v4, v2, v3}, Lgx1;-><init>(J)V

    .line 51
    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    sget-object v3, Llx1;->f0:Llx1;

    .line 55
    .line 56
    invoke-static {v2, v3}, Lvj8;->l0(ILlx1;)J

    .line 57
    .line 58
    .line 59
    move-result-wide v2

    .line 60
    new-instance v5, Lgx1;

    .line 61
    .line 62
    invoke-direct {v5, v2, v3}, Lgx1;-><init>(J)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4, v5}, Lgx1;->compareTo(Ljava/lang/Object;)I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-gez v2, :cond_0

    .line 70
    .line 71
    move-object v4, v5

    .line 72
    :cond_0
    check-cast v0, Lka8;

    .line 73
    .line 74
    iget-wide v2, v4, Lgx1;->X:J

    .line 75
    .line 76
    invoke-virtual {v0, v2, v3}, Lka8;->d(J)Lka8;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    iget-object v3, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->this$0:Lokhttp3/internal/dns/RealDnsCache;

    .line 81
    .line 82
    invoke-virtual {v3}, Lokhttp3/internal/dns/RealDnsCache;->getFailureTimeToLive-UwyO8pc$okhttp()J

    .line 83
    .line 84
    .line 85
    move-result-wide v3

    .line 86
    invoke-virtual {v0, v3, v4}, Lka8;->d(J)Lka8;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    new-instance v4, Lokhttp3/internal/dns/RealDnsCache$Result$Failure;

    .line 91
    .line 92
    invoke-direct {v4, v2, v0, p1}, Lokhttp3/internal/dns/RealDnsCache$Result$Failure;-><init>(Lqx0;Lqx0;Ljava/io/IOException;)V

    .line 93
    .line 94
    .line 95
    const/4 v5, 0x1

    .line 96
    const/4 v6, 0x0

    .line 97
    const/4 v2, 0x0

    .line 98
    const/4 v3, 0x0

    .line 99
    invoke-static/range {v1 .. v6}, Lokhttp3/internal/dns/RealDnsCache$State;->copy$default(Lokhttp3/internal/dns/RealDnsCache$State;Lqx0;Lokhttp3/internal/dns/RealDnsCache$InFlightCall;Lokhttp3/internal/dns/RealDnsCache$Result;ILjava/lang/Object;)Lokhttp3/internal/dns/RealDnsCache$State;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    iget-object v2, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->entry:Lokhttp3/internal/dns/RealDnsCache$Entry;

    .line 104
    .line 105
    invoke-virtual {v2}, Lokhttp3/internal/dns/RealDnsCache$Entry;->getState()Ljava/util/concurrent/atomic/AtomicReference;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    :cond_1
    invoke-virtual {v2, v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-eqz v3, :cond_3

    .line 114
    .line 115
    invoke-virtual {v1}, Lokhttp3/internal/dns/RealDnsCache$State;->getInFlightCall()Lokhttp3/internal/dns/RealDnsCache$InFlightCall;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-virtual {p0}, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->getQueries()Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v0

    .line 131
    if-eqz v0, :cond_2

    .line 132
    .line 133
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    check-cast v0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;

    .line 138
    .line 139
    iget-object v0, v0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->callback:Lokhttp3/internal/dns/DnsQuery$Callback;

    .line 140
    .line 141
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-interface {v0, p1}, Lokhttp3/internal/dns/DnsQuery$Callback;->onFailure(Ljava/io/IOException;)V

    .line 145
    .line 146
    .line 147
    goto :goto_1

    .line 148
    :cond_2
    return-void

    .line 149
    :cond_3
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    if-eq v3, v1, :cond_1

    .line 154
    .line 155
    goto/16 :goto_0
.end method

.method public onResponse(Lokhttp3/internal/dns/DnsMessage;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->entry:Lokhttp3/internal/dns/RealDnsCache$Entry;

    .line 5
    .line 6
    invoke-virtual {v0}, Lokhttp3/internal/dns/RealDnsCache$Entry;->getState()Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    move-object v1, v0

    .line 15
    check-cast v1, Lokhttp3/internal/dns/RealDnsCache$State;

    .line 16
    .line 17
    invoke-virtual {v1}, Lokhttp3/internal/dns/RealDnsCache$State;->getInFlightCall()Lokhttp3/internal/dns/RealDnsCache$InFlightCall;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->getSentAt()Lqx0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p1}, Lokhttp3/internal/dns/DnsMessage;->getAnswers()Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    sget-object v3, Llx1;->f0:Llx1;

    .line 37
    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    iget-object v2, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->this$0:Lokhttp3/internal/dns/RealDnsCache;

    .line 41
    .line 42
    invoke-virtual {v2}, Lokhttp3/internal/dns/RealDnsCache;->getFailureTimeToLive-UwyO8pc$okhttp()J

    .line 43
    .line 44
    .line 45
    move-result-wide v4

    .line 46
    goto :goto_3

    .line 47
    :cond_0
    sget-object v2, Lgx1;->Y:Lbe;

    .line 48
    .line 49
    invoke-virtual {p1}, Lokhttp3/internal/dns/DnsMessage;->getAnswers()Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-eqz v4, :cond_a

    .line 62
    .line 63
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    check-cast v4, Lokhttp3/internal/dns/ResourceRecord;

    .line 68
    .line 69
    invoke-interface {v4}, Lokhttp3/internal/dns/ResourceRecord;->getTimeToLive()I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-eqz v5, :cond_2

    .line 78
    .line 79
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    check-cast v5, Lokhttp3/internal/dns/ResourceRecord;

    .line 84
    .line 85
    invoke-interface {v5}, Lokhttp3/internal/dns/ResourceRecord;->getTimeToLive()I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-le v4, v5, :cond_1

    .line 90
    .line 91
    move v4, v5

    .line 92
    goto :goto_1

    .line 93
    :cond_2
    invoke-static {v4, v3}, Lvj8;->l0(ILlx1;)J

    .line 94
    .line 95
    .line 96
    move-result-wide v4

    .line 97
    new-instance v2, Lgx1;

    .line 98
    .line 99
    invoke-direct {v2, v4, v5}, Lgx1;-><init>(J)V

    .line 100
    .line 101
    .line 102
    iget-object v4, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->this$0:Lokhttp3/internal/dns/RealDnsCache;

    .line 103
    .line 104
    invoke-virtual {v4}, Lokhttp3/internal/dns/RealDnsCache;->getMinimumTimeToLive-UwyO8pc$okhttp()J

    .line 105
    .line 106
    .line 107
    move-result-wide v4

    .line 108
    new-instance v6, Lgx1;

    .line 109
    .line 110
    invoke-direct {v6, v4, v5}, Lgx1;-><init>(J)V

    .line 111
    .line 112
    .line 113
    iget-object v4, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->this$0:Lokhttp3/internal/dns/RealDnsCache;

    .line 114
    .line 115
    invoke-virtual {v4}, Lokhttp3/internal/dns/RealDnsCache;->getMaximumTimeToLive-UwyO8pc$okhttp()J

    .line 116
    .line 117
    .line 118
    move-result-wide v4

    .line 119
    new-instance v7, Lgx1;

    .line 120
    .line 121
    invoke-direct {v7, v4, v5}, Lgx1;-><init>(J)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v6, v7}, Lgx1;->compareTo(Ljava/lang/Object;)I

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-gtz v4, :cond_9

    .line 129
    .line 130
    invoke-virtual {v2, v6}, Lgx1;->compareTo(Ljava/lang/Object;)I

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    if-gez v4, :cond_3

    .line 135
    .line 136
    move-object v2, v6

    .line 137
    goto :goto_2

    .line 138
    :cond_3
    invoke-virtual {v2, v7}, Lgx1;->compareTo(Ljava/lang/Object;)I

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    if-lez v4, :cond_4

    .line 143
    .line 144
    move-object v2, v7

    .line 145
    :cond_4
    :goto_2
    iget-wide v4, v2, Lgx1;->X:J

    .line 146
    .line 147
    :goto_3
    iget-object v2, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->this$0:Lokhttp3/internal/dns/RealDnsCache;

    .line 148
    .line 149
    invoke-virtual {v2}, Lokhttp3/internal/dns/RealDnsCache;->getRevalidateBeforeExpire-UwyO8pc$okhttp()J

    .line 150
    .line 151
    .line 152
    move-result-wide v6

    .line 153
    invoke-static {v6, v7}, Lgx1;->k(J)J

    .line 154
    .line 155
    .line 156
    move-result-wide v6

    .line 157
    invoke-static {v4, v5, v6, v7}, Lgx1;->i(JJ)J

    .line 158
    .line 159
    .line 160
    move-result-wide v6

    .line 161
    new-instance v2, Lgx1;

    .line 162
    .line 163
    invoke-direct {v2, v6, v7}, Lgx1;-><init>(J)V

    .line 164
    .line 165
    .line 166
    const/4 v6, 0x0

    .line 167
    invoke-static {v6, v3}, Lvj8;->l0(ILlx1;)J

    .line 168
    .line 169
    .line 170
    move-result-wide v6

    .line 171
    new-instance v3, Lgx1;

    .line 172
    .line 173
    invoke-direct {v3, v6, v7}, Lgx1;-><init>(J)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2, v3}, Lgx1;->compareTo(Ljava/lang/Object;)I

    .line 177
    .line 178
    .line 179
    move-result v6

    .line 180
    if-gez v6, :cond_5

    .line 181
    .line 182
    move-object v2, v3

    .line 183
    :cond_5
    check-cast v0, Lka8;

    .line 184
    .line 185
    iget-wide v2, v2, Lgx1;->X:J

    .line 186
    .line 187
    invoke-virtual {v0, v2, v3}, Lka8;->d(J)Lka8;

    .line 188
    .line 189
    .line 190
    move-result-object v2

    .line 191
    invoke-virtual {v0, v4, v5}, Lka8;->d(J)Lka8;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    new-instance v4, Lokhttp3/internal/dns/RealDnsCache$Result$Success;

    .line 196
    .line 197
    invoke-direct {v4, v2, v0, p1}, Lokhttp3/internal/dns/RealDnsCache$Result$Success;-><init>(Lqx0;Lqx0;Lokhttp3/internal/dns/DnsMessage;)V

    .line 198
    .line 199
    .line 200
    const/4 v5, 0x1

    .line 201
    const/4 v6, 0x0

    .line 202
    const/4 v2, 0x0

    .line 203
    const/4 v3, 0x0

    .line 204
    invoke-static/range {v1 .. v6}, Lokhttp3/internal/dns/RealDnsCache$State;->copy$default(Lokhttp3/internal/dns/RealDnsCache$State;Lqx0;Lokhttp3/internal/dns/RealDnsCache$InFlightCall;Lokhttp3/internal/dns/RealDnsCache$Result;ILjava/lang/Object;)Lokhttp3/internal/dns/RealDnsCache$State;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    iget-object v2, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->entry:Lokhttp3/internal/dns/RealDnsCache$Entry;

    .line 209
    .line 210
    invoke-virtual {v2}, Lokhttp3/internal/dns/RealDnsCache$Entry;->getState()Ljava/util/concurrent/atomic/AtomicReference;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    :cond_6
    invoke-virtual {v2, v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    if-eqz v3, :cond_8

    .line 219
    .line 220
    invoke-virtual {v1}, Lokhttp3/internal/dns/RealDnsCache$State;->getInFlightCall()Lokhttp3/internal/dns/RealDnsCache$InFlightCall;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    invoke-virtual {p0}, Lokhttp3/internal/dns/RealDnsCache$InFlightCall;->getQueries()Ljava/util/List;

    .line 225
    .line 226
    .line 227
    move-result-object p0

    .line 228
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 229
    .line 230
    .line 231
    move-result-object p0

    .line 232
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    if-eqz v0, :cond_7

    .line 237
    .line 238
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    check-cast v0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;

    .line 243
    .line 244
    iget-object v0, v0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->callback:Lokhttp3/internal/dns/DnsQuery$Callback;

    .line 245
    .line 246
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    invoke-interface {v0, p1}, Lokhttp3/internal/dns/DnsQuery$Callback;->onResponse(Lokhttp3/internal/dns/DnsMessage;)V

    .line 250
    .line 251
    .line 252
    goto :goto_4

    .line 253
    :cond_7
    return-void

    .line 254
    :cond_8
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v3

    .line 258
    if-eq v3, v1, :cond_6

    .line 259
    .line 260
    goto/16 :goto_0

    .line 261
    .line 262
    :cond_9
    const-string p0, " is less than minimum "

    .line 263
    .line 264
    const/16 p1, 0x2e

    .line 265
    .line 266
    const-string v0, "Cannot coerce value to an empty range: maximum "

    .line 267
    .line 268
    invoke-static {v0, v7, p0, v6, p1}, Lbt;->k(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 269
    .line 270
    .line 271
    return-void

    .line 272
    :cond_a
    invoke-static {}, Lbt;->n()V

    .line 273
    .line 274
    .line 275
    return-void
.end method

.method public final setCallback(Lokhttp3/internal/dns/DnsQuery$Callback;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lokhttp3/internal/dns/RealDnsCache$CacheQuery;->callback:Lokhttp3/internal/dns/DnsQuery$Callback;

    .line 2
    .line 3
    return-void
.end method
