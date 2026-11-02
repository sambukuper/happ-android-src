.class public final Lokhttp3/internal/dns/LookupDnsCall;
.super Lokhttp3/internal/concurrent/Task;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lokhttp3/Dns$Call;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/dns/LookupDnsCall$State;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001!B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0019R\u001a\u0010\u0008\u001a\u00020\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Lokhttp3/internal/dns/LookupDnsCall;",
        "Lokhttp3/internal/concurrent/Task;",
        "Lokhttp3/Dns$Call;",
        "Lokhttp3/internal/concurrent/TaskRunner;",
        "taskRunner",
        "Lokhttp3/Dns;",
        "delegate",
        "Lokhttp3/Dns$Request;",
        "request",
        "<init>",
        "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Dns;Lokhttp3/Dns$Request;)V",
        "Lokhttp3/Dns$Callback;",
        "callback",
        "Ldn8;",
        "enqueue",
        "(Lokhttp3/Dns$Callback;)V",
        "cancel",
        "()V",
        "",
        "isCanceled",
        "()Z",
        "",
        "runOnce",
        "()J",
        "Lokhttp3/internal/concurrent/TaskRunner;",
        "Lokhttp3/Dns;",
        "Lokhttp3/Dns$Request;",
        "getRequest",
        "()Lokhttp3/Dns$Request;",
        "Ljava/util/concurrent/atomic/AtomicReference;",
        "Lokhttp3/internal/dns/LookupDnsCall$State;",
        "state",
        "Ljava/util/concurrent/atomic/AtomicReference;",
        "State",
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
.field private final delegate:Lokhttp3/Dns;

.field private final request:Lokhttp3/Dns$Request;

.field private final state:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lokhttp3/internal/dns/LookupDnsCall$State;",
            ">;"
        }
    .end annotation
.end field

.field private final taskRunner:Lokhttp3/internal/concurrent/TaskRunner;


# direct methods
.method public constructor <init>(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Dns;Lokhttp3/Dns$Request;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p3}, Lokhttp3/Dns$Request;->hostname()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, " dns"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const/4 v1, 0x0

    .line 32
    invoke-direct {p0, v0, v1}, Lokhttp3/internal/concurrent/Task;-><init>(Ljava/lang/String;Z)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lokhttp3/internal/dns/LookupDnsCall;->taskRunner:Lokhttp3/internal/concurrent/TaskRunner;

    .line 36
    .line 37
    iput-object p2, p0, Lokhttp3/internal/dns/LookupDnsCall;->delegate:Lokhttp3/Dns;

    .line 38
    .line 39
    iput-object p3, p0, Lokhttp3/internal/dns/LookupDnsCall;->request:Lokhttp3/Dns$Request;

    .line 40
    .line 41
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 42
    .line 43
    sget-object p2, Lokhttp3/internal/dns/LookupDnsCall$State$Idle;->INSTANCE:Lokhttp3/internal/dns/LookupDnsCall$State$Idle;

    .line 44
    .line 45
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Lokhttp3/internal/dns/LookupDnsCall;->state:Ljava/util/concurrent/atomic/AtomicReference;

    .line 49
    .line 50
    return-void
.end method

