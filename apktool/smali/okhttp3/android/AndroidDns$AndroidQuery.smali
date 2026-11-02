.class final Lokhttp3/android/AndroidDns$AndroidQuery;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lokhttp3/internal/dns/DnsQuery;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/android/AndroidDns;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "AndroidQuery"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\nJ\u0017\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\nJ\u000f\u0010\u0013\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0015R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lokhttp3/android/AndroidDns$AndroidQuery;",
        "Lokhttp3/internal/dns/DnsQuery;",
        "Lokhttp3/internal/dns/Question;",
        "question",
        "<init>",
        "(Lokhttp3/android/AndroidDns;Lokhttp3/internal/dns/Question;)V",
        "Lokhttp3/internal/dns/DnsQuery$Callback;",
        "callback",
        "Ldn8;",
        "resolveAddresses",
        "(Lokhttp3/internal/dns/DnsQuery$Callback;)V",
        "",
        "Ljava/net/InetAddress;",
        "addresses",
        "Lokhttp3/internal/dns/DnsMessage;",
        "response",
        "([Ljava/net/InetAddress;)Lokhttp3/internal/dns/DnsMessage;",
        "queryServiceMetadata",
        "enqueue",
        "cancel",
        "()V",
        "Lokhttp3/internal/dns/Question;",
        "Landroid/os/CancellationSignal;",
        "cancellationSignal",
        "Landroid/os/CancellationSignal;",
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
.field private final cancellationSignal:Landroid/os/CancellationSignal;

.field private final question:Lokhttp3/internal/dns/Question;

.field final synthetic this$0:Lokhttp3/android/AndroidDns;


