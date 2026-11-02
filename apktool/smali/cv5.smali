.class public Lcv5;
.super Ldb7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final f0:La05;

.field public volatile g0:Lp98;

.field public volatile h0:Lp98;


# direct methods
.method public constructor <init>(Lo02;ILjava/lang/String;)V
    .locals 0

    .line 1
    sget-object p2, Lnx0;->a:Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 4
    .line 5
    .line 6
    move-result-wide p2

    .line 7
    invoke-direct {p0, p1, p2, p3}, Ldb7;-><init>(Lo02;J)V

    .line 8
    .line 9
    .line 10
    sget p1, Lfi4;->a:I

    .line 11
    .line 12
    new-instance p1, La05;

    .line 13
    .line 14
    const/4 p2, 0x6

    .line 15
    invoke-direct {p1, p2}, La05;-><init>(I)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lcv5;->f0:La05;

    .line 19
    .line 20
    new-instance p0, Ls05;

    .line 21
    .line 22
    invoke-direct {p0}, Ls05;-><init>()V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public k(JLjava/lang/String;J)Lp98;
    .locals 10

    .line 1
    iget-object v1, p0, Lcv5;->f0:La05;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    iget-object v0, p0, Lcv5;->f0:La05;

    .line 5
    .line 6
    invoke-virtual {v0, p1, p2}, La05;->d(J)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    new-instance v3, Lp98;

    .line 13
    .line 14
    move-object v9, p0

    .line 15
    move-wide v4, p1

    .line 16
    move-object v8, p3

    .line 17
    move-wide v6, p4

    .line 18
    invoke-direct/range {v3 .. v9}, Lp98;-><init>(JJLjava/lang/String;Lcv5;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v4, v5, v3}, La05;->g(JLjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    move-object v2, v3

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    move-object p0, v0

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    :goto_0
    check-cast v2, Lp98;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    monitor-exit v1

    .line 32
    return-object v2

    .line 33
    :goto_1
    monitor-exit v1

    .line 34
    throw p0
.end method
