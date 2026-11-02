.class final Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory$ResolveUnsupportedQuery;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lokhttp3/internal/dns/DnsQuery;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "ResolveUnsupportedQuery"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000eR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory$ResolveUnsupportedQuery;",
        "Lokhttp3/internal/dns/DnsQuery;",
        "",
        "hostname",
        "message",
        "<init>",
        "(Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;Ljava/lang/String;Ljava/lang/String;)V",
        "Lokhttp3/internal/dns/DnsQuery$Callback;",
        "callback",
        "Ldn8;",
        "enqueue",
        "(Lokhttp3/internal/dns/DnsQuery$Callback;)V",
        "cancel",
        "()V",
        "Ljava/lang/String;",
        "okhttp-dnsoverhttps"
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
.field private final hostname:Ljava/lang/String;

.field private final message:Ljava/lang/String;

.field final synthetic this$0:Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;


# direct methods
.method public constructor <init>(Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
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
    iput-object p1, p0, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory$ResolveUnsupportedQuery;->this$0:Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p2, p0, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory$ResolveUnsupportedQuery;->hostname:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p3, p0, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory$ResolveUnsupportedQuery;->message:Ljava/lang/String;

    .line 15
    .line 16
    return-void
.end method

.method public static synthetic a(Lokhttp3/internal/dns/DnsQuery$Callback;Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory$ResolveUnsupportedQuery;)Ldn8;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory$ResolveUnsupportedQuery;->enqueue$lambda$0(Lokhttp3/internal/dns/DnsQuery$Callback;Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory$ResolveUnsupportedQuery;)Ldn8;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final enqueue$lambda$0(Lokhttp3/internal/dns/DnsQuery$Callback;Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory$ResolveUnsupportedQuery;)Ldn8;
    .locals 1

    .line 1
    new-instance v0, Ljava/net/UnknownHostException;

    .line 2
    .line 3
    iget-object p1, p1, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory$ResolveUnsupportedQuery;->message:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, v0}, Lokhttp3/internal/dns/DnsQuery$Callback;->onFailure(Ljava/io/IOException;)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    return-object p0
.end method


# virtual methods
.method public cancel()V
    .locals 0

    .line 1
    return-void
.end method

.method public enqueue(Lokhttp3/internal/dns/DnsQuery$Callback;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory$ResolveUnsupportedQuery;->this$0:Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;

    .line 5
    .line 6
    invoke-static {v0}, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;->access$getTaskRunner$p(Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory;)Lokhttp3/internal/concurrent/TaskRunner;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lokhttp3/internal/concurrent/TaskRunner;->newQueue()Lokhttp3/internal/concurrent/TaskQueue;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory$ResolveUnsupportedQuery;->hostname:Ljava/lang/String;

    .line 20
    .line 21
    const-string v3, " dns"

    .line 22
    .line 23
    invoke-static {v0, v2, v3}, Loi0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    new-instance v6, Lokhttp3/dnsoverhttps/internal/a;

    .line 28
    .line 29
    invoke-direct {v6, p1, p0}, Lokhttp3/dnsoverhttps/internal/a;-><init>(Lokhttp3/internal/dns/DnsQuery$Callback;Lokhttp3/dnsoverhttps/internal/DnsOverHttpsQuery$Factory$ResolveUnsupportedQuery;)V

    .line 30
    .line 31
    .line 32
    const/4 v7, 0x6

    .line 33
    const/4 v8, 0x0

    .line 34
    const-wide/16 v3, 0x0

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    invoke-static/range {v1 .. v8}, Lokhttp3/internal/concurrent/TaskQueue;->execute$default(Lokhttp3/internal/concurrent/TaskQueue;Ljava/lang/String;JZLdn2;ILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method
