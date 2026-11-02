.class public final Lokhttp3/internal/dns/StateMachineDnsCall;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lokhttp3/Dns$Call;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/dns/StateMachineDnsCall$State;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001/B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015JB\u0010\u0014\u001a\u00020\u00132\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u000e\u0008\u0002\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00162\n\u0008\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u0008H\u0082\u0010\u00a2\u0006\u0004\u0008\u0014\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\u0008!\u0010\"J\u000f\u0010#\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010%R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010&\u001a\u0004\u0008\'\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010)R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010*R\u0014\u0010\n\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010*R\u001a\u0010-\u001a\u0008\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.\u00a8\u00060"
    }
    d2 = {
        "Lokhttp3/internal/dns/StateMachineDnsCall;",
        "Lokhttp3/Dns$Call;",
        "Lokhttp3/internal/concurrent/TaskRunner;",
        "taskRunner",
        "Lokhttp3/Dns$Request;",
        "request",
        "Lokhttp3/internal/dns/DnsQuery$Factory;",
        "queryFactory",
        "",
        "includeIPv6",
        "includeServiceMetadata",
        "<init>",
        "(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Dns$Request;Lokhttp3/internal/dns/DnsQuery$Factory;ZZ)V",
        "Lokhttp3/internal/dns/Question;",
        "question",
        "Lokhttp3/internal/dns/DnsQuery;",
        "completedQuery",
        "Lokhttp3/internal/dns/DnsMessage;",
        "dnsResponse",
        "Ldn8;",
        "updateStateAndCallCallbacks",
        "(Lokhttp3/internal/dns/Question;Lokhttp3/internal/dns/DnsQuery;Lokhttp3/internal/dns/DnsMessage;)V",
        "",
        "Lokhttp3/Dns$Record;",
        "newRecords",
        "Ljava/io/IOException;",
        "newException",
        "lockHeldByThisThread",
        "(Lokhttp3/internal/dns/DnsQuery;Ljava/util/List;Ljava/io/IOException;Z)V",
        "isCanceled",
        "()Z",
        "Lokhttp3/Dns$Callback;",
        "callback",
        "enqueue",
        "(Lokhttp3/Dns$Callback;)V",
        "cancel",
        "()V",
        "Lokhttp3/internal/concurrent/TaskRunner;",
        "Lokhttp3/Dns$Request;",
        "getRequest",
        "()Lokhttp3/Dns$Request;",
        "Lokhttp3/internal/dns/DnsQuery$Factory;",
        "Z",
        "Ljava/util/concurrent/atomic/AtomicReference;",
        "Lokhttp3/internal/dns/StateMachineDnsCall$State;",
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
.field private final includeIPv6:Z

.field private final includeServiceMetadata:Z

.field private final queryFactory:Lokhttp3/internal/dns/DnsQuery$Factory;

.field private final request:Lokhttp3/Dns$Request;

.field private final state:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lokhttp3/internal/dns/StateMachineDnsCall$State;",
            ">;"
        }
    .end annotation
.end field

.field private final taskRunner:Lokhttp3/internal/concurrent/TaskRunner;


