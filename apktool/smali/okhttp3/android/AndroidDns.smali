.class public final Lokhttp3/android/AndroidDns;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lokhttp3/Dns;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/android/AndroidDns$AndroidQuery;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u00019BI\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012B3\u0008\u0016\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0011\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00082\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001d\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010$\u001a\u0004\u0008%\u0010&R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\'\u001a\u0004\u0008(\u0010)R\u001a\u0010\t\u001a\u00020\u00088\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010*\u001a\u0004\u0008+\u0010,R\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010-\u001a\u0004\u0008.\u0010/R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u00100R\u001b\u00105\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00081\u00102\u001a\u0004\u00083\u00104R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00087\u00108\u00a8\u0006:"
    }
    d2 = {
        "Lokhttp3/android/AndroidDns;",
        "Lokhttp3/Dns;",
        "Landroid/net/DnsResolver;",
        "dnsResolver",
        "Landroid/net/Network;",
        "network",
        "Lokhttp3/DnsCache;",
        "dnsCache",
        "",
        "includeServiceMetadata",
        "Ljava/util/concurrent/Executor;",
        "executor",
        "Lokhttp3/internal/concurrent/TaskRunner;",
        "taskRunner",
        "Lg44;",
        "Landroid/security/NetworkSecurityPolicy;",
        "lazyNetworkSecurityPolicy",
        "<init>",
        "(Landroid/net/DnsResolver;Landroid/net/Network;Lokhttp3/DnsCache;ZLjava/util/concurrent/Executor;Lokhttp3/internal/concurrent/TaskRunner;Lg44;)V",
        "(Landroid/net/DnsResolver;Landroid/net/Network;Lokhttp3/DnsCache;Z)V",
        "Lokhttp3/Dns$Request;",
        "request",
        "Lokhttp3/internal/dns/StateMachineDnsCall;",
        "call",
        "(Lokhttp3/Dns$Request;Z)Lokhttp3/internal/dns/StateMachineDnsCall;",
        "includeServiceMetadataForRequest",
        "(Lokhttp3/Dns$Request;)Z",
        "",
        "hostname",
        "",
        "Ljava/net/InetAddress;",
        "lookup",
        "(Ljava/lang/String;)Ljava/util/List;",
        "Lokhttp3/Dns$Call;",
        "newCall",
        "(Lokhttp3/Dns$Request;)Lokhttp3/Dns$Call;",
        "Landroid/net/DnsResolver;",
        "getDnsResolver$okhttp",
        "()Landroid/net/DnsResolver;",
        "Landroid/net/Network;",
        "getNetwork$okhttp",
        "()Landroid/net/Network;",
        "Z",
        "getIncludeServiceMetadata$okhttp",
        "()Z",
        "Ljava/util/concurrent/Executor;",
        "getExecutor$okhttp",
        "()Ljava/util/concurrent/Executor;",
        "Lokhttp3/internal/concurrent/TaskRunner;",
        "networkSecurityPolicy$delegate",
        "Lg44;",
        "getNetworkSecurityPolicy",
        "()Landroid/security/NetworkSecurityPolicy;",
        "networkSecurityPolicy",
        "Lokhttp3/internal/dns/DnsQuery$Factory;",
        "queryFactory",
        "Lokhttp3/internal/dns/DnsQuery$Factory;",
        "AndroidQuery",
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
.field private final dnsResolver:Landroid/net/DnsResolver;

.field private final executor:Ljava/util/concurrent/Executor;

.field private final includeServiceMetadata:Z

.field private final network:Landroid/net/Network;

.field private final networkSecurityPolicy$delegate:Lg44;

.field private final queryFactory:Lokhttp3/internal/dns/DnsQuery$Factory;

.field private final taskRunner:Lokhttp3/internal/concurrent/TaskRunner;


# direct methods
.method public constructor <init>(Landroid/net/DnsResolver;Landroid/net/Network;Lokhttp3/DnsCache;Z)V
    .locals 8

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    new-instance v5, Lnd;

    const/4 v0, 0x0

    invoke-direct {v5, v0}, Lnd;-><init>(B)V

    .line 68
    sget-object v6, Lokhttp3/internal/concurrent/TaskRunner;->INSTANCE:Lokhttp3/internal/concurrent/TaskRunner;

    new-instance v0, Lx;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lx;-><init>(B)V

    .line 69
    new-instance v7, Lvz7;

    invoke-direct {v7, v0}, Lvz7;-><init>(Ldn2;)V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    .line 70
    invoke-direct/range {v0 .. v7}, Lokhttp3/android/AndroidDns;-><init>(Landroid/net/DnsResolver;Landroid/net/Network;Lokhttp3/DnsCache;ZLjava/util/concurrent/Executor;Lokhttp3/internal/concurrent/TaskRunner;Lg44;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/net/DnsResolver;Landroid/net/Network;Lokhttp3/DnsCache;ZILge1;)V
    .locals 15

    .line 1
    and-int/lit8 v0, p5, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Landroid/net/DnsResolver;->getInstance()Landroid/net/DnsResolver;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object/from16 v0, p1

    .line 14
    .line 15
    :goto_0
    and-int/lit8 v1, p5, 0x2

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move-object/from16 v1, p2

    .line 22
    .line 23
    :goto_1
    and-int/lit8 v2, p5, 0x4

    .line 24
    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    new-instance v3, Lokhttp3/DnsCache;

    .line 28
    .line 29
    const/16 v13, 0x1f

    .line 30
    .line 31
    const/4 v14, 0x0

    .line 32
    const-wide/16 v4, 0x0

    .line 33
    .line 34
    const-wide/16 v6, 0x0

    .line 35
    .line 36
    const-wide/16 v8, 0x0

    .line 37
    .line 38
    const-wide/16 v10, 0x0

    .line 39
    .line 40
    const/4 v12, 0x0

    .line 41
    invoke-direct/range {v3 .. v14}, Lokhttp3/DnsCache;-><init>(JJJJIILge1;)V

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    move-object/from16 v3, p3

    .line 46
    .line 47
    :goto_2
    and-int/lit8 v2, p5, 0x8

    .line 48
    .line 49
    if-eqz v2, :cond_3

    .line 50
    .line 51
    const/4 v2, 0x1

    .line 52
    goto :goto_3

    .line 53
    :cond_3
    move/from16 v2, p4

    .line 54
    .line 55
    :goto_3
    invoke-direct {p0, v0, v1, v3, v2}, Lokhttp3/android/AndroidDns;-><init>(Landroid/net/DnsResolver;Landroid/net/Network;Lokhttp3/DnsCache;Z)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public constructor <init>(Landroid/net/DnsResolver;Landroid/net/Network;Lokhttp3/DnsCache;ZLjava/util/concurrent/Executor;Lokhttp3/internal/concurrent/TaskRunner;Lg44;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/DnsResolver;",
            "Landroid/net/Network;",
            "Lokhttp3/DnsCache;",
            "Z",
            "Ljava/util/concurrent/Executor;",
            "Lokhttp3/internal/concurrent/TaskRunner;",
            "Lg44;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, Lokhttp3/android/AndroidDns;->dnsResolver:Landroid/net/DnsResolver;

    .line 61
    iput-object p2, p0, Lokhttp3/android/AndroidDns;->network:Landroid/net/Network;

    .line 62
    iput-boolean p4, p0, Lokhttp3/android/AndroidDns;->includeServiceMetadata:Z

    .line 63
    iput-object p5, p0, Lokhttp3/android/AndroidDns;->executor:Ljava/util/concurrent/Executor;

    .line 64
    iput-object p6, p0, Lokhttp3/android/AndroidDns;->taskRunner:Lokhttp3/internal/concurrent/TaskRunner;

    .line 65
    iput-object p7, p0, Lokhttp3/android/AndroidDns;->networkSecurityPolicy$delegate:Lg44;

    .line 66
    iget-object p1, p3, Lokhttp3/DnsCache;->-delegate:Lokhttp3/internal/dns/RealDnsCache;

    new-instance p2, Lo61;

    const/4 p3, 0x1

    invoke-direct {p2, p0, p3}, Lo61;-><init>(Ljava/lang/Object;B)V

    invoke-virtual {p1, p2}, Lokhttp3/internal/dns/RealDnsCache;->wrap(Lokhttp3/internal/dns/DnsQuery$Factory;)Lokhttp3/internal/dns/DnsQuery$Factory;

    move-result-object p1

    iput-object p1, p0, Lokhttp3/android/AndroidDns;->queryFactory:Lokhttp3/internal/dns/DnsQuery$Factory;

    return-void
.end method

.method private static final _init_$lambda$0(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final _init_$lambda$1()Landroid/security/NetworkSecurityPolicy;
    .locals 1

    .line 1
    invoke-static {}, Landroid/security/NetworkSecurityPolicy;->getInstance()Landroid/security/NetworkSecurityPolicy;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public static synthetic a()Landroid/security/NetworkSecurityPolicy;
    .locals 1

    .line 1
    invoke-static {}, Lokhttp3/android/AndroidDns;->_init_$lambda$1()Landroid/security/NetworkSecurityPolicy;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static final synthetic access$getTaskRunner$p(Lokhttp3/android/AndroidDns;)Lokhttp3/internal/concurrent/TaskRunner;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/android/AndroidDns;->taskRunner:Lokhttp3/internal/concurrent/TaskRunner;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(Lokhttp3/android/AndroidDns;Lokhttp3/internal/dns/Question;)Lokhttp3/internal/dns/DnsQuery;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lokhttp3/android/AndroidDns;->queryFactory$lambda$0(Lokhttp3/android/AndroidDns;Lokhttp3/internal/dns/Question;)Lokhttp3/internal/dns/DnsQuery;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lokhttp3/android/AndroidDns;->_init_$lambda$0(Ljava/lang/Runnable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final call(Lokhttp3/Dns$Request;Z)Lokhttp3/internal/dns/StateMachineDnsCall;
    .locals 6

    .line 1
    new-instance v0, Lokhttp3/internal/dns/StateMachineDnsCall;

    .line 2
    .line 3
    iget-object v1, p0, Lokhttp3/android/AndroidDns;->taskRunner:Lokhttp3/internal/concurrent/TaskRunner;

    .line 4
    .line 5
    iget-object v3, p0, Lokhttp3/android/AndroidDns;->queryFactory:Lokhttp3/internal/dns/DnsQuery$Factory;

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, p1}, Lokhttp3/android/AndroidDns;->includeServiceMetadataForRequest(Lokhttp3/Dns$Request;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    :goto_0
    move v5, p0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    goto :goto_0

    .line 20
    :goto_1
    const/4 v4, 0x0

    .line 21
    move-object v2, p1

    .line 22
    invoke-direct/range {v0 .. v5}, Lokhttp3/internal/dns/StateMachineDnsCall;-><init>(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Dns$Request;Lokhttp3/internal/dns/DnsQuery$Factory;ZZ)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method

.method private final getNetworkSecurityPolicy()Landroid/security/NetworkSecurityPolicy;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/android/AndroidDns;->networkSecurityPolicy$delegate:Lg44;

    .line 2
    .line 3
    invoke-interface {p0}, Lg44;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/security/NetworkSecurityPolicy;

    .line 8
    .line 9
    return-object p0
.end method

.method private final includeServiceMetadataForRequest(Lokhttp3/Dns$Request;)Z
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x25

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    invoke-direct {p0}, Lokhttp3/android/AndroidDns;->getNetworkSecurityPolicy()Landroid/security/NetworkSecurityPolicy;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p1}, Lokhttp3/Dns$Request;->hostname()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0, p1}, Landroid/security/NetworkSecurityPolicy;->getDomainEncryptionMode(Ljava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    const/4 p1, 0x2

    .line 22
    if-eq p0, p1, :cond_1

    .line 23
    .line 24
    const/4 p1, 0x3

    .line 25
    if-eq p0, p1, :cond_1

    .line 26
    .line 27
    return v2

    .line 28
    :cond_1
    const/4 p0, 0x1

    .line 29
    return p0
.end method

.method private static final queryFactory$lambda$0(Lokhttp3/android/AndroidDns;Lokhttp3/internal/dns/Question;)Lokhttp3/internal/dns/DnsQuery;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lokhttp3/android/AndroidDns$AndroidQuery;

    .line 5
    .line 6
    invoke-direct {v0, p0, p1}, Lokhttp3/android/AndroidDns$AndroidQuery;-><init>(Lokhttp3/android/AndroidDns;Lokhttp3/internal/dns/Question;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getDnsResolver$okhttp()Landroid/net/DnsResolver;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/android/AndroidDns;->dnsResolver:Landroid/net/DnsResolver;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getExecutor$okhttp()Ljava/util/concurrent/Executor;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/android/AndroidDns;->executor:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getIncludeServiceMetadata$okhttp()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lokhttp3/android/AndroidDns;->includeServiceMetadata:Z

    .line 2
    .line 3
    return p0
.end method

.method public final getNetwork$okhttp()Landroid/net/Network;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/android/AndroidDns;->network:Landroid/net/Network;

    .line 2
    .line 3
    return-object p0
.end method

.method public lookup(Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/net/InetAddress;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lokhttp3/Dns$Request;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-direct {v0, p1, v3, v1, v2}, Lokhttp3/Dns$Request;-><init>(Ljava/lang/String;IILge1;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, v0, v3}, Lokhttp3/android/AndroidDns;->call(Lokhttp3/Dns$Request;Z)Lokhttp3/internal/dns/StateMachineDnsCall;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, Lokhttp3/internal/dns/_ExecuteDnsKt;->execute(Lokhttp3/Dns$Call;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    new-instance p1, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    instance-of v1, v0, Lokhttp3/Dns$Record$IpAddress;

    .line 40
    .line 41
    if-eqz v1, :cond_0

    .line 42
    .line 43
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 48
    .line 49
    const/16 v0, 0xa

    .line 50
    .line 51
    invoke-static {p1, v0}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    check-cast v0, Lokhttp3/Dns$Record$IpAddress;

    .line 73
    .line 74
    invoke-virtual {v0}, Lokhttp3/Dns$Record$IpAddress;->address()Ljava/net/InetAddress;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-interface {p0, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    return-object p0
.end method

.method public newCall(Lokhttp3/Dns$Request;)Lokhttp3/Dns$Call;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lokhttp3/android/AndroidDns;->includeServiceMetadata:Z

    .line 5
    .line 6
    invoke-direct {p0, p1, v0}, Lokhttp3/android/AndroidDns;->call(Lokhttp3/Dns$Request;Z)Lokhttp3/internal/dns/StateMachineDnsCall;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