# direct methods
.method public constructor <init>(Lokhttp3/android/AndroidDns;Lokhttp3/internal/dns/Question;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/internal/dns/Question;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lokhttp3/android/AndroidDns$AndroidQuery;->this$0:Lokhttp3/android/AndroidDns;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lokhttp3/android/AndroidDns$AndroidQuery;->question:Lokhttp3/internal/dns/Question;

    .line 10
    .line 11
    invoke-virtual {p2}, Lokhttp3/internal/dns/Question;->getType()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/16 p2, 0x41

    .line 16
    .line 17
    if-ne p1, p2, :cond_0

    .line 18
    .line 19
    new-instance p1, Landroid/os/CancellationSignal;

    .line 20
    .line 21
    invoke-direct {p1}, Landroid/os/CancellationSignal;-><init>()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    :goto_0
    iput-object p1, p0, Lokhttp3/android/AndroidDns$AndroidQuery;->cancellationSignal:Landroid/os/CancellationSignal;

    .line 27
    .line 28
    return-void
.end method

.method public static synthetic a(Lokhttp3/android/AndroidDns;Lokhttp3/android/AndroidDns$AndroidQuery;Lokhttp3/internal/dns/DnsQuery$Callback;)Ldn8;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lokhttp3/android/AndroidDns$AndroidQuery;->resolveAddresses$lambda$0(Lokhttp3/android/AndroidDns;Lokhttp3/android/AndroidDns$AndroidQuery;Lokhttp3/internal/dns/DnsQuery$Callback;)Ldn8;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Lokhttp3/internal/dns/DnsQuery$Callback;Ljava/lang/SecurityException;)Ldn8;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lokhttp3/android/AndroidDns$AndroidQuery;->queryServiceMetadata$lambda$0(Lokhttp3/internal/dns/DnsQuery$Callback;Ljava/lang/SecurityException;)Ldn8;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final queryServiceMetadata(Lokhttp3/internal/dns/DnsQuery$Callback;)V
    .locals 10

    .line 1
    new-instance v8, Lokhttp3/android/AndroidDns$AndroidQuery$queryServiceMetadata$dnsResolverCallback$1;

    .line 2
    .line 3
    invoke-direct {v8, p1}, Lokhttp3/android/AndroidDns$AndroidQuery$queryServiceMetadata$dnsResolverCallback$1;-><init>(Lokhttp3/internal/dns/DnsQuery$Callback;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Lokhttp3/android/AndroidDns$AndroidQuery;->this$0:Lokhttp3/android/AndroidDns;

    .line 7
    .line 8
    invoke-virtual {v0}, Lokhttp3/android/AndroidDns;->getDnsResolver$okhttp()Landroid/net/DnsResolver;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object v1, p0, Lokhttp3/android/AndroidDns$AndroidQuery;->this$0:Lokhttp3/android/AndroidDns;

    .line 13
    .line 14
    invoke-virtual {v1}, Lokhttp3/android/AndroidDns;->getNetwork$okhttp()Landroid/net/Network;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    iget-object v2, p0, Lokhttp3/android/AndroidDns$AndroidQuery;->question:Lokhttp3/internal/dns/Question;

    .line 19
    .line 20
    invoke-virtual {v2}, Lokhttp3/internal/dns/Question;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iget-object v3, p0, Lokhttp3/android/AndroidDns$AndroidQuery;->this$0:Lokhttp3/android/AndroidDns;

    .line 25
    .line 26
    invoke-virtual {v3}, Lokhttp3/android/AndroidDns;->getExecutor$okhttp()Ljava/util/concurrent/Executor;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    iget-object v7, p0, Lokhttp3/android/AndroidDns$AndroidQuery;->cancellationSignal:Landroid/os/CancellationSignal;

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    const/16 v4, 0x41

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    invoke-virtual/range {v0 .. v8}, Landroid/net/DnsResolver;->rawQuery(Landroid/net/Network;Ljava/lang/String;IIILjava/util/concurrent/Executor;Landroid/os/CancellationSignal;Landroid/net/DnsResolver$Callback;)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :catch_0
    move-exception v0

    .line 41
    iget-object v1, p0, Lokhttp3/android/AndroidDns$AndroidQuery;->this$0:Lokhttp3/android/AndroidDns;

    .line 42
    .line 43
    invoke-static {v1}, Lokhttp3/android/AndroidDns;->access$getTaskRunner$p(Lokhttp3/android/AndroidDns;)Lokhttp3/internal/concurrent/TaskRunner;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v1}, Lokhttp3/internal/concurrent/TaskRunner;->newQueue()Lokhttp3/internal/concurrent/TaskQueue;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    new-instance v1, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    iget-object p0, p0, Lokhttp3/android/AndroidDns$AndroidQuery;->question:Lokhttp3/internal/dns/Question;

    .line 57
    .line 58
    invoke-virtual {p0}, Lokhttp3/internal/dns/Question;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string p0, " dns"

    .line 66
    .line 67
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    new-instance v7, Lokhttp3/android/b;

    .line 75
    .line 76
    invoke-direct {v7, p1, v0}, Lokhttp3/android/b;-><init>(Lokhttp3/internal/dns/DnsQuery$Callback;Ljava/lang/SecurityException;)V

    .line 77
    .line 78
    .line 79
    const/4 v8, 0x2

    .line 80
    const/4 v9, 0x0

    .line 81
    const-wide/16 v4, 0x0

    .line 82
    .line 83
    const/4 v6, 0x0

    .line 84
    invoke-static/range {v2 .. v9}, Lokhttp3/internal/concurrent/TaskQueue;->execute$default(Lokhttp3/internal/concurrent/TaskQueue;Ljava/lang/String;JZLdn2;ILjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method private static final queryServiceMetadata$lambda$0(Lokhttp3/internal/dns/DnsQuery$Callback;Ljava/lang/SecurityException;)Ldn8;
    .locals 1

    .line 1
    new-instance v0, Ljava/io/IOException;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Lokhttp3/internal/dns/DnsQuery$Callback;->onFailure(Ljava/io/IOException;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, Ldn8;->a:Ldn8;

    .line 10
    .line 11
    return-object p0
.end method

.method private final resolveAddresses(Lokhttp3/internal/dns/DnsQuery$Callback;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lokhttp3/android/AndroidDns$AndroidQuery;->this$0:Lokhttp3/android/AndroidDns;

    .line 2
    .line 3
    invoke-static {v0}, Lokhttp3/android/AndroidDns;->access$getTaskRunner$p(Lokhttp3/android/AndroidDns;)Lokhttp3/internal/concurrent/TaskRunner;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lokhttp3/internal/concurrent/TaskRunner;->newQueue()Lokhttp3/internal/concurrent/TaskQueue;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Lokhttp3/android/AndroidDns$AndroidQuery;->question:Lokhttp3/internal/dns/Question;

    .line 17
    .line 18
    invoke-virtual {v2}, Lokhttp3/internal/dns/Question;->getName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v2, " dns"

    .line 26
    .line 27
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iget-object v0, p0, Lokhttp3/android/AndroidDns$AndroidQuery;->this$0:Lokhttp3/android/AndroidDns;

    .line 35
    .line 36
    new-instance v6, Lokhttp3/android/a;

    .line 37
    .line 38
    invoke-direct {v6, v0, p0, p1}, Lokhttp3/android/a;-><init>(Lokhttp3/android/AndroidDns;Lokhttp3/android/AndroidDns$AndroidQuery;Lokhttp3/internal/dns/DnsQuery$Callback;)V

    .line 39
    .line 40
    .line 41
    const/4 v7, 0x2

    .line 42
    const/4 v8, 0x0

    .line 43
    const-wide/16 v3, 0x0

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    invoke-static/range {v1 .. v8}, Lokhttp3/internal/concurrent/TaskQueue;->execute$default(Lokhttp3/internal/concurrent/TaskQueue;Ljava/lang/String;JZLdn2;ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method private static final resolveAddresses$lambda$0(Lokhttp3/android/AndroidDns;Lokhttp3/android/AndroidDns$AndroidQuery;Lokhttp3/internal/dns/DnsQuery$Callback;)Ldn8;
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lokhttp3/android/AndroidDns;->getNetwork$okhttp()Landroid/net/Network;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    iget-object v0, p1, Lokhttp3/android/AndroidDns$AndroidQuery;->question:Lokhttp3/internal/dns/Question;

    .line 8
    .line 9
    invoke-virtual {v0}, Lokhttp3/internal/dns/Question;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0, v0}, Landroid/net/Network;->getAllByName(Ljava/lang/String;)[Ljava/net/InetAddress;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    if-nez p0, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catch_0
    move-exception p0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    iget-object p0, p1, Lokhttp3/android/AndroidDns$AndroidQuery;->question:Lokhttp3/internal/dns/Question;

    .line 23
    .line 24
    invoke-virtual {p0}, Lokhttp3/internal/dns/Question;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Ljava/net/InetAddress;->getAllByName(Ljava/lang/String;)[Ljava/net/InetAddress;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-direct {p1, p0}, Lokhttp3/android/AndroidDns$AndroidQuery;->response([Ljava/net/InetAddress;)Lokhttp3/internal/dns/DnsMessage;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-interface {p2, p0}, Lokhttp3/internal/dns/DnsQuery$Callback;->onResponse(Lokhttp3/internal/dns/DnsMessage;)V
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    goto :goto_2

    .line 43
    :goto_1
    invoke-interface {p2, p0}, Lokhttp3/internal/dns/DnsQuery$Callback;->onFailure(Ljava/io/IOException;)V

    .line 44
    .line 45
    .line 46
    :goto_2
    sget-object p0, Ldn8;->a:Ldn8;

    .line 47
    .line 48
    return-object p0
.end method

.method private final response([Ljava/net/InetAddress;)Lokhttp3/internal/dns/DnsMessage;
    .locals 9

    .line 1
    sget-object v0, Lokhttp3/internal/dns/DnsMessage;->Companion:Lokhttp3/internal/dns/DnsMessage$Companion;

    .line 2
    .line 3
    iget-object v1, p0, Lokhttp3/android/AndroidDns$AndroidQuery;->question:Lokhttp3/internal/dns/Question;

    .line 4
    .line 5
    invoke-static {v1}, Li21;->K(Ljava/lang/Object;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    new-instance v3, Ljava/util/ArrayList;

    .line 10
    .line 11
    array-length v1, p1

    .line 12
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    array-length v1, p1

    .line 16
    const/4 v4, 0x0

    .line 17
    move v5, v4

    .line 18
    :goto_0
    if-ge v5, v1, :cond_0

    .line 19
    .line 20
    aget-object v6, p1, v5

    .line 21
    .line 22
    new-instance v7, Lokhttp3/internal/dns/ResourceRecord$IpAddress;

    .line 23
    .line 24
    iget-object v8, p0, Lokhttp3/android/AndroidDns$AndroidQuery;->question:Lokhttp3/internal/dns/Question;

    .line 25
    .line 26
    invoke-virtual {v8}, Lokhttp3/internal/dns/Question;->getName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v8

    .line 30
    invoke-direct {v7, v8, v4, v6}, Lokhttp3/internal/dns/ResourceRecord$IpAddress;-><init>(Ljava/lang/String;ILjava/net/InetAddress;)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v3, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    add-int/lit8 v5, v5, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v4, 0x1

    .line 40
    const/4 v5, 0x0

    .line 41
    const/4 v1, 0x0

    .line 42
    invoke-static/range {v0 .. v5}, Lokhttp3/internal/dns/DnsMessage$Companion;->response$default(Lokhttp3/internal/dns/DnsMessage$Companion;SLjava/util/List;Ljava/util/List;ILjava/lang/Object;)Lokhttp3/internal/dns/DnsMessage;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method


# virtual methods
.method public cancel()V
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/android/AndroidDns$AndroidQuery;->cancellationSignal:Landroid/os/CancellationSignal;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/os/CancellationSignal;->cancel()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public enqueue(Lokhttp3/internal/dns/DnsQuery$Callback;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lokhttp3/android/AndroidDns$AndroidQuery;->question:Lokhttp3/internal/dns/Question;

    .line 5
    .line 6
    invoke-virtual {v0}, Lokhttp3/internal/dns/Question;->getType()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    const/16 v1, 0x41

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    invoke-direct {p0, p1}, Lokhttp3/android/AndroidDns$AndroidQuery;->queryServiceMetadata(Lokhttp3/internal/dns/DnsQuery$Callback;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    iget-object p0, p0, Lokhttp3/android/AndroidDns$AndroidQuery;->question:Lokhttp3/internal/dns/Question;

    .line 24
    .line 25
    invoke-virtual {p0}, Lokhttp3/internal/dns/Question;->getType()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v1, "unexpected query type "

    .line 32
    .line 33
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_1
    invoke-direct {p0, p1}, Lokhttp3/android/AndroidDns$AndroidQuery;->resolveAddresses(Lokhttp3/internal/dns/DnsQuery$Callback;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method