.method public static synthetic a(Lokhttp3/internal/dns/LookupDnsCall$State;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lokhttp3/internal/dns/LookupDnsCall;->runOnce$lambda$0(Lokhttp3/internal/dns/LookupDnsCall$State;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic b(Lokhttp3/internal/dns/LookupDnsCall$State;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lokhttp3/internal/dns/LookupDnsCall;->runOnce$lambda$2(Lokhttp3/internal/dns/LookupDnsCall$State;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic c(Lokhttp3/internal/dns/LookupDnsCall$State;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lokhttp3/internal/dns/LookupDnsCall;->cancel$lambda$0(Lokhttp3/internal/dns/LookupDnsCall$State;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final cancel$lambda$0(Lokhttp3/internal/dns/LookupDnsCall$State;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p0, Lokhttp3/internal/dns/LookupDnsCall$State$Running;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    sget-object v0, Lokhttp3/internal/dns/LookupDnsCall$State$Idle;->INSTANCE:Lokhttp3/internal/dns/LookupDnsCall$State$Idle;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0

    .line 19
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 20
    return p0
.end method

.method public static synthetic d(Lokhttp3/internal/dns/LookupDnsCall$State;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lokhttp3/internal/dns/LookupDnsCall;->enqueue$lambda$0(Lokhttp3/internal/dns/LookupDnsCall$State;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final enqueue$lambda$0(Lokhttp3/internal/dns/LookupDnsCall$State;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of p0, p0, Lokhttp3/internal/dns/LookupDnsCall$State$Idle;

    .line 5
    .line 6
    return p0
.end method

.method private static final runOnce$lambda$0(Lokhttp3/internal/dns/LookupDnsCall$State;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of p0, p0, Lokhttp3/internal/dns/LookupDnsCall$State$Running;

    .line 5
    .line 6
    return p0
.end method

.method private static final runOnce$lambda$2(Lokhttp3/internal/dns/LookupDnsCall$State;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of p0, p0, Lokhttp3/internal/dns/LookupDnsCall$State$Running;

    .line 5
    .line 6
    return p0
.end method


# virtual methods
.method public cancel()V
    .locals 4

    .line 1
    iget-object v0, p0, Lokhttp3/internal/dns/LookupDnsCall;->state:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    sget-object v1, Lokhttp3/internal/dns/LookupDnsCall$State$Canceled;->INSTANCE:Lokhttp3/internal/dns/LookupDnsCall$State$Canceled;

    .line 4
    .line 5
    new-instance v2, Lokhttp3/internal/dns/a;

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    invoke-direct {v2, v3}, Lokhttp3/internal/dns/a;-><init>(B)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, v2}, Lokhttp3/internal/_UtilJvmKt;->testAndSet(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Lgn2;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Lokhttp3/internal/dns/LookupDnsCall$State;

    .line 16
    .line 17
    instance-of v1, v0, Lokhttp3/internal/dns/LookupDnsCall$State$Running;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    check-cast v0, Lokhttp3/internal/dns/LookupDnsCall$State$Running;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0}, Lokhttp3/internal/dns/LookupDnsCall$State$Running;->getCallback()Lokhttp3/Dns$Callback;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    new-instance v1, Ljava/io/IOException;

    .line 34
    .line 35
    const-string v2, "canceled"

    .line 36
    .line 37
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, p0, v1}, Lokhttp3/Dns$Callback;->onFailure(Lokhttp3/Dns$Call;Ljava/io/IOException;)V

    .line 41
    .line 42
    .line 43
    :cond_1
    return-void
.end method

.method public enqueue(Lokhttp3/Dns$Callback;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lokhttp3/internal/dns/LookupDnsCall;->state:Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    new-instance v1, Lokhttp3/internal/dns/LookupDnsCall$State$Running;

    .line 7
    .line 8
    invoke-direct {v1, p1}, Lokhttp3/internal/dns/LookupDnsCall$State$Running;-><init>(Lokhttp3/Dns$Callback;)V

    .line 9
    .line 10
    .line 11
    new-instance v2, Lokhttp3/internal/dns/a;

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v2, v3}, Lokhttp3/internal/dns/a;-><init>(B)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, v2}, Lokhttp3/internal/_UtilJvmKt;->testAndSet(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Lgn2;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lokhttp3/internal/dns/LookupDnsCall$State;

    .line 22
    .line 23
    instance-of v1, v0, Lokhttp3/internal/dns/LookupDnsCall$State$Idle;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    iget-object p1, p0, Lokhttp3/internal/dns/LookupDnsCall;->taskRunner:Lokhttp3/internal/concurrent/TaskRunner;

    .line 28
    .line 29
    invoke-virtual {p1}, Lokhttp3/internal/concurrent/TaskRunner;->newQueue()Lokhttp3/internal/concurrent/TaskQueue;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v4, 0x2

    .line 34
    const/4 v5, 0x0

    .line 35
    const-wide/16 v2, 0x0

    .line 36
    .line 37
    move-object v1, p0

    .line 38
    invoke-static/range {v0 .. v5}, Lokhttp3/internal/concurrent/TaskQueue;->schedule$default(Lokhttp3/internal/concurrent/TaskQueue;Lokhttp3/internal/concurrent/Task;JILjava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_0
    move-object v1, p0

    .line 43
    instance-of p0, v0, Lokhttp3/internal/dns/LookupDnsCall$State$Running;

    .line 44
    .line 45
    if-nez p0, :cond_2

    .line 46
    .line 47
    sget-object p0, Lokhttp3/internal/dns/LookupDnsCall$State$Complete;->INSTANCE:Lokhttp3/internal/dns/LookupDnsCall$State$Complete;

    .line 48
    .line 49
    invoke-static {v0, p0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-nez p0, :cond_2

    .line 54
    .line 55
    sget-object p0, Lokhttp3/internal/dns/LookupDnsCall$State$Canceled;->INSTANCE:Lokhttp3/internal/dns/LookupDnsCall$State$Canceled;

    .line 56
    .line 57
    invoke-static {v0, p0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-eqz p0, :cond_1

    .line 62
    .line 63
    new-instance p0, Ljava/io/IOException;

    .line 64
    .line 65
    const-string v0, "canceled"

    .line 66
    .line 67
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {p1, v1, p0}, Lokhttp3/Dns$Callback;->onFailure(Lokhttp3/Dns$Call;Ljava/io/IOException;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_1
    invoke-static {}, Lb61;->c()V

    .line 75
    .line 76
    .line 77
    return-void

    .line 78
    :cond_2
    const-string p0, "already enqueued"

    .line 79
    .line 80
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public getRequest()Lokhttp3/Dns$Request;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/LookupDnsCall;->request:Lokhttp3/Dns$Request;

    .line 2
    .line 3
    return-object p0
.end method

.method public isCanceled()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/LookupDnsCall;->state:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    instance-of p0, p0, Lokhttp3/internal/dns/LookupDnsCall$State$Canceled;

    .line 8
    .line 9
    return p0
.end method

.method public runOnce()J
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Lokhttp3/internal/dns/LookupDnsCall;->delegate:Lokhttp3/Dns;

    .line 3
    .line 4
    invoke-virtual {p0}, Lokhttp3/internal/dns/LookupDnsCall;->getRequest()Lokhttp3/Dns$Request;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    invoke-virtual {v2}, Lokhttp3/Dns$Request;->hostname()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-interface {v1, v2}, Lokhttp3/Dns;->lookup(Ljava/lang/String;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v2, p0, Lokhttp3/internal/dns/LookupDnsCall;->state:Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    sget-object v3, Lokhttp3/internal/dns/LookupDnsCall$State$Complete;->INSTANCE:Lokhttp3/internal/dns/LookupDnsCall$State$Complete;

    .line 19
    .line 20
    new-instance v4, Lokhttp3/internal/dns/a;

    .line 21
    .line 22
    const/4 v5, 0x1

    .line 23
    invoke-direct {v4, v5}, Lokhttp3/internal/dns/a;-><init>(B)V

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v3, v4}, Lokhttp3/internal/_UtilJvmKt;->testAndSet(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Lgn2;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Lokhttp3/internal/dns/LookupDnsCall$State;

    .line 31
    .line 32
    instance-of v3, v2, Lokhttp3/internal/dns/LookupDnsCall$State$Running;

    .line 33
    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    check-cast v2, Lokhttp3/internal/dns/LookupDnsCall$State$Running;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catch_0
    move-exception v1

    .line 40
    goto :goto_2

    .line 41
    :cond_0
    move-object v2, v0

    .line 42
    :goto_0
    if-eqz v2, :cond_3

    .line 43
    .line 44
    invoke-virtual {v2}, Lokhttp3/internal/dns/LookupDnsCall$State$Running;->getCallback()Lokhttp3/Dns$Callback;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    if-eqz v2, :cond_3

    .line 49
    .line 50
    new-instance v3, Ljava/util/ArrayList;

    .line 51
    .line 52
    const/16 v4, 0xa

    .line 53
    .line 54
    invoke-static {v1, v4}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 59
    .line 60
    .line 61
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_1

    .line 70
    .line 71
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    check-cast v4, Ljava/net/InetAddress;

    .line 76
    .line 77
    new-instance v6, Lokhttp3/Dns$Record$IpAddress;

    .line 78
    .line 79
    invoke-virtual {p0}, Lokhttp3/internal/dns/LookupDnsCall;->getRequest()Lokhttp3/Dns$Request;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    invoke-virtual {v7}, Lokhttp3/Dns$Request;->hostname()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    invoke-direct {v6, v7, v4}, Lokhttp3/Dns$Record$IpAddress;-><init>(Ljava/lang/String;Ljava/net/InetAddress;)V

    .line 88
    .line 89
    .line 90
    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_1
    invoke-interface {v2, p0, v5, v3}, Lokhttp3/Dns$Callback;->onRecords(Lokhttp3/Dns$Call;ZLjava/util/List;)V
    :try_end_0
    .catch Ljava/net/UnknownHostException; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    .line 96
    .line 97
    goto :goto_3

    .line 98
    :goto_2
    iget-object v2, p0, Lokhttp3/internal/dns/LookupDnsCall;->state:Ljava/util/concurrent/atomic/AtomicReference;

    .line 99
    .line 100
    sget-object v3, Lokhttp3/internal/dns/LookupDnsCall$State$Complete;->INSTANCE:Lokhttp3/internal/dns/LookupDnsCall$State$Complete;

    .line 101
    .line 102
    new-instance v4, Lokhttp3/internal/dns/a;

    .line 103
    .line 104
    const/4 v5, 0x2

    .line 105
    invoke-direct {v4, v5}, Lokhttp3/internal/dns/a;-><init>(B)V

    .line 106
    .line 107
    .line 108
    invoke-static {v2, v3, v4}, Lokhttp3/internal/_UtilJvmKt;->testAndSet(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Lgn2;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    check-cast v2, Lokhttp3/internal/dns/LookupDnsCall$State;

    .line 113
    .line 114
    instance-of v3, v2, Lokhttp3/internal/dns/LookupDnsCall$State$Running;

    .line 115
    .line 116
    if-eqz v3, :cond_2

    .line 117
    .line 118
    move-object v0, v2

    .line 119
    check-cast v0, Lokhttp3/internal/dns/LookupDnsCall$State$Running;

    .line 120
    .line 121
    :cond_2
    if-eqz v0, :cond_3

    .line 122
    .line 123
    invoke-virtual {v0}, Lokhttp3/internal/dns/LookupDnsCall$State$Running;->getCallback()Lokhttp3/Dns$Callback;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    if-eqz v0, :cond_3

    .line 128
    .line 129
    invoke-interface {v0, p0, v1}, Lokhttp3/Dns$Callback;->onFailure(Lokhttp3/Dns$Call;Ljava/io/IOException;)V

    .line 130
    .line 131
    .line 132
    :cond_3
    :goto_3
    const-wide/16 v0, -0x1

    .line 133
    .line 134
    return-wide v0
.end method