# direct methods
.method public constructor <init>(Lokhttp3/internal/concurrent/TaskRunner;Lokhttp3/Dns$Request;Lokhttp3/internal/dns/DnsQuery$Factory;ZZ)V
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
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lokhttp3/internal/dns/StateMachineDnsCall;->taskRunner:Lokhttp3/internal/concurrent/TaskRunner;

    .line 14
    .line 15
    iput-object p2, p0, Lokhttp3/internal/dns/StateMachineDnsCall;->request:Lokhttp3/Dns$Request;

    .line 16
    .line 17
    iput-object p3, p0, Lokhttp3/internal/dns/StateMachineDnsCall;->queryFactory:Lokhttp3/internal/dns/DnsQuery$Factory;

    .line 18
    .line 19
    iput-boolean p4, p0, Lokhttp3/internal/dns/StateMachineDnsCall;->includeIPv6:Z

    .line 20
    .line 21
    iput-boolean p5, p0, Lokhttp3/internal/dns/StateMachineDnsCall;->includeServiceMetadata:Z

    .line 22
    .line 23
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 24
    .line 25
    new-instance p2, Lokhttp3/internal/dns/StateMachineDnsCall$State$Idle;

    .line 26
    .line 27
    const/4 p3, 0x1

    .line 28
    const/4 p4, 0x0

    .line 29
    const/4 p5, 0x0

    .line 30
    invoke-direct {p2, p5, p3, p4}, Lokhttp3/internal/dns/StateMachineDnsCall$State$Idle;-><init>(ZILge1;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, Lokhttp3/internal/dns/StateMachineDnsCall;->state:Ljava/util/concurrent/atomic/AtomicReference;

    .line 37
    .line 38
    return-void
.end method

.method public static synthetic a(Lokhttp3/Dns$Callback;Lokhttp3/internal/dns/StateMachineDnsCall;)Ldn8;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lokhttp3/internal/dns/StateMachineDnsCall;->enqueue$lambda$1(Lokhttp3/Dns$Callback;Lokhttp3/internal/dns/StateMachineDnsCall;)Ldn8;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$updateStateAndCallCallbacks(Lokhttp3/internal/dns/StateMachineDnsCall;Lokhttp3/internal/dns/Question;Lokhttp3/internal/dns/DnsQuery;Lokhttp3/internal/dns/DnsMessage;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lokhttp3/internal/dns/StateMachineDnsCall;->updateStateAndCallCallbacks(Lokhttp3/internal/dns/Question;Lokhttp3/internal/dns/DnsQuery;Lokhttp3/internal/dns/DnsMessage;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final enqueue$lambda$1(Lokhttp3/Dns$Callback;Lokhttp3/internal/dns/StateMachineDnsCall;)Ldn8;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/IOException;

    .line 2
    .line 3
    const-string v1, "canceled"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, p1, v0}, Lokhttp3/Dns$Callback;->onFailure(Lokhttp3/Dns$Call;Ljava/io/IOException;)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    return-object p0
.end method

.method private final updateStateAndCallCallbacks(Lokhttp3/internal/dns/DnsQuery;Ljava/util/List;Ljava/io/IOException;Z)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/internal/dns/DnsQuery;",
            "Ljava/util/List<",
            "+",
            "Lokhttp3/Dns$Record;",
            ">;",
            "Ljava/io/IOException;",
            "Z)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    .line 338
    :goto_0
    iget-object v5, v0, Lokhttp3/internal/dns/StateMachineDnsCall;->state:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;

    const/4 v7, 0x0

    if-eqz v6, :cond_0

    check-cast v5, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;

    goto :goto_1

    :cond_0
    move-object v5, v7

    :goto_1
    if-nez v5, :cond_1

    goto/16 :goto_9

    :cond_1
    if-eqz v1, :cond_2

    .line 339
    invoke-virtual {v5}, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->getRunningQueries()Ljava/util/List;

    move-result-object v6

    invoke-static {v6, v1}, Lwv0;->D0(Ljava/util/List;Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v6

    :goto_2
    move-object v12, v6

    goto :goto_3

    .line 340
    :cond_2
    invoke-virtual {v5}, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->getRunningQueries()Ljava/util/List;

    move-result-object v6

    goto :goto_2

    :goto_3
    if-eqz v3, :cond_3

    .line 341
    invoke-virtual {v5}, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->getPendingExceptions()Ljava/util/List;

    move-result-object v6

    invoke-static {v6, v3}, Lwv0;->I0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v6

    :goto_4
    move-object v14, v6

    goto :goto_5

    .line 342
    :cond_3
    invoke-virtual {v5}, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->getPendingExceptions()Ljava/util/List;

    move-result-object v6

    goto :goto_4

    .line 343
    :goto_5
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_4

    invoke-virtual {v5}, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->getPendingRecords()Ljava/util/List;

    move-result-object v6

    invoke-static {v6, v2}, Lwv0;->H0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v6

    :goto_6
    move-object v13, v6

    goto :goto_7

    .line 344
    :cond_4
    invoke-virtual {v5}, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->getPendingRecords()Ljava/util/List;

    move-result-object v6

    goto :goto_6

    .line 345
    :goto_7
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    move-result v6

    const/4 v15, 0x0

    const/16 v16, 0x1

    if-nez v4, :cond_5

    .line 346
    invoke-virtual {v5}, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->getLockHeld()Z

    move-result v8

    if-eqz v8, :cond_5

    move/from16 v11, v16

    goto :goto_8

    :cond_5
    move v11, v15

    :goto_8
    if-nez v6, :cond_6

    .line 347
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_7

    :cond_6
    if-eqz v11, :cond_a

    .line 348
    :cond_7
    invoke-virtual {v5}, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->getCanceled()Z

    move-result v9

    .line 349
    invoke-virtual {v5}, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->getCallback()Lokhttp3/Dns$Callback;

    move-result-object v10

    .line 350
    new-instance v8, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;

    invoke-direct/range {v8 .. v14}, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;-><init>(ZLokhttp3/Dns$Callback;ZLjava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 351
    iget-object v9, v0, Lokhttp3/internal/dns/StateMachineDnsCall;->state:Ljava/util/concurrent/atomic/AtomicReference;

    .line 352
    :cond_8
    invoke-virtual {v9, v5, v8}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_9

    :goto_9
    return-void

    :cond_9
    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v6

    if-eq v6, v5, :cond_8

    goto/16 :goto_0

    .line 353
    :cond_a
    sget-object v8, Ld02;->X:Ld02;

    if-eqz v6, :cond_b

    .line 354
    new-instance v9, Lokhttp3/internal/dns/StateMachineDnsCall$State$Complete;

    invoke-virtual {v5}, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->getCanceled()Z

    move-result v10

    invoke-direct {v9, v10}, Lokhttp3/internal/dns/StateMachineDnsCall$State$Complete;-><init>(Z)V

    move-object/from16 p1, v13

    move-object v13, v8

    goto :goto_a

    .line 355
    :cond_b
    invoke-virtual {v5}, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->getCanceled()Z

    move-result v9

    .line 356
    invoke-virtual {v5}, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->getCallback()Lokhttp3/Dns$Callback;

    move-result-object v10

    move-object v11, v13

    move-object v13, v8

    .line 357
    new-instance v8, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;

    move-object/from16 v17, v11

    const/4 v11, 0x1

    move-object/from16 p1, v17

    invoke-direct/range {v8 .. v14}, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;-><init>(ZLokhttp3/Dns$Callback;ZLjava/util/List;Ljava/util/List;Ljava/util/List;)V

    move-object v9, v8

    .line 358
    :goto_a
    iget-object v8, v0, Lokhttp3/internal/dns/StateMachineDnsCall;->state:Ljava/util/concurrent/atomic/AtomicReference;

    .line 359
    :goto_b
    invoke-virtual {v8, v5, v9}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_10

    if-eqz v6, :cond_c

    .line 360
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_c

    move/from16 v15, v16

    .line 361
    :cond_c
    invoke-interface/range {p1 .. p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_d

    if-eqz v15, :cond_e

    .line 362
    :cond_d
    invoke-virtual {v5}, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->getCallback()Lokhttp3/Dns$Callback;

    move-result-object v1

    move-object/from16 v11, p1

    invoke-interface {v1, v0, v15, v11}, Lokhttp3/Dns$Callback;->onRecords(Lokhttp3/Dns$Call;ZLjava/util/List;)V

    :cond_e
    if-eqz v6, :cond_f

    .line 363
    invoke-interface {v14}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_f

    .line 364
    invoke-virtual {v5}, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->getCallback()Lokhttp3/Dns$Callback;

    move-result-object v1

    invoke-static {v1, v0, v14}, Lokhttp3/internal/dns/_StateMachineDnsCallKt;->onFailure(Lokhttp3/Dns$Callback;Lokhttp3/Dns$Call;Ljava/util/List;)V

    :cond_f
    move-object v1, v7

    move-object v3, v1

    move-object v2, v13

    move/from16 v4, v16

    goto/16 :goto_0

    :cond_10
    move-object/from16 v11, p1

    .line 365
    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v10

    if-eq v10, v5, :cond_11

    goto/16 :goto_0

    :cond_11
    move-object/from16 p1, v11

    goto :goto_b
.end method

.method private final updateStateAndCallCallbacks(Lokhttp3/internal/dns/Question;Lokhttp3/internal/dns/DnsQuery;Lokhttp3/internal/dns/DnsMessage;)V
    .locals 18

    .line 1
    :try_start_0
    invoke-virtual/range {p3 .. p3}, Lokhttp3/internal/dns/DnsMessage;->getResponseCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    new-instance v0, Ljava/net/UnknownHostException;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/net/UnknownHostException;-><init>()V

    .line 13
    .line 14
    .line 15
    throw v0

    .line 16
    :catch_0
    move-exception v0

    .line 17
    move-object v14, v0

    .line 18
    goto/16 :goto_9

    .line 19
    .line 20
    :cond_0
    new-instance v0, Ljava/net/UnknownHostException;

    .line 21
    .line 22
    const-string v1, "DNS server failure"

    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/net/UnknownHostException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw v0

    .line 28
    :cond_1
    invoke-virtual/range {p3 .. p3}, Lokhttp3/internal/dns/DnsMessage;->getAnswers()Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    invoke-virtual/range {p1 .. p1}, Lokhttp3/internal/dns/Question;->getType()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    const/4 v2, 0x1

    .line 37
    const/16 v3, 0xa

    .line 38
    .line 39
    if-eq v1, v2, :cond_c

    .line 40
    .line 41
    const/16 v2, 0x1c

    .line 42
    .line 43
    if-eq v1, v2, :cond_c

    .line 44
    .line 45
    const/16 v2, 0x41

    .line 46
    .line 47
    if-ne v1, v2, :cond_b

    .line 48
    .line 49
    new-instance v1, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_3

    .line 63
    .line 64
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    instance-of v4, v2, Lokhttp3/internal/dns/ResourceRecord$Https;

    .line 69
    .line 70
    if-eqz v4, :cond_2

    .line 71
    .line 72
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    invoke-static {v1}, Lwv0;->a1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v0}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    .line 81
    .line 82
    .line 83
    new-instance v1, Lokhttp3/internal/dns/StateMachineDnsCall$updateStateAndCallCallbacks$$inlined$sortedBy$1;

    .line 84
    .line 85
    invoke-direct {v1}, Lokhttp3/internal/dns/StateMachineDnsCall$updateStateAndCallCallbacks$$inlined$sortedBy$1;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-static {v0, v1}, Lwv0;->S0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    new-instance v1, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-static {v0, v3}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 99
    .line 100
    .line 101
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-eqz v2, :cond_a

    .line 110
    .line 111
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    check-cast v2, Lokhttp3/internal/dns/ResourceRecord$Https;

    .line 116
    .line 117
    invoke-virtual {v2}, Lokhttp3/internal/dns/ResourceRecord$Https;->getPriority()I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-nez v3, :cond_4

    .line 122
    .line 123
    const/16 v9, 0xe

    .line 124
    .line 125
    const/4 v10, 0x0

    .line 126
    const/4 v6, 0x0

    .line 127
    const/4 v7, 0x0

    .line 128
    const/4 v8, 0x0

    .line 129
    move-object/from16 v4, p0

    .line 130
    .line 131
    move-object/from16 v5, p2

    .line 132
    .line 133
    invoke-static/range {v4 .. v10}, Lokhttp3/internal/dns/StateMachineDnsCall;->updateStateAndCallCallbacks$default(Lokhttp3/internal/dns/StateMachineDnsCall;Lokhttp3/internal/dns/DnsQuery;Ljava/util/List;Ljava/io/IOException;ZILjava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :cond_4
    invoke-virtual {v2}, Lokhttp3/internal/dns/ResourceRecord$Https;->getTargetName()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    const-string v4, ""

    .line 142
    .line 143
    invoke-static {v3, v4}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    const/4 v5, 0x0

    .line 148
    if-nez v4, :cond_5

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_5
    move-object v3, v5

    .line 152
    :goto_2
    if-nez v3, :cond_6

    .line 153
    .line 154
    invoke-virtual/range {p0 .. p0}, Lokhttp3/internal/dns/StateMachineDnsCall;->getRequest()Lokhttp3/Dns$Request;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    invoke-virtual {v3}, Lokhttp3/Dns$Request;->hostname()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    :cond_6
    move-object v7, v3

    .line 163
    invoke-virtual {v2}, Lokhttp3/internal/dns/ResourceRecord$Https;->getAlpnIds()Ljava/util/List;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    if-eqz v3, :cond_9

    .line 168
    .line 169
    new-instance v4, Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 172
    .line 173
    .line 174
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 175
    .line 176
    .line 177
    move-result-object v3

    .line 178
    :cond_7
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 179
    .line 180
    .line 181
    move-result v6

    .line 182
    if-eqz v6, :cond_8

    .line 183
    .line 184
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    check-cast v6, Ljava/lang/String;

    .line 189
    .line 190
    :try_start_1
    sget-object v8, Lokhttp3/Protocol;->Companion:Lokhttp3/Protocol$Companion;

    .line 191
    .line 192
    invoke-virtual {v8, v6}, Lokhttp3/Protocol$Companion;->get(Ljava/lang/String;)Lokhttp3/Protocol;

    .line 193
    .line 194
    .line 195
    move-result-object v6
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 196
    goto :goto_4

    .line 197
    :catch_1
    move-object v6, v5

    .line 198
    :goto_4
    if-eqz v6, :cond_7

    .line 199
    .line 200
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_8
    move-object v8, v4

    .line 205
    goto :goto_5

    .line 206
    :cond_9
    move-object v8, v5

    .line 207
    :goto_5
    invoke-virtual {v2}, Lokhttp3/internal/dns/ResourceRecord$Https;->getPort()I

    .line 208
    .line 209
    .line 210
    move-result v9

    .line 211
    invoke-virtual {v2}, Lokhttp3/internal/dns/ResourceRecord$Https;->getIpAddressHints()Ljava/util/List;

    .line 212
    .line 213
    .line 214
    move-result-object v10

    .line 215
    invoke-virtual {v2}, Lokhttp3/internal/dns/ResourceRecord$Https;->getEchConfigList()Lkb0;

    .line 216
    .line 217
    .line 218
    move-result-object v11

    .line 219
    new-instance v6, Lokhttp3/Dns$Record$ServiceMetadata;

    .line 220
    .line 221
    invoke-direct/range {v6 .. v11}, Lokhttp3/Dns$Record$ServiceMetadata;-><init>(Ljava/lang/String;Ljava/util/List;ILjava/util/List;Lkb0;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    goto :goto_1

    .line 228
    :cond_a
    move-object v13, v1

    .line 229
    goto :goto_8

    .line 230
    :cond_b
    const-string v0, "unexpected question type"

    .line 231
    .line 232
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    return-void

    .line 236
    :cond_c
    new-instance v1, Ljava/util/ArrayList;

    .line 237
    .line 238
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 239
    .line 240
    .line 241
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    :cond_d
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    if-eqz v2, :cond_e

    .line 250
    .line 251
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    instance-of v4, v2, Lokhttp3/internal/dns/ResourceRecord$IpAddress;

    .line 256
    .line 257
    if-eqz v4, :cond_d

    .line 258
    .line 259
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    goto :goto_6

    .line 263
    :cond_e
    new-instance v0, Ljava/util/ArrayList;

    .line 264
    .line 265
    invoke-static {v1, v3}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 277
    .line 278
    .line 279
    move-result v2

    .line 280
    if-eqz v2, :cond_f

    .line 281
    .line 282
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    check-cast v2, Lokhttp3/internal/dns/ResourceRecord$IpAddress;

    .line 287
    .line 288
    new-instance v3, Lokhttp3/Dns$Record$IpAddress;

    .line 289
    .line 290
    invoke-virtual/range {p0 .. p0}, Lokhttp3/internal/dns/StateMachineDnsCall;->getRequest()Lokhttp3/Dns$Request;

    .line 291
    .line 292
    .line 293
    move-result-object v4

    .line 294
    invoke-virtual {v4}, Lokhttp3/Dns$Request;->hostname()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v4

    .line 298
    invoke-virtual {v2}, Lokhttp3/internal/dns/ResourceRecord$IpAddress;->getAddress()Ljava/net/InetAddress;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    invoke-direct {v3, v4, v2}, Lokhttp3/Dns$Record$IpAddress;-><init>(Ljava/lang/String;Ljava/net/InetAddress;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    goto :goto_7

    .line 309
    :cond_f
    move-object v13, v0

    .line 310
    :goto_8
    const/16 v16, 0xc

    .line 311
    .line 312
    const/16 v17, 0x0

    .line 313
    .line 314
    const/4 v14, 0x0

    .line 315
    const/4 v15, 0x0

    .line 316
    move-object/from16 v11, p0

    .line 317
    .line 318
    move-object/from16 v12, p2

    .line 319
    .line 320
    invoke-static/range {v11 .. v17}, Lokhttp3/internal/dns/StateMachineDnsCall;->updateStateAndCallCallbacks$default(Lokhttp3/internal/dns/StateMachineDnsCall;Lokhttp3/internal/dns/DnsQuery;Ljava/util/List;Ljava/io/IOException;ZILjava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    return-void

    .line 324
    :goto_9
    const/16 v16, 0xa

    .line 325
    .line 326
    const/16 v17, 0x0

    .line 327
    .line 328
    const/4 v13, 0x0

    .line 329
    const/4 v15, 0x0

    .line 330
    move-object/from16 v11, p0

    .line 331
    .line 332
    move-object/from16 v12, p2

    .line 333
    .line 334
    invoke-static/range {v11 .. v17}, Lokhttp3/internal/dns/StateMachineDnsCall;->updateStateAndCallCallbacks$default(Lokhttp3/internal/dns/StateMachineDnsCall;Lokhttp3/internal/dns/DnsQuery;Ljava/util/List;Ljava/io/IOException;ZILjava/lang/Object;)V

    .line 335
    .line 336
    .line 337
    return-void
.end method

.method public static synthetic updateStateAndCallCallbacks$default(Lokhttp3/internal/dns/StateMachineDnsCall;Lokhttp3/internal/dns/DnsQuery;Ljava/util/List;Ljava/io/IOException;ZILjava/lang/Object;)V
    .locals 1

    .line 1
    and-int/lit8 p6, p5, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p6, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p6, p5, 0x2

    .line 8
    .line 9
    if-eqz p6, :cond_1

    .line 10
    .line 11
    sget-object p2, Ld02;->X:Ld02;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p6, p5, 0x4

    .line 14
    .line 15
    if-eqz p6, :cond_2

    .line 16
    .line 17
    move-object p3, v0

    .line 18
    :cond_2
    and-int/lit8 p5, p5, 0x8

    .line 19
    .line 20
    if-eqz p5, :cond_3

    .line 21
    .line 22
    const/4 p4, 0x0

    .line 23
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lokhttp3/internal/dns/StateMachineDnsCall;->updateStateAndCallCallbacks(Lokhttp3/internal/dns/DnsQuery;Ljava/util/List;Ljava/io/IOException;Z)V

    .line 24
    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 4

    .line 1
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/dns/StateMachineDnsCall;->state:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lokhttp3/internal/dns/StateMachineDnsCall$State;

    .line 8
    .line 9
    invoke-interface {v0}, Lokhttp3/internal/dns/StateMachineDnsCall$State;->cancel()Lokhttp3/internal/dns/StateMachineDnsCall$State;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lokhttp3/internal/dns/StateMachineDnsCall;->state:Ljava/util/concurrent/atomic/AtomicReference;

    .line 14
    .line 15
    :cond_0
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_2

    .line 20
    .line 21
    instance-of p0, v0, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;

    .line 22
    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    check-cast v0, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;

    .line 26
    .line 27
    invoke-virtual {v0}, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;->getRunningQueries()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Lokhttp3/internal/dns/DnsQuery;

    .line 46
    .line 47
    invoke-interface {v0}, Lokhttp3/internal/dns/DnsQuery;->cancel()V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    return-void

    .line 52
    :cond_2
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    if-eq v3, v0, :cond_0

    .line 57
    .line 58
    goto :goto_0
.end method

.method public enqueue(Lokhttp3/Dns$Callback;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {}, Li21;->r()Lgb4;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-boolean v2, v0, Lokhttp3/internal/dns/StateMachineDnsCall;->includeServiceMetadata:Z

    .line 11
    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    new-instance v3, Lokhttp3/internal/dns/Question;

    .line 15
    .line 16
    invoke-virtual {v0}, Lokhttp3/internal/dns/StateMachineDnsCall;->getRequest()Lokhttp3/Dns$Request;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Lokhttp3/Dns$Request;->port()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/16 v4, 0x1bb

    .line 25
    .line 26
    if-ne v2, v4, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Lokhttp3/internal/dns/StateMachineDnsCall;->getRequest()Lokhttp3/Dns$Request;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2}, Lokhttp3/Dns$Request;->hostname()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    :goto_0
    move-object v4, v2

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v4, "_"

    .line 41
    .line 42
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lokhttp3/internal/dns/StateMachineDnsCall;->getRequest()Lokhttp3/Dns$Request;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {v4}, Lokhttp3/Dns$Request;->port()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v4, "._https."

    .line 57
    .line 58
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Lokhttp3/internal/dns/StateMachineDnsCall;->getRequest()Lokhttp3/Dns$Request;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    invoke-virtual {v4}, Lokhttp3/Dns$Request;->hostname()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    goto :goto_0

    .line 77
    :goto_1
    const/4 v7, 0x4

    .line 78
    const/4 v8, 0x0

    .line 79
    const/16 v5, 0x41

    .line 80
    .line 81
    const/4 v6, 0x0

    .line 82
    invoke-direct/range {v3 .. v8}, Lokhttp3/internal/dns/Question;-><init>(Ljava/lang/String;IIILge1;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v3}, Lgb4;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    :cond_1
    iget-boolean v2, v0, Lokhttp3/internal/dns/StateMachineDnsCall;->includeIPv6:Z

    .line 89
    .line 90
    if-eqz v2, :cond_2

    .line 91
    .line 92
    new-instance v3, Lokhttp3/internal/dns/Question;

    .line 93
    .line 94
    invoke-virtual {v0}, Lokhttp3/internal/dns/StateMachineDnsCall;->getRequest()Lokhttp3/Dns$Request;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v2}, Lokhttp3/Dns$Request;->hostname()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    const/4 v7, 0x4

    .line 103
    const/4 v8, 0x0

    .line 104
    const/16 v5, 0x1c

    .line 105
    .line 106
    const/4 v6, 0x0

    .line 107
    invoke-direct/range {v3 .. v8}, Lokhttp3/internal/dns/Question;-><init>(Ljava/lang/String;IIILge1;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1, v3}, Lgb4;->add(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    :cond_2
    new-instance v4, Lokhttp3/internal/dns/Question;

    .line 114
    .line 115
    invoke-virtual {v0}, Lokhttp3/internal/dns/StateMachineDnsCall;->getRequest()Lokhttp3/Dns$Request;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-virtual {v2}, Lokhttp3/Dns$Request;->hostname()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    const/4 v8, 0x4

    .line 124
    const/4 v9, 0x0

    .line 125
    const/4 v6, 0x1

    .line 126
    const/4 v7, 0x0

    .line 127
    invoke-direct/range {v4 .. v9}, Lokhttp3/internal/dns/Question;-><init>(Ljava/lang/String;IIILge1;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1, v4}, Lgb4;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    invoke-static {v1}, Li21;->j(Lgb4;)Lgb4;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    :goto_2
    iget-object v2, v0, Lokhttp3/internal/dns/StateMachineDnsCall;->state:Ljava/util/concurrent/atomic/AtomicReference;

    .line 138
    .line 139
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    instance-of v3, v2, Lokhttp3/internal/dns/StateMachineDnsCall$State$Idle;

    .line 144
    .line 145
    if-eqz v3, :cond_3

    .line 146
    .line 147
    check-cast v2, Lokhttp3/internal/dns/StateMachineDnsCall$State$Idle;

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_3
    const/4 v2, 0x0

    .line 151
    :goto_3
    if-eqz v2, :cond_c

    .line 152
    .line 153
    invoke-virtual {v2}, Lokhttp3/internal/dns/StateMachineDnsCall$State$Idle;->getCanceled()Z

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    if-eqz v3, :cond_6

    .line 158
    .line 159
    new-instance v3, Lokhttp3/internal/dns/StateMachineDnsCall$State$Complete;

    .line 160
    .line 161
    const/4 v4, 0x1

    .line 162
    invoke-direct {v3, v4}, Lokhttp3/internal/dns/StateMachineDnsCall$State$Complete;-><init>(Z)V

    .line 163
    .line 164
    .line 165
    iget-object v4, v0, Lokhttp3/internal/dns/StateMachineDnsCall;->state:Ljava/util/concurrent/atomic/AtomicReference;

    .line 166
    .line 167
    :cond_4
    invoke-virtual {v4, v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    move-result v5

    .line 171
    if-eqz v5, :cond_5

    .line 172
    .line 173
    iget-object v1, v0, Lokhttp3/internal/dns/StateMachineDnsCall;->taskRunner:Lokhttp3/internal/concurrent/TaskRunner;

    .line 174
    .line 175
    invoke-virtual {v1}, Lokhttp3/internal/concurrent/TaskRunner;->newQueue()Lokhttp3/internal/concurrent/TaskQueue;

    .line 176
    .line 177
    .line 178
    move-result-object v2

    .line 179
    new-instance v1, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0}, Lokhttp3/internal/dns/StateMachineDnsCall;->getRequest()Lokhttp3/Dns$Request;

    .line 185
    .line 186
    .line 187
    move-result-object v3

    .line 188
    invoke-virtual {v3}, Lokhttp3/Dns$Request;->hostname()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v3

    .line 192
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    const-string v3, " dns"

    .line 196
    .line 197
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    new-instance v7, La23;

    .line 205
    .line 206
    const/16 v1, 0x15

    .line 207
    .line 208
    move-object/from16 v10, p1

    .line 209
    .line 210
    invoke-direct {v7, v10, v0, v1}, La23;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 211
    .line 212
    .line 213
    const/4 v8, 0x6

    .line 214
    const/4 v9, 0x0

    .line 215
    const-wide/16 v4, 0x0

    .line 216
    .line 217
    const/4 v6, 0x0

    .line 218
    invoke-static/range {v2 .. v9}, Lokhttp3/internal/concurrent/TaskQueue;->execute$default(Lokhttp3/internal/concurrent/TaskQueue;Ljava/lang/String;JZLdn2;ILjava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    return-void

    .line 222
    :cond_5
    move-object/from16 v10, p1

    .line 223
    .line 224
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    if-eq v5, v2, :cond_4

    .line 229
    .line 230
    goto :goto_2

    .line 231
    :cond_6
    move-object/from16 v10, p1

    .line 232
    .line 233
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 234
    .line 235
    const/16 v4, 0xa

    .line 236
    .line 237
    invoke-static {v1, v4}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    invoke-static {v4}, Laq4;->G(I)I

    .line 242
    .line 243
    .line 244
    move-result v4

    .line 245
    const/16 v5, 0x10

    .line 246
    .line 247
    if-ge v4, v5, :cond_7

    .line 248
    .line 249
    move v4, v5

    .line 250
    :cond_7
    invoke-direct {v3, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 251
    .line 252
    .line 253
    const/4 v4, 0x0

    .line 254
    invoke-virtual {v1, v4}, Lgb4;->listIterator(I)Ljava/util/ListIterator;

    .line 255
    .line 256
    .line 257
    move-result-object v4

    .line 258
    :goto_4
    move-object v5, v4

    .line 259
    check-cast v5, Lo03;

    .line 260
    .line 261
    invoke-virtual {v5}, Lo03;->hasNext()Z

    .line 262
    .line 263
    .line 264
    move-result v6

    .line 265
    if-eqz v6, :cond_8

    .line 266
    .line 267
    invoke-virtual {v5}, Lo03;->next()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v5

    .line 271
    move-object v6, v5

    .line 272
    check-cast v6, Lokhttp3/internal/dns/Question;

    .line 273
    .line 274
    iget-object v7, v0, Lokhttp3/internal/dns/StateMachineDnsCall;->queryFactory:Lokhttp3/internal/dns/DnsQuery$Factory;

    .line 275
    .line 276
    invoke-interface {v7, v6}, Lokhttp3/internal/dns/DnsQuery$Factory;->newQuery(Lokhttp3/internal/dns/Question;)Lokhttp3/internal/dns/DnsQuery;

    .line 277
    .line 278
    .line 279
    move-result-object v6

    .line 280
    invoke-interface {v3, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    goto :goto_4

    .line 284
    :cond_8
    new-instance v8, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;

    .line 285
    .line 286
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 287
    .line 288
    .line 289
    move-result-object v4

    .line 290
    check-cast v4, Ljava/lang/Iterable;

    .line 291
    .line 292
    invoke-static {v4}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 293
    .line 294
    .line 295
    move-result-object v12

    .line 296
    const/16 v15, 0x34

    .line 297
    .line 298
    const/16 v16, 0x0

    .line 299
    .line 300
    const/4 v9, 0x0

    .line 301
    const/4 v11, 0x0

    .line 302
    const/4 v13, 0x0

    .line 303
    const/4 v14, 0x0

    .line 304
    invoke-direct/range {v8 .. v16}, Lokhttp3/internal/dns/StateMachineDnsCall$State$Running;-><init>(ZLokhttp3/Dns$Callback;ZLjava/util/List;Ljava/util/List;Ljava/util/List;ILge1;)V

    .line 305
    .line 306
    .line 307
    iget-object v4, v0, Lokhttp3/internal/dns/StateMachineDnsCall;->state:Ljava/util/concurrent/atomic/AtomicReference;

    .line 308
    .line 309
    :cond_9
    invoke-virtual {v4, v2, v8}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v5

    .line 313
    if-eqz v5, :cond_b

    .line 314
    .line 315
    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 316
    .line 317
    .line 318
    move-result-object v1

    .line 319
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 324
    .line 325
    .line 326
    move-result v2

    .line 327
    if-eqz v2, :cond_a

    .line 328
    .line 329
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v2

    .line 333
    check-cast v2, Ljava/util/Map$Entry;

    .line 334
    .line 335
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v3

    .line 339
    check-cast v3, Lokhttp3/internal/dns/Question;

    .line 340
    .line 341
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    check-cast v2, Lokhttp3/internal/dns/DnsQuery;

    .line 346
    .line 347
    new-instance v4, Lokhttp3/internal/dns/StateMachineDnsCall$enqueue$2;

    .line 348
    .line 349
    invoke-direct {v4, v0, v3, v2}, Lokhttp3/internal/dns/StateMachineDnsCall$enqueue$2;-><init>(Lokhttp3/internal/dns/StateMachineDnsCall;Lokhttp3/internal/dns/Question;Lokhttp3/internal/dns/DnsQuery;)V

    .line 350
    .line 351
    .line 352
    invoke-interface {v2, v4}, Lokhttp3/internal/dns/DnsQuery;->enqueue(Lokhttp3/internal/dns/DnsQuery$Callback;)V

    .line 353
    .line 354
    .line 355
    goto :goto_5

    .line 356
    :cond_a
    return-void

    .line 357
    :cond_b
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v5

    .line 361
    if-eq v5, v2, :cond_9

    .line 362
    .line 363
    goto/16 :goto_2

    .line 364
    .line 365
    :cond_c
    const-string v0, "already enqueued"

    .line 366
    .line 367
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    return-void
.end method

.method public getRequest()Lokhttp3/Dns$Request;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/StateMachineDnsCall;->request:Lokhttp3/Dns$Request;

    .line 2
    .line 3
    return-object p0
.end method

.method public isCanceled()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/dns/StateMachineDnsCall;->state:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lokhttp3/internal/dns/StateMachineDnsCall$State;

    .line 8
    .line 9
    invoke-interface {p0}, Lokhttp3/internal/dns/StateMachineDnsCall$State;->getCanceled()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method
